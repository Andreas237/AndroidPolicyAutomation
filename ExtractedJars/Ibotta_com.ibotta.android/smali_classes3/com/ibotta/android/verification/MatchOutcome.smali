.class public Lcom/ibotta/android/verification/MatchOutcome;
.super Ljava/lang/Object;
.source "MatchOutcome.java"


# instance fields
.field private alreadyTracked:Z

.field private barcode:Ljava/lang/String;

.field private match:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBarcode()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/verification/MatchOutcome;->barcode:Ljava/lang/String;

    return-object v0
.end method

.method public isAlreadyTracked()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/ibotta/android/verification/MatchOutcome;->alreadyTracked:Z

    return v0
.end method

.method public isMatch()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/ibotta/android/verification/MatchOutcome;->match:Z

    return v0
.end method

.method public setAlreadyTracked(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/verification/MatchOutcome;->alreadyTracked:Z

    return-void
.end method

.method public setBarcode(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/verification/MatchOutcome;->barcode:Ljava/lang/String;

    return-void
.end method

.method public setMatch(Z)V
    .locals 0

    .line 21
    iput-boolean p1, p0, Lcom/ibotta/android/verification/MatchOutcome;->match:Z

    return-void
.end method
