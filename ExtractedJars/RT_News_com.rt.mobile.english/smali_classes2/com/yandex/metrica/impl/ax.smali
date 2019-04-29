.class public Lcom/yandex/metrica/impl/ax;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:Lcom/yandex/metrica/impl/bf;

.field private final c:Lcom/yandex/metrica/impl/ob/fg;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

.field private g:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;Lcom/yandex/metrica/impl/ob/jp;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p3    # Lcom/yandex/metrica/impl/ob/jp;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax;->b:Lcom/yandex/metrica/impl/bf;

    .line 59
    iput-object p2, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    .line 60
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/fg;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    .line 61
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/fg;->d()Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ax;->a:Z

    .line 63
    iget-boolean p1, p0, Lcom/yandex/metrica/impl/ax;->a:Z

    if-eqz p1, :cond_0

    .line 64
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/fg;->l(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 65
    iput-object p2, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    goto :goto_0

    .line 67
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ax;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 68
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ax;->d(Ljava/lang/String;)V

    .line 70
    :goto_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fg;->e()Z

    move-result p1

    if-nez p1, :cond_1

    .line 71
    new-instance p1, Lcom/yandex/metrica/impl/ax$1;

    invoke-direct {p1, p0, p3}, Lcom/yandex/metrica/impl/ax$1;-><init>(Lcom/yandex/metrica/impl/ax;Lcom/yandex/metrica/impl/ob/jp;)V

    invoke-interface {p4, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;Ljava/util/concurrent/Executor;)V
    .locals 2
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/jp;

    .line 48
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bf;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/jp;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/yandex/metrica/impl/ax;-><init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;Lcom/yandex/metrica/impl/ob/jp;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ax;)Lcom/yandex/metrica/impl/bf;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/yandex/metrica/impl/ax;->b:Lcom/yandex/metrica/impl/bf;

    return-object p0
.end method

.method private a()V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->e:Ljava/util/Map;

    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 184
    sget-object v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->PARSE_ERROR:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ax;->a(Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;)V

    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    if-eqz v0, :cond_1

    .line 188
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ax;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/DeferredDeeplinkParametersListener;->onParametersLoaded(Ljava/util/Map;)V

    const/4 v0, 0x0

    .line 189
    iput-object v0, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    :cond_1
    return-void
.end method

.method private a(Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;)V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lcom/yandex/metrica/DeferredDeeplinkParametersListener;->onError(Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 197
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ax;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ax;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ax;)Lcom/yandex/metrica/impl/ob/fg;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    return-object p0
.end method

.method static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 134
    invoke-static {p0}, Lcom/yandex/metrica/impl/ax;->e(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "appmetrica_deep_link"

    .line 135
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ax;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ax;->a()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 106
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ax;->a:Z

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    .line 107
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 109
    monitor-enter p0

    .line 110
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    .line 111
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ax;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->l(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 112
    invoke-static {p1}, Lcom/yandex/metrica/impl/ax;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 113
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ax;->d(Ljava/lang/String;)V

    .line 114
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax;->g:Landroid/os/Handler;

    if-nez p1, :cond_2

    .line 115
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ax;->g:Landroid/os/Handler;

    .line 117
    :cond_2
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax;->g:Landroid/os/Handler;

    new-instance v0, Lcom/yandex/metrica/impl/ax$2;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ax$2;-><init>(Lcom/yandex/metrica/impl/ax;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 122
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 127
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1140
    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/yandex/metrica/impl/ax;->e(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 1141
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 1142
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1143
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 128
    :cond_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/ax;->e:Ljava/util/Map;

    :cond_1
    return-void
.end method

.method private static e(Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 150
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_2

    const/16 v1, 0x3f

    .line 1169
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-ltz v1, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 1171
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    const-string v1, "="

    .line 1178
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "&"

    .line 154
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    .line 155
    array-length v2, p0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, p0, v3

    const-string v5, "="

    .line 156
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-ltz v5, :cond_1

    .line 158
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const-string v5, ""

    .line 160
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/yandex/metrica/DeferredDeeplinkParametersListener;)V
    .locals 1

    monitor-enter p0

    .line 203
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax;->f:Lcom/yandex/metrica/DeferredDeeplinkParametersListener;

    .line 204
    iget-boolean p1, p0, Lcom/yandex/metrica/impl/ax;->a:Z

    if-eqz p1, :cond_0

    .line 205
    sget-object p1, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->NOT_A_FIRST_LAUNCH:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ax;->a(Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;)V

    goto :goto_0

    .line 207
    :cond_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ax;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    :goto_0
    :try_start_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fg;->f()Lcom/yandex/metrica/impl/ob/fg;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 210
    :try_start_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->c:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fg;->f()Lcom/yandex/metrica/impl/ob/fg;

    .line 211
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    .line 202
    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bf;->b(Ljava/lang/String;)V

    .line 102
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ax;->c(Ljava/lang/String;)V

    return-void
.end method
