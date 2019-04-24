.class public Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetFrdNotifyListRsp"
.end annotation


# instance fields
.field private frdAddNotifyList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;>;"
        }
    .end annotation
.end field

.field private hasMore_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->frdAddNotifyList_:Ljava/util/List;

    .line 52
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->hasMore_:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;)I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->hasMore_:I

    return v0
.end method


# virtual methods
.method public getFrdAddNotifyList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;>;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->frdAddNotifyList_:Ljava/util/List;

    return-object v0
.end method

.method public getHasMore_()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->hasMore_:I

    return v0
.end method
