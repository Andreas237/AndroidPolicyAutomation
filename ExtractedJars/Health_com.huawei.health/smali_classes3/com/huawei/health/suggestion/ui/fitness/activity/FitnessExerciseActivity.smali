.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Lo/buu$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;
    }
.end annotation


# instance fields
.field private d:Lo/emq;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;>;"
        }
    .end annotation
.end field

.field private g:Landroid/support/v4/view/ViewPager;

.field private k:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;)[Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->k:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->n()V

    return-void
.end method

.method private l()V
    .locals 8

    .line 49
    const-string v0, "FitnessExerciseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBIEvent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 51
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 52
    const-string v0, "Workout"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 53
    if-eqz v5, :cond_0

    const-string v0, "shortcut_Workout"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const-string v0, "FitnessExerciseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBIEvent shortcut_Workout..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 56
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Lo/dae;->hr:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 59
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v7, v6, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 62
    :cond_0
    return-void
.end method

.method private n()V
    .locals 7

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->g:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->k:[Ljava/lang/String;

    array-length v1, v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 116
    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {v3, p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;Landroid/support/v4/app/FragmentManager;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->g:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 119
    new-instance v4, Lo/buu;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->g:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->d:Lo/emq;

    invoke-direct {v4, p0, v0, v1}, Lo/buu;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    .line 120
    invoke-virtual {v4, p0}, Lo/buu;->e(Lo/buu$b;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->d:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->k:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v5

    .line 122
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->d:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->k:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v6

    .line 123
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v4, v5, v0, v1, v2}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 124
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v6, v0, v1, v2}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 126
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 131
    return-void
.end method

.method public d()I
    .locals 1

    .line 75
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 1

    .line 80
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->e()Lo/bvp;

    .line 81
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_reco:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->setContentView(I)V

    .line 82
    return-void
.end method

.method public h()I
    .locals 1

    .line 70
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 6

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->f:Ljava/util/ArrayList;

    .line 96
    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;-><init>()V

    .line 97
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 98
    const-string v0, "type"

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 99
    invoke-virtual {v2, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->setArguments(Landroid/os/Bundle;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    new-instance v4, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;-><init>()V

    .line 102
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 103
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 104
    invoke-virtual {v4, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->setArguments(Landroid/os/Bundle;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 112
    return-void
.end method

.method public k()V
    .locals 3

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_reco_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->g:Landroid/support/v4/view/ViewPager;

    .line 87
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_pst:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->d:Lo/emq;

    .line 88
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_reco_reco:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_reco_trained:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->k:[Ljava/lang/String;

    .line 91
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->f:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onBackPressed()V

    .line 167
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 43
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->l()V

    .line 45
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 46
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 171
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onDestroy()V

    .line 172
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->e()Lo/bvp;

    .line 173
    return-void
.end method

.method public toAllRecom(Landroid/view/View;)V
    .locals 2

    .line 65
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->startActivity(Landroid/content/Intent;)V

    .line 66
    return-void
.end method
