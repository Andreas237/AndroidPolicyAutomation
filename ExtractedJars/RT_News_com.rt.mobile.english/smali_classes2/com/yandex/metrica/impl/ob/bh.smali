.class public Lcom/yandex/metrica/impl/ob/bh;
.super Lcom/yandex/metrica/impl/ob/ay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/bg;",
        "C:",
        "Lcom/yandex/metrica/impl/ob/x;",
        ">",
        "Lcom/yandex/metrica/impl/ob/ay<",
        "TT;TC;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/be;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/be;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/be<",
            "TT;>;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ay;-><init>(Lcom/yandex/metrica/impl/ob/be;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/aq;)Z
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/aq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/bh$1;

    invoke-direct {v0, p2}, Lcom/yandex/metrica/impl/ob/bh$1;-><init>(Lcom/yandex/metrica/impl/ob/aq;)V

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/bh;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/ay$a;)Z

    move-result p1

    return p1
.end method
