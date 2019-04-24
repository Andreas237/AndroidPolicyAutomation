.class Lo/dea$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dea;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field final synthetic b:Lo/dea;


# direct methods
.method constructor <init>(Lo/dea;)V
    .locals 1

    .line 2499
    iput-object p1, p0, Lo/dea$2;->b:Lo/dea;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2500
    const-string v0, ""

    iput-object v0, p0, Lo/dea$2;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 15

    .line 2504
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_7

    .line 2506
    const/4 v5, 0x0

    .line 2507
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 2508
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 2509
    const-string v0, "GMT+00:00"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 2510
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 2511
    invoke-virtual {v6, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    .line 2512
    const-string v0, "android.intent.action.TIME_TICK"

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2513
    const-string v0, ""

    iget-object v1, p0, Lo/dea$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2514
    iput-object v9, p0, Lo/dea$2;->a:Ljava/lang/String;

    .line 2515
    return-void

    .line 2518
    :cond_0
    const/4 v10, 0x0

    .line 2520
    :try_start_0
    invoke-virtual {v7, v9}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 2521
    iget-object v0, p0, Lo/dea$2;->a:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 2525
    goto :goto_0

    .line 2522
    :catch_0
    move-exception v11

    .line 2523
    iput-object v9, p0, Lo/dea$2;->a:Ljava/lang/String;

    .line 2524
    return-void

    .line 2526
    :goto_0
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v11, v0, v2

    .line 2527
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "currentTime "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " mLaterTime :: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";timeTap:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2528
    const-wide/16 v0, 0x3e8

    div-long v0, v11, v0

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    const-wide/16 v2, 0x19

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    const-wide/16 v0, 0x3e8

    div-long v0, v11, v0

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    const-wide/16 v2, -0x19

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 2529
    :cond_1
    iput-object v9, p0, Lo/dea$2;->a:Ljava/lang/String;

    move-object v13, v9

    .line 2531
    const/4 v5, 0x1

    .line 2532
    goto :goto_1

    .line 2533
    :cond_2
    iput-object v9, p0, Lo/dea$2;->a:Ljava/lang/String;

    .line 2534
    return-void

    .line 2536
    :goto_1
    goto :goto_2

    .line 2537
    :cond_3
    iput-object v9, p0, Lo/dea$2;->a:Ljava/lang/String;

    .line 2539
    :goto_2
    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "android.intent.action.TIME_SET"

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "android.intent.action.DATE_CHANGED"

    .line 2540
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz v5, :cond_7

    .line 2541
    :cond_4
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "System Time changed with type : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2543
    const/4 v10, 0x0

    .line 2544
    invoke-static {}, Lo/ddz;->e()Ljava/util/List;

    move-result-object v11

    .line 2545
    const/4 v12, 0x0

    :goto_3
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_7

    .line 2546
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 2547
    invoke-static {v13}, Lo/ddz;->b(Ljava/lang/String;)I

    move-result v14

    .line 2548
    const/4 v0, 0x0

    if-ne v0, v14, :cond_5

    .line 2550
    iget-object v0, p0, Lo/dea$2;->b:Lo/dea;

    invoke-static {v0}, Lo/dea;->d(Lo/dea;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxo;->d(Landroid/content/Context;)Lo/cye;

    move-result-object v10

    goto :goto_4

    .line 2552
    :cond_5
    invoke-static {}, Lo/cxo;->c()Lo/cye;

    move-result-object v10

    .line 2555
    :goto_4
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 2556
    invoke-virtual {v10, v13}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2557
    iget-object v0, p0, Lo/dea$2;->b:Lo/dea;

    invoke-static {v0}, Lo/dea;->a(Lo/dea;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 2558
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to set device time when system change."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2559
    iget-object v0, p0, Lo/dea$2;->b:Lo/dea;

    invoke-static {v0}, Lo/dea;->a(Lo/dea;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/cys;->a(Lo/cye;)V

    .line 2545
    :cond_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 2565
    :cond_7
    return-void
.end method
