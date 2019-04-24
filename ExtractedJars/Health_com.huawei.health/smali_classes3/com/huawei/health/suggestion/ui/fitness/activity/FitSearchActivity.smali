.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;
.super Lcom/huawei/health/suggestion/ui/fitness/activity/FitBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/bws;

.field private c:Landroid/widget/LinearLayout;

.field private d:Lo/bvi;

.field private e:Landroid/app/FragmentManager;

.field private f:Lo/bwu;

.field private g:Lo/bwy;

.field private i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

.field private k:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)Lo/bwu;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)Lo/bws;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->b:Lo/bws;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 52
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_fit_search:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->setContentView(I)V

    .line 53
    sget v0, Lcom/huawei/health/suggestion/R$id;->fragment_FitSearchFragment:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->c:Landroid/widget/LinearLayout;

    .line 54
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e:Landroid/app/FragmentManager;

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e:Landroid/app/FragmentManager;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fragment_FitSearchFragmentBar:I

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentById(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lo/bws;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->b:Lo/bws;

    .line 56
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e:Landroid/app/FragmentManager;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fragment_FitSearchFragmentFlowLayout:I

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentById(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lo/bwu;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e:Landroid/app/FragmentManager;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fragment_FitSearchFragmentRecyclerView:I

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentById(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lo/bwy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    .line 58
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->c:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->search_no_show:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->k:Landroid/widget/LinearLayout;

    .line 59
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 77
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    invoke-virtual {v0, v1}, Lo/bwu;->d(Landroid/app/Fragment;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    invoke-virtual {v0}, Lo/bwy;->c()I

    move-result v2

    .line 82
    if-nez v2, :cond_1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 86
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    invoke-virtual {v0, p1}, Lo/bwy;->c(Ljava/util/List;)V

    .line 87
    return-void
.end method

.method public b()V
    .locals 4

    .line 63
    const-string v0, "FitSearchActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->b:Lo/bws;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    invoke-virtual {v0, v1}, Lo/bws;->e(Lo/bws$b;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    invoke-virtual {v0, v1}, Lo/bwy;->b(Lo/bwy$b;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    invoke-virtual {v0, v1}, Lo/bwu;->e(Lo/byn$d;)V

    .line 70
    new-instance v0, Lo/bvi;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->a:Landroid/content/Context;

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-direct {v0, p0, v1}, Lo/bvi;-><init>(Landroid/app/Activity;Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->d:Lo/bvi;

    .line 73
    return-void
.end method

.method public b(Lo/bws$b;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    invoke-virtual {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->d(Lo/bws$b;)V

    .line 109
    return-void
.end method

.method public b(Lo/bwy$b;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;

    invoke-virtual {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->e(Lo/bwy$b;)V

    .line 113
    return-void
.end method

.method public c()V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    invoke-virtual {v0}, Lo/bwy;->b()V

    .line 97
    return-void
.end method

.method public d()V
    .locals 2

    .line 90
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->c()V

    .line 91
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    invoke-virtual {v0, v1}, Lo/bwu;->e(Landroid/app/Fragment;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 93
    return-void
.end method

.method public e()V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    invoke-virtual {v0}, Lo/bwy;->e()V

    .line 101
    return-void
.end method

.method public e(Lo/bwu$b;)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->f:Lo/bwu;

    invoke-virtual {v0, p1}, Lo/bwu;->e(Lo/bwu$b;)V

    .line 117
    return-void
.end method

.method public g()V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g:Lo/bwy;

    invoke-virtual {v0}, Lo/bwy;->a()V

    .line 105
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 39
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->a:Landroid/content/Context;

    .line 41
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->a()V

    .line 42
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->b()V

    .line 43
    return-void
.end method
