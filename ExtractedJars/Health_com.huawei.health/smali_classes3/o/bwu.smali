.class public Lo/bwu;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwu$b;
    }
.end annotation


# instance fields
.field private a:Lo/byn;

.field private d:Lo/bwu$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 1

    .line 43
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_flowlayout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byn;

    iput-object v0, p0, Lo/bwu;->a:Lo/byn;

    .line 44
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 85
    iget-object v0, p0, Lo/bwu;->d:Lo/bwu$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/bwu;->d:Lo/bwu$b;

    invoke-interface {v0, p1}, Lo/bwu$b;->a(Ljava/lang/String;)V

    .line 88
    :cond_0
    return-void
.end method

.method public d(Landroid/app/Fragment;)V
    .locals 3

    .line 64
    invoke-virtual {p0}, Lo/bwu;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 65
    invoke-virtual {p1}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v2

    .line 66
    invoke-virtual {v2, p0}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 67
    invoke-virtual {v2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 70
    :cond_0
    return-void
.end method

.method public e(Landroid/app/Fragment;)V
    .locals 4

    .line 73
    iget-object v0, p0, Lo/bwu;->d:Lo/bwu$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    iget-object v0, p0, Lo/bwu;->a:Lo/byn;

    invoke-virtual {p0}, Lo/bwu;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lo/bwu;->d:Lo/bwu$b;

    invoke-interface {v2}, Lo/bwu$b;->d()Ljava/util/LinkedList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/byn;->a(Landroid/content/Context;Ljava/util/List;)V

    .line 76
    :cond_0
    invoke-virtual {p0}, Lo/bwu;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 77
    invoke-virtual {p1}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v3

    .line 78
    invoke-virtual {v3, p0}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 79
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 82
    :cond_1
    return-void
.end method

.method public e(Lo/bwu$b;)V
    .locals 3

    .line 56
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 57
    return-void

    .line 59
    :cond_0
    iput-object p1, p0, Lo/bwu;->d:Lo/bwu$b;

    .line 60
    iget-object v0, p0, Lo/bwu;->a:Lo/byn;

    invoke-virtual {p0}, Lo/bwu;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {p1}, Lo/bwu$b;->d()Ljava/util/LinkedList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/byn;->a(Landroid/content/Context;Ljava/util/List;)V

    .line 61
    return-void
.end method

.method public e(Lo/byn$d;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lo/bwu;->a:Lo/byn;

    invoke-virtual {v0, p1}, Lo/byn;->setTextOnClickListener(Lo/byn$d;)V

    .line 53
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 48
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 49
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 30
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 31
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 36
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fragment_fit_search_flow:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 37
    invoke-direct {p0, v2}, Lo/bwu;->a(Landroid/view/View;)V

    .line 38
    return-object v2
.end method
