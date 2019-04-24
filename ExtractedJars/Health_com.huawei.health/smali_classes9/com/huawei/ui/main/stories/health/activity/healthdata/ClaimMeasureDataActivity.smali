.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;
.super Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/fdk;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;
    }
.end annotation


# instance fields
.field private A:Z

.field private C:Lo/egy;

.field private a:Lo/fcg;

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:Lo/fcr;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acu;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aht;>;"
        }
    .end annotation
.end field

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/RelativeLayout;

.field private m:I

.field private n:Landroid/widget/TextView;

.field private o:I

.field private p:Landroid/widget/TextView;

.field private q:Lo/emr;

.field private r:Ljava/lang/String;

.field private s:Landroid/widget/TextView;

.field private t:Lo/egn;

.field private u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

.field private v:Lo/egv;

.field private w:Lo/egw;

.field private x:Landroid/view/View;

.field private y:Landroid/widget/ListView;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;-><init>()V

    .line 139
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->m:I

    return-void
.end method

.method private a()V
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 216
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/ui/main/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_claim_data_claiming:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 221
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i()V

    return-void
.end method

.method private b(Landroid/widget/ListView;Landroid/widget/BaseAdapter;)I
    .locals 8

    .line 459
    const/4 v2, 0x0

    .line 460
    const/4 v3, 0x0

    .line 461
    invoke-static {p1}, Lo/ahf;->a(Landroid/widget/ListView;)I

    move-result v4

    .line 462
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 463
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 464
    invoke-virtual {v6}, Landroid/view/Display;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/high16 v1, 0x42700000    # 60.0f

    invoke-static {p0, v1}, Lo/fef;->a(Landroid/content/Context;F)I

    move-result v1

    sub-int v7, v0, v1

    .line 465
    if-ge v4, v7, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v7

    .line 466
    :goto_0
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int v3, v2, v0

    .line 467
    return v3
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method private b(Lo/acu;)Z
    .locals 9

    .line 382
    const/4 v4, 0x1

    .line 384
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 385
    return v4

    .line 387
    :cond_0
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v5

    .line 388
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "last weight :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    invoke-virtual {v0}, Lo/fcg;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/aht;

    .line 391
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 392
    invoke-static {v5, v6}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-virtual {v8}, Lo/aht;->b()D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_2

    .line 394
    const/4 v4, 0x0

    goto :goto_1

    .line 397
    :cond_1
    invoke-virtual {v8}, Lo/aht;->b()D

    move-result-wide v0

    sub-double v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_2

    .line 398
    const/4 v4, 0x0

    .line 401
    :cond_2
    :goto_1
    goto :goto_0

    .line 402
    :cond_3
    return v4
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcg;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Lo/acu;)Z
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b(Lo/acu;)Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 3

    .line 253
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p:Landroid/widget/TextView;

    .line 254
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_claim:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->n:Landroid/widget/TextView;

    .line 256
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_all_check:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->s:Landroid/widget/TextView;

    .line 258
    sget v0, Lcom/huawei/ui/main/R$id;->custome_title_bar_weight_measure:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->q:Lo/emr;

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->q:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_select_cancel:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 262
    sget v0, Lcom/huawei/ui/main/R$id;->rl_claim_weight_data_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h:Landroid/widget/RelativeLayout;

    .line 263
    sget v0, Lcom/huawei/ui/main/R$id;->rl_claim_weight_data_claim:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i:Landroid/widget/RelativeLayout;

    .line 264
    sget v0, Lcom/huawei/ui/main/R$id;->rl_claim_weight_data_all_check:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->l:Landroid/widget/RelativeLayout;

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 269
    sget v0, Lcom/huawei/ui/main/R$id;->iv_claim_weight_data_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->f:Landroid/widget/ImageView;

    .line 270
    sget v0, Lcom/huawei/ui/main/R$id;->iv_claim_weight_data_claim:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->g:Landroid/widget/ImageView;

    .line 271
    sget v0, Lcom/huawei/ui/main/R$id;->iv_claim_weight_data_all_check:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k:Landroid/widget/ImageView;

    .line 273
    sget v0, Lcom/huawei/ui/main/R$id;->_claim_weight_data_recycler_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b:Landroid/support/v7/widget/RecyclerView;

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Lo/acu;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e(Lo/acu;)V

    return-void
.end method

.method private d(Lo/acu;)V
    .locals 5

    .line 413
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user.getName()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_measure_data_claim_hint:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 416
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "content"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_measure_data_claim:I

    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$10;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_claim_data_claim:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 423
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 438
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->v:Lo/egv;

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->v:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 440
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Lo/acu;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d(Lo/acu;)V

    return-void
.end method

.method private e(Lo/acu;)V
    .locals 5

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    invoke-virtual {v0}, Lo/fcg;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 497
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWeightData mBean size,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->r:Ljava/lang/String;

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->removeMessages(I)V

    .line 500
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$7;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    invoke-virtual {v0, v4, p1, v1, v2}, Lo/ahw;->e(Ljava/util/ArrayList;Lo/acu;Ljava/lang/String;Lo/abz;)V

    .line 513
    return-void
.end method

.method private f()V
    .locals 3

    .line 339
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->n()V

    .line 340
    sget v0, Lcom/huawei/ui/main/R$layout;->select_user:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->x:Landroid/view/View;

    .line 341
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k()V

    .line 342
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_claim_data_select_user:I

    invoke-virtual {v0, v1}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->x:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 367
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 372
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 374
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b()V

    .line 375
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcr;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    return-object v0
.end method

.method private g()V
    .locals 7

    .line 285
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_weight_delete_check_measure_data:I

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 286
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    if-nez v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->q:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_selectNone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_claim_weight_data_data_operation_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_claim_weight_data_data_operation_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->measure_weight_data_no_mearsure:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->measure_weight_data_no_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_select:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    goto/16 :goto_1

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->q:Lo/emr;

    invoke-virtual {v0, v6}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_claim_weight_data_data_operation:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_claim_weight_data_data_operation:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->measure_weight_data_cmearsure:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->measure_weight_data_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->measure_weight_data_all_check:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 308
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 309
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->A:Z

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_contact_delete_uncheck_all:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 312
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->A:Z

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_select:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 321
    :goto_1
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->m:I

    if-nez v0, :cond_2

    .line 322
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->finish()V

    .line 324
    :cond_2
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/egw;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    return-object v0
.end method

.method private h()Z
    .locals 1

    .line 485
    invoke-static {p0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 486
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_not_network:I

    invoke-static {p0, v0}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 487
    const/4 v0, 0x0

    return v0

    .line 489
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private i()V
    .locals 2

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    if-nez v0, :cond_0

    .line 328
    new-instance v0, Lo/fcg;

    invoke-direct {v0, p0, p0}, Lo/fcg;-><init>(Landroid/content/Context;Lo/fdk;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 331
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    sget-object v1, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v1}, Lo/ahw;->e()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fcg;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    .line 332
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->x:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_creat_user_info:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->x:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->lv_claim_weight_data_select_user:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->y:Landroid/widget/ListView;

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->x:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->ll_claim_weight_data_select_user:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->z:Landroid/widget/LinearLayout;

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->y:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    invoke-virtual {v0}, Lo/fcr;->getCount()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 479
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 481
    :cond_0
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 482
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/egv;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->v:Lo/egv;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 629
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_delete_data_hint:I

    .line 630
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 631
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_heart_delete:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$8;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 637
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 644
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->C:Lo/egy;

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->C:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->C:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 647
    return-void
.end method

.method private m()V
    .locals 3

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->removeMessages(I)V

    .line 603
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    invoke-virtual {v1}, Lo/fcg;->d()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$6;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    invoke-virtual {v0, v1, p0, v2}, Lo/ahw;->d(Ljava/util/ArrayList;Landroid/content/Context;Lo/cma;)V

    .line 615
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->m()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/egy;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->C:Lo/egy;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 539
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    .line 540
    new-instance v0, Lo/fcr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lo/fcr;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    .line 542
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v2

    .line 545
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 546
    invoke-virtual {v2}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    invoke-virtual {v0, v3}, Lo/fcr;->d(I)V

    .line 548
    goto :goto_1

    .line 545
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 551
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Ljava/util/List;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x6

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendEmptyMessageDelayed(IJ)Z

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    invoke-virtual {v0}, Lo/fcg;->e()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    .line 620
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    invoke-virtual {v0}, Lo/fcg;->notifyDataSetChanged()V

    .line 621
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_claim_data_delete_success_hint:I

    invoke-static {p0, v0}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 622
    return-void
.end method

.method private p()V
    .locals 5

    .line 516
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncDataStart in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->removeMessages(I)V

    .line 518
    new-instance v4, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 519
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 520
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 521
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 522
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 523
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 524
    invoke-static {p0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$9;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 535
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Z
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->y:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b(Landroid/widget/ListView;Landroid/widget/BaseAdapter;)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 447
    const/4 v0, -0x1

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 452
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->t:Lo/egn;

    .line 231
    :cond_0
    return-void
.end method

.method public d(II)V
    .locals 2

    .line 556
    iput p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    .line 557
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->m:I

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendEmptyMessage(I)Z

    .line 561
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .line 658
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 660
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 661
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 662
    if-eqz p3, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    if-eqz v0, :cond_2

    .line 663
    const-string v0, "userID"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 664
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 665
    return-void

    .line 667
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v3}, Lo/act;->c(Ljava/lang/String;)Lo/acu;

    move-result-object v4

    .line 668
    if-nez v4, :cond_1

    .line 669
    return-void

    .line 671
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 672
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 673
    const/4 v0, 0x5

    iput v0, v5, Landroid/os/Message;->what:I

    .line 674
    const/4 v0, 0x0

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 675
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendMessage(Landroid/os/Message;)Z

    .line 676
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 677
    const/4 v0, 0x4

    iput v0, v6, Landroid/os/Message;->what:I

    .line 678
    iput-object v4, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 679
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v6, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 683
    :cond_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 569
    sget v0, Lcom/huawei/ui/main/R$id;->rl_claim_weight_data_all_check:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 571
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->A:Z

    if-nez v0, :cond_0

    .line 572
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->A:Z

    goto :goto_0

    .line 574
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->A:Z

    .line 576
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->A:Z

    invoke-virtual {v0, v1}, Lo/fcg;->e(Z)V

    goto :goto_1

    .line 579
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->rl_claim_weight_data_delete:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 581
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    if-lez v0, :cond_4

    .line 582
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->l()V

    goto :goto_1

    .line 585
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->rl_claim_weight_data_claim:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 587
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o:I

    if-lez v0, :cond_4

    .line 588
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->f()V

    goto :goto_1

    .line 591
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_creat_user_info:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 592
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 593
    const-string v0, "weight_user_id_key"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 594
    const-string v0, "claimWeightData"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 595
    const/4 v0, 0x0

    invoke-virtual {p0, v2, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 598
    :cond_4
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 234
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 235
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_claim_measure_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->setContentView(I)V

    .line 236
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v0}, Lo/ahw;->b()V

    .line 237
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    .line 238
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d()V

    .line 239
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i()V

    .line 241
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$3;

    invoke-direct {v2, p0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/ahw;->d(Ljava/lang/String;Lo/ajj;)V

    .line 249
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->removeMessages(I)V

    .line 690
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p()V

    .line 692
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onDestroy()V

    .line 693
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 695
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e:Ljava/util/List;

    .line 698
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 699
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 700
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d:Ljava/util/List;

    .line 704
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    if-eqz v0, :cond_3

    .line 705
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a:Lo/fcg;

    .line 708
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    if-eqz v0, :cond_4

    .line 709
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c:Lo/fcr;

    .line 711
    :cond_4
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v0}, Lo/ahw;->f()V

    .line 712
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahw;->b(Ljava/lang/String;)V

    .line 713
    invoke-static {}, Lo/ahu;->c()V

    .line 714
    return-void
.end method
