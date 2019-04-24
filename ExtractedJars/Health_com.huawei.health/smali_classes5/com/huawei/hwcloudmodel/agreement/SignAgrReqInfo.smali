.class public Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private agrType:I

.field private country:Ljava/lang/String;

.field private isAgree:Z

.field private language:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->country:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->language:Ljava/lang/String;

    .line 29
    iput-boolean p3, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->isAgree:Z

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->country:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->language:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public getAgrType()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->agrType:I

    return v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->country:Ljava/lang/String;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->language:Ljava/lang/String;

    return-object v0
.end method

.method public isAgree()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->isAgree:Z

    return v0
.end method

.method public setAgrType(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->agrType:I

    .line 64
    return-void
.end method

.method public setAgree(Z)V
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->isAgree:Z

    .line 40
    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->country:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->language:Ljava/lang/String;

    .line 56
    return-void
.end method
