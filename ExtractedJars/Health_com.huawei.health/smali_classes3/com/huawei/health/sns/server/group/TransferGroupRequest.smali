.class public Lcom/huawei/health/sns/server/group/TransferGroupRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/transferGroup"


# instance fields
.field private dstUID_:J

.field private grpID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 49
    const-string v0, "/transferGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->method:Ljava/lang/String;

    .line 50
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->module:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 56
    new-instance v0, Lcom/huawei/health/sns/server/group/TransferGroupResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/TransferGroupResponse;-><init>()V

    return-object v0
.end method

.method public getDstUID_()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->dstUID_:J

    return-wide v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransferGroupRequest, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setDstUID_(J)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->dstUID_:J

    .line 35
    return-void
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 26
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->grpID_:J

    .line 27
    return-void
.end method

.method public setIdsData(JJ)V
    .locals 0

    .line 69
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->grpID_:J

    .line 70
    iput-wide p3, p0, Lcom/huawei/health/sns/server/group/TransferGroupRequest;->dstUID_:J

    .line 71
    return-void
.end method
