.class Lcom/yandex/metrica/impl/ac;
.super Lcom/yandex/metrica/impl/b;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/c;Lcom/yandex/metrica/impl/bf;)V
    .locals 2
    .param p3    # Lcom/yandex/metrica/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/bc;

    new-instance v1, Lcom/yandex/metrica/CounterConfiguration;

    invoke-direct {v1, p3}, Lcom/yandex/metrica/CounterConfiguration;-><init>(Lcom/yandex/metrica/c;)V

    invoke-direct {v0, p2, v1}, Lcom/yandex/metrica/impl/bc;-><init>(Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/CounterConfiguration;)V

    invoke-direct {p0, p1, p4, v0}, Lcom/yandex/metrica/impl/b;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/bc;)V

    .line 30
    iget-object p1, p0, Lcom/yandex/metrica/impl/ac;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/CounterConfiguration;->f(Z)V

    return-void
.end method
