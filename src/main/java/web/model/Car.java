package web.model;

public class Car {
    private int id;
    private String modelName;
    private String series;

    public Car(int id, String modelName, String series) {
        this.id = id;
        this.modelName = modelName;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
