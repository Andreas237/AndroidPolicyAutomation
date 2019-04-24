.class public abstract Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
.super Ljava/lang/Object;
.source "BrazeBonusTrackingData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    invoke-static {}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->builder()Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->build()Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 3

    .line 25
    new-instance v0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->id(I)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->amount(F)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->featured(Z)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getAmount()F
.end method

.method public abstract getDescription()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDetails()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getExpiration()Ljava/util/Date;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getId()I
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOtherReward()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRoute()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTokenUrl()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract isFeatured()Z
.end method
