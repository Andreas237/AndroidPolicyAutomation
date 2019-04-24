.class public abstract Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
.super Ljava/lang/Object;
.source "PartnerAppTrackingData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract appId(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "appId"
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
.end method

.method public abstract installed(Z)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "installed"
    .end annotation
.end method

.method public abstract name(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation
.end method
