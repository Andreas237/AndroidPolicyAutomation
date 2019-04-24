.class public Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;
    }
.end annotation


# instance fields
.field public ChkQrCodeRsp_:Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getChkQrCodeRsp_()Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;->ChkQrCodeRsp_:Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CheckQrCodeResponse, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setChkQrCodeRsp_(Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;->ChkQrCodeRsp_:Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;

    .line 23
    return-void
.end method
