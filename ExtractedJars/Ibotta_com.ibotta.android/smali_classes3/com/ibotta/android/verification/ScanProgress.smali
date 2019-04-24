.class public Lcom/ibotta/android/verification/ScanProgress;
.super Ljava/lang/Object;
.source "ScanProgress.java"


# instance fields
.field private countRequired:S

.field private countScanned:S


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCountRequired()S
    .locals 1

    .line 15
    iget-short v0, p0, Lcom/ibotta/android/verification/ScanProgress;->countRequired:S

    return v0
.end method

.method public getCountScanned()S
    .locals 1

    .line 23
    iget-short v0, p0, Lcom/ibotta/android/verification/ScanProgress;->countScanned:S

    return v0
.end method

.method public setCountRequired(S)V
    .locals 0

    .line 19
    iput-short p1, p0, Lcom/ibotta/android/verification/ScanProgress;->countRequired:S

    return-void
.end method

.method public setCountScanned(S)V
    .locals 0

    .line 27
    iput-short p1, p0, Lcom/ibotta/android/verification/ScanProgress;->countScanned:S

    return-void
.end method
