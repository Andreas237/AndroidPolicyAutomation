.class public Lcom/yandex/metrica/impl/ob/bu;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/ff;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 24
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/bu;->a:Lcom/yandex/metrica/impl/ob/ff;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bu;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bu;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ff;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->y()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 40
    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->e(Lcom/yandex/metrica/impl/h;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
