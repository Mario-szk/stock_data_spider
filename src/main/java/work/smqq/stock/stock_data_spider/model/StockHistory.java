package work.smqq.stock.stock_data_spider.model;

public class StockHistory {
    private Integer id;

    private String stockName;

    private String stockCode;

    private Float priceNow;

    private Float priceFinishYesterday;

    private Float priceMaxToday;

    private Float priceMinToday;

    private Float priceStartToday;

    private Float pe;

    private Float pb;

    private Long volume;

    private Double turnVolume;

    private Float changePercent;

    private Float changeAmount;

    private Float amplitude;

    private Float turnOver;

    private Float qrr;

    private String tradeDate;

    private String boardCode;

    private String boardName;

    private Double marketValue;

    private Double circulationMarketValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Float getPriceNow() {
        return priceNow;
    }

    public void setPriceNow(Float priceNow) {
        this.priceNow = priceNow;
    }

    public Float getPriceFinishYesterday() {
        return priceFinishYesterday;
    }

    public void setPriceFinishYesterday(Float priceFinishYesterday) {
        this.priceFinishYesterday = priceFinishYesterday;
    }

    public Float getPriceMaxToday() {
        return priceMaxToday;
    }

    public void setPriceMaxToday(Float priceMaxToday) {
        this.priceMaxToday = priceMaxToday;
    }

    public Float getPriceMinToday() {
        return priceMinToday;
    }

    public void setPriceMinToday(Float priceMinToday) {
        this.priceMinToday = priceMinToday;
    }

    public Float getPriceStartToday() {
        return priceStartToday;
    }

    public void setPriceStartToday(Float priceStartToday) {
        this.priceStartToday = priceStartToday;
    }

    public Float getPe() {
        return pe;
    }

    public void setPe(Float pe) {
        this.pe = pe;
    }

    public Float getPb() {
        return pb;
    }

    public void setPb(Float pb) {
        this.pb = pb;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getTurnVolume() {
        return turnVolume;
    }

    public void setTurnVolume(Double turnVolume) {
        this.turnVolume = turnVolume;
    }

    public Float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Float changePercent) {
        this.changePercent = changePercent;
    }

    public Float getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Float changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Float getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(Float amplitude) {
        this.amplitude = amplitude;
    }

    public Float getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(Float turnOver) {
        this.turnOver = turnOver;
    }

    public Float getQrr() {
        return qrr;
    }

    public void setQrr(Float qrr) {
        this.qrr = qrr;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    public String getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(String boardCode) {
        this.boardCode = boardCode == null ? null : boardCode.trim();
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    public Double getCirculationMarketValue() {
        return circulationMarketValue;
    }

    public void setCirculationMarketValue(Double circulationMarketValue) {
        this.circulationMarketValue = circulationMarketValue;
    }
}