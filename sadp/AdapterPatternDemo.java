
interface HeartModel {
 int getHeartRate();
}

class Heart implements HeartModel {
 private int heartRate;

 public Heart() {
     this.heartRate = 0;
 }

 public int getHeartRate() {
     return heartRate;
 }

 public void generateHeartRate() {
     heartRate = (int) (Math.random() * 100 + 60);
     System.out.println("Heart rate: " + heartRate + " bpm");
 }
}

interface BeatModel {
 void setBPM(int bpm);
 int getBPM();
}

class Beat implements BeatModel {
 private int bpm;

 public void setBPM(int bpm) {
     this.bpm = bpm;
     System.out.println("BPM set to " + bpm);
 }

 public int getBPM() {
     return bpm;
 }
}

class HeartAdapter implements BeatModel {
 private HeartModel heartModel;

 public HeartAdapter(HeartModel heartModel) {
     this.heartModel = heartModel;
 }

 public void setBPM(int bpm) {
     System.out.println("Cannot set BPM on Heart Model");
 }

 public int getBPM() {
     int heartRate = heartModel.getHeartRate();
     return heartRate;
 }
}

public class AdapterPatternDemo {
 public static void main(String[] args) {
     Heart heart = new Heart();
     Beat beat = new Beat();
     HeartAdapter adapter = new HeartAdapter(heart);

     int bpm = adapter.getBPM();
     System.out.println("Initial BPM: " + bpm);

     heart.generateHeartRate();
     bpm = adapter.getBPM();
     beat.setBPM(bpm);
 }
}
