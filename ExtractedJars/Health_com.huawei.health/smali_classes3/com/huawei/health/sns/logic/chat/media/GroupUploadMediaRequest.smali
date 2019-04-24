.class public Lcom/huawei/health/sns/logic/chat/media/GroupUploadMediaRequest;
.super Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;
.source "SourceFile"


# instance fields
.field public groupID_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;-><init>()V

    .line 31
    return-void
.end method


# virtual methods
.method public getGroupID_()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/GroupUploadMediaRequest;->groupID_:Ljava/lang/String;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GroupUploadMediaRequest, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setGroupID_(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/GroupUploadMediaRequest;->groupID_:Ljava/lang/String;

    .line 26
    return-void
.end method
