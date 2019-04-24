.class public abstract Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
.super Ljava/lang/Object;
.source "BrazeSilentPushExtras.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 66
    new-instance v0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method protected abstract build()Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
.end method

.method protected abstract campaignName(Ljava/lang/String;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "CAMPAIGN_NAME"
    .end annotation
.end method

.method protected abstract isServerEventStr(Ljava/lang/String;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IS_SERVER_EVENT"
    .end annotation
.end method
