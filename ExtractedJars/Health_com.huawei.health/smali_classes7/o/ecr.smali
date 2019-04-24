.class public Lo/ecr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isNeedServiceTokenAuth:Z

.field protected merchantID:Ljava/lang/String;

.field protected rsaKeyIndex:I

.field protected srcTransactionID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ecr;->isNeedServiceTokenAuth:Z

    return-void
.end method


# virtual methods
.method public baseLibCardServerBaseRequestSAI1()V
    .locals 0

    .line 70
    return-void
.end method

.method public baseLibCardServerBaseRequestSAI2()V
    .locals 0

    .line 71
    return-void
.end method

.method public baseLibCardServerBaseRequestSAI3()V
    .locals 0

    .line 72
    return-void
.end method

.method public baseLibCardServerBaseRequestSAI4()V
    .locals 0

    .line 73
    return-void
.end method

.method public baseLibCardServerBaseRequestSAI5()V
    .locals 0

    .line 74
    return-void
.end method

.method public getIsNeedServiceTokenAuth()Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lo/ecr;->isNeedServiceTokenAuth:Z

    return v0
.end method

.method public getMerchantID()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/ecr;->merchantID:Ljava/lang/String;

    return-object v0
.end method

.method public getRsaKeyIndex()I
    .locals 1

    .line 52
    iget v0, p0, Lo/ecr;->rsaKeyIndex:I

    return v0
.end method

.method public getSrcTransactionID()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/ecr;->srcTransactionID:Ljava/lang/String;

    return-object v0
.end method

.method public setIsNeedServiceTokenAuth(Z)V
    .locals 0

    .line 89
    iput-boolean p1, p0, Lo/ecr;->isNeedServiceTokenAuth:Z

    .line 90
    return-void
.end method

.method public setMerchantID(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/ecr;->merchantID:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setRsaKeyIndex(I)V
    .locals 0

    .line 57
    iput p1, p0, Lo/ecr;->rsaKeyIndex:I

    .line 58
    return-void
.end method

.method public setSrcTransactionID(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lo/ecr;->srcTransactionID:Ljava/lang/String;

    .line 68
    return-void
.end method
