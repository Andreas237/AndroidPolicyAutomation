.class public Lo/esr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eqf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/esr$c;,
        Lo/esr$b;,
        Lo/esr$a;
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private D:Ljava/lang/String;

.field private final a:Lo/esr$a;

.field private b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

.field private d:Lo/esp;

.field protected e:Landroid/content/Context;

.field private f:I

.field private g:I

.field private h:J

.field private i:J

.field private k:I

.field private l:J

.field private m:J

.field private n:I

.field private o:I

.field private p:I

.field private q:J

.field private r:Lo/esr$b;

.field private s:J

.field private t:F

.field private u:Lo/esr$c;

.field private v:Ljava/lang/String;

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private x:Ljava/lang/String;

.field private y:F

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-string v0, "SportsRecordingCardReader"

    sput-object v0, Lo/esr;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/esp;)V
    .locals 2

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esr;->i:J

    .line 42
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esr;->h:J

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->f:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->k:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->g:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->n:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->o:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->p:I

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esr;->m:J

    .line 50
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esr;->l:J

    .line 51
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esr;->q:J

    .line 52
    new-instance v0, Lo/esr$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/esr$b;-><init>(Lo/esr;Lo/esr$3;)V

    iput-object v0, p0, Lo/esr;->r:Lo/esr$b;

    .line 54
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esr;->s:J

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/esr;->t:F

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/esr;->z:Ljava/util/List;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esr;->w:Ljava/util/List;

    .line 70
    const-string v0, "--"

    iput-object v0, p0, Lo/esr;->D:Ljava/lang/String;

    .line 110
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    .line 111
    iput-object p2, p0, Lo/esr;->d:Lo/esp;

    .line 112
    new-instance v0, Lo/esr$a;

    invoke-direct {v0, p0}, Lo/esr$a;-><init>(Lo/esr;)V

    iput-object v0, p0, Lo/esr;->a:Lo/esr$a;

    .line 113
    invoke-direct {p0}, Lo/esr;->f()V

    .line 114
    return-void
.end method

.method static synthetic a(Lo/esr;I)I
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->o:I

    return p1
.end method

.method static synthetic a(Lo/esr;J)J
    .locals 0

    .line 34
    iput-wide p1, p0, Lo/esr;->i:J

    return-wide p1
.end method

.method static synthetic a(Lo/esr;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/esr;->e()V

    return-void
.end method

.method private a(I)Z
    .locals 5

    .line 568
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 569
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 570
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_sport_type_outdoor_run:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_sport_type_indoor_run:I

    .line 571
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 572
    :cond_0
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isTypeRun \u8fd0\u52a8\u7c7b\u578b\u662f\u8dd1\u6b65"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    const/4 v0, 0x1

    return v0

    .line 576
    :cond_1
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isTypeRun \u8fd0\u52a8\u7c7b\u578b\u4e0d\u662f\u8dd1\u6b65"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/esr;F)F
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->t:F

    return p1
.end method

.method static synthetic b(Lo/esr;I)I
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->k:I

    return p1
.end method

.method static synthetic b(Lo/esr;J)J
    .locals 0

    .line 34
    iput-wide p1, p0, Lo/esr;->h:J

    return-wide p1
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    return-object v0
.end method

.method private b(I)Ljava/lang/String;
    .locals 1

    .line 616
    const-string v0, ""

    .line 617
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 621
    :pswitch_0
    invoke-direct {p0}, Lo/esr;->n()Ljava/lang/String;

    move-result-object v0

    .line 622
    goto :goto_0

    .line 625
    :pswitch_1
    invoke-direct {p0}, Lo/esr;->g()Ljava/lang/String;

    move-result-object v0

    .line 626
    goto :goto_0

    .line 629
    :pswitch_2
    invoke-direct {p0}, Lo/esr;->o()Ljava/lang/String;

    move-result-object v0

    .line 630
    goto :goto_0

    .line 633
    :pswitch_3
    invoke-direct {p0}, Lo/esr;->i()Ljava/lang/String;

    move-result-object v0

    .line 634
    .line 638
    :goto_0
    :pswitch_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lo/esr;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 34
    iput-object p1, p0, Lo/esr;->v:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lo/esr;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/esr;->h()V

    return-void
.end method

.method static synthetic c(Lo/esr;F)F
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->y:F

    return p1
.end method

.method static synthetic c(Lo/esr;)I
    .locals 1

    .line 34
    iget v0, p0, Lo/esr;->n:I

    return v0
.end method

.method static synthetic c(Lo/esr;I)I
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->g:I

    return p1
.end method

.method static synthetic c(Lo/esr;J)J
    .locals 0

    .line 34
    iput-wide p1, p0, Lo/esr;->m:J

    return-wide p1
.end method

.method private c(D)Ljava/lang/String;
    .locals 3

    .line 600
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    .line 601
    iget-object v0, p0, Lo/esr;->D:Ljava/lang/String;

    return-object v0

    .line 603
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 604
    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/esr;->e(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 606
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/esr;->e(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(I)Z
    .locals 1

    .line 558
    const/16 v0, 0x103

    if-eq p1, v0, :cond_0

    const/16 v0, 0x109

    if-eq p1, v0, :cond_0

    const/16 v0, 0x104

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/esr;I)I
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->n:I

    return p1
.end method

.method static synthetic d(Lo/esr;J)J
    .locals 0

    .line 34
    iput-wide p1, p0, Lo/esr;->l:J

    return-wide p1
.end method

.method private d(D)Ljava/lang/String;
    .locals 6

    .line 541
    double-to-float v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    div-float v5, v0, v1

    .line 542
    float-to-double v0, v5

    const-wide v2, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    float-to-double v0, v5

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    .line 543
    :cond_0
    iget-object v0, p0, Lo/esr;->D:Ljava/lang/String;

    return-object v0

    .line 545
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 546
    float-to-double v0, v5

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 548
    :cond_2
    invoke-static {v5}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    .line 549
    return-object v4
.end method

.method private d(I)Ljava/lang/String;
    .locals 3

    .line 585
    const-string v2, ""

    .line 586
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 587
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 589
    :cond_0
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 591
    :goto_0
    return-object v2
.end method

.method private d(IDI)Ljava/lang/String;
    .locals 6

    .line 518
    const-wide v4, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 519
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, p2

    if-eqz v0, :cond_0

    const-wide v0, -0x40e5c91d14e3bcd3L    # -1.0E-4

    cmpl-double v0, p2, v0

    if-lez v0, :cond_3

    cmpg-double v0, p2, v4

    if-gez v0, :cond_3

    .line 520
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    .line 521
    iget-object v0, p0, Lo/esr;->D:Ljava/lang/String;

    return-object v0

    .line 523
    :cond_1
    if-nez p1, :cond_2

    .line 524
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 526
    :cond_2
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 531
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(J)Ljava/lang/String;
    .locals 10

    .line 467
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 468
    new-instance v5, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v5, v4, v0}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 469
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    long-to-int v6, v0

    .line 470
    rem-int/lit8 v7, v6, 0x3c

    .line 471
    div-int/lit8 v0, v6, 0x3c

    rem-int/lit8 v8, v0, 0x3c

    .line 472
    div-int/lit16 v9, v6, 0xe10

    .line 473
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 474
    const-string v0, "%02d:%02d:%02d"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/esr;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 34
    iput-object p1, p0, Lo/esr;->x:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lo/esr;)Lo/esp;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/esr;->d:Lo/esp;

    return-object v0
.end method

.method static synthetic e(Lo/esr;I)I
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->f:I

    return p1
.end method

.method static synthetic e(Lo/esr;J)J
    .locals 0

    .line 34
    iput-wide p1, p0, Lo/esr;->s:J

    return-wide p1
.end method

.method private e(DI)Ljava/lang/String;
    .locals 1

    .line 507
    const/4 v0, 0x1

    invoke-static {p1, p2, v0, p3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(IDI)Ljava/lang/String;
    .locals 5

    .line 485
    invoke-direct {p0, p1, p2, p3, p4}, Lo/esr;->d(IDI)Ljava/lang/String;

    move-result-object v4

    .line 486
    if-eqz v4, :cond_0

    return-object v4

    .line 487
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 489
    :sswitch_0
    const-wide v0, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, p2, v0

    if-gtz v0, :cond_1

    const-wide v0, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_2

    .line 490
    :cond_1
    iget-object v0, p0, Lo/esr;->D:Ljava/lang/String;

    return-object v0

    .line 492
    :cond_2
    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-static {v0, v1, p2, p3}, Lo/dhb;->c(ZID)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 494
    :sswitch_1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {v0, v1, p2, p3}, Lo/dhb;->c(ZID)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 496
    :goto_0
    iget-object v0, p0, Lo/esr;->D:Ljava/lang/String;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic e(Lo/esr;)Lo/esr$c;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/esr;->u:Lo/esr$c;

    return-object v0
.end method

.method static synthetic e(Lo/esr;Lo/esr$c;)Lo/esr$c;
    .locals 0

    .line 34
    iput-object p1, p0, Lo/esr;->u:Lo/esr$c;

    return-object p1
.end method

.method private e()V
    .locals 16

    .line 140
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSportDataAndTime called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 144
    const-string v8, ""

    .line 145
    const-string v9, ""

    .line 146
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/esr;->i:J

    invoke-static {v0, v1}, Lo/cxh;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/esr;->i:J

    invoke-virtual {v5, v0, v1}, Ljava/util/Date;->setTime(J)V

    .line 148
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 149
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 151
    :cond_0
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/esr;->i:J

    invoke-static {v0, v1}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v7

    .line 154
    :goto_0
    const-string v10, ""

    .line 155
    const-wide/16 v11, 0x0

    .line 156
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->p:I

    if-nez v0, :cond_a

    .line 157
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShowType=\u8ddd\u79bb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const-string v13, ""

    .line 159
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->f:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/esr;->b(I)Ljava/lang/String;

    move-result-object v13

    .line 160
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->f:I

    const/16 v1, 0x10a

    if-eq v1, v0, :cond_1

    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->f:I

    const/16 v1, 0x106

    if-ne v1, v0, :cond_2

    .line 162
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->k:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/esr;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 163
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->k:I

    int-to-double v0, v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lo/esr;->c(D)Ljava/lang/String;

    move-result-object v9

    .line 164
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->t:F

    float-to-double v0, v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lo/esr;->d(D)Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_5

    .line 165
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->f:I

    const/16 v1, 0x104

    if-ne v0, v1, :cond_6

    .line 167
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 168
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->y:F

    float-to-double v0, v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v14

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v13

    .line 170
    const-wide/16 v0, 0x0

    cmpl-double v0, v14, v0

    if-nez v0, :cond_3

    .line 171
    move-object/from16 v0, p0

    iget-object v8, v0, Lo/esr;->D:Ljava/lang/String;

    goto :goto_1

    .line 173
    :cond_3
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v14, v15, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 175
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 176
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->k:I

    int-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v11

    .line 177
    goto :goto_3

    .line 178
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->y:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_5

    .line 179
    move-object/from16 v0, p0

    iget-object v8, v0, Lo/esr;->D:Ljava/lang/String;

    goto :goto_2

    .line 181
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->y:F

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 183
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_show_speed_pace_km:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 185
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->k:I

    int-to-double v11, v0

    .line 187
    :goto_3
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v11, v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_5

    .line 190
    :cond_6
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 192
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->k:I

    int-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v11

    goto :goto_4

    .line 194
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_show_speed_pace_km:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 195
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->k:I

    int-to-double v11, v0

    .line 197
    :goto_4
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v11, v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 199
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->f:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/esr;->c(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 200
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->t:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_8

    .line 201
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportSpeed = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    move-object/from16 v0, p0

    iget-object v8, v0, Lo/esr;->D:Ljava/lang/String;

    goto :goto_5

    .line 204
    :cond_8
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportSpeed1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/esr;->t:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->t:F

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    const/high16 v1, 0x45610000    # 3600.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    move-object/from16 v2, p0

    const/4 v3, 0x5

    const/4 v4, 0x1

    invoke-direct {v2, v3, v0, v1, v4}, Lo/esr;->e(IDI)Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    .line 208
    :cond_9
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportSpeed2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/esr;->t:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->t:F

    float-to-double v0, v0

    move-object/from16 v2, p0

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {v2, v3, v0, v1, v4}, Lo/esr;->e(IDI)Ljava/lang/String;

    move-result-object v8

    .line 212
    :goto_5
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5e73\u5747\u901f\u5ea6 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget v1, v1, Lo/esr;->p:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportType(I)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v7}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTime(Ljava/lang/String;)V

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v9}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportData(Ljava/lang/String;)V

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v10}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportUnit(Ljava/lang/String;)V

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v13}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeedUnit(Ljava/lang/String;)V

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esr;->e:Landroid/content/Context;

    move-object/from16 v2, p0

    iget v2, v2, Lo/esr;->f:I

    invoke-static {v1, v2}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTypeName(Ljava/lang/String;)V

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/esr;->s:J

    invoke-static {v1, v2}, Lo/esr;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportKeepTime(Ljava/lang/String;)V

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v8}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeed(Ljava/lang/String;)V

    .line 222
    goto/16 :goto_6

    :cond_a
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    .line 223
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShowType=\u5361\u8def\u91cc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 225
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget v1, v1, Lo/esr;->p:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportType(I)V

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v7}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTime(Ljava/lang/String;)V

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget v1, v1, Lo/esr;->g:I

    int-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportData(Ljava/lang/String;)V

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v10}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportUnit(Ljava/lang/String;)V

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeedUnit(Ljava/lang/String;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esr;->e:Landroid/content/Context;

    move-object/from16 v2, p0

    iget v2, v2, Lo/esr;->f:I

    invoke-static {v1, v2}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTypeName(Ljava/lang/String;)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/esr;->s:J

    invoke-static {v1, v2}, Lo/esr;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportKeepTime(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 233
    :cond_b
    move-object/from16 v0, p0

    iget v0, v0, Lo/esr;->p:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_c

    .line 234
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShowType=\u5361\u8def\u91cc  \u5e73\u5747\u5fc3\u7387"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 236
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    .line 237
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget v1, v1, Lo/esr;->p:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportType(I)V

    .line 238
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v7}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTime(Ljava/lang/String;)V

    .line 239
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget v1, v1, Lo/esr;->g:I

    int-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportData(Ljava/lang/String;)V

    .line 240
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v10}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportUnit(Ljava/lang/String;)V

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeedUnit(Ljava/lang/String;)V

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esr;->e:Landroid/content/Context;

    move-object/from16 v2, p0

    iget v2, v2, Lo/esr;->f:I

    invoke-static {v1, v2}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTypeName(Ljava/lang/String;)V

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/esr;->s:J

    invoke-static {v1, v2}, Lo/esr;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportKeepTime(Ljava/lang/String;)V

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget v2, v2, Lo/esr;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeed(Ljava/lang/String;)V

    .line 246
    :cond_c
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/esr;->i:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportStartTime(J)V

    .line 247
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/esr;->h:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportEndTime(J)V

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->a:Lo/esr$a;

    invoke-virtual {v0}, Lo/esr$a;->obtainMessage()Landroid/os/Message;

    move-result-object v13

    .line 249
    const/4 v0, 0x2

    iput v0, v13, Landroid/os/Message;->what:I

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iput-object v0, v13, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 251
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esr;->a:Lo/esr$a;

    invoke-virtual {v0, v13}, Lo/esr$a;->sendMessage(Landroid/os/Message;)Z

    .line 252
    return-void
.end method

.method static synthetic f(Lo/esr;J)J
    .locals 0

    .line 34
    iput-wide p1, p0, Lo/esr;->q:J

    return-wide p1
.end method

.method static synthetic f(Lo/esr;)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/esr;->v:Ljava/lang/String;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 447
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeSportData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lo/esr;->z:Ljava/util/List;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 449
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/esr;->z:Ljava/util/List;

    new-instance v2, Lo/eqf$e;

    sget-object v3, Lo/esr;->c:Ljava/lang/String;

    invoke-direct {v2, v3, p0}, Lo/eqf$e;-><init>(Ljava/lang/String;Lo/eqf;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 451
    return-void
.end method

.method static synthetic g(Lo/esr;I)I
    .locals 0

    .line 34
    iput p1, p0, Lo/esr;->p:I

    return p1
.end method

.method static synthetic g(Lo/esr;)J
    .locals 2

    .line 34
    iget-wide v0, p0, Lo/esr;->h:J

    return-wide v0
.end method

.method private g()Ljava/lang/String;
    .locals 3

    .line 661
    const-string v2, ""

    .line 662
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 663
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 665
    :cond_0
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 667
    :goto_0
    return-object v2
.end method

.method static synthetic h(Lo/esr;)J
    .locals 2

    .line 34
    iget-wide v0, p0, Lo/esr;->m:J

    return-wide v0
.end method

.method private h()V
    .locals 4

    .line 411
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;-><init>()V

    iput-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    .line 412
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget-object v1, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_no_history_data_tip:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportUnit(Ljava/lang/String;)V

    .line 413
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeedUnit(Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportType(I)V

    .line 415
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportEndTime(J)V

    .line 416
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportStartTime(J)V

    .line 417
    iget-object v0, p0, Lo/esr;->a:Lo/esr$a;

    invoke-virtual {v0}, Lo/esr$a;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 418
    const/4 v0, 0x2

    iput v0, v3, Landroid/os/Message;->what:I

    .line 419
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 420
    iget-object v0, p0, Lo/esr;->a:Lo/esr$a;

    invoke-virtual {v0, v3}, Lo/esr$a;->sendMessage(Landroid/os/Message;)Z

    .line 421
    return-void
.end method

.method static synthetic h(Lo/esr;I)Z
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/esr;->a(I)Z

    move-result v0

    return v0
.end method

.method private i()Ljava/lang/String;
    .locals 3

    .line 646
    const-string v2, ""

    .line 647
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 648
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 650
    :cond_0
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 652
    :goto_0
    return-object v2
.end method

.method static synthetic i(Lo/esr;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/esr;->k()V

    return-void
.end method

.method static synthetic k(Lo/esr;)I
    .locals 1

    .line 34
    iget v0, p0, Lo/esr;->f:I

    return v0
.end method

.method private k()V
    .locals 9

    .line 257
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshFitnessDataAndTime called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 261
    iget-wide v0, p0, Lo/esr;->m:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 262
    return-void

    .line 264
    :cond_0
    iget-wide v0, p0, Lo/esr;->l:J

    invoke-static {v0, v1}, Lo/cxh;->b(J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    iget-wide v0, p0, Lo/esr;->l:J

    invoke-virtual {v4, v0, v1}, Ljava/util/Date;->setTime(J)V

    .line 266
    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 267
    invoke-virtual {v5, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 269
    :cond_1
    iget-wide v0, p0, Lo/esr;->l:J

    invoke-static {v0, v1}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v6

    .line 271
    :goto_0
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 272
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;-><init>()V

    iput-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    .line 273
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget v1, p0, Lo/esr;->p:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportType(I)V

    .line 274
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTime(Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget-object v1, p0, Lo/esr;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportData(Ljava/lang/String;)V

    .line 276
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-virtual {v0, v7}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportUnit(Ljava/lang/String;)V

    .line 277
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeedUnit(Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget-object v1, p0, Lo/esr;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportTypeName(Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget-wide v1, p0, Lo/esr;->q:J

    invoke-static {v1, v2}, Lo/esr;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportKeepTime(Ljava/lang/String;)V

    .line 280
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportSpeed(Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget-wide v1, p0, Lo/esr;->l:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportStartTime(J)V

    .line 282
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iget-wide v1, p0, Lo/esr;->m:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->setSportEndTime(J)V

    .line 283
    iget-object v0, p0, Lo/esr;->a:Lo/esr$a;

    invoke-virtual {v0}, Lo/esr$a;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 284
    const/4 v0, 0x2

    iput v0, v8, Landroid/os/Message;->what:I

    .line 285
    iget-object v0, p0, Lo/esr;->b:Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 286
    iget-object v0, p0, Lo/esr;->a:Lo/esr$a;

    invoke-virtual {v0, v8}, Lo/esr$a;->sendMessage(Landroid/os/Message;)Z

    .line 287
    return-void
.end method

.method private n()Ljava/lang/String;
    .locals 4

    .line 674
    const-string v3, ""

    .line 675
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 676
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 678
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 680
    :goto_0
    return-object v3
.end method

.method private o()Ljava/lang/String;
    .locals 6

    .line 689
    const-string v5, ""

    .line 690
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 691
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 693
    :cond_0
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 695
    :goto_0
    return-object v5
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 122
    invoke-virtual {p0}, Lo/esr;->d()V

    .line 123
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 436
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeSportData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 438
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerSportListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    iput-object p1, p0, Lo/esr;->w:Ljava/util/List;

    .line 441
    :cond_0
    return-void
.end method

.method protected c()V
    .locals 5

    .line 454
    sget-object v0, Lo/esr;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeSportRecordingData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lo/esr;->w:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/esr;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    iget-object v0, p0, Lo/esr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/esr;->w:Ljava/util/List;

    new-instance v2, Lo/eqf$d;

    sget-object v3, Lo/esr;->c:Ljava/lang/String;

    const-string v4, "unSubscribeSportRecordingData, isSuccess:"

    invoke-direct {v2, v3, v4}, Lo/eqf$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 459
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 431
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/esr;->r:Lo/esr$b;

    invoke-virtual {v0, v1}, Lo/dgu;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 432
    return-void
.end method

.method public e(I)Z
    .locals 1

    .line 425
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
