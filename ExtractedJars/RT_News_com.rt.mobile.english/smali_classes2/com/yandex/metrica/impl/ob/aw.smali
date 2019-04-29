.class public Lcom/yandex/metrica/impl/ob/aw;
.super Lcom/yandex/metrica/impl/ob/al;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/al<",
        "Lcom/yandex/metrica/impl/ob/ab;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/al;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ae;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aw;->b()Lcom/yandex/metrica/impl/ob/ae;

    move-result-object v0

    .line 1038
    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ae;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 30
    :cond_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->d()I

    move-result v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/q;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 32
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aw;->b()Lcom/yandex/metrica/impl/ob/ae;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/ab;->a(Lcom/yandex/metrica/impl/ob/t;)V

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aw;->b()Lcom/yandex/metrica/impl/ob/ae;

    move-result-object p2

    check-cast p2, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/ob/ab;->a(Lcom/yandex/metrica/impl/h;)V

    return-void
.end method
