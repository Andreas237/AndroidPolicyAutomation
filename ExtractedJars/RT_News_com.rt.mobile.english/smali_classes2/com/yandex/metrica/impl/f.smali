.class Lcom/yandex/metrica/impl/f;
.super Lcom/yandex/metrica/impl/bc;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/u;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/u;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    new-instance v0, Lcom/yandex/metrica/CounterConfiguration;

    invoke-direct {v0}, Lcom/yandex/metrica/CounterConfiguration;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/bc;-><init>(Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/CounterConfiguration;)V

    .line 22
    iget-object p1, p0, Lcom/yandex/metrica/impl/f;->a:Lcom/yandex/metrica/CounterConfiguration;

    invoke-virtual {p1}, Lcom/yandex/metrica/CounterConfiguration;->o()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
