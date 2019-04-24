.class public Lo/efj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/efj$d;,
        Lo/efj$a;,
        Lo/efj$c;
    }
.end annotation


# instance fields
.field private a:[F

.field private b:I

.field private c:[F

.field private d:Ljava/util/concurrent/ExecutorService;

.field private e:[F

.field private h:I

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/efj;->d:Ljava/util/concurrent/ExecutorService;

    .line 124
    const/4 v0, 0x0

    iput v0, p0, Lo/efj;->b:I

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lo/efj;->h:I

    .line 126
    const-string v0, ""

    iput-object v0, p0, Lo/efj;->i:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lo/efj;)[F
    .locals 1

    .line 21
    iget-object v0, p0, Lo/efj;->c:[F

    return-object v0
.end method

.method static synthetic a(Lo/efj;[F)[F
    .locals 0

    .line 21
    iput-object p1, p0, Lo/efj;->e:[F

    return-object p1
.end method

.method static synthetic b(Lo/efj;)[F
    .locals 1

    .line 21
    iget-object v0, p0, Lo/efj;->a:[F

    return-object v0
.end method

.method static synthetic c(Lo/efj;ILjava/lang/String;Lo/efj$a;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lo/efj;->d(ILjava/lang/String;Lo/efj$a;)V

    return-void
.end method

.method private declared-synchronized d(ILjava/lang/String;Lo/efj$a;)V
    .locals 3

    monitor-enter p0

    .line 129
    if-nez p3, :cond_0

    .line 130
    monitor-exit p0

    return-void

    .line 132
    :cond_0
    :try_start_0
    iget v0, p0, Lo/efj;->h:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/efj;->h:I

    .line 133
    iget v0, p0, Lo/efj;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/efj;->b:I

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/efj;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/efj;->i:Ljava/lang/String;

    .line 135
    const-string v0, "Obj3DBufferLoadAider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " onLoadThreadFinishedCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efj;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " onLoadThreadSucceedCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efj;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    iget v0, p0, Lo/efj;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/efj;->h:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 138
    new-instance v0, Lo/efj$d;

    invoke-direct {v0, p0}, Lo/efj$d;-><init>(Lo/efj;)V

    invoke-interface {p3, v0}, Lo/efj$a;->d(Lo/efj$d;)V

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/efj;->h:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/efj;->b:I

    goto :goto_0

    .line 141
    :cond_1
    iget v0, p0, Lo/efj;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget v0, p0, Lo/efj;->h:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 142
    iget-object v0, p0, Lo/efj;->i:Ljava/lang/String;

    invoke-interface {p3, v0}, Lo/efj$a;->e(Ljava/lang/String;)V

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lo/efj;->h:I

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lo/efj;->b:I

    .line 145
    const-string v0, ""

    iput-object v0, p0, Lo/efj;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic d(Lo/efj;[F)[F
    .locals 0

    .line 21
    iput-object p1, p0, Lo/efj;->c:[F

    return-object p1
.end method

.method static synthetic e(Lo/efj;)[F
    .locals 1

    .line 21
    iget-object v0, p0, Lo/efj;->e:[F

    return-object v0
.end method

.method static synthetic e(Lo/efj;[F)[F
    .locals 0

    .line 21
    iput-object p1, p0, Lo/efj;->a:[F

    return-object p1
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Lo/efj$a;)V
    .locals 12

    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 58
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 59
    new-instance v0, Lo/efj$c;

    move-object/from16 v1, p4

    const/4 v2, 0x0

    move-object/from16 v3, p5

    invoke-direct {v0, p0, v1, v2, v3}, Lo/efj$c;-><init>(Lo/efj;Ljava/io/InputStream;ILo/efj$a;)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    new-instance v0, Lo/efj$c;

    const/4 v1, 0x1

    move-object/from16 v2, p5

    invoke-direct {v0, p0, p3, v1, v2}, Lo/efj$c;-><init>(Lo/efj;Ljava/io/InputStream;ILo/efj$a;)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v0, Lo/efj$c;

    const/4 v1, 0x2

    move-object/from16 v2, p5

    invoke-direct {v0, p0, p2, v1, v2}, Lo/efj$c;-><init>(Lo/efj;Ljava/io/InputStream;ILo/efj$a;)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    :try_start_0
    iget-object v0, p0, Lo/efj;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/io/Closeable;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 v1, 0x1

    aput-object p3, v0, v1

    const/4 v1, 0x2

    aput-object p4, v0, v1

    invoke-static {v0}, Lo/efa;->c([Ljava/io/Closeable;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 72
    const-string v0, "Obj3DBufferLoadAider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Load Time="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sub-long v2, v7, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    goto/16 :goto_0

    .line 64
    :catch_0
    move-exception v7

    .line 65
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 66
    const-string v0, "Obj3DBufferLoadAider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-virtual {v7}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    move-object/from16 v2, p5

    invoke-direct {p0, v1, v0, v2}, Lo/efj;->d(ILjava/lang/String;Lo/efj$a;)V

    .line 68
    invoke-virtual {v7}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, Lo/efj$a;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/io/Closeable;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 v1, 0x1

    aput-object p3, v0, v1

    const/4 v1, 0x2

    aput-object p4, v0, v1

    invoke-static {v0}, Lo/efa;->c([Ljava/io/Closeable;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 72
    const-string v0, "Obj3DBufferLoadAider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Load Time="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sub-long v2, v7, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v9

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/io/Closeable;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 v1, 0x1

    aput-object p3, v0, v1

    const/4 v1, 0x2

    aput-object p4, v0, v1

    invoke-static {v0}, Lo/efa;->c([Ljava/io/Closeable;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 72
    const-string v0, "Obj3DBufferLoadAider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Load Time="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sub-long v2, v10, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    throw v9

    .line 74
    :goto_0
    return-void
.end method
