.class public Lcom/shopkick/sdk/sensor/WiFiScanReading;
.super Lcom/shopkick/sdk/sensor/ReadingBase;
.source "WiFiScanReading.java"


# instance fields
.field private final wifiScanResult:Lcom/shopkick/sdk/sensor/WiFiScanResult;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/WiFiScanReading;Lcom/shopkick/sdk/sensor/WiFiScanResult;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/ReadingBase;-><init>(Lcom/shopkick/sdk/sensor/ReadingBase;)V

    if-eqz p2, :cond_0

    .line 16
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/WiFiScanReading;->wifiScanResult:Lcom/shopkick/sdk/sensor/WiFiScanResult;

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'scanResult\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getConfidence()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public bridge synthetic getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 9
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ReadingBase;->getPreviousReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTimestamp()J
    .locals 2

    .line 9
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ReadingBase;->getTimestamp()J

    move-result-wide v0

    return-wide v0
.end method

.method public getWifiScanResult()Lcom/shopkick/sdk/sensor/WiFiScanResult;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiScanReading;->wifiScanResult:Lcom/shopkick/sdk/sensor/WiFiScanResult;

    return-object v0
.end method
