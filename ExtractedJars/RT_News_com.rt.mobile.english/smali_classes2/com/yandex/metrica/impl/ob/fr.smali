.class public Lcom/yandex/metrica/impl/ob/fr;
.super Lcom/yandex/metrica/impl/ob/fl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/fl<",
        "Lcom/yandex/metrica/impl/ob/jj$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/fl;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/yandex/metrica/impl/ob/e;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 9
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/fr;->c()Lcom/yandex/metrica/impl/ob/jj$a;

    move-result-object v0

    return-object v0
.end method

.method public a([B)Lcom/yandex/metrica/impl/ob/jj$a;
    .locals 1
    .param p1    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2436
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a;-><init>()V

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;[B)Lcom/yandex/metrica/impl/ob/e;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a;

    return-object p1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 9
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/fr;->c()Lcom/yandex/metrica/impl/ob/jj$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b([B)Ljava/lang/Object;
    .locals 0
    .param p1    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fr;->a([B)Lcom/yandex/metrica/impl/ob/jj$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Lcom/yandex/metrica/impl/ob/jj$a;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a;-><init>()V

    .line 21
    new-instance v1, Lcom/yandex/metrica/impl/ob/jj$a$b;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/jj$a$b;-><init>()V

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->j:Lcom/yandex/metrica/impl/ob/jj$a$b;

    return-object v0
.end method
