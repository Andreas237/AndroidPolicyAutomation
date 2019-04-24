.class public Lcom/huawei/health/sns/server/group/FindGroupRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/findGroup"


# instance fields
.field public grpID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 40
    const-string v0, "/findGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupRequest;->method:Ljava/lang/String;

    .line 41
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupRequest;->module:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public static getAPIMETHOD()Ljava/lang/String;
    .locals 1

    .line 35
    const-string v0, "/findGroup"

    return-object v0
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 47
    new-instance v0, Lcom/huawei/health/sns/server/group/FindGroupResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/FindGroupResponse;-><init>()V

    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/FindGroupRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FindGroupRequest "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 54
    return-object v2
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 26
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/FindGroupRequest;->grpID_:J

    .line 27
    return-void
.end method
