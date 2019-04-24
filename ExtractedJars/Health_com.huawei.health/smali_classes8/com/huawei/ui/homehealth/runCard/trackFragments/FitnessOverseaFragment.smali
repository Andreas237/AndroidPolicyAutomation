.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private B:Landroid/os/Handler;

.field private a:Landroid/support/v7/widget/RecyclerView;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/support/v7/widget/RecyclerView;

.field private f:Landroid/widget/ImageView;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bxw;>;"
        }
    .end annotation
.end field

.field private i:Lo/bwz;

.field private k:Lo/bxc;

.field private l:Lo/erj;

.field private m:Landroid/widget/LinearLayout;

.field private n:Lo/erz;

.field private o:Landroid/support/v7/widget/RecyclerView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/support/v7/widget/RecyclerView;

.field private t:Landroid/widget/LinearLayout;

.field private u:Lo/erz;

.field private v:Landroid/os/HandlerThread;

.field private w:Lcom/huawei/health/suggestion/model/Topic;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field private y:Landroid/os/Handler;

.field private z:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->h:Ljava/util/List;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->g:Ljava/util/List;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->o:Landroid/support/v7/widget/RecyclerView;

    .line 103
    new-instance v0, Lo/erz;

    invoke-direct {v0}, Lo/erz;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->n:Lo/erz;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->p:Landroid/widget/TextView;

    .line 105
    new-instance v0, Lo/erj;

    invoke-direct {v0}, Lo/erj;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->l:Lo/erj;

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    .line 116
    new-instance v0, Lo/erz;

    invoke-direct {v0}, Lo/erz;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->u:Lo/erz;

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->x:Ljava/util/List;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->v:Landroid/os/HandlerThread;

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->y:Landroid/os/Handler;

    .line 615
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->B:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 6

    .line 229
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->i()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 232
    if-nez v4, :cond_0

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 238
    new-instance v5, Lo/bxw;

    invoke-direct {v5}, Lo/bxw;-><init>()V

    .line 239
    const/4 v0, 0x0

    invoke-static {v0}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->e(Ljava/lang/String;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_run_plantype_5km:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 241
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->pic_five:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 242
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->h:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->i:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->notifyDataSetChanged()V

    .line 246
    goto :goto_0

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->g:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->k:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->notifyDataSetChanged()V

    .line 256
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    .locals 3

    .line 349
    const/4 v1, -0x1

    .line 350
    if-eqz p1, :cond_0

    .line 351
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v1

    .line 353
    :cond_0
    invoke-static {v1}, Lo/erh;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 355
    move v2, v1

    .line 356
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$8;

    invoke-direct {v0, p0, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$8;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;I)V

    invoke-static {v0}, Lo/erh;->c(Lo/erh$b;)V

    .line 362
    goto :goto_0

    .line 363
    :cond_1
    invoke-direct {p0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(I)V

    .line 366
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b()V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 429
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 431
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 432
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->n:Lo/erz;

    invoke-virtual {v0, v4}, Lo/erz;->c(Ljava/util/List;)V

    .line 434
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireExtendSeaMap()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bso;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 435
    if-eqz v5, :cond_1

    const-string v0, "workoutRecommendDec"

    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    invoke-static {}, Lo/erh;->b()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v6

    .line 437
    const-string v0, "workoutRecommendDec"

    .line 438
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    .line 437
    invoke-static {v6, v0, v1}, Lo/esk;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 440
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 444
    :cond_0
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse invalid recommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    :goto_0
    goto :goto_1

    .line 447
    :cond_1
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse invalid data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    :goto_1
    goto :goto_2

    .line 450
    :cond_2
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse no course data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 453
    :goto_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->B:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Lcom/huawei/health/suggestion/model/Topic;)Lcom/huawei/health/suggestion/model/Topic;
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->w:Lcom/huawei/health/suggestion/model/Topic;

    return-object p1
.end method

.method private b()V
    .locals 8

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    .line 270
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_LAST_RECOMMEND_TIME"

    .line 269
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 272
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->c(JI)J

    move-result-wide v5

    .line 273
    if-eqz v4, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 275
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-nez v0, :cond_0

    .line 279
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Has recommend today"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-static {}, Lo/erh;->a()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    move-result-object v7

    .line 281
    if-eqz v7, :cond_0

    .line 283
    invoke-virtual {p0, v7}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    return-void

    .line 290
    :cond_0
    goto :goto_0

    .line 287
    :catch_0
    move-exception v7

    .line 289
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    :cond_1
    :goto_0
    invoke-static {}, Lo/bzy;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 295
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No Heartrate devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(I)V

    .line 297
    const/4 v0, -0x1

    const/16 v1, 0x8

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/erh;->b(IID)V

    goto :goto_1

    .line 300
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c()V

    .line 302
    :goto_1
    return-void
.end method

.method private b(I)V
    .locals 1

    .line 374
    invoke-static {p1}, Lo/erh;->a(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    move-result-object v0

    .line 375
    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V

    .line 376
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;I)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/content/Context;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 309
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start get SportLevel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->l:Lo/erj;

    if-nez v0, :cond_0

    .line 311
    new-instance v0, Lo/erj;

    invoke-direct {v0}, Lo/erj;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->l:Lo/erj;

    .line 313
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->l:Lo/erj;

    .line 314
    invoke-static {}, Lo/feg;->e()Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$1;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    .line 313
    invoke-virtual {v0, v1, v2}, Lo/erj;->d(Lcom/huawei/up/model/UserInfomation;Lo/erj$c;)V

    .line 323
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 3

    .line 459
    sget v0, Lcom/huawei/ui/homehealth/R$id;->rv_recommend_course:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->o:Landroid/support/v7/widget/RecyclerView;

    .line 460
    new-instance v2, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 461
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->o:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->o:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->n:Lo/erz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 464
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_run_recommend_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->m:Landroid/widget/LinearLayout;

    .line 466
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_recommend_reason:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->p:Landroid/widget/TextView;

    .line 468
    return-void
.end method

.method private d()V
    .locals 3

    .line 477
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/bsp;->c(ILo/bui;)V

    .line 526
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Ljava/util/List;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Lcom/huawei/health/suggestion/model/Topic;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->w:Lcom/huawei/health/suggestion/model/Topic;

    return-object v0
.end method

.method private e()V
    .locals 7

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->w:Lcom/huawei/health/suggestion/model/Topic;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->w:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->w:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->w:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v4

    .line 590
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 593
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 594
    :goto_0
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->x:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 597
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->u:Lo/erz;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->x:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/erz;->c(Ljava/util/List;)V

    .line 598
    goto :goto_2

    .line 599
    :cond_2
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->t:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 605
    :goto_2
    goto :goto_3

    .line 606
    :cond_3
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRuncourseEnter topic or courses is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->t:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 610
    :goto_3
    return-void
.end method

.method private e(I)V
    .locals 1

    .line 330
    invoke-static {p1}, Lo/erh;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$4;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;I)V

    invoke-static {v0}, Lo/erh;->c(Lo/erh$b;)V

    goto :goto_0

    .line 339
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(I)V

    .line 342
    :goto_0
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 5

    .line 182
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_current_run_plan:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d:Landroid/widget/LinearLayout;

    .line 183
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_run_plan_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c:Landroid/widget/RelativeLayout;

    .line 184
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_run_plan_more_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->f:Landroid/widget/ImageView;

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v4

    .line 188
    if-eqz v4, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 193
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->rv_create_run_plan:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    .line 194
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 195
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 199
    new-instance v0, Lo/bwz;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->h:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    const/16 v3, 0x65

    invoke-direct {v0, v3, v1, v2}, Lo/bwz;-><init>(ILjava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->i:Lo/bwz;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->i:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 204
    sget v0, Lcom/huawei/ui/homehealth/R$id;->rv_current_run_plan:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    .line 206
    new-instance v0, Lo/bxc;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->g:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bxc;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->k:Lo/bxc;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->k:Lo/bxc;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 224
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->t:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->m:Landroid/widget/LinearLayout;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    .line 529
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_run_course_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->z:Landroid/widget/RelativeLayout;

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->z:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 545
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_course_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->r:Landroid/widget/TextView;

    .line 546
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_course_more_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->q:Landroid/widget/ImageView;

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v2

    .line 549
    if-eqz v2, :cond_0

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 553
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_runcourse_enter:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->t:Landroid/widget/LinearLayout;

    .line 554
    sget v0, Lcom/huawei/ui/homehealth/R$id;->rv_runcourse_course:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    .line 555
    new-instance v2, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 556
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->u:Lo/erz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->s:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$9;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 581
    return-void
.end method

.method public d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V
    .locals 7

    .line 379
    if-eqz p1, :cond_0

    .line 380
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    new-instance v3, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$7;

    invoke-direct {v3, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$7;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    .line 410
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_LAST_RECOMMEND_TIME"

    .line 412
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lo/ffk;->c(JI)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 409
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 416
    :cond_0
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->B:Landroid/os/Handler;

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->B:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 421
    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 667
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 668
    if-eqz p3, :cond_0

    .line 671
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-string v1, "sportLevel"

    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    .line 672
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireReason()I

    move-result v1

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireValue()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/erh;->b(IID)V

    .line 674
    invoke-direct {p0, v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 677
    goto :goto_0

    .line 675
    :catch_0
    move-exception v4

    .line 676
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    goto :goto_0

    .line 679
    :cond_0
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
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

    .line 140
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->frag_oversea_fitness:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 143
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b:Landroid/content/Context;

    .line 145
    invoke-direct {p0, v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(Landroid/view/View;)V

    .line 147
    invoke-direct {p0, v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c(Landroid/view/View;)V

    .line 149
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a(Landroid/view/View;)V

    .line 155
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HS_FitnessOverseaFragment"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->v:Landroid/os/HandlerThread;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->v:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 157
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->v:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->y:Landroid/os/Handler;

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->y:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$3;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 169
    return-object v4
.end method

.method public onResume()V
    .locals 0

    .line 175
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 176
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a()V

    .line 177
    return-void
.end method
