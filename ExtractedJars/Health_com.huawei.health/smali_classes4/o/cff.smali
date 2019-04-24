.class public Lo/cff;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cff$b;,
        Lo/cff$a;
    }
.end annotation


# instance fields
.field private a:J

.field private b:[Lo/cff$a;

.field private c:I

.field private d:J

.field private e:J

.field private f:I

.field private g:I

.field private h:I

.field private i:Lo/cff$b;

.field private k:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/16 v0, 0xa

    iput v0, p0, Lo/cff;->c:I

    .line 14
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/cff;->a:J

    .line 15
    iget-wide v0, p0, Lo/cff;->a:J

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cff;->d:J

    .line 16
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/cff;->e:J

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/cff;->g:I

    const/4 v0, -0x1

    iput v0, p0, Lo/cff;->h:I

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/cff;->f:I

    .line 20
    new-instance v0, Lo/cff$b;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/cff$b;-><init>(JF)V

    iput-object v0, p0, Lo/cff;->i:Lo/cff$b;

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cff;->k:J

    .line 25
    iget v0, p0, Lo/cff;->c:I

    new-array v0, v0, [Lo/cff$a;

    iput-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    .line 26
    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 4

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/16 v0, 0xa

    iput v0, p0, Lo/cff;->c:I

    .line 14
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/cff;->a:J

    .line 15
    iget-wide v0, p0, Lo/cff;->a:J

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cff;->d:J

    .line 16
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/cff;->e:J

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/cff;->g:I

    const/4 v0, -0x1

    iput v0, p0, Lo/cff;->h:I

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/cff;->f:I

    .line 20
    new-instance v0, Lo/cff$b;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/cff$b;-><init>(JF)V

    iput-object v0, p0, Lo/cff;->i:Lo/cff$b;

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cff;->k:J

    .line 29
    iput p1, p0, Lo/cff;->c:I

    .line 30
    new-array v0, p1, [Lo/cff$a;

    iput-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    .line 31
    iput-wide p2, p0, Lo/cff;->a:J

    .line 32
    iget-wide v0, p0, Lo/cff;->a:J

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cff;->d:J

    .line 33
    return-void
.end method

.method private a()V
    .locals 6

    .line 82
    iget-object v4, p0, Lo/cff;->b:[Lo/cff$a;

    monitor-enter v4

    .line 83
    const-string v0, "Track_SmoothTimeSpeedQueue"

    const/4 v1, 0x3

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string v2, " clear queue at "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, -0x1

    iput v0, p0, Lo/cff;->h:I

    .line 85
    const/4 v0, 0x0

    iput v0, p0, Lo/cff;->g:I

    .line 86
    const/4 v0, 0x0

    iput v0, p0, Lo/cff;->f:I

    .line 87
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    const/4 v1, 0x0

    iput v1, v0, Lo/cff$b;->d:F

    .line 88
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lo/cff$b;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 90
    :goto_0
    return-void
.end method

.method public static b(J)D
    .locals 4

    .line 149
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    .line 150
    const-wide/16 v0, 0x0

    return-wide v0

    .line 152
    :cond_0
    long-to-double v0, p0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 123
    invoke-direct {p0}, Lo/cff;->a()V

    .line 124
    return-void
.end method

.method public c(JI)V
    .locals 11

    .line 36
    iget-wide v0, p0, Lo/cff;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cff;->k:J

    .line 39
    :cond_0
    iget-object v7, p0, Lo/cff;->b:[Lo/cff$a;

    monitor-enter v7

    .line 42
    :try_start_0
    iget v0, p0, Lo/cff;->f:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    iget v1, p0, Lo/cff;->h:I

    aget-object v0, v0, v1

    iget-wide v0, v0, Lo/cff$a;->b:J

    sub-long v0, p1, v0

    iget-wide v2, p0, Lo/cff;->d:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 43
    invoke-direct {p0}, Lo/cff;->a()V

    .line 45
    :cond_1
    const-string v0, "Track_SmoothTimeSpeedQueue"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string v2, " rear = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lo/cff;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " front = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget v2, p0, Lo/cff;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " size = "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget v2, p0, Lo/cff;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " time = "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " distance = "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iget v0, p0, Lo/cff;->h:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lo/cff;->c:I

    rem-int/2addr v0, v1

    iput v0, p0, Lo/cff;->h:I

    .line 48
    new-instance v8, Lo/cff$a;

    invoke-direct {v8, p1, p2, p3}, Lo/cff$a;-><init>(JI)V

    .line 49
    iget-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    iget v1, p0, Lo/cff;->h:I

    aput-object v8, v0, v1

    .line 50
    iget v0, p0, Lo/cff;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cff;->f:I

    .line 53
    :goto_0
    iget v0, p0, Lo/cff;->f:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    iget v1, p0, Lo/cff;->h:I

    aget-object v0, v0, v1

    iget-wide v0, v0, Lo/cff$a;->b:J

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->g:I

    aget-object v2, v2, v3

    iget-wide v2, v2, Lo/cff$a;->b:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lo/cff;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 55
    iget v0, p0, Lo/cff;->g:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lo/cff;->c:I

    rem-int v9, v0, v1

    .line 57
    iget-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    iget v1, p0, Lo/cff;->h:I

    aget-object v0, v0, v1

    iget-wide v0, v0, Lo/cff$a;->b:J

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    aget-object v2, v2, v9

    iget-wide v2, v2, Lo/cff$a;->b:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lo/cff;->a:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 58
    iput v9, p0, Lo/cff;->g:I

    .line 59
    iget v0, p0, Lo/cff;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/cff;->f:I

    .line 63
    goto :goto_0

    .line 66
    :cond_2
    iget v0, p0, Lo/cff;->f:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    iget v1, p0, Lo/cff;->h:I

    aget-object v0, v0, v1

    iget-wide v0, v0, Lo/cff$a;->b:J

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->g:I

    aget-object v2, v2, v3

    iget-wide v2, v2, Lo/cff$a;->b:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lo/cff;->a:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    .line 67
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iput-wide p1, v0, Lo/cff$b;->e:J

    .line 68
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iget-object v1, p0, Lo/cff;->b:[Lo/cff$a;

    iget v2, p0, Lo/cff;->h:I

    aget-object v1, v1, v2

    iget v1, v1, Lo/cff$a;->d:I

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->g:I

    aget-object v2, v2, v3

    iget v2, v2, Lo/cff$a;->d:I

    sub-int/2addr v1, v2

    int-to-double v1, v1

    iget-object v3, p0, Lo/cff;->b:[Lo/cff$a;

    iget v4, p0, Lo/cff;->h:I

    aget-object v3, v3, v4

    iget-wide v3, v3, Lo/cff$a;->b:J

    iget-object v5, p0, Lo/cff;->b:[Lo/cff$a;

    iget v6, p0, Lo/cff;->g:I

    aget-object v5, v5, v6

    iget-wide v5, v5, Lo/cff$a;->b:J

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Lo/cff;->b(J)D

    move-result-wide v3

    div-double/2addr v1, v3

    const-wide v3, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v1, v3

    double-to-float v1, v1

    iput v1, v0, Lo/cff$b;->d:F

    goto :goto_1

    .line 70
    :cond_3
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iput-wide p1, v0, Lo/cff$b;->e:J

    .line 71
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    const/4 v1, 0x0

    iput v1, v0, Lo/cff$b;->d:F

    .line 75
    :goto_1
    const-string v0, "Track_SmoothTimeSpeedQueue"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string v2, " after rear = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->h:I

    aget-object v2, v2, v3

    iget-wide v2, v2, Lo/cff$a;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " front = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->g:I

    aget-object v2, v2, v3

    iget-wide v2, v2, Lo/cff$a;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " size = "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget v2, p0, Lo/cff;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " diff = "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->h:I

    aget-object v2, v2, v3

    iget-wide v2, v2, Lo/cff$a;->b:J

    iget-object v4, p0, Lo/cff;->b:[Lo/cff$a;

    iget v5, p0, Lo/cff;->g:I

    aget-object v4, v4, v5

    iget-wide v4, v4, Lo/cff$a;->b:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v7

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v7

    throw v10

    .line 79
    :goto_2
    return-void
.end method

.method public e()F
    .locals 11

    .line 94
    iget-object v5, p0, Lo/cff;->b:[Lo/cff$a;

    monitor-enter v5

    .line 95
    :try_start_0
    iget v0, p0, Lo/cff;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 96
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 99
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 101
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iget-wide v0, v0, Lo/cff$b;->e:J

    sub-long v0, v6, v0

    iget-wide v2, p0, Lo/cff;->e:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 102
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 105
    :cond_1
    :try_start_2
    iget-object v0, p0, Lo/cff;->b:[Lo/cff$a;

    iget v1, p0, Lo/cff;->h:I

    aget-object v0, v0, v1

    iget-wide v0, v0, Lo/cff$a;->b:J

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->g:I

    aget-object v2, v2, v3

    iget-wide v2, v2, Lo/cff$a;->b:J

    sub-long v8, v0, v2

    .line 107
    iget-wide v0, p0, Lo/cff;->k:J

    sub-long v0, v6, v0

    iget-wide v2, p0, Lo/cff;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    iget-wide v0, p0, Lo/cff;->k:J

    sub-long v0, v6, v0

    iget-wide v2, p0, Lo/cff;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 108
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iput-wide v6, v0, Lo/cff$b;->e:J

    .line 109
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iget-object v1, p0, Lo/cff;->b:[Lo/cff$a;

    iget v2, p0, Lo/cff;->h:I

    aget-object v1, v1, v2

    iget v1, v1, Lo/cff$a;->d:I

    iget-object v2, p0, Lo/cff;->b:[Lo/cff$a;

    iget v3, p0, Lo/cff;->g:I

    aget-object v2, v2, v3

    iget v2, v2, Lo/cff$a;->d:I

    sub-int/2addr v1, v2

    int-to-double v1, v1

    invoke-static {v8, v9}, Lo/cff;->b(J)D

    move-result-wide v3

    div-double/2addr v1, v3

    const-wide v3, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v1, v3

    double-to-float v1, v1

    iput v1, v0, Lo/cff$b;->d:F

    .line 110
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iget v0, v0, Lo/cff$b;->d:F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v5

    return v0

    .line 113
    :cond_2
    :try_start_3
    iget-wide v0, p0, Lo/cff;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    cmp-long v0, v8, v0

    if-gez v0, :cond_3

    .line 114
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 117
    :cond_3
    :try_start_4
    iget-object v0, p0, Lo/cff;->i:Lo/cff$b;

    iget v0, v0, Lo/cff$b;->d:F
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v5

    return v0

    .line 118
    :catchall_0
    move-exception v10

    monitor-exit v5

    throw v10
.end method
