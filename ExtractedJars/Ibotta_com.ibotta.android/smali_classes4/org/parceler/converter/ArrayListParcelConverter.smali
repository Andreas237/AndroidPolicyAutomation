.class public abstract Lorg/parceler/converter/ArrayListParcelConverter;
.super Lorg/parceler/converter/CollectionParcelConverter;
.source "ArrayListParcelConverter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/parceler/converter/CollectionParcelConverter<",
        "TT;",
        "Ljava/util/ArrayList<",
        "TT;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lorg/parceler/converter/CollectionParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public createCollection()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "TT;>;"
        }
    .end annotation

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public bridge synthetic createCollection()Ljava/util/Collection;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lorg/parceler/converter/ArrayListParcelConverter;->createCollection()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
