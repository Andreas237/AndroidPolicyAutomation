.class public Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fau;>;"
        }
    .end annotation
.end field

.field private b:Landroid/widget/ListView;

.field private c:Lo/fat;

.field private d:J

.field e:Lo/exl;

.field private f:Landroid/os/Handler;

.field private final g:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->b:Landroid/widget/ListView;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->c:Lo/fat;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    .line 67
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d:J

    .line 68
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->g:J

    .line 70
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->f:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 10

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 320
    return-void

    .line 323
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 326
    new-instance v4, Lo/fau;

    invoke-direct {v4}, Lo/fau;-><init>()V

    .line 327
    sget v0, Lcom/huawei/ui/main/R$mipmap;->fitness_goal_step:I

    invoke-virtual {v4, v0}, Lo/fau;->d(I)V

    .line 328
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fau;->a(I)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->e()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 331
    invoke-virtual {v4, v5}, Lo/fau;->e(Ljava/lang/String;)V

    .line 332
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 336
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->a()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_2

    .line 337
    new-instance v4, Lo/fau;

    invoke-direct {v4}, Lo/fau;-><init>()V

    .line 338
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_kcal:I

    invoke-virtual {v4, v0}, Lo/fau;->d(I)V

    .line 339
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/fau;->a(I)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->a()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 342
    invoke-virtual {v4, v5}, Lo/fau;->e(Ljava/lang/String;)V

    .line 343
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 348
    new-instance v4, Lo/fau;

    invoke-direct {v4}, Lo/fau;-><init>()V

    .line 349
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_distance:I

    invoke-virtual {v4, v0}, Lo/fau;->d(I)V

    .line 350
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lo/fau;->a(I)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->c()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 353
    invoke-virtual {v4, v5}, Lo/fau;->e(Ljava/lang/String;)V

    .line 354
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 357
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    .line 359
    invoke-virtual {v0}, Lo/exl;->c()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    .line 358
    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v6

    .line 361
    invoke-virtual {v4, v6}, Lo/fau;->e(Ljava/lang/String;)V

    .line 362
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 366
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->d()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_6

    .line 370
    new-instance v4, Lo/fau;

    invoke-direct {v4}, Lo/fau;-><init>()V

    .line 371
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_climb:I

    invoke-virtual {v4, v0}, Lo/fau;->d(I)V

    .line 372
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lo/fau;->a(I)V

    .line 373
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_action_climb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->a(Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 376
    invoke-virtual {v4, v5}, Lo/fau;->e(Ljava/lang/String;)V

    .line 377
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 380
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->d(D)[I

    move-result-object v6

    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget v1, v6, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v6, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 383
    invoke-virtual {v4, v7}, Lo/fau;->e(Ljava/lang/String;)V

    .line 384
    const-string v0, ""

    invoke-virtual {v4, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 387
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_7

    .line 391
    new-instance v4, Lo/fau;

    invoke-direct {v4}, Lo/fau;-><init>()V

    .line 392
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_heart:I

    invoke-virtual {v4, v0}, Lo/fau;->d(I)V

    .line 393
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Lo/fau;->a(I)V

    .line 394
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fau;->a(Ljava/lang/String;)V

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->b()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 397
    invoke-virtual {v4, v5}, Lo/fau;->e(Ljava/lang/String;)V

    .line 398
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_month_data_rate_uint:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v2}, Lo/exl;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 399
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 400
    invoke-virtual {v4, v6}, Lo/fau;->d(Ljava/lang/String;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->f()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_8

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    invoke-virtual {v0}, Lo/exl;->f()I

    move-result v4

    .line 406
    div-int/lit8 v5, v4, 0x3c

    .line 407
    rem-int/lit8 v6, v4, 0x3c

    .line 410
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 411
    int-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 413
    new-instance v9, Lo/fau;

    invoke-direct {v9}, Lo/fau;-><init>()V

    .line 414
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_sleep:I

    invoke-virtual {v9, v0}, Lo/fau;->d(I)V

    .line 415
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Lo/fau;->a(I)V

    .line 417
    invoke-virtual {v9, v7}, Lo/fau;->e(Ljava/lang/String;)V

    .line 418
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fau;->d(Ljava/lang/String;)V

    .line 419
    invoke-virtual {v9, v8}, Lo/fau;->c(Ljava/lang/String;)V

    .line 420
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fau;->b(Ljava/lang/String;)V

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 427
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->c:Lo/fat;

    invoke-virtual {v0}, Lo/fat;->notifyDataSetChanged()V

    .line 428
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->b()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d:J

    return-wide v0
.end method

.method private d()V
    .locals 2

    .line 242
    sget v0, Lcom/huawei/ui/main/R$id;->lv_fitness_data_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->b:Landroid/widget/ListView;

    .line 243
    new-instance v0, Lo/fat;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->a:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lo/fat;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->c:Lo/fat;

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->c:Lo/fat;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->b:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 316
    return-void
.end method

.method private e(J)V
    .locals 5

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 138
    return-void

    .line 141
    :cond_0
    const-string v0, "FitnessdataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestListData startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mTodayTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->g:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->g:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V

    invoke-virtual {v0, v1}, Lo/exl;->b(Lo/egg;)V

    goto :goto_0

    .line 154
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/exl;->c(JLo/egg;)V

    .line 164
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 86
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 87
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_fitness_data_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->setContentView(I)V

    .line 91
    new-instance v0, Lo/exl;

    invoke-direct {v0, p0}, Lo/exl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e:Lo/exl;

    .line 93
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d()V

    .line 95
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->b()V

    .line 97
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->g:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->e(J)V

    .line 104
    return-void
.end method
