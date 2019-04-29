.class public abstract Lcom/yandex/metrica/impl/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ak$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Lcom/yandex/metrica/impl/ob/ic;)I
.end method

.method abstract a()Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ak$a;",
            ">;"
        }
    .end annotation
.end method

.method public a(Landroid/content/Context;)V
    .locals 5

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/ob/ic;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ic;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ak;->a(Lcom/yandex/metrica/impl/ob/ic;)I

    move-result v1

    .line 29
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ak;->b()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 1048
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ak;->a()Landroid/util/SparseArray;

    move-result-object v3

    :goto_0
    if-gt v1, v2, :cond_1

    .line 1050
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/ak$a;

    if-eqz v4, :cond_0

    .line 1053
    invoke-interface {v4, p1}, Lcom/yandex/metrica/impl/ak$a;->a(Landroid/content/Context;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0, v0, v2}, Lcom/yandex/metrica/impl/ak;->a(Lcom/yandex/metrica/impl/ob/ic;I)V

    .line 35
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ic;->j()V

    :cond_2
    return-void
.end method

.method protected abstract a(Lcom/yandex/metrica/impl/ob/ic;I)V
.end method

.method b()I
    .locals 1

    .line 40
    invoke-static {}, Lcom/yandex/metrica/YandexMetrica;->getLibraryApiLevel()I

    move-result v0

    return v0
.end method
