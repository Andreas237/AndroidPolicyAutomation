.class public Lcom/yandex/metrica/impl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/a$a;
    }
.end annotation


# instance fields
.field private a:Lorg/json/JSONObject;

.field private b:J

.field private c:Z

.field private d:Lcom/yandex/metrica/impl/ob/mx;


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 5

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    .line 67
    new-instance v0, Lcom/yandex/metrica/impl/ob/mx;

    const-string v1, "App Environment"

    const/16 v2, 0x1e

    const/16 v3, 0x32

    const/16 v4, 0x64

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/yandex/metrica/impl/ob/mx;-><init>(IIILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/a;->d:Lcom/yandex/metrica/impl/ob/mx;

    .line 74
    iput-wide p2, p0, Lcom/yandex/metrica/impl/a;->b:J

    .line 76
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 79
    :catch_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    const-wide/16 p1, 0x0

    .line 80
    iput-wide p1, p0, Lcom/yandex/metrica/impl/a;->b:J

    return-void
.end method

.method private declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->d:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/mx;->a()Lcom/yandex/metrica/impl/ob/na;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/na;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->d:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/mx;->b()Lcom/yandex/metrica/impl/ob/na;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/na;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 107
    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 108
    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 109
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 110
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    if-eqz p2, :cond_3

    .line 113
    :try_start_1
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 104
    monitor-exit p0

    throw p1

    .line 118
    :catch_0
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 85
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    const-wide/16 v0, 0x0

    .line 86
    iput-wide v0, p0, Lcom/yandex/metrica/impl/a;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 84
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Landroid/util/Pair;)V
    .locals 1
    .param p1    # Landroid/util/Pair;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 95
    :try_start_0
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 94
    monitor-exit p0

    throw p1
.end method

.method declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    monitor-enter p0

    .line 122
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/a;->d:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mx;->c()Lcom/yandex/metrica/impl/ob/mu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mu;->a()I

    move-result v1

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->d:Lcom/yandex/metrica/impl/ob/mx;

    .line 123
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/mx;->c()Lcom/yandex/metrica/impl/ob/mu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/mu;->a()I

    move-result v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    iget-object p2, p0, Lcom/yandex/metrica/impl/a;->d:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/ob/mx;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit p0

    return-void

    .line 125
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 p1, 0x1

    .line 126
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/a;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 121
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b()Lcom/yandex/metrica/impl/a$a;
    .locals 6

    monitor-enter p0

    .line 134
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/a;->c:Z

    if-eqz v0, :cond_0

    .line 135
    iget-wide v0, p0, Lcom/yandex/metrica/impl/a;->b:J

    const-wide/16 v2, 0x1

    add-long v4, v0, v2

    iput-wide v4, p0, Lcom/yandex/metrica/impl/a;->b:J

    const/4 v0, 0x0

    .line 136
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/a;->c:Z

    .line 138
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/a$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/yandex/metrica/impl/a;->b:J

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/a$a;-><init>(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 133
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 143
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Map size "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    iget-object v1, p0, Lcom/yandex/metrica/impl/a;->a:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Is changed "

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/a;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ". Current revision "

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    iget-wide v1, p0, Lcom/yandex/metrica/impl/a;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 142
    monitor-exit p0

    throw v0
.end method
