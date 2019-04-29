.class public Lcom/yandex/metrica/impl/ob/ak;
.super Lcom/yandex/metrica/impl/ob/jr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/jr<",
        "Lcom/yandex/metrica/impl/ob/jv;",
        "Lcom/yandex/metrica/impl/ob/jv$a;",
        "Lcom/yandex/metrica/impl/ob/jv$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/jv$b;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jv$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/ak$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/ak$1;-><init>()V

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/yandex/metrica/impl/ob/jr;-><init>(Lcom/yandex/metrica/impl/ob/jq$b;Lcom/yandex/metrica/impl/ob/js$a;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/t;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 38
    :try_start_0
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/jr;->a(Lcom/yandex/metrica/impl/ob/t;)V

    .line 39
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ak;->b(Lcom/yandex/metrica/impl/ob/t;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/jv$a;

    .line 40
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ak;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jv$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/yandex/metrica/impl/ob/jq$c;

    .line 42
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ak;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/jq$c;-><init>(Lcom/yandex/metrica/impl/ob/ks;Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/ak;->a(Lcom/yandex/metrica/impl/ob/jq$c;)V

    .line 44
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ak;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 37
    monitor-exit p0

    throw p1
.end method
