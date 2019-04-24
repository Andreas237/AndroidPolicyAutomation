.class public Lcom/leisen/wallet/sdk/bean/OperSSDReqParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ssdAid:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSsdAid()I
    .locals 1

    .line 7
    iget v0, p0, Lcom/leisen/wallet/sdk/bean/OperSSDReqParams;->ssdAid:I

    return v0
.end method

.method public setSsdAid(I)V
    .locals 0

    .line 11
    iput p1, p0, Lcom/leisen/wallet/sdk/bean/OperSSDReqParams;->ssdAid:I

    .line 12
    return-void
.end method
