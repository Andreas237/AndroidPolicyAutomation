.class public Lcom/yandex/metrica/impl/ob/bm;
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
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bm;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->r()V

    const/4 p1, 0x0

    return p1
.end method
