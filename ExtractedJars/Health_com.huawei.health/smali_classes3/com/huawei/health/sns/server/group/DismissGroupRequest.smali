.class public Lcom/huawei/health/sns/server/group/DismissGroupRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/dismissGroup"


# instance fields
.field public grpID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 36
    const-string v0, "/dismissGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DismissGroupRequest;->method:Ljava/lang/String;

    .line 37
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DismissGroupRequest;->module:Ljava/lang/String;

    .line 38
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 43
    new-instance v0, Lcom/huawei/health/sns/server/group/DismissGroupResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/DismissGroupResponse;-><init>()V

    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/DismissGroupRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DismissGroupRequest "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 50
    return-object v2
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 31
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/DismissGroupRequest;->grpID_:J

    .line 32
    return-void
.end method
