.class public Lcom/yandex/metrica/impl/ob/ht;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/hr;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 34
    new-instance v0, Lcom/yandex/metrica/impl/ob/hu;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/hu;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 36
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/hv;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/hv;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 0
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/hs;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/hs;",
            ">;"
        }
    .end annotation

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ht;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/hr;

    move-result-object p1

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/hr;->a()Ljava/util/List;

    move-result-object p1

    .line 24
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ob/lm;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object p1
.end method
