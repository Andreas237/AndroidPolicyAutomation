.class Lcom/google/common/collect/EnumCountHashMap$2$1;
.super Lcom/google/common/collect/EnumCountHashMap$EnumIterator;
.source "EnumCountHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/EnumCountHashMap$2;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/EnumCountHashMap<",
        "TK;>.EnumIterator<",
        "Lcom/google/common/collect/Multiset$Entry<",
        "TK;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/common/collect/EnumCountHashMap$2;


# direct methods
.method constructor <init>(Lcom/google/common/collect/EnumCountHashMap$2;)V
    .locals 1

    .line 180
    iput-object p1, p0, Lcom/google/common/collect/EnumCountHashMap$2$1;->this$1:Lcom/google/common/collect/EnumCountHashMap$2;

    iget-object p1, p1, Lcom/google/common/collect/EnumCountHashMap$2;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/EnumCountHashMap$EnumIterator;-><init>(Lcom/google/common/collect/EnumCountHashMap;Lcom/google/common/collect/EnumCountHashMap$1;)V

    return-void
.end method


# virtual methods
.method getOutput(I)Lcom/google/common/collect/Multiset$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/collect/Multiset$Entry<",
            "TK;>;"
        }
    .end annotation

    .line 183
    new-instance v0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;

    iget-object v1, p0, Lcom/google/common/collect/EnumCountHashMap$2$1;->this$1:Lcom/google/common/collect/EnumCountHashMap$2;

    iget-object v1, v1, Lcom/google/common/collect/EnumCountHashMap$2;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    invoke-direct {v0, v1, p1}, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;-><init>(Lcom/google/common/collect/EnumCountHashMap;I)V

    return-object v0
.end method

.method bridge synthetic getOutput(I)Ljava/lang/Object;
    .locals 0

    .line 180
    invoke-virtual {p0, p1}, Lcom/google/common/collect/EnumCountHashMap$2$1;->getOutput(I)Lcom/google/common/collect/Multiset$Entry;

    move-result-object p1

    return-object p1
.end method
