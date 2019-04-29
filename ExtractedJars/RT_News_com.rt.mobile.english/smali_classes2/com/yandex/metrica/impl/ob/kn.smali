.class public Lcom/yandex/metrica/impl/ob/kn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ko;


# static fields
.field static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/ob/km;",
            "Lcom/yandex/metrica/IIdentifierCallback$Reason;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/yandex/metrica/impl/bf;

.field private final c:Lcom/yandex/metrica/impl/ob/kq;

.field private final d:Lcom/yandex/metrica/impl/ob/fg;

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/IIdentifierCallback;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/IIdentifierCallback;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/kn$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/kn$1;-><init>()V

    .line 32
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/kn;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->e:Ljava/lang/Object;

    .line 47
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->f:Ljava/util/Map;

    .line 49
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->g:Ljava/util/Map;

    .line 55
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    .line 56
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/kn;->d:Lcom/yandex/metrica/impl/ob/fg;

    .line 57
    new-instance p1, Lcom/yandex/metrica/impl/ob/kq;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/kn;->d:Lcom/yandex/metrica/impl/ob/fg;

    invoke-direct {p1, p2}, Lcom/yandex/metrica/impl/ob/kq;-><init>(Lcom/yandex/metrica/impl/ob/fg;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    .line 58
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kn;->c()V

    return-void
.end method

.method private c()V
    .locals 7

    .line 153
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 155
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 157
    new-instance v2, Ljava/util/WeakHashMap;

    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 159
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 161
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/kn;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 162
    :try_start_0
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    sget-object v6, Lcom/yandex/metrica/impl/ob/kq$a;->a:Lcom/yandex/metrica/impl/ob/kq$a;

    invoke-virtual {v5, v6}, Lcom/yandex/metrica/impl/ob/kq;->a(Lcom/yandex/metrica/impl/ob/kq$a;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 163
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->f:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 164
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->f:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 165
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v5, v1}, Lcom/yandex/metrica/impl/ob/kq;->b(Ljava/util/Map;)V

    .line 173
    :cond_0
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    sget-object v6, Lcom/yandex/metrica/impl/ob/kq$a;->c:Lcom/yandex/metrica/impl/ob/kq$a;

    invoke-virtual {v5, v6}, Lcom/yandex/metrica/impl/ob/kq;->a(Lcom/yandex/metrica/impl/ob/kq$a;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 174
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->g:Ljava/util/Map;

    invoke-interface {v2, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 175
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->g:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 176
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v5, v3}, Lcom/yandex/metrica/impl/ob/kq;->a(Ljava/util/Map;)V

    .line 183
    :cond_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/yandex/metrica/IIdentifierCallback;

    .line 186
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v5, v6}, Lcom/yandex/metrica/IIdentifierCallback;->onReceive(Ljava/util/Map;)V

    goto :goto_0

    .line 189
    :cond_2
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/yandex/metrica/IIdentifierCallback;

    .line 190
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v5, v6}, Lcom/yandex/metrica/IIdentifierCallback;->onReceive(Ljava/util/Map;)V

    goto :goto_1

    .line 193
    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 194
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 196
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 197
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    return-void

    :catchall_0
    move-exception v0

    .line 183
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kq;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 5

    .line 101
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 102
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/kq;->a(Landroid/os/Bundle;)V

    .line 103
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    .line 2028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    .line 103
    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/kq;->a(J)V

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kn;->c()V

    return-void

    :catchall_0
    move-exception p1

    .line 104
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Lcom/yandex/metrica/IIdentifierCallback;)V
    .locals 3

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 82
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kn;->g:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    sget-object v1, Lcom/yandex/metrica/impl/ob/kq$a;->c:Lcom/yandex/metrica/impl/ob/kq$a;

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/kq;->a(Lcom/yandex/metrica/impl/ob/kq$a;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1097
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bf;->c()V

    .line 91
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kn;->c()V

    return-void

    :catchall_0
    move-exception p1

    .line 91
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bf;->c(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kq;->b()Ljava/util/List;

    move-result-object v0

    .line 118
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 119
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 120
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/kq;->a(Ljava/util/List;)V

    .line 121
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/bf;->a(Ljava/util/List;)V

    return-void

    .line 123
    :cond_0
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 124
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kq;->a(Ljava/util/List;)V

    .line 125
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bf;->a(Ljava/util/List;)V

    return-void

    .line 127
    :cond_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/bf;->a(Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 132
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ly;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 134
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bf;->a(Ljava/util/Map;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    sget-object v1, Lcom/yandex/metrica/impl/ob/kq$a;->c:Lcom/yandex/metrica/impl/ob/kq$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kq;->a(Lcom/yandex/metrica/impl/ob/kq$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->c:Lcom/yandex/metrica/impl/ob/kq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kq;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2097
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kn;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bf;->c()V

    :cond_1
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 4

    .line 201
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/km;->b(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/ob/km;

    move-result-object p1

    .line 2206
    sget-object v0, Lcom/yandex/metrica/impl/ob/kn;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/IIdentifierCallback$Reason;

    .line 2208
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 2210
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 2213
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kn;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 2214
    :try_start_0
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/kn;->f:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 2215
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/kn;->g:Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 2217
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/kn;->f:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 2218
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/kn;->g:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 2226
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2228
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/IIdentifierCallback;

    .line 2229
    invoke-interface {v3, p1}, Lcom/yandex/metrica/IIdentifierCallback;->onRequestError(Lcom/yandex/metrica/IIdentifierCallback$Reason;)V

    goto :goto_0

    .line 2232
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/IIdentifierCallback;

    .line 2233
    invoke-interface {v3, p1}, Lcom/yandex/metrica/IIdentifierCallback;->onRequestError(Lcom/yandex/metrica/IIdentifierCallback$Reason;)V

    goto :goto_1

    .line 2236
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 2237
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    return-void

    :catchall_0
    move-exception p1

    .line 2226
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
