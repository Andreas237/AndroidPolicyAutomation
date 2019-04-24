.class public Lo/bgq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bgq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:F

.field b:I

.field c:F

.field d:I

.field e:F

.field f:I

.field private g:I

.field private h:Ljava/lang/String;

.field i:I

.field private k:Landroid/content/Context;

.field private l:Landroid/widget/EditText;

.field private m:Landroid/os/Handler;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Lo/egd;

.field private s:Landroid/widget/ImageView;

.field private t:I

.field private u:D


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/bgq$a;->g:I

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgq$a;->h:Ljava/lang/String;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgq$a;->m:Landroid/os/Handler;

    .line 76
    const/16 v0, 0x102

    iput v0, p0, Lo/bgq$a;->t:I

    .line 78
    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lo/bgq$a;->c:F

    .line 79
    const/high16 v0, 0x42780000    # 62.0f

    iput v0, p0, Lo/bgq$a;->e:F

    .line 80
    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lo/bgq$a;->a:F

    .line 81
    const/16 v0, 0x1388

    iput v0, p0, Lo/bgq$a;->b:I

    .line 82
    const/16 v0, 0x64

    iput v0, p0, Lo/bgq$a;->d:I

    .line 83
    const/16 v0, 0x5a0

    iput v0, p0, Lo/bgq$a;->f:I

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lo/bgq$a;->i:I

    .line 91
    iput-object p1, p0, Lo/bgq$a;->k:Landroid/content/Context;

    .line 92
    iput-object p2, p0, Lo/bgq$a;->m:Landroid/os/Handler;

    .line 93
    return-void
.end method

.method static synthetic a(Lo/bgq$a;)Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method private a(ILandroid/view/View;I)V
    .locals 14

    .line 311
    sget v0, Lcom/huawei/android/sns/R$id;->target_dialog_title:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 312
    sget v0, Lcom/huawei/android/sns/R$id;->target_custom_target_editText:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    .line 313
    sget v0, Lcom/huawei/android/sns/R$id;->target_custom_target_under_line:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bgq$a;->s:Landroid/widget/ImageView;

    .line 314
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    new-instance v1, Lo/bgq$a$3;

    invoke-direct {v1, p0}, Lo/bgq$a$3;-><init>(Lo/bgq$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 323
    new-instance v6, Ljava/util/Timer;

    invoke-direct {v6}, Ljava/util/Timer;-><init>()V

    .line 324
    new-instance v0, Lo/bgq$a$5;

    invoke-direct {v0, p0}, Lo/bgq$a$5;-><init>(Lo/bgq$a;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {v6, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 331
    sget v0, Lcom/huawei/android/sns/R$id;->target_custom_target_unit:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/egb;

    .line 332
    sget v0, Lcom/huawei/android/sns/R$id;->target_custom_target_tip:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgq$a;->n:Landroid/widget/TextView;

    .line 333
    sget v0, Lcom/huawei/android/sns/R$id;->target_custom_target_input_layout:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bgq$a;->o:Landroid/widget/LinearLayout;

    .line 336
    const-string v9, ""

    .line 337
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_custom_valid_range:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 339
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_3

    .line 341
    :pswitch_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/bgq$a;->a(I)V

    .line 342
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 343
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 344
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_type_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lo/bgq$a;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lo/bgq$a;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 346
    const-string v0, "1440"

    const-wide v1, 0x4096800000000000L    # 1440.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 347
    goto/16 :goto_3

    .line 349
    :pswitch_1
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_custom_valid_range_float:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 350
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lo/bgq$a;->a(I)V

    .line 351
    iget v11, p0, Lo/bgq$a;->c:F

    .line 352
    iget v12, p0, Lo/bgq$a;->e:F

    .line 353
    move/from16 v0, p3

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    .line 354
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v11, v0

    .line 355
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v12, v0

    goto :goto_0

    .line 356
    :cond_0
    move/from16 v0, p3

    const/16 v1, 0x106

    if-ne v0, v1, :cond_1

    .line 358
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v11, v0

    .line 359
    const/high16 v0, 0x43480000    # 200.0f

    mul-float/2addr v12, v0

    .line 360
    const/4 v0, 0x0

    iput v0, p0, Lo/bgq$a;->a:F

    .line 363
    :cond_1
    :goto_0
    iget v0, p0, Lo/bgq$a;->a:F

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 364
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 365
    move/from16 v0, p3

    const/16 v1, 0x106

    if-ne v0, v1, :cond_2

    .line 366
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_custom_valid_range:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 367
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 369
    :cond_2
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 370
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 372
    :goto_1
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 373
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    float-to-int v1, v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_3

    .line 377
    :cond_3
    move/from16 v0, p3

    const/16 v1, 0x106

    if-ne v0, v1, :cond_4

    .line 378
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_custom_valid_range:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 379
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 380
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lo/bgq$a;->a:F

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    float-to-int v1, v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    .line 382
    :cond_4
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 383
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 384
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    float-to-int v1, v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 386
    :goto_2
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 387
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    goto :goto_3

    .line 391
    :pswitch_2
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/bgq$a;->a(I)V

    .line 392
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 393
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 394
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lo/bgq$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lo/bgq$a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 396
    const-string v0, "5000"

    const-wide v1, 0x40b3880000000000L    # 5000.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 397
    .line 401
    :goto_3
    iget-wide v0, p0, Lo/bgq$a;->u:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_7

    .line 402
    iget v0, p0, Lo/bgq$a;->t:I

    const/16 v1, 0x106

    if-eq v0, v1, :cond_5

    iget v0, p0, Lo/bgq$a;->t:I

    const/16 v1, 0x2711

    if-ne v0, v1, :cond_6

    .line 403
    :cond_5
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    iget-wide v1, p0, Lo/bgq$a;->u:D

    double-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 405
    :cond_6
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    iget-wide v1, p0, Lo/bgq$a;->u:D

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 408
    :cond_7
    :goto_4
    iget-object v0, p0, Lo/bgq$a;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 409
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Landroid/text/Editable;)V
    .locals 4

    .line 293
    iget v0, p0, Lo/bgq$a;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 295
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-static {v2}, Lo/bgq$a;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 297
    return-void

    .line 300
    :cond_0
    invoke-static {v2}, Lo/bgq$a;->e(Ljava/lang/String;)I

    move-result v3

    .line 301
    if-gez v3, :cond_1

    return-void

    .line 302
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    .line 304
    add-int/lit8 v0, v3, 0x3

    add-int/lit8 v1, v3, 0x4

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 307
    :cond_2
    return-void
.end method

.method static synthetic a(Lo/bgq$a;Landroid/text/Editable;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lo/bgq$a;->e(Landroid/text/Editable;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 441
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 442
    const/4 v0, 0x1

    return v0

    .line 443
    :catch_0
    move-exception v1

    .line 444
    const/4 v0, 0x0

    return v0

    .line 445
    :catch_1
    move-exception v1

    .line 446
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/bgq$a;)Landroid/os/Handler;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lo/bgq$a;)Landroid/widget/EditText;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic c(Lo/bgq$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 65
    iput-object p1, p0, Lo/bgq$a;->h:Ljava/lang/String;

    return-object p1
.end method

.method private c(IF)Z
    .locals 5

    .line 223
    const/4 v2, 0x0

    .line 224
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 226
    :pswitch_0
    iget v3, p0, Lo/bgq$a;->c:F

    .line 227
    iget v4, p0, Lo/bgq$a;->a:F

    .line 228
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    iget v3, p0, Lo/bgq$a;->e:F

    .line 231
    :cond_0
    iget v0, p0, Lo/bgq$a;->t:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_1

    .line 232
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v3, v0

    .line 234
    :cond_1
    iget v0, p0, Lo/bgq$a;->t:I

    const/16 v1, 0x106

    if-ne v0, v1, :cond_2

    .line 235
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v3, v0

    .line 236
    const/4 v4, 0x0

    .line 238
    :cond_2
    cmpg-float v0, p2, v4

    if-ltz v0, :cond_3

    cmpl-float v0, p2, v3

    if-lez v0, :cond_6

    .line 239
    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    .line 243
    :pswitch_1
    iget v0, p0, Lo/bgq$a;->i:I

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_4

    iget v0, p0, Lo/bgq$a;->f:I

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_6

    .line 244
    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    .line 248
    :pswitch_2
    iget v0, p0, Lo/bgq$a;->d:I

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_5

    iget v0, p0, Lo/bgq$a;->b:I

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_6

    .line 249
    :cond_5
    const/4 v2, 0x1

    .line 255
    :cond_6
    :goto_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 4

    .line 432
    invoke-static {}, Lo/bgq;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " isNumber = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, " , isInteger is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/bgq$a;->a(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,isFloat is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/bgq$a;->d(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    invoke-static {p0}, Lo/bgq$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lo/bgq$a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/bgq$a;)Lo/egd;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 2

    .line 456
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 457
    const/4 v0, 0x1

    return v0

    .line 459
    :catch_0
    move-exception v1

    .line 460
    const/4 v0, 0x0

    return v0

    .line 461
    :catch_1
    move-exception v1

    .line 462
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;)I
    .locals 5

    .line 469
    const/4 v1, -0x1

    .line 470
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 472
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_1

    .line 473
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 474
    invoke-static {v4}, Lo/bgq$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 475
    return v3

    .line 472
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 479
    :cond_1
    return v1
.end method

.method static synthetic e(Lo/bgq$a;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/bgq$a;->g:I

    return v0
.end method

.method private e(Landroid/text/Editable;)V
    .locals 3

    .line 260
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 261
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 262
    iget v0, p0, Lo/bgq$a;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bgq$a;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    return-void

    .line 267
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 268
    iget v0, p0, Lo/bgq$a;->g:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 270
    :pswitch_0
    const/4 v0, 0x1

    invoke-direct {p0, v0, v2}, Lo/bgq$a;->c(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    return-void

    .line 275
    :pswitch_1
    const/4 v0, 0x0

    invoke-direct {p0, v0, v2}, Lo/bgq$a;->c(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    return-void

    .line 280
    :pswitch_2
    const/4 v0, 0x2

    invoke-direct {p0, v0, v2}, Lo/bgq$a;->c(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    return-void

    .line 287
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bgq$a;->b(Z)V

    .line 290
    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lo/bgq$a;Landroid/text/Editable;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lo/bgq$a;->a(Landroid/text/Editable;)V

    return-void
.end method

.method static synthetic e(Lo/bgq$a;IF)Z
    .locals 1

    .line 65
    invoke-direct {p0, p1, p2}, Lo/bgq$a;->c(IF)Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lo/bgq$a;)Landroid/widget/TextView;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic h(Lo/bgq$a;)Landroid/widget/LinearLayout;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->o:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic i(Lo/bgq$a;)Landroid/widget/ImageView;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->s:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic k(Lo/bgq$a;)Landroid/content/Context;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 424
    if-lez p1, :cond_0

    .line 425
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 427
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 412
    if-eqz p1, :cond_0

    .line 413
    iget-object v0, p0, Lo/bgq$a;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 414
    iget-object v0, p0, Lo/bgq$a;->s:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 415
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 417
    :cond_0
    iget-object v0, p0, Lo/bgq$a;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 418
    iget-object v0, p0, Lo/bgq$a;->s:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bgq$a;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 419
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 421
    :goto_0
    return-void
.end method

.method public c(IIZ)Lo/bgq;
    .locals 7

    .line 100
    iput p1, p0, Lo/bgq$a;->g:I

    .line 101
    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 102
    new-instance v4, Lo/bgq;

    iget-object v0, p0, Lo/bgq$a;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$style;->TrackDialog:I

    invoke-direct {v4, v0, v1}, Lo/bgq;-><init>(Landroid/content/Context;I)V

    .line 103
    sget v0, Lcom/huawei/android/sns/R$layout;->dialog_health_group_event_target:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 105
    iput p2, p0, Lo/bgq$a;->t:I

    .line 106
    invoke-direct {p0, p1, v5, p2}, Lo/bgq$a;->a(ILandroid/view/View;I)V

    .line 108
    sget v0, Lcom/huawei/android/sns/R$id;->target_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/egd;

    .line 109
    new-instance v0, Lo/bgq$a$1;

    invoke-direct {v0, p0, v4}, Lo/bgq$a$1;-><init>(Lo/bgq$a;Lo/bgq;)V

    invoke-virtual {v6, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    sget v0, Lcom/huawei/android/sns/R$id;->target_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    .line 116
    if-nez p3, :cond_0

    .line 117
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 119
    :cond_0
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 120
    iget-object v0, p0, Lo/bgq$a;->l:Landroid/widget/EditText;

    new-instance v1, Lo/bgq$a$2;

    invoke-direct {v1, p0, p3}, Lo/bgq$a$2;-><init>(Lo/bgq$a;Z)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 147
    iget-object v0, p0, Lo/bgq$a;->p:Lo/egd;

    new-instance v1, Lo/bgq$a$4;

    invoke-direct {v1, p0, v4, p3}, Lo/bgq$a$4;-><init>(Lo/bgq$a;Lo/bgq;Z)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/bgq;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 217
    invoke-virtual {v4, v5}, Lo/bgq;->setContentView(Landroid/view/View;)V

    .line 218
    return-object v4
.end method

.method public d(D)V
    .locals 0

    .line 96
    iput-wide p1, p0, Lo/bgq$a;->u:D

    .line 97
    return-void
.end method
