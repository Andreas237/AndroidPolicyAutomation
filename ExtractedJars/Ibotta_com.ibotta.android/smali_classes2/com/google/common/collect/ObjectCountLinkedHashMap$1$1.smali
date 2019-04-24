.class Lcom/google/common/collect/ObjectCountLinkedHashMap$1$1;
.super Lcom/google/common/collect/ObjectCountLinkedHashMap$LinkedItr;
.source "ObjectCountLinkedHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/ObjectCountLinkedHashMap$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/ObjectCountLinkedHashMap<",
        "TK;>.",
        "LinkedItr<",
        "TK;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/common/collect/ObjectCountLinkedHashMap$1;


# direct methods
.method constructor <init>(Lcom/google/common/collect/ObjectCountLinkedHashMap$1;)V
    .locals 1

    .line 227
    iput-object p1, p0, Lcom/google/common/collect/ObjectCountLinkedHashMap$1$1;->this$1:Lcom/google/common/collect/ObjectCountLinkedHashMap$1;

    iget-object p1, p1, Lcom/google/common/collect/ObjectCountLinkedHashMap$1;->this$0:Lcom/google/common/collect/ObjectCountLinkedHashMap;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/ObjectCountLinkedHashMap$LinkedItr;-><init>(Lcom/google/common/collect/ObjectCountLinkedHashMap;Lcom/google/common/collect/ObjectCountLinkedHashMap$1;)V

    return-void
.end method


# virtual methods
.method getOutput(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/google/common/collect/ObjectCountLinkedHashMap$1$1;->this$1:Lcom/google/common/collect/ObjectCountLinkedHashMap$1;

    iget-object v0, v0, Lcom/google/common/collect/ObjectCountLinkedHashMap$1;->this$0:Lcom/google/common/collect/ObjectCountLinkedHashMap;

    iget-object v0, v0, Lcom/google/common/collect/ObjectCountLinkedHashMap;->keys:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method
