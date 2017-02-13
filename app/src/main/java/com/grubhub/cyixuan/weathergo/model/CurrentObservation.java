package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/8/17.
 * this is the current_observation model, a field inside the condition model
 */

public class CurrentObservation {
    private Image image;
    private DisplayLocation displayLocation;
    private ObservationLocation observationLocation;
    private Estimated estimated;
    private String stationId;
    private String observationTime;
    private String obserbationTimeRfc822;
    private String observationEpoch;
    private String localTimeRfc822;
    private String localEpoch;
    private String localTzShort;
    private String localTzLong;
    private String localTzOffset;
    private String weather;
    private String temperatureString;
    private String tempF;
    private String tempC;
    private String relativeHumidity;
    private String windString;
    private String windDir;
    private String windDegrees;
    private String windMph;
    private String windGustMph;
    private String windKph;
    private String windGustKph;
    private String pressureMb;
    private String pressureIn;
    private String pressureTrend;
    private String dewpointString;
    private String dewpointF;
    private String dewpointC;
    private String heatIndexString;
    private String heatIndexF;
    private String heatIndexC;
    private String windchillString;
    private String windchillF;
    private String windchillC;
    private String feelslikeString;
    private String feelslikeF;
    private String feelslikeC;
    private String visibilityMi;
    private String visibilityKm;
    private String solarradiation;
    private String UV;
    private String precip1hrString;
    private String precip1hrIn;
    private String precip1hrMetric;
    private String precipTodayString;
    private String precipTodayIn;
    private String precipTodayMetric;
    private String icon;
    private String iconUrl;
    private String forecastUrl;
    private String historyUrl;
    private String obUrl;

    public CurrentObservation() {
    }

    public CurrentObservation(Image image, DisplayLocation displayLocation, ObservationLocation observationLocation, Estimated estimated, String stationId, String observationTime, String obserbationTimeRfc822, String observationEpoch, String localTimeRfc822, String localEpoch, String localTzShort, String localTzLong, String localTzOffset, String weather, String temperatureString, String tempF, String tempC, String relativeHumidity, String windString, String windDir, String windDegrees, String windMph, String windGustMph, String windKph, String windGustKph, String pressureMb, String pressureIn, String pressureTrend, String dewpointString, String dewpointF, String dewpointC, String heatIndexString, String heatIndexF, String heatIndexC, String windchillString, String windchillF, String windchillC, String feelslikeString, String feelslikeF, String feelslikeC, String visibilityMi, String visibilityKm, String solarradiation, String UV, String precip1hrString, String precip1hrIn, String precip1hrMetric, String precipTodayString, String precipTodayIn, String precipTodayMetric, String icon, String iconUrl, String forecastUrl, String historyUrl, String obUrl) {
        this.image = image;
        this.displayLocation = displayLocation;
        this.observationLocation = observationLocation;
        this.estimated = estimated;
        this.stationId = stationId;
        this.observationTime = observationTime;
        this.obserbationTimeRfc822 = obserbationTimeRfc822;
        this.observationEpoch = observationEpoch;
        this.localTimeRfc822 = localTimeRfc822;
        this.localEpoch = localEpoch;
        this.localTzShort = localTzShort;
        this.localTzLong = localTzLong;
        this.localTzOffset = localTzOffset;
        this.weather = weather;
        this.temperatureString = temperatureString;
        this.tempF = tempF;
        this.tempC = tempC;
        this.relativeHumidity = relativeHumidity;
        this.windString = windString;
        this.windDir = windDir;
        this.windDegrees = windDegrees;
        this.windMph = windMph;
        this.windGustMph = windGustMph;
        this.windKph = windKph;
        this.windGustKph = windGustKph;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.pressureTrend = pressureTrend;
        this.dewpointString = dewpointString;
        this.dewpointF = dewpointF;
        this.dewpointC = dewpointC;
        this.heatIndexString = heatIndexString;
        this.heatIndexF = heatIndexF;
        this.heatIndexC = heatIndexC;
        this.windchillString = windchillString;
        this.windchillF = windchillF;
        this.windchillC = windchillC;
        this.feelslikeString = feelslikeString;
        this.feelslikeF = feelslikeF;
        this.feelslikeC = feelslikeC;
        this.visibilityMi = visibilityMi;
        this.visibilityKm = visibilityKm;
        this.solarradiation = solarradiation;
        this.UV = UV;
        this.precip1hrString = precip1hrString;
        this.precip1hrIn = precip1hrIn;
        this.precip1hrMetric = precip1hrMetric;
        this.precipTodayString = precipTodayString;
        this.precipTodayIn = precipTodayIn;
        this.precipTodayMetric = precipTodayMetric;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.forecastUrl = forecastUrl;
        this.historyUrl = historyUrl;
        this.obUrl = obUrl;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
    }

    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    public Estimated getEstimated() {
        return estimated;
    }

    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObserbationTimeRfc822() {
        return obserbationTimeRfc822;
    }

    public void setObserbationTimeRfc822(String obserbationTimeRfc822) {
        this.obserbationTimeRfc822 = obserbationTimeRfc822;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public String getTempF() {
        return tempF;
    }

    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(String windDegrees) {
        this.windDegrees = windDegrees;
    }

    public String getWindMph() {
        return windMph;
    }

    public void setWindMph(String windMph) {
        this.windMph = windMph;
    }

    public String getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(String windGustMph) {
        this.windGustMph = windGustMph;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    public String getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(String dewpointF) {
        this.dewpointF = dewpointF;
    }

    public String getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(String dewpointC) {
        this.dewpointC = dewpointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    public String getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public String getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public String getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public String getUV() {
        return UV;
    }

    public void setUV(String UV) {
        this.UV = UV;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }

    public String getWindKph() {
        return windKph;
    }

    public void setWindKph(String windKph) {
        this.windKph = windKph;
    }

    public String getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(String windGustKph) {
        this.windGustKph = windGustKph;
    }

    public String getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
    }
}
