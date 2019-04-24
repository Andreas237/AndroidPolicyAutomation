.class public Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;
.super Ljava/lang/Object;
.source "BgcTransactionSpentPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private spent:Z

.field private updatedBalance:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->spent:Z

    return-void
.end method


# virtual methods
.method public getUpdatedBalance()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->updatedBalance:Ljava/lang/Double;

    return-object v0
.end method

.method public isSpent()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->spent:Z

    return v0
.end method

.method public setSpent(Z)V
    .locals 0

    .line 75
    iput-boolean p1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->spent:Z

    return-void
.end method

.method public setUpdatedBalance(Ljava/lang/Double;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->updatedBalance:Ljava/lang/Double;

    return-void
.end method
