.class public Lo/djf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/djf$e;,
        Lo/djf$b;,
        Lo/djf$d;
    }
.end annotation


# static fields
.field private static a:Landroid/content/SharedPreferences;

.field private static b:Z

.field private static c:Z

.field private static d:Z

.field private static e:Z

.field private static i:Lo/djd;

.field private static k:Lo/diz;


# instance fields
.field private f:Ljava/util/Date;

.field private g:Lo/djf$d;

.field private h:Landroid/net/ConnectivityManager;

.field private l:Lo/djf$e;

.field private n:Landroid/content/Context;

.field private o:Lo/djf$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    const/4 v0, 0x0

    sput-boolean v0, Lo/djf;->c:Z

    .line 61
    const/4 v0, 0x0

    sput-boolean v0, Lo/djf;->e:Z

    .line 62
    const/4 v0, 0x0

    sput-boolean v0, Lo/djf;->d:Z

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    .line 66
    const/4 v0, 0x0

    sput-boolean v0, Lo/djf;->b:Z

    .line 74
    const/4 v0, 0x0

    sput-object v0, Lo/djf;->i:Lo/djd;

    .line 77
    const/4 v0, 0x0

    sput-object v0, Lo/djf;->k:Lo/diz;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djf;->g:Lo/djf$d;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djf;->h:Landroid/net/ConnectivityManager;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djf;->f:Ljava/util/Date;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djf;->o:Lo/djf$b;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djf;->l:Lo/djf$e;

    .line 102
    iput-object p1, p0, Lo/djf;->n:Landroid/content/Context;

    .line 103
    return-void
.end method

.method static synthetic a(Lo/djf;)Lo/djf$e;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/djf;->l:Lo/djf$e;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)V
    .locals 3

    .line 583
    const-string v0, "TrafficMonitorPreferences"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    .line 584
    sget-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    const-string v1, "isOverflow3days"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lo/djf;->c:Z

    .line 585
    sget-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    const-string v1, "isReportTodayErr"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lo/djf;->e:Z

    .line 586
    sget-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    const-string v1, "isReport3DaysErr"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lo/djf;->d:Z

    .line 587
    return-void
.end method

.method private static a(Lo/djd;)V
    .locals 1

    .line 369
    sget-object v0, Lo/djf;->k:Lo/diz;

    invoke-virtual {v0, p0}, Lo/diz;->c(Lo/djd;)I

    .line 370
    return-void
.end method

.method static synthetic a(Z)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/djf;->e(Z)V

    return-void
.end method

.method static synthetic a()Z
    .locals 1

    .line 54
    sget-boolean v0, Lo/djf;->c:Z

    return v0
.end method

.method private a(Ljava/util/Date;)Z
    .locals 2

    .line 338
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    const/4 v0, 0x1

    return v0

    .line 341
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private a(Ljava/util/Date;I)Z
    .locals 5

    .line 381
    invoke-static {p1, p2}, Lo/djf;->d(Ljava/util/Date;I)Lo/djd;

    move-result-object v4

    .line 382
    if-eqz v4, :cond_1

    .line 384
    invoke-virtual {v4}, Lo/djd;->e()J

    move-result-wide v0

    const-wide/32 v2, 0x2800000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 388
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lo/djf;Ljava/util/Date;)Z
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lo/djf;->b(Ljava/util/Date;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/djd;)Lo/djd;
    .locals 0

    .line 54
    sput-object p0, Lo/djf;->i:Lo/djd;

    return-object p0
.end method

.method static synthetic b(Lo/djf;Lo/djf$b;)Lo/djf$b;
    .locals 0

    .line 54
    iput-object p1, p0, Lo/djf;->o:Lo/djf$b;

    return-object p1
.end method

.method public static b(IIJ)V
    .locals 0

    .line 364
    return-void
.end method

.method static synthetic b(Z)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/djf;->f(Z)V

    return-void
.end method

.method public static b()Z
    .locals 13

    .line 248
    invoke-static {}, Lo/djf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    const/4 v0, 0x0

    return v0

    .line 254
    :cond_0
    sget-boolean v0, Lo/djf;->b:Z

    if-nez v0, :cond_1

    .line 256
    const/4 v0, 0x0

    return v0

    .line 259
    :cond_1
    const/4 v8, 0x0

    .line 260
    const-class v9, Lo/djf;

    monitor-enter v9

    .line 262
    :try_start_0
    new-instance v0, Lo/djd;

    sget-object v1, Lo/djf;->i:Lo/djd;

    invoke-virtual {v1}, Lo/djd;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/djf;->i:Lo/djd;

    invoke-virtual {v2}, Lo/djd;->d()J

    move-result-wide v2

    sget-object v4, Lo/djf;->i:Lo/djd;

    invoke-virtual {v4}, Lo/djd;->b()J

    move-result-wide v4

    sget-object v6, Lo/djf;->i:Lo/djd;

    invoke-virtual {v6}, Lo/djd;->e()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lo/djd;-><init>(Ljava/lang/String;JJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v0

    .line 263
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v9

    throw v10

    .line 264
    :goto_0
    sget-boolean v0, Lo/djf;->c:Z

    if-eqz v0, :cond_6

    .line 267
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network traffic overflow 3 days."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    sget-boolean v0, Lo/djf;->d:Z

    if-nez v0, :cond_5

    .line 270
    const/4 v0, 0x1

    invoke-static {v0}, Lo/djf;->c(Z)V

    .line 271
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 272
    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 273
    const/4 v0, -0x1

    invoke-static {v10, v0}, Lo/djf;->d(Ljava/util/Date;I)Lo/djd;

    move-result-object v11

    .line 274
    if-eqz v11, :cond_2

    .line 277
    const-string v0, "1_date"

    invoke-virtual {v11}, Lo/djd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string v0, "1_total"

    invoke-virtual {v11}, Lo/djd;->e()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 279
    const-string v0, "1_requested"

    invoke-virtual {v11}, Lo/djd;->d()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 280
    const-string v0, "1_received"

    invoke-virtual {v11}, Lo/djd;->b()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 282
    :cond_2
    const/4 v0, -0x2

    invoke-static {v10, v0}, Lo/djf;->d(Ljava/util/Date;I)Lo/djd;

    move-result-object v11

    .line 283
    if-eqz v11, :cond_3

    .line 286
    const-string v0, "2_date"

    invoke-virtual {v11}, Lo/djd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "2_total"

    invoke-virtual {v11}, Lo/djd;->e()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 288
    const-string v0, "2_requested"

    invoke-virtual {v11}, Lo/djd;->d()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 289
    const-string v0, "2_received"

    invoke-virtual {v11}, Lo/djd;->b()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 291
    :cond_3
    const/4 v0, -0x3

    invoke-static {v10, v0}, Lo/djf;->d(Ljava/util/Date;I)Lo/djd;

    move-result-object v11

    .line 292
    if-eqz v11, :cond_4

    .line 295
    const-string v0, "3_date"

    invoke-virtual {v11}, Lo/djd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const-string v0, "3_total"

    invoke-virtual {v11}, Lo/djd;->e()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 297
    const-string v0, "3_requested"

    invoke-virtual {v11}, Lo/djd;->d()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 298
    const-string v0, "3_received"

    invoke-virtual {v11}, Lo/djd;->b()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 301
    :cond_4
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "network traffic overflow 3 days."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8da

    const/4 v3, 0x0

    invoke-static {v2, v0, v9, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 304
    :cond_5
    const/4 v0, 0x1

    return v0

    .line 306
    :cond_6
    invoke-virtual {v8}, Lo/djd;->e()J

    move-result-wide v0

    const-wide/32 v2, 0x2800000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_8

    .line 308
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network traffic overflow."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    sget-boolean v0, Lo/djf;->e:Z

    if-nez v0, :cond_7

    .line 311
    const-class v9, Lo/djf;

    monitor-enter v9

    .line 313
    const/4 v0, 0x1

    :try_start_1
    invoke-static {v0}, Lo/djf;->e(Z)V

    .line 314
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 316
    const-string v0, "today_date"

    invoke-virtual {v8}, Lo/djd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    const-string v0, "today_total"

    invoke-virtual {v8}, Lo/djd;->e()J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 318
    const-string v0, "today_requested"

    invoke-virtual {v8}, Lo/djd;->d()J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 319
    const-string v0, "today_received"

    invoke-virtual {v8}, Lo/djd;->b()J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 321
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "network traffic overflow. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8d9

    const/4 v3, 0x0

    invoke-static {v2, v0, v10, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 322
    monitor-exit v9

    goto :goto_1

    :catchall_1
    move-exception v12

    monitor-exit v9

    throw v12

    .line 324
    :cond_7
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 328
    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/util/Date;)Z
    .locals 1

    .line 404
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lo/djf;->a(Ljava/util/Date;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 405
    const/4 v0, -0x2

    invoke-direct {p0, p1, v0}, Lo/djf;->a(Ljava/util/Date;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    const/4 v0, -0x3

    invoke-direct {p0, p1, v0}, Lo/djf;->a(Ljava/util/Date;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    const/4 v0, 0x1

    return v0

    .line 412
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/djf;)Z
    .locals 1

    .line 54
    invoke-direct {p0}, Lo/djf;->f()Z

    move-result v0

    return v0
.end method

.method private static c(Ljava/util/Date;I)Ljava/lang/String;
    .locals 2

    .line 395
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 396
    invoke-virtual {v1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 397
    const/4 v0, 0x5

    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 398
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/djf;)Lo/djf$b;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/djf;->o:Lo/djf$b;

    return-object v0
.end method

.method private static c(Lo/diz;)V
    .locals 0

    .line 597
    sput-object p0, Lo/djf;->k:Lo/diz;

    .line 598
    return-void
.end method

.method private static c(Lo/djd;)V
    .locals 2

    .line 590
    const-class v0, Lo/djf;

    monitor-enter v0

    .line 591
    :try_start_0
    sput-object p0, Lo/djf;->i:Lo/djd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 592
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 593
    :goto_0
    return-void
.end method

.method private static c(Z)V
    .locals 2

    .line 563
    sput-boolean p0, Lo/djf;->d:Z

    .line 564
    sget-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 565
    const-string v0, "isReport3DaysErr"

    invoke-interface {v1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 566
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 567
    return-void
.end method

.method static synthetic c(Lo/djf;Ljava/util/Date;)Z
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lo/djf;->a(Ljava/util/Date;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/djf;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 54
    iput-object p1, p0, Lo/djf;->f:Ljava/util/Date;

    return-object p1
.end method

.method private static d(Ljava/util/Date;I)Lo/djd;
    .locals 2

    .line 374
    invoke-static {p0, p1}, Lo/djf;->c(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v1

    .line 375
    sget-object v0, Lo/djf;->k:Lo/diz;

    invoke-virtual {v0, v1}, Lo/diz;->b(Ljava/lang/String;)Lo/djd;

    move-result-object v0

    return-object v0
.end method

.method public static d(J)V
    .locals 7

    .line 606
    sget-boolean v0, Lo/djf;->b:Z

    if-nez v0, :cond_0

    .line 608
    return-void

    .line 612
    :cond_0
    const-class v5, Lo/djf;

    monitor-enter v5

    .line 613
    :try_start_0
    sget-object v0, Lo/djf;->i:Lo/djd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 614
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requesting:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    sget-object v0, Lo/djf;->i:Lo/djd;

    invoke-virtual {v0, p0, p1}, Lo/djd;->e(J)V

    .line 616
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "total:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 618
    :cond_1
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 619
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/djf;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/djf;->h()V

    return-void
.end method

.method public static d()Z
    .locals 1

    .line 104
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic d(Z)Z
    .locals 0

    .line 54
    sput-boolean p0, Lo/djf;->b:Z

    return p0
.end method

.method static synthetic e(Lo/djf;)Ljava/util/Date;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/djf;->f:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic e(Lo/djf;Lo/djf$e;)Lo/djf$e;
    .locals 0

    .line 54
    iput-object p1, p0, Lo/djf;->l:Lo/djf$e;

    return-object p1
.end method

.method public static e(J)V
    .locals 7

    .line 627
    sget-boolean v0, Lo/djf;->b:Z

    if-nez v0, :cond_0

    .line 629
    return-void

    .line 633
    :cond_0
    const-class v5, Lo/djf;

    monitor-enter v5

    .line 634
    :try_start_0
    sget-object v0, Lo/djf;->i:Lo/djd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 635
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "received:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    sget-object v0, Lo/djf;->i:Lo/djd;

    invoke-virtual {v0, p0, p1}, Lo/djd;->a(J)V

    .line 637
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "total:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 639
    :cond_1
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 640
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/djd;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/djf;->a(Lo/djd;)V

    return-void
.end method

.method private static e(Z)V
    .locals 2

    .line 555
    sput-boolean p0, Lo/djf;->e:Z

    .line 556
    sget-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 557
    const-string v0, "isReportTodayErr"

    invoke-interface {v1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 558
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 559
    return-void
.end method

.method static synthetic e()Z
    .locals 1

    .line 54
    sget-boolean v0, Lo/djf;->b:Z

    return v0
.end method

.method private static f(Z)V
    .locals 2

    .line 571
    sput-boolean p0, Lo/djf;->c:Z

    .line 572
    sget-object v0, Lo/djf;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 573
    const-string v0, "isOverflow3days"

    invoke-interface {v1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 574
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 575
    return-void
.end method

.method private f()Z
    .locals 7

    .line 211
    iget-object v0, p0, Lo/djf;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/djf;->n:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lo/djf;->h:Landroid/net/ConnectivityManager;

    .line 212
    iget-object v0, p0, Lo/djf;->h:Landroid/net/ConnectivityManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v4

    .line 213
    if-eqz v4, :cond_2

    .line 214
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v5

    .line 215
    iget-object v0, p0, Lo/djf;->h:Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v4

    .line 216
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 217
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v6

    .line 219
    if-eqz v5, :cond_0

    .line 220
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWifiConn = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x0

    return v0

    .line 222
    :cond_0
    if-eqz v6, :cond_1

    .line 223
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMobileConn = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    const/4 v0, 0x1

    return v0

    .line 226
    :cond_1
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWifiConn = false & isMobileConn = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const/4 v0, 0x0

    return v0

    .line 231
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private h()V
    .locals 6

    .line 543
    const-class v4, Lo/djf;

    monitor-enter v4

    .line 545
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Writing today traffic to DB: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    sget-object v0, Lo/djf;->i:Lo/djd;

    invoke-static {v0}, Lo/djf;->a(Lo/djd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 550
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 551
    :goto_0
    return-void
.end method

.method static synthetic i()Lo/diz;
    .locals 1

    .line 54
    sget-object v0, Lo/djf;->k:Lo/diz;

    return-object v0
.end method

.method static synthetic k()Lo/djd;
    .locals 1

    .line 54
    sget-object v0, Lo/djf;->i:Lo/djd;

    return-object v0
.end method

.method private static k(Z)V
    .locals 0

    .line 578
    sput-boolean p0, Lo/djf;->b:Z

    .line 579
    return-void
.end method


# virtual methods
.method public c()V
    .locals 7

    .line 109
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Lo/djf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate, BuildConfig.IS_TRAFFIC_LIMITED == false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    return-void

    .line 117
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lo/djf;->f:Ljava/util/Date;

    .line 120
    iget-object v0, p0, Lo/djf;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/djf;->a(Landroid/content/Context;)V

    .line 123
    new-instance v0, Lo/diz;

    iget-object v1, p0, Lo/djf;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/diz;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lo/djf;->c(Lo/diz;)V

    .line 125
    sget-boolean v0, Lo/djf;->c:Z

    if-nez v0, :cond_1

    .line 128
    iget-object v0, p0, Lo/djf;->f:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/djf;->b(Ljava/util/Date;)Z

    move-result v5

    .line 129
    invoke-static {v5}, Lo/djf;->f(Z)V

    .line 134
    :cond_1
    const-class v5, Lo/djf;

    monitor-enter v5

    .line 137
    :try_start_0
    sget-object v0, Lo/djf;->k:Lo/diz;

    iget-object v1, p0, Lo/djf;->f:Ljava/util/Date;

    invoke-static {v1}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/diz;->b(Ljava/lang/String;)Lo/djd;

    move-result-object v0

    invoke-static {v0}, Lo/djf;->c(Lo/djd;)V

    .line 138
    sget-object v0, Lo/djf;->i:Lo/djd;

    if-nez v0, :cond_2

    .line 140
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init today traffic with 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    new-instance v0, Lo/djd;

    iget-object v1, p0, Lo/djf;->f:Ljava/util/Date;

    invoke-static {v1}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/djd;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/djf;->c(Lo/djd;)V

    .line 143
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "->1->--->todayStat is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " todarStat is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    sget-object v0, Lo/djf;->k:Lo/diz;

    sget-object v1, Lo/djf;->i:Lo/djd;

    invoke-virtual {v0, v1}, Lo/diz;->a(Lo/djd;)J

    .line 145
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "->2->--->todayStat is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " todarStat is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    :cond_2
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "->3->--->todayStat is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " todarStat is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/djf;->i:Lo/djd;

    invoke-virtual {v3}, Lo/djd;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 152
    :goto_0
    new-instance v0, Lo/djf$b;

    invoke-direct {v0, p0}, Lo/djf$b;-><init>(Lo/djf;)V

    iput-object v0, p0, Lo/djf;->o:Lo/djf$b;

    .line 153
    new-instance v0, Lo/djf$e;

    invoke-direct {v0, p0}, Lo/djf$e;-><init>(Lo/djf;)V

    iput-object v0, p0, Lo/djf;->l:Lo/djf$e;

    .line 156
    invoke-direct {p0}, Lo/djf;->f()Z

    move-result v0

    invoke-static {v0}, Lo/djf;->k(Z)V

    .line 157
    sget-boolean v0, Lo/djf;->b:Z

    if-eqz v0, :cond_3

    .line 163
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start refresh thread."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    sget-boolean v0, Lo/djf;->c:Z

    if-nez v0, :cond_3

    .line 166
    iget-object v0, p0, Lo/djf;->o:Lo/djf$b;

    invoke-virtual {v0}, Lo/djf$b;->start()V

    .line 171
    :cond_3
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 172
    new-instance v0, Lo/djf$d;

    invoke-direct {v0, p0}, Lo/djf$d;-><init>(Lo/djf;)V

    iput-object v0, p0, Lo/djf;->g:Lo/djf$d;

    .line 173
    iget-object v0, p0, Lo/djf;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/djf;->g:Lo/djf$d;

    invoke-virtual {v0, v1, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 174
    return-void
.end method
