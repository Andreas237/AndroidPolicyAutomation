.class public final Lio/streamroot/dna/core/context/config/PanamaConfigurationKt;
.super Ljava/lang/Object;
.source "PanamaConfiguration.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "buildPanamaConfiguration",
        "Lorg/json/JSONObject;",
        "peerAgentConfiguration",
        "sessionInformation",
        "Lio/streamroot/dna/core/context/config/SessionInformation;",
        "customerProperties",
        "Lio/streamroot/dna/core/context/loader/CustomerProperties;",
        "infrastructure",
        "Lio/streamroot/dna/core/context/config/Infrastructure;",
        "androidContextRef",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/content/Context;",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final buildPanamaConfiguration(Lorg/json/JSONObject;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/config/Infrastructure;Ljava/lang/ref/WeakReference;)Lorg/json/JSONObject;
    .locals 3
    .param p0    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/loader/CustomerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/context/config/Infrastructure;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/ref/WeakReference;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Lio/streamroot/dna/core/context/config/SessionInformation;",
            "Lio/streamroot/dna/core/context/loader/CustomerProperties;",
            "Lio/streamroot/dna/core/context/config/Infrastructure;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "peerAgentConfiguration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionInformation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerProperties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infrastructure"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidContextRef"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Context;

    if-eqz p4, :cond_0

    const-string v0, "connectivity"

    invoke-virtual {p4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    if-nez p4, :cond_1

    new-instance p0, Lkotlin/TypeCastException;

    const-string p1, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-direct {p0, p1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    check-cast p4, Landroid/net/ConnectivityManager;

    invoke-static {p4}, Lio/streamroot/dna/core/utils/ConnectivityManagerExtensionKt;->currentNetworkType(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;

    move-result-object p4

    .line 20
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "trackerUrl"

    .line 21
    invoke-virtual {p3}, Lio/streamroot/dna/core/context/config/Infrastructure;->getTrackerUrl()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "signalingUrl"

    .line 22
    invoke-virtual {p3}, Lio/streamroot/dna/core/context/config/Infrastructure;->getSignalingUrl()Lokhttp3/HttpUrl;

    move-result-object p3

    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "name"

    .line 25
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "requested"

    .line 26
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getProperty()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "detectRangeRequest"

    .line 27
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getDetectRangeRequest()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mobileBrowserEnabled"

    .line 28
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getMobileBrowserEnabled()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ssaiEnabled"

    .line 29
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getSsaiEnabled()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "superSeederRatio"

    .line 30
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getSuperSeederRatio()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "cellularOtherUpload"

    .line 31
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getCellularOtherUpload()Z

    move-result v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "cellularOtherDownload"

    .line 32
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getCellularOtherDownload()Z

    move-result v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "wifiEthernetUpload"

    .line 33
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getWifiEthernetUpload()Z

    move-result v2

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "wifiEthernetDownload"

    .line 34
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getWifiEthernetDownload()Z

    move-result p2

    invoke-virtual {p3, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 36
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "streamrootKey"

    .line 37
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "contentId"

    .line 38
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Media;->getContentId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "streamType"

    .line 39
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Media;->getFormat()Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/StreamFormat;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "manifestUrl"

    .line 40
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object p1

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/Media;->getOriginalUrl()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "platform"

    const-string v1, "android"

    .line 41
    invoke-virtual {p2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "platformVersion"

    const-string v1, "3.5.3"

    .line 42
    invoke-virtual {p2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "peerAgentCounter"

    const/4 v1, 0x1

    .line 43
    invoke-virtual {p2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p1, "propertyParameters"

    .line 45
    invoke-virtual {p2, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "backendUrls"

    .line 46
    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "paConfig"

    .line 47
    invoke-virtual {p2, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "networkType"

    .line 48
    invoke-virtual {p2, p0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object p2
.end method
