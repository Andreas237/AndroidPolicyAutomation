.class public Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private agrType:I

.field private country:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAgrType()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->agrType:I

    return v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->country:Ljava/lang/String;

    return-object v0
.end method

.method public setAgrType(I)V
    .locals 0

    .line 18
    iput p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->agrType:I

    .line 19
    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->country:Ljava/lang/String;

    .line 27
    return-void
.end method
