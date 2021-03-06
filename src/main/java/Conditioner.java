public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // increaseCurrentTemperature - увеличивает температуру на 1 до тех пор,
    // пока не достигнута максимальная (maxTemperature),
    // последующие (после достижения maxTemperature) вызовы метода не должны ничего менять в состоянии объекта
    public void increaseCurrentTemperature(int currentTemperature){
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature+1;
    }

    // decreaseCurrentTemperature - уменьшает температуру на 1 до тех пор,
    // пока не достигнута минимальная (minTemperature),
    // последующие (после достижения minTemperature) вызовы метода не должны ничего менять в состоянии объекта
    public void decreaseCurrentTemperature(int currentTemperature){
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature-1;
    }


}




