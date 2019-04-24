.class public Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
.super Ljava/lang/Object;
.source "SynthesizedCategoryConfig.java"


# instance fields
.field private limit:S

.field private minimum:S

.field private threshold:S


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    .line 8
    iput-short v0, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->threshold:S

    .line 9
    iput-short v0, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->limit:S

    const/4 v0, 0x4

    .line 10
    iput-short v0, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->minimum:S

    return-void
.end method


# virtual methods
.method public getLimit()S
    .locals 1

    .line 21
    iget-short v0, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->limit:S

    return v0
.end method

.method public getMinimum()S
    .locals 1

    .line 29
    iget-short v0, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->minimum:S

    return v0
.end method

.method public getThreshold()S
    .locals 1

    .line 13
    iget-short v0, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->threshold:S

    return v0
.end method

.method public setLimit(S)V
    .locals 0

    .line 25
    iput-short p1, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->limit:S

    return-void
.end method

.method public setMinimum(S)V
    .locals 0

    .line 33
    iput-short p1, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->minimum:S

    return-void
.end method

.method public setThreshold(S)V
    .locals 0

    .line 17
    iput-short p1, p0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;->threshold:S

    return-void
.end method
