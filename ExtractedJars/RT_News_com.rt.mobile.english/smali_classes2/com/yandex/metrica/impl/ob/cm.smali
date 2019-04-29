.class public Lcom/yandex/metrica/impl/ob/cm;
.super Lcom/yandex/metrica/impl/ob/cl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/cl<",
        "Lcom/yandex/metrica/impl/ob/bq;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/cs;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/cl;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/cm;->a()Lcom/yandex/metrica/impl/ob/cs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/cs;->f()Lcom/yandex/metrica/impl/ob/cf;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/cm;->a()Lcom/yandex/metrica/impl/ob/cs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/cs;->a()Lcom/yandex/metrica/impl/ob/bu;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
