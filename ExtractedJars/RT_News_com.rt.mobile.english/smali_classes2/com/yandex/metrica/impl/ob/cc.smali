.class public Lcom/yandex/metrica/impl/ob/cc;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/bf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/bf<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            "Lcom/yandex/metrica/impl/ob/ab<",
            "+",
            "Lcom/yandex/metrica/impl/ob/ao;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 2

    .line 25
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/bf;

    new-instance v1, Lcom/yandex/metrica/impl/ob/bd;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/bd;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/bf;-><init>(Lcom/yandex/metrica/impl/ob/be;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/cc;->a:Lcom/yandex/metrica/impl/ob/bf;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/cc;->a:Lcom/yandex/metrica/impl/ob/bf;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/bf;->b(Lcom/yandex/metrica/impl/h;)Z

    move-result p1

    return p1
.end method
