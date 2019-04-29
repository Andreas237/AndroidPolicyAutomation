.class public Lcom/yandex/metrica/impl/ob/ki;
.super Lcom/yandex/metrica/impl/ob/kt;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/kr;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/kr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/yandex/metrica/impl/ob/kt;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/kr;)V

    return-void
.end method


# virtual methods
.method a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2

    .line 29
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 30
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    if-nez v0, :cond_0

    .line 31
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/q;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Class;)V

    return-void

    .line 33
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/q;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/q;-><init>(Lcom/yandex/metrica/impl/ob/kj;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    return-void
.end method
