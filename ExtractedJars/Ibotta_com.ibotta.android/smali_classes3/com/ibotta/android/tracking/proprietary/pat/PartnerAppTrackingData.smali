.class public abstract Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
.super Ljava/lang/Object;
.source "PartnerAppTrackingData.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .locals 1

    .line 19
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;-><init>()V

    return-object v0
.end method

.method public static create(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
    .locals 1

    .line 15
    invoke-static {}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->builder()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;->name(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;->appId(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;->installed(Z)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;->build()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getAppId()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "appId"
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation
.end method

.method public abstract isInstalled()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "installed"
    .end annotation
.end method
