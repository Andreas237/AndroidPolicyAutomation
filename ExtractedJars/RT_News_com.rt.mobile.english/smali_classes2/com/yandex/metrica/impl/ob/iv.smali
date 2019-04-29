.class public Lcom/yandex/metrica/impl/ob/iv;
.super Lcom/yandex/metrica/impl/ob/is;
.source "SourceFile"


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ij;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ij;",
            ")V"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/yandex/metrica/impl/ob/iu;

    invoke-direct {v0, p4}, Lcom/yandex/metrica/impl/ob/iu;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yandex/metrica/impl/ob/is;-><init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ja;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ja;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 31
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/iv;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/iv;->e()Lcom/yandex/metrica/impl/ob/ik;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p0}, Lcom/yandex/metrica/impl/ob/ik;->a(Lcom/yandex/metrica/impl/ob/ja;Lcom/yandex/metrica/impl/ob/jg$a$a;Lcom/yandex/metrica/impl/ob/ii;)Lcom/yandex/metrica/impl/ob/jg$a$a;

    :cond_0
    return-void
.end method
