.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"


# instance fields
.field private d:Landroid/support/v7/widget/RecyclerView;

.field private f:I

.field private g:Lo/emr;

.field private h:Z

.field private i:Z

.field private k:I

.field private n:Lo/bur;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->k:I

    .line 44
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->f:I

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->l()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Ljava/util/List;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)Lo/bur;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)V"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 189
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->m()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Z)Z
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->h:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)I
    .locals 2

    .line 33
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->k:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->k:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Z)Z
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->i:Z

    return p1
.end method

.method private l()V
    .locals 3

    .line 192
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->k:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->c(ILo/bui;)V

    .line 215
    return-void
.end method

.method private m()V
    .locals 1

    .line 218
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->i:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->h:Z

    if-eqz v0, :cond_0

    .line 219
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->b()V

    .line 221
    :cond_0
    return-void
.end method

.method private n()V
    .locals 3

    .line 130
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->f:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->e(ILo/bui;)V

    .line 149
    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 60
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 3

    .line 65
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_course:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->setContentView(I)V

    .line 66
    sget v0, Lcom/huawei/health/suggestion/R$id;->custom_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->g:Lo/emr;

    .line 68
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->g:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    sget v0, Lcom/huawei/health/suggestion/R$id;->recyclerview_reco:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d:Landroid/support/v7/widget/RecyclerView;

    .line 79
    new-instance v0, Lo/bur;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {v0, v1, p0}, Lo/bur;-><init>(Landroid/support/v7/widget/RecyclerView;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    .line 80
    new-instance v2, Lcom/huawei/health/suggestion/ui/view/LinearNoBugLinearLayoutManager;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/health/suggestion/ui/view/LinearNoBugLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 81
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 83
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    invoke-virtual {v0, v1}, Lo/bur;->c(Lo/bur$d;)V

    .line 92
    return-void
.end method

.method public h()I
    .locals 1

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 4

    .line 104
    const-string v0, "FitnessCourseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n()V

    .line 107
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->l()V

    .line 127
    return-void
.end method

.method public k()V
    .locals 4

    .line 97
    const-string v0, "FitnessCourseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 49
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 51
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 225
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onDestroy()V

    .line 226
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    invoke-virtual {v0}, Lo/bur;->e()V

    .line 228
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bur;->c(Lo/bur$d;)V

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n:Lo/bur;

    .line 231
    :cond_0
    return-void
.end method
