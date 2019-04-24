.class public Lo/awt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;


# instance fields
.field private b:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;>;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 78
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/awt;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awt;->e:Ljava/util/List;

    .line 93
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    .line 98
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/awt;->d:Landroid/support/v4/util/LongSparseArray;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/awt;->i:Z

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/awt;->f:Z

    .line 122
    iput p1, p0, Lo/awt;->c:I

    .line 123
    return-void
.end method

.method private a()V
    .locals 2

    .line 611
    new-instance v1, Lo/awr;

    invoke-direct {v1}, Lo/awr;-><init>()V

    .line 612
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/awr;->c(Lo/bra;)I

    .line 613
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 471
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 474
    invoke-direct {p0, p1}, Lo/awt;->e(Ljava/util/List;)Z

    .line 475
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "hasFriendNotify, getFriendList"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    invoke-direct {p0}, Lo/awt;->a()V

    .line 478
    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/user/UserNotify$b;)Z
    .locals 1

    .line 537
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private a(Lcom/huawei/health/sns/model/user/UserNotify;)Z
    .locals 4

    .line 836
    const/4 v2, 0x0

    .line 837
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 838
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 839
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getAppPkg()Ljava/lang/String;

    move-result-object v0

    .line 838
    invoke-static {v3, v0}, Lo/bnx;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 841
    const/4 v2, 0x1

    .line 843
    :cond_0
    return v2
.end method

.method private a(Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;)Z
    .locals 7

    .line 774
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 775
    const-string v0, "GetUsrNotifyTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    const/4 v0, 0x1

    return v0

    .line 778
    :cond_0
    const/4 v4, 0x1

    .line 779
    invoke-static {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v0

    iput-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    .line 780
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget v0, v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_6

    .line 783
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget v0, v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_5

    .line 785
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    instance-of v0, v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;

    if-eqz v0, :cond_4

    .line 787
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;

    .line 789
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->getGetFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 792
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->getGetFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->getFrdAddNotifyList_()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 793
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->getGetFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->getFrdAddNotifyList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 795
    iget-object v0, p0, Lo/awt;->e:Ljava/util/List;

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->getGetFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    move-result-object v1

    .line 796
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->getFrdAddNotifyList_()Ljava/util/List;

    move-result-object v1

    .line 795
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 799
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->getGetFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->getHasMore_()I

    move-result v6

    .line 801
    const/4 v0, 0x1

    if-ne v6, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/awt;->i:Z

    .line 803
    const/4 v4, 0x0

    .line 804
    goto :goto_1

    .line 807
    :cond_3
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "Get user notify list error! GetFrdNotifyListRsp_ empty!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 809
    :goto_1
    goto :goto_2

    .line 812
    :cond_4
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "Get user notify list error!  wrong response."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 817
    :cond_5
    const-string v0, "GetUsrNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get user notify list error!  resultCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget v2, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 822
    :cond_6
    const-string v0, "GetUsrNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget v2, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 825
    :goto_2
    return v4
.end method

.method private b()Landroid/support/v4/util/LongSparseArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 372
    new-instance v2, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v2}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 374
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 376
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v4}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 378
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 380
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1, v3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 374
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 384
    :cond_1
    invoke-direct {p0, v2}, Lo/awt;->c(Landroid/support/v4/util/LongSparseArray;)V

    .line 385
    return-object v2
.end method

.method private b(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;)Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation

    .line 677
    const/4 v2, 0x0

    .line 679
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 681
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 682
    const/4 v3, 0x0

    .line 683
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    .line 686
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getType_()I

    move-result v1

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    .line 687
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getType_()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 689
    goto :goto_0

    .line 692
    :cond_1
    new-instance v3, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>()V

    .line 693
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getNote_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setNote(Ljava/lang/String;)V

    .line 694
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setSender(I)V

    .line 695
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdUID_()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setUserId(J)V

    .line 696
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getSendTime_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 697
    invoke-virtual {v3, v6}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setSendTime(Ljava/lang/String;)V

    .line 698
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getType_()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setType(I)V

    .line 699
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 700
    goto :goto_0

    .line 702
    :cond_2
    return-object v2
.end method

.method private b(Landroid/support/v4/util/LongSparseArray;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 194
    invoke-virtual {p1}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v2

    .line 195
    if-lez v2, :cond_1

    .line 197
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 198
    const-string v0, "com.huawei.health.sns.local_action_unread_notify"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    new-array v4, v2, [J

    .line 200
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 202
    invoke-virtual {p1, v5}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J

    move-result-wide v0

    aput-wide v0, v4, v5

    .line 200
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 204
    :cond_0
    const-string v0, "unReadNotifyUserIdArray"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 205
    invoke-static {v3}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 207
    :cond_1
    return-void
.end method

.method private b(Ljava/util/List;Lcom/huawei/health/sns/model/user/UserNotify;Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Lcom/huawei/health/sns/model/user/UserNotify;Lcom/huawei/health/sns/model/user/UserNotify;)V"
        }
    .end annotation

    .line 514
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 516
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/UserNotify;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNote(Ljava/lang/String;)V

    .line 517
    invoke-direct {p0, p2}, Lo/awt;->d(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 521
    :cond_1
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_3

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_2

    .line 522
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_3

    .line 524
    :cond_2
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 526
    :cond_3
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 527
    return-void
.end method

.method private b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Z"
        }
    .end annotation

    .line 355
    const/4 v1, 0x0

    .line 356
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    if-eqz p2, :cond_1

    .line 357
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 359
    :cond_2
    const/4 v1, 0x1

    .line 362
    :cond_3
    return v1
.end method

.method private static c(Lo/awt;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/awt;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 449
    new-instance v0, Lo/awt$1;

    invoke-direct {v0, p0, p1, p2}, Lo/awt$1;-><init>(Lo/awt;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)V

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 313
    invoke-direct {p0}, Lo/awt;->b()Landroid/support/v4/util/LongSparseArray;

    move-result-object v2

    .line 316
    invoke-virtual {v2}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 318
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, v2}, Lo/awt;->d(Lo/awt;Landroid/support/v4/util/LongSparseArray;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 320
    :cond_0
    return-void
.end method

.method private c(Landroid/support/v4/util/LongSparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 397
    iget-object v0, p0, Lo/awt;->d:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 399
    if-nez p1, :cond_0

    .line 401
    new-instance p1, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {p1}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 404
    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/awt;->d:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 406
    iget-object v0, p0, Lo/awt;->d:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v3}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 407
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, v2}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 404
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 410
    :cond_1
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/UserNotify;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/UserNotify;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 553
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 555
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    :cond_1
    return-void
.end method

.method private c(Ljava/util/List;Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Lcom/huawei/health/sns/model/user/UserNotify;)V"
        }
    .end annotation

    .line 488
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 490
    :cond_0
    invoke-direct {p0, p2}, Lo/awt;->d(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 494
    :cond_1
    invoke-direct {p0, p2}, Lo/awt;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 496
    const-string v0, "GetUsrNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "splitUserNotify(),not insert to db,getType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 498
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awt;->a(Lcom/huawei/health/sns/model/user/UserNotify$b;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 500
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    :cond_3
    :goto_0
    return-void
.end method

.method private d()Landroid/support/v4/util/LongSparseArray;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 296
    new-instance v2, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v2}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 297
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/axi;->c(Z)Ljava/util/List;

    move-result-object v3

    .line 298
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 300
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 302
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1, v5}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 303
    goto :goto_0

    .line 305
    :cond_0
    return-object v2
.end method

.method private static d(Lo/awt;Landroid/support/v4/util/LongSparseArray;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/awt;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 331
    new-instance v0, Lo/awt$5;

    invoke-direct {v0, p0, p1}, Lo/awt$5;-><init>(Lo/awt;Landroid/support/v4/util/LongSparseArray;)V

    return-object v0
.end method

.method private d(Landroid/support/v4/util/LongSparseArray;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 582
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 584
    :cond_0
    return-void

    .line 586
    :cond_1
    new-instance v2, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;-><init>()V

    .line 587
    const/4 v3, 0x0

    .line 588
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 589
    const/4 v5, 0x0

    .line 590
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 592
    invoke-virtual {p1, v6}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 593
    new-instance v3, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;-><init>()V

    .line 594
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    iput-wide v0, v3, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;->frdUID_:J

    .line 595
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getNotifiedSide()I

    move-result v0

    iput v0, v3, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;->notifiedSide_:I

    .line 596
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 590
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 598
    :cond_2
    iput-object v4, v2, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;->delFrdAddNotifyList_:Ljava/util/List;

    .line 599
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v6

    .line 600
    iget v0, v6, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-eqz v0, :cond_3

    .line 602
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "deleteUserNotifyOnServer error!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    :cond_3
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 7

    .line 854
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->b(J)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 856
    return-void

    .line 859
    :cond_0
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 860
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 861
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 862
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 863
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 864
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 865
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 867
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 868
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 871
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_agree_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 872
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 873
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 875
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    goto :goto_0

    .line 877
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_2

    .line 880
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_friend_added_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 881
    invoke-direct {p0, p1}, Lo/awt;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Ljava/lang/String;

    move-result-object v3

    .line 880
    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 882
    const/16 v0, 0xd

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 883
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 885
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 887
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/awt;Ljava/util/List;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/awt;->a(Ljava/util/List;)V

    return-void
.end method

.method private e(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;Ljava/util/List;)Lcom/huawei/health/sns/model/user/UserNotify;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;Ljava/util/List<Ljava/lang/Long;>;)Lcom/huawei/health/sns/model/user/UserNotify;"
        }
    .end annotation

    .line 714
    new-instance v2, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/UserNotify;-><init>()V

    .line 715
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdUID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->setUserId(J)V

    .line 716
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setImageUrl(Ljava/lang/String;)V

    .line 717
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setUrlDownload(Ljava/lang/String;)V

    .line 718
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNickName(Ljava/lang/String;)V

    .line 719
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setPhoneDigest(Ljava/lang/String;)V

    .line 720
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getNotifiedSide_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNotifiedSide(I)V

    .line 722
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 724
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 725
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getType_()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->e(I)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 726
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getSendTime_()Ljava/lang/String;

    move-result-object v4

    .line 727
    invoke-static {v4}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setSendTime(Ljava/lang/String;)V

    .line 728
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getNote_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 730
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getNote_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNote(Ljava/lang/String;)V

    .line 732
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 734
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdAddNotes_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setAppPkg(Ljava/lang/String;)V

    .line 739
    :cond_1
    iget v0, p0, Lo/awt;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 743
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_3

    :cond_2
    if-eqz p2, :cond_3

    .line 744
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 746
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    goto :goto_0

    .line 750
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    goto :goto_0

    .line 756
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 760
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setFrdOrigin(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 761
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->getMyOrigin_()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setMyOrigin(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 763
    return-object v2
.end method

.method private e(Lcom/huawei/health/sns/model/user/UserNotify;)Ljava/lang/String;
    .locals 5

    .line 898
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 899
    if-eqz v4, :cond_0

    .line 901
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 905
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getRemarkName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/axa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 906
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 908
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 911
    :cond_1
    :goto_0
    return-object v3
.end method

.method private e(Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 435
    invoke-direct {p0, p2}, Lo/awt;->c(Landroid/support/v4/util/LongSparseArray;)V

    .line 436
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1, p2}, Lo/awt;->c(Lo/awt;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 437
    return-void
.end method

.method static synthetic e(Lo/awt;Landroid/support/v4/util/LongSparseArray;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/awt;->d(Landroid/support/v4/util/LongSparseArray;)V

    return-void
.end method

.method private e(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)Z"
        }
    .end annotation

    .line 567
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/axa;->c(Ljava/util/List;)Z

    move-result v2

    .line 568
    if-nez v2, :cond_0

    .line 570
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "findContactByPhoneDigest update user failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    :cond_0
    return v2
.end method

.method private e(Lo/bra;)Z
    .locals 11

    .line 218
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 220
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 222
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 224
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 227
    invoke-direct {p0}, Lo/awt;->d()Landroid/support/v4/util/LongSparseArray;

    move-result-object v7

    .line 230
    const/4 v8, 0x0

    .line 231
    const/4 v9, 0x0

    .line 232
    const/4 v10, 0x0

    :goto_0
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 235
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v10}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 237
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {v7, v0, v1, v2}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 238
    if-eqz v9, :cond_0

    .line 241
    invoke-direct {p0, v4, v8, v9}, Lo/awt;->b(Ljava/util/List;Lcom/huawei/health/sns/model/user/UserNotify;Lcom/huawei/health/sns/model/user/UserNotify;)V

    goto :goto_1

    .line 246
    :cond_0
    invoke-direct {p0, v3, v8}, Lo/awt;->c(Ljava/util/List;Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 250
    :goto_1
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getAddNotes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getAddNotes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 252
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getAddNotes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 256
    :cond_1
    invoke-direct {p0, v8, v6}, Lo/awt;->c(Lcom/huawei/health/sns/model/user/UserNotify;Ljava/util/List;)V

    .line 232
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 259
    :cond_2
    const/4 v10, 0x0

    .line 260
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 262
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    return v10

    .line 267
    :cond_3
    invoke-direct {p0, v3, v4, v5}, Lo/awt;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 269
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "isDataEmpty true."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0}, Lo/axi;->c()V

    .line 272
    invoke-direct {p0}, Lo/awt;->c()V

    .line 273
    const/4 v10, 0x1

    goto :goto_2

    .line 275
    :cond_4
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v3, v4, v5}, Lo/axi;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 278
    const-string v0, "GetUsrNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update or insert notify success,updateUserNotifyList:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",insertUserNotifyList:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 279
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 278
    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0}, Lo/axi;->c()V

    .line 281
    const/4 v10, 0x1

    .line 283
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-direct {p0, v6, v0}, Lo/awt;->e(Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)V

    .line 286
    :cond_5
    :goto_2
    return v10
.end method

.method private g()V
    .locals 8

    .line 620
    const/4 v3, 0x0

    .line 621
    const/4 v4, 0x0

    .line 623
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0}, Lo/axi;->b()Ljava/util/List;

    move-result-object v5

    .line 624
    iget-object v0, p0, Lo/awt;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;

    .line 626
    if-eqz v7, :cond_3

    .line 629
    invoke-direct {p0, v7, v5}, Lo/awt;->e(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;Ljava/util/List;)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v3

    .line 630
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 632
    iget-object v0, p0, Lo/awt;->d:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/util/LongSparseArray;->append(JLjava/lang/Object;)V

    .line 634
    goto :goto_0

    .line 638
    :cond_0
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 639
    if-nez v4, :cond_1

    .line 642
    invoke-direct {p0, v7}, Lo/awt;->b(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setAddNotes(Ljava/util/List;)V

    .line 643
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    goto :goto_1

    .line 648
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getSendTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getSendTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 651
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getSendTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getSendTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 653
    goto/16 :goto_0

    .line 658
    :cond_2
    invoke-direct {p0, v7}, Lo/awt;->b(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setAddNotes(Ljava/util/List;)V

    .line 659
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 664
    :cond_3
    :goto_1
    goto/16 :goto_0

    .line 666
    :cond_4
    iget-object v0, p0, Lo/awt;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-direct {p0, v0}, Lo/awt;->b(Landroid/support/v4/util/LongSparseArray;)V

    .line 667
    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 53
    invoke-virtual {p0, p1}, Lo/awt;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 131
    const/4 v3, 0x0

    .line 132
    sget-object v4, Lo/awt;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 135
    :try_start_0
    new-instance v5, Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;-><init>()V

    .line 136
    const/16 v0, 0x64

    iput v0, v5, Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;->maxNum_:I

    .line 139
    :cond_0
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    const-string v0, "GetUsrNotifyTask"

    const-string v1, "task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 144
    :cond_1
    :try_start_1
    invoke-direct {p0, v5}, Lo/awt;->a(Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;)Z

    move-result v0

    iput-boolean v0, p0, Lo/awt;->f:Z

    .line 145
    iget-boolean v0, p0, Lo/awt;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lo/awt;->i:Z

    if-nez v0, :cond_0

    .line 147
    :cond_2
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v6

    .line 148
    if-nez v6, :cond_3

    iget-boolean v0, p0, Lo/awt;->f:Z

    if-eqz v0, :cond_4

    .line 150
    :cond_3
    const-string v0, "GetUsrNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "task isCancel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",get UserNotify isRequestError:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lo/awt;->f:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 155
    :cond_4
    :try_start_2
    iget-object v0, p0, Lo/awt;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 157
    const-string v0, "GetUsrNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get userNotifyList succ, size is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/awt;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    invoke-direct {p0}, Lo/awt;->g()V

    .line 161
    invoke-direct {p0, p1}, Lo/awt;->e(Lo/bra;)Z

    move-result v3

    goto :goto_0

    .line 165
    :cond_5
    const/4 v3, 0x1

    .line 166
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0}, Lo/axi;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 169
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Message;)Landroid/os/Message;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget v0, v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iput v0, p1, Landroid/os/Message;->arg1:I

    .line 182
    iget-object v0, p0, Lo/awt;->g:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget v0, v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    iput v0, p1, Landroid/os/Message;->arg2:I

    .line 184
    :cond_0
    return-object p1
.end method

.method public e()Z
    .locals 3

    .line 419
    sget-object v1, Lo/awt;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 421
    :try_start_0
    iget-boolean v0, p0, Lo/awt;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    .line 422
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
