.class public final Lcom/google/common/collect/HashBiMap;
.super Lcom/google/common/collect/Maps$IteratorBasedAbstractMap;
.source "HashBiMap.java"

# interfaces
.implements Lcom/google/common/collect/BiMap;
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
    emulated = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/HashBiMap$InverseSerializedForm;,
        Lcom/google/common/collect/HashBiMap$Inverse;,
        Lcom/google/common/collect/HashBiMap$KeySet;,
        Lcom/google/common/collect/HashBiMap$Itr;,
        Lcom/google/common/collect/HashBiMap$BiEntry;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/Maps$IteratorBasedAbstractMap<",
        "TK;TV;>;",
        "Lcom/google/common/collect/BiMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final LOAD_FACTOR:D = 1.0

.field private static final serialVersionUID:J
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
    .end annotation
.end field


# instance fields
.field private transient firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private transient hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private transient hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private transient inverse:Lcom/google/common/collect/BiMap;
    .annotation build Lcom/google/j2objc/annotations/RetainedWith;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/BiMap<",
            "TV;TK;>;"
        }
    .end annotation
.end field

.field private transient lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private transient mask:I

.field private transient modCount:I

.field private transient size:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/google/common/collect/Maps$IteratorBasedAbstractMap;-><init>()V

    .line 114
    invoke-direct {p0, p1}, Lcom/google/common/collect/HashBiMap;->init(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/google/common/collect/HashBiMap;)Lcom/google/common/collect/HashBiMap$BiEntry;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/common/collect/HashBiMap;)I
    .locals 0

    .line 56
    iget p0, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    return p0
.end method

.method static synthetic access$200(Lcom/google/common/collect/HashBiMap;Lcom/google/common/collect/HashBiMap$BiEntry;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/google/common/collect/HashBiMap;->delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/common/collect/HashBiMap;Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/HashBiMap;->seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/google/common/collect/HashBiMap;Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/HashBiMap;->seekByValue(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lcom/google/common/collect/HashBiMap;Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/HashBiMap;->insert(Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V

    return-void
.end method

.method static synthetic access$700(Lcom/google/common/collect/HashBiMap;)I
    .locals 0

    .line 56
    iget p0, p0, Lcom/google/common/collect/HashBiMap;->size:I

    return p0
.end method

.method static synthetic access$800(Lcom/google/common/collect/HashBiMap;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/collect/HashBiMap;->putInverse(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static create()Lcom/google/common/collect/HashBiMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/collect/HashBiMap<",
            "TK;TV;>;"
        }
    .end annotation

    const/16 v0, 0x10

    .line 63
    invoke-static {v0}, Lcom/google/common/collect/HashBiMap;->create(I)Lcom/google/common/collect/HashBiMap;

    move-result-object v0

    return-object v0
.end method

.method public static create(I)Lcom/google/common/collect/HashBiMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lcom/google/common/collect/HashBiMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 73
    new-instance v0, Lcom/google/common/collect/HashBiMap;

    invoke-direct {v0, p0}, Lcom/google/common/collect/HashBiMap;-><init>(I)V

    return-object v0
.end method

.method public static create(Ljava/util/Map;)Lcom/google/common/collect/HashBiMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)",
            "Lcom/google/common/collect/HashBiMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 81
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/collect/HashBiMap;->create(I)Lcom/google/common/collect/HashBiMap;

    move-result-object v0

    .line 82
    invoke-virtual {v0, p0}, Lcom/google/common/collect/HashBiMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method private createTable(I)[Lcom/google/common/collect/HashBiMap$BiEntry;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 359
    new-array p1, p1, [Lcom/google/common/collect/HashBiMap$BiEntry;

    return-object p1
.end method

.method private delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 134
    iget v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->keyHash:I

    iget v1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    and-int/2addr v0, v1

    .line 136
    iget-object v1, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    if-ne v1, p1, :cond_5

    if-nez v3, :cond_0

    .line 141
    iget-object v1, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    iget-object v3, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKToVBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    aput-object v3, v1, v0

    goto :goto_1

    .line 143
    :cond_0
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKToVBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object v0, v3, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKToVBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 150
    :goto_1
    iget v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->valueHash:I

    iget v1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    and-int v3, v0, v1

    .line 152
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    aget-object v0, v0, v3

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    :goto_2
    if-ne v2, p1, :cond_4

    if-nez v0, :cond_1

    .line 157
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    iget-object v1, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInVToKBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    aput-object v1, v0, v3

    goto :goto_3

    .line 159
    :cond_1
    iget-object v1, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInVToKBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object v1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInVToKBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 166
    :goto_3
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    if-nez v0, :cond_2

    .line 167
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object v0, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_4

    .line 169
    :cond_2
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iget-object v1, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object v1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 172
    :goto_4
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    if-nez v0, :cond_3

    .line 173
    iget-object p1, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object p1, p0, Lcom/google/common/collect/HashBiMap;->lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_5

    .line 175
    :cond_3
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iget-object p1, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object p1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 178
    :goto_5
    iget p1, p0, Lcom/google/common/collect/HashBiMap;->size:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/common/collect/HashBiMap;->size:I

    .line 179
    iget p1, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    return-void

    .line 154
    :cond_4
    iget-object v0, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInVToKBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    goto :goto_2

    .line 138
    :cond_5
    iget-object v3, v1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKToVBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    move-object v4, v3

    move-object v3, v1

    move-object v1, v4

    goto :goto_0
.end method

.method private init(I)V
    .locals 2

    const-string v0, "expectedSize"

    .line 118
    invoke-static {p1, v0}, Lcom/google/common/collect/CollectPreconditions;->checkNonnegative(ILjava/lang/String;)I

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 119
    invoke-static {p1, v0, v1}, Lcom/google/common/collect/Hashing;->closedTableSize(ID)I

    move-result p1

    .line 120
    invoke-direct {p0, p1}, Lcom/google/common/collect/HashBiMap;->createTable(I)[Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 121
    invoke-direct {p0, p1}, Lcom/google/common/collect/HashBiMap;->createTable(I)[Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 123
    iput-object v0, p0, Lcom/google/common/collect/HashBiMap;->lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    const/4 v0, 0x0

    .line 124
    iput v0, p0, Lcom/google/common/collect/HashBiMap;->size:I

    add-int/lit8 p1, p1, -0x1

    .line 125
    iput p1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    .line 126
    iput v0, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    return-void
.end method

.method private insert(Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V
    .locals 3
    .param p2    # Lcom/google/common/collect/HashBiMap$BiEntry;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 183
    iget v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->keyHash:I

    iget v1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    and-int/2addr v0, v1

    .line 184
    iget-object v1, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    aget-object v2, v1, v0

    iput-object v2, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKToVBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 185
    aput-object p1, v1, v0

    .line 187
    iget v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->valueHash:I

    iget v1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    and-int/2addr v0, v1

    .line 188
    iget-object v1, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    aget-object v2, v1, v0

    iput-object v2, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInVToKBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 189
    aput-object p1, v1, v0

    if-nez p2, :cond_1

    .line 192
    iget-object p2, p0, Lcom/google/common/collect/HashBiMap;->lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object p2, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    const/4 v0, 0x0

    .line 193
    iput-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    if-nez p2, :cond_0

    .line 195
    iput-object p1, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_0

    .line 197
    :cond_0
    iput-object p1, p2, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 199
    :goto_0
    iput-object p1, p0, Lcom/google/common/collect/HashBiMap;->lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_2

    .line 201
    :cond_1
    iget-object v0, p2, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 202
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    if-nez v0, :cond_2

    .line 203
    iput-object p1, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_1

    .line 205
    :cond_2
    iget-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object p1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 207
    :goto_1
    iget-object p2, p2, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object p2, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 208
    iget-object p2, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    if-nez p2, :cond_3

    .line 209
    iput-object p1, p0, Lcom/google/common/collect/HashBiMap;->lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_2

    .line 211
    :cond_3
    iget-object p2, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    iput-object p1, p2, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 215
    :goto_2
    iget p1, p0, Lcom/google/common/collect/HashBiMap;->size:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/common/collect/HashBiMap;->size:I

    .line 216
    iget p1, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    return-void
.end method

.method private put(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;Z)TV;"
        }
    .end annotation

    .line 270
    invoke-static {p1}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v0

    .line 271
    invoke-static {p2}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v1

    .line 273
    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/HashBiMap;->seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 274
    iget v3, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->valueHash:I

    if-ne v1, v3, :cond_0

    iget-object v3, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->value:Ljava/lang/Object;

    .line 276
    invoke-static {p2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object p2

    .line 280
    :cond_0
    invoke-direct {p0, p2, v1}, Lcom/google/common/collect/HashBiMap;->seekByValue(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eqz p3, :cond_1

    .line 283
    invoke-direct {p0, v3}, Lcom/google/common/collect/HashBiMap;->delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V

    goto :goto_0

    .line 285
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "value already present: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 289
    :cond_2
    :goto_0
    new-instance p3, Lcom/google/common/collect/HashBiMap$BiEntry;

    invoke-direct {p3, p1, v0, p2, v1}, Lcom/google/common/collect/HashBiMap$BiEntry;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    const/4 p1, 0x0

    if-eqz v2, :cond_3

    .line 291
    invoke-direct {p0, v2}, Lcom/google/common/collect/HashBiMap;->delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V

    .line 292
    invoke-direct {p0, p3, v2}, Lcom/google/common/collect/HashBiMap;->insert(Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V

    .line 293
    iput-object p1, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 294
    iput-object p1, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 295
    invoke-direct {p0}, Lcom/google/common/collect/HashBiMap;->rehashIfNecessary()V

    .line 296
    iget-object p1, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->value:Ljava/lang/Object;

    return-object p1

    .line 298
    :cond_3
    invoke-direct {p0, p3, p1}, Lcom/google/common/collect/HashBiMap;->insert(Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V

    .line 299
    invoke-direct {p0}, Lcom/google/common/collect/HashBiMap;->rehashIfNecessary()V

    return-object p1
.end method

.method private putInverse(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TK;Z)TK;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 306
    invoke-static {p1}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v0

    .line 307
    invoke-static {p2}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v1

    .line 309
    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/HashBiMap;->seekByValue(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 310
    iget v3, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->keyHash:I

    if-ne v1, v3, :cond_0

    iget-object v3, v2, Lcom/google/common/collect/HashBiMap$BiEntry;->key:Ljava/lang/Object;

    .line 312
    invoke-static {p2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object p2

    .line 316
    :cond_0
    invoke-direct {p0, p2, v1}, Lcom/google/common/collect/HashBiMap;->seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eqz p3, :cond_1

    .line 319
    invoke-direct {p0, v3}, Lcom/google/common/collect/HashBiMap;->delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V

    goto :goto_0

    .line 321
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "value already present: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 326
    invoke-direct {p0, v2}, Lcom/google/common/collect/HashBiMap;->delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V

    .line 328
    :cond_3
    new-instance p3, Lcom/google/common/collect/HashBiMap$BiEntry;

    invoke-direct {p3, p2, v1, p1, v0}, Lcom/google/common/collect/HashBiMap$BiEntry;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 329
    invoke-direct {p0, p3, v3}, Lcom/google/common/collect/HashBiMap;->insert(Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V

    if-eqz v3, :cond_4

    const/4 p1, 0x0

    .line 331
    iput-object p1, v3, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 332
    iput-object p1, v3, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 334
    :cond_4
    invoke-direct {p0}, Lcom/google/common/collect/HashBiMap;->rehashIfNecessary()V

    .line 335
    invoke-static {v2}, Lcom/google/common/collect/Maps;->keyOrNull(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 705
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    const/16 v0, 0x10

    .line 706
    invoke-direct {p0, v0}, Lcom/google/common/collect/HashBiMap;->init(I)V

    .line 707
    invoke-static {p1}, Lcom/google/common/collect/Serialization;->readCount(Ljava/io/ObjectInputStream;)I

    move-result v0

    .line 708
    invoke-static {p0, p1, v0}, Lcom/google/common/collect/Serialization;->populateMap(Ljava/util/Map;Ljava/io/ObjectInputStream;I)V

    return-void
.end method

.method private rehashIfNecessary()V
    .locals 5

    .line 339
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 340
    iget v1, p0, Lcom/google/common/collect/HashBiMap;->size:I

    array-length v2, v0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2, v3, v4}, Lcom/google/common/collect/Hashing;->needsResizing(IID)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 341
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    .line 343
    invoke-direct {p0, v0}, Lcom/google/common/collect/HashBiMap;->createTable(I)[Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 344
    invoke-direct {p0, v0}, Lcom/google/common/collect/HashBiMap;->createTable(I)[Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    add-int/lit8 v0, v0, -0x1

    .line 345
    iput v0, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    const/4 v0, 0x0

    .line 346
    iput v0, p0, Lcom/google/common/collect/HashBiMap;->size:I

    .line 348
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    :goto_0
    if-eqz v0, :cond_0

    .line 351
    invoke-direct {p0, v0, v0}, Lcom/google/common/collect/HashBiMap;->insert(Lcom/google/common/collect/HashBiMap$BiEntry;Lcom/google/common/collect/HashBiMap$BiEntry;)V

    .line 350
    iget-object v0, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_0

    .line 353
    :cond_0
    iget v0, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    :cond_1
    return-void
.end method

.method private seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 220
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    iget v1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    and-int/2addr v1, p2

    aget-object v0, v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 223
    iget v1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->keyHash:I

    if-ne p2, v1, :cond_0

    iget-object v1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->key:Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 222
    :cond_0
    iget-object v0, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKToVBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private seekByValue(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)",
            "Lcom/google/common/collect/HashBiMap$BiEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    iget v1, p0, Lcom/google/common/collect/HashBiMap;->mask:I

    and-int/2addr v1, p2

    aget-object v0, v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 234
    iget v1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->valueHash:I

    if-ne p2, v1, :cond_0

    iget-object v1, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->value:Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 233
    :cond_0
    iget-object v0, v0, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInVToKBucket:Lcom/google/common/collect/HashBiMap$BiEntry;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 699
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 700
    invoke-static {p0, p1}, Lcom/google/common/collect/Serialization;->writeMap(Ljava/util/Map;Ljava/io/ObjectOutputStream;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    const/4 v0, 0x0

    .line 378
    iput v0, p0, Lcom/google/common/collect/HashBiMap;->size:I

    .line 379
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableKToV:[Lcom/google/common/collect/HashBiMap$BiEntry;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 380
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->hashTableVToK:[Lcom/google/common/collect/HashBiMap$BiEntry;

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 381
    iput-object v1, p0, Lcom/google/common/collect/HashBiMap;->firstInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 382
    iput-object v1, p0, Lcom/google/common/collect/HashBiMap;->lastInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 383
    iget v0, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/collect/HashBiMap;->modCount:I

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 243
    invoke-static {p1}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/HashBiMap;->seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 248
    invoke-static {p1}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/HashBiMap;->seekByValue(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method entryIterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 472
    new-instance v0, Lcom/google/common/collect/HashBiMap$1;

    invoke-direct {v0, p0}, Lcom/google/common/collect/HashBiMap$1;-><init>(Lcom/google/common/collect/HashBiMap;)V

    return-object v0
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .line 55
    invoke-super {p0}, Lcom/google/common/collect/Maps$IteratorBasedAbstractMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public forcePut(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 266
    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/collect/HashBiMap;->put(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 254
    invoke-static {p1}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/HashBiMap;->seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object p1

    invoke-static {p1}, Lcom/google/common/collect/Maps;->valueOrNull(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public inverse()Lcom/google/common/collect/BiMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/BiMap<",
            "TV;TK;>;"
        }
    .end annotation

    .line 525
    iget-object v0, p0, Lcom/google/common/collect/HashBiMap;->inverse:Lcom/google/common/collect/BiMap;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/collect/HashBiMap$Inverse;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/common/collect/HashBiMap$Inverse;-><init>(Lcom/google/common/collect/HashBiMap;Lcom/google/common/collect/HashBiMap$1;)V

    iput-object v0, p0, Lcom/google/common/collect/HashBiMap;->inverse:Lcom/google/common/collect/BiMap;

    :cond_0
    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 432
    new-instance v0, Lcom/google/common/collect/HashBiMap$KeySet;

    invoke-direct {v0, p0}, Lcom/google/common/collect/HashBiMap$KeySet;-><init>(Lcom/google/common/collect/HashBiMap;)V

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 260
    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/collect/HashBiMap;->put(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 365
    invoke-static {p1}, Lcom/google/common/collect/Hashing;->smearedHash(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/common/collect/HashBiMap;->seekByKey(Ljava/lang/Object;I)Lcom/google/common/collect/HashBiMap$BiEntry;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 369
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/common/collect/HashBiMap;->delete(Lcom/google/common/collect/HashBiMap$BiEntry;)V

    .line 370
    iput-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->prevInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 371
    iput-object v0, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->nextInKeyInsertionOrder:Lcom/google/common/collect/HashBiMap$BiEntry;

    .line 372
    iget-object p1, p1, Lcom/google/common/collect/HashBiMap$BiEntry;->value:Ljava/lang/Object;

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 388
    iget v0, p0, Lcom/google/common/collect/HashBiMap;->size:I

    return v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .line 55
    invoke-virtual {p0}, Lcom/google/common/collect/HashBiMap;->values()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TV;>;"
        }
    .end annotation

    .line 467
    invoke-virtual {p0}, Lcom/google/common/collect/HashBiMap;->inverse()Lcom/google/common/collect/BiMap;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/collect/BiMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
