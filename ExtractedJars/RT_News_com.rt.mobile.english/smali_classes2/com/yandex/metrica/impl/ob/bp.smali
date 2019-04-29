.class public Lcom/yandex/metrica/impl/ob/bp;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bp;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ab;->a(Z)V

    .line 26
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->f()Lcom/yandex/metrica/impl/ob/dn;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/h;Z)V

    return v1
.end method
