.class public Lo/avv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/avv$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Ljava/lang/String;[J)I
    .locals 12

    .line 102
    const/4 v3, 0x0

    .line 103
    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 105
    :cond_0
    return v3

    .line 108
    :cond_1
    new-instance v4, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;-><init>()V

    .line 109
    iput-object p0, v4, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;->qrCode_:Ljava/lang/String;

    .line 110
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 111
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 114
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_3

    instance-of v0, v5, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;

    if-eqz v0, :cond_3

    .line 116
    move-object v6, v5

    check-cast v6, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;

    .line 117
    iget-object v7, v6, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;->ChkQrCodeRsp_:Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;

    .line 118
    const-wide/16 v8, 0x0

    .line 119
    const-wide/16 v10, 0x0

    .line 120
    if-eqz v7, :cond_2

    .line 122
    iget-wide v8, v7, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;->userID_:J

    .line 123
    iget-wide v10, v7, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;->grpID_:J

    .line 125
    :cond_2
    const/4 v0, 0x0

    aput-wide v8, p1, v0

    .line 126
    const/4 v0, 0x1

    aput-wide v10, p1, v0

    .line 127
    goto :goto_0

    .line 130
    :cond_3
    iget v3, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    .line 131
    const-string v0, "QRCodeTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "synRequestQRCode error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_4
    iget v3, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 137
    const-string v0, "QRCodeTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "synRequestQRCode error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    :goto_0
    return v3
.end method

.method static synthetic c(Ljava/lang/String;[J)I
    .locals 1

    .line 24
    invoke-static {p0, p1}, Lo/avv;->b(Ljava/lang/String;[J)I

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/String;Lo/avv$e;)V
    .locals 1

    .line 53
    new-instance v0, Lo/avv$5;

    invoke-direct {v0, p0, p1}, Lo/avv$5;-><init>(Ljava/lang/String;Lo/avv$e;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 91
    return-void
.end method
