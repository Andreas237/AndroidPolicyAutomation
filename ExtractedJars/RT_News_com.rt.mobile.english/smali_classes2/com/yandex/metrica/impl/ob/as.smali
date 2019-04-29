.class public Lcom/yandex/metrica/impl/ob/as;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/yandex/metrica/impl/ob/ae;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/as;->a:Ljava/util/HashMap;

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/as;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/ar;)Lcom/yandex/metrica/impl/ob/ae;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ar;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/yandex/metrica/impl/ob/ae;",
            ">(",
            "Lcom/yandex/metrica/impl/ob/y;",
            "Lcom/yandex/metrica/impl/ob/t;",
            "Lcom/yandex/metrica/impl/ob/ar<",
            "TT;>;)TT;"
        }
    .end annotation

    monitor-enter p0

    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/as;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ae;

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ae;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/as;->b:Landroid/content/Context;

    invoke-interface {p3, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ar;->a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ae;

    move-result-object v0

    .line 45
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/as;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 37
    monitor-exit p0

    throw p1
.end method
