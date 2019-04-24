.class public Lo/bta;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile c:Lo/bta;


# instance fields
.field private a:[Ljava/lang/String;

.field private b:[Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:[Ljava/lang/String;

.field private g:[Ljava/lang/String;

.field private i:[Ljava/lang/String;

.field private k:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-object v0, Lo/bta;->c:Lo/bta;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bta;->b:[Ljava/lang/String;

    .line 37
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lo/bta;->i(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bta;->a:[Ljava/lang/String;

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lo/bta;->i(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bta;->k:[Ljava/lang/String;

    .line 40
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lo/bta;->o(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bta;->i:[Ljava/lang/String;

    .line 41
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lo/bta;->o(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bta;->f:[Ljava/lang/String;

    .line 42
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lo/bta;->o(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bta;->g:[Ljava/lang/String;

    .line 44
    invoke-direct {p0}, Lo/bta;->l()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bta;->e:Ljava/lang/String;

    .line 45
    invoke-direct {p0}, Lo/bta;->p()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bta;->d:Ljava/lang/String;

    .line 46
    return-void
.end method

.method private declared-synchronized a(III)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 338
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    const/4 v0, 0x3

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 339
    const-string v0, "action"

    const-string v1, "getWorkoutList"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    const-string v0, "pageStart"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    const-string v0, "pageSize"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    const-string v0, "supportWear"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
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

.method private a(Ljava/lang/String;)Z
    .locals 1

    .line 130
    iget-object v0, p0, Lo/bta;->b:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bta;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b([Ljava/lang/String;)J
    .locals 8

    .line 110
    const-wide/16 v2, 0x0

    .line 111
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 112
    invoke-direct {p0, v7}, Lo/bta;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->b(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long/2addr v2, v0

    .line 111
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 114
    :cond_0
    return-wide v2
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 661
    invoke-direct {p0}, Lo/bta;->t()Landroid/content/SharedPreferences;

    move-result-object v4

    .line 662
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v5

    .line 663
    if-nez v5, :cond_0

    .line 664
    const-string v0, "DataUpdateHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "key="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "value="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 15

    .line 135
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v7

    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 138
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v8

    .line 140
    :cond_0
    iget-object v0, p0, Lo/bta;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bta;->d:Ljava/lang/String;

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lo/bta;->d:Ljava/lang/String;

    if-nez v0, :cond_3

    if-eqz v8, :cond_3

    .line 142
    :cond_2
    iput-object v8, p0, Lo/bta;->d:Ljava/lang/String;

    .line 143
    invoke-direct {p0}, Lo/bta;->p()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bta;->d:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/bta;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p0}, Lo/bta;->a()V

    .line 147
    :cond_3
    invoke-static {}, Lo/brx;->d()Ljava/lang/String;

    move-result-object v9

    .line 148
    iget-object v0, p0, Lo/bta;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/bta;->e:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p0, Lo/bta;->e:Ljava/lang/String;

    if-nez v0, :cond_6

    if-eqz v9, :cond_6

    .line 150
    :cond_5
    iput-object v9, p0, Lo/bta;->e:Ljava/lang/String;

    .line 151
    invoke-direct {p0}, Lo/bta;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bta;->e:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/bta;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p0}, Lo/bta;->a()V

    .line 155
    :cond_6
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lo/bta;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 156
    const/4 v11, 0x0

    .line 157
    if-eqz v10, :cond_7

    .line 158
    const-string v0, "_"

    invoke-virtual {v10, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 161
    :cond_7
    if-eqz v11, :cond_8

    array-length v0, v11

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    .line 162
    :cond_8
    const/4 v0, 0x1

    return v0

    .line 165
    :cond_9
    const/4 v0, 0x0

    aget-object v0, v11, v0

    invoke-static {v0}, Lo/caj;->b(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v12

    .line 166
    const/4 v0, 0x1

    aget-object v0, v11, v0

    invoke-static {v0}, Lo/caj;->b(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v13

    .line 168
    move-object v0, p0

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-object/from16 v5, p2

    invoke-direct {p0, v5}, Lo/bta;->b([Ljava/lang/String;)J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lo/bta;->d(JJJ)Z

    move-result v14

    .line 169
    const-string v0, "DataUpdateHelper"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, " isNeedUpdate "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    return v14
.end method

.method private declared-synchronized c(II)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 491
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 492
    const-string v0, "action"

    const-string v1, "getFinishedPlans"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    const-string v0, "pageStart"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    const-string v0, "pageSize"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
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

.method private declared-synchronized c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 416
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 417
    const-string v0, "action"

    const-string v1, "getWorkoutInfo"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    const-string v0, "workoutId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    const-string v0, "sex"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    const-string v0, "version"

    invoke-interface {v2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
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

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lo/bta;->b:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bta;->e(Ljava/lang/String;[Ljava/lang/String;)V

    .line 123
    return-void
.end method

.method private d(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, p2}, Lo/bta;->b([Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()Lo/bta;
    .locals 4

    .line 49
    sget-object v0, Lo/bta;->c:Lo/bta;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 50
    const-class v2, Lo/bst;

    monitor-enter v2

    .line 51
    :try_start_0
    sget-object v0, Lo/bta;->c:Lo/bta;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 52
    new-instance v0, Lo/bta;

    invoke-direct {v0}, Lo/bta;-><init>()V

    sput-object v0, Lo/bta;->c:Lo/bta;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 56
    :cond_1
    :goto_0
    sget-object v0, Lo/bta;->c:Lo/bta;

    return-object v0
.end method

.method private d(JJJ)Z
    .locals 8

    .line 180
    const-string v0, "DataUpdateHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastUpdateTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",lastVersion:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",limitVersion:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bxz;->b(J)J

    move-result-wide v4

    .line 182
    sub-long v6, v4, p1

    .line 185
    const-wide/16 v0, 0xe10

    cmp-long v0, v6, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-ltz v0, :cond_0

    cmp-long v0, p3, p5

    if-eqz v0, :cond_1

    .line 186
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 188
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized e(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 324
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 325
    const-string v0, "action"

    const-string v1, "getWorkoutList"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    const-string v0, "pageStart"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v0, "pageSize"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const-string v0, "supportWear"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    const-string v0, "classList"

    invoke-direct {p0, p4}, Lo/bta;->e([Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    const-string v0, "trainingPoints"

    invoke-direct {p0, p5}, Lo/bta;->e([Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    const-string v0, "difficulty"

    invoke-direct {p0, p6}, Lo/bta;->e([Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    const-string v0, "equipments"

    invoke-direct {p0, p7}, Lo/bta;->e([Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    const-string v0, "my"

    invoke-static {p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
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

.method private declared-synchronized e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 425
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 426
    const-string v0, "action"

    const-string v1, "getWorkoutInfo"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    const-string v0, "workoutId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    const-string v0, "sex"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    const-string v0, "version"

    invoke-interface {v2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    const-string v0, "language"

    invoke-interface {v2, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
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

.method private e([Ljava/lang/Integer;)Ljava/util/List;
    .locals 1

    .line 348
    if-nez p1, :cond_0

    .line 349
    const/4 v0, 0x0

    return-object v0

    .line 352
    :cond_0
    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 353
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bxz;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lo/bta;->d(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bta;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    return-void
.end method

.method private declared-synchronized f(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 458
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 459
    const-string v0, "action"

    const-string v1, "getGetPlanProgress"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    const-string v0, "planId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
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

.method private g(II)Ljava/lang/String;
    .locals 3

    .line 608
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 609
    const-string v0, "key"

    const-string v1, "getWorkoutsByTopicIdKey"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    const-string v0, "topicId"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    const-string v0, "pageNum"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 5

    .line 196
    invoke-direct {p0, p1}, Lo/bta;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->b(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v4

    .line 197
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bta;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    return-void
.end method

.method private h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 669
    invoke-direct {p0}, Lo/bta;->t()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 670
    const-string v0, ""

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 671
    return-object v2
.end method

.method private i(I)Ljava/lang/String;
    .locals 1

    .line 64
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 65
    const-string v0, "getLimitJoinedWorkoutListKey"

    return-object v0

    .line 67
    :cond_0
    const-string v0, "getLimitRecoWorkoutListKey"

    return-object v0
.end method

.method private i(Ljava/lang/String;)V
    .locals 1

    .line 192
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bta;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    return-void
.end method

.method private k(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 578
    new-instance v2, Ljava/util/HashMap;

    const/4 v0, 0x2

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 579
    const-string v0, "action"

    const-string v1, "getQueryTrainCountByWorkoutId"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    const-string v0, "workoutId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private l()Ljava/lang/String;
    .locals 1

    .line 102
    const-string v0, "getLanguage"

    return-object v0
.end method

.method private l(I)Ljava/lang/String;
    .locals 3

    .line 594
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 595
    const-string v0, "key"

    const-string v1, "getFitnessCourseTopicListKey"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    const-string v0, "pageNum"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private m()Ljava/lang/String;
    .locals 1

    .line 231
    const-string v0, "getWorkoutFilters"

    return-object v0
.end method

.method private m(I)[Ljava/lang/String;
    .locals 1

    .line 82
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/bta;->k:[Ljava/lang/String;

    return-object v0

    .line 85
    :cond_0
    iget-object v0, p0, Lo/bta;->a:[Ljava/lang/String;

    return-object v0
.end method

.method private n()Ljava/lang/String;
    .locals 1

    .line 60
    const-string v0, "getLimitAllKey"

    return-object v0
.end method

.method private n(I)Ljava/lang/String;
    .locals 3

    .line 601
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 602
    const-string v0, "key"

    const-string v1, "getNeedUpdateFitTopicIdListKey"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    const-string v0, "topicId"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private o(I)Ljava/lang/String;
    .locals 1

    .line 71
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 72
    const-string v0, "getLimitDownloadWorkoutListKey"

    return-object v0

    .line 73
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 74
    const-string v0, "getLimitCollectionWorkoutListKey"

    return-object v0

    .line 75
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_2

    .line 76
    const-string v0, "getLimitUseWorkoutListKey"

    return-object v0

    .line 78
    :cond_2
    const-string v0, "getLimitWorkoutUserListKeyOther"

    return-object v0
.end method

.method private p()Ljava/lang/String;
    .locals 1

    .line 106
    const-string v0, "getHuid"

    return-object v0
.end method

.method private p(I)[Ljava/lang/String;
    .locals 1

    .line 90
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 91
    iget-object v0, p0, Lo/bta;->i:[Ljava/lang/String;

    return-object v0

    .line 92
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 93
    iget-object v0, p0, Lo/bta;->f:[Ljava/lang/String;

    return-object v0

    .line 94
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_2

    .line 95
    iget-object v0, p0, Lo/bta;->g:[Ljava/lang/String;

    return-object v0

    .line 97
    :cond_2
    iget-object v0, p0, Lo/bta;->i:[Ljava/lang/String;

    return-object v0
.end method

.method private q()Ljava/lang/String;
    .locals 1

    .line 570
    const-string v0, "getUserBestRecords"

    return-object v0
.end method

.method private r()Ljava/lang/String;
    .locals 1

    .line 362
    const-string v0, "getWorkoutList"

    return-object v0
.end method

.method private s()Ljava/lang/String;
    .locals 1

    .line 531
    const-string v0, "getCurrentPlan"

    return-object v0
.end method

.method private t()Landroid/content/SharedPreferences;
    .locals 3

    .line 675
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "fit_DataUpdateHelper"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method private t(I)Ljava/lang/String;
    .locals 3

    .line 616
    new-instance v2, Ljava/util/HashMap;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 617
    const-string v0, "key"

    const-string v1, "getOperationPageKey"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    const-string v0, "pageType"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private u()Ljava/lang/String;
    .locals 1

    .line 574
    const-string v0, "getTrainBestRecords"

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 204
    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->g(Ljava/lang/String;)V

    .line 205
    return-void
.end method

.method public a(II)V
    .locals 4

    .line 633
    invoke-direct {p0, p1, p2}, Lo/bta;->g(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, p2}, Lo/bta;->n(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo/bta;->e(Ljava/lang/String;[Ljava/lang/String;)V

    .line 634
    return-void
.end method

.method public a(I)Z
    .locals 2

    .line 261
    invoke-direct {p0}, Lo/bta;->r()Ljava/lang/String;

    move-result-object v1

    .line 262
    invoke-direct {p0, p1}, Lo/bta;->m(I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lo/bta;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 386
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bta;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    .line 222
    invoke-direct {p0}, Lo/bta;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 223
    return-void
.end method

.method public b(I)V
    .locals 4

    .line 299
    const-string v0, "DataUpdateHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNeedUpdateWorkoutList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-direct {p0, p1}, Lo/bta;->i(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->g(Ljava/lang/String;)V

    .line 301
    invoke-direct {p0}, Lo/bta;->r()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/bta;->m(I)[Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/bta;->e(Ljava/lang/String;[Ljava/lang/String;)V

    .line 302
    return-void
.end method

.method public b(II)V
    .locals 1

    .line 481
    invoke-direct {p0, p1, p2}, Lo/bta;->c(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 482
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 403
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bta;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 404
    return-void
.end method

.method public b(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)Z
    .locals 2

    .line 248
    invoke-direct/range {p0 .. p8}, Lo/bta;->e(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)Ljava/lang/String;

    move-result-object v1

    .line 249
    invoke-direct {p0, p8}, Lo/bta;->m(I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lo/bta;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    .line 440
    invoke-direct {p0, p1}, Lo/bta;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c(III)V
    .locals 2

    .line 289
    invoke-direct {p0, p1, p2, p3}, Lo/bta;->a(III)Ljava/lang/String;

    move-result-object v1

    .line 290
    invoke-direct {p0, p3}, Lo/bta;->p(I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lo/bta;->e(Ljava/lang/String;[Ljava/lang/String;)V

    .line 291
    return-void
.end method

.method public c(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)V
    .locals 2

    .line 284
    invoke-direct/range {p0 .. p8}, Lo/bta;->e(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)Ljava/lang/String;

    move-result-object v1

    .line 285
    invoke-direct {p0, p8}, Lo/bta;->m(I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lo/bta;->e(Ljava/lang/String;[Ljava/lang/String;)V

    .line 286
    return-void
.end method

.method public c()Z
    .locals 1

    .line 504
    invoke-direct {p0}, Lo/bta;->s()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c(I)Z
    .locals 1

    .line 586
    invoke-direct {p0, p1}, Lo/bta;->l(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 4

    .line 305
    const-string v0, "DataUpdateHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNeedUpdateWorkoutUserList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-direct {p0, p1}, Lo/bta;->o(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->g(Ljava/lang/String;)V

    .line 307
    invoke-direct {p0}, Lo/bta;->r()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/bta;->p(I)[Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/bta;->e(Ljava/lang/String;[Ljava/lang/String;)V

    .line 308
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 449
    invoke-direct {p0, p1}, Lo/bta;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 450
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 400
    invoke-direct {p0, p1, p2, p3}, Lo/bta;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 401
    return-void
.end method

.method public d(II)Z
    .locals 4

    .line 628
    invoke-direct {p0, p1, p2}, Lo/bta;->g(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0}, Lo/bta;->n()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, p2}, Lo/bta;->n(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo/bta;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d(III)Z
    .locals 2

    .line 253
    invoke-direct {p0, p1, p2, p3}, Lo/bta;->a(III)Ljava/lang/String;

    move-result-object v1

    .line 254
    invoke-direct {p0, p3}, Lo/bta;->p(I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lo/bta;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    .line 213
    invoke-direct {p0}, Lo/bta;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(I)Z
    .locals 2

    .line 266
    invoke-direct {p0}, Lo/bta;->r()Ljava/lang/String;

    move-result-object v1

    .line 267
    invoke-direct {p0, p1}, Lo/bta;->p(I)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lo/bta;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(II)Z
    .locals 1

    .line 471
    invoke-direct {p0, p1, p2}, Lo/bta;->c(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 1

    .line 546
    invoke-direct {p0, p1}, Lo/bta;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 374
    invoke-direct {p0, p1, p2, p3}, Lo/bta;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    .line 513
    invoke-direct {p0}, Lo/bta;->s()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 514
    return-void
.end method

.method public f(I)V
    .locals 1

    .line 623
    invoke-direct {p0, p1}, Lo/bta;->n(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->g(Ljava/lang/String;)V

    .line 624
    return-void
.end method

.method public g()V
    .locals 1

    .line 522
    invoke-direct {p0}, Lo/bta;->s()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->i(Ljava/lang/String;)V

    .line 523
    return-void
.end method

.method public g(I)V
    .locals 1

    .line 643
    invoke-direct {p0, p1}, Lo/bta;->t(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 644
    return-void
.end method

.method public h(I)V
    .locals 1

    .line 590
    invoke-direct {p0, p1}, Lo/bta;->l(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 591
    return-void
.end method

.method public h()Z
    .locals 1

    .line 538
    invoke-direct {p0}, Lo/bta;->q()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public i()V
    .locals 1

    .line 553
    invoke-direct {p0}, Lo/bta;->q()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 554
    return-void
.end method

.method public k()Z
    .locals 1

    .line 542
    invoke-direct {p0}, Lo/bta;->u()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public k(I)Z
    .locals 1

    .line 638
    invoke-direct {p0, p1}, Lo/bta;->t(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public o()V
    .locals 1

    .line 557
    invoke-direct {p0}, Lo/bta;->u()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bta;->c(Ljava/lang/String;)V

    .line 558
    return-void
.end method
