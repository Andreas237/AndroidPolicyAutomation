.class public Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetFriendListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetFriendListRsp"
.end annotation


# instance fields
.field private newVersion_:Ljava/lang/String;

.field private totalNum_:I

.field private userFrdInfoList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->userFrdInfoList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getNewVersion_()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->newVersion_:Ljava/lang/String;

    .line 63
    return-object v0
.end method

.method public getTotalNum_()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->totalNum_:I

    .line 69
    return v0
.end method

.method public getUserFrdInfoList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->userFrdInfoList_:Ljava/util/List;

    return-object v0
.end method

.method public setNewVersion_(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->newVersion_:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setTotalNum_(I)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->totalNum_:I

    .line 53
    return-void
.end method

.method public setUserFrdInfoList_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)V"
        }
    .end annotation

    .line 44
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->userFrdInfoList_:Ljava/util/List;

    .line 45
    return-void
.end method
