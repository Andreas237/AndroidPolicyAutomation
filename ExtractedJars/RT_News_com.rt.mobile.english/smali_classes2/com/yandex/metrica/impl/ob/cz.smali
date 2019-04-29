.class public Lcom/yandex/metrica/impl/ob/cz;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/cz;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->f()Lcom/yandex/metrica/impl/ob/dn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->b(Lcom/yandex/metrica/impl/h;)V

    const/4 p1, 0x0

    return p1
.end method
