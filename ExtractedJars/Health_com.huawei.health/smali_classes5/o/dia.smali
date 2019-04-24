.class public Lo/dia;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Lo/dhz;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Byte;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dia;->a:Ljava/lang/String;

    .line 43
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/dia;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dia;->e:Ljava/util/List;

    .line 47
    iput-object p1, p0, Lo/dia;->a:Ljava/lang/String;

    .line 48
    invoke-static {}, Lo/dhy;->a()Landroid/os/Looper;

    move-result-object v2

    .line 49
    if-nez v2, :cond_0

    .line 51
    const-string v0, "LogUtil_BytesLogImpl"

    const-string v1, "ThreadManager.getMainLooper null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 55
    :cond_0
    new-instance v0, Lo/dhz;

    invoke-direct {v0, v2, p0}, Lo/dhz;-><init>(Landroid/os/Looper;Lo/dia;)V

    iput-object v0, p0, Lo/dia;->d:Lo/dhz;

    .line 57
    :goto_0
    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 6

    .line 137
    if-nez p0, :cond_0

    .line 138
    const-string v0, ""

    return-object v0

    .line 140
    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 141
    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v5, v0, :cond_1

    .line 142
    const-string v0, "%02X"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aget-byte v2, p0, v5

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 141
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 144
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 145
    return-object v5
.end method

.method private b()V
    .locals 7

    .line 123
    move-object v2, p0

    monitor-enter v2

    .line 126
    :try_start_0
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 127
    new-array v4, v3, [B

    .line 128
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 129
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    aput-byte v0, v4, v5

    .line 128
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 131
    :cond_0
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 132
    iget-object v0, p0, Lo/dia;->d:Lo/dhz;

    const-string v1, "sensor"

    invoke-virtual {v0, v4, v1}, Lo/dhz;->e([BLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    .line 134
    :goto_1
    return-void
.end method

.method private b(Ljava/lang/String;[B)V
    .locals 2

    .line 83
    invoke-static {p2}, Lo/dia;->a([B)Ljava/lang/String;

    move-result-object v1

    .line 84
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    return-void
.end method

.method private c([BZ)V
    .locals 10

    .line 89
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 90
    :cond_0
    const-string v0, "LogUtil_BytesLogImpl"

    const-string v1, "saveToFile byte[] left null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    return-void

    .line 94
    :cond_1
    move-object v2, p0

    monitor-enter v2

    .line 95
    move-object v3, p1

    :try_start_0
    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-byte v6, v3, v5

    .line 96
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 98
    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7

    .line 100
    :goto_1
    if-eqz p2, :cond_3

    .line 101
    invoke-direct {p0}, Lo/dia;->b()V

    .line 102
    return-void

    .line 107
    :cond_3
    move-object v3, p0

    monitor-enter v3

    .line 108
    :try_start_1
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    const/16 v1, 0x2000

    if-lt v0, v1, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    .line 109
    :goto_2
    monitor-exit v3

    goto :goto_3

    :catchall_1
    move-exception v8

    monitor-exit v3

    throw v8

    .line 111
    :goto_3
    if-eqz v2, :cond_7

    .line 112
    move-object v3, p0

    monitor-enter v3

    .line 113
    :try_start_2
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x2000

    if-lt v0, v1, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    .line 115
    :goto_4
    if-eqz v4, :cond_6

    iget-object v0, p0, Lo/dia;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 116
    invoke-direct {p0}, Lo/dia;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 118
    :cond_6
    monitor-exit v3

    goto :goto_5

    :catchall_2
    move-exception v9

    monitor-exit v3

    throw v9

    .line 120
    :cond_7
    :goto_5
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 60
    move-object v1, p0

    monitor-enter v1

    .line 61
    :try_start_0
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 63
    :goto_0
    iget-object v0, p0, Lo/dia;->d:Lo/dhz;

    invoke-virtual {v0}, Lo/dhz;->c()V

    .line 64
    return-void
.end method

.method public e()V
    .locals 6

    .line 150
    move-object v2, p0

    monitor-enter v2

    .line 151
    :try_start_0
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    if-nez v0, :cond_0

    .line 152
    const-string v0, "LogUtil_BytesLogImpl"

    const-string v1, "logFileBuffer null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 153
    monitor-exit v2

    return-void

    .line 155
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_1

    monitor-exit v2

    return-void

    .line 156
    :cond_1
    move-object v3, p0

    :try_start_2
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 157
    :try_start_3
    iget-object v0, p0, Lo/dia;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    iget-object v0, p0, Lo/dia;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    invoke-direct {p0}, Lo/dia;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 162
    :cond_2
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_4
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 163
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v5

    monitor-exit v2

    throw v5

    .line 164
    :goto_1
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dia;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 68
    return-void
.end method

.method public e([BZ)V
    .locals 1

    .line 73
    if-eqz p1, :cond_0

    array-length v0, p1

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/dia;->a:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lo/dia;->b(Ljava/lang/String;[B)V

    .line 77
    invoke-direct {p0, p1, p2}, Lo/dia;->c([BZ)V

    .line 80
    :cond_0
    return-void
.end method
