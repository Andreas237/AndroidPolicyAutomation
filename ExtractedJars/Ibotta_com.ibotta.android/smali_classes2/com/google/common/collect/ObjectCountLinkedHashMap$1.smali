.class Lcom/google/common/collect/ObjectCountLinkedHashMap$1;
.super Lcom/google/common/collect/AbstractObjectCountMap$KeySetView;
.source "ObjectCountLinkedHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/ObjectCountLinkedHashMap;->createKeySet()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/AbstractObjectCountMap<",
        "TK;>.KeySetView;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/common/collect/ObjectCountLinkedHashMap;


# direct methods
.method constructor <init>(Lcom/google/common/collect/ObjectCountLinkedHashMap;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/google/common/collect/ObjectCountLinkedHashMap$1;->this$0:Lcom/google/common/collect/ObjectCountLinkedHashMap;

    invoke-direct {p0, p1}, Lcom/google/common/collect/AbstractObjectCountMap$KeySetView;-><init>(Lcom/google/common/collect/AbstractObjectCountMap;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    .line 227
    new-instance v0, Lcom/google/common/collect/ObjectCountLinkedHashMap$1$1;

    invoke-direct {v0, p0}, Lcom/google/common/collect/ObjectCountLinkedHashMap$1$1;-><init>(Lcom/google/common/collect/ObjectCountLinkedHashMap$1;)V

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 217
    invoke-static {p0}, Lcom/google/common/collect/ObjectArrays;->toArrayImpl(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 222
    invoke-static {p0, p1}, Lcom/google/common/collect/ObjectArrays;->toArrayImpl(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
