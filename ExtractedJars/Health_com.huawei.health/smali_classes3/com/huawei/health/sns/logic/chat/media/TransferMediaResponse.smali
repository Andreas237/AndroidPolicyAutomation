.class public Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# instance fields
.field private errcode_:I

.field private errmsg_:Ljava/lang/String;

.field private mid_:Ljava/lang/String;

.field private res_:I

.field private thumbFlag_:Ljava/lang/String;

.field private url_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->errcode_:I

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->errmsg_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getErrcode_()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->errcode_:I

    return v0
.end method

.method public getErrmsg_()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->errmsg_:Ljava/lang/String;

    return-object v0
.end method

.method public getMid_()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->mid_:Ljava/lang/String;

    .line 68
    return-object v0
.end method

.method public getRes_()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->res_:I

    .line 56
    return v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    const-string v0, "TransferMediaResponse, res:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    const-string v0, ", res:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->res_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServerErrorCode()I
    .locals 1

    .line 90
    invoke-virtual {p0}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->getRes_()I

    move-result v0

    return v0
.end method

.method public getThumbFlag_()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->thumbFlag_:Ljava/lang/String;

    .line 74
    return-object v0
.end method

.method public getUrl_()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->url_:Ljava/lang/String;

    .line 62
    return-object v0
.end method
