.class public abstract Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
.super Ljava/lang/Object;
.source "TrackingClientsConfig.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    invoke-static {}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->builder()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;->build()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .locals 3

    .line 21
    new-instance v0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;-><init>()V

    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;

    move-result-object v0

    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;->ibottaTrackingFakeEvents(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;

    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;->ibottaV1MappingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;

    move-result-object v0

    .line 25
    invoke-virtual {v0, v2}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;->ibottaV1TrackingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;

    move-result-object v0

    .line 26
    invoke-virtual {v0, v2}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;->ibottaV1TrackingFakeEvents(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract isIbottaTrackingEnabled()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_tracking_enabled"
    .end annotation
.end method

.method public abstract isIbottaTrackingFakeEvents()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_tracking_fake_events"
    .end annotation
.end method

.method public abstract isIbottaV1MappingEnabled()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_mapping_enabled"
    .end annotation
.end method

.method public abstract isIbottaV1TrackingEnabled()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_tracking_enabled"
    .end annotation
.end method

.method public abstract isIbottaV1TrackingFakeEvents()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_tracking_fake_events"
    .end annotation
.end method
