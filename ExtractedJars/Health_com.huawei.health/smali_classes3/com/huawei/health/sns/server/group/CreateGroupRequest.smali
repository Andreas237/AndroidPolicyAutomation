.class public Lcom/huawei/health/sns/server/group/CreateGroupRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/createGroup"


# instance fields
.field private grpName_:Ljava/lang/String;

.field private grpTags_:Ljava/lang/String;

.field private userList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 41
    const-string v0, "/createGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->method:Ljava/lang/String;

    .line 42
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->module:Ljava/lang/String;

    .line 43
    return-void
.end method


# virtual methods
.method public addUserList_(J)V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->userList_:Ljava/util/List;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->userList_:Ljava/util/List;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->userList_:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    return-void
.end method

.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 79
    new-instance v0, Lcom/huawei/health/sns/server/group/CreateGroupResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/CreateGroupResponse;-><init>()V

    return-object v0
.end method

.method public getGrpName_()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->grpName_:Ljava/lang/String;

    .line 48
    return-object v0
.end method

.method public getGrpTags_()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->grpTags_:Ljava/lang/String;

    .line 59
    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    const-string v0, "CreateGroupRequest n:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, ", gt:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    const-string v0, ", size:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->userList_:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->userList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setGrpName_(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->grpName_:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setGrpTags_(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->grpTags_:Ljava/lang/String;

    .line 65
    return-void
.end method
