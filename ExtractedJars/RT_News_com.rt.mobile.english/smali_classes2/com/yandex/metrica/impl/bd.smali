.class Lcom/yandex/metrica/impl/bd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/u;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/bf;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/j;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private e:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/ob/ko;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/b;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/j;Landroid/os/Handler;Lcom/yandex/metrica/impl/ob/ko;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/u;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/bf;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/j;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/os/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/ko;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bd;->g:Ljava/util/Map;

    .line 38
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nm;

    iget-object v2, p0, Lcom/yandex/metrica/impl/bd;->g:Ljava/util/Map;

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/nm;-><init>(Ljava/util/Map;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bd;->h:Lcom/yandex/metrica/impl/ob/nk;

    .line 48
    iput-object p1, p0, Lcom/yandex/metrica/impl/bd;->a:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/yandex/metrica/impl/bd;->b:Lcom/yandex/metrica/impl/ob/u;

    .line 50
    iput-object p3, p0, Lcom/yandex/metrica/impl/bd;->c:Lcom/yandex/metrica/impl/bf;

    .line 51
    iput-object p4, p0, Lcom/yandex/metrica/impl/bd;->d:Lcom/yandex/metrica/impl/j;

    .line 52
    iput-object p5, p0, Lcom/yandex/metrica/impl/bd;->e:Landroid/os/Handler;

    .line 53
    iput-object p6, p0, Lcom/yandex/metrica/impl/bd;->f:Lcom/yandex/metrica/impl/ob/ko;

    return-void
.end method

.method private a(Lcom/yandex/metrica/impl/b;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 100
    new-instance v0, Lcom/yandex/metrica/impl/y;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bd;->e:Landroid/os/Handler;

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/y;-><init>(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;)V

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/y;)V

    .line 101
    iget-object v0, p0, Lcom/yandex/metrica/impl/bd;->d:Lcom/yandex/metrica/impl/j;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/j;)V

    .line 102
    iget-object v0, p0, Lcom/yandex/metrica/impl/bd;->f:Lcom/yandex/metrica/impl/ob/ko;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/ob/ko;)V

    return-void
.end method


# virtual methods
.method a(Lcom/yandex/metrica/e;Z)Lcom/yandex/metrica/impl/ab;
    .locals 4
    .param p1    # Lcom/yandex/metrica/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/yandex/metrica/impl/bd;->h:Lcom/yandex/metrica/impl/ob/nk;

    iget-object v1, p1, Lcom/yandex/metrica/e;->apiKey:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 61
    new-instance v0, Lcom/yandex/metrica/impl/ab;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bd;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/bd;->b:Lcom/yandex/metrica/impl/ob/u;

    iget-object v3, p0, Lcom/yandex/metrica/impl/bd;->c:Lcom/yandex/metrica/impl/bf;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/yandex/metrica/impl/ab;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/e;Lcom/yandex/metrica/impl/bf;)V

    .line 62
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/bd;->a(Lcom/yandex/metrica/impl/b;)V

    .line 63
    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ab;->a(Lcom/yandex/metrica/e;Z)V

    .line 64
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ab;->a()V

    .line 66
    iget-object p2, p0, Lcom/yandex/metrica/impl/bd;->c:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/ab;)V

    .line 68
    iget-object p2, p0, Lcom/yandex/metrica/impl/bd;->g:Ljava/util/Map;

    iget-object p1, p1, Lcom/yandex/metrica/e;->apiKey:Ljava/lang/String;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method declared-synchronized a(Lcom/yandex/metrica/c;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bd;->g:Ljava/util/Map;

    iget-object v1, p1, Lcom/yandex/metrica/c;->apiKey:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Reporter with apiKey=%s already exists."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object p1, p1, Lcom/yandex/metrica/c;->apiKey:Ljava/lang/String;

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 77
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bd;->b(Lcom/yandex/metrica/c;)Lcom/yandex/metrica/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 73
    monitor-exit p0

    throw p1
.end method

.method declared-synchronized b(Lcom/yandex/metrica/c;)Lcom/yandex/metrica/b;
    .locals 4
    .param p1    # Lcom/yandex/metrica/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bd;->g:Ljava/util/Map;

    iget-object v1, p1, Lcom/yandex/metrica/c;->apiKey:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/b;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Lcom/yandex/metrica/impl/ac;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bd;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/bd;->b:Lcom/yandex/metrica/impl/ob/u;

    iget-object v3, p0, Lcom/yandex/metrica/impl/bd;->c:Lcom/yandex/metrica/impl/bf;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/yandex/metrica/impl/ac;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/c;Lcom/yandex/metrica/impl/bf;)V

    .line 90
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/bd;->a(Lcom/yandex/metrica/impl/b;)V

    .line 91
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ac;->a()V

    .line 93
    iget-object v1, p0, Lcom/yandex/metrica/impl/bd;->g:Ljava/util/Map;

    iget-object p1, p1, Lcom/yandex/metrica/c;->apiKey:Ljava/lang/String;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 82
    monitor-exit p0

    throw p1
.end method
