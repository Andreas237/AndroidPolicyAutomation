.class public abstract Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
.super Ljava/lang/Object;
.source "TrackingClientsConfig.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
.end method

.method public abstract ibottaTrackingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_tracking_enabled"
    .end annotation
.end method

.method public abstract ibottaTrackingFakeEvents(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_tracking_fake_events"
    .end annotation
.end method

.method public abstract ibottaV1MappingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_mapping_enabled"
    .end annotation
.end method

.method public abstract ibottaV1TrackingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_tracking_enabled"
    .end annotation
.end method

.method public abstract ibottaV1TrackingFakeEvents(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_tracking_fake_events"
    .end annotation
.end method
