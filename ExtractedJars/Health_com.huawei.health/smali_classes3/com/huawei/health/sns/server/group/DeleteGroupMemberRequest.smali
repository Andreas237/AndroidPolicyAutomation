.class public Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/delGrpMember"


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

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 35
    const-string v0, "/delGrpMember"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->method:Ljava/lang/String;

    .line 36
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->module:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 42
    new-instance v0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    const-string v0, "DeleteGroupMemberRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
