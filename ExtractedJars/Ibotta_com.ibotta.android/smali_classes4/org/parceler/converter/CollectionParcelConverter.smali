.class public abstract Lorg/parceler/converter/CollectionParcelConverter;
.super Ljava/lang/Object;
.source "CollectionParcelConverter.java"

# interfaces
.implements Lorg/parceler/TypeRangeParcelConverter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "C::",
        "Ljava/util/Collection<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lorg/parceler/TypeRangeParcelConverter<",
        "Ljava/util/Collection<",
        "TT;>;TC;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract createCollection()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation
.end method

.method public bridge synthetic fromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lorg/parceler/converter/CollectionParcelConverter;->fromParcel(Landroid/os/Parcel;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public fromParcel(Landroid/os/Parcel;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TC;"
        }
    .end annotation

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 50
    :cond_0
    invoke-virtual {p0}, Lorg/parceler/converter/CollectionParcelConverter;->createCollection()Ljava/util/Collection;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 52
    invoke-virtual {p0, p1}, Lorg/parceler/converter/CollectionParcelConverter;->itemFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_1
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

.method public bridge synthetic toParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 27
    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/converter/CollectionParcelConverter;->toParcel(Ljava/util/Collection;Landroid/os/Parcel;)V

    return-void
.end method

.method public toParcel(Ljava/util/Collection;Landroid/os/Parcel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;",
            "Landroid/os/Parcel;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, -0x1

    .line 34
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 36
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 38
    invoke-virtual {p0, v0, p2}, Lorg/parceler/converter/CollectionParcelConverter;->itemToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
