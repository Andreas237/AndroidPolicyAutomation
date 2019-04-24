.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Lo/buu$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;
    }
.end annotation


# instance fields
.field private d:Lo/emq;

.field private f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

.field private i:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 1

    .line 70
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 79
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->l()V

    return-void
.end method

.method private l()V
    .locals 9

    .line 108
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v8, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$2;

    invoke-direct {v8, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-interface/range {v0 .. v8}, Lo/bsp;->e(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    .line 125
    return-void
.end method

.method private m()V
    .locals 5

    .line 90
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const/4 v4, 0x2

    invoke-interface {v0, v2, v3, v4, v1}, Lo/bsp;->b(IIILo/bui;)V

    .line 106
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .line 82
    if-nez p1, :cond_0

    .line 83
    const-string v0, "2"

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/bzm;->e(Ljava/lang/String;I)V

    goto :goto_0

    .line 85
    :cond_0
    const-string v0, "2"

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lo/bzm;->e(Ljava/lang/String;I)V

    .line 87
    :goto_0
    return-void
.end method

.method public g()V
    .locals 6

    .line 50
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_fit_me_exercise:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->setContentView(I)V

    .line 52
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_detail_tab:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->d:Lo/emq;

    .line 53
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_detail_vp:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->i:Landroid/support/v4/view/ViewPager;

    .line 56
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->i:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 58
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->i:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 59
    new-instance v3, Lo/buu;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->i:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->d:Lo/emq;

    invoke-direct {v3, p0, v0, v1}, Lo/buu;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    .line 60
    invoke-virtual {v3, p0}, Lo/buu;->e(Lo/buu$b;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->d:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->d:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v5

    .line 63
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v3, v4, v0, v1, v2}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v5, v0, v1, v2}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->m()V

    .line 67
    return-void
.end method

.method public i()V
    .locals 4

    .line 139
    const-string v0, "FitnessMeExerciseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    return-void
.end method

.method public k()V
    .locals 4

    .line 134
    const-string v0, "FitnessMeExerciseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void
.end method

.method public onBackPressed()V
    .locals 7

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->i:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/buu;

    .line 145
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->i:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/buu;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    .line 147
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->b()Z

    move-result v6

    .line 148
    if-eqz v6, :cond_0

    .line 149
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onBackPressed()V

    .line 151
    :cond_0
    goto :goto_0

    .line 152
    :cond_1
    const-string v0, "FitnessMeExerciseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onBackPressed()V

    .line 155
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 43
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 45
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    return-void
.end method
