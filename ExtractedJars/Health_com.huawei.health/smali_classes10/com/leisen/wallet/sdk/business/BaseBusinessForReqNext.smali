.class public Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;
.super Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;
.source "SourceFile"


# instance fields
.field private rapduList:Lcom/leisen/wallet/sdk/business/ApduResBean;

.field private result:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;-><init>()V

    return-void
.end method


# virtual methods
.method public getRapduList()Lcom/leisen/wallet/sdk/business/ApduResBean;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->rapduList:Lcom/leisen/wallet/sdk/business/ApduResBean;

    return-object v0
.end method

.method public getResult()I
    .locals 1

    .line 9
    iget v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->result:I

    return v0
.end method

.method public setRapduList(Lcom/leisen/wallet/sdk/business/ApduResBean;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->rapduList:Lcom/leisen/wallet/sdk/business/ApduResBean;

    .line 22
    return-void
.end method

.method public setResult(I)V
    .locals 0

    .line 13
    iput p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->result:I

    .line 14
    return-void
.end method
