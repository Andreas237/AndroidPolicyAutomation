.class public final Llibcore/icu/Transliterator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {p1}, Llibcore/icu/Transliterator;->create(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Llibcore/icu/Transliterator;->b:J

    .line 13
    return-void
.end method

.method private static native create(Ljava/lang/String;)J
.end method

.method private static native destroy(J)V
.end method

.method private static native transliterate(JLjava/lang/String;)Ljava/lang/String;
.end method


# virtual methods
.method public declared-synchronized e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Llibcore/icu/Transliterator;->b:J

    invoke-static {v0, v1, p1}, Llibcore/icu/Transliterator;->transliterate(JLjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected declared-synchronized finalize()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    monitor-enter p0

    .line 20
    :try_start_0
    iget-wide v0, p0, Llibcore/icu/Transliterator;->b:J

    invoke-static {v0, v1}, Llibcore/icu/Transliterator;->destroy(J)V

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llibcore/icu/Transliterator;->b:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :try_start_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    goto :goto_1

    .line 29
    :catch_0
    move-exception v4

    .line 30
    const-string v0, "Transliterator"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    goto :goto_1

    .line 22
    :catch_1
    move-exception v4

    .line 23
    const-string v0, "Transliterator"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 28
    :try_start_4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 31
    goto :goto_1

    .line 29
    :catch_2
    move-exception v4

    .line 30
    const-string v0, "Transliterator"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 32
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v5

    .line 28
    :try_start_6
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 31
    goto :goto_0

    .line 29
    :catch_3
    move-exception v6

    .line 30
    const-string v0, "Transliterator"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    :goto_0
    throw v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 33
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v4

    monitor-exit p0

    throw v4
.end method
