.class public Lcom/huawei/health/sns/ui/search/SearchFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Lo/bjb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/search/SearchFragment$b;
    }
.end annotation


# instance fields
.field protected a:Lo/biz;

.field protected l:Ljava/lang/String;

.field protected m:Landroid/os/Handler;

.field protected o:Lo/bje;

.field private p:Z

.field private u:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->l:Ljava/lang/String;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->o:Lo/bje;

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->p:Z

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->u:Landroid/view/View;

    .line 78
    new-instance v0, Lcom/huawei/health/sns/ui/search/SearchFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/search/SearchFragment$b;-><init>(Lcom/huawei/health/sns/ui/search/SearchFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/search/SearchFragment;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->f()V

    return-void
.end method

.method private b()V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->h:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 189
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/search/SearchFragment;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->b()V

    return-void
.end method

.method private f()V
    .locals 2

    .line 205
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/search/SearchFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/search/SearchFragment$4;-><init>(Lcom/huawei/health/sns/ui/search/SearchFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 234
    return-void
.end method

.method private g()V
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 198
    return-void
.end method

.method private h()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 273
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->p:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->u:Landroid/view/View;

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->u:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 277
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->p:Z

    .line 279
    :cond_0
    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    invoke-virtual {v0, p1}, Lo/biz;->d(I)V

    .line 130
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 3

    .line 249
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    invoke-virtual {v0, p1}, Lo/biz;->d(Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 255
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 118
    new-instance v0, Lo/biz;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/biz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    .line 119
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/biz;->b(Lo/bfn;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->m:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/biz;->d(Landroid/os/Handler;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->c:Lo/bfq;

    .line 122
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 160
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->g()V

    .line 163
    return-void

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->o:Lo/bje;

    if-eqz v0, :cond_1

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->o:Lo/bje;

    invoke-virtual {v0}, Lo/bje;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_1

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->o:Lo/bje;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bje;->cancel(Z)Z

    .line 172
    :cond_1
    new-instance v0, Lo/bje;

    invoke-direct {v0, p0}, Lo/bje;-><init>(Lo/bjb;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->o:Lo/bje;

    .line 173
    iput-object p1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->l:Ljava/lang/String;

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->o:Lo/bje;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lo/bje;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 175
    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    .line 239
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->a:Lo/biz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/biz;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 243
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lo/bfm;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->d:Lo/bfm;

    .line 265
    return-void
.end method

.method public e()V
    .locals 0

    .line 180
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 284
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 285
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 288
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->u:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->p:Z

    .line 291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->u:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    goto :goto_0

    .line 296
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->h()V

    .line 300
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->c(Ljava/lang/String;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->g:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 303
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 135
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->b:Landroid/view/View;

    .line 136
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 137
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_no_result_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 139
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->g:Landroid/widget/LinearLayout;

    .line 140
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->f:Landroid/widget/ImageView;

    .line 141
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->g:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->d:Lo/bfm;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 147
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->h()V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment;->b:Landroid/view/View;

    return-object v0
.end method
