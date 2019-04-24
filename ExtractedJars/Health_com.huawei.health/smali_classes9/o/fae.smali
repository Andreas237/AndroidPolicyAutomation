.class public Lo/fae;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fae$c;,
        Lo/fae$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Ljava/lang/String;

.field private C:I

.field private D:I

.field private E:Landroid/graphics/PointF;

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eux;>;"
        }
    .end annotation
.end field

.field private G:I

.field private H:F

.field private I:F

.field private J:Z

.field private K:I

.field private L:Z

.field private M:I

.field private N:I

.field private O:F

.field private P:J

.field private Q:F

.field private R:Z

.field private S:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eyb;>;"
        }
    .end annotation
.end field

.field private T:I

.field private U:F

.field private V:F

.field private W:Z

.field private a:F

.field private aa:Ljava/util/Date;

.field private ab:Ljava/lang/String;

.field private ac:Ljava/lang/String;

.field private ad:Lo/fae$c;

.field private ag:F

.field private ah:F

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:F

.field private e:I

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:Z

.field private k:F

.field private l:Z

.field private m:I

.field private n:F

.field private o:F

.field private p:Z

.field private q:I

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eux;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private t:[Ljava/lang/String;

.field private u:[Ljava/lang/String;

.field private v:I

.field private w:I

.field private x:Lo/eux;

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 196
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fae;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 197
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 200
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 81
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fae;->d:F

    .line 83
    const/high16 v0, 0x42200000    # 40.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fae;->a:F

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->c:Z

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->e:I

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->p:Z

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->m:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->q:I

    .line 123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fae;->s:Ljava/util/List;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fae;->r:Ljava/util/List;

    .line 129
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 143
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 147
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lo/fae;->H:F

    .line 149
    const/high16 v0, 0x42340000    # 45.0f

    iput v0, p0, Lo/fae;->I:F

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fae;->F:Ljava/util/List;

    .line 154
    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, -0x40800000    # -1.0f

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lo/fae;->E:Landroid/graphics/PointF;

    .line 156
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->G:I

    .line 158
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->M:I

    .line 160
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->K:I

    .line 162
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->N:I

    .line 168
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->R:Z

    .line 170
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fae;->P:J

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fae;->S:Ljava/util/ArrayList;

    .line 192
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->ag:F

    .line 194
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->ah:F

    .line 201
    iput-object p1, p0, Lo/fae;->b:Landroid/content/Context;

    .line 203
    new-instance v0, Lo/fae$1;

    invoke-direct {v0, p0}, Lo/fae$1;-><init>(Lo/fae;)V

    invoke-virtual {p0, v0}, Lo/fae;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 209
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 3

    .line 1980
    const-string v2, ""

    .line 1981
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1983
    :pswitch_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_deepsleep:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1984
    goto :goto_1

    .line 1986
    :pswitch_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1987
    goto :goto_1

    .line 1989
    :pswitch_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_noontime_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1990
    goto :goto_1

    .line 1992
    :pswitch_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_sleep_latency:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1993
    goto :goto_1

    .line 1995
    :pswitch_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_rem_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1996
    goto :goto_1

    .line 1998
    :goto_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 2001
    :goto_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method

.method private a(II)Ljava/lang/String;
    .locals 8

    .line 1844
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 1845
    move-object v0, v6

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    move v4, p1

    move v5, p2

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 1846
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v7

    .line 1847
    return-object v7
.end method

.method private a(IF)Lo/fae$b;
    .locals 4

    .line 2106
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v2

    .line 2107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2108
    new-instance v3, Lo/fae$b;

    invoke-direct {v3}, Lo/fae$b;-><init>()V

    .line 2109
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 2111
    :pswitch_0
    iput v2, v3, Lo/fae$b;->c:F

    .line 2112
    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->b:F

    .line 2113
    goto :goto_1

    .line 2115
    :pswitch_1
    sub-float v0, p2, v2

    const v1, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->c:F

    .line 2116
    sub-float v0, p2, v2

    const v1, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v3, Lo/fae$b;->b:F

    .line 2117
    goto :goto_1

    .line 2119
    :pswitch_2
    sub-float v0, p2, v2

    const v1, 0x3f28f5c3    # 0.66f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->c:F

    .line 2120
    sub-float v0, p2, v2

    const v1, 0x3f28f5c3    # 0.66f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v3, Lo/fae$b;->b:F

    .line 2121
    goto :goto_1

    .line 2123
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2126
    :goto_1
    return-object v3

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a()V
    .locals 8

    .line 571
    iget-object v5, p0, Lo/fae;->S:Ljava/util/ArrayList;

    .line 572
    const/4 v6, 0x0

    .line 573
    const/4 v7, 0x0

    .line 575
    if-eqz v5, :cond_0

    .line 576
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 578
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    if-nez v7, :cond_3

    .line 580
    :cond_1
    iget-boolean v0, p0, Lo/fae;->R:Z

    if-nez v0, :cond_2

    .line 581
    iget-object v0, p0, Lo/fae;->ad:Lo/fae$c;

    const-string v1, ""

    const-string v2, ""

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/fae$c;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 583
    :cond_2
    return-void

    .line 585
    :cond_3
    add-int/lit8 v0, v7, -0x1

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eyb;

    .line 586
    iget-object v0, v6, Lo/eyb;->d:Ljava/lang/String;

    iput-object v0, p0, Lo/fae;->B:Ljava/lang/String;

    .line 587
    iget-object v0, p0, Lo/fae;->ad:Lo/fae$c;

    iget-object v1, p0, Lo/fae;->B:Ljava/lang/String;

    iget v2, v6, Lo/eyb;->i:I

    invoke-direct {p0, v2}, Lo/fae;->a(I)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, v6, Lo/eyb;->b:D

    double-to-int v3, v3

    invoke-interface {v0, v1, v2, v3}, Lo/fae$c;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 589
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 27

    .line 405
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 407
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fae;->x:Lo/eux;

    .line 408
    return-void

    .line 411
    :cond_1
    const/4 v10, 0x0

    .line 413
    const/4 v11, 0x0

    .line 415
    const/4 v12, 0x0

    .line 417
    const/4 v13, 0x0

    .line 419
    const/4 v14, 0x0

    .line 421
    const/4 v15, 0x0

    .line 423
    const/16 v16, 0x0

    .line 425
    move-object/from16 v0, p0

    iget v13, v0, Lo/fae;->g:F

    .line 430
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v19

    .line 431
    const/16 v20, 0x0

    :goto_0
    move/from16 v0, v20

    move/from16 v1, v19

    if-ge v0, v1, :cond_19

    .line 432
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/eux;

    .line 433
    invoke-virtual/range {v17 .. v17}, Lo/eux;->e()I

    move-result v21

    .line 434
    invoke-virtual/range {v17 .. v17}, Lo/eux;->d()I

    move-result v22

    .line 435
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->l:Z

    if-eqz v0, :cond_a

    .line 436
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lo/fae;->c(IF)Lo/fae$b;

    move-result-object v23

    .line 437
    move/from16 v0, v21

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v10, v0, v1

    .line 438
    move/from16 v0, v22

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v12, v0, v1

    .line 440
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 441
    move/from16 v24, v10

    .line 442
    move/from16 v25, v12

    .line 443
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v10, v0, v25

    .line 444
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v12, v0, v24

    .line 446
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lo/fae;->d(Lo/eux;)V

    .line 447
    add-int/lit8 v0, v20, 0x1

    move/from16 v1, v19

    if-ge v0, v1, :cond_8

    .line 448
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    add-int/lit8 v1, v20, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/eux;

    .line 449
    move/from16 v0, v21

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v14, v0, v1

    .line 450
    move/from16 v0, v22

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v15, v0, v1

    .line 452
    sub-float v0, v12, v14

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    const/16 v24, 0x1

    goto :goto_1

    :cond_3
    const/16 v24, 0x0

    .line 454
    :goto_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 455
    move/from16 v25, v14

    .line 456
    move/from16 v26, v15

    .line 457
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v14, v0, v26

    .line 458
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v15, v0, v25

    .line 459
    sub-float v0, v10, v15

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_4

    const/16 v24, 0x1

    goto :goto_2

    :cond_4
    const/16 v24, 0x0

    .line 461
    :cond_5
    :goto_2
    invoke-virtual/range {v18 .. v18}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lo/fae;->c(IF)Lo/fae$b;

    move-result-object v16

    .line 462
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->y:Z

    if-nez v0, :cond_6

    if-eqz v24, :cond_6

    .line 464
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->setCurrentRectColor(I)V

    .line 465
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    move v3, v10

    move v4, v12

    move-object/from16 v5, v23

    move-object/from16 v6, v18

    move v7, v14

    move v8, v15

    move-object/from16 v9, v16

    invoke-direct/range {v0 .. v9}, Lo/fae;->e(Landroid/graphics/Canvas;Lo/eux;FFLo/fae$b;Lo/eux;FFLo/fae$b;)V

    goto :goto_3

    .line 467
    :cond_6
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v1, v0, :cond_7

    .line 468
    move-object/from16 v0, p0

    const/16 v1, 0x2c6

    invoke-direct {v0, v1}, Lo/fae;->setCurrentRectColor(I)V

    goto :goto_3

    .line 470
    :cond_7
    move-object/from16 v0, p0

    const/16 v1, 0x2bc

    invoke-direct {v0, v1}, Lo/fae;->setCurrentRectColor(I)V

    .line 473
    :goto_3
    goto :goto_4

    .line 474
    :cond_8
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v1, v0, :cond_9

    .line 475
    move-object/from16 v0, p0

    const/16 v1, 0x2c6

    invoke-direct {v0, v1}, Lo/fae;->setCurrentRectColor(I)V

    goto :goto_4

    .line 477
    :cond_9
    move-object/from16 v0, p0

    const/16 v1, 0x2bc

    invoke-direct {v0, v1}, Lo/fae;->setCurrentRectColor(I)V

    .line 480
    :goto_4
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v23

    iget v3, v3, Lo/fae$b;->c:F

    move v4, v12

    move-object/from16 v5, v23

    iget v5, v5, Lo/fae$b;->b:F

    invoke-direct/range {v0 .. v5}, Lo/fae;->e(Landroid/graphics/Canvas;FFFF)V

    .line 481
    goto/16 :goto_9

    :cond_a
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->p:Z

    if-eqz v0, :cond_12

    .line 483
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_b

    .line 484
    goto/16 :goto_9

    .line 486
    :cond_b
    invoke-virtual/range {v17 .. v17}, Lo/eux;->e()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->N:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v10, v0, v1

    .line 487
    invoke-virtual/range {v17 .. v17}, Lo/eux;->d()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->N:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v12, v0, v1

    .line 489
    const/4 v0, 0x1

    move/from16 v1, v20

    if-ne v0, v1, :cond_c

    .line 490
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data.getStartPoint() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lo/eux;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mNightStartPoint = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fae;->K:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mNightEndPoint = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fae;->N:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; left = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mViewWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fae;->f:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mDiagramWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fae;->i:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "CHART_BORDER_WIDTH = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fae;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    :cond_c
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lo/fae;->b(IF)Lo/fae$b;

    move-result-object v23

    .line 496
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->setCurrentRectColor(I)V

    .line 498
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 499
    move/from16 v24, v10

    .line 500
    move/from16 v25, v12

    .line 501
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v10, v0, v25

    .line 502
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v12, v0, v24

    .line 504
    :cond_d
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lo/fae;->d(Lo/eux;)V

    .line 505
    add-int/lit8 v0, v20, 0x1

    move/from16 v1, v19

    if-ge v0, v1, :cond_11

    .line 506
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    add-int/lit8 v1, v20, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/eux;

    .line 507
    invoke-virtual/range {v18 .. v18}, Lo/eux;->e()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->N:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v14, v0, v1

    .line 508
    invoke-virtual/range {v18 .. v18}, Lo/eux;->d()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->N:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v15, v0, v1

    .line 510
    sub-float v0, v12, v14

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_e

    const/16 v24, 0x1

    goto :goto_5

    :cond_e
    const/16 v24, 0x0

    .line 512
    :goto_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 513
    move/from16 v25, v14

    .line 514
    move/from16 v26, v15

    .line 515
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v14, v0, v26

    .line 516
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v15, v0, v25

    .line 517
    sub-float v0, v10, v15

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_f

    const/16 v24, 0x1

    goto :goto_6

    :cond_f
    const/16 v24, 0x0

    .line 519
    :cond_10
    :goto_6
    invoke-virtual/range {v18 .. v18}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lo/fae;->b(IF)Lo/fae$b;

    move-result-object v16

    .line 520
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->y:Z

    if-nez v0, :cond_11

    if-eqz v24, :cond_11

    .line 521
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    move v3, v10

    move v4, v12

    move-object/from16 v5, v23

    move-object/from16 v6, v18

    move v7, v14

    move v8, v15

    move-object/from16 v9, v16

    invoke-direct/range {v0 .. v9}, Lo/fae;->e(Landroid/graphics/Canvas;Lo/eux;FFLo/fae$b;Lo/eux;FFLo/fae$b;)V

    .line 524
    :cond_11
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v23

    iget v3, v3, Lo/fae$b;->c:F

    move v4, v12

    move-object/from16 v5, v23

    iget v5, v5, Lo/fae$b;->b:F

    invoke-direct/range {v0 .. v5}, Lo/fae;->e(Landroid/graphics/Canvas;FFFF)V

    .line 525
    goto/16 :goto_9

    .line 527
    :cond_12
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_13

    .line 528
    goto/16 :goto_9

    .line 530
    :cond_13
    move/from16 v0, v21

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v10, v0, v1

    .line 531
    move/from16 v0, v22

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v12, v0, v1

    .line 532
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lo/fae;->a(IF)Lo/fae$b;

    move-result-object v23

    .line 533
    invoke-virtual/range {v17 .. v17}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->setCurrentRectColor(I)V

    .line 535
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 536
    move/from16 v24, v10

    .line 537
    move/from16 v25, v12

    .line 538
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v10, v0, v25

    .line 539
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v12, v0, v24

    .line 541
    :cond_14
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lo/fae;->d(Lo/eux;)V

    .line 542
    add-int/lit8 v0, v20, 0x1

    move/from16 v1, v19

    if-ge v0, v1, :cond_18

    .line 543
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    add-int/lit8 v1, v20, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/eux;

    .line 544
    invoke-virtual/range {v18 .. v18}, Lo/eux;->e()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v14, v0, v1

    .line 545
    invoke-virtual/range {v18 .. v18}, Lo/eux;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v15, v0, v1

    .line 547
    sub-float v0, v12, v14

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_15

    const/16 v24, 0x1

    goto :goto_7

    :cond_15
    const/16 v24, 0x0

    .line 549
    :goto_7
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 550
    move/from16 v25, v14

    .line 551
    move/from16 v26, v15

    .line 552
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v14, v0, v26

    .line 553
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v15, v0, v25

    .line 554
    sub-float v0, v10, v15

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_16

    const/16 v24, 0x1

    goto :goto_8

    :cond_16
    const/16 v24, 0x0

    .line 556
    :cond_17
    :goto_8
    invoke-virtual/range {v18 .. v18}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lo/fae;->a(IF)Lo/fae$b;

    move-result-object v16

    .line 558
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->y:Z

    if-nez v0, :cond_18

    if-eqz v24, :cond_18

    .line 559
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    move v3, v10

    move v4, v12

    move-object/from16 v5, v23

    move-object/from16 v6, v18

    move v7, v14

    move v8, v15

    move-object/from16 v9, v16

    invoke-direct/range {v0 .. v9}, Lo/fae;->e(Landroid/graphics/Canvas;Lo/eux;FFLo/fae$b;Lo/eux;FFLo/fae$b;)V

    .line 562
    :cond_18
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v23

    iget v3, v3, Lo/fae$b;->c:F

    move v4, v12

    move-object/from16 v5, v23

    iget v5, v5, Lo/fae$b;->b:F

    invoke-direct/range {v0 .. v5}, Lo/fae;->e(Landroid/graphics/Canvas;FFFF)V

    .line 431
    :goto_9
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_0

    .line 565
    :cond_19
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FFFF)V
    .locals 10

    .line 1424
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 1425
    new-instance v0, Landroid/graphics/LinearGradient;

    move v1, p2

    move v2, p3

    move v3, p2

    move v4, p5

    iget v5, p0, Lo/fae;->v:I

    iget v6, p0, Lo/fae;->D:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 1426
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1427
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1428
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1429
    move-object v0, p1

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1430
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FFFFFF)V
    .locals 8

    .line 1245
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 1246
    invoke-virtual {p0}, Lo/fae;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1248
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1249
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1251
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1253
    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7, p2, p3, p4, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1254
    move-object v0, p1

    move-object v1, v7

    move v2, p6

    move v3, p7

    move-object v5, v6

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 1255
    return-void
.end method

.method private a(Landroid/graphics/Canvas;IIFF)V
    .locals 19

    .line 1762
    div-int/lit8 v0, p2, 0x3c

    add-int/lit8 v4, v0, 0x14

    .line 1763
    rem-int/lit8 v5, p2, 0x3c

    .line 1764
    const/16 v0, 0x18

    if-lt v4, v0, :cond_0

    .line 1765
    add-int/lit8 v4, v4, -0x18

    .line 1767
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    invoke-direct {v1, v4}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v5}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1769
    div-int/lit8 v0, p3, 0x3c

    add-int/lit8 v7, v0, 0x14

    .line 1770
    rem-int/lit8 v8, p3, 0x3c

    .line 1771
    const/16 v0, 0x18

    if-lt v7, v0, :cond_1

    .line 1772
    add-int/lit8 v7, v7, -0x18

    .line 1775
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    invoke-direct {v1, v7}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v8}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1777
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 1778
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1779
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_101a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 1781
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_list_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1783
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->b:Landroid/content/Context;

    .line 1784
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_10:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 1783
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dbk;->c(IF)F

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1785
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1786
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->p:Z

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->l:Z

    if-nez v0, :cond_3

    .line 1787
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v10, v6, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v11, v0

    .line 1788
    sub-float v0, p4, v11

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->d:F

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->I:F

    move-object/from16 v2, p1

    invoke-virtual {v2, v6, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1789
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->d:F

    add-float v0, v0, p5

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->I:F

    move-object/from16 v2, p1

    invoke-virtual {v2, v9, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1790
    goto/16 :goto_3

    .line 1791
    :cond_3
    const-string v11, ""

    .line 1792
    const-string v12, ""

    .line 1793
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1794
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fae;->a(II)Ljava/lang/String;

    move-result-object v12

    .line 1795
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8}, Lo/fae;->a(II)Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    .line 1797
    :cond_4
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fae;->a(II)Ljava/lang/String;

    move-result-object v11

    .line 1798
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8}, Lo/fae;->a(II)Ljava/lang/String;

    move-result-object v12

    .line 1801
    :goto_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v10, v11, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v13, v0

    .line 1802
    sub-float v0, p4, v13

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->d:F

    sub-float v14, v0, v1

    .line 1803
    const/4 v15, 0x0

    .line 1804
    const/16 v16, 0x0

    .line 1805
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    sub-float v0, v14, v0

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_5

    .line 1806
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v14

    .line 1807
    const/4 v15, 0x1

    .line 1809
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->d:F

    add-float v0, v0, p5

    add-float v17, v0, v13

    .line 1810
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float v0, v0, v17

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->f:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 1811
    const/16 v16, 0x1

    goto :goto_2

    .line 1813
    :cond_6
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->d:F

    add-float v17, p5, v0

    .line 1815
    :goto_2
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tipEndX="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "   tipStartX="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startTextWidth= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mDiagramWidth="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fae;->i:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1816
    if-nez v15, :cond_7

    if-nez v16, :cond_7

    .line 1817
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fae;->d(Landroid/graphics/Canvas;FF)V

    .line 1818
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fae;->d(Landroid/graphics/Canvas;FF)V

    .line 1819
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->I:F

    move-object/from16 v1, p1

    invoke-virtual {v1, v11, v14, v0, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1820
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->I:F

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v1, v12, v2, v0, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1822
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 1823
    if-eqz v16, :cond_8

    .line 1824
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->d:F

    sub-float/2addr v0, v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    move-object/from16 v2, v18

    const/4 v3, 0x0

    invoke-virtual {v10, v2, v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v17, v0, v1

    .line 1825
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->I:F

    move-object/from16 v2, p1

    move/from16 v3, v17

    invoke-virtual {v2, v0, v3, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1826
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fae;->d(Landroid/graphics/Canvas;FF)V

    .line 1827
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fae;->d(Landroid/graphics/Canvas;FF)V

    .line 1829
    :cond_8
    if-eqz v15, :cond_9

    .line 1830
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fae;->d(Landroid/graphics/Canvas;FF)V

    .line 1831
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fae;->d(Landroid/graphics/Canvas;FF)V

    .line 1832
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->I:F

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v14, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1835
    :cond_9
    :goto_3
    return-void
.end method

.method private b(Ljava/util/ArrayList;)Lo/eux;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/eux;>;)Lo/eux;"
        }
    .end annotation

    .line 2060
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2061
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 2063
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eux;

    .line 2064
    const/4 v4, 0x1

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 2065
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eux;

    .line 2066
    iget v0, v5, Lo/eux;->b:I

    iget v1, v5, Lo/eux;->c:I

    sub-int/2addr v0, v1

    iget v1, v3, Lo/eux;->b:I

    iget v2, v3, Lo/eux;->c:I

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_2

    .line 2067
    move-object v3, v5

    .line 2064
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 2070
    :cond_3
    return-object v3
.end method

.method private b(IF)Lo/fae$b;
    .locals 4

    .line 2138
    const v0, 0x40d9999a    # 6.8f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v2

    .line 2139
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2140
    new-instance v3, Lo/fae$b;

    invoke-direct {v3}, Lo/fae$b;-><init>()V

    .line 2141
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 2143
    :pswitch_0
    iput v2, v3, Lo/fae$b;->c:F

    .line 2144
    const/high16 v0, 0x41cc0000    # 25.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->b:F

    .line 2145
    goto :goto_1

    .line 2147
    :pswitch_1
    sub-float v0, p2, v2

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->c:F

    .line 2148
    sub-float v0, p2, v2

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    const/high16 v1, 0x41cc0000    # 25.5f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v3, Lo/fae$b;->b:F

    .line 2149
    goto :goto_1

    .line 2151
    :pswitch_2
    sub-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->c:F

    .line 2152
    sub-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    const/high16 v1, 0x41cc0000    # 25.5f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v3, Lo/fae$b;->b:F

    .line 2153
    goto :goto_1

    .line 2155
    :pswitch_3
    sub-float v0, p2, v2

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iput v0, v3, Lo/fae$b;->c:F

    .line 2156
    sub-float v0, p2, v2

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    const/high16 v1, 0x41cc0000    # 25.5f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v3, Lo/fae$b;->b:F

    .line 2157
    goto :goto_1

    .line 2159
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2162
    :goto_1
    return-object v3

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(I)V
    .locals 3

    .line 2436
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2437
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 2439
    :pswitch_0
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fae;->U:F

    .line 2440
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2441
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto/16 :goto_1

    .line 2443
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2445
    goto/16 :goto_1

    .line 2447
    :pswitch_1
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iget v1, p0, Lo/fae;->g:F

    const v2, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fae;->U:F

    .line 2448
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 2449
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05c64be4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto :goto_1

    .line 2451
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33c64be4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2453
    goto :goto_1

    .line 2455
    :pswitch_2
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iget v1, p0, Lo/fae;->g:F

    const v2, 0x3f28f5c3    # 0.66f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fae;->U:F

    .line 2456
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 2457
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_058a2be2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto :goto_1

    .line 2459
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_338a2be2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2461
    goto :goto_1

    .line 2463
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2466
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 10

    .line 660
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 661
    :cond_0
    return-void

    .line 664
    :cond_1
    iget v0, p0, Lo/fae;->G:I

    if-gtz v0, :cond_2

    iget-boolean v0, p0, Lo/fae;->p:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lo/fae;->l:Z

    if-nez v0, :cond_3

    .line 665
    :cond_2
    return-void

    .line 667
    :cond_3
    const/4 v6, 0x0

    .line 668
    const/4 v7, 0x0

    .line 669
    iget-boolean v0, p0, Lo/fae;->l:Z

    if-eqz v0, :cond_5

    .line 670
    invoke-direct {p0}, Lo/fae;->getSleepSumList()Ljava/util/ArrayList;

    move-result-object v8

    .line 671
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sumSleepList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    invoke-direct {p0, v8}, Lo/fae;->b(Ljava/util/ArrayList;)Lo/eux;

    move-result-object v9

    .line 673
    const/4 v0, 0x0

    if-ne v0, v9, :cond_4

    .line 674
    return-void

    .line 676
    :cond_4
    iget v6, v9, Lo/eux;->c:I

    .line 677
    iget v7, v9, Lo/eux;->b:I

    .line 678
    goto :goto_0

    .line 679
    :cond_5
    iget v6, p0, Lo/fae;->q:I

    .line 680
    iget v7, p0, Lo/fae;->m:I

    .line 683
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 684
    move v8, v6

    .line 685
    move v9, v7

    .line 686
    rsub-int v6, v9, 0x5a0

    .line 687
    rsub-int v7, v8, 0x5a0

    .line 690
    :cond_6
    int-to-float v0, v6

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v8, v0, v1

    .line 691
    int-to-float v0, v7

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v9, v0, v1

    .line 693
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v3, v7

    move v4, v8

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->a(Landroid/graphics/Canvas;IIFF)V

    .line 694
    return-void
.end method

.method private b(Landroid/graphics/Canvas;FFFF)V
    .locals 10

    .line 1225
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 1226
    new-instance v0, Landroid/graphics/LinearGradient;

    move v1, p2

    move v2, p4

    move v3, p2

    move v4, p5

    iget v5, p0, Lo/fae;->A:I

    iget v6, p0, Lo/fae;->C:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 1227
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1228
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1229
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1230
    move-object v0, p1

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1231
    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 5

    .line 2005
    div-int/lit8 v0, p1, 0x3c

    add-int/lit8 v2, v0, 0x14

    .line 2006
    rem-int/lit8 v3, p1, 0x3c

    .line 2007
    const/16 v0, 0x18

    if-lt v2, v0, :cond_0

    .line 2008
    add-int/lit8 v2, v2, -0x18

    .line 2010
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v2}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v3}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fae;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2011
    return-object v4
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 2350
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 2352
    :try_start_0
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 2353
    const/16 v6, 0x81

    .line 2356
    invoke-static {v5, v6}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 2357
    :catch_0
    move-exception v5

    .line 2358
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "formatTime.ParseException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2360
    return-object p1
.end method

.method private static c(Ljava/util/List;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 2326
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 2327
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2328
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 2330
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map;

    .line 2331
    const/4 v5, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 2332
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    .line 2333
    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "core_sleep_start_time_key"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_2

    .line 2334
    move-object v4, v6

    .line 2331
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2337
    :cond_3
    const-string v0, "core_sleep_start_time_key"

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2338
    const-string v0, "core_sleep_end_time_key"

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2339
    return-object v3
.end method

.method private c(IF)Lo/fae$b;
    .locals 6

    .line 905
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v3

    .line 906
    iget v0, p0, Lo/fae;->g:F

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v4, v0, v1

    .line 907
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 908
    new-instance v5, Lo/fae$b;

    invoke-direct {v5}, Lo/fae$b;-><init>()V

    .line 909
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 911
    :sswitch_0
    iput v3, v5, Lo/fae$b;->c:F

    .line 912
    const v0, 0x3e428f5c    # 0.19f

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    iput v0, v5, Lo/fae$b;->b:F

    .line 913
    goto :goto_1

    .line 915
    :sswitch_1
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const v1, 0x3ec28f5c    # 0.38f

    mul-float/2addr v1, v4

    add-float/2addr v0, v1

    iput v0, v5, Lo/fae$b;->c:F

    .line 916
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    sub-float v1, p2, v3

    const v2, 0x3f1eb852    # 0.62f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, v5, Lo/fae$b;->b:F

    .line 917
    goto :goto_1

    .line 919
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 922
    :goto_1
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x43 -> :sswitch_0
        0x45 -> :sswitch_1
    .end sparse-switch
.end method

.method private c()V
    .locals 10

    .line 2233
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2234
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->G:I

    .line 2235
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->q:I

    .line 2236
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->m:I

    .line 2237
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->M:I

    .line 2238
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->K:I

    .line 2239
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->N:I

    .line 2241
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2242
    return-void

    .line 2245
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2246
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 2247
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    .line 2248
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_b

    .line 2249
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eux;

    .line 2250
    new-instance v5, Lo/eux;

    invoke-direct {v5}, Lo/eux;-><init>()V

    .line 2251
    iget v0, v4, Lo/eux;->c:I

    invoke-virtual {v5, v0}, Lo/eux;->b(I)V

    .line 2252
    iget v0, v4, Lo/eux;->b:I

    invoke-virtual {v5, v0}, Lo/eux;->e(I)V

    .line 2253
    iget v0, v4, Lo/eux;->a:I

    invoke-virtual {v5, v0}, Lo/eux;->c(I)V

    .line 2254
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2255
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2256
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-eq v0, v1, :cond_1

    .line 2257
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x43

    if-eq v0, v1, :cond_1

    .line 2258
    const-string v0, "core_sleep_start_time_key"

    invoke-virtual {v4}, Lo/eux;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2261
    :cond_1
    add-int/lit8 v0, v9, 0x1

    if-le v8, v0, :cond_3

    .line 2262
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    add-int/lit8 v1, v9, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->e()I

    move-result v0

    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v1

    sub-int/2addr v0, v1

    const/16 v1, 0x1e

    if-le v0, v1, :cond_2

    .line 2263
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2264
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2265
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2266
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    goto :goto_1

    .line 2269
    :cond_2
    const-string v0, "core_sleep_end_time_key"

    iget-object v1, p0, Lo/fae;->r:Ljava/util/List;

    add-int/lit8 v2, v9, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eux;

    invoke-virtual {v1}, Lo/eux;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2273
    :cond_3
    :goto_1
    add-int/lit8 v0, v8, -0x1

    if-ne v9, v0, :cond_5

    .line 2274
    const/4 v0, 0x1

    if-ne v8, v0, :cond_4

    .line 2275
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2277
    :cond_4
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2278
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2282
    :cond_5
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x44

    if-ne v0, v1, :cond_6

    .line 2283
    iget v0, p0, Lo/fae;->G:I

    iget v1, v4, Lo/eux;->b:I

    iget v2, v4, Lo/eux;->c:I

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lo/fae;->G:I

    .line 2286
    :cond_6
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_7

    .line 2287
    iget v0, p0, Lo/fae;->M:I

    iget v1, v4, Lo/eux;->b:I

    iget v2, v4, Lo/eux;->c:I

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lo/fae;->M:I

    .line 2290
    :cond_7
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-eq v0, v1, :cond_a

    .line 2291
    iget v0, p0, Lo/fae;->K:I

    if-nez v0, :cond_9

    iget v0, p0, Lo/fae;->N:I

    if-nez v0, :cond_9

    .line 2292
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x43

    if-eq v0, v1, :cond_8

    .line 2293
    invoke-virtual {v4}, Lo/eux;->e()I

    move-result v0

    iput v0, p0, Lo/fae;->K:I

    goto :goto_2

    .line 2295
    :cond_8
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_9

    .line 2296
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->e()I

    move-result v0

    iput v0, p0, Lo/fae;->K:I

    .line 2300
    :cond_9
    :goto_2
    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v0

    iput v0, p0, Lo/fae;->N:I

    .line 2248
    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 2303
    :cond_b
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_c

    .line 2304
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fae;->q:I

    .line 2305
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fae;->m:I

    goto :goto_3

    .line 2307
    :cond_c
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    .line 2308
    invoke-static {v6}, Lo/fae;->c(Ljava/util/List;)Ljava/util/Map;

    move-result-object v9

    .line 2309
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fae;->q:I

    .line 2310
    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fae;->m:I

    .line 2314
    :cond_d
    :goto_3
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " copyOfFitnessDataList mStartSleepPoint = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fae;->q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2315
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " copyOfFitnessDataList mNightEndPoint = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fae;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2317
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 9

    .line 624
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 625
    :cond_0
    return-void

    .line 627
    :cond_1
    iget-object v0, p0, Lo/fae;->E:Landroid/graphics/PointF;

    iget v1, p0, Lo/fae;->n:F

    iget v2, p0, Lo/fae;->o:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 628
    iget-object v0, p0, Lo/fae;->E:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lo/fae;->E:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0, v1}, Lo/fae;->e(FF)V

    .line 630
    iget-boolean v0, p0, Lo/fae;->J:Z

    if-nez v0, :cond_2

    .line 631
    return-void

    .line 633
    :cond_2
    iget-boolean v0, p0, Lo/fae;->W:Z

    if-nez v0, :cond_4

    .line 634
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 635
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 636
    iget v0, p0, Lo/fae;->T:I

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 637
    new-instance v5, Landroid/graphics/RectF;

    iget v0, p0, Lo/fae;->O:F

    iget v1, p0, Lo/fae;->U:F

    iget v2, p0, Lo/fae;->V:F

    iget v3, p0, Lo/fae;->k:F

    invoke-direct {v5, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 640
    iget v0, p0, Lo/fae;->V:F

    iget v1, p0, Lo/fae;->O:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 641
    iget v0, p0, Lo/fae;->V:F

    iget v1, p0, Lo/fae;->O:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    goto :goto_0

    .line 643
    :cond_3
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v6

    .line 647
    :goto_0
    const/16 v0, 0x8

    new-array v7, v0, [F

    const/4 v0, 0x0

    aput v6, v7, v0

    const/4 v0, 0x1

    aput v6, v7, v0

    const/4 v0, 0x2

    aput v6, v7, v0

    const/4 v0, 0x3

    aput v6, v7, v0

    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v7, v1

    .line 648
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 649
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v8, v5, v7, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 650
    invoke-virtual {p1, v8, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 652
    :cond_4
    return-void
.end method

.method private c(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1932
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->L:Z

    .line 1933
    iget-object v0, p0, Lo/fae;->E:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 1934
    iget-object v0, p0, Lo/fae;->E:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lo/fae;->E:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0, v1}, Lo/fae;->e(FF)V

    .line 1936
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    if-eqz v0, :cond_5

    .line 1938
    iget-boolean v0, p0, Lo/fae;->l:Z

    if-eqz v0, :cond_0

    .line 1939
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    invoke-virtual {v0}, Lo/eux;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v3, v0, v1

    goto :goto_0

    .line 1940
    :cond_0
    iget-boolean v0, p0, Lo/fae;->p:Z

    if-eqz v0, :cond_1

    .line 1941
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    invoke-virtual {v0}, Lo/eux;->d()I

    move-result v0

    iget v1, p0, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fae;->N:I

    iget v2, p0, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v3, v0, v1

    goto :goto_0

    .line 1943
    :cond_1
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    invoke-virtual {v0}, Lo/eux;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v3, v0, v1

    .line 1947
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1948
    move v4, v3

    .line 1949
    iget v0, p0, Lo/fae;->f:F

    sub-float v3, v0, v4

    .line 1951
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    iget v2, p0, Lo/fae;->a:F

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 1952
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 1953
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->R:Z

    goto :goto_1

    .line 1955
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 1956
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->R:Z

    .line 1958
    :goto_1
    goto :goto_2

    .line 1960
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    const/high16 v2, 0x41b00000    # 22.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_4

    .line 1961
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 1962
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->R:Z

    goto :goto_2

    .line 1964
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 1965
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->R:Z

    .line 1969
    :cond_5
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/fae;->n:F

    .line 1970
    invoke-virtual {p0}, Lo/fae;->invalidate()V

    .line 1971
    return-void
.end method

.method private d(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .line 2512
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "MM/dd"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 2513
    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 595
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    if-eqz v0, :cond_4

    .line 597
    iget-boolean v0, p0, Lo/fae;->l:Z

    if-eqz v0, :cond_0

    .line 598
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    invoke-virtual {v0}, Lo/eux;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v4, v0, v1

    goto :goto_0

    .line 599
    :cond_0
    iget-boolean v0, p0, Lo/fae;->p:Z

    if-eqz v0, :cond_1

    .line 600
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    invoke-virtual {v0}, Lo/eux;->d()I

    move-result v0

    iget v1, p0, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fae;->N:I

    iget v2, p0, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v4, v0, v1

    goto :goto_0

    .line 602
    :cond_1
    iget-object v0, p0, Lo/fae;->x:Lo/eux;

    invoke-virtual {v0}, Lo/eux;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fae;->a:F

    add-float v4, v0, v1

    .line 606
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 607
    iget v0, p0, Lo/fae;->f:F

    sub-float v4, v0, v4

    .line 609
    :cond_2
    iget-boolean v0, p0, Lo/fae;->R:Z

    if-nez v0, :cond_3

    .line 610
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, v4

    iput v0, p0, Lo/fae;->n:F

    .line 612
    :cond_3
    iget-object v0, p0, Lo/fae;->ad:Lo/fae$c;

    const-string v1, ""

    const-string v2, ""

    const/4 v3, -0x1

    invoke-interface {v0, v1, v2, v3}, Lo/fae$c;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 613
    goto :goto_1

    .line 614
    :cond_4
    iget v0, p0, Lo/fae;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/fae;->n:F

    .line 616
    :goto_1
    return-void
.end method

.method private d(I)V
    .locals 3

    .line 2389
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2390
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 2392
    :pswitch_0
    const v0, 0x40d9999a    # 6.8f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fae;->U:F

    .line 2393
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2394
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto/16 :goto_1

    .line 2396
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2398
    goto/16 :goto_1

    .line 2400
    :pswitch_1
    const v0, 0x40d9999a    # 6.8f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iget v1, p0, Lo/fae;->g:F

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fae;->U:F

    .line 2401
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 2402
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fc8282:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto/16 :goto_1

    .line 2404
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33fc8282:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2406
    goto/16 :goto_1

    .line 2408
    :pswitch_2
    const v0, 0x40d9999a    # 6.8f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iget v1, p0, Lo/fae;->g:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fae;->U:F

    .line 2409
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 2410
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05c64be4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto :goto_1

    .line 2412
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33c64be4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2414
    goto :goto_1

    .line 2416
    :pswitch_3
    const v0, 0x40d9999a    # 6.8f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iget v1, p0, Lo/fae;->g:F

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fae;->U:F

    .line 2417
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 2418
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_058a2be2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto :goto_1

    .line 2420
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_338a2be2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2422
    goto :goto_1

    .line 2424
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2427
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 12

    .line 703
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 704
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff2f2f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 705
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 706
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 708
    const/high16 v0, 0x42100000    # 36.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v9

    .line 710
    const/high16 v0, 0x41580000    # 13.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v10

    .line 712
    iget v0, p0, Lo/fae;->n:F

    sub-float/2addr v0, v9

    iget v1, p0, Lo/fae;->o:F

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 713
    move-object v0, v8

    iget v1, p0, Lo/fae;->n:F

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, v9

    const/high16 v3, 0x40c00000    # 6.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lo/fae;->o:F

    iget v3, p0, Lo/fae;->n:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v9

    const/high16 v5, 0x40c00000    # 6.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lo/fae;->o:F

    sub-float/2addr v4, v10

    iget v5, p0, Lo/fae;->n:F

    iget v6, p0, Lo/fae;->o:F

    sub-float/2addr v6, v10

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 714
    move-object v0, v8

    iget v1, p0, Lo/fae;->n:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v9

    const/high16 v3, 0x40c00000    # 6.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fae;->o:F

    sub-float/2addr v2, v10

    iget v3, p0, Lo/fae;->n:F

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, v9

    const/high16 v5, 0x40c00000    # 6.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/fae;->o:F

    iget v5, p0, Lo/fae;->n:F

    add-float/2addr v5, v9

    iget v6, p0, Lo/fae;->o:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 715
    invoke-virtual {p1, v8, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 717
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 720
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 722
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    const/16 v2, 0x33

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v3, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 723
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 724
    iget v0, p0, Lo/fae;->n:F

    iget v1, p0, Lo/fae;->o:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 725
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 726
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 729
    new-instance v11, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v11, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 731
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 732
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 733
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 734
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 735
    iget v0, p0, Lo/fae;->n:F

    iget v1, p0, Lo/fae;->o:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 737
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 738
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 741
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 742
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 743
    const/4 v0, -0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 744
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 745
    iget v0, p0, Lo/fae;->n:F

    iget v1, p0, Lo/fae;->o:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 748
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 749
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 750
    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 751
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 752
    iget v0, p0, Lo/fae;->n:F

    iget v1, p0, Lo/fae;->o:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    const/high16 v2, 0x41340000    # 11.25f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 753
    return-void
.end method

.method private d(Landroid/graphics/Canvas;FF)V
    .locals 6

    .line 2079
    new-instance v2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 2080
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 2081
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2082
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2083
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2084
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10a6a6a6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 2086
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffa6a6a6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 2088
    :goto_0
    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 2089
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 2090
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 2091
    invoke-static {p3}, Lo/fiu;->e(F)F

    move-result v5

    .line 2092
    iget v0, p0, Lo/fae;->H:F

    add-float/2addr v0, v5

    invoke-virtual {v4, p2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2093
    iget v0, p0, Lo/fae;->k:F

    invoke-virtual {v4, p2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2094
    invoke-virtual {p1, v4, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 2095
    return-void

    nop

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private d(Lo/eux;)V
    .locals 2

    .line 931
    invoke-virtual {p1}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x43

    if-eq v0, v1, :cond_0

    .line 932
    invoke-virtual {p1}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x44

    if-eq v0, v1, :cond_0

    .line 933
    invoke-virtual {p1}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x42

    if-eq v0, v1, :cond_0

    .line 934
    invoke-virtual {p1}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-eq v0, v1, :cond_0

    .line 935
    invoke-virtual {p1}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x41

    if-ne v0, v1, :cond_1

    .line 936
    :cond_0
    iput-object p1, p0, Lo/fae;->x:Lo/eux;

    goto :goto_0

    .line 938
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fae;->x:Lo/eux;

    .line 940
    :goto_0
    return-void
.end method

.method private e(I)Ljava/lang/String;
    .locals 2

    .line 2021
    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private e(FF)V
    .locals 16

    .line 1654
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1655
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1656
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addAnchor mFitnessDataList == null or mFitnessDataList.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1657
    return-void

    .line 1664
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    .line 1665
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_a

    .line 1666
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eux;

    .line 1667
    invoke-virtual {v8}, Lo/eux;->e()I

    move-result v11

    .line 1668
    invoke-virtual {v8}, Lo/eux;->d()I

    move-result v12

    .line 1670
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->l:Z

    if-eqz v0, :cond_3

    .line 1671
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->W:Z

    .line 1672
    int-to-float v0, v11

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v5, v0, v1

    .line 1673
    int-to-float v0, v12

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v6, v0, v1

    .line 1674
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1675
    move v13, v5

    .line 1676
    move v14, v6

    .line 1677
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v5, v0, v14

    .line 1678
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v6, v0, v13

    .line 1680
    :cond_2
    move-object/from16 v0, p0

    iput v5, v0, Lo/fae;->O:F

    .line 1681
    move-object/from16 v0, p0

    iput v6, v0, Lo/fae;->V:F

    .line 1682
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->k(I)V

    goto/16 :goto_1

    .line 1683
    :cond_3
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fae;->p:Z

    if-eqz v0, :cond_6

    .line 1685
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_4

    .line 1686
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->W:Z

    .line 1687
    goto/16 :goto_2

    .line 1689
    :cond_4
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->W:Z

    .line 1690
    invoke-virtual {v8}, Lo/eux;->e()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->N:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v5, v0, v1

    .line 1691
    invoke-virtual {v8}, Lo/eux;->d()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->N:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v6, v0, v1

    .line 1693
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1694
    move v13, v5

    .line 1695
    move v14, v6

    .line 1696
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v5, v0, v14

    .line 1697
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v6, v0, v13

    .line 1700
    :cond_5
    move-object/from16 v0, p0

    iput v5, v0, Lo/fae;->O:F

    .line 1701
    move-object/from16 v0, p0

    iput v6, v0, Lo/fae;->V:F

    .line 1702
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->d(I)V

    goto :goto_1

    .line 1704
    :cond_6
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_7

    .line 1705
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->W:Z

    .line 1706
    goto/16 :goto_2

    .line 1708
    :cond_7
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->W:Z

    .line 1709
    int-to-float v0, v11

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v5, v0, v1

    .line 1710
    int-to-float v0, v12

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->i:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->a:F

    add-float v6, v0, v1

    .line 1711
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1712
    move v13, v5

    .line 1713
    move v14, v6

    .line 1714
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v5, v0, v14

    .line 1715
    move-object/from16 v0, p0

    iget v0, v0, Lo/fae;->f:F

    sub-float v6, v0, v13

    .line 1718
    :cond_8
    move-object/from16 v0, p0

    iput v5, v0, Lo/fae;->O:F

    .line 1719
    move-object/from16 v0, p0

    iput v6, v0, Lo/fae;->V:F

    .line 1720
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fae;->b(I)V

    .line 1723
    :goto_1
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fae;->g:F

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lo/fae;->c(IF)Lo/fae$b;

    move-result-object v13

    .line 1724
    iget v7, v13, Lo/fae$b;->c:F

    .line 1727
    cmpl-float v0, p1, v5

    if-ltz v0, :cond_9

    cmpg-float v0, p1, v6

    if-gtz v0, :cond_9

    .line 1728
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->J:Z

    .line 1729
    new-instance v14, Lo/eyb;

    invoke-direct {v14}, Lo/eyb;-><init>()V

    .line 1730
    const/4 v0, 0x1

    iput v0, v14, Lo/eyb;->e:I

    .line 1731
    new-instance v0, Landroid/graphics/PointF;

    move/from16 v1, p1

    invoke-direct {v0, v1, v7}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v14, Lo/eyb;->c:Landroid/graphics/PointF;

    .line 1732
    invoke-virtual {v8}, Lo/eux;->d()I

    move-result v0

    invoke-virtual {v8}, Lo/eux;->e()I

    move-result v1

    sub-int v15, v0, v1

    .line 1733
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lo/eux;->e()I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/fae;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Lo/eux;->d()I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/fae;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v14, Lo/eyb;->d:Ljava/lang/String;

    .line 1735
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lo/eux;->e()I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/fae;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Lo/eux;->d()I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/fae;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fae;->B:Ljava/lang/String;

    .line 1736
    int-to-double v0, v15

    iput-wide v0, v14, Lo/eyb;->b:D

    .line 1737
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x42c80000    # 100.0f

    add-float v1, v1, p1

    move-object/from16 v2, p0

    iget v2, v2, Lo/fae;->h:F

    move/from16 v3, p1

    move/from16 v4, p2

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, v14, Lo/eyb;->a:Landroid/graphics/RectF;

    .line 1738
    invoke-virtual {v8}, Lo/eux;->b()I

    move-result v0

    iput v0, v14, Lo/eyb;->i:I

    .line 1740
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1741
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->S:Ljava/util/ArrayList;

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1742
    goto :goto_3

    .line 1745
    :cond_9
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/fae;->J:Z

    .line 1746
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fae;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1665
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 1749
    :cond_a
    :goto_3
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 7

    .line 393
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 394
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 395
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff2f2f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 396
    move-object v0, p1

    iget v2, p0, Lo/fae;->k:F

    iget v3, p0, Lo/fae;->f:F

    iget v4, p0, Lo/fae;->h:F

    move-object v5, v6

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 397
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FFFF)V
    .locals 11

    .line 1146
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 1147
    new-instance v0, Landroid/graphics/LinearGradient;

    move v1, p2

    move v2, p3

    move v3, p2

    move/from16 v4, p5

    iget v5, p0, Lo/fae;->z:I

    iget v6, p0, Lo/fae;->w:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 1148
    new-instance v10, Landroid/graphics/RectF;

    move/from16 v0, p5

    invoke-direct {v10, p2, p3, p4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1149
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1150
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1151
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1152
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    invoke-virtual {p1, v10, v0, v1, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 1153
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Lo/eux;FFLo/fae$b;Lo/eux;FFLo/fae$b;)V
    .locals 11

    .line 1033
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v8

    .line 1034
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v9

    .line 1037
    move-object/from16 v0, p5

    iget v0, v0, Lo/fae$b;->b:F

    move-object/from16 v1, p9

    iget v1, v1, Lo/fae$b;->b:F

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 1038
    sub-float v0, p4, p3

    cmpg-float v0, v0, v8

    if-gez v0, :cond_0

    .line 1039
    sub-float v0, p4, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v0, v1

    goto :goto_0

    .line 1041
    :cond_0
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v10

    .line 1045
    :goto_0
    invoke-virtual {p2}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setTopToBottomStartColor(I)V

    .line 1048
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1050
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->b:F

    sub-float/2addr v3, v10

    add-float v4, p3, v10

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->b:F

    add-float/2addr v5, v10

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1052
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    add-float/2addr v4, v9

    add-float/2addr v4, p3

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->b:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v10

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_1

    .line 1055
    :cond_1
    move-object v0, p0

    move-object v1, p1

    sub-float v2, p4, v10

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->b:F

    sub-float/2addr v3, v10

    move v4, p4

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->b:F

    add-float/2addr v5, v10

    sub-float/2addr v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1057
    move-object v0, p0

    move-object v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v10

    add-float/2addr v2, v9

    sub-float v2, p4, v2

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->b:F

    move v4, p4

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->b:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v10

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    .line 1059
    :goto_1
    sub-float v0, p8, p7

    cmpg-float v0, v0, v8

    if-gez v0, :cond_2

    .line 1060
    sub-float v0, p8, p7

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v0, v1

    goto :goto_2

    .line 1062
    :cond_2
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v10

    .line 1066
    :goto_2
    invoke-virtual/range {p6 .. p6}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setTopToBottomEndColor(I)V

    .line 1068
    invoke-virtual {p2}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setTopToBottomLineStartColor(I)V

    .line 1069
    invoke-virtual/range {p6 .. p6}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setTopToBottomLineEndColor(I)V

    .line 1070
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1072
    move-object v0, p0

    move-object v1, p1

    sub-float v2, p8, v10

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->c:F

    sub-float/2addr v3, v10

    add-float/2addr v3, v9

    move/from16 v4, p8

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->c:F

    add-float/2addr v5, v10

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1074
    move-object v0, p0

    move-object v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v10

    add-float/2addr v2, v9

    sub-float v2, p8, v2

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->c:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    sub-float/2addr v3, v4

    move/from16 v4, p8

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->c:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    .line 1076
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->c:F

    add-float/2addr v3, v10

    add-float/2addr v3, v9

    move v4, p3

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->b:F

    sub-float/2addr v5, v10

    sub-float/2addr v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->a(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_6

    .line 1079
    :cond_3
    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p7

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->c:F

    sub-float/2addr v3, v10

    add-float/2addr v3, v9

    add-float v4, p7, v10

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->c:F

    add-float/2addr v5, v10

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1081
    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p7

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->c:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    add-float/2addr v4, v9

    add-float v4, v4, p7

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->c:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    .line 1083
    move-object v0, p0

    move-object v1, p1

    move v2, p4

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->c:F

    add-float/2addr v3, v10

    add-float/2addr v3, v9

    move v4, p4

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->b:F

    sub-float/2addr v5, v10

    sub-float/2addr v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->a(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_6

    .line 1088
    :cond_4
    sub-float v0, p4, p3

    cmpg-float v0, v0, v8

    if-gez v0, :cond_5

    .line 1089
    sub-float v0, p4, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v0, v1

    goto :goto_3

    .line 1091
    :cond_5
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v10

    .line 1095
    :goto_3
    invoke-virtual {p2}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setBottomToTopStartColor(I)V

    .line 1096
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1098
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->c:F

    sub-float/2addr v3, v10

    add-float/2addr v3, v9

    add-float v4, p3, v10

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->c:F

    add-float/2addr v5, v10

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1100
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->c:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    add-float/2addr v4, v9

    add-float/2addr v4, p3

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->c:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_4

    .line 1103
    :cond_6
    move-object v0, p0

    move-object v1, p1

    sub-float v2, p4, v10

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->c:F

    sub-float/2addr v3, v10

    add-float/2addr v3, v9

    move v4, p4

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->c:F

    add-float/2addr v5, v10

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1105
    move-object v0, p0

    move-object v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v10

    add-float/2addr v2, v9

    sub-float v2, p4, v2

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->c:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    sub-float/2addr v3, v4

    move v4, p4

    move-object/from16 v5, p5

    iget v5, v5, Lo/fae$b;->c:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    .line 1107
    :goto_4
    sub-float v0, p8, p7

    cmpg-float v0, v0, v8

    if-gez v0, :cond_7

    .line 1108
    sub-float v0, p8, p7

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v0, v1

    goto :goto_5

    .line 1110
    :cond_7
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v10

    .line 1114
    :goto_5
    invoke-virtual/range {p6 .. p6}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setBottomToTopEndColor(I)V

    .line 1116
    invoke-virtual {p2}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setBottomToTopLineStartColor(I)V

    .line 1117
    invoke-virtual/range {p6 .. p6}, Lo/eux;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/fae;->setBottomToTopLineEndColor(I)V

    .line 1118
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1120
    move-object v0, p0

    move-object v1, p1

    sub-float v2, p8, v10

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->b:F

    sub-float/2addr v3, v10

    move/from16 v4, p8

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->b:F

    add-float/2addr v5, v10

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1122
    move-object v0, p0

    move-object v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v10

    add-float/2addr v2, v9

    sub-float v2, p8, v2

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->b:F

    move/from16 v4, p8

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->b:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v10

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    .line 1124
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->b:F

    sub-float/2addr v3, v10

    sub-float/2addr v3, v9

    move v4, p3

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->c:F

    add-float/2addr v5, v10

    add-float/2addr v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->a(Landroid/graphics/Canvas;FFFF)V

    goto :goto_6

    .line 1127
    :cond_8
    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p7

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->b:F

    sub-float/2addr v3, v10

    add-float v4, p7, v10

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->b:F

    add-float/2addr v5, v10

    sub-float/2addr v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->b(Landroid/graphics/Canvas;FFFF)V

    .line 1129
    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p7

    move-object/from16 v3, p9

    iget v3, v3, Lo/fae$b;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v4, v10

    add-float/2addr v4, v9

    add-float v4, v4, p7

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->b:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v10

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fae;->a(Landroid/graphics/Canvas;FFFFFF)V

    .line 1131
    move-object v0, p0

    move-object v1, p1

    move v2, p4

    move-object/from16 v3, p5

    iget v3, v3, Lo/fae$b;->b:F

    sub-float/2addr v3, v10

    sub-float/2addr v3, v9

    move v4, p4

    move-object/from16 v5, p9

    iget v5, v5, Lo/fae$b;->c:F

    add-float/2addr v5, v10

    add-float/2addr v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fae;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1134
    :goto_6
    return-void
.end method

.method static synthetic e(Lo/fae;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lo/fae;->c:Z

    return p1
.end method

.method private f(Landroid/graphics/Canvas;)V
    .locals 15

    .line 760
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 761
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 762
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 763
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 764
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    array-length v6, v0

    .line 765
    new-array v7, v6, [F

    .line 766
    iget v0, p0, Lo/fae;->o:F

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fae;->Q:F

    .line 769
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v6, :cond_b

    .line 770
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_801a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 771
    const-string v0, "regular"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v8

    .line 772
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 774
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    add-int/lit8 v1, v6, -0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lo/fae;->t:[Ljava/lang/String;

    add-int/lit8 v2, v6, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v9, v0

    .line 776
    if-nez v10, :cond_1

    .line 777
    iget-boolean v0, p0, Lo/fae;->p:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fae;->l:Z

    if-nez v0, :cond_0

    .line 778
    iget v0, p0, Lo/fae;->ag:F

    aput v0, v7, v10

    goto :goto_1

    .line 780
    :cond_0
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    aput v0, v7, v10

    goto :goto_1

    .line 782
    :cond_1
    add-int/lit8 v0, v6, -0x1

    if-ne v10, v0, :cond_3

    .line 783
    iget-boolean v0, p0, Lo/fae;->p:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/fae;->l:Z

    if-nez v0, :cond_2

    .line 784
    iget v0, p0, Lo/fae;->ah:F

    aput v0, v7, v10

    goto :goto_1

    .line 786
    :cond_2
    iget v0, p0, Lo/fae;->f:F

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    sub-float/2addr v0, v9

    aput v0, v7, v10

    goto :goto_1

    .line 789
    :cond_3
    iget v0, p0, Lo/fae;->f:F

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    sub-float/2addr v0, v9

    add-int/lit8 v1, v6, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    int-to-float v1, v10

    mul-float/2addr v0, v1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    aput v0, v7, v10

    .line 792
    :goto_1
    aget v0, v7, v10

    const/high16 v1, 0x42100000    # 36.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fae;->n:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_7

    iget v0, p0, Lo/fae;->n:F

    aget v1, v7, v10

    add-float/2addr v1, v9

    const/high16 v2, 0x42100000    # 36.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_7

    .line 793
    aget v0, v7, v10

    add-float/2addr v0, v9

    iget v1, p0, Lo/fae;->n:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    iget v0, p0, Lo/fae;->n:F

    aget v1, v7, v10

    add-float/2addr v1, v9

    const/high16 v2, 0x42100000    # 36.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_4

    .line 794
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    aget v1, v7, v10

    add-float/2addr v1, v9

    .line 795
    const/high16 v2, 0x42100000    # 36.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lo/fae;->n:F

    sub-float/2addr v1, v2

    aget v2, v7, v10

    add-float/2addr v2, v9

    const/high16 v3, 0x42100000    # 36.0f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    add-float/2addr v2, v3

    aget v3, v7, v10

    add-float/2addr v3, v9

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    const/high16 v2, 0x41980000    # 19.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    mul-float/2addr v1, v2

    add-float v11, v0, v1

    .line 796
    iget v0, p0, Lo/fae;->o:F

    sub-float/2addr v0, v11

    iput v0, p0, Lo/fae;->Q:F

    .line 797
    goto/16 :goto_2

    :cond_4
    aget v0, v7, v10

    iget v1, p0, Lo/fae;->n:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    iget v0, p0, Lo/fae;->n:F

    aget v1, v7, v10

    add-float/2addr v1, v9

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 798
    iget v0, p0, Lo/fae;->o:F

    const/high16 v1, 0x41380000    # 11.5f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fae;->Q:F

    goto/16 :goto_2

    .line 799
    :cond_5
    aget v0, v7, v10

    const/high16 v1, 0x42100000    # 36.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fae;->n:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    iget v0, p0, Lo/fae;->n:F

    aget v1, v7, v10

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 800
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iget v1, p0, Lo/fae;->n:F

    aget v2, v7, v10

    .line 801
    const/high16 v3, 0x42100000    # 36.0f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    sub-float/2addr v2, v3

    sub-float/2addr v1, v2

    aget v2, v7, v10

    aget v3, v7, v10

    const/high16 v4, 0x42100000    # 36.0f

    invoke-static {v4}, Lo/fiu;->e(F)F

    move-result v4

    sub-float/2addr v3, v4

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    const/high16 v2, 0x41980000    # 19.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    mul-float/2addr v1, v2

    add-float v11, v0, v1

    .line 802
    iget v0, p0, Lo/fae;->o:F

    sub-float/2addr v0, v11

    iput v0, p0, Lo/fae;->Q:F

    .line 803
    goto :goto_2

    .line 804
    :cond_6
    iget v0, p0, Lo/fae;->o:F

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fae;->Q:F

    goto :goto_2

    .line 807
    :cond_7
    iget v0, p0, Lo/fae;->o:F

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fae;->Q:F

    .line 810
    :goto_2
    iget v0, p0, Lo/fae;->n:F

    const/high16 v1, 0x42100000    # 36.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    aget v1, v7, v10

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    aget v0, v7, v10

    iget v1, p0, Lo/fae;->n:F

    const/high16 v2, 0x42100000    # 36.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    .line 811
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff1a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 812
    const-string v0, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v8

    .line 813
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 815
    :cond_8
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    aget-object v0, v0, v10

    aget v1, v7, v10

    iget v2, p0, Lo/fae;->Q:F

    move-object/from16 v3, p1

    invoke-virtual {v3, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 817
    iget-object v0, p0, Lo/fae;->ab:Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ab:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v11, v0

    .line 818
    iget-object v0, p0, Lo/fae;->ac:Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ac:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v12, v0

    .line 819
    sub-float v0, v9, v11

    const/high16 v1, 0x40000000    # 2.0f

    div-float v13, v0, v1

    .line 820
    sub-float v0, v9, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v14, v0, v1

    .line 821
    if-nez v10, :cond_9

    .line 822
    iget-object v0, p0, Lo/fae;->ab:Ljava/lang/String;

    aget v1, v7, v10

    add-float/2addr v1, v13

    iget v2, p0, Lo/fae;->Q:F

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    sub-float/2addr v2, v3

    move-object/from16 v3, p1

    invoke-virtual {v3, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 823
    :cond_9
    add-int/lit8 v0, v6, -0x1

    if-ne v10, v0, :cond_a

    .line 824
    iget-object v0, p0, Lo/fae;->ac:Ljava/lang/String;

    aget v1, v7, v10

    add-float/2addr v1, v14

    iget v2, p0, Lo/fae;->Q:F

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    sub-float/2addr v2, v3

    move-object/from16 v3, p1

    invoke-virtual {v3, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 769
    :cond_a
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 828
    :cond_b
    return-void
.end method

.method private getChartLabels()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 862
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 864
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 865
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x14

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 866
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 867
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 869
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 870
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v9

    .line 871
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 873
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 874
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v10

    .line 875
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 877
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0xe

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 878
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v11

    .line 879
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 881
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x14

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 882
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v12

    .line 883
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 885
    return-object v6
.end method

.method private getSleepSumList()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/eux;>;"
        }
    .end annotation

    .line 2030
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2032
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 2033
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eux;

    .line 2035
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    .line 2036
    goto :goto_1

    .line 2038
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2039
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 2042
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eux;

    .line 2043
    iget v0, v3, Lo/eux;->b:I

    iget v1, v4, Lo/eux;->c:I

    if-ne v0, v1, :cond_2

    .line 2044
    iget v0, v4, Lo/eux;->b:I

    iput v0, v3, Lo/eux;->b:I

    goto :goto_1

    .line 2046
    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2032
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2050
    :cond_3
    return-object v2
.end method

.method private getTimeLabel()V
    .locals 13

    .line 271
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 272
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 273
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 274
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    .line 276
    iget-boolean v0, p0, Lo/fae;->p:Z

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lo/fae;->l:Z

    if-nez v0, :cond_c

    .line 277
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mStartSleepPoint: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fae;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLastNightEndPoint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fae;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mStartPoint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fae;->K:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mEndPoint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fae;->N:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    .line 280
    iget v0, p0, Lo/fae;->q:I

    div-int/lit8 v0, v0, 0x3c

    add-int/lit8 v5, v0, 0x14

    .line 281
    iget v0, p0, Lo/fae;->q:I

    rem-int/lit8 v6, v0, 0x3c

    .line 284
    const/16 v0, 0x14

    if-gt v0, v5, :cond_0

    const/16 v0, 0x18

    if-ge v5, v0, :cond_0

    .line 285
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fae;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->ab:Ljava/lang/String;

    goto :goto_0

    .line 287
    :cond_0
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/fae;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->ab:Ljava/lang/String;

    .line 289
    :goto_0
    const/16 v0, 0x18

    if-lt v5, v0, :cond_1

    .line 290
    add-int/lit8 v5, v5, -0x18

    .line 292
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v5}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v6}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fae;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 293
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 296
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 300
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v7, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v8, v0

    .line 302
    const/4 v9, 0x0

    .line 303
    iget v0, p0, Lo/fae;->N:I

    iget v1, p0, Lo/fae;->K:I

    if-eq v0, v1, :cond_3

    .line 304
    iget v0, p0, Lo/fae;->q:I

    iget v1, p0, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fae;->N:I

    iget v2, p0, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->f:F

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float v9, v0, v1

    goto :goto_2

    .line 306
    :cond_3
    const/high16 v0, 0x42200000    # 40.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float v9, v0, v1

    .line 308
    :goto_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 309
    iget v0, p0, Lo/fae;->f:F

    sub-float/2addr v0, v8

    sub-float v9, v0, v9

    .line 311
    :cond_4
    iput v9, p0, Lo/fae;->ag:F

    .line 314
    iget v0, p0, Lo/fae;->m:I

    div-int/lit8 v0, v0, 0x3c

    add-int/lit8 v10, v0, 0x14

    .line 315
    iget v0, p0, Lo/fae;->m:I

    rem-int/lit8 v11, v0, 0x3c

    .line 316
    const/16 v0, 0x18

    if-lt v10, v0, :cond_5

    .line 317
    add-int/lit8 v10, v10, -0x18

    .line 319
    :cond_5
    const/16 v0, 0x14

    if-gt v0, v10, :cond_6

    const/16 v0, 0x18

    if-ge v10, v0, :cond_6

    .line 320
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    .line 321
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fae;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->ac:Ljava/lang/String;

    goto :goto_3

    .line 323
    :cond_6
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/fae;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->ac:Ljava/lang/String;

    .line 325
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v10}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v11}, Lo/fae;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fae;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 326
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    .line 329
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 333
    :goto_4
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v12, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v8, v0

    .line 334
    iget v0, p0, Lo/fae;->N:I

    iget v1, p0, Lo/fae;->K:I

    if-eq v0, v1, :cond_8

    .line 335
    iget v0, p0, Lo/fae;->m:I

    iget v1, p0, Lo/fae;->K:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fae;->N:I

    iget v2, p0, Lo/fae;->K:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lo/fae;->f:F

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float v9, v0, v1

    .line 336
    add-float v0, v9, v8

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/fae;->f:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 337
    iget v0, p0, Lo/fae;->f:F

    sub-float/2addr v0, v8

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v9, v0, v1

    goto :goto_5

    .line 340
    :cond_8
    iget v0, p0, Lo/fae;->f:F

    sub-float/2addr v0, v8

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v9, v0, v1

    .line 342
    :cond_9
    :goto_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 343
    iget v0, p0, Lo/fae;->f:F

    sub-float/2addr v0, v9

    sub-float v9, v0, v8

    .line 344
    const/4 v0, 0x0

    cmpg-float v0, v9, v0

    if-gez v0, :cond_a

    .line 345
    const/4 v9, 0x0

    .line 348
    :cond_a
    iput v9, p0, Lo/fae;->ah:F

    .line 350
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    .line 351
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    const/4 v1, 0x1

    aput-object v12, v0, v1

    .line 352
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ab:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 353
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ac:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 356
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 357
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    .line 358
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    const/4 v1, 0x1

    aput-object v7, v0, v1

    .line 359
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ac:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 360
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ab:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 362
    :cond_b
    goto/16 :goto_8

    .line 364
    :cond_c
    invoke-direct {p0}, Lo/fae;->getChartLabels()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->s:Ljava/util/List;

    .line 365
    iget-object v0, p0, Lo/fae;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    .line 366
    const/4 v6, 0x0

    :goto_6
    iget-object v0, p0, Lo/fae;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_e

    .line 367
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 368
    iget-object v0, p0, Lo/fae;->s:Ljava/util/List;

    iget-object v1, p0, Lo/fae;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v6

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    goto :goto_7

    .line 370
    :cond_d
    iget-object v0, p0, Lo/fae;->s:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 372
    :goto_7
    iget-object v0, p0, Lo/fae;->t:[Ljava/lang/String;

    aput-object v5, v0, v6

    .line 366
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 374
    :cond_e
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fae;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->ab:Ljava/lang/String;

    .line 375
    iget-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/fae;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->ac:Ljava/lang/String;

    .line 376
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ab:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 377
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ac:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 380
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 381
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ac:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 382
    iget-object v0, p0, Lo/fae;->u:[Ljava/lang/String;

    iget-object v1, p0, Lo/fae;->ab:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 385
    :cond_f
    :goto_8
    return-void
.end method

.method private i(Landroid/graphics/Canvas;)V
    .locals 11

    .line 837
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 838
    :cond_0
    return-void

    .line 841
    :cond_1
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 842
    const/4 v0, 0x3

    new-array v9, v0, [I

    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_008A2BE2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v9, v1

    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    .line 843
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8A2BE2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v9, v1

    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    .line 844
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_008A2BE2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/4 v1, 0x2

    aput v0, v9, v1

    .line 845
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 846
    const/16 v0, 0xa

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 848
    :cond_2
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/fae;->n:F

    iget v3, p0, Lo/fae;->n:F

    iget v2, p0, Lo/fae;->o:F

    const/high16 v4, 0x42700000    # 60.0f

    sub-float v4, v2, v4

    move-object v5, v9

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v10, v0

    .line 850
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 851
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 852
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 853
    move-object v0, p1

    iget v1, p0, Lo/fae;->n:F

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    iget v3, p0, Lo/fae;->n:F

    iget v4, p0, Lo/fae;->o:F

    const/high16 v5, 0x41800000    # 16.0f

    invoke-static {v5}, Lo/fiu;->e(F)F

    move-result v5

    sub-float/2addr v4, v5

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 854
    return-void
.end method

.method private k(I)V
    .locals 3

    .line 2475
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2476
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2478
    :sswitch_0
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fae;->U:F

    .line 2479
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2480
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto :goto_1

    .line 2482
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2484
    goto :goto_1

    .line 2486
    :sswitch_1
    iget v0, p0, Lo/fae;->g:F

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v2, v0, v1

    .line 2487
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const v1, 0x3ec28f5c    # 0.38f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fae;->U:F

    .line 2488
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 2489
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    goto :goto_1

    .line 2491
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_33008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->T:I

    .line 2493
    goto :goto_1

    .line 2495
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->y:Z

    .line 2498
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x43 -> :sswitch_0
        0x45 -> :sswitch_1
    .end sparse-switch
.end method

.method private setBottomToTopEndColor(I)V
    .locals 2

    .line 1499
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1501
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1502
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1503
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1505
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1506
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1508
    goto/16 :goto_1

    .line 1510
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1511
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05f06c9a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1512
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05f4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1514
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff06c9a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1515
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1517
    goto/16 :goto_1

    .line 1519
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1520
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05c12de0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1521
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05cb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1523
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffc12de0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1524
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1526
    goto/16 :goto_1

    .line 1528
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1529
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1530
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1532
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1533
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1535
    goto :goto_1

    .line 1537
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1538
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_054490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1539
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto :goto_1

    .line 1541
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1542
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1544
    goto :goto_1

    .line 1546
    :goto_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1547
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1550
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setBottomToTopLineEndColor(I)V
    .locals 2

    .line 1607
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1609
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1610
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto/16 :goto_0

    .line 1612
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1614
    goto/16 :goto_0

    .line 1616
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1617
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto/16 :goto_0

    .line 1619
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1621
    goto/16 :goto_0

    .line 1623
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1624
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10d53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto :goto_0

    .line 1626
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1628
    goto :goto_0

    .line 1630
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1631
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_108e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto :goto_0

    .line 1633
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1635
    goto :goto_0

    .line 1637
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1638
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto :goto_0

    .line 1640
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1642
    .line 1646
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setBottomToTopLineStartColor(I)V
    .locals 2

    .line 1559
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1561
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1562
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto/16 :goto_0

    .line 1564
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1566
    goto/16 :goto_0

    .line 1568
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1569
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10f4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto/16 :goto_0

    .line 1571
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1573
    goto/16 :goto_0

    .line 1575
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1576
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10cb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto :goto_0

    .line 1578
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1580
    goto :goto_0

    .line 1582
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1583
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_108e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto :goto_0

    .line 1585
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1587
    goto :goto_0

    .line 1589
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1590
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_104490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto :goto_0

    .line 1592
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1594
    .line 1598
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setBottomToTopStartColor(I)V
    .locals 2

    .line 1439
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1441
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1442
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1443
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1445
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1446
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1448
    goto/16 :goto_1

    .line 1450
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1451
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1452
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fc8f6e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1454
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1455
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc8f6e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1457
    goto/16 :goto_1

    .line 1459
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1460
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05d53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1461
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05db45c2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1463
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1464
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffdb45c2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1466
    goto/16 :goto_1

    .line 1468
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1469
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1470
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1472
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1473
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1475
    goto :goto_1

    .line 1477
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1478
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_054490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1479
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto :goto_1

    .line 1481
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1482
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1484
    goto :goto_1

    .line 1486
    :goto_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1487
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1490
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setCurrentRectColor(I)V
    .locals 2

    .line 949
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 951
    :sswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 952
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 953
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdb632:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto/16 :goto_1

    .line 955
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 956
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb632:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 958
    goto/16 :goto_1

    .line 960
    :sswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 961
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fd8b75:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 962
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10f27095:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto/16 :goto_1

    .line 964
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffd8b75:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 965
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff27095:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 967
    goto/16 :goto_1

    .line 969
    :sswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 970
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10d840c7:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 971
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10c62cde:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto/16 :goto_1

    .line 973
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd840c7:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 974
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffc62cde:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 976
    goto/16 :goto_1

    .line 978
    :sswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 979
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_109831ef:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 980
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_108e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto/16 :goto_1

    .line 982
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9831ef:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 983
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 985
    goto/16 :goto_1

    .line 987
    :sswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 988
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_104490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 989
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto/16 :goto_1

    .line 991
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 992
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 994
    goto/16 :goto_1

    .line 996
    :sswitch_5
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_5

    .line 997
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 998
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto/16 :goto_1

    .line 1000
    :cond_5
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 1001
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 1003
    goto :goto_1

    .line 1005
    :sswitch_6
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 1006
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 1007
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    goto :goto_1

    .line 1009
    :cond_6
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 1010
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 1012
    goto :goto_1

    .line 1014
    :goto_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->z:I

    .line 1015
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->w:I

    .line 1018
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_3
        0x42 -> :sswitch_2
        0x43 -> :sswitch_0
        0x44 -> :sswitch_1
        0x45 -> :sswitch_4
        0x2bc -> :sswitch_5
        0x2c6 -> :sswitch_6
    .end sparse-switch
.end method

.method private setTopToBottomEndColor(I)V
    .locals 2

    .line 1264
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1266
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1267
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1268
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1270
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1271
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1273
    goto/16 :goto_1

    .line 1275
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1276
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fc8f6e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1277
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1279
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc8f6e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1280
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1282
    goto/16 :goto_1

    .line 1284
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1285
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05db45c2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1286
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05d53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1288
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffdb45c2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1289
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1291
    goto/16 :goto_1

    .line 1293
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1294
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1295
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1297
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1298
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1300
    goto :goto_1

    .line 1302
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1303
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_054490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1304
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto :goto_1

    .line 1306
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1307
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1309
    goto :goto_1

    .line 1311
    :goto_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1312
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1315
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setTopToBottomLineEndColor(I)V
    .locals 2

    .line 1372
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1374
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1375
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdb632:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto/16 :goto_0

    .line 1377
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb632:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1379
    goto/16 :goto_0

    .line 1381
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1382
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10f4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto/16 :goto_0

    .line 1384
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1386
    goto/16 :goto_0

    .line 1388
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1389
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10cb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto :goto_0

    .line 1391
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1393
    goto :goto_0

    .line 1395
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1396
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_109d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto :goto_0

    .line 1398
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1400
    goto :goto_0

    .line 1402
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1403
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    goto :goto_0

    .line 1405
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->D:I

    .line 1407
    .line 1411
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setTopToBottomLineStartColor(I)V
    .locals 2

    .line 1324
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1326
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1327
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto/16 :goto_0

    .line 1329
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1331
    goto/16 :goto_0

    .line 1333
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1334
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10fc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto/16 :goto_0

    .line 1336
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1338
    goto/16 :goto_0

    .line 1340
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1341
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_10d53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto :goto_0

    .line 1343
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1345
    goto :goto_0

    .line 1347
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1348
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_109831ef:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto :goto_0

    .line 1350
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9831ef:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1352
    goto :goto_0

    .line 1354
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1355
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_104490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    goto :goto_0

    .line 1357
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->v:I

    .line 1359
    .line 1363
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setTopToBottomStartColor(I)V
    .locals 2

    .line 1162
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1164
    :pswitch_0
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1165
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1166
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05fdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1168
    :cond_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1169
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1171
    goto/16 :goto_1

    .line 1173
    :pswitch_1
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1174
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05f4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1175
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05f06c9a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1177
    :cond_1
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1178
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff06c9a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1180
    goto/16 :goto_1

    .line 1182
    :pswitch_2
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1183
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05cb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1184
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05c12de0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1186
    :cond_2
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1187
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffc12de0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1189
    goto/16 :goto_1

    .line 1191
    :pswitch_3
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1192
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1193
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_059330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto/16 :goto_1

    .line 1195
    :cond_3
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1196
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1198
    goto :goto_1

    .line 1200
    :pswitch_4
    iget v0, p0, Lo/fae;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1201
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_054490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1202
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_05008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    goto :goto_1

    .line 1204
    :cond_4
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1205
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1207
    goto :goto_1

    .line 1209
    :goto_0
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->A:I

    .line 1210
    iget-object v0, p0, Lo/fae;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fae;->C:I

    .line 1213
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/List;ZDZLjava/util/Date;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;ZDZLjava/util/Date;)V"
        }
    .end annotation

    .line 2180
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter refreshCoreFitnessDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2182
    const/4 v0, 0x0

    if-eq v0, p6, :cond_0

    .line 2183
    invoke-virtual {p6}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    .line 2185
    :cond_0
    iput-boolean p2, p0, Lo/fae;->p:Z

    .line 2187
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 2188
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->p:Z

    .line 2190
    :cond_2
    iput-boolean p5, p0, Lo/fae;->l:Z

    .line 2191
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 2192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->R:Z

    .line 2193
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2194
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2195
    iget-object v0, p0, Lo/fae;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2196
    iget-object v0, p0, Lo/fae;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2197
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->G:I

    .line 2198
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->M:I

    .line 2199
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->K:I

    .line 2200
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->N:I

    .line 2202
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 2203
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshCoreFitnessDataList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2206
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 2207
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2208
    invoke-direct {p0}, Lo/fae;->c()V

    .line 2212
    :cond_4
    if-eqz p2, :cond_5

    iget v0, p0, Lo/fae;->G:I

    if-nez v0, :cond_5

    iget v0, p0, Lo/fae;->M:I

    if-nez v0, :cond_5

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, p3

    if-eqz v0, :cond_5

    .line 2213
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u79d1\u5b66\u7761\u7720\u4e0d\u663e\u793a\u666e\u901a\u7761\u7720\u56fe\u8868 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2214
    iget-object v0, p0, Lo/fae;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2215
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2216
    iget-object v0, p0, Lo/fae;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2217
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->G:I

    .line 2218
    const/4 v0, 0x0

    iput v0, p0, Lo/fae;->M:I

    goto :goto_0

    .line 2220
    :cond_5
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u89c4\u907f\u5931\u6548 mREMSleepTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fae;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2221
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u89c4\u907f\u5931\u6548 isScienceSleep = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2222
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u89c4\u907f\u5931\u6548 mNoonSleepTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fae;->M:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2225
    :goto_0
    invoke-virtual {p0}, Lo/fae;->invalidate()V

    .line 2226
    const-string v0, "CoreSleepDayDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave refreshCoreFitnessDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2227
    return-void
.end method

.method public e()Z
    .locals 1

    .line 2505
    iget-boolean v0, p0, Lo/fae;->L:Z

    return v0
.end method

.method public getSleepDataList()Ljava/util/List;
    .locals 1

    .line 2170
    iget-object v0, p0, Lo/fae;->F:Ljava/util/List;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 242
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 244
    invoke-direct {p0}, Lo/fae;->getTimeLabel()V

    .line 246
    invoke-direct {p0, p1}, Lo/fae;->e(Landroid/graphics/Canvas;)V

    .line 248
    invoke-direct {p0, p1}, Lo/fae;->a(Landroid/graphics/Canvas;)V

    .line 250
    invoke-direct {p0}, Lo/fae;->a()V

    .line 252
    iget-boolean v0, p0, Lo/fae;->j:Z

    if-eqz v0, :cond_0

    .line 253
    invoke-direct {p0}, Lo/fae;->d()V

    .line 256
    :cond_0
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/graphics/Canvas;)V

    .line 258
    invoke-direct {p0, p1}, Lo/fae;->b(Landroid/graphics/Canvas;)V

    .line 260
    invoke-direct {p0, p1}, Lo/fae;->d(Landroid/graphics/Canvas;)V

    .line 262
    invoke-direct {p0, p1}, Lo/fae;->f(Landroid/graphics/Canvas;)V

    .line 264
    invoke-direct {p0, p1}, Lo/fae;->i(Landroid/graphics/Canvas;)V

    .line 265
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 226
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 227
    invoke-virtual {p0}, Lo/fae;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/fae;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fae;->f:F

    .line 228
    invoke-virtual {p0}, Lo/fae;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/fae;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fae;->h:F

    .line 229
    iget v0, p0, Lo/fae;->f:F

    const/high16 v1, 0x42a00000    # 80.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fae;->i:F

    .line 230
    const/high16 v0, 0x431e0000    # 158.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fae;->g:F

    .line 231
    iget v0, p0, Lo/fae;->h:F

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fae;->k:F

    .line 233
    iget v0, p0, Lo/fae;->k:F

    iput v0, p0, Lo/fae;->o:F

    .line 234
    iget v0, p0, Lo/fae;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/fae;->n:F

    .line 237
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lo/fae;->aa:Ljava/util/Date;

    .line 238
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1853
    invoke-virtual {p0}, Lo/fae;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1854
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->j:Z

    .line 1855
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 1857
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fae;->P:J

    .line 1858
    goto/16 :goto_1

    .line 1860
    :pswitch_1
    iget v0, p0, Lo/fae;->o:F

    const/high16 v1, 0x41900000    # 18.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lo/fae;->h:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 1862
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1864
    const/high16 v0, 0x41b00000    # 22.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    iget v2, p0, Lo/fae;->a:F

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 1866
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1870
    :cond_0
    iget v0, p0, Lo/fae;->a:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    const/high16 v2, 0x41b00000    # 22.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 1872
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1876
    :cond_1
    iget-boolean v0, p0, Lo/fae;->c:Z

    if-eqz v0, :cond_3

    .line 1878
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1880
    const/high16 v0, 0x41b00000    # 22.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    iget v2, p0, Lo/fae;->a:F

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 1882
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1886
    :cond_2
    iget v0, p0, Lo/fae;->a:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    const/high16 v2, 0x41b00000    # 22.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 1888
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1892
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fae;->L:Z

    .line 1893
    invoke-virtual {p0}, Lo/fae;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1896
    goto/16 :goto_1

    .line 1898
    :pswitch_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fae;->c:Z

    .line 1899
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1900
    iget-wide v0, p0, Lo/fae;->P:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x352

    cmp-long v0, v0, v2

    if-gez v0, :cond_5

    .line 1901
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1903
    const/high16 v0, 0x41b00000    # 22.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    iget v2, p0, Lo/fae;->a:F

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 1904
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/fae;->e(FF)V

    .line 1906
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 1910
    :cond_4
    iget v0, p0, Lo/fae;->a:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fae;->f:F

    const/high16 v2, 0x41b00000    # 22.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 1911
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/fae;->e(FF)V

    .line 1913
    invoke-direct {p0, p1}, Lo/fae;->c(Landroid/view/MotionEvent;)V

    .line 1917
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lo/fae;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1918
    .line 1922
    :cond_6
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setColorType(I)V
    .locals 0

    .line 216
    iput p1, p0, Lo/fae;->e:I

    .line 217
    return-void
.end method

.method public setonClickViewDefaultListener(Lo/fae$c;)V
    .locals 0

    .line 2379
    iput-object p1, p0, Lo/fae;->ad:Lo/fae$c;

    .line 2380
    return-void
.end method
