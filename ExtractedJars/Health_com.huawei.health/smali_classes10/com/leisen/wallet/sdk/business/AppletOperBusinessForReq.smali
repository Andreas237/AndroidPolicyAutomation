.class public Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;
.super Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;
.source "SourceFile"


# instance fields
.field private appAid:Ljava/lang/String;

.field private appletVersion:Ljava/lang/String;

.field private operType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppAid()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->appAid:Ljava/lang/String;

    return-object v0
.end method

.method public getAppletVersion()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->appletVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getOperType()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->operType:I

    return v0
.end method

.method public setAppAid(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->appAid:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public setAppletVersion(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->appletVersion:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public setOperType(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->operType:I

    .line 30
    return-void
.end method
