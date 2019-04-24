.class public Lo/exo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/Object;

.field private static k:Lo/exo;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/exm;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/exm;>;"
        }
    .end annotation
.end field

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/exm;>;"
        }
    .end annotation
.end field

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/exm;>;"
        }
    .end annotation
.end field

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private s:Lo/dgu;

.field private t:I

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/exo;->e:Ljava/lang/Object;

    .line 64
    const/4 v0, 0x0

    sput-object v0, Lo/exo;->k:Lo/exo;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->h:I

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->f:I

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->g:I

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->i:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->p:I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->m:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->n:I

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->l:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/exo;->o:I

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exo;->a:Ljava/util/List;

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exo;->b:Ljava/util/List;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exo;->c:Ljava/util/List;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exo;->d:Ljava/util/List;

    .line 84
    const/4 v0, 0x1

    iput v0, p0, Lo/exo;->u:I

    .line 86
    const/16 v0, 0x2710

    iput v0, p0, Lo/exo;->t:I

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exo;->s:Lo/dgu;

    .line 92
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iput-object v0, p0, Lo/exo;->s:Lo/dgu;

    .line 93
    return-void
.end method

.method static synthetic a(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->n:I

    return v0
.end method

.method static synthetic a(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->o:I

    return p1
.end method

.method static synthetic b(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->o:I

    return v0
.end method

.method static synthetic b(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->m:I

    return p1
.end method

.method public static b(JLo/exn$d;)J
    .locals 8

    .line 1579
    const-wide/16 v2, 0x0

    .line 1580
    new-instance v4, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p0

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1581
    sget-object v0, Lo/exo$25;->c:[I

    invoke-virtual {p2}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1583
    :pswitch_0
    invoke-static {v4}, Lo/dbu;->o(Ljava/util/Date;)J

    move-result-wide v2

    .line 1584
    goto :goto_1

    .line 1586
    :pswitch_1
    invoke-static {v4}, Lo/dbu;->z(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 1587
    invoke-static {v5}, Lo/dbu;->i(Ljava/util/Date;)J

    move-result-wide v2

    .line 1588
    goto :goto_1

    .line 1590
    :pswitch_2
    invoke-static {v4}, Lo/dbu;->B(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v6

    .line 1591
    invoke-static {v6}, Lo/dbu;->i(Ljava/util/Date;)J

    move-result-wide v2

    .line 1592
    goto :goto_1

    .line 1594
    :pswitch_3
    invoke-static {v4}, Lo/dbu;->q(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v7

    .line 1595
    invoke-static {v7}, Lo/dbu;->i(Ljava/util/Date;)J

    move-result-wide v2

    .line 1596
    goto :goto_1

    .line 1598
    :goto_0
    :pswitch_4
    const-wide/16 v2, 0x1

    .line 1602
    :goto_1
    return-wide v2

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b(JILo/egg;II)V
    .locals 7

    .line 845
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move v3, p3

    move v4, p5

    move v5, p6

    new-instance v6, Lo/exo$4;

    invoke-direct {v6, p0, p4}, Lo/exo$4;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->e(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 856
    return-void
.end method

.method static synthetic b(Lo/exo;Lo/egg;Ljava/util/List;ILo/exn$d;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Lo/exo;->d(Lo/egg;Ljava/util/List;ILo/exn$d;)V

    return-void
.end method

.method static synthetic b(Lo/exo;Lo/egg;Ljava/util/List;Lo/exn$d;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/exo;->c(Lo/egg;Ljava/util/List;Lo/exn$d;)V

    return-void
.end method

.method static synthetic c(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->m:I

    return v0
.end method

.method static synthetic c(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->l:I

    return p1
.end method

.method private c(JILo/exn$d;Lo/egg;II)V
    .locals 7

    .line 868
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move v3, p3

    move v4, p6

    move v5, p7

    new-instance v6, Lo/exo$1;

    invoke-direct {v6, p0, p5, p3, p4}, Lo/exo$1;-><init>(Lo/exo;Lo/egg;ILo/exn$d;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->e(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 885
    return-void
.end method

.method private c(Lo/egg;Ljava/util/List;Lo/exn$d;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/egg;Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;>;Lo/exn$d;)V"
        }
    .end annotation

    .line 989
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter processSportTypeFitnessData paraQueryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 990
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 991
    sget-object v0, Lo/exo$25;->c:[I

    invoke-virtual {p3}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 993
    :pswitch_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSportTypeFitnessData FITNESS_TYPE_DAY_STATISTIC!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    if-eqz v0, :cond_1

    .line 995
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 996
    const/4 v0, 0x0

    invoke-interface {p1, v0, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 997
    goto :goto_1

    .line 1004
    :pswitch_1
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 1005
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 1006
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 1007
    new-instance v7, Lo/eux;

    invoke-direct {v7}, Lo/eux;-><init>()V

    .line 1008
    invoke-virtual {v7, v5}, Lo/eux;->b(I)V

    .line 1009
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {v7, v0}, Lo/eux;->e(I)V

    .line 1010
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v8

    .line 1011
    invoke-virtual {v7, v8}, Lo/eux;->c(I)V

    .line 1012
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1005
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1014
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 1015
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSportTypeFitnessData sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1016
    const/4 v0, 0x0

    invoke-interface {p1, v0, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1022
    :cond_1
    :goto_1
    :pswitch_2
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave processSportTypeFitnessData paraQueryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1023
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private c(Lo/exn$a;Lo/egg;Ljava/lang/Object;)V
    .locals 8

    .line 456
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter porcessFitnessSleepStatisticData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    move-object v4, p3

    check-cast v4, Ljava/util/List;

    .line 458
    const/4 v5, 0x0

    .line 459
    sget-object v0, Lo/exo$25;->b:[I

    invoke-virtual {p1}, Lo/exn$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 461
    :pswitch_0
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 462
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 463
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v0

    add-int/2addr v5, v0

    .line 461
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 465
    :cond_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FITNESS_TOTAL_SLEEP_TIME totalSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    goto/16 :goto_5

    .line 468
    :pswitch_1
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 469
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 470
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v0

    add-int/2addr v5, v0

    .line 468
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 472
    :cond_1
    goto :goto_5

    .line 474
    :pswitch_2
    const/4 v6, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 475
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 476
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v0

    add-int/2addr v5, v0

    .line 474
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 478
    :cond_2
    goto :goto_5

    .line 480
    :pswitch_3
    const/4 v6, 0x0

    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 481
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 482
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v0

    add-int/2addr v5, v0

    .line 480
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 484
    :cond_3
    goto :goto_5

    .line 487
    :goto_4
    :pswitch_4
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 488
    const/4 v0, 0x0

    invoke-interface {p2, v0, p3}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 490
    :cond_4
    return-void

    .line 493
    :goto_5
    const/4 v0, 0x0

    if-eq v0, p2, :cond_5

    .line 494
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 496
    :cond_5
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave porcessFitnessSleepStatisticData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic c(Lo/exo;Lo/egg;Ljava/util/List;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/exo;->e(Lo/egg;Ljava/util/List;I)V

    return-void
.end method

.method static synthetic d(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->p:I

    return v0
.end method

.method static synthetic d(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->h:I

    return p1
.end method

.method public static d(Landroid/content/Context;)Lo/exo;
    .locals 2

    .line 96
    sget-object v0, Lo/exo;->k:Lo/exo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 97
    new-instance v0, Lo/exo;

    invoke-direct {v0, p0}, Lo/exo;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/exo;->k:Lo/exo;

    .line 99
    :cond_0
    sget-object v0, Lo/exo;->k:Lo/exo;

    return-object v0
.end method

.method private d(Lo/egg;Ljava/util/List;ILo/exn$d;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/egg;Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;>;ILo/exn$d;)V"
        }
    .end annotation

    .line 931
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter processFitnessStatisticData paraQueryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    sget-object v0, Lo/exo$25;->c:[I

    invoke-virtual {p4}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 937
    :pswitch_0
    const/4 v4, 0x0

    .line 938
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 939
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;

    .line 940
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->getAll()I

    move-result v0

    add-int/2addr v4, v0

    .line 938
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 943
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 944
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 951
    :cond_1
    :goto_1
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave processFitnessStatisticData paraQueryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 952
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic d(Lo/exo;Lo/exn$a;Lo/egg;Ljava/lang/Object;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/exo;->c(Lo/exn$a;Lo/egg;Ljava/lang/Object;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1564
    const/4 v2, 0x0

    .line 1565
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 1566
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1567
    const/4 v2, 0x1

    goto :goto_0

    .line 1570
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1571
    const/4 v2, 0x1

    .line 1574
    :cond_1
    :goto_0
    return v2
.end method

.method static synthetic d(Lo/exo;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 51
    invoke-direct {p0, p1, p2}, Lo/exo;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->l:I

    return v0
.end method

.method static synthetic e(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->n:I

    return p1
.end method

.method private e(Lo/egg;Ljava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/egg;Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;>;I)V"
        }
    .end annotation

    .line 888
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter processFitnessHistogramData dataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 889
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 890
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 891
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 892
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 893
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSportType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 895
    :sswitch_0
    new-instance v7, Lo/eux;

    invoke-direct {v7}, Lo/eux;-><init>()V

    .line 896
    invoke-virtual {v7, v5}, Lo/eux;->b(I)V

    .line 897
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {v7, v0}, Lo/eux;->e(I)V

    .line 898
    const/4 v8, 0x0

    .line 899
    const/4 v0, 0x2

    if-ne v0, p3, :cond_0

    .line 900
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v8

    goto :goto_1

    .line 902
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p3, :cond_1

    .line 903
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v8

    goto :goto_1

    .line 905
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p3, :cond_2

    .line 906
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v8

    .line 908
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 909
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v8, v0

    .line 912
    :cond_2
    :goto_1
    const-string v0, "HeartReateData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processFitnessHistogramData i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  setHistogramHeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    invoke-virtual {v7, v8}, Lo/eux;->c(I)V

    .line 915
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 891
    .line 916
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 922
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 923
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processFitnessHistogramData sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 924
    const/4 v0, 0x0

    invoke-interface {p1, v0, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 926
    :cond_4
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave processFitnessHistogramData dataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdd -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic f(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->f:I

    return v0
.end method

.method static synthetic f(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->g:I

    return p1
.end method

.method static synthetic g(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->u:I

    return v0
.end method

.method static synthetic g(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->u:I

    return p1
.end method

.method static synthetic h(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->h:I

    return v0
.end method

.method static synthetic h(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->f:I

    return p1
.end method

.method static synthetic i(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->i:I

    return v0
.end method

.method static synthetic i(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->p:I

    return p1
.end method

.method static synthetic k(Lo/exo;)I
    .locals 1

    .line 51
    iget v0, p0, Lo/exo;->g:I

    return v0
.end method

.method static synthetic k(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->i:I

    return p1
.end method

.method static synthetic o(Lo/exo;I)I
    .locals 0

    .line 51
    iput p1, p0, Lo/exo;->t:I

    return p1
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 510
    iget v0, p0, Lo/exo;->m:I

    return v0
.end method

.method public a(IILo/egg;)V
    .locals 5

    .line 1168
    sget-object v2, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 1169
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1170
    new-instance v3, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    .line 1171
    invoke-virtual {v3, p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setDataType(I)V

    .line 1172
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1174
    :pswitch_0
    invoke-virtual {v3, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setStepGoal(I)V

    .line 1175
    goto :goto_0

    .line 1177
    :pswitch_1
    invoke-virtual {v3, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setCalorieGoal(I)V

    .line 1178
    goto :goto_0

    .line 1180
    :pswitch_2
    invoke-virtual {v3, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setDistanceGoal(I)V

    .line 1181
    .line 1186
    :goto_0
    :pswitch_3
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$10;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/exo$10;-><init>(Lo/exo;IILo/egg;)V

    invoke-virtual {v0, v3, v1}, Lo/dgu;->d(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1201
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 1202
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public a(JLo/exn$d;Lo/egg;)V
    .locals 10

    .line 1719
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestPressureMeasureStatistic!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1720
    sget-object v6, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v6

    .line 1721
    :try_start_0
    invoke-static {p1, p2, p3}, Lo/exo;->b(JLo/exn$d;)J

    move-result-wide v7

    .line 1722
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move-wide v3, v7

    new-instance v5, Lo/exo$11;

    invoke-direct {v5, p0, p3, p4}, Lo/exo$11;-><init>(Lo/exo;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->f(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1753
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 1754
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestPressureMeasureStatistic!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1755
    return-void
.end method

.method public a(Lo/egg;)V
    .locals 6

    .line 1111
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestFitnessGoal !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1112
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 1113
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1114
    monitor-exit v4

    return-void

    .line 1117
    :cond_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestFitnessGoal HWFitnessMgr.getFitnessGoal!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    new-instance v2, Lo/exo$6;

    invoke-direct {v2, p0, p1}, Lo/exo$6;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1158
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1159
    :goto_0
    return-void
.end method

.method public b()I
    .locals 1

    .line 643
    iget v0, p0, Lo/exo;->f:I

    return v0
.end method

.method public b(JILo/exn$d;Lo/egg;)V
    .locals 13

    .line 964
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requsetGetFitnessDataDetailBySportType mHWHealthDataManager !!!  Date = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    sget-object v9, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v9

    .line 966
    move-object/from16 v0, p4

    :try_start_0
    invoke-static {p1, p2, v0}, Lo/exn;->b(JLo/exn$d;)I

    move-result v10

    .line 967
    move-object/from16 v0, p4

    invoke-static {p1, p2, v0}, Lo/exn;->e(JLo/exn$d;)I

    move-result v11

    .line 968
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requsetGetFitnessDataDetailBySportType tepUnitSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  tepUnitCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 971
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move/from16 v3, p3

    move v4, v10

    move v5, v11

    new-instance v6, Lo/exo$7;

    move-object/from16 v7, p5

    move-object/from16 v8, p4

    invoke-direct {v6, p0, v7, v8}, Lo/exo$7;-><init>(Lo/exo;Lo/egg;Lo/exn$d;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 984
    :cond_0
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v12

    monitor-exit v9

    throw v12

    .line 985
    :goto_0
    return-void
.end method

.method public b(JJLo/exn$d;Lo/exn$a;Lo/egg;)V
    .locals 18

    .line 376
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestGetMonthCoreSleepDetailData  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    sget-object v13, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v13

    .line 378
    :try_start_0
    invoke-static/range {p5 .. p5}, Lo/exn;->a(Lo/exn$d;)I

    move-result v14

    .line 379
    move-wide/from16 v0, p1

    move-object/from16 v2, p5

    invoke-static {v0, v1, v2}, Lo/exn;->b(JLo/exn$d;)I

    move-result v15

    .line 380
    sub-long v0, p3, p1

    const-wide/32 v2, 0x15180

    div-long/2addr v0, v2

    long-to-int v0, v0

    add-int/lit8 v16, v0, 0x1

    .line 382
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestGetMonthCoreSleepDetailData  queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "unitSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 385
    invoke-static {}, Lo/dgz;->c()Lo/dgz;

    move-result-object v0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move v5, v14

    move v6, v15

    move/from16 v7, v16

    new-instance v8, Lo/exo$22;

    move-object/from16 v9, p0

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    invoke-direct {v8, v9, v10, v11, v12}, Lo/exo$22;-><init>(Lo/exo;Lo/exn$d;Lo/exn$a;Lo/egg;)V

    invoke-virtual/range {v0 .. v8}, Lo/dgz;->a(JJIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 426
    :cond_0
    monitor-exit v13

    goto :goto_0

    :catchall_0
    move-exception v17

    monitor-exit v13

    throw v17

    .line 427
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestGetMonthCoreSleepDetailData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    return-void
.end method

.method public b(JLo/exn$d;Lo/egg;)V
    .locals 10

    .line 1666
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getStressDatasForDiagram!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1667
    sget-object v6, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v6

    .line 1668
    :try_start_0
    invoke-static {p1, p2, p3}, Lo/exo;->b(JLo/exn$d;)J

    move-result-wide v7

    .line 1669
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressDatasForDiagram 0000 startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1671
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressDatasForDiagram startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v7

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1673
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move-wide v3, v7

    new-instance v5, Lo/exo$14;

    invoke-direct {v5, p0, p3, p4}, Lo/exo$14;-><init>(Lo/exo;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->h(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1704
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 1705
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getStressDatasForDiagram!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1706
    return-void
.end method

.method public b(Lo/egg;)V
    .locals 4

    .line 703
    sget-object v2, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 704
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 705
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$21;

    invoke-direct {v1, p0, p1}, Lo/exo$21;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dgu;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 715
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 716
    :goto_0
    return-void
.end method

.method public b(Lo/exn$a;Lo/egg;)V
    .locals 6

    .line 181
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getTodaySleepTotalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 183
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 184
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$13;

    invoke-direct {v1, p0, p1, p2}, Lo/exo$13;-><init>(Lo/exo;Lo/exn$a;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dgu;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 226
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getTodaySleepTotalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-void
.end method

.method public c()I
    .locals 1

    .line 687
    iget v0, p0, Lo/exo;->p:I

    return v0
.end method

.method public c(JLo/egg;)V
    .locals 4

    .line 1489
    sget-object v2, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 1490
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$12;

    invoke-direct {v1, p0, p3}, Lo/exo$12;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, v1, p1, p2}, Lo/dgu;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1561
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 1562
    :goto_0
    return-void
.end method

.method public c(JLo/exn$d;Lo/egg;)V
    .locals 14

    .line 1257
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestHeartRateDetail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1258
    sget-object v8, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v8

    .line 1259
    const-wide/16 v9, 0x0

    .line 1260
    :try_start_0
    sget-object v0, Lo/exo$25;->c:[I

    invoke-virtual/range {p3 .. p3}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1262
    :sswitch_0
    new-instance v11, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    invoke-direct {v11, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1263
    invoke-static {v11}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v12

    .line 1264
    invoke-static {v12}, Lo/dbu;->f(Ljava/util/Date;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v9, v0, v2

    .line 1265
    goto :goto_1

    .line 1267
    :goto_0
    monitor-exit v8

    return-void

    .line 1270
    :goto_1
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetail startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v9

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1272
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move-wide v3, v9

    new-instance v5, Lo/exo$9;

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct {v5, p0, v6, v7}, Lo/exo$9;-><init>(Lo/exo;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1308
    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v13

    monitor-exit v8

    throw v13

    .line 1309
    :goto_2
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestHeartRateDetail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1310
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public c(JLo/exn$d;Lo/exn$a;Lo/egg;)V
    .locals 16

    .line 233
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestGetSleepDetailData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    sget-object v11, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v11

    .line 235
    :try_start_0
    invoke-static/range {p3 .. p3}, Lo/exn;->a(Lo/exn$d;)I

    move-result v12

    .line 236
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/exn;->b(JLo/exn$d;)I

    move-result v13

    .line 237
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/exn;->e(JLo/exn$d;)I

    move-result v14

    .line 238
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestGetSleepDetailData queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "unitSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo;->s:Lo/dgu;

    move-wide/from16 v1, p1

    move v3, v12

    move v4, v13

    move v5, v14

    new-instance v6, Lo/exo$19;

    move-object/from16 v7, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct {v6, v7, v8, v9, v10}, Lo/exo$19;-><init>(Lo/exo;Lo/exn$d;Lo/exn$a;Lo/egg;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    :cond_0
    monitor-exit v11

    goto :goto_0

    :catchall_0
    move-exception v15

    monitor-exit v11

    throw v15

    .line 280
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestGetSleepDetailData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    return-void
.end method

.method public c(Lo/egg;)V
    .locals 4

    .line 723
    sget-object v2, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 724
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 725
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$26;

    invoke-direct {v1, p0, p1}, Lo/exo$26;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dgu;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 735
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 736
    :goto_0
    return-void
.end method

.method public d()I
    .locals 4

    .line 621
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getTodayTotalCalories mTodayTotalCalories = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/exo;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    iget v0, p0, Lo/exo;->h:I

    return v0
.end method

.method public d(JLo/exn$d;Lo/egg;)V
    .locals 10

    .line 1404
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestLastHeartRateDetail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1405
    sget-object v6, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v6

    .line 1406
    :try_start_0
    invoke-static {p1, p2, p3}, Lo/exn;->d(JLo/exn$d;)J

    move-result-wide v7

    .line 1407
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestLastHeartRateDetail 0000 startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1409
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestLastHeartRateDetail startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v7

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1411
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move-wide v3, v7

    new-instance v5, Lo/exo$15;

    invoke-direct {v5, p0, p3, p4}, Lo/exo$15;-><init>(Lo/exo;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->a(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1446
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 1447
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestLastHeartRateDetail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1448
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hihealth/data/model/HiStressMetaData;Lo/egg;)V
    .locals 6

    .line 1936
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setStressData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1937
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 1938
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$17;

    invoke-direct {v1, p0, p3}, Lo/exo$17;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/dgu;->d(Ljava/lang/String;Lcom/huawei/hihealth/data/model/HiStressMetaData;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1947
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1948
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave setStressData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1950
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/util/List;Lo/egg;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;Lo/egg;)V"
        }
    .end annotation

    .line 1953
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setStressData lsit!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1954
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 1955
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$18;

    invoke-direct {v1, p0, p3}, Lo/exo$18;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/dgu;->e(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1964
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1965
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave setStressData lsit!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1967
    return-void
.end method

.method public d(Lo/egg;)V
    .locals 6

    .line 2022
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getUserPressureAdjustInfo!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 2024
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$16;

    invoke-direct {v1, p0, p1}, Lo/exo$16;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dgu;->f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2033
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 2034
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getUserPressureAdjustInfo!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2036
    return-void
.end method

.method public e()I
    .locals 1

    .line 659
    iget v0, p0, Lo/exo;->g:I

    return v0
.end method

.method public e(JILo/exn$d;Lo/egg;)V
    .locals 12

    .line 749
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requsetGetFitnessDataDetailByDataType mHWHealthDataManager dataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  Date = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 751
    sget-object v8, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v8

    .line 752
    move-object/from16 v0, p4

    :try_start_0
    invoke-static {p1, p2, v0}, Lo/exn;->b(JLo/exn$d;)I

    move-result v9

    .line 753
    move-object/from16 v0, p4

    invoke-static {p1, p2, v0}, Lo/exn;->e(JLo/exn$d;)I

    move-result v10

    .line 754
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requsetGetFitnessDataDetailByDataType tepUnitSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  tepUnitCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 771
    sget-object v0, Lo/exo$25;->c:[I

    invoke-virtual/range {p4 .. p4}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 777
    :pswitch_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move v4, v9

    move v5, v10

    new-instance v6, Lo/exo$5;

    move-object/from16 v3, p5

    invoke-direct {v6, p0, v3, p3}, Lo/exo$5;-><init>(Lo/exo;Lo/egg;I)V

    const/16 v3, 0xdd

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 793
    goto :goto_0

    .line 796
    :pswitch_1
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move v4, v9

    move v5, v10

    new-instance v6, Lo/exo$3;

    move-object/from16 v3, p5

    invoke-direct {v6, p0, v3}, Lo/exo$3;-><init>(Lo/exo;Lo/egg;)V

    const/16 v3, 0xdd

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 805
    goto :goto_0

    .line 807
    :pswitch_2
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    move v4, v9

    move v5, v10

    new-instance v6, Lo/exo$2;

    move-object/from16 v3, p5

    invoke-direct {v6, p0, v3}, Lo/exo$2;-><init>(Lo/exo;Lo/egg;)V

    const/16 v3, 0xdd

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 816
    goto :goto_0

    .line 821
    :pswitch_3
    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move v6, v9

    move v7, v10

    invoke-direct/range {v0 .. v7}, Lo/exo;->c(JILo/exn$d;Lo/egg;II)V

    .line 822
    goto :goto_0

    .line 827
    :pswitch_4
    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object/from16 v4, p5

    move v5, v9

    move v6, v10

    invoke-direct/range {v0 .. v6}, Lo/exo;->b(JILo/egg;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 828
    .line 833
    :cond_0
    :goto_0
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v8

    throw v11

    .line 834
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public e(JJLo/exn$d;Lo/egg;)V
    .locals 8

    .line 1758
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestPressureMeasureStatistic!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1759
    sget-object v6, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v6

    .line 1760
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    move-wide v1, p1

    const-wide/16 v3, 0x3e8

    sub-long v3, p3, v3

    new-instance v5, Lo/exo$20;

    invoke-direct {v5, p0, p5, p6}, Lo/exo$20;-><init>(Lo/exo;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->f(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1791
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 1793
    :goto_0
    return-void
.end method

.method public e(JLo/exn$d;Lo/egg;)V
    .locals 17

    .line 1322
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestHeartRateSummary!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1323
    sget-object v10, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v10

    .line 1324
    :try_start_0
    invoke-static/range {p3 .. p3}, Lo/exn;->a(Lo/exn$d;)I

    move-result v11

    .line 1325
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/exn;->b(JLo/exn$d;)I

    move-result v12

    .line 1326
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/exn;->e(JLo/exn$d;)I

    move-result v13

    .line 1327
    mul-int v0, v12, v13

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    add-long v14, p1, v0

    .line 1328
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateSummary startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long v4, v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v14

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo;->s:Lo/dgu;

    move-wide/from16 v1, p1

    move v3, v11

    move v4, v13

    move v5, v12

    new-instance v6, Lo/exo$8;

    move-object/from16 v7, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    invoke-direct {v6, v7, v8, v9}, Lo/exo$8;-><init>(Lo/exo;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->b(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1391
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v16

    monitor-exit v10

    throw v16

    .line 1392
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestHeartRateSummary!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1393
    return-void
.end method

.method public e(JLo/exn$d;Lo/exn$a;Lo/egg;)V
    .locals 22

    .line 286
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestGetCoreSleepDetailData   xxxx"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    sget-object v11, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v11

    .line 288
    :try_start_0
    invoke-static/range {p3 .. p3}, Lo/exn;->a(Lo/exn$d;)I

    move-result v12

    .line 289
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/exn;->b(JLo/exn$d;)I

    move-result v13

    .line 290
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/exn;->e(JLo/exn$d;)I

    move-result v14

    .line 291
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestGetCoreSleepDetailData xxxx queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "unitSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  unitType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    const/4 v0, 0x5

    if-ne v12, v0, :cond_0

    const/16 v0, 0xc

    if-ne v0, v14, :cond_0

    .line 296
    const/4 v13, 0x0

    .line 298
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long v1, v1, p1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v17, v0

    .line 299
    const/16 v18, 0x0

    :goto_0
    move/from16 v0, v18

    const/16 v1, 0xc

    if-ge v0, v1, :cond_0

    .line 300
    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v19

    .line 301
    invoke-static/range {v19 .. v19}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v15

    .line 303
    invoke-static/range {v15 .. v16}, Lo/exn;->b(J)I

    move-result v20

    .line 304
    move/from16 v0, v20

    mul-int/lit16 v0, v0, 0x5a0

    add-int/2addr v13, v0

    .line 299
    add-int/lit8 v18, v18, 0x1

    goto :goto_0

    .line 308
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo;->s:Lo/dgu;

    move-wide/from16 v1, p1

    move v3, v12

    move v4, v13

    move v5, v14

    new-instance v6, Lo/exo$24;

    move-object/from16 v7, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct {v6, v7, v8, v9, v10}, Lo/exo$24;-><init>(Lo/exo;Lo/exn$d;Lo/exn$a;Lo/egg;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    :cond_1
    monitor-exit v11

    goto :goto_1

    :catchall_0
    move-exception v21

    monitor-exit v11

    throw v21

    .line 360
    :goto_1
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestGetCoreSleepDetailData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    return-void
.end method

.method public e(Lo/egg;)V
    .locals 6

    .line 549
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestGetTodayFitnessTotalData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 551
    :try_start_0
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 552
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    new-instance v1, Lo/exo$23;

    invoke-direct {v1, p0, p1}, Lo/exo$23;-><init>(Lo/exo;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dgu;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 610
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 611
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestGetTodayFitnessTotalData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    return-void
.end method

.method public g()I
    .locals 1

    .line 1209
    iget v0, p0, Lo/exo;->u:I

    return v0
.end method

.method public h()Lo/ext;
    .locals 8

    .line 1456
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requesetGetHearRateRigion !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1457
    sget-object v4, Lo/exo;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 1458
    :try_start_0
    new-instance v5, Lo/ext;

    invoke-direct {v5}, Lo/ext;-><init>()V

    .line 1465
    iget-object v0, p0, Lo/exo;->s:Lo/dgu;

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v6

    .line 1466
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 1467
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    int-to-float v0, v0

    iput v0, v5, Lo/ext;->b:F

    .line 1468
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesetGetHearRateRigion hrZoneConfig.maxThreshold = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/ext;->b:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicThreshold()I

    move-result v0

    int-to-float v0, v0

    iput v0, v5, Lo/ext;->e:F

    .line 1470
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesetGetHearRateRigion hrZoneConfig.aerobicThreshold = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/ext;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1471
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicThreshold()I

    move-result v0

    int-to-float v0, v0

    iput v0, v5, Lo/ext;->d:F

    .line 1472
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesetGetHearRateRigion hrZoneConfig.anaerobicThreshold = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/ext;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1473
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFatBurnThreshold()I

    move-result v0

    int-to-float v0, v0

    iput v0, v5, Lo/ext;->a:F

    .line 1474
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesetGetHearRateRigion hrZoneConfig.fatBurnThreshold "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/ext;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1475
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarmUpThreshold()I

    move-result v0

    int-to-float v0, v0

    iput v0, v5, Lo/ext;->f:F

    .line 1476
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesetGetHearRateRigion hrZoneConfig.warmUpThreshold  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/ext;->f:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1477
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFitnessThreshold()I

    move-result v0

    int-to-float v0, v0

    iput v0, v5, Lo/ext;->c:F

    .line 1478
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesetGetHearRateRigion hrZoneConf.minThreshold = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/ext;->c:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1480
    :cond_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requesetGetHearRateRigion !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1481
    monitor-exit v4

    return-object v5

    .line 1482
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method public k()I
    .locals 1

    .line 1217
    iget v0, p0, Lo/exo;->t:I

    return v0
.end method
