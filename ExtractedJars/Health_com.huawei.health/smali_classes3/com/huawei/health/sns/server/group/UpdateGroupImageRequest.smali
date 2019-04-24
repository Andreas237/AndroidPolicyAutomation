.class public Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateGroupImg"

.field private static final FILE_COUNT:I = 0x1

.field private static final FILE_KEY:Ljava/lang/String; = "BigImage"


# instance fields
.field public fileCnt_:I

.field public grpID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 55
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->fileCnt_:I

    .line 59
    const-string v0, "/updateGroupImg"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->method:Ljava/lang/String;

    .line 60
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->module:Ljava/lang/String;

    .line 61
    const-string v0, "BigImage"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->fileKey:Ljava/lang/String;

    .line 62
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 67
    new-instance v0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;-><init>()V

    return-object v0
.end method

.method public getFileCnt_()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->fileCnt_:I

    return v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdateGroupImageRequest, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 74
    return-object v2
.end method

.method public setFileCnt_(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->fileCnt_:I

    .line 50
    return-void
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageRequest;->grpID_:J

    .line 42
    return-void
.end method
