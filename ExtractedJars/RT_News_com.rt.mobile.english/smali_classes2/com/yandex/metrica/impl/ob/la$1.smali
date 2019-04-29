.class final Lcom/yandex/metrica/impl/ob/la$1;
.super Landroid/util/SparseArray;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/la;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/SparseArray<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 6

    .line 30
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 32
    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "1xRTT"

    const/4 v1, 0x7

    .line 33
    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "CDMA"

    const/4 v1, 0x4

    .line 34
    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "EDGE"

    const/4 v1, 0x2

    .line 35
    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "eHRPD"

    const/16 v1, 0xe

    .line 36
    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "EVDO rev.0"

    const/4 v2, 0x5

    .line 37
    invoke-virtual {p0, v2, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "EVDO rev.A"

    const/4 v2, 0x6

    .line 38
    invoke-virtual {p0, v2, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "EVDO rev.B"

    const/16 v2, 0xc

    .line 39
    invoke-virtual {p0, v2, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "GPRS"

    const/4 v3, 0x1

    .line 40
    invoke-virtual {p0, v3, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "HSDPA"

    const/16 v3, 0x8

    .line 41
    invoke-virtual {p0, v3, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "HSPA"

    const/16 v3, 0xa

    .line 42
    invoke-virtual {p0, v3, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "HSPA+"

    const/16 v3, 0xf

    .line 43
    invoke-virtual {p0, v3, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "HSUPA"

    const/16 v4, 0x9

    .line 44
    invoke-virtual {p0, v4, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "iDen"

    const/16 v4, 0xb

    .line 45
    invoke-virtual {p0, v4, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "UMTS"

    const/4 v5, 0x3

    .line 46
    invoke-virtual {p0, v5, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "EVDO rev.B"

    .line 48
    invoke-virtual {p0, v2, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    .line 49
    invoke-static {v4}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "eHRPD"

    .line 50
    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    const-string v0, "LTE"

    const/16 v1, 0xd

    .line 51
    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    .line 52
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HSPA+"

    .line 53
    invoke-virtual {p0, v3, v0}, Lcom/yandex/metrica/impl/ob/la$1;->put(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
