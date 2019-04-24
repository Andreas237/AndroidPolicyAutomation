.class public Lcom/ibotta/android/api/windfall/WindfallResultsResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "WindfallResultsResponse.java"


# instance fields
.field private windfallResultsJson:Ljava/lang/String;

.field private windfallResultsSignature:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 34
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 35
    instance-of v0, p1, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    if-eqz v0, :cond_1

    .line 36
    check-cast p1, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    iget-object v0, p0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->windfallResultsJson:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->setWindfallResultsJson(Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->windfallResultsSignature:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->setWindfallResultsSignature(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public getWindfallResultsJson()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->windfallResultsJson:Ljava/lang/String;

    return-object v0
.end method

.method public getWindfallResultsSignature()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->windfallResultsSignature:Ljava/lang/String;

    return-object v0
.end method

.method public setWindfallResultsJson(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->windfallResultsJson:Ljava/lang/String;

    return-void
.end method

.method public setWindfallResultsSignature(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->windfallResultsSignature:Ljava/lang/String;

    return-void
.end method
