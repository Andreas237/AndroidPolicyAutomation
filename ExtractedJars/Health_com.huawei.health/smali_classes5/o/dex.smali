.class public Lo/dex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dex$d;
    }
.end annotation


# static fields
.field private static e:Lo/dex;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field private b:Lo/dex$d;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field d:Lo/dfu;

.field private f:J

.field private g:Lo/dfa;

.field private h:I

.field private i:J

.field private k:J


# direct methods
.method private constructor <init>()V
    .locals 5

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dex;->b:Lo/dex$d;

    .line 661
    new-instance v0, Lo/dfa;

    invoke-direct {v0}, Lo/dfa;-><init>()V

    iput-object v0, p0, Lo/dex;->g:Lo/dfa;

    .line 704
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 940
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dex;->i:J

    .line 996
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dex;->f:J

    .line 997
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dex;->k:J

    .line 1225
    const/4 v0, 0x0

    iput v0, p0, Lo/dex;->h:I

    .line 84
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "FitnessMgrStorage Constructor"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 85
    new-instance v0, Lo/dex$d;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dex$d;-><init>(Lo/dex;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dex;->b:Lo/dex$d;

    .line 86
    return-void
.end method

.method private a(I)I
    .locals 5

    .line 1100
    const/4 v4, 0x0

    .line 1102
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1104
    :pswitch_0
    const/16 v4, 0x4e22

    .line 1105
    goto :goto_1

    .line 1107
    :pswitch_1
    const/16 v4, 0x4e23

    .line 1108
    goto :goto_1

    .line 1110
    :pswitch_2
    const/16 v4, 0x4e25

    .line 1111
    goto :goto_1

    .line 1113
    :pswitch_3
    const/16 v4, 0x4e24

    .line 1114
    goto :goto_1

    .line 1116
    :pswitch_4
    const/16 v4, 0x55f1

    .line 1117
    goto :goto_1

    .line 1119
    :pswitch_5
    const/16 v4, 0x55f2

    .line 1120
    goto :goto_1

    .line 1122
    :pswitch_6
    const/16 v4, 0x4e27

    .line 1123
    goto :goto_1

    .line 1125
    :goto_0
    :pswitch_7
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHiHealthSessionType unknow type :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    :goto_1
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public static a()Lo/dex;
    .locals 4

    .line 89
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    sget-object v0, Lo/dex;->e:Lo/dex;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 91
    new-instance v0, Lo/dex;

    invoke-direct {v0}, Lo/dex;-><init>()V

    sput-object v0, Lo/dex;->e:Lo/dex;

    .line 93
    :cond_0
    sget-object v0, Lo/dex;->e:Lo/dex;

    return-object v0
.end method

.method private a(Lo/dez;Lo/dfl;)V
    .locals 15

    .line 515
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->b()I

    move-result v9

    .line 517
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->e()I

    move-result v10

    .line 518
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->a()I

    move-result v11

    .line 519
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->d()I

    move-result v12

    .line 520
    const/4 v13, 0x3

    .line 523
    invoke-virtual {p0}, Lo/dex;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 524
    const/4 v13, 0x5

    .line 527
    :cond_0
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveSportData type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " cal="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " step="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " dis="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " TimeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 528
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " date="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 527
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 531
    move-object/from16 v0, p2

    invoke-direct {p0, v0, v13}, Lo/dex;->b(Lo/dfl;I)Lo/dfl;

    move-result-object p2

    .line 535
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->e()I

    move-result v0

    if-lez v0, :cond_1

    .line 536
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    move-object v14, v0

    .line 537
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v2

    const-wide/16 v4, 0x3c

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v14, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 538
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->e()I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 539
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 540
    iget-object v0, p0, Lo/dex;->a:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 541
    goto :goto_0

    .line 542
    :cond_1
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid date step="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " TimeStamp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 543
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 542
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->d()I

    move-result v0

    if-lez v0, :cond_2

    .line 547
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    move v1, v13

    invoke-direct {v0, v1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    move-object v14, v0

    .line 548
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->d()I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 549
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v2

    const-wide/16 v4, 0x3c

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v14, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 550
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 551
    iget-object v0, p0, Lo/dex;->a:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 552
    goto :goto_1

    .line 553
    :cond_2
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid date dis="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " TimeStamp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 554
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 553
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->a()I

    move-result v0

    if-lez v0, :cond_3

    .line 558
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    move-object v14, v0

    .line 559
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v2

    const-wide/16 v4, 0x3c

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v14, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 560
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->a()I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 561
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 562
    iget-object v0, p0, Lo/dex;->a:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    goto :goto_2

    .line 564
    :cond_3
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid date cal="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p2 .. p2}, Lo/dfl;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " TimeStamp="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 565
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 564
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    :goto_2
    return-void
.end method

.method private b(I)I
    .locals 5

    .line 1046
    const/4 v4, 0x0

    .line 1048
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1050
    :pswitch_0
    const/4 v4, 0x2

    .line 1051
    goto :goto_1

    .line 1053
    :pswitch_1
    const/4 v4, 0x4

    .line 1054
    goto :goto_1

    .line 1056
    :pswitch_2
    const/4 v4, 0x3

    .line 1057
    goto :goto_1

    .line 1059
    :pswitch_3
    const/4 v4, 0x6

    .line 1060
    goto :goto_1

    .line 1062
    :pswitch_4
    const/4 v4, 0x5

    .line 1063
    goto :goto_1

    .line 1065
    :pswitch_5
    const/16 v4, 0x7e2

    .line 1066
    goto :goto_1

    .line 1069
    :pswitch_6
    const/16 v4, 0x7d2

    .line 1070
    goto :goto_1

    .line 1072
    :goto_0
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHiHealthSessionType unknow type :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private b(Lo/dfl;I)Lo/dfl;
    .locals 9

    .line 495
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dex;->b(I)I

    move-result v0

    invoke-virtual {p1}, Lo/dfl;->e()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/dex;->c(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 496
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "invalid date type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lo/dfl;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " step="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lo/dfl;->e()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " TimeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 497
    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " date="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 496
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 498
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/dfl;->d(I)V

    .line 500
    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/dex;->b(I)I

    move-result v0

    invoke-virtual {p1}, Lo/dfl;->a()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/dex;->c(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 501
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "invalid date type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lo/dfl;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " cal="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lo/dfl;->a()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " TimeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 502
    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " date="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 501
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 503
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/dfl;->e(I)V

    .line 505
    :cond_1
    invoke-virtual {p1}, Lo/dfl;->d()I

    move-result v0

    invoke-direct {p0, p2, v0}, Lo/dex;->c(II)Z

    move-result v0

    if-nez v0, :cond_2

    .line 507
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "invalid date type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lo/dfl;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " dis="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lo/dfl;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " TimeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 508
    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " date="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 507
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 509
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/dfl;->b(I)V

    .line 511
    :cond_2
    return-object p1
.end method

.method static synthetic c(Lo/dex;)Lo/dex$d;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/dex;->b:Lo/dex$d;

    return-object v0
.end method

.method private c(Lo/dez;Lo/dfl;)Lo/dfl;
    .locals 18

    .line 418
    new-instance v9, Lo/dfl;

    invoke-direct {v9}, Lo/dfl;-><init>()V

    .line 421
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->c()I

    move-result v13

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->e()I

    move-result v14

    .line 423
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->b()I

    move-result v15

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->a()J

    move-result-wide v16

    .line 426
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->e()I

    move-result v11

    .line 427
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->a()I

    move-result v10

    .line 428
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->d()I

    move-result v12

    .line 431
    if-lt v11, v13, :cond_0

    if-lt v10, v14, :cond_0

    if-ge v12, v15, :cond_1

    .line 432
    :cond_0
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "lastTimeStamp "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v4, v16

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " date1="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    const-wide/16 v5, 0x3e8

    mul-long v5, v5, v16

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " current timeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 434
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", date2="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    .line 435
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " lastcal="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " laststep="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " lastdis="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " curr:cal="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " step="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " dis="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 432
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 440
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v0

    move-object/from16 v2, p0

    move-wide/from16 v3, v16

    invoke-virtual {v2, v3, v4, v0, v1}, Lo/dex;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 441
    const/4 v13, 0x0

    .line 442
    const/4 v14, 0x0

    .line 443
    const/4 v15, 0x0

    .line 445
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dfa;->e(I)V

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dfa;->b(I)V

    .line 447
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dex;->g:Lo/dfa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dfa;->c(I)V

    .line 450
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->b()I

    move-result v0

    invoke-virtual {v9, v0}, Lo/dfl;->c(I)V

    .line 451
    sub-int v0, v11, v13

    invoke-virtual {v9, v0}, Lo/dfl;->d(I)V

    .line 452
    sub-int v0, v10, v14

    invoke-virtual {v9, v0}, Lo/dfl;->e(I)V

    .line 453
    sub-int v0, v12, v15

    invoke-virtual {v9, v0}, Lo/dfl;->b(I)V

    .line 454
    invoke-virtual/range {p2 .. p2}, Lo/dfl;->c()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/dfl;->c(J)V

    .line 456
    return-object v9
.end method

.method private c(Ljava/util/List;Ljava/util/List;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lo/dft;>;)V"
        }
    .end annotation

    .line 1232
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dft;

    .line 1233
    invoke-virtual {v8}, Lo/dft;->b()Ljava/util/List;

    move-result-object v9

    .line 1234
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 1235
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dft$e;

    .line 1236
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DesFrame : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/dft;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1237
    invoke-virtual {v11}, Lo/dft$e;->d()I

    move-result v12

    .line 1238
    invoke-virtual {v11}, Lo/dft$e;->e()I

    move-result v13

    .line 1241
    rem-int/lit8 v0, v12, 0x3c

    sub-int v14, v12, v0

    .line 1242
    rem-int/lit8 v0, v13, 0x3c

    sub-int v15, v13, v0

    .line 1244
    sub-int v0, v15, v14

    div-int/lit8 v16, v0, 0x3c

    .line 1245
    const/16 v17, 0x0

    :goto_2
    move/from16 v0, v17

    move/from16 v1, v16

    if-ge v0, v1, :cond_0

    .line 1246
    mul-int/lit8 v0, v17, 0x3c

    add-int v18, v14, v0

    .line 1247
    add-int/lit8 v19, v18, 0x3c

    .line 1249
    new-instance v20, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 1250
    move/from16 v0, v18

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    move/from16 v2, v19

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    move-object/from16 v4, v20

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 1251
    invoke-virtual {v11}, Lo/dft$e;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/dex;->h(I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 1252
    move-object/from16 v0, v20

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 1253
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 1254
    move-object/from16 v0, p1

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1256
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Intensive data: startTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v18

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "endTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "value : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/dft$e;->b()I

    move-result v3

    move-object/from16 v4, p0

    invoke-direct {v4, v3}, Lo/dex;->h(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "type : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  uuid : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1257
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1256
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1245
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_2

    .line 1234
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 1261
    :cond_1
    goto/16 :goto_0

    .line 1262
    :cond_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1263
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dft;

    .line 1264
    invoke-virtual {v7}, Lo/dft;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7}, Lo/dft;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dft$e;

    .line 1265
    invoke-virtual {v8}, Lo/dft$e;->e()I

    move-result v9

    .line 1266
    move-object/from16 v0, p0

    iget v0, v0, Lo/dex;->h:I

    if-le v9, v0, :cond_3

    .line 1267
    move-object/from16 v0, p0

    iput v9, v0, Lo/dex;->h:I

    .line 1270
    :cond_3
    return-void
.end method

.method private c(II)Z
    .locals 1

    .line 467
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 468
    if-lez p2, :cond_5

    const/16 v0, 0x1f4

    if-ge p2, v0, :cond_5

    .line 469
    const/4 v0, 0x1

    return v0

    .line 471
    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 472
    if-lez p2, :cond_5

    const v0, 0xffff

    if-ge p2, v0, :cond_5

    .line 473
    const/4 v0, 0x1

    return v0

    .line 475
    :cond_1
    const/16 v0, 0x7e2

    if-eq p1, v0, :cond_2

    const/16 v0, 0x7d2

    if-ne p1, v0, :cond_3

    .line 477
    :cond_2
    if-lez p2, :cond_5

    const/16 v0, 0xff

    if-ge p2, v0, :cond_5

    .line 478
    const/4 v0, 0x1

    return v0

    .line 480
    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    .line 481
    if-lez p2, :cond_5

    const/16 v0, 0x5dc

    if-ge p2, v0, :cond_5

    .line 482
    const/4 v0, 0x1

    return v0

    .line 485
    :cond_4
    if-lez p2, :cond_5

    .line 486
    const/4 v0, 0x1

    return v0

    .line 490
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public static d(J)J
    .locals 3

    .line 316
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 317
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 318
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 319
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 320
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 321
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 322
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private d(Lo/dez;Lo/dfw;)V
    .locals 7

    .line 1088
    invoke-virtual {p2}, Lo/dfw;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dex;->b(I)I

    move-result v0

    invoke-virtual {p2}, Lo/dfw;->c()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/dex;->c(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1089
    new-instance v6, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p2}, Lo/dfw;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dex;->b(I)I

    move-result v0

    invoke-direct {v6, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 1090
    invoke-virtual {p2}, Lo/dfw;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p2}, Lo/dfw;->e()J

    move-result-wide v2

    invoke-virtual {p2}, Lo/dfw;->b()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v6, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 1091
    invoke-virtual {p2}, Lo/dfw;->c()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 1092
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 1093
    iget-object v0, p0, Lo/dex;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1094
    goto :goto_0

    .line 1095
    :cond_0
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSamplePoint invalid sample:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    :goto_0
    return-void
.end method

.method private e(Lo/dez;Lo/dfu;)V
    .locals 9

    .line 1140
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "statusPoint :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    invoke-virtual {p2}, Lo/dfu;->c()J

    move-result-wide v6

    :goto_0
    invoke-virtual {p2}, Lo/dfu;->e()J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-gez v0, :cond_1

    .line 1144
    invoke-virtual {p2}, Lo/dfu;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dex;->a(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 1145
    new-instance v8, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p2}, Lo/dfu;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dex;->a(I)I

    move-result v0

    invoke-direct {v8, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 1146
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v6

    const-wide/16 v2, 0x3c

    add-long/2addr v2, v6

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v8, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 1147
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 1148
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveStatusToHiHealth hiHealthData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    iget-object v0, p0, Lo/dex;->c:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1151
    :cond_0
    const-wide/16 v0, 0x3c

    add-long/2addr v6, v0

    goto :goto_0

    .line 1153
    :cond_1
    return-void
.end method

.method private e(Lo/dfl;)V
    .locals 7

    .line 572
    invoke-virtual {p1}, Lo/dfl;->b()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 573
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataLastTotal getCurrentStatus= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dfl;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    return-void

    .line 576
    :cond_0
    invoke-virtual {p1}, Lo/dfl;->e()I

    move-result v4

    .line 577
    invoke-virtual {p1}, Lo/dfl;->a()I

    move-result v5

    .line 578
    invoke-virtual {p1}, Lo/dfl;->d()I

    move-result v6

    .line 579
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    .line 580
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataLastTotal getCurrentStatus: step ,cal ,dis =0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    return-void

    .line 583
    :cond_1
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0, v6}, Lo/dfa;->i(I)V

    .line 584
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0, v4}, Lo/dfa;->d(I)V

    .line 585
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0, v5}, Lo/dfa;->a(I)V

    .line 586
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {p1}, Lo/dfl;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/dfa;->a(J)V

    .line 587
    return-void
.end method

.method private h(I)I
    .locals 2

    .line 1280
    const/4 v1, 0x0

    .line 1281
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1283
    :pswitch_0
    const/4 v1, 0x1

    .line 1284
    goto :goto_0

    .line 1286
    :pswitch_1
    const/4 v1, 0x2

    .line 1287
    goto :goto_0

    .line 1289
    :pswitch_2
    const/4 v1, 0x3

    .line 1290
    goto :goto_0

    .line 1292
    :pswitch_3
    const/4 v1, 0x7

    .line 1293
    goto :goto_0

    .line 1295
    :pswitch_4
    const/4 v1, 0x6

    .line 1296
    goto :goto_0

    .line 1298
    :pswitch_5
    const/16 v1, 0x8

    .line 1299
    .line 1303
    :goto_0
    :pswitch_6
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfw;>;)V"
        }
    .end annotation

    .line 912
    const/4 v5, 0x0

    .line 913
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 914
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Total:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dfw;

    .line 916
    const-string v0, "[i:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 918
    const-string v0, "]"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 920
    add-int/lit8 v5, v5, 0x1

    .line 921
    goto :goto_0

    .line 922
    :cond_0
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 923
    return-void
.end method

.method public a(Lo/dez;Lo/dfq;)V
    .locals 5

    .line 943
    invoke-virtual {p2}, Lo/dfq;->a()Ljava/util/List;

    move-result-object v2

    .line 944
    invoke-virtual {p0, v2}, Lo/dex;->a(Ljava/util/List;)V

    .line 948
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dfw;

    .line 957
    invoke-direct {p0, p1, v4}, Lo/dex;->d(Lo/dez;Lo/dfw;)V

    .line 958
    goto :goto_0

    .line 959
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 960
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dfw;

    invoke-virtual {v0}, Lo/dfw;->e()J

    move-result-wide v3

    .line 961
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->a()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-gez v0, :cond_1

    .line 962
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0, v3, v4}, Lo/dfa;->a(J)V

    .line 966
    :cond_1
    return-void
.end method

.method public b(Lo/dez;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dez;Ljava/util/List<Lo/dfq;>;)V"
        }
    .end annotation

    .line 969
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveSampleFrameList enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 972
    new-instance v0, Lo/dex$4;

    invoke-direct {v0, p0}, Lo/dex$4;-><init>(Lo/dex;)V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 977
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dfq;

    .line 978
    invoke-virtual {p0, p1, v6}, Lo/dex;->a(Lo/dez;Lo/dfq;)V

    .line 979
    goto :goto_0

    .line 980
    :cond_0
    return-void
.end method

.method public b(Lo/dez;Ljava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dez;Ljava/util/List<Lo/dfm;>;I)V"
        }
    .end annotation

    .line 663
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveFitnessData enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 664
    invoke-virtual {p1}, Lo/dez;->f()I

    move-result v5

    .line 667
    new-instance v0, Lo/dex$5;

    invoke-direct {v0, p0}, Lo/dex$5;-><init>(Lo/dex;)V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 674
    invoke-virtual {p0}, Lo/dex;->e()V

    .line 676
    new-instance v6, Lo/dev;

    invoke-direct {v6}, Lo/dev;-><init>()V

    .line 677
    invoke-virtual {v6, p1}, Lo/dev;->b(Lo/dez;)Lo/dfa;

    move-result-object v0

    iput-object v0, p0, Lo/dex;->g:Lo/dfa;

    .line 678
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dex;->i:J

    .line 680
    const/4 v0, 0x4

    if-ne v0, v5, :cond_1

    .line 681
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dfm;

    .line 682
    invoke-virtual {p0, p1, v8}, Lo/dex;->b(Lo/dez;Lo/dfm;)V

    .line 683
    goto :goto_0

    :cond_0
    goto :goto_3

    .line 685
    :cond_1
    invoke-virtual {p1}, Lo/dez;->b()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 686
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dfm;

    .line 687
    invoke-virtual {p0, p1, v8}, Lo/dex;->b(Lo/dez;Lo/dfm;)V

    .line 688
    goto :goto_1

    :cond_2
    goto :goto_3

    .line 690
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dfm;

    .line 691
    invoke-virtual {p0, p1, v8}, Lo/dex;->b(Lo/dez;Lo/dfm;)V

    .line 692
    goto :goto_2

    .line 696
    :cond_4
    :goto_3
    invoke-virtual {p0, p3}, Lo/dex;->c(I)V

    .line 698
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFitnessData leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 699
    return-void
.end method

.method public b(Lo/dez;Lo/dfm;)V
    .locals 16

    .line 875
    invoke-virtual/range {p2 .. p2}, Lo/dfm;->c()Ljava/util/List;

    move-result-object v9

    .line 876
    invoke-virtual/range {p2 .. p2}, Lo/dfm;->b()Ljava/util/List;

    move-result-object v10

    .line 882
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveFitnessFrame time="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lo/dfm;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " date="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    .line 883
    invoke-virtual/range {p2 .. p2}, Lo/dfm;->d()I

    move-result v5

    int-to-long v5, v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 882
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 884
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 885
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v13

    .line 886
    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_1

    .line 887
    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dfl;

    .line 888
    invoke-virtual {v11}, Lo/dfl;->b()I

    move-result v0

    const/16 v1, 0xff

    if-eq v1, v0, :cond_0

    .line 889
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/dex;->i:J

    invoke-virtual {v11}, Lo/dfl;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 890
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v11}, Lo/dex;->c(Lo/dez;Lo/dfl;)Lo/dfl;

    move-result-object v15

    .line 891
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lo/dex;->e(Lo/dfl;)V

    .line 892
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v15}, Lo/dex;->a(Lo/dez;Lo/dfl;)V

    .line 893
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v11}, Lo/dex;->e(Lo/dez;Lo/dfl;)V

    .line 886
    :cond_0
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 899
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 900
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v13

    .line 901
    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_2

    .line 902
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dfo;

    .line 903
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v12}, Lo/dex;->d(Lo/dez;Lo/dfo;)V

    .line 901
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 906
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/dex;->d(Lo/dez;)V

    .line 907
    return-void
.end method

.method public b(Lo/dez;Lo/dfx;)V
    .locals 5

    .line 999
    invoke-virtual {p2}, Lo/dfx;->d()Ljava/util/List;

    move-result-object v2

    .line 1001
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dfu;

    .line 1014
    invoke-direct {p0, p1, v4}, Lo/dex;->e(Lo/dez;Lo/dfu;)V

    .line 1015
    goto :goto_0

    .line 1016
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1017
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dfu;

    invoke-virtual {v0}, Lo/dfu;->c()J

    move-result-wide v3

    .line 1018
    iget-wide v0, p0, Lo/dex;->k:J

    cmp-long v0, v3, v0

    if-lez v0, :cond_1

    .line 1020
    iput-wide v3, p0, Lo/dex;->k:J

    .line 1023
    :cond_1
    return-void
.end method

.method c(I)V
    .locals 6

    .line 1172
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveDataToHiHealth enter dataList.size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/dex;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " statusList.size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/dex;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 1174
    iget-object v0, p0, Lo/dex;->a:Ljava/util/List;

    iget-object v1, p0, Lo/dex;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1175
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveDataToHiHealth enter dataList.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dex;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1176
    iget-object v0, p0, Lo/dex;->a:Ljava/util/List;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 1177
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dex$1;

    invoke-direct {v1, p0, p1}, Lo/dex$1;-><init>(Lo/dex;I)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 1200
    return-void
.end method

.method public c(Lo/dez;)V
    .locals 3

    .line 148
    new-instance v0, Lo/dew;

    invoke-direct {v0}, Lo/dew;-><init>()V

    .line 149
    invoke-virtual {v0, p1}, Lo/dew;->e(Lo/dez;)V

    .line 152
    new-instance v1, Lo/des;

    invoke-direct {v1}, Lo/des;-><init>()V

    .line 153
    invoke-virtual {v1, p1}, Lo/des;->d(Lo/dez;)V

    .line 156
    new-instance v2, Lo/dev;

    invoke-direct {v2}, Lo/dev;-><init>()V

    .line 157
    invoke-virtual {v2, p1}, Lo/dev;->a(Lo/dez;)V

    .line 159
    return-void
.end method

.method public c()Z
    .locals 7

    .line 171
    const/4 v5, 0x0

    .line 173
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 174
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 175
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isClimb()Z

    move-result v5

    goto :goto_0

    .line 177
    :cond_0
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceDataType deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    :goto_0
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isDeviceSupportClimeHeight "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return v5
.end method

.method public d()V
    .locals 4

    .line 1156
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v2

    .line 1157
    new-instance v3, Lo/dev;

    invoke-direct {v3}, Lo/dev;-><init>()V

    .line 1158
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v3, v2, v0}, Lo/dev;->c(Lo/dez;Lo/dfa;)V

    .line 1159
    iget-wide v0, p0, Lo/dex;->k:J

    invoke-static {v2, v0, v1}, Lo/det;->c(Lo/dez;J)V

    .line 1160
    return-void
.end method

.method public d(I)V
    .locals 6

    .line 1308
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procSaveDesDataComplete enter errCode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1309
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx : procSaveDesDataComplete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1310
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v5

    .line 1311
    if-nez p1, :cond_0

    .line 1312
    iget v0, p0, Lo/dex;->h:I

    int-to-long v0, v0

    invoke-static {v5, v0, v1}, Lo/det;->b(Lo/dez;J)V

    .line 1315
    :cond_0
    invoke-virtual {v5, p1}, Lo/dez;->b(I)V

    .line 1316
    return-void
.end method

.method public d(Lo/dez;)V
    .locals 5

    .line 754
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateStatus null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 756
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    if-eqz v0, :cond_0

    .line 757
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-direct {p0, p1, v0}, Lo/dex;->e(Lo/dez;Lo/dfu;)V

    .line 758
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 760
    :cond_0
    return-void
.end method

.method public d(Lo/dez;Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;)V
    .locals 11

    .line 326
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveTodayTotaltoHiHealth fitnessTotalData :"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 328
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 329
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dex;->d(J)J

    move-result-wide v6

    .line 330
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 332
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v0

    if-lez v0, :cond_0

    .line 334
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 335
    const v0, 0x9c42

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 336
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 337
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 338
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 339
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    new-instance v10, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 343
    const/16 v0, 0x385

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 344
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 345
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v10, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 346
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 347
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v0

    if-lez v0, :cond_1

    .line 351
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 352
    const v0, 0x9c43

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 353
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 354
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 355
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 356
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    if-lez v0, :cond_2

    .line 360
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 361
    const v0, 0x9c44

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 362
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 363
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 364
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 365
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v0

    if-lez v0, :cond_3

    .line 369
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 370
    const v0, 0x9c45

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 371
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 372
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 373
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 374
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 378
    invoke-virtual {v5, v8}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 379
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dex$2;

    invoke-direct {v1, p0}, Lo/dex$2;-><init>(Lo/dex;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 386
    :cond_4
    return-void
.end method

.method public d(Lo/dez;Lo/dfo;)V
    .locals 5

    .line 733
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateStatus DataRawSleepData "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 735
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    if-nez v0, :cond_0

    .line 736
    new-instance v0, Lo/dfu;

    invoke-direct {v0}, Lo/dfu;-><init>()V

    iput-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 737
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfo;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/dfu;->c(J)V

    .line 738
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfo;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dfu;->d(I)V

    .line 739
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lo/dfu;->b(I)V

    goto :goto_0

    .line 740
    :cond_0
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {v0}, Lo/dfu;->b()I

    move-result v0

    invoke-virtual {p2}, Lo/dfo;->d()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 741
    invoke-virtual {v0}, Lo/dfu;->e()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dfo;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 742
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lo/dfu;->a(I)V

    goto :goto_0

    .line 745
    :cond_1
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-direct {p0, p1, v0}, Lo/dex;->e(Lo/dez;Lo/dfu;)V

    .line 746
    new-instance v0, Lo/dfu;

    invoke-direct {v0}, Lo/dfu;-><init>()V

    iput-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 747
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfo;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/dfu;->c(J)V

    .line 748
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfo;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dfu;->d(I)V

    .line 749
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lo/dfu;->b(I)V

    .line 751
    :goto_0
    return-void
.end method

.method public d(Lo/dez;Lo/dfp;)V
    .locals 18

    .line 231
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveTodayTotalData get data success total cal="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lo/dfp;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 233
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 234
    new-instance v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 236
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 238
    invoke-virtual/range {p2 .. p2}, Lo/dfp;->a()Ljava/util/List;

    move-result-object v10

    .line 239
    new-instance v11, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>()V

    .line 240
    invoke-virtual/range {p2 .. p2}, Lo/dfp;->d()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 241
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;

    .line 242
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getMotion_type()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " step= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " cal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 243
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getCalorie()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 242
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getMotion_type()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 247
    :pswitch_0
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addSteps(I)V

    .line 248
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 249
    new-instance v14, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v14, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    .line 250
    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    goto/16 :goto_2

    .line 253
    :pswitch_1
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addSteps(I)V

    .line 254
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 255
    new-instance v15, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v15, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    .line 256
    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    goto/16 :goto_2

    .line 259
    :pswitch_2
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addSteps(I)V

    .line 260
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    move-object v1, v13

    invoke-direct {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    move-object/from16 v16, v0

    .line 262
    invoke-virtual/range {p1 .. p1}, Lo/dez;->i()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 263
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 264
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 265
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    goto :goto_1

    .line 267
    :cond_0
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 268
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 269
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getHeight()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 270
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 272
    :goto_1
    move-object/from16 v0, v16

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    goto :goto_2

    .line 275
    :pswitch_3
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    move-object v1, v13

    invoke-direct {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    move-object/from16 v17, v0

    .line 276
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 277
    move-object/from16 v0, v17

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    goto :goto_2

    .line 280
    :pswitch_4
    goto :goto_2

    .line 282
    :pswitch_5
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getSleep_time()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 283
    goto :goto_2

    .line 285
    :pswitch_6
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getSleep_time()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 286
    .line 291
    :goto_2
    goto/16 :goto_0

    .line 293
    :cond_1
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveTodayTotalData steps ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " calorie ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 295
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " distance ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 296
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "size="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 294
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 298
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v11}, Lo/dex;->d(Lo/dez;Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;)V

    .line 299
    const-string v12, ""

    .line 300
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v13

    .line 301
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 305
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 306
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 305
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 307
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v4

    div-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 307
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 309
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 309
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 311
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public d(JJ)Z
    .locals 9

    .line 389
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yy/MM/dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 390
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, p1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 391
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, p3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 393
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    const/4 v0, 0x1

    return v0

    .line 396
    :cond_0
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "day="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " date1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",day1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " date2="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, p3

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    const/4 v0, 0x0

    return v0
.end method

.method e()V
    .locals 1

    .line 1041
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dex;->a:Ljava/util/List;

    .line 1042
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dex;->c:Ljava/util/List;

    .line 1043
    return-void
.end method

.method public e(I)V
    .locals 6

    .line 1163
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procSaveDataComplete enter errCode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1164
    if-nez p1, :cond_0

    .line 1165
    invoke-virtual {p0}, Lo/dex;->d()V

    .line 1167
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v5

    .line 1168
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dez;->e(I)V

    .line 1169
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dft;>;)V"
        }
    .end annotation

    .line 1206
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1207
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter saveIntensiveInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1208
    invoke-direct {p0, v4, p1}, Lo/dex;->c(Ljava/util/List;Ljava/util/List;)V

    .line 1209
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 1210
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 1211
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dex$3;

    invoke-direct {v1, p0}, Lo/dex$3;-><init>(Lo/dex;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 1223
    return-void
.end method

.method public e(Lo/dez;)V
    .locals 4

    .line 167
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initFitnessUserStorage."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void
.end method

.method public e(Lo/dez;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dez;Ljava/util/List<Lo/dfx;>;)V"
        }
    .end annotation

    .line 1026
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveStatusFrameList enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1028
    invoke-static {p1}, Lo/det;->e(Lo/dez;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/dex;->f:J

    .line 1029
    iget-wide v0, p0, Lo/dex;->f:J

    iput-wide v0, p0, Lo/dex;->k:J

    .line 1030
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dfx;

    .line 1031
    invoke-virtual {p0, p1, v6}, Lo/dex;->b(Lo/dez;Lo/dfx;)V

    .line 1032
    goto :goto_0

    .line 1033
    :cond_0
    return-void
.end method

.method public e(Lo/dez;Ljava/util/List;Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dez;Ljava/util/List<Lo/dfq;>;Ljava/util/List<Lo/dfx;>;I)V"
        }
    .end annotation

    .line 927
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveFitnessData in SEPARATED type"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 930
    new-instance v5, Lo/dev;

    invoke-direct {v5}, Lo/dev;-><init>()V

    .line 931
    invoke-virtual {v5, p1}, Lo/dev;->b(Lo/dez;)Lo/dfa;

    move-result-object v0

    iput-object v0, p0, Lo/dex;->g:Lo/dfa;

    .line 932
    iget-object v0, p0, Lo/dex;->g:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dex;->i:J

    .line 933
    invoke-virtual {p0}, Lo/dex;->e()V

    .line 934
    invoke-virtual {p0, p1, p2}, Lo/dex;->b(Lo/dez;Ljava/util/List;)V

    .line 935
    invoke-virtual {p0, p1, p3}, Lo/dex;->e(Lo/dez;Ljava/util/List;)V

    .line 937
    invoke-virtual {p0, p4}, Lo/dex;->c(I)V

    .line 938
    return-void
.end method

.method public e(Lo/dez;Lo/dfl;)V
    .locals 5

    .line 707
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateStatus DataRawSportData "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 709
    invoke-virtual {p2}, Lo/dfl;->e()I

    move-result v0

    if-nez v0, :cond_0

    .line 710
    invoke-virtual {p2}, Lo/dfl;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 711
    invoke-virtual {p2}, Lo/dfl;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 712
    return-void

    .line 714
    :cond_0
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    if-nez v0, :cond_1

    .line 715
    new-instance v0, Lo/dfu;

    invoke-direct {v0}, Lo/dfu;-><init>()V

    iput-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 716
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfl;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/dfu;->c(J)V

    .line 717
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfl;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dfu;->d(I)V

    .line 718
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lo/dfu;->b(I)V

    goto :goto_0

    .line 719
    :cond_1
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {v0}, Lo/dfu;->b()I

    move-result v0

    invoke-virtual {p2}, Lo/dfl;->b()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 720
    invoke-virtual {v0}, Lo/dfu;->e()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dfl;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 721
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lo/dfu;->a(I)V

    goto :goto_0

    .line 724
    :cond_2
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-direct {p0, p1, v0}, Lo/dex;->e(Lo/dez;Lo/dfu;)V

    .line 725
    new-instance v0, Lo/dfu;

    invoke-direct {v0}, Lo/dfu;-><init>()V

    iput-object v0, p0, Lo/dex;->d:Lo/dfu;

    .line 726
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfl;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/dfu;->c(J)V

    .line 727
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    invoke-virtual {p2}, Lo/dfl;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dfu;->d(I)V

    .line 728
    iget-object v0, p0, Lo/dex;->d:Lo/dfu;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lo/dfu;->b(I)V

    .line 730
    :goto_0
    return-void
.end method
