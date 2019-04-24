.class public Lcom/huawei/health/sns/logic/chat/media/pic/SingleUploadMediaRequest;
.super Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;
.source "SourceFile"


# instance fields
.field public uID_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;-><init>()V

    .line 32
    return-void
.end method


# virtual methods
.method public getLog()Ljava/lang/String;
    .locals 3

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SingleUploadMediaRequest, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getuID_()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/pic/SingleUploadMediaRequest;->uID_:Ljava/lang/String;

    return-object v0
.end method

.method public setuID_(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/pic/SingleUploadMediaRequest;->uID_:Ljava/lang/String;

    .line 27
    return-void
.end method
