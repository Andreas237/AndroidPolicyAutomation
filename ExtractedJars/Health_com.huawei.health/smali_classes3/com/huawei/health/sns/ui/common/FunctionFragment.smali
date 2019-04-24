.class public Lcom/huawei/health/sns/ui/common/FunctionFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lo/bfp;


# instance fields
.field protected b:Landroid/view/View;

.field protected c:Lo/bfq;

.field public d:Lo/bfm;

.field public e:Landroid/widget/ListView;

.field protected f:Landroid/widget/ImageView;

.field protected g:Landroid/widget/LinearLayout;

.field protected h:Landroid/widget/FrameLayout;

.field protected i:Lo/bni;

.field protected k:Landroid/widget/FrameLayout;

.field protected n:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->n:Landroid/view/View;

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->d:Lo/bfm;

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Lo/bfm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->c:Lo/bfq;

    invoke-direct {v0, v1, v2}, Lo/bfm;-><init>(Landroid/content/Context;Lo/bfq;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->d:Lo/bfm;

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->d:Lo/bfm;

    invoke-virtual {v0, p0}, Lo/bfm;->b(Lo/bfp;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->n:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->n:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->d:Lo/bfm;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 115
    return-void
.end method

.method protected c()V
    .locals 0

    .line 63
    return-void
.end method

.method public c(Lo/bfl;)V
    .locals 0

    .line 138
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 0

    .line 132
    return-void
.end method

.method protected e()V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/app/Activity;Landroid/view/View;)V

    .line 127
    :cond_0
    return-void
.end method

.method protected e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 2

    .line 74
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_function_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->common_listview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->e:Landroid/widget/ListView;

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->no_search_result_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->k:Landroid/widget/FrameLayout;

    .line 77
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->no_result_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->h:Landroid/widget/FrameLayout;

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->network_error_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bni;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->i:Lo/bni;

    .line 79
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 84
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 85
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 90
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->c:Lo/bfq;

    if-nez v0, :cond_0

    .line 94
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->c()V

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->a()V

    .line 99
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->e()V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/sns/ui/common/FunctionFragment;->b:Landroid/view/View;

    return-object v0
.end method
