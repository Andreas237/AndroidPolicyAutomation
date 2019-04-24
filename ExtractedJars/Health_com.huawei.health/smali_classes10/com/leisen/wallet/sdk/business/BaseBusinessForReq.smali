.class public Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;
.super Lcom/leisen/wallet/sdk/business/Business;
.source "SourceFile"


# instance fields
.field private taskIndex:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/business/Business;-><init>()V

    return-void
.end method


# virtual methods
.method public getTaskIndex()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;->taskIndex:I

    return v0
.end method

.method public setTaskIndex(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;->taskIndex:I

    .line 16
    return-void
.end method
