.class public Lcom/huawei/bone/social/ui/RankingFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lo/ws;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/bone/social/ui/RankingFragment$e;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/ImageView;

.field private E:I

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:I

.field private I:I

.field private J:Landroid/view/View;

.field private K:Landroid/view/View$OnClickListener;

.field private L:Landroid/widget/LinearLayout;

.field private M:Landroid/widget/ImageView;

.field private N:Landroid/widget/TextView;

.field private R:Landroid/os/Handler;

.field private S:Landroid/os/Handler;

.field a:I

.field private b:Lo/ye;

.field private c:Landroid/content/Context;

.field private d:Landroid/support/v7/widget/RecyclerView;

.field private e:Landroid/content/Context;

.field private f:Lcom/huawei/bone/social/manager/db/SocialRankingTable;

.field private g:I

.field private h:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation
.end field

.field private j:Landroid/widget/TextView;

.field private k:I

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/view/View;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/ImageView;

.field private v:Lcom/squareup/picasso/Picasso;

.field private w:Ljava/util/concurrent/ExecutorService;

.field private x:Z

.field private y:Z

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 63
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->a:I

    .line 94
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->z:J

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->v:Lcom/squareup/picasso/Picasso;

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->y:Z

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->x:Z

    .line 207
    new-instance v0, Lcom/huawei/bone/social/ui/RankingFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/RankingFragment$5;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->K:Landroid/view/View$OnClickListener;

    .line 291
    new-instance v0, Lcom/huawei/bone/social/ui/RankingFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/RankingFragment$1;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->S:Landroid/os/Handler;

    .line 671
    new-instance v0, Lcom/huawei/bone/social/ui/RankingFragment$6;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/RankingFragment$6;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->R:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/RankingFragment;)Lcom/squareup/picasso/Picasso;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->v:Lcom/squareup/picasso/Picasso;

    return-object v0
.end method

.method private a(D)V
    .locals 9

    .line 756
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter BestDaySteps  total:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    double-to-long v4, p1

    .line 758
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->F:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    .line 759
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 760
    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v7

    .line 761
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_0

    .line 762
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter BestDaySteps error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 764
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->F:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 766
    :goto_0
    goto :goto_1

    .line 767
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->F:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 769
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/bone/social/ui/LauncherActivity;

    .line 770
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 771
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v8

    .line 772
    const/4 v0, 0x3

    iput v0, v8, Landroid/os/Message;->what:I

    .line 773
    invoke-virtual {v7, v8}, Lcom/huawei/bone/social/ui/LauncherActivity;->e(Landroid/os/Message;)V

    .line 775
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/RankingFragment;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/bone/social/ui/RankingFragment;->b(I)V

    return-void
.end method

.method private b(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 655
    const/4 v4, 0x0

    .line 656
    const/4 v5, 0x0

    .line 657
    const-string v6, ""

    .line 659
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 660
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 664
    goto :goto_0

    .line 661
    :catch_0
    move-exception v7

    .line 662
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    return-object v6

    .line 666
    :goto_0
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 667
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAppName() applicationName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    return-object v6
.end method

.method private b()V
    .locals 0

    .line 221
    return-void
.end method

.method private b(I)V
    .locals 7

    .line 736
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter BestDaySteps  steps:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 738
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 739
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v5

    .line 740
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_0

    .line 741
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter BestDaySteps error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 743
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->C:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 745
    :goto_0
    goto :goto_1

    .line 746
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->C:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 749
    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/bone/social/ui/RankingFragment;)Z
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->i()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->d()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/bone/social/ui/RankingFragment;I)I
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->k:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/bone/social/ui/RankingFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 224
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 225
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 226
    return-void
.end method

.method static synthetic e(Lcom/huawei/bone/social/ui/RankingFragment;I)I
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->g:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->b()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/bone/social/ui/RankingFragment;D)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/huawei/bone/social/ui/RankingFragment;->a(D)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/bone/social/ui/RankingFragment;)Lcom/huawei/bone/social/manager/db/SocialRankingTable;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->f:Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    return-object v0
.end method

.method private f()V
    .locals 9

    .line 444
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    return-void

    .line 447
    :cond_0
    move-object v4, p0

    monitor-enter v4

    .line 448
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testwang 111111111111 updateRanking ++++++++++++"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xr;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    .line 450
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 451
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSocialRankingTables ==  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 452
    monitor-exit v4

    return-void

    .line 455
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v5

    .line 456
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->o()Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->f:Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 457
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 458
    const/4 v0, 0x0

    iput v0, v6, Landroid/os/Message;->what:I

    .line 459
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 460
    const-string v0, "huid"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    invoke-virtual {v6, v7}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->S:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 463
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 464
    :goto_0
    return-void
.end method

.method private g()V
    .locals 4

    .line 435
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testwang updateRanking ++++++++++++"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 437
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    .line 439
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/bone/social/ui/RankingFragment$e;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/RankingFragment$e;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 440
    return-void
.end method

.method static synthetic g(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->k()V

    return-void
.end method

.method private h()V
    .locals 4

    .line 229
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v2

    .line 230
    iget-object v3, v2, Lo/xv;->n:Ljava/lang/String;

    .line 231
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    .line 232
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_no_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    return-void
.end method

.method static synthetic h(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->o()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/bone/social/ui/RankingFragment;)I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->g:I

    return v0
.end method

.method private i()Z
    .locals 3

    .line 498
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    const/4 v2, 0x1

    goto :goto_0

    .line 501
    :cond_0
    const/4 v2, 0x0

    .line 503
    :goto_0
    return v2
.end method

.method private k()V
    .locals 9

    .line 255
    const/4 v6, 0x0

    .line 256
    const/4 v7, 0x0

    .line 257
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 259
    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v1

    invoke-virtual {v1}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    add-int/lit8 v7, v8, 0x1

    .line 261
    goto :goto_1

    .line 257
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 265
    :cond_1
    :goto_1
    if-nez v6, :cond_2

    .line 266
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialRankingTable table = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    return-void

    .line 270
    :cond_2
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "myPosition="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->n:Landroid/widget/TextView;

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$plurals;->IDS_plugin_social_achieve_step:I

    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 278
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->s:Landroid/widget/TextView;

    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v0

    if-lez v0, :cond_3

    .line 283
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_selected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->s:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$color;->like_rank_count_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 286
    :cond_3
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 287
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->s:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$color;->black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    :goto_2
    return-void
.end method

.method static synthetic k(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->l()V

    return-void
.end method

.method private l()V
    .locals 7

    .line 544
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xu;->a(Landroid/content/Context;)Lo/xu;

    move-result-object v0

    invoke-virtual {v0}, Lo/xu;->e()Z

    move-result v4

    .line 545
    if-nez v4, :cond_0

    .line 546
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 547
    iget-wide v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->z:J

    sub-long v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 548
    iput-wide v5, p0, Lcom/huawei/bone/social/ui/RankingFragment;->z:J

    .line 549
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_login_no_network:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 550
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 553
    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->f()V

    return-void
.end method

.method private m()V
    .locals 9

    .line 607
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->profile_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->D:Landroid/widget/ImageView;

    .line 608
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_share_my_rank:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->G:Landroid/widget/TextView;

    .line 609
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_share_step_today:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->A:Landroid/widget/TextView;

    .line 610
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_share_tv_ranking_des:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->j:Landroid/widget/TextView;

    .line 611
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_share_day_best:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->C:Landroid/widget/TextView;

    .line 612
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_share_day_total:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->F:Landroid/widget/TextView;

    .line 613
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->rank_action_bar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->B:Landroid/widget/TextView;

    .line 614
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->share_watermark_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->L:Landroid/widget/LinearLayout;

    .line 615
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->share_watermark_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->M:Landroid/widget/ImageView;

    .line 616
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->share_watermark_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->N:Landroid/widget/TextView;

    .line 619
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_0

    .line 620
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->M:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$mipmap;->hw_show_app_logo:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 621
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->N:Landroid/widget/TextView;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_app_name_health:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 625
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->M:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->app_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 626
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->N:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 630
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 631
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v5, v0, 0x1

    .line 632
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 633
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_share_time:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 634
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->B:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 637
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->s()V

    .line 638
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v8

    .line 639
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 640
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onCreate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/xv;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->D:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/xp;->c(Landroid/content/Context;Landroid/widget/ImageView;)V

    .line 643
    :cond_1
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->r()V

    .line 644
    return-void
.end method

.method static synthetic n(Lcom/huawei/bone/social/ui/RankingFragment;)Landroid/os/Handler;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->S:Landroid/os/Handler;

    return-object v0
.end method

.method private n()Landroid/widget/Button;
    .locals 2

    .line 600
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->q:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/bone/social/R$id;->social_join_button:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/bone/social/ui/RankingFragment;)Landroid/os/Handler;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->R:Landroid/os/Handler;

    return-object v0
.end method

.method private o()V
    .locals 3

    .line 535
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 536
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 537
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/bone/social/ui/LauncherActivity;

    .line 538
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 539
    invoke-virtual {v2}, Lcom/huawei/bone/social/ui/LauncherActivity;->a()V

    .line 541
    :cond_0
    return-void
.end method

.method private p()V
    .locals 2

    .line 556
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->n()Landroid/widget/Button;

    move-result-object v1

    .line 557
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 558
    new-instance v0, Lcom/huawei/bone/social/ui/RankingFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/RankingFragment$2;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 592
    :cond_0
    return-void
.end method

.method private q()Landroid/graphics/Bitmap;
    .locals 7

    .line 782
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getScreenShot Enter ... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 785
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_share_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 788
    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v0

    .line 789
    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 788
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 790
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 791
    invoke-virtual {v4, v6}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    .line 792
    const/16 v0, 0x1f

    invoke-virtual {v6, v0}, Landroid/graphics/Canvas;->save(I)I

    .line 793
    invoke-virtual {v6}, Landroid/graphics/Canvas;->restore()V

    .line 795
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 796
    return-object v5
.end method

.method private r()V
    .locals 9

    .line 824
    const/4 v6, 0x0

    .line 825
    const/4 v7, 0x0

    .line 826
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 827
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    invoke-virtual {v0}, Lo/ye;->a()I

    move-result v6

    .line 829
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 830
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 832
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/xp;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->I:I

    .line 833
    iput v7, p0, Lcom/huawei/bone/social/ui/RankingFragment;->H:I

    .line 834
    iput v6, p0, Lcom/huawei/bone/social/ui/RankingFragment;->E:I

    .line 835
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->A:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->I:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 836
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$plurals;->IDS_plugin_social_share_rank_level:I

    iget v2, p0, Lcom/huawei/bone/social/ui/RankingFragment;->H:I

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/bone/social/ui/RankingFragment;->H:I

    add-int/lit8 v4, v4, -0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 837
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 838
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_share_rank_text1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/bone/social/ui/RankingFragment;->k:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 839
    return-void
.end method

.method private s()V
    .locals 6

    .line 703
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initAchieveData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    new-instance v1, Lcom/huawei/bone/social/ui/RankingFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/RankingFragment$7;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    iget-object v2, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/vu;->c(Lo/xk;Landroid/content/Context;)Lo/xh;

    move-result-object v4

    .line 719
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 720
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initAchieveData2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    return-void

    .line 723
    :cond_0
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 725
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 726
    const/4 v0, 0x0

    iput v0, v5, Landroid/os/Message;->what:I

    .line 727
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->R:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 728
    return-void
.end method

.method private t()Ljava/lang/String;
    .locals 5

    .line 804
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/xp;->a(Landroid/content/Context;)I

    move-result v4

    .line 805
    if-nez v4, :cond_0

    .line 806
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_str_friends_ranking_0step:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_0

    .line 807
    :cond_0
    iget v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->k:I

    iget v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->H:I

    if-ne v0, v1, :cond_1

    .line 808
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_str_friends_ranking_0percent:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 810
    :cond_1
    iget v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->E:I

    if-nez v0, :cond_2

    .line 811
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_str_friends_ranking_0percent:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 812
    :cond_2
    iget v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->E:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_3

    .line 813
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_str_friends_ranking_100percent:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 814
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 816
    :cond_3
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_str_share_ranking_text:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 817
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/bone/social/ui/RankingFragment;->E:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 820
    :goto_0
    return-object v3
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 403
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->e()V

    .line 404
    return-void
.end method

.method c(Ljava/util/ArrayList;J)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;J)I"
        }
    .end annotation

    .line 421
    const/4 v2, 0x0

    .line 422
    const/4 v3, 0x0

    .line 423
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 424
    add-int/lit8 v3, v3, 0x1

    .line 425
    invoke-virtual {v5}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    cmp-long v0, v0, p2

    if-nez v0, :cond_0

    .line 426
    move v2, v3

    .line 427
    goto :goto_1

    .line 429
    :cond_0
    goto :goto_0

    .line 430
    :cond_1
    :goto_1
    return v2
.end method

.method public c()V
    .locals 2

    .line 518
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 519
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 520
    return-void
.end method

.method public c(Ljava/util/ArrayList;Lcom/huawei/bone/social/manager/db/SocialRankingTable;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;Lcom/huawei/bone/social/manager/db/SocialRankingTable;I)V"
        }
    .end annotation

    .line 383
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 384
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "PSocial_RankFragment"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "isAttach is false"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    return-void

    .line 388
    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 389
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 392
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    .line 393
    new-instance v0, Lo/ye;

    iget v5, p0, Lcom/huawei/bone/social/ui/RankingFragment;->k:I

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lo/ye;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;Ljava/util/ArrayList;Lcom/huawei/bone/social/manager/db/SocialRankingTable;II)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    .line 394
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 397
    return-void
.end method

.method public c(Lo/wv$c;)V
    .locals 4

    .line 508
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdateState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->g()V

    .line 512
    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 528
    iput-boolean p1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->x:Z

    .line 529
    return-void
.end method

.method public e()V
    .locals 6

    .line 845
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start share"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->r()V

    .line 847
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->q()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 848
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 849
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getScreenShot empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    return-void

    .line 852
    :cond_0
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->t()Ljava/lang/String;

    move-result-object v5

    .line 853
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->c:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/vu;->e(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 854
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 239
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 240
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testwang onActivityResult !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->p:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/xp;->c(Landroid/content/Context;Landroid/widget/ImageView;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    invoke-virtual {v0}, Lo/ye;->notifyDataSetChanged()V

    .line 245
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 409
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 134
    const-string v0, "PSocial_RankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->c:Landroid/content/Context;

    .line 136
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->e:Landroid/content/Context;

    .line 137
    sget v0, Lcom/huawei/bone/social/R$layout;->ranking_tab:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    .line 138
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->K:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->rank_tab:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->o:Landroid/widget/RelativeLayout;

    .line 140
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->social_no_show_data:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->q:Landroid/widget/RelativeLayout;

    .line 141
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->p()V

    .line 142
    iget-boolean v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->x:Z

    if-nez v0, :cond_0

    .line 143
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->c()V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->swipe_refresh_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 146
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->recyclerView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    .line 147
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 149
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->v:Lcom/squareup/picasso/Picasso;

    .line 151
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/bone/social/ui/RankingFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/RankingFragment$3;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorScheme([I)V

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->i:Ljava/util/ArrayList;

    .line 178
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 180
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->profile_ranking_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->p:Landroid/widget/ImageView;

    .line 181
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->ranking_no:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->n:Landroid/widget/TextView;

    .line 182
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->step_count:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->l:Landroid/widget/TextView;

    .line 183
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->like_count:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->s:Landroid/widget/TextView;

    .line 184
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->ranking_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->t:Landroid/widget/TextView;

    .line 185
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->like_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->u:Landroid/widget/ImageView;

    .line 186
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->ranking_normal_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->r:Landroid/view/View;

    .line 187
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    sget v1, Lcom/huawei/bone/social/R$id;->rank_personal_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->m:Landroid/widget/RelativeLayout;

    .line 189
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->u:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/bone/social/ui/RankingFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/RankingFragment$4;-><init>(Lcom/huawei/bone/social/ui/RankingFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 196
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->h()V

    .line 197
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    .line 198
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->g()V

    .line 199
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->p:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/xp;->c(Landroid/content/Context;Landroid/widget/ImageView;)V

    .line 200
    invoke-static {}, Lo/wv;->b()Lo/wv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/wv;->c(Lo/ws;)V

    .line 203
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->m()V

    .line 204
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->J:Landroid/view/View;

    return-object v0

    :array_0
    .array-data 4
        0x106001b
        0x1060014
        0x1060018
        0x1060016
    .end array-data
.end method

.method public onDestroy()V
    .locals 3

    .line 353
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->w:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 356
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 358
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 359
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 362
    :cond_1
    invoke-direct {p0}, Lcom/huawei/bone/social/ui/RankingFragment;->n()Landroid/widget/Button;

    move-result-object v2

    .line 363
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 364
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    :cond_2
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 368
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->clearOnScrollListeners()V

    .line 370
    :cond_3
    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 344
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 345
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->v:Lcom/squareup/picasso/Picasso;

    const-string v1, "LOAD"

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->cancelTag(Ljava/lang/Object;)V

    .line 346
    invoke-static {}, Lo/wv;->b()Lo/wv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/wv;->e(Lo/ws;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->S:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 348
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->b:Lo/ye;

    .line 349
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 336
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 337
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 338
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->a:I

    .line 340
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 329
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    iget v1, p0, Lcom/huawei/bone/social/ui/RankingFragment;->a:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->scrollToPosition(I)V

    .line 330
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/ui/RankingFragment;->a:I

    .line 331
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 332
    return-void
.end method
