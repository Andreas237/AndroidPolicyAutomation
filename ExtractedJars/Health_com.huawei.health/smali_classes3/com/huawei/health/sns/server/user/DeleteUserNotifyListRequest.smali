.class public Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;
    }
.end annotation


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/delFrdNotifyList"


# instance fields
.field public delFrdAddNotifyList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 50
    const-string v0, "/delFrdNotifyList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;->method:Ljava/lang/String;

    .line 51
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;->module:Ljava/lang/String;

    .line 52
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 57
    new-instance v0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    const-string v0, "DeleteUserNotifyListRequest size:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;->delFrdAddNotifyList_:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;->delFrdAddNotifyList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
