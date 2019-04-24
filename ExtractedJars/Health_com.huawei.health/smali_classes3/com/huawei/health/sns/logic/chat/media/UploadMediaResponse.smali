.class public Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
.source "SourceFile"


# instance fields
.field private mid_:J

.field private res_:I

.field private thumbFlag_:Ljava/lang/String;

.field private url_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getMid_()J
    .locals 2

    .line 57
    iget-wide v0, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->mid_:J

    .line 58
    return-wide v0
.end method

.method public getRes_()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->res_:I

    .line 47
    return v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    const-string v0, "UploadMediaResponse res:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->res_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getThumbFlag_()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->thumbFlag_:Ljava/lang/String;

    .line 80
    return-object v0
.end method

.method public getUrl_()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->url_:Ljava/lang/String;

    .line 69
    return-object v0
.end method

.method public setMid_(J)V
    .locals 0

    .line 63
    iput-wide p1, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->mid_:J

    .line 64
    return-void
.end method

.method public setRes_(I)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->res_:I

    .line 53
    return-void
.end method

.method public setThumbFlag_(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->thumbFlag_:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setUrl_(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;->url_:Ljava/lang/String;

    .line 75
    return-void
.end method
