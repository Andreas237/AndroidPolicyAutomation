.class public Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;,
        Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$d;
    }
.end annotation


# instance fields
.field private a:Lo/elp;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

.field private d:Landroid/support/v4/view/ViewPager;

.field private e:Lo/emr;

.field private f:Landroid/app/Activity;

.field private g:Lo/emq;

.field private h:[Ljava/lang/String;

.field private i:Lcom/huawei/health/sns/model/group/Group;

.field private k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

.field private l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Lo/egd;

.field private q:J

.field private r:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;

.field private s:Lo/bhg;

.field private t:Lo/bgn;

.field private u:Lo/egn;

.field private v:I

.field private x:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 95
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->q:J

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    .line 211
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$d;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 8

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 552
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initFragment(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->finish()V

    .line 554
    return-void

    .line 556
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b:Ljava/util/List;

    .line 557
    new-instance v0, Lo/bhg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/bhg;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->s:Lo/bhg;

    .line 559
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    .line 560
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    .line 562
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 563
    const-string v0, "activityId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g:Lo/emq;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v6

    .line 567
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->s:Lo/bhg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    const/4 v2, 0x1

    invoke-virtual {v0, v6, v1, v2}, Lo/bhg;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g:Lo/emq;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rank:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v7

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->s:Lo/bhg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v2}, Lo/bhg;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->setArguments(Landroid/os/Bundle;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rank:I

    .line 577
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h:[Ljava/lang/String;

    .line 579
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lo/bhf;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b:Ljava/util/List;

    iget-object v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h:[Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lo/bhf;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 581
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 582
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 6

    .line 1036
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 1037
    if-eqz v4, :cond_1

    .line 1038
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 1039
    if-eqz v5, :cond_1

    .line 1040
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1043
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group.getGroupType() == Group.TYPE_FAMILY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1045
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 1049
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 1085
    if-eqz p1, :cond_0

    .line 1086
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    .line 1087
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

    .line 1089
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->q()V

    .line 1093
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->t()V

    .line 1094
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/view/View;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Landroid/view/View;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 375
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    if-eqz v0, :cond_1

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v4

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c()V

    goto :goto_0

    .line 382
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k()V

    .line 384
    :goto_0
    goto :goto_1

    .line 385
    :cond_1
    const-string v0, "HealthEventDetailActivity====else ---groupActivity:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mGetGroupActivity = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    :goto_1
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 6

    .line 987
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 988
    if-eqz v4, :cond_2

    .line 989
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 990
    if-eqz v5, :cond_1

    .line 991
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 992
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo group type is family."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 995
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 997
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u()V

    goto :goto_0

    .line 1001
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m()V

    .line 1004
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c()V
    .locals 9

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    if-eqz v0, :cond_1

    .line 394
    const/16 v7, 0x102

    .line 395
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 398
    :sswitch_0
    const/16 v7, 0x101

    .line 399
    goto :goto_0

    .line 402
    :sswitch_1
    const/16 v7, 0x102

    .line 403
    goto :goto_0

    .line 406
    :sswitch_2
    const/16 v7, 0x103

    .line 407
    goto :goto_0

    .line 409
    :sswitch_3
    const/16 v7, 0x2711

    .line 410
    .line 414
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    const/16 v1, 0xcc

    if-ne v0, v1, :cond_0

    .line 415
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 416
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-virtual {v0, v8}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 418
    goto :goto_1

    .line 419
    :cond_0
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 420
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, v7

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 421
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v3

    double-to-float v4, v3

    iget-object v6, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    .line 420
    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cbl;->c(IIIFLo/ceu;Landroid/content/Context;)I

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b(Z)V

    .line 427
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

.method private c(Landroid/view/View;)V
    .locals 8

    .line 494
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_delete_event:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 495
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a:Lo/elp;

    .line 497
    sget v0, Lcom/huawei/android/sns/R$id;->line_delete:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 498
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$6;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v5

    .line 508
    sget v0, Lcom/huawei/android/sns/R$id;->line_help:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 509
    if-eqz v5, :cond_0

    .line 510
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 518
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 521
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->line_modify:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 522
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a:Lo/elp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/elp;->c(Landroid/view/View;I)V

    .line 548
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->s()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;)V

    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 815
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 816
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applyJoinEvent(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 817
    return-void

    .line 819
    :cond_0
    if-nez p1, :cond_1

    .line 820
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Ljava/lang/String;)V

    .line 822
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Z)V

    invoke-static {v0, v1, v2}, Lo/anz;->e(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V

    .line 851
    return-void
.end method

.method private d()V
    .locals 1

    .line 319
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    .line 320
    sget v0, Lcom/huawei/android/sns/R$id;->event_vp:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d:Landroid/support/v4/view/ViewPager;

    .line 321
    sget v0, Lcom/huawei/android/sns/R$id;->event_tablayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g:Lo/emq;

    .line 322
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a()V

    .line 324
    sget v0, Lcom/huawei/android/sns/R$id;->btn_join_event:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    .line 325
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 956
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 957
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    goto :goto_0

    .line 959
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalGroupInfo(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    :goto_0
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 6

    .line 1056
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 1057
    if-eqz v4, :cond_0

    .line 1058
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 1059
    if-eqz v5, :cond_0

    .line 1060
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

    .line 1061
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 1064
    :cond_0
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 8

    .line 457
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_quit_event:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 458
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a:Lo/elp;

    .line 460
    sget v0, Lcom/huawei/android/sns/R$id;->line_quit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 461
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v5

    .line 470
    sget v0, Lcom/huawei/android/sns/R$id;->line_help:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 471
    sget v0, Lcom/huawei/android/sns/R$id;->line_help_line:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 472
    if-eqz v5, :cond_0

    .line 473
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$9;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 481
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 482
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 485
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n:I

    invoke-virtual {p0, v0, v4, v6, v7}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b(ILandroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a:Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 487
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h()V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;)V
    .locals 4

    .line 758
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 759
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V

    .line 763
    :cond_0
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    .line 764
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getGroupActivity()Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 765
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityStatus()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n:I

    .line 766
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(I)V

    .line 767
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 769
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Z)V

    .line 772
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f()V

    .line 773
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 305
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 306
    if-eqz v4, :cond_1

    .line 307
    const-string v0, "group"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "activityId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    const-string v0, "group"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    .line 309
    const-string v0, "activityId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_1

    .line 312
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->finish()V

    .line 316
    :cond_1
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 781
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v4

    .line 782
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 786
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 787
    return-void

    .line 790
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 791
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_more_normal_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonBackBackground(Landroid/graphics/drawable/Drawable;)V

    .line 792
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 808
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 8

    .line 1109
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 1111
    const/4 v5, 0x0

    .line 1112
    if-eqz v4, :cond_1

    .line 1113
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 1115
    if-eqz v5, :cond_1

    .line 1116
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u5458\u4e2a\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1117
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1118
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

    .line 1119
    goto :goto_0

    .line 1121
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b(Ljava/util/ArrayList;)V

    .line 1122
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e(Ljava/util/ArrayList;)V

    .line 1125
    :cond_1
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 1072
    new-instance v0, Lo/bgg;

    invoke-direct {v0}, Lo/bgg;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1, p1}, Lo/bgg;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/group/Group;)V

    .line 1077
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/view/View;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Landroid/view/View;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 925
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    .line 926
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 928
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 930
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 931
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 939
    :cond_1
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 437
    const/4 v4, 0x0

    .line 438
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 439
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 441
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 442
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 443
    const/4 v4, 0x1

    .line 447
    :cond_0
    goto :goto_0

    .line 445
    :catch_0
    move-exception v6

    .line 446
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

    .line 448
    :goto_0
    const-string v0, "dataCompare==="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    return v4
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lo/elp;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a:Lo/elp;

    return-object v0
.end method

.method private f()V
    .locals 3

    .line 858
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    if-eqz v0, :cond_5

    .line 859
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v2

    .line 860
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getStatus()I

    move-result v0

    if-nez v0, :cond_0

    .line 862
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 863
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    goto/16 :goto_0

    .line 864
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 866
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_activity_end:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 867
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 868
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 869
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 870
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    goto/16 :goto_0

    .line 871
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityStatus()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 872
    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 874
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_activity_goto_exercise:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 875
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 876
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 877
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 878
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 879
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    .line 880
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    const/16 v1, 0xcd

    if-ne v0, v1, :cond_5

    .line 881
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 885
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityStatus()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    .line 887
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getLastTime()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 889
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_activity_time_abort:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 890
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 891
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 892
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 893
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    goto :goto_0

    .line 896
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_join_event:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 897
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 898
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 899
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 900
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 901
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    .line 905
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->m:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 688
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 689
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_quit_activity_or_not:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_quit_activities:I

    .line 690
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 714
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 720
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 721
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 722
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 723
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 730
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 731
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCloudData(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    return-void

    .line 734
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-static {v0, v1, v2}, Lo/anz;->c(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V

    .line 750
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521b\u5efa\u7fa4\u6d3b\u52a8\u6210\u529f\uff0c\u8c03\u7528\u7fa4\u6d3b\u52a8\u8be6\u60c5\u63a5\u53e3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 751
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 646
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 647
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_delete_event_tips:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_delete_event:I

    .line 648
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 673
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$15;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 679
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 680
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 681
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 682
    return-void
.end method

.method private k()V
    .locals 5

    .line 622
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 623
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activit_no_start:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_start_workout:I

    .line 624
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$14;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 630
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$11;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 636
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 637
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 638
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 639
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    return-object v0
.end method

.method private l()V
    .locals 3

    .line 975
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->r:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;

    .line 976
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 977
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 978
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->r:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 979
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    return-object v0
.end method

.method private m()V
    .locals 5

    .line 1010
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 1011
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    const/16 v3, 0x349

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    goto :goto_0

    .line 1013
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGroupInfo(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1015
    :goto_0
    return-void
.end method

.method private n()V
    .locals 1

    .line 947
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(I)V

    .line 949
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p()V

    .line 950
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o()V

    return-void
.end method

.method private o()V
    .locals 2

    .line 911
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 912
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 913
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->u:Lo/egn;

    .line 918
    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 967
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->t:Lo/bgn;

    .line 968
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->t:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 970
    return-void
.end method

.method private q()V
    .locals 3

    .line 1100
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x343

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 1101
    return-void
.end method

.method private s()V
    .locals 2

    .line 1142
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1143
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1144
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 1145
    return-void
.end method

.method private t()V
    .locals 4

    .line 1131
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 1132
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    goto :goto_0

    .line 1134
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGroupMember(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    :goto_0
    return-void
.end method

.method private u()V
    .locals 5

    .line 1022
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 1023
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    const/16 v3, 0x351

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    goto :goto_0

    .line 1025
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGroupInfoForUpdate(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    :goto_0
    return-void
.end method


# virtual methods
.method public b(IDILjava/lang/String;)V
    .locals 6

    .line 588
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    if-eqz v0, :cond_0

    .line 589
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    move v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(IDILjava/lang/String;)V

    .line 591
    :cond_0
    return-void
.end method

.method public b(ILandroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 5

    .line 595
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setQuitEventPopItem,status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 596
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 597
    if-eqz p2, :cond_2

    .line 598
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 599
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_single_item_bg_selector:I

    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 600
    if-eqz p4, :cond_2

    .line 601
    const/16 v0, 0x8

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 604
    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 605
    :cond_1
    if-eqz p2, :cond_2

    .line 606
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setQuitEventPopItem:\u663e\u793a\u9000\u51fa\u6d3b\u52a8\u6309\u94ae"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 608
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_bg_selector:I

    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 609
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v4

    .line 610
    if-eqz p4, :cond_2

    if-eqz v4, :cond_2

    .line 611
    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 615
    :cond_2
    :goto_0
    return-void
.end method

.method public d(Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V
    .locals 4

    .line 1148
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showShareButton()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupUserRank\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1150
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyVisibility(I)V

    .line 1151
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1152
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1169
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 349
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 350
    const-string v0, "HealthEventDetailActivity onclick = "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 352
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Z)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/boa;->c(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;I)V

    goto :goto_0

    .line 357
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->v:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 358
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->q:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 359
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->q:J

    .line 360
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b()V

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 363
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->o:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/boa;->c(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;I)V

    .line 368
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 277
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 278
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_event_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->setContentView(I)V

    .line 279
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 283
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 284
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->finish()V

    .line 285
    return-void

    .line 287
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e()V

    .line 288
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d()V

    .line 289
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n()V

    .line 290
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h()V

    .line 291
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l()V

    .line 292
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 301
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->r:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$a;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 303
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 296
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 297
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h()V

    .line 298
    return-void
.end method
