.class public Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;
.super Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;
.source "SourceFile"


# instance fields
.field private appAid:Ljava/lang/String;


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

    .line 7
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;->appAid:Ljava/lang/String;

    return-object v0
.end method

.method public setAppAid(Ljava/lang/String;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;->appAid:Ljava/lang/String;

    .line 12
    return-void
.end method
