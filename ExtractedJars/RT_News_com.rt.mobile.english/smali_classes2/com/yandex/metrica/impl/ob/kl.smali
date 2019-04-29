.class public Lcom/yandex/metrica/impl/ob/kl;
.super Lcom/yandex/metrica/impl/ob/js;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/js<",
        "Lcom/yandex/metrica/impl/ob/jw;",
        "Lcom/yandex/metrica/impl/ob/jw$a;",
        "Lcom/yandex/metrica/impl/ob/jw$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/jw$b;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jw$b;
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

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/kl$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/kl$1;-><init>()V

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/yandex/metrica/impl/ob/js;-><init>(Lcom/yandex/metrica/impl/ob/jq$d;Lcom/yandex/metrica/impl/ob/js$a;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V

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

    .line 37
    :try_start_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/jq$c;

    .line 38
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kl;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kl;->b(Lcom/yandex/metrica/impl/ob/t;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/jq$c;-><init>(Lcom/yandex/metrica/impl/ob/ks;Ljava/lang/Object;)V

    .line 37
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/kl;->a(Lcom/yandex/metrica/impl/ob/jq$c;)V

    .line 40
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kl;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    throw p1
.end method
