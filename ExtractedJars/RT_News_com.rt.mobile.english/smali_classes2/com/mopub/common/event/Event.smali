.class public Lcom/mopub/common/event/Event;
.super Lcom/mopub/common/event/BaseEvent;
.source "Event.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/event/Event$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/mopub/common/event/Event$Builder;)V
    .locals 0
    .param p1    # Lcom/mopub/common/event/Event$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 14
    invoke-direct {p0, p1}, Lcom/mopub/common/event/BaseEvent;-><init>(Lcom/mopub/common/event/BaseEvent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/event/Event$Builder;Lcom/mopub/common/event/Event$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/mopub/common/event/Event;-><init>(Lcom/mopub/common/event/Event$Builder;)V

    return-void
.end method

.method public static createEventFromDetails(Lcom/mopub/common/event/BaseEvent$Name;Lcom/mopub/common/event/BaseEvent$Category;Lcom/mopub/common/event/BaseEvent$SamplingRate;Lcom/mopub/common/event/EventDetails;)Lcom/mopub/common/event/BaseEvent;
    .locals 3
    .param p0    # Lcom/mopub/common/event/BaseEvent$Name;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/mopub/common/event/BaseEvent$Category;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/common/event/BaseEvent$SamplingRate;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/common/event/EventDetails;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 47
    invoke-static {p0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    if-nez p3, :cond_0

    const-string p0, "Unable to log event due to no details present"

    .line 52
    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 56
    :cond_0
    new-instance v0, Lcom/mopub/common/event/Event$Builder;

    invoke-virtual {p2}, Lcom/mopub/common/event/BaseEvent$SamplingRate;->getSamplingRate()D

    move-result-wide v1

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/mopub/common/event/Event$Builder;-><init>(Lcom/mopub/common/event/BaseEvent$Name;Lcom/mopub/common/event/BaseEvent$Category;D)V

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getAdUnitId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/mopub/common/event/Event$Builder;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getDspCreativeId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withAdCreativeId(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getAdType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withAdType(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getAdNetworkType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withAdNetworkType(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getAdWidthPx()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withAdWidthPx(Ljava/lang/Double;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getAdHeightPx()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withAdHeightPx(Ljava/lang/Double;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getGeoLatitude()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withGeoLat(Ljava/lang/Double;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getGeoLongitude()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withGeoLon(Ljava/lang/Double;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getGeoAccuracy()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withGeoAccuracy(Ljava/lang/Double;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getPerformanceDurationMs()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withPerformanceDurationMs(Ljava/lang/Double;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getRequestId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withRequestId(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getRequestStatusCode()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withRequestStatusCode(Ljava/lang/Integer;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p3}, Lcom/mopub/common/event/EventDetails;->getRequestUri()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/common/event/BaseEvent$Builder;->withRequestUri(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent$Builder;->build()Lcom/mopub/common/event/BaseEvent;

    move-result-object p0

    return-object p0
.end method
