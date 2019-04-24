.class public Lcom/huawei/hwcloudmodel/model/userprofile/GetAuthorizeReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private thirdAccountType:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getThirdAccountType()Ljava/lang/Integer;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetAuthorizeReq;->thirdAccountType:Ljava/lang/Integer;

    return-object v0
.end method

.method public setThirdAccountType(Ljava/lang/Integer;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetAuthorizeReq;->thirdAccountType:Ljava/lang/Integer;

    .line 21
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetAuthorizeReq{thirdAccountType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetAuthorizeReq;->thirdAccountType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
