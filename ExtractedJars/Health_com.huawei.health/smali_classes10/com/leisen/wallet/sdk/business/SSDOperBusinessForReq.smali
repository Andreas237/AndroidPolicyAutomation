.class public Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;
.super Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;
.source "SourceFile"


# instance fields
.field private operType:I

.field private ssdAid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;-><init>()V

    return-void
.end method


# virtual methods
.method public getOperType()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->operType:I

    return v0
.end method

.method public getSsdAid()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->ssdAid:Ljava/lang/String;

    return-object v0
.end method

.method public setOperType(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->operType:I

    .line 21
    return-void
.end method

.method public setSsdAid(Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->ssdAid:Ljava/lang/String;

    .line 13
    return-void
.end method
