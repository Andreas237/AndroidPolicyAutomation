.class public Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;,
        Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:I

.field public d:Lo/bur;

.field public e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

.field private f:I

.field private g:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

.field private i:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c:I

    .line 41
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->a:I

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f:I

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I
    .locals 2

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->g:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)V"
        }
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 264
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I
    .locals 2

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Ljava/util/List;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Lo/bui;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e(Lo/bui;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c:I

    return v0
.end method

.method private e(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;)V
    .locals 4

    .line 90
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDataAndRefreshTopic() hashcode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a()I

    move-result v1

    invoke-interface {v0, v1, p1}, Lo/bsp;->c(ILo/bui;)V

    .line 93
    return-void
.end method

.method private e(Lo/bui;)V
    .locals 2

    .line 162
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->a:I

    invoke-interface {v0, v1, p1}, Lo/bsp;->e(ILo/bui;)V

    .line 163
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->i:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6
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

    .line 52
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView() enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fragment_course:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 54
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->i:Landroid/content/Context;

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$id;->recyclerview_reco:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b:Landroid/support/v7/widget/RecyclerView;

    .line 56
    new-instance v0, Lo/bur;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->i:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bur;-><init>(Landroid/support/v7/widget/RecyclerView;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    .line 57
    new-instance v5, Lcom/huawei/health/suggestion/ui/view/LinearNoBugLinearLayoutManager;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/huawei/health/suggestion/ui/view/LinearNoBugLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 58
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 60
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    new-instance v1, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V

    invoke-virtual {v0, v1}, Lo/bur;->c(Lo/bur$d;)V

    .line 70
    new-instance v0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    .line 71
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a(I)V

    .line 72
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView() mMyUICallbackTopicList hashcode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    new-instance v0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->g:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->g:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->b(I)V

    .line 78
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 85
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 268
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy() enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 270
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    invoke-virtual {v0}, Lo/bur;->e()V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bur;->c(Lo/bur$d;)V

    .line 273
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    .line 275
    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 4

    .line 285
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f:I

    .line 286
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c:I

    .line 287
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroyView() enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->b(Z)V

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->g:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->c(Z)V

    .line 290
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 291
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 279
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStop() enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 281
    return-void
.end method
