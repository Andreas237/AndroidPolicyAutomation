.class public Lo/atd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atd;->b:Landroid/os/Handler;

    .line 44
    iput-object p1, p0, Lo/atd;->b:Landroid/os/Handler;

    .line 45
    return-void
.end method

.method private a(I)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 207
    new-instance v0, Lo/atd$5;

    invoke-direct {v0, p0, p1}, Lo/atd$5;-><init>(Lo/atd;I)V

    return-object v0
.end method

.method static synthetic c(Lo/atd;)Landroid/os/Handler;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/atd;->b:Landroid/os/Handler;

    return-object v0
.end method

.method private c(II)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 59
    new-instance v0, Lo/atd$3;

    invoke-direct {v0, p0, p2, p1}, Lo/atd$3;-><init>(Lo/atd;II)V

    return-object v0
.end method

.method private d(II)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 145
    new-instance v0, Lo/atd$4;

    invoke-direct {v0, p0, p2, p1}, Lo/atd$4;-><init>(Lo/atd;II)V

    return-object v0
.end method

.method static synthetic d(Lo/atd;Ljava/util/ArrayList;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lo/atd;->e(Ljava/util/ArrayList;I)V

    return-void
.end method

.method private declared-synchronized e(I)Lcom/huawei/health/sns/model/group/GroupListData;
    .locals 7

    monitor-enter p0

    .line 99
    :try_start_0
    new-instance v0, Lo/atn;

    invoke-direct {v0}, Lo/atn;-><init>()V

    invoke-virtual {v0}, Lo/atn;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 101
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v2

    .line 103
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 105
    new-instance v4, Lcom/huawei/health/sns/model/group/GroupListData;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/group/GroupListData;-><init>()V

    .line 108
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 109
    if-lez v5, :cond_0

    .line 111
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 112
    invoke-virtual {v6, v5}, Lcom/huawei/health/sns/model/group/GroupNotify;->setInviteCount(I)V

    .line 113
    invoke-virtual {v4, v6}, Lcom/huawei/health/sns/model/group/GroupListData;->setGroupNotify(Lcom/huawei/health/sns/model/group/GroupNotify;)V

    .line 116
    :cond_0
    invoke-virtual {v4, v3}, Lcom/huawei/health/sns/model/group/GroupListData;->setGroupList(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic e(Lo/atd;I)Lcom/huawei/health/sns/model/group/GroupListData;
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Lo/atd;->e(I)Lcom/huawei/health/sns/model/group/GroupListData;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/util/ArrayList;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;I)V"
        }
    .end annotation

    .line 222
    new-instance v1, Lcom/huawei/health/sns/model/group/GroupListData;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/group/GroupListData;-><init>()V

    .line 224
    invoke-virtual {v1, p1}, Lcom/huawei/health/sns/model/group/GroupListData;->setGroupList(Ljava/util/ArrayList;)V

    .line 226
    iget-object v0, p0, Lo/atd;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/atd;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 229
    iput p2, v2, Landroid/os/Message;->what:I

    .line 230
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 231
    const-string v0, "bundleKeyGroupListData"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 232
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 233
    iget-object v0, p0, Lo/atd;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 235
    :cond_0
    return-void
.end method

.method private i(II)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 171
    new-instance v0, Lo/atd$1;

    invoke-direct {v0, p0, p2, p1}, Lo/atd$1;-><init>(Lo/atd;II)V

    return-object v0
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .line 140
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lo/atd;->i(II)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 141
    return-void
.end method

.method public b(II)V
    .locals 2

    .line 129
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lo/atd;->d(II)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 130
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 202
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/atd;->a(I)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 203
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 54
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lo/atd;->c(II)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 55
    return-void
.end method
