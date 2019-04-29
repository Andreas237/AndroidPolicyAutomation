.class Lcom/yandex/metrica/impl/bk$1;
.super Landroid/util/SparseArray;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/bk;->a()Landroid/util/SparseArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/SparseArray<",
        "Lcom/yandex/metrica/impl/ak$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    .line 59
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    .line 61
    new-instance v0, Lcom/yandex/metrica/impl/bk$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/bk$b;-><init>(B)V

    const/16 v2, 0x1d

    invoke-virtual {p0, v2, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    .line 62
    new-instance v0, Lcom/yandex/metrica/impl/bk$c;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/bk$c;-><init>(B)V

    const/16 v1, 0x27

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    .line 64
    new-instance v0, Lcom/yandex/metrica/impl/bk$d;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bk$d;-><init>()V

    const/16 v1, 0x2e

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    .line 65
    new-instance v0, Lcom/yandex/metrica/impl/bk$e;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bk$e;-><init>()V

    const/16 v1, 0x3c

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    .line 67
    new-instance v0, Lcom/yandex/metrica/impl/bk$f;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bk$f;-><init>()V

    const/16 v1, 0x3e

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    .line 69
    new-instance v0, Lcom/yandex/metrica/impl/bk$g;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bk$g;-><init>()V

    const/16 v1, 0x42

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    .line 70
    new-instance v0, Lcom/yandex/metrica/impl/bk$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bk$a;-><init>()V

    const/16 v1, 0x43

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/bk$1;->put(ILjava/lang/Object;)V

    return-void
.end method
