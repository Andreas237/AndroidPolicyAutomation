.class public Lcom/yandex/metrica/impl/ob/bk;
.super Lcom/yandex/metrica/impl/ob/bg;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/x;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bg;-><init>(Lcom/yandex/metrica/impl/ob/x;)V

    return-void
.end method


# virtual methods
.method a(Lcom/yandex/metrica/impl/ob/jn;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bk;->a()Lcom/yandex/metrica/impl/ob/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/x;->f()Lcom/yandex/metrica/impl/ob/jm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/jm;->a(Lcom/yandex/metrica/impl/ob/jn;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/aq;)Z
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/aq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    :try_start_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->c()[B

    move-result-object p1

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/jn;->a([B)Lcom/yandex/metrica/impl/ob/jn;

    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/bk;->a(Lcom/yandex/metrica/impl/ob/jn;)V
    :try_end_0
    .catch Lcom/yandex/metrica/impl/ob/d; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    return p1
.end method
