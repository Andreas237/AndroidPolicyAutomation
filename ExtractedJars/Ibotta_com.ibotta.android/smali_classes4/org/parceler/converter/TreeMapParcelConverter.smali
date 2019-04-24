.class public abstract Lorg/parceler/converter/TreeMapParcelConverter;
.super Lorg/parceler/converter/MapParcelConverter;
.source "TreeMapParcelConverter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/parceler/converter/MapParcelConverter<",
        "TK;TV;",
        "Ljava/util/TreeMap<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lorg/parceler/converter/MapParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createMap()Ljava/util/Map;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lorg/parceler/converter/TreeMapParcelConverter;->createMap()Ljava/util/TreeMap;

    move-result-object v0

    return-object v0
.end method

.method public createMap()Ljava/util/TreeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/TreeMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 28
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    return-object v0
.end method
