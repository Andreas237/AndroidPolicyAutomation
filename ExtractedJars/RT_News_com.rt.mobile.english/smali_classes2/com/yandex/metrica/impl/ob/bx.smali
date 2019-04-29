.class public Lcom/yandex/metrica/impl/ob/bx;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/eu;

.field private final b:Lcom/yandex/metrica/impl/ob/ht;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/eu;Lcom/yandex/metrica/impl/ob/ht;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 34
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/bx;->a:Lcom/yandex/metrica/impl/ob/eu;

    .line 35
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/bx;->b:Lcom/yandex/metrica/impl/ob/ht;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bx;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ff;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->z()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 51
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bx;->a:Lcom/yandex/metrica/impl/ob/eu;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/eu;->d()Lcom/yandex/metrica/impl/ob/ey;

    move-result-object v1

    .line 52
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bx;->b:Lcom/yandex/metrica/impl/ob/ht;

    .line 53
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bx;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ey;->a()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/ht;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_0

    .line 55
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->p()V

    goto :goto_0

    .line 57
    :cond_0
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Ljava/util/List;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->f(Lcom/yandex/metrica/impl/h;)V

    .line 59
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/ey;->a(Ljava/util/List;)V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
