.class public Lcom/mopub/common/event/EventDetails$Builder;
.super Ljava/lang/Object;
.source "EventDetails.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/EventDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final eventDetailsMap:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public adHeightPx(Ljava/lang/Integer;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 64
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_height_px_key"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public adNetworkType(Ljava/lang/String;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 48
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_network_type"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public adType(Ljava/lang/String;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 40
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_type"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public adUnitId(Ljava/lang/String;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 24
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_unit_id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public adWidthPx(Ljava/lang/Integer;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 56
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_width_px"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public build()Lcom/mopub/common/event/EventDetails;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 128
    new-instance v0, Lcom/mopub/common/event/EventDetails;

    iget-object v1, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/event/EventDetails;-><init>(Ljava/util/Map;Lcom/mopub/common/event/EventDetails$1;)V

    return-object v0
.end method

.method public dspCreativeId(Ljava/lang/String;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 32
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "dsp_creative_id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public geoAccuracy(Ljava/lang/Float;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 4
    .param p1    # Ljava/lang/Float;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 88
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "geo_accuracy_key"

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public geoLatitude(Ljava/lang/Double;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 72
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "geo_latitude"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public geoLongitude(Ljava/lang/Double;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 80
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "geo_longitude"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public performanceDurationMs(Ljava/lang/Long;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 4
    .param p1    # Ljava/lang/Long;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 96
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "performance_duration_ms"

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public requestId(Ljava/lang/String;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 105
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "request_id_key"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public requestStatusCode(Ljava/lang/Integer;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 113
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "request_status_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public requestUri(Ljava/lang/String;)Lcom/mopub/common/event/EventDetails$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 121
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails$Builder;->eventDetailsMap:Ljava/util/Map;

    const-string v1, "request_uri_key"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method
