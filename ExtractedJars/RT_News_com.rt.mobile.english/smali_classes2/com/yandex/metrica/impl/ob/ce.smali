.class public Lcom/yandex/metrica/impl/ob/ce;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1032
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 1033
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ce;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ce;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->a(Ljava/lang/String;)V

    :cond_1
    return v1
.end method
