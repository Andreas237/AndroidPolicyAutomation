.class Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView$1;
.super Lcom/google/common/collect/AbstractObjectCountMap$Itr;
.source "ObjectCountHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/AbstractObjectCountMap<",
        "TK;>.Itr<",
        "Lcom/google/common/collect/Multiset$Entry<",
        "TK;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;


# direct methods
.method constructor <init>(Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView$1;->this$1:Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;

    iget-object p1, p1, Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;->this$0:Lcom/google/common/collect/ObjectCountHashMap;

    invoke-direct {p0, p1}, Lcom/google/common/collect/AbstractObjectCountMap$Itr;-><init>(Lcom/google/common/collect/AbstractObjectCountMap;)V

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

    .line 403
    new-instance v0, Lcom/google/common/collect/AbstractObjectCountMap$MapEntry;

    iget-object v1, p0, Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView$1;->this$1:Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;

    iget-object v1, v1, Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView;->this$0:Lcom/google/common/collect/ObjectCountHashMap;

    invoke-direct {v0, v1, p1}, Lcom/google/common/collect/AbstractObjectCountMap$MapEntry;-><init>(Lcom/google/common/collect/AbstractObjectCountMap;I)V

    return-object v0
.end method

.method bridge synthetic getOutput(I)Ljava/lang/Object;
    .locals 0

    .line 400
    invoke-virtual {p0, p1}, Lcom/google/common/collect/ObjectCountHashMap$HashEntrySetView$1;->getOutput(I)Lcom/google/common/collect/Multiset$Entry;

    move-result-object p1

    return-object p1
.end method
