.class public Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;
    }
.end annotation


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/delGrpNotifyList"


# instance fields
.field private delGroupNotifyList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->delGroupNotifyList_:Ljava/util/List;

    .line 92
    const-string v0, "/delGrpNotifyList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->method:Ljava/lang/String;

    .line 93
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->module:Ljava/lang/String;

    .line 94
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 99
    new-instance v0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListResponse;-><init>()V

    return-object v0
.end method

.method public getDelGroupNotifyList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;>;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->delGroupNotifyList_:Ljava/util/List;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 1

    .line 105
    const-string v0, "DeleteGroupNotifyListRequest"

    .line 106
    return-object v0
.end method

.method public setDelGroupNotifyList_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;>;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->delGroupNotifyList_:Ljava/util/List;

    .line 33
    return-void
.end method
