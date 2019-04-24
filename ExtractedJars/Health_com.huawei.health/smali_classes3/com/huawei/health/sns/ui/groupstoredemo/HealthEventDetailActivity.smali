.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;,
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$d;
    }
.end annotation


# instance fields
.field private a:Landroid/support/v4/view/ViewPager;

.field private b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

.field private c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private e:Lo/emr;

.field private f:Landroid/app/Activity;

.field private g:Lo/emq;

.field private h:Ljava/lang/String;

.field private i:Lcom/huawei/health/sns/model/group/Group;

.field private k:[Ljava/lang/String;

.field private l:Lo/bhg;

.field private m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private n:Lo/egd;

.field private o:J

.field private p:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

.field private q:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;

.field private s:Lo/egn;

.field private t:I

.field private u:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 96
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->o:J

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    .line 212
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$d;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->u:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 8

    .line 459
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 460
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initFragment(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->finish()V

    .line 462
    return-void

    .line 464
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->d:Ljava/util/List;

    .line 465
    new-instance v0, Lo/bhg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->g:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/bhg;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->l:Lo/bhg;

    .line 467
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    .line 468
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    .line 470
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 471
    const-string v0, "activityId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->g:Lo/emq;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v6

    .line 475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->l:Lo/bhg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    const/4 v2, 0x1

    invoke-virtual {v0, v6, v1, v2}, Lo/bhg;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 476
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->g:Lo/emq;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rank:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v7

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->l:Lo/bhg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v2}, Lo/bhg;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 479
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 481
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->setArguments(Landroid/os/Bundle;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 484
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rank:I

    .line 485
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->k:[Ljava/lang/String;

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lo/bhf;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->k:[Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lo/bhf;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 490
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 6

    .line 801
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 802
    if-eqz v4, :cond_1

    .line 803
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 804
    if-eqz v5, :cond_1

    .line 805
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 808
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group.getGroupType() == Group.TYPE_FAMILY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 810
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 814
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 842
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c(Landroid/os/Message;)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .line 618
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 619
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applyJoinEvent(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    return-void

    .line 622
    :cond_0
    if-nez p1, :cond_1

    .line 623
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b(Ljava/lang/String;)V

    .line 625
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;Z)V

    invoke-static {v0, v1, v2}, Lo/anz;->e(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V

    .line 654
    return-void
.end method

.method private b()V
    .locals 2

    .line 323
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->e:Lo/emr;

    .line 324
    sget v0, Lcom/huawei/android/sns/R$id;->event_vp:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a:Landroid/support/v4/view/ViewPager;

    .line 325
    sget v0, Lcom/huawei/android/sns/R$id;->event_tablayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->g:Lo/emq;

    .line 326
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a()V

    .line 328
    sget v0, Lcom/huawei/android/sns/R$id;->ll_join_event:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout;

    .line 329
    sget v0, Lcom/huawei/android/sns/R$id;->btn_join_event:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->n:Lo/egd;

    .line 330
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 331
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->o()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 725
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 726
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    .line 727
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 728
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 729
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 731
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 732
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 740
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 308
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 309
    if-eqz v4, :cond_1

    .line 310
    const-string v0, "group"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "activityId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    const-string v0, "group"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    .line 312
    const-string v0, "activityId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    .line 313
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====initData(), activityId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_1

    .line 316
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->finish()V

    .line 320
    :cond_1
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 6

    .line 821
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 822
    if-eqz v4, :cond_0

    .line 823
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 824
    if-eqz v5, :cond_0

    .line 825
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGroupInfo group = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 829
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 443
    const/4 v4, 0x0

    .line 444
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 445
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 447
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 448
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 449
    const/4 v4, 0x1

    .line 453
    :cond_0
    goto :goto_0

    .line 451
    :catch_0
    move-exception v6

    .line 452
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataCompare:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    :goto_0
    const-string v0, "dataCompare==="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    return v4
.end method

.method private d()V
    .locals 5

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->p:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    if-eqz v0, :cond_1

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->p:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v4

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 385
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->e()V

    goto :goto_0

    .line 388
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i()V

    .line 390
    :goto_0
    goto :goto_1

    .line 391
    :cond_1
    const-string v0, "HealthEventDetailActivity====else ---groupActivity:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mGetGroupActivity = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->p:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->k()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    return-object v0
.end method

.method private e()V
    .locals 9

    .line 399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    if-eqz v0, :cond_1

    .line 400
    const/16 v7, 0x102

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 404
    :sswitch_0
    const/16 v7, 0x101

    .line 405
    goto :goto_0

    .line 408
    :sswitch_1
    const/16 v7, 0x102

    .line 409
    goto :goto_0

    .line 412
    :sswitch_2
    const/16 v7, 0x103

    .line 413
    goto :goto_0

    .line 415
    :sswitch_3
    const/16 v7, 0x2711

    .line 416
    .line 420
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    const/16 v1, 0xcc

    if-ne v0, v1, :cond_0

    .line 421
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 422
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-virtual {v0, v8}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 424
    goto :goto_1

    .line 425
    :cond_0
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 426
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, v7

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 427
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v3

    double-to-float v4, v3

    iget-object v6, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    .line 426
    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cbl;->c(IIIFLo/ceu;Landroid/content/Context;)I

    .line 428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c(Z)V

    .line 433
    :cond_1
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_0
        0xca -> :sswitch_1
        0xcb -> :sswitch_2
        0xcc -> :sswitch_3
    .end sparse-switch
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 850
    if-eqz p1, :cond_0

    .line 851
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    .line 852
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 854
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 856
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->n()V

    .line 858
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->m()V

    .line 859
    return-void
.end method

.method private f()V
    .locals 8

    .line 561
    new-instance v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;-><init>()V

    .line 562
    const-string v0, "1000"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityId(Ljava/lang/String;)V

    .line 563
    const-string v0, "\u5feb\u4e50\u6d41\u6c57\uff0c\u8f7b\u677e\u8dd1\u6b65\uff01"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityName(Ljava/lang/String;)V

    .line 564
    const/16 v0, 0x66

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityType(I)V

    .line 565
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setGoalValue(D)V

    .line 566
    const-string v0, "\u7231\u8dd1\u6b65\uff0c\u7231\u5065\u5eb7\uff01"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setDetails(Ljava/lang/String;)V

    .line 567
    const-string v0, "file:///android_asset/healthgroup/pic_activity_Challenge.png"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setImgUrl(Ljava/lang/String;)V

    .line 568
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setBeginTime(Ljava/lang/String;)V

    .line 569
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setEndTime(Ljava/lang/String;)V

    .line 570
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setLastTime(Ljava/lang/String;)V

    .line 571
    const/16 v0, 0xf

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setNumberOfPeople(I)V

    .line 572
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityStatus(I)V

    .line 573
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setStatus(I)V

    .line 575
    new-instance v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-direct {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;-><init>()V

    .line 576
    const-string v0, "1001"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityId(Ljava/lang/String;)V

    .line 577
    const-string v0, "\u4e50\u8dd1e\u65cf"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityName(Ljava/lang/String;)V

    .line 578
    const/16 v0, 0xca

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityType(I)V

    .line 579
    const-wide/16 v0, 0x0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setGoalValue(D)V

    .line 580
    const-string v0, "\u8dd1\u51fa\u5065\u5eb7\uff0c\u8dd1\u51fa\u5feb\u4e50\uff01"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setDetails(Ljava/lang/String;)V

    .line 581
    const-string v0, "file:///android_asset/healthgroup/pic_activity_Cumulative.png"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setImgUrl(Ljava/lang/String;)V

    .line 582
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setBeginTime(Ljava/lang/String;)V

    .line 583
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setEndTime(Ljava/lang/String;)V

    .line 584
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setLastTime(Ljava/lang/String;)V

    .line 585
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setNumberOfPeople(I)V

    .line 586
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setActivityStatus(I)V

    .line 587
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->setStatus(I)V

    .line 589
    new-instance v6, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-direct {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;-><init>()V

    .line 590
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "10000000000000008"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 591
    invoke-virtual {v6, v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->setHuidList([Ljava/lang/String;)V

    .line 592
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 593
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    const-string v1, "1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 594
    invoke-virtual {v6, v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->setGroupActivity(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;)V

    goto :goto_0

    .line 595
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    const-string v1, "1001"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 596
    invoke-virtual {v6, v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->setGroupActivity(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;)V

    goto :goto_0

    .line 598
    :cond_1
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " activityId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 601
    :cond_2
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activityId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    :goto_0
    const-string v0, "2018-12-06 10:19:44"

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->setCurrentTime(Ljava/lang/String;)V

    .line 606
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_3

    .line 607
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v6, v1, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V

    .line 611
    :cond_3
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h()V

    return-void
.end method

.method private g()V
    .locals 0

    .line 747
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->p()V

    .line 752
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->e()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 713
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 714
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->s:Lo/egn;

    .line 719
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->u:Landroid/os/Handler;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 506
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activit_no_start:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_start_workout:I

    .line 508
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$3;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 514
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 520
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 521
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 522
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 523
    return-void
.end method

.method private k()V
    .locals 5

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 531
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCloudData(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    return-void

    .line 534
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 535
    const/16 v0, 0x3e9

    iput v0, v4, Landroid/os/Message;->what:I

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->u:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 554
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521b\u5efa\u7fa4\u6d3b\u52a8\u6210\u529f\uff0c\u8c03\u7528\u7fa4\u6d3b\u52a8\u8be6\u60c5\u63a5\u53e3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    return-void
.end method

.method private l()V
    .locals 3

    .line 777
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->q:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;

    .line 778
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 779
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 780
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->q:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 781
    return-void
.end method

.method private m()V
    .locals 4

    .line 900
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 901
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->u:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    goto :goto_0

    .line 903
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGroupMember(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    :goto_0
    return-void
.end method

.method private n()V
    .locals 3

    .line 865
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->u:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x343

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 866
    return-void
.end method

.method private o()V
    .locals 2

    .line 911
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 912
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 913
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 914
    return-void
.end method

.method private p()V
    .locals 8

    .line 876
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 878
    new-instance v5, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 879
    const-wide v0, 0x2ea6031e2f5acadL

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 880
    const-wide v0, 0x5d471fdcb787a3dL

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 881
    const-string v0, "1543916597000"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 882
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 883
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setManager(Z)V

    .line 884
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 887
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u5458\u4e2a\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 888
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 889
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u5458\u4fe1\u606f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 890
    goto :goto_0

    .line 892
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->c(Ljava/util/ArrayList;)V

    .line 893
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e(Ljava/util/ArrayList;)V

    .line 894
    return-void
.end method


# virtual methods
.method public b(IDILjava/lang/String;)V
    .locals 6

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    if-eqz v0, :cond_0

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    move v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->d(IDILjava/lang/String;)V

    .line 499
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->n:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 356
    const-string v0, "HealthEventDetailActivity onclick = "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->t:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 358
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a(Z)V

    .line 360
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 361
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/boa;->c(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;I)V

    goto :goto_0

    .line 363
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->t:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 364
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 365
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->o:J

    .line 366
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->d()V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/boa;->c(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;I)V

    .line 374
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 278
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 279
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_event_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->setContentView(I)V

    .line 280
    iput-object p0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    .line 289
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c()V

    .line 290
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->k()V

    .line 291
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b()V

    .line 292
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->g()V

    .line 294
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->l()V

    .line 295
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 304
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->q:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 306
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 299
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 300
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->k()V

    .line 301
    return-void
.end method
