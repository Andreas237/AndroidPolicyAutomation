.class public Lcom/yandex/metrica/impl/ob/my;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/mx;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/mx;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/mx;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/my;->a:Lcom/yandex/metrica/impl/ob/mx;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 26
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/my;->a:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/mx;->a()Lcom/yandex/metrica/impl/ob/na;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/na;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 28
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/my;->a:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mx;->c()Lcom/yandex/metrica/impl/ob/mu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mu;->a()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 29
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/my;->a:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/mx;->a(Ljava/lang/String;)V

    return-void

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/my;->a:Lcom/yandex/metrica/impl/ob/mx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/mx;->b()Lcom/yandex/metrica/impl/ob/na;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/yandex/metrica/impl/ob/na;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 33
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
