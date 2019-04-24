.class Lcom/google/common/collect/EnumCountHashMap$2;
.super Lcom/google/common/collect/AbstractObjectCountMap$EntrySetView;
.source "EnumCountHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/EnumCountHashMap;->createEntrySet()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/AbstractObjectCountMap<",
        "TK;>.EntrySetView;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/common/collect/EnumCountHashMap;


# direct methods
.method constructor <init>(Lcom/google/common/collect/EnumCountHashMap;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/google/common/collect/EnumCountHashMap$2;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    invoke-direct {p0, p1}, Lcom/google/common/collect/AbstractObjectCountMap$EntrySetView;-><init>(Lcom/google/common/collect/AbstractObjectCountMap;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/google/common/collect/Multiset$Entry<",
            "TK;>;>;"
        }
    .end annotation

    .line 180
    new-instance v0, Lcom/google/common/collect/EnumCountHashMap$2$1;

    invoke-direct {v0, p0}, Lcom/google/common/collect/EnumCountHashMap$2$1;-><init>(Lcom/google/common/collect/EnumCountHashMap$2;)V

    return-object v0
.end method
