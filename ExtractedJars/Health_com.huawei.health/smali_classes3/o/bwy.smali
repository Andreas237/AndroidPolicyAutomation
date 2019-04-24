.class public Lo/bwy;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwy$b;
    }
.end annotation


# instance fields
.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:Lo/bwy$b;

.field private e:Lo/bum;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/bwy;)Lo/bum;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bwy;->e:Lo/bum;

    return-object v0
.end method

.method static synthetic b(Lo/bwy;)Lo/bwy$b;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bwy;->d:Lo/bwy$b;

    return-object v0
.end method

.method private c(Landroid/view/View;)V
    .locals 1

    .line 49
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_recyclerView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/bwy;->c:Landroid/support/v7/widget/RecyclerView;

    .line 50
    return-void
.end method

.method private d()V
    .locals 3

    .line 54
    iget-object v0, p0, Lo/bwy;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lo/bwy;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 55
    iget-object v0, p0, Lo/bwy;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-direct {v1}, Landroid/support/v7/widget/DefaultItemAnimator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 56
    new-instance v0, Lo/bum;

    invoke-virtual {p0}, Lo/bwy;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bum;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwy;->e:Lo/bum;

    .line 57
    iget-object v0, p0, Lo/bwy;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/bwy;->e:Lo/bum;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 58
    iget-object v0, p0, Lo/bwy;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lo/bwy$4;

    invoke-direct {v1, p0}, Lo/bwy$4;-><init>(Lo/bwy;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 70
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 94
    iget-object v0, p0, Lo/bwy;->e:Lo/bum;

    invoke-virtual {v0}, Lo/bum;->e()V

    .line 95
    return-void
.end method

.method public b()V
    .locals 1

    .line 83
    iget-object v0, p0, Lo/bwy;->e:Lo/bum;

    invoke-virtual {v0}, Lo/bum;->b()V

    .line 84
    return-void
.end method

.method public b(Lo/bwy$b;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/bwy;->d:Lo/bwy$b;

    .line 115
    return-void
.end method

.method public c()I
    .locals 1

    .line 98
    iget-object v0, p0, Lo/bwy;->e:Lo/bum;

    invoke-virtual {v0}, Lo/bum;->d()I

    move-result v0

    return v0
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lo/bwy;->e:Lo/bum;

    invoke-virtual {v0, p1}, Lo/bum;->a(Ljava/util/List;)V

    .line 79
    return-void
.end method

.method public e()V
    .locals 1

    .line 90
    iget-object v0, p0, Lo/bwy;->e:Lo/bum;

    invoke-virtual {v0}, Lo/bum;->a()V

    .line 91
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 74
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 75
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 35
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 36
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 41
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fragment_fit_search_recycler:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 42
    invoke-direct {p0, v2}, Lo/bwy;->c(Landroid/view/View;)V

    .line 43
    invoke-direct {p0}, Lo/bwy;->d()V

    .line 44
    return-object v2
.end method
