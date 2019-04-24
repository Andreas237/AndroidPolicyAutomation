.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private c:Lo/enb;

.field private d:Lo/emr;

.field private e:Landroid/content/Context;

.field private f:Lcom/huawei/up/model/UserInfomation;

.field private g:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;

.field private h:Lo/emq;

.field private i:Lo/emm;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->b:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 94
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_detail_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->d:Lo/emr;

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->d:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->d:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_toolbar_help:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->d:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->f:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method private c()V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a()V

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->d()V

    .line 62
    return-void
.end method

.method private d()V
    .locals 8

    .line 65
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_subTabLayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->h:Lo/emq;

    .line 66
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_detail_viewpager:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/enb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c:Lo/enb;

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c:Lo/enb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 68
    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c:Lo/enb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c:Lo/enb;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lo/enb;->setScrollHeightArea(I)V

    .line 72
    new-instance v0, Lo/emm;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c:Lo/enb;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->h:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/emm;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->i:Lo/emm;

    .line 74
    invoke-static {}, Lo/feg;->e()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->f:Lcom/huawei/up/model/UserInfomation;

    .line 75
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 76
    const-string v0, "vo2max_age"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->f:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 77
    const-string v0, "vo2max_gender"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->f:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 78
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 79
    if-eqz v5, :cond_1

    const-string v0, "vo2max_value"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    const-string v0, "vo2max_value"

    const-string v1, "vo2max_value"

    const/4 v2, 0x0

    invoke-virtual {v5, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 81
    const-string v0, "vo2max_time"

    const-string v1, "vo2max_time"

    const-wide/16 v2, 0x0

    invoke-virtual {v5, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 83
    :cond_1
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 85
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->g:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->g:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->h:Lo/emq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_month:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v6

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->i:Lo/emm;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;

    const/4 v2, 0x1

    invoke-virtual {v0, v6, v1, v2}, Lo/emm;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->h:Lo/emq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_year:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v7

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->i:Lo/emm;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->g:Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v2}, Lo/emm;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 91
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 53
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_vo2max:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->setContentView(I)V

    .line 55
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->e:Landroid/content/Context;

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c()V

    .line 57
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 112
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 113
    return-void
.end method
