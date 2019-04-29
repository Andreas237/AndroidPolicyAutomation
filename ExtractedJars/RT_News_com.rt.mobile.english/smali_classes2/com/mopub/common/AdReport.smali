.class public Lcom/mopub/common/AdReport;
.super Ljava/lang/Object;
.source "AdReport.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final DATE_FORMAT_PATTERN:Ljava/lang/String; = "M/d/yy hh:mm:ss a z"

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final mAdResponse:Lcom/mopub/network/AdResponse;

.field private final mAdUnitId:Ljava/lang/String;

.field private final mDeviceLocale:Ljava/util/Locale;

.field private final mDeviceModel:Ljava/lang/String;

.field private final mSdkVersion:Ljava/lang/String;

.field private final mUdid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/mopub/common/ClientMetadata;Lcom/mopub/network/AdResponse;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/common/ClientMetadata;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/network/AdResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/mopub/common/AdReport;->mAdUnitId:Ljava/lang/String;

    .line 29
    invoke-virtual {p2}, Lcom/mopub/common/ClientMetadata;->getSdkVersion()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/AdReport;->mSdkVersion:Ljava/lang/String;

    .line 30
    invoke-virtual {p2}, Lcom/mopub/common/ClientMetadata;->getDeviceModel()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/AdReport;->mDeviceModel:Ljava/lang/String;

    .line 31
    invoke-virtual {p2}, Lcom/mopub/common/ClientMetadata;->getDeviceLocale()Ljava/util/Locale;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/AdReport;->mDeviceLocale:Ljava/util/Locale;

    .line 32
    invoke-virtual {p2}, Lcom/mopub/common/ClientMetadata;->getDeviceId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/AdReport;->mUdid:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    return-void
.end method

.method private appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " : "

    .line 72
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\n"

    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private getFormattedTimeStamp(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 79
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "M/d/yy hh:mm:ss a z"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 80
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public getDspCreativeId()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getDspCreativeId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseString()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getStringBody()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sdk_version"

    .line 39
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mSdkVersion:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "creative_id"

    .line 40
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v2}, Lcom/mopub/network/AdResponse;->getDspCreativeId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "platform_version"

    .line 41
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "device_model"

    .line 42
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mDeviceModel:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ad_unit_id"

    .line 43
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mAdUnitId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "device_locale"

    .line 44
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mDeviceLocale:Ljava/util/Locale;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mDeviceLocale:Ljava/util/Locale;

    invoke-virtual {v2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "device_id"

    .line 46
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mUdid:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "network_type"

    .line 47
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v2}, Lcom/mopub/network/AdResponse;->getNetworkType()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "platform"

    const-string v2, "android"

    .line 48
    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "timestamp"

    .line 49
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v2}, Lcom/mopub/network/AdResponse;->getTimestamp()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/mopub/common/AdReport;->getFormattedTimeStamp(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ad_type"

    .line 50
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v2}, Lcom/mopub/network/AdResponse;->getAdType()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v1, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v1}, Lcom/mopub/network/AdResponse;->getWidth()Ljava/lang/Integer;

    move-result-object v1

    .line 52
    iget-object v2, p0, Lcom/mopub/common/AdReport;->mAdResponse:Lcom/mopub/network/AdResponse;

    invoke-virtual {v2}, Lcom/mopub/network/AdResponse;->getHeight()Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "ad_size"

    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "{"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_1

    const-string v1, "0"

    :cond_1
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v2, :cond_2

    const-string v2, "0"

    :cond_2
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v3, v1}, Lcom/mopub/common/AdReport;->appendKeyValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
