.class final Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$2;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$Itr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->entryIterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.Itr<Ljava/util/Map$Entry<TK;TV;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)V
    .locals 0

    .line 1214
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$Itr;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)V

    return-void
.end method


# virtual methods
.method final synthetic output(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1214
    move-object v2, p2

    .line 2217
    move-object v1, p1

    invoke-static {p1, v2}, Lcom/squareup/haha/guava/collect/Maps;->immutableEntry(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    .line 1214
    return-object v0
.end method
