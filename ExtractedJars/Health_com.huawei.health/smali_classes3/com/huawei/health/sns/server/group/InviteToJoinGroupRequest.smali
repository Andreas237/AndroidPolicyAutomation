.class public Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/inviteToJoinGrp"


# instance fields
.field public grpID_:J

.field public userList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 51
    const-string v0, "/inviteToJoinGrp"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->method:Ljava/lang/String;

    .line 52
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->module:Ljava/lang/String;

    .line 53
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 58
    new-instance v0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;-><init>()V

    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InviteToJoinGroupRequest "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 65
    return-object v2
.end method

.method public getUserList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->userList_:Ljava/util/List;

    return-object v0
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 33
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->grpID_:J

    .line 34
    return-void
.end method

.method public setUserList_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->userList_:Ljava/util/List;

    .line 47
    return-void
.end method
