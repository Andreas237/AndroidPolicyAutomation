.class public Lo/abo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public b:Lo/amf;

.field private d:Landroid/content/Context;

.field private e:Lo/amk;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abo;->b:Lo/amf;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abo;->e:Lo/amk;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abo;->d:Landroid/content/Context;

    .line 32
    iput-object p1, p0, Lo/abo;->d:Landroid/content/Context;

    .line 33
    new-instance v0, Lo/amf;

    iget-object v1, p0, Lo/abo;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/amf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abo;->b:Lo/amf;

    .line 34
    new-instance v0, Lo/amk;

    iget-object v1, p0, Lo/abo;->d:Landroid/content/Context;

    const-string v2, "StepCounterFileCache"

    invoke-direct {v0, v1, v2}, Lo/amk;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lo/abo;->e:Lo/amk;

    .line 35
    invoke-direct {p0}, Lo/abo;->k()V

    .line 36
    return-void
.end method

.method private k()V
    .locals 12

    .line 72
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCacheFromFile enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v7

    .line 77
    iget-object v9, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v9

    .line 80
    :try_start_0
    iget-object v0, p0, Lo/abo;->e:Lo/amk;

    iget-object v1, p0, Lo/abo;->d:Landroid/content/Context;

    iget-object v2, p0, Lo/abo;->b:Lo/amf;

    move-wide v3, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual/range {v0 .. v6}, Lo/amk;->c(Landroid/content/Context;Lo/ami;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    goto :goto_0

    .line 81
    :catch_0
    move-exception v10

    .line 82
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMemoryFromFile error: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :goto_0
    monitor-exit v9

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v9

    throw v11

    .line 85
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 88
    iget-object v4, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v4

    .line 89
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->e()Landroid/util/SparseArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 93
    :try_start_1
    iget-object v0, p0, Lo/abo;->e:Lo/amk;

    iget-object v1, p0, Lo/abo;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, v5}, Lo/amk;->d(Landroid/content/Context;Landroid/util/SparseArray;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    goto :goto_0

    .line 94
    :catch_0
    move-exception v6

    .line 95
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushMemoryCacheToFile error: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 98
    :goto_1
    return-void
.end method

.method public a(IJIII)V
    .locals 12

    .line 42
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    if-nez v0, :cond_0

    .line 43
    return-void

    .line 47
    :cond_0
    move/from16 v7, p6

    .line 49
    iget-object v8, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v8

    .line 50
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0, p2, p3}, Lo/amf;->b(J)Lo/amd;

    move-result-object v9

    .line 52
    if-eqz v9, :cond_1

    .line 53
    invoke-virtual {v9}, Lo/amd;->h()I

    move-result v0

    invoke-static {v0}, Lo/ams;->c(I)I

    move-result v0

    move/from16 v1, p6

    invoke-static {v0, v1}, Lo/ams;->a(II)I

    move-result v10

    .line 54
    move/from16 v0, p4

    move/from16 v1, p5

    invoke-virtual {v9, v0, v1}, Lo/amd;->b(II)V

    .line 55
    invoke-static {v10}, Lo/ams;->d(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/amd;->b(I)V

    .line 56
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0, v9}, Lo/amf;->d(Lo/amd;)V

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    move v1, p1

    move-wide v2, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-static/range {p6 .. p6}, Lo/ams;->d(I)I

    move-result v6

    invoke-virtual/range {v0 .. v6}, Lo/amf;->d(IJIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :goto_0
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v8

    throw v11

    .line 68
    :goto_1
    return-void
.end method

.method public b(I)Lo/amd;
    .locals 7

    .line 192
    iget-object v5, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v5

    .line 193
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    int-to-long v1, p1

    const-wide/32 v3, 0xea60

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lo/amf;->b(J)Lo/amd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v5

    return-object v0

    .line 194
    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6
.end method

.method public b()V
    .locals 3

    .line 144
    iget-object v1, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v1

    .line 145
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 147
    :goto_0
    return-void
.end method

.method public c()D
    .locals 9

    .line 125
    const/4 v4, 0x0

    .line 126
    iget-object v5, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v5

    .line 127
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->e()Landroid/util/SparseArray;

    move-result-object v6

    .line 128
    if-nez v6, :cond_0

    .line 129
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateCaloriesWithCache datas == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    monitor-exit v5

    const-wide/16 v0, 0x0

    return-wide v0

    .line 133
    :cond_0
    const/4 v7, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 134
    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    int-to-double v0, v4

    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/amd;

    invoke-static {}, Lo/ana;->c()Lo/ana;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/amd;->d(Lo/ana;)D
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-int v4, v0

    .line 133
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 138
    :cond_2
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 139
    :goto_1
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateCaloriesWithCache totalCalories="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    int-to-double v0, v4

    return-wide v0
.end method

.method public d()V
    .locals 7

    .line 101
    iget-object v4, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v4

    .line 102
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    :try_start_1
    iget-object v0, p0, Lo/abo;->e:Lo/amk;

    iget-object v1, p0, Lo/abo;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/amk;->d(Landroid/content/Context;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    goto :goto_0

    .line 107
    :catch_0
    move-exception v5

    .line 108
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepDataFileCache.clear error: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 111
    :goto_1
    return-void
.end method

.method public d(Landroid/util/SparseArray;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Lo/amd;>;)V"
        }
    .end annotation

    .line 199
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processCompenSateData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-object v4, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v4

    .line 201
    if-eqz p1, :cond_4

    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->e()Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 203
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 204
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/amd;

    invoke-virtual {v1}, Lo/amd;->b()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/amf;->e(I)Lo/amd;

    move-result-object v6

    .line 205
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/amd;

    .line 207
    invoke-virtual {v7}, Lo/amd;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    goto :goto_1

    .line 211
    :cond_0
    if-eqz v6, :cond_1

    invoke-virtual {v7, v6}, Lo/amd;->e(Lo/amd;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 212
    :cond_1
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0, v7}, Lo/amf;->d(Lo/amd;)V

    .line 203
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 215
    :cond_3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 217
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/amd;

    invoke-virtual {v1}, Lo/amd;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/amf;->e(J)V

    goto :goto_2

    .line 220
    :cond_4
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processCompenSateData array="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " cache.size="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v2}, Lo/amf;->e()Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    :cond_5
    :goto_2
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 223
    :goto_3
    return-void
.end method

.method public e()I
    .locals 3

    .line 167
    iget-object v1, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v1

    .line 168
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->b()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 169
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public e(Ljava/lang/String;)V
    .locals 3

    .line 154
    iget-object v1, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v1

    .line 155
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0, p1}, Lo/amf;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 157
    :goto_0
    return-void
.end method

.method public e(Lo/amf$e;)V
    .locals 3

    .line 160
    iget-object v1, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v1

    .line 161
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0, p1}, Lo/amf;->d(Lo/amf$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 163
    :goto_0
    return-void
.end method

.method public g()D
    .locals 9

    .line 173
    const/4 v4, 0x0

    .line 174
    iget-object v5, p0, Lo/abo;->b:Lo/amf;

    monitor-enter v5

    .line 175
    :try_start_0
    iget-object v0, p0, Lo/abo;->b:Lo/amf;

    invoke-virtual {v0}, Lo/amf;->e()Landroid/util/SparseArray;

    move-result-object v6

    .line 176
    if-nez v6, :cond_0

    .line 177
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateAltitudeWithCache datas == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    monitor-exit v5

    const-wide/16 v0, 0x0

    return-wide v0

    .line 181
    :cond_0
    const/4 v7, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 182
    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->i()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    add-int/2addr v4, v0

    .line 181
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 186
    :cond_2
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 187
    :goto_1
    const-string v0, "Step_ExtSDM"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateAltitudeWithCache totalAltitude="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    int-to-double v0, v4

    return-wide v0
.end method
