.class public Lcom/yandex/metrica/impl/ob/ci;
.super Lcom/yandex/metrica/impl/ob/cj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/cj<",
        "Lcom/yandex/metrica/impl/ob/bq;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/cs;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/cs;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/cj;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/q$a;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/q$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/q$a;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;)V"
        }
    .end annotation

    .line 1036
    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->b(Lcom/yandex/metrica/impl/q$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ci;->a()Lcom/yandex/metrica/impl/ob/cs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/cs;->j()Lcom/yandex/metrica/impl/ob/ce;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1040
    :cond_0
    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->a(Lcom/yandex/metrica/impl/q$a;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 31
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ci;->a()Lcom/yandex/metrica/impl/ob/cs;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/cs;->e()Lcom/yandex/metrica/impl/ob/cc;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
