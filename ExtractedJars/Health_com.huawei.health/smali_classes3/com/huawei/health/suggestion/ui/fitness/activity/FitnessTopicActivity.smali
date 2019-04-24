.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;
    }
.end annotation


# instance fields
.field private d:Landroid/support/v7/widget/RecyclerView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Lo/but;

.field private i:Lo/emr;

.field private k:Landroid/content/Intent;

.field private l:Landroid/widget/Button;

.field private m:I

.field private n:Landroid/widget/RelativeLayout;

.field private o:I

.field private p:Ljava/lang/String;

.field private q:Lo/efy;

.field private r:Landroid/widget/CheckBox;

.field private s:Landroid/widget/LinearLayout;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private u:Z

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field private w:Lo/efy;

.field private x:J

.field private y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->u:Z

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    .line 74
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->v:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;Z)Z
    .locals 0

    .line 48
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->u:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Lo/but;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)I
    .locals 2

    .line 48
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->s:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->f:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private l()V
    .locals 6

    .line 237
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    new-instance v5, Lo/egy$b;

    invoke-direct {v5, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 240
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_healthdata_deleteing:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    .line 241
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    .line 267
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 273
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 274
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 276
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->s()V

    return-void
.end method

.method private m()V
    .locals 4

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_uncheck_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 223
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 224
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 229
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 232
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveSelects(Ljava/util/List;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    .line 234
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->u()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->v:Ljava/util/List;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 156
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o:I

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m:I

    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->c(IILo/bui;)V

    .line 182
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    return-object v0
.end method

.method private p()V
    .locals 3

    .line 205
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 206
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    .line 207
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    if-eqz v0, :cond_1

    .line 208
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto :goto_1

    .line 210
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 212
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-boolean v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveIssDeleteMode(Z)V

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    goto :goto_2

    .line 215
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->l()V

    .line 217
    :goto_2
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    return v0
.end method

.method private q()V
    .locals 3

    .line 393
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 394
    :cond_0
    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    .line 395
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Lo/bsp;->c(ILo/bui;)V

    .line 396
    goto :goto_0

    .line 397
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t()V

    .line 399
    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t()V

    return-void
.end method

.method private r()V
    .locals 9

    .line 335
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k:Landroid/content/Intent;

    .line 336
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k:Landroid/content/Intent;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 337
    return-void

    .line 339
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->x:J

    .line 340
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k:Landroid/content/Intent;

    const-string v1, "intent_key_topicid"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m:I

    .line 341
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k:Landroid/content/Intent;

    const-string v1, "intent_key_topicname"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 342
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k:Landroid/content/Intent;

    const-string v1, "intent_key_topicname"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    .line 345
    :cond_1
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mTopicId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-mTopicName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 347
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i:Lo/emr;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_previous_train:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->w:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_join_no_record:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 349
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_previous_train:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/but;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 351
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->q()V

    .line 353
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 355
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->c()V

    .line 357
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_3

    .line 358
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/but;->d(Z)V

    .line 359
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v8, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$6;

    invoke-direct {v8, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$6;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-interface/range {v0 .. v8}, Lo/bsp;->e(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    goto :goto_1

    .line 388
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n()V

    .line 390
    :goto_1
    return-void
.end method

.method private s()V
    .locals 4

    .line 279
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 281
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeleteModel.acquireSelects().size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

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

    .line 282
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$9;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/CheckBox;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 292
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    .line 293
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-boolean v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveIssDeleteMode(Z)V

    .line 294
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    .line 295
    return-void
.end method

.method private t()V
    .locals 3

    .line 439
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FitnessTopic_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/but;->e(Ljava/lang/String;)V

    .line 441
    return-void
.end method

.method private u()V
    .locals 4

    .line 298
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

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

    .line 305
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/but;->notifyItemRemoved(I)V

    .line 306
    goto :goto_0

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 308
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 311
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 313
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 315
    :cond_2
    return-void
.end method

.method private y()V
    .locals 6

    .line 451
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 452
    const-string v0, "topic_name"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    const-string v0, "stay_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->x:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    const-string v0, "1130016"

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 455
    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 128
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 3

    .line 87
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_topic:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->setContentView(I)V

    .line 88
    sget v0, Lcom/huawei/health/suggestion/R$id;->custom_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i:Lo/emr;

    .line 89
    sget v0, Lcom/huawei/health/suggestion/R$id;->recyclerView_topic:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d:Landroid/support/v7/widget/RecyclerView;

    .line 90
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_layout_net_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->g:Landroid/widget/RelativeLayout;

    .line 91
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_reco_workoutlist_nodata:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->f:Landroid/widget/LinearLayout;

    .line 92
    sget v0, Lcom/huawei/health/suggestion/R$id;->btn_no_net_work:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->l:Landroid/widget/Button;

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$id;->reload_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n:Landroid/widget/RelativeLayout;

    .line 94
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_jonied_selectall:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->s:Landroid/widget/LinearLayout;

    .line 95
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->q:Lo/efy;

    .line 96
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    .line 97
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitnes_nodata:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->w:Lo/efy;

    .line 98
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->q:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    new-instance v0, Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {v0, v1}, Lo/but;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-virtual {v0, v1}, Lo/but;->d(Lo/but$d;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-virtual {v0, v1}, Lo/but;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/view/LinearNoBugLinearLayoutManager;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/huawei/health/suggestion/ui/view/LinearNoBugLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->l:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r()V

    .line 124
    return-void
.end method

.method public h()I
    .locals 1

    .line 133
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 4

    .line 143
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setDoubleClickEnable(Z)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setBackToTopListener(Lo/emr$a;)V

    .line 152
    return-void
.end method

.method public k()V
    .locals 4

    .line 138
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 319
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    if-eqz v0, :cond_0

    .line 320
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->z:Z

    .line 321
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->saveIssDeleteMode(Z)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h:Lo/but;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r:Landroid/widget/CheckBox;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 327
    return-void

    .line 329
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onBackPressed()V

    .line 330
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->btn_no_net_work:I

    if-ne v0, v1, :cond_0

    .line 187
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view == mBtNoNet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-static {p0}, Lo/dbf;->i(Landroid/content/Context;)V

    goto :goto_0

    .line 189
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->reload_layout:I

    if-ne v0, v1, :cond_1

    .line 190
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "view == mRlRetrymBtIsClickable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->u:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->u:Z

    if-eqz v0, :cond_3

    .line 192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->u:Z

    .line 193
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->r()V

    goto :goto_0

    .line 195
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_deleMode:I

    if-ne v0, v1, :cond_2

    .line 196
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view == R.id.sug_tv_jonied_deleMode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->p()V

    goto :goto_0

    .line 198
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_jonied_all:I

    if-ne v0, v1, :cond_3

    .line 199
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view ==  R.id.sug_tv_jonied_all"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->m()V

    .line 202
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 81
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 82
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 83
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 445
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->b()Lo/bvp;

    .line 446
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->y()V

    .line 447
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onDestroy()V

    .line 448
    return-void
.end method
