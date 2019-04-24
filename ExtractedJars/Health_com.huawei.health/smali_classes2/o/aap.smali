.class public Lo/aap;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static final b:Ljava/util/regex/Pattern;

.field private static c:Ljava/lang/String;

.field private static d:Z

.field private static e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    const-string v0, ""

    sput-object v0, Lo/aap;->c:Ljava/lang/String;

    .line 28
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/aap;->e:J

    .line 33
    const/4 v0, 0x1

    sput-boolean v0, Lo/aap;->a:Z

    .line 35
    const/4 v0, 0x0

    sput-boolean v0, Lo/aap;->d:Z

    .line 38
    const-string v0, "[0-9]*[a-z|A-Z]*[\u4e00-\u9fa5]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/aap;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Z)V
    .locals 6

    .line 256
    const-string v1, "HwGrsSdk"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lo/aap;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    .line 257
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    .line 294
    const-string v1, "HwGrsSdk"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x6

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lo/aap;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    .line 295
    return-void
.end method

.method public static b(Ljava/lang/String;Z)V
    .locals 6

    .line 281
    const-string v1, "HwGrsSdk"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lo/aap;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    .line 282
    return-void
.end method

.method public static c(Ljava/lang/String;Z)V
    .locals 6

    .line 206
    const-string v1, "HwGrsSdk"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lo/aap;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    .line 207
    return-void
.end method

.method private static d(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    .line 332
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    .line 269
    const-string v1, "HwGrsSdk"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x5

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lo/aap;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    .line 270
    return-void
.end method

.method private static d(Ljava/lang/String;I)Z
    .locals 5

    .line 423
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lo/aap;->e:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 426
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lo/aap;->e:J

    .line 433
    :try_start_0
    const-class v0, Lo/aap;

    const-string v1, "d"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lo/aap;->d:Z

    .line 434
    const-class v0, Lo/aap;

    const-string v1, "a"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lo/aap;->a:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 435
    goto :goto_0

    .line 436
    :catch_0
    move-exception v4

    .line 438
    const-string v0, "can not getField"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 442
    :cond_0
    :goto_0
    const/4 v0, 0x4

    if-ge p1, v0, :cond_3

    .line 444
    sget-boolean v0, Lo/aap;->d:Z

    if-nez v0, :cond_2

    sget-boolean v0, Lo/aap;->a:Z

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0

    .line 448
    :cond_3
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 483
    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p0, :cond_1

    .line 485
    :cond_0
    return-object p0

    .line 487
    :cond_1
    const-string v2, "*"

    .line 488
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 490
    const-string v0, "*"

    return-object v0

    .line 493
    :cond_2
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 494
    const-string v4, ""

    .line 495
    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_0

    .line 497
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 498
    sget-object v0, Lo/aap;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 500
    rem-int/lit8 v0, v6, 0x2

    if-nez v0, :cond_4

    .line 502
    const-string v4, "*"

    .line 504
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 507
    :cond_5
    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 495
    add-int/lit8 v5, v5, 0x1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v5, v0, :cond_3

    .line 510
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V
    .locals 6

    const-class v5, Lo/aap;

    monitor-enter v5

    .line 352
    :try_start_0
    invoke-static {p1, p0}, Lo/aap;->d(Ljava/lang/String;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 354
    monitor-exit v5

    return-void

    .line 359
    :cond_0
    :try_start_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 361
    if-eqz p5, :cond_1

    .line 363
    invoke-static {p2}, Lo/aap;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 364
    goto :goto_0

    .line 367
    :cond_1
    invoke-virtual {v3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 371
    :goto_0
    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 372
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 373
    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 374
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 375
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 378
    new-instance v0, Landroid/util/AndroidException;

    invoke-direct {v0}, Landroid/util/AndroidException;-><init>()V

    invoke-virtual {v0}, Landroid/util/AndroidException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v4

    .line 379
    array-length v0, v4

    if-le v0, p4, :cond_2

    .line 381
    const-string v0, "("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 382
    sget-object v1, Lo/aap;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 383
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 384
    aget-object v1, v4, p4

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 385
    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 386
    aget-object v1, v4, p4

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 387
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 388
    goto :goto_1

    .line 391
    :cond_2
    const-string v0, "("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    sget-object v1, Lo/aap;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/unknown source)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 395
    :goto_1
    if-eqz p3, :cond_3

    .line 397
    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {p3}, Lo/aap;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 401
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 403
    goto :goto_2

    .line 404
    :catch_0
    move-exception v3

    .line 406
    const-string v0, "can not writeLog RuntimeException"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v3, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_2

    .line 408
    :catch_1
    move-exception v3

    .line 410
    const-string v0, "can not writeLog"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 412
    :goto_2
    monitor-exit v5

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method public static e(Ljava/lang/String;Z)V
    .locals 6

    .line 231
    const-string v1, "HwGrsSdk"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lo/aap;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    .line 232
    return-void
.end method
