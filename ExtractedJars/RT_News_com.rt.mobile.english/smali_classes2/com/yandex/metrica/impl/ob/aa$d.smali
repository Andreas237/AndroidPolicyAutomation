.class Lcom/yandex/metrica/impl/ob/aa$d;
.super Lcom/yandex/metrica/impl/ob/aa$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V
    .locals 0

    .line 360
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/aa$g;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V

    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 2

    .line 365
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aa$d;->e()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 366
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ff;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected b()V
    .locals 2

    .line 372
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aa$d;->c()Lcom/yandex/metrica/impl/ob/hx;

    move-result-object v0

    .line 374
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aa$d;->e()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v1

    instance-of v1, v1, Lcom/yandex/metrica/impl/ob/ah;

    if-eqz v1, :cond_0

    .line 375
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hx;->c()V

    return-void

    .line 377
    :cond_0
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hx;->b()V

    return-void
.end method
