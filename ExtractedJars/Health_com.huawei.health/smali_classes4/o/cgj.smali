.class public Lo/cgj;
.super Landroid/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lo/ekw;

.field private b:Lo/ekm;

.field private c:Ljava/util/concurrent/ExecutorService;

.field private d:Lo/cfe;

.field private e:Lo/ekm$c;

.field private f:I

.field private g:I

.field private h:Landroid/view/View;

.field private i:Lo/chz;

.field private k:I

.field private n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/ekm$c;Lo/elb;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgj;->b:Lo/ekm;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgj;->a:Lo/ekw;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgj;->d:Lo/cfe;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/cgj;->f:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/cgj;->g:I

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/cgj;->k:I

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgj;->i:Lo/chz;

    .line 279
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cgj;->n:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lo/cgj;Lo/ekm$c;)Lo/elb;
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/cgj;->b(Lo/ekm$c;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 266
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initdata ---- --------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/cgj$3;

    invoke-direct {v1, p0}, Lo/cgj$3;-><init>(Lo/cgj;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 273
    return-void
.end method

.method static synthetic a(Lo/cgj;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/cgj;->a()V

    return-void
.end method

.method static synthetic b(Lo/cgj;)Ljava/util/Map;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/cgj;->n:Ljava/util/Map;

    return-object v0
.end method

.method private b(Lo/ekm$c;)Lo/elb;
    .locals 5

    .line 293
    sget-object v0, Lo/cgj$7;->b:[I

    invoke-virtual {p1}, Lo/ekm$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 295
    :pswitch_0
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->a(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 296
    goto/16 :goto_1

    .line 299
    :pswitch_1
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->e(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 300
    goto/16 :goto_1

    .line 303
    :pswitch_2
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 304
    goto/16 :goto_1

    .line 306
    :pswitch_3
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->c(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 307
    goto/16 :goto_1

    .line 309
    :pswitch_4
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->b(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 310
    goto :goto_1

    .line 312
    :pswitch_5
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->h(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 313
    goto :goto_1

    .line 315
    :pswitch_6
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cfe;->k(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v4

    .line 316
    goto :goto_1

    .line 318
    :pswitch_7
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;I)Lo/elb;

    move-result-object v4

    .line 319
    goto :goto_1

    .line 321
    :pswitch_8
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    iget-object v1, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v2, Lo/cfe$a;

    invoke-direct {v2}, Lo/cfe$a;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lo/cfe$a;->c(Z)Lo/cfe$a;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v0, v1, v2, v3}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;I)Lo/elb;

    move-result-object v4

    .line 322
    goto :goto_1

    .line 324
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 326
    :goto_1
    return-object v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private b()V
    .locals 5

    .line 282
    iget-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    invoke-direct {p0, v0}, Lo/cgj;->b(Lo/ekm$c;)Lo/elb;

    move-result-object v4

    .line 283
    if-nez v4, :cond_0

    .line 284
    return-void

    .line 286
    :cond_0
    iget-object v0, p0, Lo/cgj;->n:Ljava/util/Map;

    iget-object v1, p0, Lo/cgj;->e:Lo/ekm$c;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBaseLine refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lo/cgj;->a:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 289
    return-void
.end method

.method private b(Lo/ekm$c;Z)V
    .locals 5

    .line 335
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 336
    if-eqz p2, :cond_0

    .line 337
    iget v0, p0, Lo/cgj;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cgj;->f:I

    .line 338
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 340
    :cond_0
    iget v0, p0, Lo/cgj;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/cgj;->f:I

    .line 341
    const-string v0, "click"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    :goto_0
    sget-object v0, Lo/cgj$7;->b:[I

    invoke-virtual {p1}, Lo/ekm$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 345
    :pswitch_0
    const-string v0, "clickButton"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    goto :goto_2

    .line 348
    :pswitch_1
    const-string v0, "clickButton"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    goto :goto_2

    .line 351
    :pswitch_2
    const-string v0, "clickButton"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    goto :goto_2

    .line 354
    :pswitch_3
    const-string v0, "clickButton"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    goto :goto_2

    .line 357
    :goto_1
    const-string v0, "clickButton"

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    :goto_2
    const-string v0, "base"

    iget v1, p0, Lo/cgj;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    const-string v0, "totalChart"

    iget v1, p0, Lo/cgj;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    const-string v0, "layerNums"

    iget v1, p0, Lo/cgj;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->hU:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 364
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic c(Lo/cgj;)Lo/ekm$c;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    return-object v0
.end method

.method static synthetic d(Lo/cgj;)Lo/ekw;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/cgj;->a:Lo/ekw;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 367
    iget-object v0, p0, Lo/cgj;->a:Lo/ekw;

    new-instance v1, Lo/cgj$6;

    invoke-direct {v1, p0}, Lo/cgj$6;-><init>(Lo/cgj;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 382
    return-void
.end method

.method static synthetic e(Lo/cgj;)Lo/cfe;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    return-object v0
.end method

.method private e()V
    .locals 0

    .line 276
    invoke-direct {p0}, Lo/cgj;->b()V

    .line 277
    return-void
.end method

.method static synthetic e(Lo/cgj;Lo/ekm$c;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lo/cgj;->b(Lo/ekm$c;Z)V

    return-void
.end method

.method static synthetic f(Lo/cgj;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/cgj;->e()V

    return-void
.end method

.method static synthetic g(Lo/cgj;)Lo/chz;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/cgj;->i:Lo/chz;

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .line 69
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_linechart_frag:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    .line 71
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v0

    iput-object v0, p0, Lo/cgj;->d:Lo/cfe;

    .line 73
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    if-nez v0, :cond_0

    .line 74
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTrackLineChartHolder null,destroy!!! kill by mine"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    iget-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->linechart_titlebar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ekm;

    iput-object v0, p0, Lo/cgj;->b:Lo/ekm;

    .line 80
    new-instance v0, Lo/cgj$2;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cgj$2;-><init>(Lo/cgj;Landroid/content/Context;)V

    iput-object v0, p0, Lo/cgj;->i:Lo/chz;

    .line 107
    iget-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->markerview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 109
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 112
    const/16 v0, 0x10

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 113
    iget-object v0, p0, Lo/cgj;->i:Lo/chz;

    invoke-virtual {v4, v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    iget-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_new_heartview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ekw;

    iput-object v0, p0, Lo/cgj;->a:Lo/ekw;

    .line 116
    invoke-direct {p0}, Lo/cgj;->d()V

    .line 118
    invoke-virtual {p0}, Lo/cgj;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    .line 120
    if-nez v6, :cond_1

    .line 121
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    return-object v0

    .line 125
    :cond_1
    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v7

    .line 126
    const-string v0, "KEY_BASELINE"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 127
    const-string v0, "sportType"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 128
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "baseLine isEmpty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    return-object v0

    .line 132
    :cond_2
    move-object v10, v8

    const/4 v11, -0x1

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "BASELINE_HEART_RATE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x0

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "BASELINE_STEP_FRE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "BASELINE_ALTITUDE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "BASELINE_SPEED_RATE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "BASELINE_PULL_FREQ"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "BASELINE_SWOLF"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "BASELINE_REALTIME_PACE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x6

    goto :goto_0

    :sswitch_7
    const-string v0, "BASELINE_GROUND_CONTACT_TIME"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v11, 0x7

    goto :goto_0

    :sswitch_8
    const-string v0, "BASELINE_GROUND_IMPACT_ACCELERATION"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v11, 0x8

    :cond_3
    :goto_0
    packed-switch v11, :pswitch_data_0

    goto/16 :goto_1

    .line 134
    :pswitch_0
    sget-object v0, Lo/ekm$c;->a:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 135
    const/4 v0, 0x0

    iput v0, p0, Lo/cgj;->g:I

    .line 136
    goto/16 :goto_2

    .line 139
    :pswitch_1
    sget-object v0, Lo/ekm$c;->b:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 140
    const/4 v0, 0x1

    iput v0, p0, Lo/cgj;->g:I

    .line 141
    goto :goto_2

    .line 144
    :pswitch_2
    sget-object v0, Lo/ekm$c;->d:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 145
    const/4 v0, 0x2

    iput v0, p0, Lo/cgj;->g:I

    .line 146
    goto :goto_2

    .line 148
    :pswitch_3
    sget-object v0, Lo/ekm$c;->c:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 149
    const/4 v0, 0x3

    iput v0, p0, Lo/cgj;->g:I

    .line 150
    goto :goto_2

    .line 152
    :pswitch_4
    sget-object v0, Lo/ekm$c;->k:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 153
    const/4 v0, 0x5

    iput v0, p0, Lo/cgj;->g:I

    .line 154
    goto :goto_2

    .line 157
    :pswitch_5
    sget-object v0, Lo/ekm$c;->i:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 158
    const/4 v0, 0x4

    iput v0, p0, Lo/cgj;->g:I

    .line 159
    goto :goto_2

    .line 162
    :pswitch_6
    sget-object v0, Lo/ekm$c;->e:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 163
    const/4 v0, 0x6

    iput v0, p0, Lo/cgj;->g:I

    .line 164
    goto :goto_2

    .line 167
    :pswitch_7
    sget-object v0, Lo/ekm$c;->f:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 168
    const/4 v0, 0x7

    iput v0, p0, Lo/cgj;->g:I

    .line 169
    goto :goto_2

    .line 172
    :pswitch_8
    sget-object v0, Lo/ekm$c;->g:Lo/ekm$c;

    iput-object v0, p0, Lo/cgj;->e:Lo/ekm$c;

    .line 173
    const/16 v0, 0x8

    iput v0, p0, Lo/cgj;->g:I

    .line 174
    goto :goto_2

    .line 178
    :goto_1
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "baseLine unrecognized!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    :goto_2
    iget-object v0, p0, Lo/cgj;->b:Lo/ekm;

    iget-object v1, p0, Lo/cgj;->e:Lo/ekm$c;

    invoke-virtual {v0, v1}, Lo/ekm;->setBaseLine(Lo/ekm$c;)V

    .line 183
    iget-object v0, p0, Lo/cgj;->b:Lo/ekm;

    new-instance v1, Lo/cgj$4;

    invoke-direct {v1, p0}, Lo/cgj$4;-><init>(Lo/cgj;)V

    invoke-virtual {v0, v1}, Lo/ekm;->setOnLineStatusChangedListener(Lo/ekm$e;)V

    .line 198
    iget-object v0, p0, Lo/cgj;->b:Lo/ekm;

    new-instance v1, Lo/cgj$1;

    invoke-direct {v1, p0}, Lo/cgj$1;-><init>(Lo/cgj;)V

    invoke-virtual {v0, v1}, Lo/ekm;->setOnBackListener(Landroid/view/View$OnClickListener;)V

    .line 204
    iget-object v0, p0, Lo/cgj;->a:Lo/ekw;

    iget-object v1, p0, Lo/cgj;->b:Lo/ekm;

    invoke-virtual {v0, v1}, Lo/ekw;->setTitleBar(Lo/ekm;)V

    .line 206
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 208
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 209
    sget-object v0, Lo/ekm$c;->a:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    :cond_4
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->l()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 212
    sget-object v0, Lo/ekm$c;->b:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    :cond_5
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->r()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 215
    sget-object v0, Lo/ekm$c;->d:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    :cond_6
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->u()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v9}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 218
    sget-object v0, Lo/ekm$c;->c:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    :cond_7
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->s()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 221
    sget-object v0, Lo/ekm$c;->i:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    :cond_8
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->q()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 225
    sget-object v0, Lo/ekm$c;->k:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    :cond_9
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->t()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {v9}, Lo/cgl;->c(I)Z

    move-result v0

    if-nez v0, :cond_a

    .line 229
    sget-object v0, Lo/ekm$c;->e:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    :cond_a
    iget-object v0, p0, Lo/cgj;->d:Lo/cfe;

    invoke-virtual {v0}, Lo/cfe;->x()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 233
    sget-object v0, Lo/ekm$c;->f:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    sget-object v0, Lo/ekm$c;->g:Lo/ekm$c;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_b
    iget-object v0, p0, Lo/cgj;->b:Lo/ekm;

    invoke-virtual {v0, v10}, Lo/ekm;->setIconClickable(Ljava/util/List;)V

    .line 240
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/cgj;->k:I

    .line 241
    const/4 v0, 0x1

    iput v0, p0, Lo/cgj;->f:I

    .line 245
    iget-object v0, p0, Lo/cgj;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_c

    .line 246
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cgj;->c:Ljava/util/concurrent/ExecutorService;

    .line 248
    :cond_c
    iget-object v0, p0, Lo/cgj;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cgj$5;

    invoke-direct {v1, p0}, Lo/cgj$5;-><init>(Lo/cgj;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 254
    iget-object v0, p0, Lo/cgj;->h:Landroid/view/View;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x76d9806d -> :sswitch_0
        -0x4d230d96 -> :sswitch_7
        -0x3c0d3d48 -> :sswitch_4
        -0x387ef155 -> :sswitch_5
        -0x2bf46e40 -> :sswitch_1
        -0x7ca2ca4 -> :sswitch_2
        0x18ebed -> :sswitch_6
        0x1fba265b -> :sswitch_8
        0x3bc54832 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public onStart()V
    .locals 4

    .line 261
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 262
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart ---- --------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    return-void
.end method
