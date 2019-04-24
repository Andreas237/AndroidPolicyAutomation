.class public abstract Lorg/parceler/converter/SparseArrayParcelConverter;
.super Ljava/lang/Object;
.source "SparseArrayParcelConverter.java"

# interfaces
.implements Lorg/parceler/ParcelConverter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/parceler/ParcelConverter<",
        "Landroid/util/SparseArray<",
        "TT;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public fromParcel(Landroid/os/Parcel;)Landroid/util/SparseArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Landroid/util/SparseArray<",
            "TT;>;"
        }
    .end annotation

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 46
    :cond_0
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 49
    invoke-virtual {p0, p1}, Lorg/parceler/converter/SparseArrayParcelConverter;->itemFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic fromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lorg/parceler/converter/SparseArrayParcelConverter;->fromParcel(Landroid/os/Parcel;)Landroid/util/SparseArray;

    move-result-object p1

    return-object p1
.end method

.method public abstract itemFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract itemToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/os/Parcel;",
            ")V"
        }
    .end annotation
.end method

.method public toParcel(Landroid/util/SparseArray;Landroid/os/Parcel;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "TT;>;",
            "Landroid/os/Parcel;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, -0x1

    .line 29
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    .line 32
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 33
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lorg/parceler/converter/SparseArrayParcelConverter;->itemToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public bridge synthetic toParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 25
    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/converter/SparseArrayParcelConverter;->toParcel(Landroid/util/SparseArray;Landroid/os/Parcel;)V

    return-void
.end method
