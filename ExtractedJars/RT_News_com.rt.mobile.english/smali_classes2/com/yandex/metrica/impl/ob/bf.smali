.class public Lcom/yandex/metrica/impl/ob/bf;
.super Lcom/yandex/metrica/impl/ob/ay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/yandex/metrica/impl/ob/bl;",
        "C:",
        "Lcom/yandex/metrica/impl/ob/ab<",
        "*>;>",
        "Lcom/yandex/metrica/impl/ob/ay<",
        "TT;TC;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/be;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/be<",
            "TT;>;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ay;-><init>(Lcom/yandex/metrica/impl/ob/be;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/yandex/metrica/impl/h;)Z
    .locals 1

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/bf$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/bf$1;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/ay$a;)Z

    move-result p1

    return p1
.end method
