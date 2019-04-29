.class public Lcom/yandex/metrica/impl/ob/ew;
.super Lcom/yandex/metrica/impl/ob/eo;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/et;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/et;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/fj;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 20
    invoke-direct {p0, p2, v0}, Lcom/yandex/metrica/impl/ob/ew;-><init>(Lcom/yandex/metrica/impl/ob/et;Lcom/yandex/metrica/impl/ob/fj;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/et;Lcom/yandex/metrica/impl/ob/fj;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/et;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/fj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/eo;-><init>(Lcom/yandex/metrica/impl/ob/et;Lcom/yandex/metrica/impl/ob/fj;)V

    return-void
.end method


# virtual methods
.method protected d(J)J
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ew;->c()Lcom/yandex/metrica/impl/ob/fj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->f(J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected e(J)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ew;->c()Lcom/yandex/metrica/impl/ob/fj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->g(J)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    return-object p1
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "lbs_dat"

    return-object v0
.end method
