.class public Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static t:Ljava/lang/String;


# instance fields
.field a:Lo/efy;

.field b:Lo/efy;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:I

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/LinearLayout;

.field private k:Lo/but;

.field private l:Z

.field private m:Lo/efy;

.field private n:Landroid/widget/CheckBox;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:Landroid/view/View;

.field private r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

.field private s:Landroid/widget/LinearLayout;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field private x:Landroid/widget/LinearLayout;

.field private y:Landroid/widget/ImageView;

.field private z:Lo/byu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 79
    const-string v0, "type"

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->t:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 88
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->l:Z

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    .line 77
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->u:Ljava/util/List;

    .line 89
    return-void
.end method

.method public static a(I)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;
    .locals 3

    .line 96
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 97
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->t:Ljava/lang/String;

    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 98
    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;-><init>()V

    .line 99
    invoke-virtual {v2, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->setArguments(Landroid/os/Bundle;)V

    .line 100
    return-object v2
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/byu;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->z:Lo/byu;

    return-object v0
.end method

.method private a()V
    .locals 9

    .line 227
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v8, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$10;

    invoke-direct {v8, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$10;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-interface/range {v0 .. v8}, Lo/bsp;->e(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    .line 269
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;Z)Z
    .locals 0

    .line 51
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/but;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 320
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 321
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 322
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$15;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$15;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 329
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;Ljava/util/List;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->d(Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Z
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->l()Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 2

    .line 210
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k()V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/but;->d(Z)V

    .line 215
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->e:I

    if-nez v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    const-string v1, "collect"

    invoke-virtual {v0, v1}, Lo/but;->e(Ljava/lang/String;)V

    .line 217
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->e()V

    goto :goto_0

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    const-string v1, "downloaded"

    invoke-virtual {v0, v1}, Lo/but;->e(Ljava/lang/String;)V

    .line 220
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a()V

    .line 224
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c()V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 447
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 448
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v2

    .line 449
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, v2}, Lo/bsp;->k(Ljava/lang/String;)V

    .line 447
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 451
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 272
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$9;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const/4 v4, 0x2

    invoke-interface {v0, v2, v3, v4, v1}, Lo/bsp;->b(IIILo/bui;)V

    .line 317
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->y:Landroid/widget/ImageView;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 380
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 381
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_uncheck_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 382
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 383
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 382
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 388
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 391
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveSelects(Ljava/util/List;)V

    .line 392
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    .line 393
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->x:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private g()V
    .locals 3

    .line 431
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->u:Ljava/util/List;

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->a(Ljava/util/List;Lo/bui;)V

    .line 444
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/efy;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->m:Lo/efy;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 364
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 365
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    .line 366
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    if-eqz v0, :cond_1

    .line 367
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 369
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 371
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-boolean v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveIssDeleteMode(Z)V

    .line 372
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    goto :goto_2

    .line 374
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->i()V

    .line 376
    :goto_2
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->d:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private i()V
    .locals 6

    .line 396
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    new-instance v5, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 399
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_healthdata_deleteing:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    .line 400
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    .line 419
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$13;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$13;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 425
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 426
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 428
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->i:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 332
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 333
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 334
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$14;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$14;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 341
    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    return-object v0
.end method

.method private l()Z
    .locals 4

    .line 516
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 517
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isActivityDestroy:true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    const/4 v0, 0x1

    return v0

    .line 520
    :cond_0
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isActivityDestroy:false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic m(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Landroid/view/View;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->q:Landroid/view/View;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 454
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 456
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeleteModel.acquireSelects().size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/CheckBox;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 465
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 467
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    .line 468
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-boolean v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveIssDeleteMode(Z)V

    .line 469
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    .line 470
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->u:Ljava/util/List;

    return-object v0
.end method

.method private o()V
    .locals 5

    .line 473
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 479
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 480
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/but;->notifyItemRemoved(I)V

    .line 481
    goto :goto_0

    .line 482
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 483
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 484
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 485
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 486
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->x:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 487
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->m:Lo/efy;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->common_black_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 488
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->y:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_public_delete2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 490
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 493
    :cond_2
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n()V

    return-void
.end method

.method static synthetic s(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->e:I

    return v0
.end method

.method static synthetic u(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->g()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 5

    .line 121
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_loading_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->q:Landroid/view/View;

    .line 122
    sget v0, Lcom/huawei/health/suggestion/R$id;->recyclerView_topic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c:Landroid/support/v7/widget/RecyclerView;

    .line 123
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_layout_net_error:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->d:Landroid/widget/RelativeLayout;

    .line 124
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_reco_workoutlist_nodata:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->i:Landroid/widget/LinearLayout;

    .line 125
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitnes_nodata:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->b:Lo/efy;

    .line 126
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitnes_nodata1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a:Lo/efy;

    .line 128
    sget v0, Lcom/huawei/health/suggestion/R$id;->btn_no_net_work:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->h:Landroid/widget/Button;

    .line 129
    sget v0, Lcom/huawei/health/suggestion/R$id;->reload_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->f:Landroid/widget/RelativeLayout;

    .line 131
    sget v0, Lcom/huawei/health/suggestion/R$id;->select_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ems;

    .line 132
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->select_view:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 133
    invoke-virtual {v3, v4}, Lo/ems;->e(Landroid/view/View;)V

    .line 135
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_jonied_selectall_reco:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->g:Landroid/widget/RelativeLayout;

    .line 136
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->m:Lo/efy;

    .line 137
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    .line 138
    sget v0, Lcom/huawei/health/suggestion/R$id;->delete_icon:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->y:Landroid/widget/ImageView;

    .line 139
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all_ll:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s:Landroid/widget/LinearLayout;

    .line 140
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode_ll:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->x:Landroid/widget/LinearLayout;

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    sget v0, Lcom/huawei/health/suggestion/R$id;->pull_recyclerview_parent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byu;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->z:Lo/byu;

    .line 145
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->z:Lo/byu;

    invoke-virtual {v0}, Lo/byu;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;

    invoke-direct {v1, p0, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;Lo/ems;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 158
    new-instance v0, Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {v0, v1}, Lo/but;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    .line 159
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$8;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v0, v1}, Lo/but;->d(Lo/but$d;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$7;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v0, v1}, Lo/but;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->h:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a:Lo/efy;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$6;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    invoke-virtual {v0, v1}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->e:I

    if-nez v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->b:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_no_collected_workout:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    goto :goto_0

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->b:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_no_downloaded_workout:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 197
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 3

    .line 496
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    if-eqz v0, :cond_0

    .line 497
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p:Z

    .line 498
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 499
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveIssDeleteMode(Z)V

    .line 500
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->k:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 502
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->n:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 503
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 504
    const/4 v0, 0x0

    return v0

    .line 506
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 345
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->btn_no_net_work:I

    if-ne v0, v1, :cond_0

    .line 346
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view == mBtNoNet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    goto :goto_0

    .line 348
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->reload_layout:I

    if-ne v0, v1, :cond_1

    .line 349
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "view == mRlRetrymBtIsClickable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->l:Z

    if-eqz v0, :cond_3

    .line 351
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->l:Z

    .line 352
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->d()V

    goto :goto_0

    .line 354
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode_ll:I

    if-ne v0, v1, :cond_2

    .line 355
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view == R.id.sug_tv_jonied_deleMode_ll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->h()V

    goto :goto_0

    .line 357
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all:I

    if-ne v0, v1, :cond_3

    .line 358
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view ==  R.id.sug_tv_jonied_all"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->f()V

    .line 361
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 105
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 106
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 107
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 108
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->t:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->e:I

    .line 110
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
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

    .line 115
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fragment_fit_me_exercise:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 116
    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(Landroid/view/View;)V

    .line 117
    return-object v2
.end method

.method public onDestroy()V
    .locals 1

    .line 511
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->b()Lo/bvp;

    .line 512
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 513
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 202
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 203
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->d()V

    .line 205
    return-void
.end method
