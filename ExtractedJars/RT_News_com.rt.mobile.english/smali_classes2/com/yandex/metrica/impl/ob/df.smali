.class public Lcom/yandex/metrica/impl/ob/df;
.super Lcom/yandex/metrica/impl/ob/de;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->D()Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/dq;

    .line 26
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->G()Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v2

    const-string v3, "background"

    invoke-direct {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/dq;-><init>(Lcom/yandex/metrica/impl/ob/fh;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/ob/df;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/fh;Lcom/yandex/metrica/impl/ob/dq;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/fh;Lcom/yandex/metrica/impl/ob/dq;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/fh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/dq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 34
    sget-object v0, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    .line 38
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/dm;->a(Lcom/yandex/metrica/impl/ob/dr;)Lcom/yandex/metrica/impl/ob/dm$a;

    move-result-object v0

    const/16 v1, 0xe10

    .line 39
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dm$a;->a(I)Lcom/yandex/metrica/impl/ob/dm$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dm$a;->a()Lcom/yandex/metrica/impl/ob/dm;

    move-result-object v0

    .line 34
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yandex/metrica/impl/ob/de;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/fh;Lcom/yandex/metrica/impl/ob/dq;Lcom/yandex/metrica/impl/ob/dm;)V

    return-void
.end method
