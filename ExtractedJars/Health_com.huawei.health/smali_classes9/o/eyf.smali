.class public Lo/eyf;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DrawAllocation"
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Ljava/lang/String;

.field private D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private E:I

.field private F:Landroid/graphics/Paint;

.field private G:Z

.field private H:F

.field private I:F

.field private J:F

.field private K:F

.field private L:Landroid/graphics/RectF;

.field private M:F

.field private N:F

.field private a:F

.field private b:Z

.field private c:Landroid/content/Context;

.field private d:F

.field private e:I

.field private f:F

.field private g:F

.field private h:I

.field private i:F

.field private j:I

.field private k:Landroid/graphics/RectF;

.field private l:I

.field private m:Landroid/graphics/LinearGradient;

.field private n:I

.field private o:F

.field private p:I

.field private q:F

.field private r:F

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private u:D

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private w:F

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eyb;>;"
        }
    .end annotation
.end field

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eyb;>;"
        }
    .end annotation
.end field

.field private z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 109
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->e:I

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->b:Z

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyf;->m:Landroid/graphics/LinearGradient;

    .line 74
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->o:F

    .line 76
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->r:F

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->q:F

    .line 79
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    iput-wide v0, p0, Lo/eyf;->u:D

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->t:Ljava/util/List;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->s:Ljava/util/List;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->v:Ljava/util/List;

    .line 88
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eyf;->z:Landroid/graphics/Paint;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->x:Ljava/util/ArrayList;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->y:Ljava/util/ArrayList;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->D:Ljava/util/ArrayList;

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lo/eyf;->C:Ljava/lang/String;

    .line 99
    const/16 v0, 0x3e8

    iput v0, p0, Lo/eyf;->j:I

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->B:Z

    .line 103
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->A:Z

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyf;->G:Z

    .line 510
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eyf;->F:Landroid/graphics/Paint;

    .line 511
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->E:I

    .line 512
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/eyf;->I:F

    .line 513
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/eyf;->H:F

    .line 514
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/eyf;->L:Landroid/graphics/RectF;

    .line 515
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->J:F

    .line 516
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->N:F

    .line 517
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->M:F

    .line 518
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->K:F

    .line 110
    iput-object p1, p0, Lo/eyf;->c:Landroid/content/Context;

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 115
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->e:I

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->b:Z

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyf;->m:Landroid/graphics/LinearGradient;

    .line 74
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->o:F

    .line 76
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->r:F

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->q:F

    .line 79
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    iput-wide v0, p0, Lo/eyf;->u:D

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->t:Ljava/util/List;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->s:Ljava/util/List;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->v:Ljava/util/List;

    .line 88
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eyf;->z:Landroid/graphics/Paint;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->x:Ljava/util/ArrayList;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->y:Ljava/util/ArrayList;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyf;->D:Ljava/util/ArrayList;

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lo/eyf;->C:Ljava/lang/String;

    .line 99
    const/16 v0, 0x3e8

    iput v0, p0, Lo/eyf;->j:I

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->B:Z

    .line 103
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->A:Z

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyf;->G:Z

    .line 510
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/eyf;->F:Landroid/graphics/Paint;

    .line 511
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->E:I

    .line 512
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lo/eyf;->I:F

    .line 513
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/eyf;->H:F

    .line 514
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/eyf;->L:Landroid/graphics/RectF;

    .line 515
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->J:F

    .line 516
    const/4 v0, 0x0

    iput v0, p0, Lo/eyf;->N:F

    .line 517
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->M:F

    .line 518
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/eyf;->K:F

    .line 116
    iput-object p1, p0, Lo/eyf;->c:Landroid/content/Context;

    .line 117
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 10

    .line 712
    div-int/lit8 v5, p1, 0x3c

    .line 713
    rem-int/lit8 v6, p1, 0x3c

    .line 715
    iget-object v0, p0, Lo/eyf;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 716
    iget-object v0, p0, Lo/eyf;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sleep_unit_m:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 718
    const-string v9, ""

    .line 719
    if-lez v5, :cond_0

    .line 720
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 723
    :cond_0
    if-lez v6, :cond_1

    .line 724
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 727
    :cond_1
    return-object v9
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 10

    .line 480
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 481
    iget-boolean v0, p0, Lo/eyf;->G:Z

    if-eqz v0, :cond_0

    .line 482
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 484
    :cond_0
    const/high16 v0, -0x80000000

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 486
    :goto_0
    const/4 v0, 0x1

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 487
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 489
    const/4 v5, 0x0

    :goto_1
    iget-object v0, p0, Lo/eyf;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 490
    iget-object v0, p0, Lo/eyf;->v:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 491
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v6, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v7, v0

    .line 492
    iget v0, p0, Lo/eyf;->o:F

    iget v1, p0, Lo/eyf;->g:F

    iget-object v2, p0, Lo/eyf;->v:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    div-float/2addr v1, v2

    int-to-float v2, v5

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v8, v0, v1

    .line 493
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gez v0, :cond_1

    .line 494
    const/4 v8, 0x0

    .line 497
    :cond_1
    add-float v0, v8, v7

    iget v1, p0, Lo/eyf;->a:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 498
    iget v0, p0, Lo/eyf;->a:F

    sub-float v8, v0, v7

    .line 501
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 502
    iget v0, p0, Lo/eyf;->a:F

    iget v1, p0, Lo/eyf;->o:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/eyf;->g:F

    iget-object v2, p0, Lo/eyf;->v:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    div-float/2addr v1, v2

    int-to-float v2, v5

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v8, v0, v1

    .line 504
    :cond_3
    iget v0, p0, Lo/eyf;->d:F

    iget v1, p0, Lo/eyf;->q:F

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v1, v2

    sub-float v9, v0, v1

    .line 505
    invoke-virtual {p1, v6, v8, v9, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 489
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 507
    :cond_4
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 11

    .line 671
    const/4 v3, 0x0

    .line 672
    const/4 v4, 0x0

    .line 673
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 674
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 675
    iget-object v0, p0, Lo/eyf;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 676
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/eyf;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 677
    iget-object v0, p0, Lo/eyf;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eyb;

    .line 678
    iget-object v4, v3, Lo/eyb;->a:Landroid/graphics/RectF;

    .line 680
    invoke-direct {p0, v5, v6, v4}, Lo/eyf;->e(FFLandroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 681
    iget-object v0, p0, Lo/eyf;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    iget-boolean v0, p0, Lo/eyf;->b:Z

    if-eqz v0, :cond_3

    .line 683
    iget-object v0, p0, Lo/eyf;->c:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 684
    const-string v0, "Step"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Calorie"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Distance"

    .line 685
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Climb"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 686
    :cond_0
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 687
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    const-string v0, "activityName"

    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 689
    const-string v0, "barSize"

    iget v1, p0, Lo/eyf;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 690
    sget-object v0, Lo/dae;->gJ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v10

    .line 691
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/eyf;->c:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v10, v9, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 693
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyf;->b:Z

    .line 694
    goto :goto_1

    .line 676
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 700
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lo/eyf;->invalidate()V

    .line 701
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 18

    .line 378
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 379
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 380
    new-instance v8, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v8, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 382
    const-wide/16 v9, 0x0

    .line 383
    const/4 v11, 0x0

    .line 384
    const/4 v12, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v12, v0, :cond_8

    .line 385
    const/4 v0, 0x1

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 386
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 387
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eyf;->G:Z

    if-eqz v0, :cond_0

    .line 388
    const v0, 0xffffff

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 390
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 392
    :goto_1
    const/16 v0, 0x1a

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    .line 394
    const-wide/16 v0, 0x0

    cmpg-double v0, v9, v0

    if-gtz v0, :cond_1

    .line 395
    goto/16 :goto_6

    .line 397
    :cond_1
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v10}, Lo/eyf;->c(D)F

    move-result v11

    .line 399
    const/4 v0, 0x0

    if-ne v0, v12, :cond_2

    .line 400
    const/4 v0, 0x1

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 401
    move-object/from16 v0, p1

    move v2, v11

    move-object/from16 v1, p0

    iget v3, v1, Lo/eyf;->a:F

    move v4, v11

    move-object v5, v6

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 405
    :cond_2
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 406
    const/16 v0, 0x32

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 407
    const/4 v0, 0x0

    invoke-virtual {v7, v0, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 408
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->a:F

    invoke-virtual {v7, v0, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 409
    move-object/from16 v0, p1

    invoke-virtual {v0, v7, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 410
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 413
    :goto_2
    const/4 v13, 0x1

    .line 414
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eyf;->A:Z

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/eyf;->u:D

    cmpl-double v0, v9, v0

    if-nez v0, :cond_3

    .line 415
    const/4 v13, 0x0

    .line 418
    :cond_3
    if-eqz v13, :cond_7

    .line 420
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eyf;->G:Z

    if-eqz v0, :cond_4

    .line 421
    const v0, 0xffffff

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_3

    .line 423
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 425
    :goto_3
    const/16 v0, 0x7f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 426
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 427
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 428
    const/4 v0, 0x1

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 429
    const-string v14, ""

    .line 430
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->j:I

    packed-switch v0, :pswitch_data_0

    goto :goto_4

    .line 433
    :pswitch_0
    const/4 v0, 0x2

    invoke-static {v9, v10, v0}, Lo/dbf;->b(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v14

    .line 434
    goto :goto_5

    .line 436
    :pswitch_1
    double-to-int v0, v9

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/eyf;->a(I)Ljava/lang/String;

    move-result-object v14

    .line 437
    goto :goto_5

    .line 440
    :pswitch_2
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v9, v10, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v14

    .line 441
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 442
    const/4 v0, 0x1

    invoke-static {v9, v10, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_5

    .line 447
    :goto_4
    :pswitch_3
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v9, v10, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v14

    .line 451
    :cond_5
    :goto_5
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v0, v6, v14}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v15

    .line 452
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eyh;->b(Landroid/graphics/Paint;)F

    move-result v16

    .line 454
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->a:F

    sub-float v17, v0, v15

    .line 455
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 456
    const/16 v17, 0x0

    .line 458
    :cond_6
    add-float v0, v11, v16

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v1, v14, v2, v0, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 384
    :cond_7
    :goto_6
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 461
    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private c(D)F
    .locals 2

    .line 367
    iget v0, p0, Lo/eyf;->i:F

    iget v1, p0, Lo/eyf;->f:F

    sub-float/2addr v0, v1

    invoke-direct {p0, p1, p2}, Lo/eyf;->d(D)F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method private d(D)F
    .locals 4

    .line 371
    iget v0, p0, Lo/eyf;->i:F

    iget v1, p0, Lo/eyf;->f:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    mul-double/2addr v0, p1

    iget-wide v2, p0, Lo/eyf;->u:D

    div-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 30

    .line 238
    const/4 v8, 0x0

    .line 239
    const/4 v9, 0x0

    .line 240
    const-wide/16 v10, 0x0

    .line 241
    const-wide/16 v12, 0x0

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    .line 244
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->g:F

    add-int/lit8 v1, v14, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/eyf;->w:F

    .line 245
    const/4 v15, 0x0

    .line 246
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 248
    new-instance v16, Landroid/graphics/Paint;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Paint;-><init>()V

    .line 249
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 250
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->l:I

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 252
    new-instance v17, Landroid/graphics/Path;

    invoke-direct/range {v17 .. v17}, Landroid/graphics/Path;-><init>()V

    .line 253
    const/16 v0, 0x8

    new-array v0, v0, [F

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v18, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v18, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x2

    aput v0, v18, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x3

    aput v0, v18, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v18, v1

    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v18, v1

    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v18, v1

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v18, v1

    .line 255
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    if-ge v0, v14, :cond_9

    .line 256
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->t:Ljava/util/List;

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v20

    .line 257
    const-wide/16 v22, 0x0

    .line 258
    const/16 v24, 0x0

    .line 259
    const/16 v25, 0x0

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-le v0, v1, :cond_0

    .line 261
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->s:Ljava/util/List;

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v22

    .line 263
    const-wide/16 v0, 0x0

    cmpl-double v0, v22, v0

    if-lez v0, :cond_0

    .line 264
    const/16 v25, 0x1

    .line 265
    move-object/from16 v0, p0

    move-wide/from16 v1, v22

    invoke-direct {v0, v1, v2}, Lo/eyf;->d(D)F

    move-result v24

    .line 269
    :cond_0
    add-double v10, v20, v22

    .line 271
    const-wide/16 v0, 0x0

    cmpg-double v0, v10, v0

    if-gtz v0, :cond_1

    .line 272
    goto/16 :goto_2

    .line 274
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->o:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->w:F

    move/from16 v2, v19

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v8, v0, v1

    .line 275
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->r:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->g:F

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->w:F

    move/from16 v2, v19

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float v8, v0, v1

    .line 279
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11}, Lo/eyf;->c(D)F

    move-result v9

    .line 281
    const/16 v26, 0x0

    .line 282
    const-wide/16 v0, 0x0

    cmpl-double v0, v22, v0

    if-lez v0, :cond_3

    .line 283
    move-object/from16 v0, p0

    move-wide/from16 v1, v22

    invoke-direct {v0, v1, v2}, Lo/eyf;->c(D)F

    move-result v26

    .line 287
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->i:F

    cmpl-float v0, v9, v0

    if-ltz v0, :cond_4

    .line 288
    goto/16 :goto_2

    .line 291
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->p:I

    move/from16 v27, v0

    .line 292
    const-wide/16 v0, 0x0

    cmpl-double v0, v20, v0

    if-lez v0, :cond_5

    .line 294
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->z:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 295
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v8, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/eyf;->f:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, v8

    move-object/from16 v3, p0

    iget v3, v3, Lo/eyf;->d:F

    move-object/from16 v4, p0

    iget v4, v4, Lo/eyf;->q:F

    sub-float/2addr v3, v4

    sub-float v3, v3, v24

    invoke-direct {v0, v1, v9, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eyf;->k:Landroid/graphics/RectF;

    .line 296
    new-instance v0, Landroid/graphics/LinearGradient;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->k:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eyf;->k:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/eyf;->k:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/eyf;->k:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    move-object/from16 v5, p0

    iget v5, v5, Lo/eyf;->h:I

    move-object/from16 v6, p0

    iget v6, v6, Lo/eyf;->p:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eyf;->m:Landroid/graphics/LinearGradient;

    .line 300
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->z:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->m:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 305
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->k:Landroid/graphics/RectF;

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    invoke-virtual {v2, v0, v3, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 306
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->z:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 308
    :cond_5
    if-eqz v25, :cond_6

    .line 311
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v8, v1

    move v2, v9

    move-object/from16 v3, p0

    iget v3, v3, Lo/eyf;->f:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v8

    move-object/from16 v4, p0

    iget v4, v4, Lo/eyf;->f:F

    add-float/2addr v4, v9

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v28, v0

    .line 312
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v1, v17

    move-object/from16 v2, v28

    move-object/from16 v3, v18

    invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 313
    move-object/from16 v0, p1

    move-object/from16 v1, v17

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 317
    :cond_6
    :goto_1
    if-eqz v25, :cond_7

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->z:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 320
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v8, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/eyf;->f:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, v9

    move-object/from16 v3, p0

    iget v3, v3, Lo/eyf;->f:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v8

    move-object/from16 v4, p0

    iget v4, v4, Lo/eyf;->d:F

    move-object/from16 v5, p0

    iget v5, v5, Lo/eyf;->q:F

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v28, v0

    .line 321
    new-instance v0, Landroid/graphics/LinearGradient;

    move-object/from16 v1, v28

    iget v1, v1, Landroid/graphics/RectF;->right:F

    move-object/from16 v2, v28

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v3, v28

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move-object/from16 v4, v28

    iget v4, v4, Landroid/graphics/RectF;->top:F

    move-object/from16 v5, p0

    iget v5, v5, Lo/eyf;->n:I

    move-object/from16 v6, p0

    iget v6, v6, Lo/eyf;->l:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object/from16 v29, v0

    .line 325
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->z:Landroid/graphics/Paint;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 327
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->z:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v28

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 341
    :cond_7
    new-instance v15, Lo/eyb;

    invoke-direct {v15}, Lo/eyb;-><init>()V

    .line 342
    const/4 v0, 0x1

    iput v0, v15, Lo/eyb;->e:I

    .line 343
    new-instance v0, Landroid/graphics/PointF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v9, v1

    const/high16 v2, 0x40400000    # 3.0f

    add-float/2addr v1, v2

    invoke-direct {v0, v8, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v15, Lo/eyb;->c:Landroid/graphics/PointF;

    .line 344
    double-to-int v0, v10

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Lo/eyb;->d:Ljava/lang/String;

    .line 345
    iput-wide v10, v15, Lo/eyb;->b:D

    .line 346
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v8, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/eyf;->f:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, v8

    move-object/from16 v3, p0

    iget v3, v3, Lo/eyf;->d:F

    move-object/from16 v4, p0

    iget v4, v4, Lo/eyf;->q:F

    sub-float/2addr v3, v4

    invoke-direct {v0, v1, v9, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, v15, Lo/eyb;->a:Landroid/graphics/RectF;

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eyf;->B:Z

    if-eqz v0, :cond_8

    .line 351
    cmpl-double v0, v10, v12

    if-lez v0, :cond_8

    .line 352
    move-wide v12, v10

    .line 353
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    :cond_8
    :goto_2
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_0

    .line 358
    :cond_9
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/eyf;->B:Z

    .line 359
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 7

    .line 468
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 469
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 470
    const/16 v0, 0x19

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 471
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 472
    move-object v0, p1

    iget v2, p0, Lo/eyf;->i:F

    iget v3, p0, Lo/eyf;->a:F

    iget v4, p0, Lo/eyf;->i:F

    move-object v5, v6

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 473
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Ljava/util/ArrayList;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;Ljava/util/ArrayList<Lo/eyb;>;)V"
        }
    .end annotation

    .line 524
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->F:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 525
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->F:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 526
    const/4 v6, 0x0

    .line 527
    const-string v7, ""

    .line 528
    const/4 v8, -0x1

    .line 529
    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 530
    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 531
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 532
    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 533
    const/16 v19, 0x0

    :goto_0
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_9

    .line 534
    move-object/from16 v0, p2

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eyb;

    .line 535
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->j:I

    const/16 v1, 0x3e9

    if-ne v1, v0, :cond_0

    .line 536
    iget-wide v0, v6, Lo/eyb;->b:D

    double-to-int v0, v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/eyf;->a(I)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_1

    .line 538
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->j:I

    const/16 v1, 0x3ea

    if-ne v1, v0, :cond_2

    .line 539
    iget-wide v0, v6, Lo/eyb;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    iget-wide v0, v6, Lo/eyb;->b:D

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_1

    .line 543
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, v6, Lo/eyb;->b:D

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_1

    .line 546
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->j:I

    const/16 v1, 0x3eb

    if-ne v1, v0, :cond_3

    .line 549
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, v6, Lo/eyb;->b:D

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_1

    .line 551
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->j:I

    const/16 v1, 0x3ec

    if-ne v1, v0, :cond_4

    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, v6, Lo/eyb;->b:D

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 555
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->c:Landroid/content/Context;

    if-eqz v0, :cond_5

    .line 556
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, v6, Lo/eyb;->b:D

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    .line 557
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 563
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, v6, Lo/eyb;->b:D

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 565
    :cond_5
    :goto_1
    iget v8, v6, Lo/eyb;->e:I

    .line 566
    iget-object v0, v6, Lo/eyb;->c:Landroid/graphics/PointF;

    iget v9, v0, Landroid/graphics/PointF;->x:F

    .line 567
    iget-object v0, v6, Lo/eyb;->c:Landroid/graphics/PointF;

    iget v10, v0, Landroid/graphics/PointF;->y:F

    .line 569
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->F:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Lo/eyh;->b(Landroid/graphics/Paint;)F

    move-result v11

    .line 570
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->F:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v7}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->I:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/eyf;->J:F

    .line 571
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->H:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    add-float/2addr v0, v11

    move-object/from16 v1, p0

    iput v0, v1, Lo/eyf;->N:F

    .line 572
    move-object/from16 v0, p0

    iget v0, v0, Lo/eyf;->J:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 574
    const/4 v0, 0x1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v13

    .line 575
    const/16 v20, 0x0

    .line 576
    const/4 v14, 0x0

    .line 577
    const/4 v15, 0x0

    .line 578
    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_2

    .line 580
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    sub-float v1, v9, v12

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 581
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    add-float v1, v9, v12

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 582
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->N:F

    sub-float v1, v10, v1

    sub-float/2addr v1, v13

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 583
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iput v10, v0, Landroid/graphics/RectF;->bottom:F

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v13

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 586
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v13

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 587
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->L:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float v14, v0, v1

    .line 588
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v15, v0, Landroid/graphics/RectF;->bottom:F

    .line 589
    new-instance v20, Landroid/graphics/Path;

    invoke-direct/range {v20 .. v20}, Landroid/graphics/Path;-><init>()V

    .line 590
    add-float v0, v14, v13

    move-object/from16 v1, v20

    invoke-virtual {v1, v0, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 591
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v13

    add-float/2addr v0, v15

    move-object/from16 v1, v20

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 592
    sub-float v0, v14, v13

    move-object/from16 v1, v20

    invoke-virtual {v1, v0, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 593
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Path;->close()V

    .line 594
    goto/16 :goto_2

    .line 596
    :sswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    sub-float v1, v9, v12

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 597
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    add-float v1, v9, v12

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 598
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iput v10, v0, Landroid/graphics/RectF;->top:F

    .line 599
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->N:F

    add-float/2addr v1, v10

    add-float/2addr v1, v13

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 601
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v13

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v13

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 604
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->L:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float v14, v0, v1

    .line 605
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v15, v0, Landroid/graphics/RectF;->top:F

    .line 606
    new-instance v20, Landroid/graphics/Path;

    invoke-direct/range {v20 .. v20}, Landroid/graphics/Path;-><init>()V

    .line 607
    move-object/from16 v0, v20

    invoke-virtual {v0, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 608
    add-float v0, v14, v13

    move-object/from16 v1, v20

    invoke-virtual {v1, v0, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 609
    sub-float v0, v14, v13

    move-object/from16 v1, v20

    invoke-virtual {v1, v0, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 610
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Path;->close()V

    .line 611
    .line 617
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->a:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/eyf;->a:F

    sub-float/2addr v2, v3

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 619
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->a:F

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 622
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    .line 623
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 624
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    const/4 v1, 0x0

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 627
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->F:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->E:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 628
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->M:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/eyf;->K:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/eyf;->F:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 629
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_8

    .line 630
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->F:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 631
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Path;->reset()V

    .line 633
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->F:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 634
    move-object/from16 v0, p1

    sub-float v1, v14, v13

    move v2, v15

    add-float v3, v14, v13

    move v4, v15

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eyf;->F:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 636
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->I:F

    add-float v16, v0, v1

    .line 637
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->L:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eyf;->H:F

    add-float v17, v0, v1

    .line 638
    move/from16 v18, v16

    .line 639
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eyf;->F:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 640
    add-float v0, v17, v11

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eyf;->F:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    move/from16 v3, v18

    invoke-virtual {v2, v7, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 533
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_0

    .line 643
    :cond_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private e(FFLandroid/graphics/RectF;)Z
    .locals 1

    .line 704
    iget v0, p3, Landroid/graphics/RectF;->left:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->right:F

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->top:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    .line 706
    const/4 v0, 0x1

    return v0

    .line 708
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(DD)D
    .locals 8

    .line 789
    const-wide/16 v4, 0x0

    .line 790
    const-wide/16 v6, 0x0

    .line 791
    const-wide/16 v0, 0x0

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_0

    .line 792
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v6, p1, v0

    goto :goto_0

    .line 793
    :cond_0
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    mul-double/2addr v0, p3

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_1

    .line 794
    move-wide v6, p3

    goto :goto_0

    .line 795
    :cond_1
    const-wide v0, 0x3ff9c18fa0000000L    # 1.6097561120986938

    mul-double/2addr v0, p3

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_2

    .line 796
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double v6, v0, p3

    goto :goto_0

    .line 798
    :cond_2
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v6, p1, v0

    .line 800
    :goto_0
    const-string v0, "test"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==calculateUpReferenceLineValue==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    move-wide v4, v6

    .line 802
    return-wide v4
.end method

.method public a(D)V
    .locals 0

    .line 211
    iput-wide p1, p0, Lo/eyf;->u:D

    .line 212
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 183
    iput-boolean p1, p0, Lo/eyf;->G:Z

    .line 184
    return-void
.end method

.method public c(DD)D
    .locals 8

    .line 761
    const-wide/16 v4, 0x0

    .line 762
    const-wide/16 v6, 0x0

    .line 776
    const-wide/16 v0, 0x0

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_0

    .line 777
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v6, p1, v0

    goto :goto_0

    .line 778
    :cond_0
    const-wide v0, 0x3ff9c18fa0000000L    # 1.6097561120986938

    mul-double/2addr v0, p3

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_1

    .line 779
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double v6, v0, p3

    goto :goto_0

    .line 781
    :cond_1
    const-wide v0, 0x3fe9c18fa0000000L    # 0.8048780560493469

    div-double v6, p1, v0

    .line 783
    :goto_0
    const-string v0, "test"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==calculateUpReferenceLineValue==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    move-wide v4, v6

    .line 785
    return-wide v4
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 219
    iput-object p1, p0, Lo/eyf;->D:Ljava/util/ArrayList;

    .line 220
    return-void
.end method

.method public c(Ljava/util/List;Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/Double;>;I)V"
        }
    .end annotation

    .line 833
    iput p3, p0, Lo/eyf;->e:I

    .line 834
    invoke-virtual {p0, p1, p2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    .line 835
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 121
    iput-boolean p1, p0, Lo/eyf;->B:Z

    .line 122
    return-void
.end method

.method public d(F)V
    .locals 0

    .line 175
    iput p1, p0, Lo/eyf;->f:F

    .line 176
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lo/eyf;->C:Ljava/lang/String;

    .line 228
    return-void
.end method

.method public e(Ljava/util/List;)D
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)D"
        }
    .end annotation

    .line 735
    const-wide/16 v2, 0x0

    .line 736
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 737
    const/4 v4, 0x0

    .line 738
    const-wide/16 v5, 0x0

    .line 739
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 740
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    .line 741
    const-wide/16 v0, 0x0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_0

    .line 742
    add-double/2addr v5, v8

    .line 743
    add-int/lit8 v4, v4, 0x1

    .line 739
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 747
    :cond_1
    if-lez v4, :cond_2

    .line 748
    int-to-double v0, v4

    div-double v2, v5, v0

    .line 752
    :cond_2
    return-wide v2
.end method

.method public e(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 842
    iget-object v0, p0, Lo/eyf;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 843
    iget-object v0, p0, Lo/eyf;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 844
    iget-object v0, p0, Lo/eyf;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 846
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 847
    iput-object p1, p0, Lo/eyf;->v:Ljava/util/List;

    .line 849
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 850
    iput-object p2, p0, Lo/eyf;->t:Ljava/util/List;

    .line 853
    :cond_1
    invoke-virtual {p0}, Lo/eyf;->invalidate()V

    .line 854
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 153
    invoke-direct {p0, p1}, Lo/eyf;->e(Landroid/graphics/Canvas;)V

    .line 154
    invoke-direct {p0, p1}, Lo/eyf;->a(Landroid/graphics/Canvas;)V

    .line 155
    invoke-direct {p0, p1}, Lo/eyf;->d(Landroid/graphics/Canvas;)V

    .line 156
    invoke-direct {p0, p1}, Lo/eyf;->b(Landroid/graphics/Canvas;)V

    .line 157
    iget-boolean v0, p0, Lo/eyf;->G:Z

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/eyf;->y:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0}, Lo/eyf;->e(Landroid/graphics/Canvas;Ljava/util/ArrayList;)V

    .line 160
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 9

    .line 131
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 132
    invoke-virtual {p0}, Lo/eyf;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/eyf;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/eyf;->a:F

    .line 133
    invoke-virtual {p0}, Lo/eyf;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/eyf;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/eyf;->d:F

    .line 135
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 136
    const/4 v0, 0x1

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 138
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 139
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x14

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 140
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 142
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v6, v8, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40a00000    # 5.0f

    add-float/2addr v0, v1

    iput v0, p0, Lo/eyf;->o:F

    .line 143
    iget v0, p0, Lo/eyf;->o:F

    iput v0, p0, Lo/eyf;->r:F

    .line 145
    const/4 v0, 0x1

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/eyf;->q:F

    .line 147
    iget v0, p0, Lo/eyf;->a:F

    iget v1, p0, Lo/eyf;->o:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/eyf;->r:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/eyf;->g:F

    .line 148
    iget v0, p0, Lo/eyf;->d:F

    iget v1, p0, Lo/eyf;->q:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/eyf;->i:F

    .line 149
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 656
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 657
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 658
    :cond_0
    invoke-direct {p0, p1}, Lo/eyf;->a(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 659
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 660
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 661
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyf;->b:Z

    .line 663
    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public setAnchorBackground(I)V
    .locals 0

    .line 650
    iput p1, p0, Lo/eyf;->E:I

    .line 651
    return-void
.end method

.method public setBarColor(II)V
    .locals 0

    .line 192
    iput p1, p0, Lo/eyf;->p:I

    .line 193
    iput p2, p0, Lo/eyf;->h:I

    .line 194
    return-void
.end method

.method public setBarTwoColor(II)V
    .locals 0

    .line 202
    iput p1, p0, Lo/eyf;->l:I

    .line 203
    iput p2, p0, Lo/eyf;->n:I

    .line 204
    return-void
.end method

.method public setDiagramAnchorType(I)V
    .locals 0

    .line 231
    iput p1, p0, Lo/eyf;->j:I

    .line 232
    return-void
.end method

.method public setIsDrawMaxDashLineLable(Z)V
    .locals 0

    .line 126
    iput-boolean p1, p0, Lo/eyf;->A:Z

    .line 127
    return-void
.end method

.method public setPadding(FF)V
    .locals 0

    .line 167
    iput p1, p0, Lo/eyf;->o:F

    .line 168
    iput p2, p0, Lo/eyf;->r:F

    .line 169
    return-void
.end method
