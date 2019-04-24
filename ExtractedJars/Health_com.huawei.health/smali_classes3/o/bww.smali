.class public Lo/bww;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field private a:Lcom/huawei/health/suggestion/model/Plan;

.field private b:Lo/byy;

.field private c:Lo/bxf;

.field private d:Lo/bzf;

.field private e:Landroid/view/View;

.field private f:I

.field private g:I

.field private h:Z

.field private i:Z

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bww;->k:Z

    return-void
.end method

.method private a()V
    .locals 2

    .line 120
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    invoke-virtual {v0, p0}, Lo/bzf;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    invoke-virtual {v0, p0}, Lo/byy;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 122
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    new-instance v1, Lo/bww$2;

    invoke-direct {v1, p0}, Lo/bww$2;-><init>(Lo/bww;)V

    invoke-virtual {v0, v1}, Lo/byy;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 130
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    new-instance v1, Lo/bww$3;

    invoke-direct {v1, p0}, Lo/bww$3;-><init>(Lo/bww;)V

    invoke-virtual {v0, v1}, Lo/byy;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 137
    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 3

    .line 105
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_inflate_show_plan_content:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bww;->e:Landroid/view/View;

    .line 106
    iget-object v0, p0, Lo/bww;->e:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->btn_back_to_today:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzf;

    iput-object v0, p0, Lo/bww;->d:Lo/bzf;

    .line 107
    iget-object v0, p0, Lo/bww;->e:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_lv_plan:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byy;

    iput-object v0, p0, Lo/bww;->b:Lo/byy;

    .line 109
    new-instance v0, Lo/bxf;

    invoke-virtual {p0}, Lo/bww;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lo/bww;->b:Lo/byy;

    invoke-direct {v0, v1, v2}, Lo/bxf;-><init>(Landroid/content/Context;Landroid/widget/ListView;)V

    iput-object v0, p0, Lo/bww;->c:Lo/bxf;

    .line 110
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    iget-object v1, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v0, v1}, Lo/byy;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 111
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byy;->c(Z)V

    .line 112
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byy;->setDividerHeight(I)V

    .line 113
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/byy;->setOverScrollMode(I)V

    .line 115
    invoke-direct {p0}, Lo/bww;->c()I

    move-result v0

    iput v0, p0, Lo/bww;->f:I

    .line 116
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    iget v1, p0, Lo/bww;->f:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/bzf;->setTranslationY(F)V

    .line 117
    return-void
.end method

.method static synthetic a(Lo/bww;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lo/bww;->i:Z

    return p1
.end method

.method private b()Z
    .locals 3

    .line 165
    iget-object v0, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v0}, Lo/bxf;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 166
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    iget-object v1, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v1}, Lo/bxf;->b()I

    move-result v1

    iget-object v2, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v2}, Lo/bxf;->e()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/bya;->b(Landroid/widget/AbsListView;II)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    .line 167
    invoke-static {v0}, Lo/bya;->d(Landroid/widget/AbsListView;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 171
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private c()I
    .locals 4

    .line 175
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bzf;->measure(II)V

    .line 176
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    invoke-virtual {v0}, Lo/bzf;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 177
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    invoke-virtual {v0}, Lo/bzf;->getMeasuredHeight()I

    move-result v0

    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    return v0
.end method

.method static synthetic d(Lo/bww;)Lo/byy;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 191
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    invoke-virtual {v0}, Lo/bzf;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 192
    return-void
.end method

.method private e()V
    .locals 3

    .line 182
    iget-object v0, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v0}, Lo/bxf;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lo/bww;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    iget-object v1, p0, Lo/bww;->c:Lo/bxf;

    .line 183
    invoke-virtual {v1}, Lo/bxf;->b()I

    move-result v1

    iget-object v2, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v2}, Lo/bxf;->e()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/bya;->e(Landroid/widget/AbsListView;II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-direct {p0}, Lo/bww;->d()V

    goto :goto_0

    .line 186
    :cond_0
    invoke-direct {p0}, Lo/bww;->h()V

    .line 188
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 145
    iget-object v0, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v0}, Lo/bxf;->b()I

    move-result v2

    .line 146
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bww;->h:Z

    .line 147
    const/4 v0, -0x1

    if-eq v2, v0, :cond_2

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bww;->h:Z

    .line 150
    if-gez p1, :cond_0

    .line 151
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    iget-object v1, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v1}, Lo/bxf;->e()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lo/byy;->smoothScrollToPositionFromTop(II)V

    goto :goto_0

    .line 152
    :cond_0
    if-nez p1, :cond_1

    .line 153
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    iget-object v1, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v1}, Lo/bxf;->e()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lo/byy;->setSelectionFromTop(II)V

    goto :goto_0

    .line 155
    :cond_1
    iget-object v0, p0, Lo/bww;->b:Lo/byy;

    iget-object v1, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v1}, Lo/bxf;->e()I

    move-result v1

    invoke-virtual {v0, v2, v1, p1}, Lo/byy;->smoothScrollToPositionFromTop(III)V

    .line 158
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/bww;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bww;->e()V

    return-void
.end method

.method static synthetic e(Lo/bww;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lo/bww;->h:Z

    return p1
.end method

.method private h()V
    .locals 2

    .line 195
    iget-object v0, p0, Lo/bww;->d:Lo/bzf;

    invoke-virtual {v0}, Lo/bzf;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lo/bww;->f:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 196
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 1

    .line 62
    if-nez p1, :cond_0

    .line 63
    return-void

    .line 66
    :cond_0
    iput-object p1, p0, Lo/bww;->a:Lcom/huawei/health/suggestion/model/Plan;

    .line 67
    iget-object v0, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v0, p1}, Lo/bxf;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 68
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 72
    iget-object v0, p0, Lo/bww;->a:Lcom/huawei/health/suggestion/model/Plan;

    if-nez v0, :cond_0

    .line 73
    return-void

    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->btn_back_to_today:I

    if-ne v0, v1, :cond_1

    .line 77
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lo/bww;->e(I)V

    .line 79
    :cond_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lo/bww;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bww;->a(Landroid/app/Activity;)V

    .line 40
    invoke-direct {p0}, Lo/bww;->a()V

    .line 41
    iget-object v0, p0, Lo/bww;->e:Landroid/view/View;

    return-object v0
.end method

.method public onResume()V
    .locals 2

    .line 46
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 47
    iget-object v0, p0, Lo/bww;->a:Lcom/huawei/health/suggestion/model/Plan;

    if-nez v0, :cond_0

    .line 48
    return-void

    .line 51
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bxz;->d(J)I

    move-result v0

    iput v0, p0, Lo/bww;->g:I

    .line 52
    iget-object v0, p0, Lo/bww;->c:Lo/bxf;

    iget v1, p0, Lo/bww;->g:I

    invoke-virtual {v0, v1}, Lo/bxf;->a(I)V

    .line 53
    invoke-direct {p0}, Lo/bww;->e()V

    .line 55
    iget-boolean v0, p0, Lo/bww;->k:Z

    if-eqz v0, :cond_1

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bww;->k:Z

    .line 57
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lo/bww;->e(I)V

    .line 59
    :cond_1
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 102
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 5

    .line 83
    if-nez p2, :cond_1

    .line 84
    invoke-direct {p0}, Lo/bww;->e()V

    .line 86
    iget-boolean v0, p0, Lo/bww;->h:Z

    if-eqz v0, :cond_1

    .line 87
    invoke-direct {p0}, Lo/bww;->b()Z

    move-result v4

    .line 88
    const-string v0, "scrollToShowTodayComplete"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    if-eqz v4, :cond_0

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bww;->h:Z

    goto :goto_0

    .line 92
    :cond_0
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lo/bww;->e(I)V

    .line 96
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bww;->c:Lo/bxf;

    invoke-virtual {v0, p2}, Lo/bxf;->b(I)V

    .line 97
    return-void
.end method
