.class public Lcom/yandex/metrica/impl/ob/kq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/kq$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:J

.field private g:Ljava/lang/String;

.field private final h:Lcom/yandex/metrica/impl/ob/fg;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/fg;)V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    .line 41
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->b:Ljava/lang/String;

    .line 42
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fg;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->c:Ljava/lang/String;

    .line 43
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fg;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->d:Ljava/lang/String;

    .line 44
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fg;->b()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->e:Ljava/util/List;

    .line 45
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fg;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    .line 46
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/fg;->a(J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/yandex/metrica/impl/ob/kq;->f:J

    .line 47
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fg;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->g:Ljava/lang/String;

    .line 49
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->d()V

    return-void
.end method

.method private declared-synchronized b(J)V
    .locals 0

    monitor-enter p0

    .line 191
    :try_start_0
    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/kq;->f:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 190
    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Landroid/os/Bundle;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "Uuid"

    .line 158
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3053
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3054
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    :cond_0
    const-string v0, "DeviceId"

    .line 161
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 162
    invoke-static {p1}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 163
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kq;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 157
    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 183
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 182
    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(Landroid/os/Bundle;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "AdUrlGet"

    .line 168
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 169
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 170
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/kq;->b(Ljava/lang/String;)V

    :cond_0
    const-string v0, "AdUrlReport"

    .line 172
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 173
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/kq;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 167
    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 187
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 186
    monitor-exit p0

    throw p1
.end method

.method private d()V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->b:Ljava/lang/String;

    .line 106
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->c:Ljava/lang/String;

    .line 107
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->d:Ljava/lang/String;

    .line 108
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->i(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/kq;->f:J

    .line 109
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fg;->d(J)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->g:Ljava/lang/String;

    .line 110
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->j(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fg;->i()V

    return-void
.end method

.method private declared-synchronized e()Z
    .locals 4

    monitor-enter p0

    const/4 v0, 0x2

    .line 146
    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->b:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a([Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return v3

    :cond_0
    monitor-exit p0

    return v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized f()Z
    .locals 1

    monitor-enter p0

    .line 150
    monitor-exit p0

    const/4 v0, 0x1

    return v0
.end method

.method private declared-synchronized g()Z
    .locals 1

    monitor-enter p0

    .line 154
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->f()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method a(J)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fg;->e(J)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fg;->i()V

    return-void
.end method

.method declared-synchronized a(Landroid/os/Bundle;)V
    .locals 2

    monitor-enter p0

    .line 96
    :try_start_0
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/kq;->b(Landroid/os/Bundle;)V

    .line 97
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/kq;->c(Landroid/os/Bundle;)V

    const-string v0, "ServerTimeOffset"

    .line 1140
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kq;->b(J)V

    const-string v0, "Clids"

    .line 2115
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2116
    invoke-static {p1}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2117
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->g:Ljava/lang/String;

    .line 101
    :cond_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 95
    monitor-exit p0

    throw p1
.end method

.method declared-synchronized a(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 179
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 178
    monitor-exit p0

    throw p1
.end method

.method a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 135
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->e:Ljava/util/List;

    .line 136
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->e:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fg;->a(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/fg;

    return-void
.end method

.method declared-synchronized a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 59
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kq;->b(Ljava/util/Map;)V

    .line 60
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kq;->c(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 58
    monitor-exit p0

    throw p1
.end method

.method a()Z
    .locals 9

    .line 3028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 126
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kq;->h:Lcom/yandex/metrica/impl/ob/fg;

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/fg;->b(J)J

    move-result-wide v5

    sub-long v7, v0, v5

    const-wide/32 v0, 0x15180

    cmp-long v2, v7, v0

    if-gtz v2, :cond_1

    cmp-long v0, v7, v3

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method declared-synchronized a(Lcom/yandex/metrica/impl/ob/kq$a;)Z
    .locals 1

    monitor-enter p0

    .line 64
    :try_start_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/kq$a;->c:Lcom/yandex/metrica/impl/ob/kq$a;

    if-ne v0, p1, :cond_0

    .line 65
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->g()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    .line 66
    :cond_0
    :try_start_1
    sget-object v0, Lcom/yandex/metrica/impl/ob/kq$a;->a:Lcom/yandex/metrica/impl/ob/kq$a;

    if-ne v0, p1, :cond_1

    .line 67
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->e()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    .line 68
    :cond_1
    :try_start_2
    sget-object v0, Lcom/yandex/metrica/impl/ob/kq$a;->b:Lcom/yandex/metrica/impl/ob/kq$a;

    if-ne v0, p1, :cond_2

    .line 69
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kq;->f()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return p1

    :cond_2
    const/4 p1, 0x0

    .line 72
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    .line 63
    monitor-exit p0

    throw p1
.end method

.method b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->e:Ljava/util/List;

    return-object v0
.end method

.method declared-synchronized b(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 76
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "yandex_mobile_metrica_uuid"

    .line 77
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "yandex_mobile_metrica_device_id"

    .line 81
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 75
    monitor-exit p0

    throw p1
.end method

.method c()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->a:Ljava/lang/String;

    return-object v0
.end method

.method declared-synchronized c(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 86
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "yandex_mobile_metrica_get_ad_url"

    .line 87
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kq;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "yandex_mobile_metrica_report_ad_url"

    .line 91
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kq;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 85
    monitor-exit p0

    throw p1
.end method
