.class public Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;
    }
.end annotation


# instance fields
.field private UpdateGroupImgRsp_:Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 16
    new-instance v0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;->UpdateGroupImgRsp_:Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdateGroupImageResponse, UpdateGroupImgRsp, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUpdateGroupImgRsp_()Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;->UpdateGroupImgRsp_:Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;

    return-object v0
.end method
