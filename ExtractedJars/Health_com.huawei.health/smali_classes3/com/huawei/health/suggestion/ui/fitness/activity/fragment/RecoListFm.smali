.class public Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/support/v7/widget/RecyclerView;

.field private b:I

.field private c:I

.field private d:Lo/bvn;

.field private e:[Ljava/lang/Integer;

.field private f:[Ljava/lang/Integer;

.field private g:[Ljava/lang/Integer;

.field private h:I

.field private i:[Ljava/lang/Integer;

.field private k:Landroid/view/View;

.field private l:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

.field private m:Landroid/widget/CheckBox;

.field private n:Z

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:Landroid/support/v7/widget/LinearLayoutManager;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field private r:I

.field private s:I

.field private t:Landroid/view/View;

.field private u:Landroid/view/View;

.field private v:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 81
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->h:I

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->q:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c()V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 382
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    .line 386
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    .line 387
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0, p1}, Lo/bvn;->c(Ljava/util/List;)Lo/bvn;

    .line 388
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_0

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0, p1}, Lo/bvn;->a(Ljava/util/List;)Lo/bvn;

    .line 392
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 394
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;I)I
    .locals 0

    .line 66
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->s:I

    return p1
.end method

.method private b()V
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->b()V

    goto :goto_0

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 338
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;Lo/bvr;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c(Lo/bvr;I)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 316
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    if-nez v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->d()V

    .line 320
    :cond_0
    invoke-static {p1}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getData Size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a(Ljava/util/List;)V

    goto :goto_0

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvn;->c(Ljava/util/List;)Lo/bvn;

    .line 325
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 327
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k()V

    .line 328
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b()V

    .line 329
    return-void
.end method

.method private c()V
    .locals 4

    .line 269
    const-string v0, "RecoListFm"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "up to loadMore currpage:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "page_flag:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "--->dataSize: "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v2}, Lo/bvn;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->r:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    if-ne v0, v1, :cond_0

    .line 271
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->r:I

    .line 272
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a()V

    .line 274
    :cond_0
    return-void
.end method

.method private c(Lo/bvr;I)V
    .locals 2

    .line 258
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lo/bvq;->b(Ljava/util/List;Lo/bvr;I)V

    goto :goto_0

    .line 261
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkable:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    .line 263
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 264
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    invoke-virtual {p1, v0, p0}, Lo/bvr;->b(ILandroid/view/View$OnClickListener;)Lo/bvr;

    .line 265
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Lo/bvn;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    return-object v0
.end method

.method private d()V
    .locals 9

    .line 289
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecoListFm----getRecoWorks()--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    mul-int/lit8 v1, v1, 0xa

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->g:[Ljava/lang/Integer;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->i:[Ljava/lang/Integer;

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f:[Ljava/lang/Integer;

    iget v6, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->h:I

    iget-object v7, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->e:[Ljava/lang/Integer;

    new-instance v8, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;

    invoke-direct {v8, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    const/16 v2, 0xa

    invoke-interface/range {v0 .. v8}, Lo/bsp;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    .line 313
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 3

    .line 464
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    .line 465
    move-object v0, p1

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    .line 466
    if-eqz v2, :cond_0

    .line 467
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 469
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 471
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;Ljava/util/List;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)F
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->v:F

    return v0
.end method

.method private e(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)Z"
        }
    .end annotation

    .line 397
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->s:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Lcom/huawei/health/suggestion/ui/BaseStateActivity;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    return-object v0
.end method

.method private f()V
    .locals 9

    .line 341
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecoListFm----getJoniedWorks()--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->g:[Ljava/lang/Integer;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->i:[Ljava/lang/Integer;

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f:[Ljava/lang/Integer;

    iget v6, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->h:I

    iget-object v7, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->e:[Ljava/lang/Integer;

    new-instance v8, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;

    invoke-direct {v8, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-interface/range {v0 .. v8}, Lo/bsp;->e(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    .line 365
    return-void
.end method

.method private g()V
    .locals 3

    .line 454
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_uncheck_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 456
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->p:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v2

    .line 457
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    add-int/lit8 v1, v2, 0x1

    invoke-static {v0, v1}, Lo/bvq;->a(Ljava/util/List;I)V

    .line 458
    goto :goto_0

    .line 459
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v1}, Lo/bvn;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/bvq;->a(Ljava/util/List;I)V

    .line 461
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->i()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    return v0
.end method

.method private h()V
    .locals 2

    .line 444
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->g()V

    goto :goto_0

    .line 447
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 448
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 450
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->notifyDataSetChanged()V

    .line 451
    return-void
.end method

.method private i()V
    .locals 2

    .line 368
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    if-nez v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->d()V

    .line 372
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b()V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->c()I

    move-result v0

    if-nez v0, :cond_1

    .line 374
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 375
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 377
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->a()V

    .line 379
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->p()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->s:I

    return v0
.end method

.method private k()V
    .locals 2

    .line 401
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 402
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 403
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 404
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 405
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    goto :goto_0

    .line 407
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 408
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 409
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o()Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    invoke-static {v0, v1}, Lo/bvq;->c(ZLandroid/view/View;)V

    .line 411
    :goto_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->q:Ljava/util/List;

    return-object v0
.end method

.method private l()Z
    .locals 1

    .line 526
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private m()V
    .locals 2

    .line 474
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 475
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    .line 476
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    if-eqz v0, :cond_1

    .line 477
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto :goto_1

    .line 479
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 481
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->notifyDataSetChanged()V

    goto :goto_2

    .line 483
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->q()V

    .line 485
    :goto_2
    return-void
.end method

.method private n()V
    .locals 4

    .line 489
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 490
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 491
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 493
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$13;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$13;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/CheckBox;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 500
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 502
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    .line 503
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->notifyDataSetChanged()V

    .line 504
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    return-object v0
.end method

.method private o()Z
    .locals 3

    .line 551
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->c()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private p()V
    .locals 4

    .line 507
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$15;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$15;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 513
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    .line 514
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bvn;->notifyItemRemoved(I)V

    .line 515
    goto :goto_0

    .line 516
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 517
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 518
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 520
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 521
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 523
    :cond_1
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n()V

    return-void
.end method

.method private q()V
    .locals 6

    .line 593
    const-string v0, "RecoListFm"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    new-instance v5, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 596
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_healthdata_deleteing:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    .line 597
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    .line 621
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 627
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 628
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 629
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 277
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    if-nez v0, :cond_0

    .line 278
    return-void

    .line 280
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 281
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f()V

    goto :goto_0

    .line 283
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d()V

    .line 286
    :goto_0
    return-void
.end method

.method public b([Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;)V
    .locals 4

    .line 416
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 417
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    return-void

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->g()Lo/bvn;

    .line 421
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    .line 422
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->r:I

    .line 423
    invoke-static {p1}, Lo/bvq;->a([Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->g:[Ljava/lang/Integer;

    .line 424
    invoke-static {p2}, Lo/bvq;->a([Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->i:[Ljava/lang/Integer;

    .line 425
    invoke-static {p3}, Lo/bvq;->a([Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f:[Ljava/lang/Integer;

    .line 426
    invoke-static {p5}, Lo/bvq;->a([Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->e:[Ljava/lang/Integer;

    .line 427
    iput p4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->h:I

    .line 429
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a()V

    .line 430
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 632
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 633
    return-void
.end method

.method public e()Z
    .locals 2

    .line 573
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    if-eqz v0, :cond_0

    .line 574
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->n:Z

    .line 575
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 576
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->notifyDataSetChanged()V

    .line 577
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 578
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 579
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 580
    const/4 v0, 0x1

    return v0

    .line 582
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 434
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode:I

    if-ne v0, v1, :cond_0

    .line 435
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m()V

    goto :goto_0

    .line 436
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 437
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d(Landroid/view/View;)V

    goto :goto_0

    .line 438
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 439
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->h()V

    .line 441
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7
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

    .line 107
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 108
    const-string v0, "type"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    .line 109
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l:Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    .line 110
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_trainevent_recofm:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 111
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_content:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k:Landroid/view/View;

    .line 112
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_reco_workoutlist_nodata:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->u:Landroid/view/View;

    .line 113
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->t:Landroid/view/View;

    .line 114
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->t:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    .line 116
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_train_rcv_events:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    .line 118
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-direct {v1}, Landroid/support/v7/widget/DefaultItemAnimator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 119
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->p:Landroid/support/v7/widget/LinearLayoutManager;

    .line 120
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->p:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 121
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitnes_nodata:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_fitness_recom_nodata:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 122
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o()Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    invoke-static {v0, v1}, Lo/bvq;->c(ZLandroid/view/View;)V

    .line 124
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v6

    .line 125
    invoke-static {v6}, Lo/bvs;->b(Lcom/huawei/health/suggestion/model/Userinfo;)F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->v:F

    .line 127
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_list_item:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    .line 180
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1}, Lo/bvn;->b(Lo/bvn$e;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$8;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1}, Lo/bvn;->b(Lo/bvn$b;)Lo/bvn;

    .line 210
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$10;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1}, Lo/bvn;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    .line 241
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 243
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    .line 244
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->r:I

    .line 245
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$6;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 252
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitnes_nodata:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_join_no_record:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 254
    :goto_0
    return-object v5
.end method

.method public onDestroy()V
    .locals 2

    .line 587
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 588
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 589
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->b()Lo/bvp;

    .line 590
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 557
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 558
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 560
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b:I

    .line 561
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->r:I

    .line 562
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    .line 563
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 570
    :cond_0
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 3

    .line 543
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 544
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d:Lo/bvn;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 545
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o()Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->m:Landroid/widget/CheckBox;

    invoke-static {v0, v1}, Lo/bvq;->c(ZLandroid/view/View;)V

    .line 547
    :cond_0
    return-void
.end method
