.class public abstract Lorg/parceler/converter/MapParcelConverter;
.super Ljava/lang/Object;
.source "MapParcelConverter.java"

# interfaces
.implements Lorg/parceler/TypeRangeParcelConverter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "M::",
        "Ljava/util/Map<",
        "TK;TV;>;>",
        "Ljava/lang/Object;",
        "Lorg/parceler/TypeRangeParcelConverter<",
        "Ljava/util/Map<",
        "TK;TV;>;TM;>;"
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
.method public abstract createMap()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation
.end method

.method public bridge synthetic fromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lorg/parceler/converter/MapParcelConverter;->fromParcel(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public fromParcel(Landroid/os/Parcel;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TM;"
        }
    .end annotation

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 51
    :cond_0
    invoke-virtual {p0}, Lorg/parceler/converter/MapParcelConverter;->createMap()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 53
    invoke-virtual {p0, p1}, Lorg/parceler/converter/MapParcelConverter;->mapKeyFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    .line 54
    invoke-virtual {p0, p1}, Lorg/parceler/converter/MapParcelConverter;->mapValueFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    .line 55
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_1
    return-object p1
.end method

.method public abstract mapKeyFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TK;"
        }
    .end annotation
.end method

.method public abstract mapKeyToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Landroid/os/Parcel;",
            ")V"
        }
    .end annotation
.end method

.method public abstract mapValueFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TV;"
        }
    .end annotation
.end method

.method public abstract mapValueToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Landroid/os/Parcel;",
            ")V"
        }
    .end annotation
.end method

.method public bridge synthetic toParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 27
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/converter/MapParcelConverter;->toParcel(Ljava/util/Map;Landroid/os/Parcel;)V

    return-void
.end method

.method public toParcel(Ljava/util/Map;Landroid/os/Parcel;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;TV;>;",
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
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 38
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lorg/parceler/converter/MapParcelConverter;->mapKeyToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V

    .line 39
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lorg/parceler/converter/MapParcelConverter;->mapValueToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
