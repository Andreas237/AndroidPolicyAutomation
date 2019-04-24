.class public Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;,
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/Runnable;

.field private B:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

.field private D:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

.field private a:Landroid/os/HandlerThread;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ffh;>;"
        }
    .end annotation
.end field

.field private c:Landroid/widget/ExpandableListView;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ffh;>;"
        }
    .end annotation
.end field

.field private e:Lo/ffj;

.field private f:Landroid/os/Handler;

.field private g:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;

.field private h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

.field private i:Landroid/os/Handler;

.field private k:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

.field private l:Lhuawei/widget/HwProgressBar;

.field private m:Z

.field private n:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/RelativeLayout;

.field private q:I

.field private r:Landroid/content/Context;

.field private s:Z

.field private t:I

.field private u:I

.field private v:Z

.field private w:I

.field private x:J

.field private y:I

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 171
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    .line 101
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TrackSportHistoryFragThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a:Landroid/os/HandlerThread;

    .line 105
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->k:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

    .line 107
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    .line 110
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->g:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;

    .line 112
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->n:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m:Z

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s:Z

    .line 145
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->t:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    .line 153
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    .line 154
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    .line 155
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->x:J

    .line 156
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z:J

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->v:Z

    .line 162
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->D:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

    .line 169
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->B:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

    .line 171
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    .line 165
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    .line 101
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TrackSportHistoryFragThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a:Landroid/os/HandlerThread;

    .line 105
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->k:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

    .line 107
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    .line 110
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->g:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;

    .line 112
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->n:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m:Z

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s:Z

    .line 145
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->t:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    .line 153
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    .line 154
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    .line 155
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->x:J

    .line 156
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z:J

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->v:Z

    .line 162
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->D:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

    .line 169
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->B:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

    .line 166
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    .line 167
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->t:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;J)J
    .locals 0

    .line 91
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z:J

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 284
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 286
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a:Landroid/os/HandlerThread;

    .line 287
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i:Landroid/os/Handler;

    .line 288
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Landroid/os/Message;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Landroid/os/Message;)V

    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 9

    .line 509
    const/4 v4, 0x0

    .line 511
    move-object v4, p1

    :try_start_0
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 515
    goto :goto_0

    .line 512
    :catch_0
    move-exception v5

    .line 513
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySingleDataToUiData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    const/4 v4, 0x0

    .line 517
    :goto_0
    if-nez v4, :cond_0

    .line 518
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySingleDataToUiData tmp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l()V

    .line 520
    return-void

    .line 523
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(Ljava/lang/Object;)V

    .line 527
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fff;

    .line 528
    if-nez v6, :cond_2

    .line 529
    goto :goto_1

    .line 532
    :cond_2
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v6}, Lo/fff;->k()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x34

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v7

    .line 534
    const/4 v8, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_4

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, v6}, Lo/ffh;->a(Lo/fff;)V

    .line 537
    goto :goto_3

    .line 534
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 540
    :cond_4
    :goto_3
    goto :goto_1

    .line 543
    :cond_5
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    invoke-virtual {v0, v1, v2}, Lo/ffj;->e(Ljava/util/List;I)V

    .line 547
    :cond_6
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f()V

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v0}, Lo/ffj;->notifyDataSetChanged()V

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    if-eqz v0, :cond_b

    .line 550
    const/4 v5, 0x0

    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_9

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 553
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    goto :goto_5

    .line 555
    :cond_7
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(I)V

    .line 550
    :cond_8
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 561
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_a

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_6

    .line 565
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 570
    :cond_b
    :goto_6
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d()V

    .line 571
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s:Z

    .line 572
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Z)Z
    .locals 0

    .line 91
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->v:Z

    return p1
.end method

.method private b(Ljava/util/List;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ffh;>;)J"
        }
    .end annotation

    .line 352
    const/4 v2, 0x0

    .line 353
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 354
    const-wide/16 v0, 0x0

    return-wide v0

    .line 357
    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 358
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->c()I

    move-result v0

    add-int/2addr v2, v0

    .line 359
    const/16 v0, 0x10

    if-lt v2, v0, :cond_1

    .line 360
    iput v3, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    .line 361
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->d()J

    move-result-wide v0

    return-wide v0

    .line 357
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 365
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    .line 366
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method private b()V
    .locals 4

    .line 277
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 279
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;-><init>(Landroid/os/Looper;Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i:Landroid/os/Handler;

    .line 280
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    .line 281
    return-void
.end method

.method private b(I)V
    .locals 2

    .line 1509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 1510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    .line 1511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ffh;->c(Z)V

    .line 1513
    :cond_0
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 12

    .line 575
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMonthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, [Ljava/lang/Object;

    .line 577
    const/4 v5, 0x0

    .line 578
    const/4 v6, 0x0

    .line 580
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 581
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 585
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v4, v0

    if-eqz v0, :cond_0

    .line 586
    const/4 v0, 0x0

    aget-object v0, v4, v0

    check-cast v0, Ljava/util/List;

    move-object v5, v0

    .line 588
    :cond_0
    const/4 v0, 0x1

    aget-object v0, v4, v0

    if-eqz v0, :cond_1

    .line 589
    const/4 v0, 0x1

    aget-object v0, v4, v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v0

    .line 593
    :cond_1
    goto :goto_0

    .line 591
    :catch_0
    move-exception v9

    .line 592
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_DEAL_MONTH_DATA "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    :goto_0
    if-nez v5, :cond_2

    if-nez v6, :cond_2

    .line 596
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    return-void

    .line 600
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 602
    invoke-direct {p0, v5, v7}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(Ljava/util/List;Ljava/util/List;)V

    .line 604
    invoke-direct {p0, v6, v8}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Ljava/util/List;Ljava/util/List;)V

    .line 606
    invoke-static {v7, v8}, Lo/ffk;->d(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 608
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 609
    new-instance v11, Lo/ffh;

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffd;

    invoke-direct {v11, v0}, Lo/ffh;-><init>(Lo/ffd;)V

    .line 610
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "allMonthData is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ffd;

    invoke-virtual {v2}, Lo/ffd;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 608
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 616
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 617
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMonthData mAllTypeGroupData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l()V

    .line 619
    return-void

    .line 624
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Ljava/util/List;)J

    move-result-wide v10

    .line 625
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v10, v11, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(JJ)V

    .line 626
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(I)V

    return-void
.end method

.method private b(Ljava/lang/Object;)V
    .locals 17

    .line 1329
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealInsertTrackData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    const/4 v8, 0x0

    .line 1332
    move-object/from16 v0, p1

    :try_start_0
    check-cast v0, Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    .line 1335
    goto :goto_0

    .line 1333
    :catch_0
    move-exception v9

    .line 1334
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1337
    :goto_0
    if-eqz v8, :cond_0

    const-string v0, "startTime"

    const-wide/16 v1, -0x1

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 1338
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealInsertTrackData intent is null or content wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    return-void

    .line 1342
    :cond_1
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    .line 1343
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    if-eq v9, v0, :cond_3

    .line 1344
    const/16 v0, 0x108

    if-ne v9, v0, :cond_2

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_3

    .line 1345
    :cond_2
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportType is not suitable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1346
    return-void

    .line 1351
    :cond_3
    new-instance v10, Lo/ffh;

    invoke-direct {v10}, Lo/ffh;-><init>()V

    .line 1352
    const-string v0, "distance"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    .line 1353
    const-string v0, "startTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v12

    .line 1355
    new-instance v14, Lo/ffe;

    invoke-direct {v14}, Lo/ffe;-><init>()V

    .line 1357
    const-string v0, "distance"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {v14, v0, v1}, Lo/ffe;->c(FI)V

    .line 1358
    const-string v0, "pace"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {v14, v0}, Lo/ffe;->e(F)V

    .line 1360
    invoke-virtual {v14, v12, v13}, Lo/ffe;->e(J)V

    .line 1361
    const-string v0, "endTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Lo/ffe;->a(J)V

    .line 1362
    const-string v0, "duration"

    const-wide/16 v1, 0x0

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Lo/ffe;->b(J)V

    .line 1363
    const-string v0, "calorie"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v15

    .line 1364
    int-to-float v0, v15

    invoke-virtual {v14, v0}, Lo/ffe;->b(F)V

    .line 1367
    const-string v0, "trackType"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v14, v0}, Lo/ffe;->b(I)V

    .line 1368
    const-string v0, "deviceType"

    const/16 v1, 0x20

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v14, v0}, Lo/ffe;->a(I)V

    .line 1369
    invoke-virtual {v14, v9}, Lo/ffe;->c(I)V

    .line 1370
    const/4 v0, 0x2

    invoke-virtual {v14, v0}, Lo/ffe;->d(I)V

    .line 1372
    new-instance v0, Lo/fff;

    move-object v2, v14

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2}, Lo/fff;-><init>(ILjava/lang/Object;)V

    move-object/from16 v16, v0

    .line 1377
    move-object/from16 v0, p0

    move-object v1, v10

    move v2, v11

    move-wide v3, v12

    int-to-double v5, v15

    move-object/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Lo/ffh;IJDLo/fff;)V

    .line 1379
    return-void
.end method

.method private c(J)I
    .locals 3

    .line 1465
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 1466
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->d()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gtz v0, :cond_0

    .line 1467
    return v2

    .line 1465
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1470
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)J
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z:J

    return-wide v0
.end method

.method private c()V
    .locals 4

    .line 229
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startLoadingImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 231
    return-void
.end method

.method private c(I)V
    .locals 2

    .line 1499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 1500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 1501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ffh;->c(Z)V

    .line 1503
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;IJJ)V
    .locals 0

    .line 91
    invoke-direct/range {p0 .. p5}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(IJJ)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Ljava/lang/Object;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private c(Ljava/util/List;Ljava/util/List;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;>;Ljava/util/List<Lo/ffd;>;)V"
        }
    .end annotation

    .line 677
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 679
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    .line 681
    :try_start_0
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireMonthZeroTime()J

    move-result-wide v16

    .line 682
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTime()J

    move-result-wide v18

    .line 683
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTimes()I

    move-result v20

    .line 684
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumCalorie()F

    move-result v0

    float-to-double v1, v0

    move-wide/from16 v21, v1

    .line 686
    new-instance v0, Lo/ffd;

    move-wide/from16 v7, v18

    move/from16 v9, v20

    .line 687
    move-wide/from16 v1, v16

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->b(JI)J

    move-result-wide v10

    move-wide/from16 v12, v21

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-direct/range {v0 .. v13}, Lo/ffd;-><init>(DDDJIJD)V

    move-object/from16 v23, v0

    .line 688
    move-object/from16 v0, p2

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 694
    goto :goto_1

    .line 690
    :catch_0
    move-exception v16

    .line 691
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    goto :goto_1

    .line 692
    :catch_1
    move-exception v16

    .line 693
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    :goto_1
    goto :goto_0

    .line 697
    :cond_0
    return-void
.end method

.method private c(Lo/ffh;IJDLo/fff;)V
    .locals 12

    .line 1390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 1391
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "before insert no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1392
    move-object v0, p1

    int-to-double v1, p2

    move-wide v3, p3

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lo/ffk;->b(JI)J

    move-result-wide v3

    move-wide/from16 v5, p5

    invoke-virtual/range {p7 .. p7}, Lo/fff;->g()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Lo/ffh;->c(DJDI)V

    .line 1393
    move-object/from16 v0, p7

    invoke-virtual {p1, v0}, Lo/ffh;->a(Lo/fff;)V

    .line 1394
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1395
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    .line 1398
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    invoke-virtual {v0, v1, v2}, Lo/ffj;->e(Ljava/util/List;I)V

    .line 1399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v0}, Lo/ffj;->notifyDataSetChanged()V

    .line 1402
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    .line 1404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_4

    .line 1409
    :cond_0
    move-wide v0, p3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->b(JI)J

    move-result-wide v8

    .line 1410
    invoke-direct {p0, v8, v9}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(J)I

    move-result v10

    .line 1411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v10, v0, :cond_1

    .line 1413
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no that month, new and insert it at the last"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1414
    move-object v0, p1

    int-to-double v1, p2

    move-wide v3, p3

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lo/ffk;->b(JI)J

    move-result-wide v3

    move-wide/from16 v5, p5

    invoke-virtual/range {p7 .. p7}, Lo/fff;->g()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Lo/ffh;->c(DJDI)V

    .line 1415
    move-object/from16 v0, p7

    invoke-virtual {p1, v0}, Lo/ffh;->a(Lo/fff;)V

    .line 1416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 1417
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->d()J

    move-result-wide v0

    cmp-long v0, v0, v8

    if-nez v0, :cond_4

    .line 1419
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert track to an exsiting month"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object p1, v0

    check-cast p1, Lo/ffh;

    .line 1421
    invoke-virtual {p1}, Lo/ffh;->b()I

    move-result v0

    if-nez v0, :cond_2

    .line 1423
    const/4 v0, 0x0

    invoke-static {v8, v9, v0}, Lo/ffk;->b(JI)J

    move-result-wide v0

    invoke-static {v8, v9}, Lo/ffk;->c(J)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(JJ)V

    .line 1424
    return-void

    .line 1427
    :cond_2
    move-wide v0, p3

    invoke-direct {p0, v0, v1, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(JLo/ffh;)I

    move-result v11

    .line 1428
    invoke-virtual {p1}, Lo/ffh;->b()I

    move-result v0

    if-ne v11, v0, :cond_3

    .line 1429
    move-object/from16 v0, p7

    invoke-virtual {p1, v0}, Lo/ffh;->a(Lo/fff;)V

    goto :goto_0

    .line 1431
    :cond_3
    move-object/from16 v0, p7

    invoke-virtual {p1, v11, v0}, Lo/ffh;->d(ILo/fff;)V

    .line 1434
    :goto_0
    move-object v0, p1

    int-to-double v1, p2

    invoke-virtual {p1}, Lo/ffh;->d()J

    move-result-wide v3

    move-wide/from16 v5, p5

    invoke-virtual/range {p7 .. p7}, Lo/fff;->g()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Lo/ffh;->c(DJDI)V

    .line 1437
    goto :goto_1

    .line 1439
    :cond_4
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no that month"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    move-object v0, p1

    int-to-double v1, p2

    move-wide v3, p3

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lo/ffk;->b(JI)J

    move-result-wide v3

    move-wide/from16 v5, p5

    invoke-virtual/range {p7 .. p7}, Lo/fff;->g()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Lo/ffh;->c(DJDI)V

    .line 1441
    move-object/from16 v0, p7

    invoke-virtual {p1, v0}, Lo/ffh;->a(Lo/fff;)V

    .line 1442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v10, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1445
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v0}, Lo/ffj;->notifyDataSetChanged()V

    .line 1448
    invoke-direct {p0, v10}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    .line 1449
    add-int/lit8 v11, v10, 0x1

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_6

    .line 1450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1451
    invoke-direct {p0, v11}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    goto :goto_3

    .line 1453
    :cond_5
    invoke-direct {p0, v11}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(I)V

    .line 1449
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 1457
    :cond_6
    :goto_4
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Z)Z
    .locals 0

    .line 91
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;J)J
    .locals 0

    .line 91
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->x:J

    return-wide p1
.end method

.method private d()V
    .locals 4

    .line 254
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopLoadingImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 256
    return-void
.end method

.method private d(IJJ)V
    .locals 8

    .line 1094
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSportHistoryDataFromData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1095
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    if-nez v0, :cond_0

    .line 1096
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "deleteDataResponseCallback == null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    .line 1100
    :cond_0
    new-instance v4, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 1101
    invoke-virtual {v4, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimeInterval(JJ)V

    .line 1102
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 1103
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 1104
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;JI)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 1124
    sget-object v0, Lo/dae;->hC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 1125
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 1126
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1127
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1128
    const-string v0, "startTime"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1129
    const-string v0, "endTime"

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1131
    :cond_1
    const-string v0, "sportType"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1133
    return-void

    nop

    :array_0
    .array-data 4
        0x7531
    .end array-data
.end method

.method private d(J)V
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    const/16 v1, 0x6f

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 235
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 16

    .line 749
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseTrackSimplifyData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    const/4 v4, 0x0

    .line 751
    const/4 v5, 0x0

    .line 753
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, [Ljava/lang/Object;

    .line 757
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v6, v0

    if-eqz v0, :cond_0

    .line 758
    const/4 v0, 0x0

    aget-object v0, v6, v0

    check-cast v0, Ljava/util/List;

    move-object v4, v0

    .line 760
    :cond_0
    const/4 v0, 0x1

    aget-object v0, v6, v0

    if-eqz v0, :cond_1

    .line 761
    const/4 v0, 0x1

    aget-object v0, v6, v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 765
    :cond_1
    goto :goto_0

    .line 763
    :catch_0
    move-exception v7

    .line 764
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseTrackSimplifyData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    :goto_0
    if-nez v4, :cond_2

    if-nez v5, :cond_2

    .line 768
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseTrackSimplifyData datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    return-void

    .line 772
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 774
    const/4 v8, 0x0

    .line 775
    const/4 v9, 0x0

    .line 776
    if-eqz v4, :cond_3

    .line 777
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    .line 780
    :cond_3
    if-eqz v5, :cond_4

    .line 781
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    .line 784
    :cond_4
    add-int v0, v8, v9

    if-nez v0, :cond_5

    .line 785
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseTrackSimplifyData datas size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 786
    return-void

    .line 789
    :cond_5
    if-eqz v4, :cond_9

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 790
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 791
    new-instance v12, Lo/ffe;

    invoke-direct {v12}, Lo/ffe;-><init>()V

    .line 793
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v13

    .line 794
    const/4 v14, 0x0

    .line 796
    :try_start_1
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v13, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 800
    goto :goto_2

    .line 797
    :catch_1
    move-exception v15

    .line 798
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseTrackSimplifyData trackMetaData is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    goto :goto_1

    .line 803
    :goto_2
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getChiefSportDataType()I

    move-result v15

    .line 804
    const/4 v0, 0x2

    if-ne v0, v15, :cond_6

    .line 805
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0, v15}, Lo/ffe;->c(FI)V

    .line 806
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->e(F)V

    goto :goto_3

    .line 807
    :cond_6
    const/4 v0, 0x1

    if-ne v0, v15, :cond_7

    .line 808
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0, v15}, Lo/ffe;->c(FI)V

    .line 809
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgHeartRate()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0}, Lo/ffe;->e(F)V

    goto :goto_3

    .line 811
    :cond_7
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0, v15}, Lo/ffe;->c(FI)V

    .line 812
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v0

    const/16 v1, 0x104

    if-ne v0, v1, :cond_8

    .line 813
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getCreepingWave()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v12, v0}, Lo/ffe;->e(F)V

    goto :goto_3

    .line 815
    :cond_8
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->e(F)V

    .line 820
    :goto_3
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lo/ffe;->e(J)V

    .line 821
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lo/ffe;->a(J)V

    .line 822
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lo/ffe;->b(J)V

    .line 824
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0}, Lo/ffe;->b(F)V

    .line 827
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->b(I)V

    .line 828
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->a(I)V

    .line 829
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->c(I)V

    .line 830
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->d(I)V

    .line 831
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->e(I)V

    .line 832
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    invoke-virtual {v12, v0}, Lo/ffe;->i(I)V

    .line 835
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 837
    goto/16 :goto_1

    .line 840
    :cond_9
    invoke-static {v7, v5}, Lo/ffk;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 843
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 844
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v11

    .line 845
    iput-object v10, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 846
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 849
    :cond_a
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 4

    .line 208
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    sget v0, Lcom/huawei/ui/main/R$id;->list_sport_record_simplify:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    .line 210
    new-instance v0, Lo/ffj;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ffj;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 213
    sget v0, Lcom/huawei/ui/main/R$id;->no_sport_history_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o:Landroid/widget/LinearLayout;

    .line 216
    sget v0, Lcom/huawei/ui/main/R$id;->hw_sport_history_loading:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p:Landroid/widget/RelativeLayout;

    .line 217
    sget v0, Lcom/huawei/ui/main/R$id;->hw_sport_history_loading_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l:Lhuawei/widget/HwProgressBar;

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 220
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c()V

    .line 222
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h()V

    .line 223
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Landroid/os/Message;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Landroid/os/Message;)V

    return-void
.end method

.method private e(JLo/ffh;)I
    .locals 3

    .line 1480
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p3}, Lo/ffh;->b()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 1481
    invoke-virtual {p3, v2}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->k()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 1482
    return v2

    .line 1480
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1485
    :cond_1
    invoke-virtual {p3}, Lo/ffh;->b()I

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)J
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->x:J

    return-wide v0
.end method

.method private e()V
    .locals 5

    .line 192
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->a(Landroid/content/Context;)V

    .line 197
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 198
    const-string v0, "input_sport_history_start_time"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->D:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 200
    return-void
.end method

.method private e(I)V
    .locals 6

    .line 1136
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecordDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    if-nez v0, :cond_0

    .line 1138
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "deleteFitnessRecordDB == null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1139
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    .line 1142
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    invoke-virtual {v0, p1, v1}, Lo/brt;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1145
    sget-object v0, Lo/dae;->hC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 1146
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1147
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1148
    const-string v0, "sportType"

    const/16 v1, 0x2711

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1149
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1150
    return-void
.end method

.method private e(IJJ)V
    .locals 7

    .line 309
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestMonthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->B:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    iget-object v6, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->g:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;->b(IJJLcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    .line 314
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;J)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(J)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Ljava/lang/Object;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 7

    .line 475
    const/4 v4, 0x0

    .line 477
    move-object v4, p1

    :try_start_0
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    goto :goto_0

    .line 478
    :catch_0
    move-exception v5

    .line 479
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyMonthDataToUiData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    const/4 v4, 0x0

    .line 483
    :goto_0
    if-nez v4, :cond_0

    .line 484
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyMonthDataToUiData tmp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l()V

    .line 486
    return-void

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 490
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ffh;

    .line 491
    if-eqz v6, :cond_1

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 494
    :cond_1
    goto :goto_1

    .line 496
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 497
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l()V

    .line 500
    :cond_3
    return-void
.end method

.method private e(Ljava/util/List;Ljava/util/List;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lo/ffd;>;)V"
        }
    .end annotation

    .line 631
    if-eqz p1, :cond_5

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 632
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->k()[Ljava/lang/String;

    move-result-object v14

    .line 633
    if-eqz v14, :cond_0

    array-length v0, v14

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 634
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "keys is less 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    return-void

    .line 637
    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hihealth/HiHealthData;

    .line 642
    move-object/from16 v0, p0

    :try_start_0
    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    if-nez v0, :cond_2

    .line 643
    const/4 v0, 0x3

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v2, v0

    move/from16 v17, v2

    goto :goto_1

    .line 645
    :cond_2
    const/4 v0, 0x2

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v2, v0

    move/from16 v17, v2

    .line 647
    :goto_1
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMonthData count is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 648
    if-nez v17, :cond_3

    .line 649
    goto :goto_0

    .line 653
    :cond_3
    move-object/from16 v0, p0

    :try_start_1
    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    if-nez v0, :cond_4

    .line 654
    const/4 v0, 0x0

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v19

    .line 655
    const/4 v0, 0x1

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v21

    .line 656
    const/4 v0, 0x2

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v23

    .line 657
    new-instance v0, Lo/ffd;

    move-wide/from16 v1, v19

    move-wide/from16 v3, v21

    move-wide/from16 v5, v23

    move/from16 v9, v17

    .line 658
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    const/4 v10, 0x0

    invoke-static {v7, v8, v10}, Lo/ffk;->b(JI)J

    move-result-wide v10

    const-wide/16 v7, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v0 .. v13}, Lo/ffd;-><init>(DDDJIJD)V

    move-object/from16 v18, v0

    .line 659
    goto :goto_2

    .line 660
    :cond_4
    const/4 v0, 0x0

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v19

    .line 661
    const/4 v0, 0x1

    aget-object v0, v14, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v21

    .line 662
    new-instance v0, Lo/ffd;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    move-wide/from16 v2, v19

    move-wide/from16 v4, v21

    move/from16 v6, v17

    .line 663
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    const/4 v9, 0x0

    invoke-static {v7, v8, v9}, Lo/ffk;->b(JI)J

    move-result-wide v7

    invoke-direct/range {v0 .. v8}, Lo/ffd;-><init>(IDDIJ)V

    move-object/from16 v18, v0

    .line 665
    :goto_2
    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 670
    goto :goto_3

    .line 666
    :catch_0
    move-exception v17

    .line 667
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    goto :goto_3

    .line 668
    :catch_1
    move-exception v17

    .line 669
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 671
    :goto_3
    goto/16 :goto_0

    .line 673
    :cond_5
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Z)Z
    .locals 0

    .line 91
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/ExpandableListView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    return-object v0
.end method

.method private f()V
    .locals 5

    .line 852
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    if-nez v0, :cond_0

    .line 853
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "expandOrCollapseGroup mExpandableListAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    return-void

    .line 856
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v1}, Lo/ffj;->getGroupCount()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 857
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v0}, Lo/ffj;->getGroupCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    .line 859
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 860
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    if-gt v4, v0, :cond_2

    .line 862
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    .line 860
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 864
    :cond_2
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q:I

    goto :goto_1

    .line 866
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->t:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 867
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->t:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    .line 871
    :cond_4
    :goto_1
    return-void
.end method

.method private g()V
    .locals 6

    .line 1037
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteFitnessRecordDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1040
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 1041
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$10;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 1062
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$7;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1068
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 1069
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 1070
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s:Z

    return v0
.end method

.method private h()V
    .locals 4

    .line 879
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTouchListenner"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 880
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$3;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 974
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 1017
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m:Z

    return v0
.end method

.method private i()V
    .locals 6

    .line 1022
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNotSupportDeleteFitnessRecordDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1024
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1025
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_delete_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    .line 1026
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$9;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1032
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 1033
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 1034
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->n()V

    return-void
.end method

.method private k()[Ljava/lang/String;
    .locals 3

    .line 707
    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    .line 709
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 711
    :sswitch_0
    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 712
    const-string v0, "Track_Run_Calorie_Sum"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 713
    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 715
    goto :goto_1

    .line 717
    :sswitch_1
    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 718
    const-string v0, "Track_Walk_Calorie_Sum"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 719
    const-string v0, "Track_Walk_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 720
    goto :goto_1

    .line 722
    :sswitch_2
    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 723
    const-string v0, "Track_Ride_Calorie_Sum"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 724
    const-string v0, "Track_Ride_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 725
    goto :goto_1

    .line 728
    :sswitch_3
    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 729
    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 730
    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 731
    const-string v0, "Track_Count_Sum"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 732
    goto :goto_1

    .line 738
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 741
    :goto_1
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x101 -> :sswitch_1
        0x102 -> :sswitch_0
        0x103 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->k:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

    return-object v0
.end method

.method private l()V
    .locals 5

    .line 1206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 1207
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUpdateUIHandler == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1208
    return-void

    .line 1210
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1213
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    return-object v0
.end method

.method private m()V
    .locals 6

    .line 1230
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1232
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1233
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 1234
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 1257
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$4;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1263
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 1264
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 1266
    return-void
.end method

.method private n()V
    .locals 7

    .line 1154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ffh;

    .line 1157
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    invoke-virtual {v4, v0}, Lo/ffh;->b(I)I

    move-result v5

    .line 1158
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after delete size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1159
    if-nez v5, :cond_0

    .line 1160
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after delete the size is null, need to delete this group"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 1164
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after delete all data gone, no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1165
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l()V

    .line 1166
    return-void

    .line 1170
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e:Lo/ffj;

    invoke-virtual {v0}, Lo/ffj;->notifyDataSetChanged()V

    .line 1174
    if-nez v5, :cond_2

    .line 1175
    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 1176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1177
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(I)V

    goto :goto_1

    .line 1179
    :cond_1
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(I)V

    .line 1175
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1184
    :cond_2
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 1076
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 1077
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWorkerHandler == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    return-void

    .line 1080
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->A:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$8;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    iput-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->A:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1090
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    return-object v0
.end method

.method private p()Z
    .locals 5

    .line 1187
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    if-gez v0, :cond_1

    .line 1188
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong delete position"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    const/4 v0, 0x0

    return v0

    .line 1191
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    if-gt v0, v1, :cond_3

    .line 1192
    :cond_2
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSportHistoryDataFromView() mAllTypeGroupData is empty or outIndexOf size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    .line 1193
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " groupP = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 1192
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    const/4 v0, 0x0

    return v0

    .line 1196
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->b()I

    move-result v4

    .line 1197
    if-eqz v4, :cond_4

    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    if-gt v4, v0, :cond_5

    .line 1198
    :cond_4
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSportHistoryDataFromView() childCount is empty or outIndexOf size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1199
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " childP = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 1198
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1200
    const/4 v0, 0x0

    return v0

    .line 1202
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->w:I

    return v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y:I

    return v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->g()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m()V

    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p()Z

    move-result v0

    return v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->v:Z

    return v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 6

    .line 295
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    .line 297
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->e(I)V

    .line 299
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(IJJ)V

    .line 300
    return-void
.end method

.method public c(JJ)V
    .locals 7

    .line 323
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 336
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSportData get simply "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->B:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    move-wide v2, p1

    move-wide v4, p3

    iget-object v6, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->n:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$g;

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;->c(IJJLcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V

    goto :goto_0

    .line 341
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSportData is null,stop refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 177
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_sport_history_list:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 180
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    .line 181
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b()V

    .line 182
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e()V

    .line 183
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Landroid/view/View;)V

    .line 184
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(I)V

    .line 185
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 261
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 263
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a()V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->D:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 271
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c:Landroid/widget/ExpandableListView;

    .line 274
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 239
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 241
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 245
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 246
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d()V

    .line 247
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    return-void
.end method
