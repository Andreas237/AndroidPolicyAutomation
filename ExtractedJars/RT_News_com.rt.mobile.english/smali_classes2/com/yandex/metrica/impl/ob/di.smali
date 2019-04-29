.class public Lcom/yandex/metrica/impl/ob/di;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/di$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ab;

.field private final b:Lcom/yandex/metrica/impl/ob/dp;

.field private final c:Lcom/yandex/metrica/impl/ob/dk;

.field private d:J

.field private e:J

.field private f:Ljava/util/concurrent/atomic/AtomicLong;

.field private g:Z

.field private volatile h:Lcom/yandex/metrica/impl/ob/di$a;

.field private i:J

.field private j:J

.field private k:Lcom/yandex/metrica/impl/ob/lz;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dp;Lcom/yandex/metrica/impl/ob/dk;)V
    .locals 1

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yandex/metrica/impl/ob/di;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dp;Lcom/yandex/metrica/impl/ob/dk;Lcom/yandex/metrica/impl/ob/lz;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dp;Lcom/yandex/metrica/impl/ob/dk;Lcom/yandex/metrica/impl/ob/lz;)V
    .locals 4

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->a:Lcom/yandex/metrica/impl/ob/ab;

    .line 51
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/di;->b:Lcom/yandex/metrica/impl/ob/dp;

    .line 52
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    .line 53
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/di;->k:Lcom/yandex/metrica/impl/ob/lz;

    .line 1058
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/di;->k:Lcom/yandex/metrica/impl/ob/lz;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/lz;->b()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/dk;->b(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->e:J

    .line 1059
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    const-wide/16 p2, -0x1

    invoke-virtual {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/dk;->a(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->d:J

    .line 1060
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    const-wide/16 p3, 0x0

    invoke-virtual {p2, p3, p4}, Lcom/yandex/metrica/impl/ob/dk;->c(J)J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->f:Ljava/util/concurrent/atomic/AtomicLong;

    .line 1061
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/dk;->a(Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/di;->g:Z

    .line 1062
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    invoke-virtual {p1, p3, p4}, Lcom/yandex/metrica/impl/ob/dk;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->i:J

    .line 1063
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    iget-wide p2, p0, Lcom/yandex/metrica/impl/ob/di;->i:J

    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/di;->e:J

    sub-long v2, p2, v0

    invoke-virtual {p1, v2, v3}, Lcom/yandex/metrica/impl/ob/dk;->e(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->j:J

    return-void
.end method

.method private d(J)J
    .locals 5

    .line 105
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/di;->e:J

    sub-long v3, p1, v1

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    return-wide p1
.end method

.method private h()Lcom/yandex/metrica/impl/ob/di$a;
    .locals 4

    .line 152
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->h:Lcom/yandex/metrica/impl/ob/di$a;

    if-nez v0, :cond_1

    .line 153
    monitor-enter p0

    .line 154
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->h:Lcom/yandex/metrica/impl/ob/di$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 156
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->m()Lcom/yandex/metrica/impl/ob/es;

    move-result-object v0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->c()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->a()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/es;->b(JLcom/yandex/metrica/impl/ob/dr;)Landroid/content/ContentValues;

    move-result-object v0

    const-string v1, "report_request_parameters"

    .line 157
    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 163
    new-instance v0, Lcom/yandex/metrica/impl/ob/di$a;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/di$a;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->h:Lcom/yandex/metrica/impl/ob/di$a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    :catch_0
    :cond_0
    :try_start_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 174
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->h:Lcom/yandex/metrica/impl/ob/di$a;

    return-object v0
.end method


# virtual methods
.method protected a()Lcom/yandex/metrica/impl/ob/dr;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dk;->a()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)V
    .locals 1

    .line 145
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/di;->g:Z

    if-eq v0, p1, :cond_0

    .line 146
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/di;->g:Z

    .line 147
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/di;->b:Lcom/yandex/metrica/impl/ob/dp;

    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/di;->g:Z

    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/dp;->a(Z)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/dq;->h()V

    :cond_0
    return-void
.end method

.method a(J)Z
    .locals 12

    .line 83
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/di;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz v4, :cond_0

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, v0

    .line 1092
    :goto_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/di;->h()Lcom/yandex/metrica/impl/ob/di$a;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 1095
    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/di;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v6}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v6

    .line 1096
    invoke-virtual {v5, v6}, Lcom/yandex/metrica/impl/ob/di$a;->a(Lcom/yandex/metrica/impl/ob/jv;)Z

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v0

    .line 1109
    :goto_1
    iget-wide v6, p0, Lcom/yandex/metrica/impl/ob/di;->i:J

    .line 1110
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v8, p1, p2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v8

    sub-long v10, v8, v6

    .line 1111
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/di;->d(J)J

    move-result-wide p1

    cmp-long v6, v10, v2

    if-ltz v6, :cond_3

    .line 1117
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->b()I

    move-result v2

    int-to-long v2, v2

    cmp-long v6, v10, v2

    if-gez v6, :cond_3

    sget-wide v2, Lcom/yandex/metrica/impl/ob/dl;->c:J

    cmp-long v6, p1, v2

    if-ltz v6, :cond_2

    goto :goto_2

    :cond_2
    move p1, v0

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v1

    :goto_3
    xor-int/2addr p1, v1

    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method protected b()I
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->c:Lcom/yandex/metrica/impl/ob/dk;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/di;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->O()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dk;->a(I)I

    move-result v0

    return v0
.end method

.method b(J)V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->b:Lcom/yandex/metrica/impl/ob/dp;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p1, p2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->i:J

    invoke-interface {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/dp;->b(J)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/dq;->h()V

    return-void
.end method

.method public c()J
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/di;->d:J

    return-wide v0
.end method

.method c(J)J
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->b:Lcom/yandex/metrica/impl/ob/dp;

    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/di;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->j:J

    invoke-interface {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/dp;->c(J)Lcom/yandex/metrica/impl/ob/dq;

    .line 131
    iget-wide p1, p0, Lcom/yandex/metrica/impl/ob/di;->j:J

    return-wide p1
.end method

.method d()J
    .locals 6

    .line 79
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/di;->i:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v3, p0, Lcom/yandex/metrica/impl/ob/di;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    sub-long v4, v0, v2

    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/di;->j:J

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method declared-synchronized e()V
    .locals 1

    monitor-enter p0

    .line 121
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->b:Lcom/yandex/metrica/impl/ob/dp;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/dp;->a()V

    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->h:Lcom/yandex/metrica/impl/ob/di$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 120
    monitor-exit p0

    throw v0
.end method

.method f()J
    .locals 5

    .line 135
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/di;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    .line 136
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/di;->b:Lcom/yandex/metrica/impl/ob/dp;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/di;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/dp;->a(J)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/dq;->h()V

    return-wide v0
.end method

.method g()Z
    .locals 5

    .line 141
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/di;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Session{mId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/di;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mInitTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/di;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mCurrentReportId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/di;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSessionRequestParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/di;->h:Lcom/yandex/metrica/impl/ob/di$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSleepStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/di;->i:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
