.class public abstract Lorg/parceler/converter/LinkedHashMapParcelConverter;
.super Lorg/parceler/converter/MapParcelConverter;
.source "LinkedHashMapParcelConverter.java"


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
        "Ljava/util/LinkedHashMap<",
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
.method public createMap()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 28
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method

.method public bridge synthetic createMap()Ljava/util/Map;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lorg/parceler/converter/LinkedHashMapParcelConverter;->createMap()Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method
