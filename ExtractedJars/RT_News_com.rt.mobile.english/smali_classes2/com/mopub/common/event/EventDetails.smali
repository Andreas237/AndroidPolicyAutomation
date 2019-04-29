.class public Lcom/mopub/common/event/EventDetails;
.super Ljava/lang/Object;
.source "EventDetails.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/event/EventDetails$Builder;
    }
.end annotation


# static fields
.field private static final AD_HEIGHT_PX_KEY:Ljava/lang/String; = "ad_height_px_key"

.field private static final AD_NETWORK_TYPE_KEY:Ljava/lang/String; = "ad_network_type"

.field private static final AD_TYPE_KEY:Ljava/lang/String; = "ad_type"

.field private static final AD_UNIT_ID_KEY:Ljava/lang/String; = "ad_unit_id"

.field private static final AD_WIDTH_PX_KEY:Ljava/lang/String; = "ad_width_px"

.field private static final DSP_CREATIVE_ID_KEY:Ljava/lang/String; = "dsp_creative_id"

.field private static final GEO_ACCURACY_KEY:Ljava/lang/String; = "geo_accuracy_key"

.field private static final GEO_LATITUDE_KEY:Ljava/lang/String; = "geo_latitude"

.field private static final GEO_LONGITUDE_KEY:Ljava/lang/String; = "geo_longitude"

.field private static final PERFORMANCE_DURATION_MS_KEY:Ljava/lang/String; = "performance_duration_ms"

.field private static final REQUEST_ID_KEY:Ljava/lang/String; = "request_id_key"

.field private static final REQUEST_STATUS_CODE_KEY:Ljava/lang/String; = "request_status_code"

.field private static final REQUEST_URI_KEY:Ljava/lang/String; = "request_uri_key"


# instance fields
.field private final mEventDetailsMap:Ljava/util/Map;
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
.method private constructor <init>(Ljava/util/Map;)V
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 151
    iput-object p1, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Map;Lcom/mopub/common/event/EventDetails$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/mopub/common/event/EventDetails;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method private static getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;
    .locals 2
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Double;"
        }
    .end annotation

    .line 232
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    .line 237
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p1
.end method

.method private static getNullableIntegerValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 246
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    .line 251
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p1
.end method


# virtual methods
.method public getAdHeightPx()Ljava/lang/Double;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_height_px_key"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getAdNetworkType()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_network_type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAdType()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_unit_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAdWidthPx()Ljava/lang/Double;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 176
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "ad_width_px"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getDspCreativeId()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "dsp_creative_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getGeoAccuracy()Ljava/lang/Double;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 197
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "geo_accuracy_key"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getGeoLatitude()Ljava/lang/Double;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "geo_latitude"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getGeoLongitude()Ljava/lang/Double;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "geo_longitude"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getPerformanceDurationMs()Ljava/lang/Double;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "performance_duration_ms"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableDoubleValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 207
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "request_id_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRequestStatusCode()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "request_status_code"

    invoke-static {v0, v1}, Lcom/mopub/common/event/EventDetails;->getNullableIntegerValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getRequestUri()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    const-string v1, "request_uri_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public toJsonString()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/mopub/common/event/EventDetails;->mEventDetailsMap:Ljava/util/Map;

    invoke-static {v0}, Lcom/mopub/common/util/Json;->mapToJsonString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 226
    invoke-virtual {p0}, Lcom/mopub/common/event/EventDetails;->toJsonString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
