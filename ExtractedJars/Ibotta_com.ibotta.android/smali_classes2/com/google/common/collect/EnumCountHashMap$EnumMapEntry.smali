.class Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;
.super Lcom/google/common/collect/AbstractObjectCountMap$MapEntry;
.source "EnumCountHashMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/EnumCountHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "EnumMapEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/AbstractObjectCountMap<",
        "TK;>.MapEntry;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/common/collect/EnumCountHashMap;


# direct methods
.method constructor <init>(Lcom/google/common/collect/EnumCountHashMap;I)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    .line 152
    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/AbstractObjectCountMap$MapEntry;-><init>(Lcom/google/common/collect/AbstractObjectCountMap;I)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    iget-object v0, v0, Lcom/google/common/collect/EnumCountHashMap;->values:[I

    iget v1, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->lastKnownIndex:I

    aget v0, v0, v1

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    iget-object v0, v0, Lcom/google/common/collect/EnumCountHashMap;->values:[I

    iget v1, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->lastKnownIndex:I

    aget v0, v0, v1

    :goto_0
    return v0
.end method

.method public setCount(I)I
    .locals 5

    .line 164
    iget-object v0, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    iget-object v0, v0, Lcom/google/common/collect/EnumCountHashMap;->values:[I

    iget v1, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->lastKnownIndex:I

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 165
    iget-object v0, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    iget-object v2, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->key:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Enum;

    invoke-virtual {v0, v2, p1}, Lcom/google/common/collect/EnumCountHashMap;->put(Ljava/lang/Enum;I)I

    return v1

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    iget-object v0, v0, Lcom/google/common/collect/EnumCountHashMap;->values:[I

    iget v3, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->lastKnownIndex:I

    aget v0, v0, v3

    .line 169
    iget-object v3, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->this$0:Lcom/google/common/collect/EnumCountHashMap;

    iget-object v3, v3, Lcom/google/common/collect/EnumCountHashMap;->values:[I

    iget v4, p0, Lcom/google/common/collect/EnumCountHashMap$EnumMapEntry;->lastKnownIndex:I

    aput p1, v3, v4

    if-ne v0, v2, :cond_1

    const/4 v0, 0x0

    :cond_1
    return v0
.end method
