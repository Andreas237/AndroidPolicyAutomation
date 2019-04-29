.class Lcom/yandex/metrica/impl/ob/hf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/hb;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    new-instance v0, Lcom/yandex/metrica/impl/ob/hi$b;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/hi$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/yandex/metrica/impl/ob/hi$a;

    invoke-direct {v1, p2, p3}, Lcom/yandex/metrica/impl/ob/hi$a;-><init>(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 22
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hi$b;->a(Lcom/yandex/metrica/impl/ob/hi$a;)Lcom/yandex/metrica/impl/ob/hi;

    move-result-object p2

    .line 23
    new-instance p3, Lcom/yandex/metrica/impl/ob/hb;

    invoke-direct {p3, p1, p2}, Lcom/yandex/metrica/impl/ob/hb;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/hi;)V

    return-object p3
.end method
