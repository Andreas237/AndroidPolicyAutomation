.class final Lcom/google/protobuf/IntArrayList;
.super Lcom/google/protobuf/AbstractProtobufList;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$IntList;
.implements Ljava/util/RandomAccess;
.implements Lcom/google/protobuf/PrimitiveNonBoxingCollection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/AbstractProtobufList<Ljava/lang/Integer;>;Lcom/google/protobuf/Internal$IntList;Ljava/util/RandomAccess;Lcom/google/protobuf/PrimitiveNonBoxingCollection;"
    }
.end annotation


# static fields
.field private static final EMPTY_LIST:Lcom/google/protobuf/IntArrayList;


# instance fields
.field private array:[I

.field private size:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Lcom/google/protobuf/IntArrayList;

    invoke-direct {v0}, Lcom/google/protobuf/IntArrayList;-><init>()V

    sput-object v0, Lcom/google/protobuf/IntArrayList;->EMPTY_LIST:Lcom/google/protobuf/IntArrayList;

    .line 50
    sget-object v0, Lcom/google/protobuf/IntArrayList;->EMPTY_LIST:Lcom/google/protobuf/IntArrayList;

    invoke-virtual {v0}, Lcom/google/protobuf/IntArrayList;->makeImmutable()V

    .line 51
    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 72
    const/16 v0, 0xa

    new-array v0, v0, [I

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/protobuf/IntArrayList;-><init>([II)V

    .line 73
    return-void
.end method

.method private constructor <init>([II)V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/google/protobuf/AbstractProtobufList;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    .line 81
    iput p2, p0, Lcom/google/protobuf/IntArrayList;->size:I

    .line 82
    return-void
.end method

.method private addInt(II)V
    .locals 6

    .line 171
    invoke-virtual {p0}, Lcom/google/protobuf/IntArrayList;->ensureIsMutable()V

    .line 172
    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    if-le p1, v0, :cond_1

    .line 173
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/protobuf/IntArrayList;->makeOutOfBoundsExceptionMessage(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 176
    :cond_1
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    iget-object v1, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 178
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    iget-object v1, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lcom/google/protobuf/IntArrayList;->size:I

    sub-int/2addr v3, p1

    invoke-static {v0, p1, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 181
    :cond_2
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v4, v0, 0x1

    .line 182
    new-array v5, v4, [I

    .line 185
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v5, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 188
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    add-int/lit8 v1, p1, 0x1

    iget v2, p0, Lcom/google/protobuf/IntArrayList;->size:I

    sub-int/2addr v2, p1

    invoke-static {v0, p1, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 189
    iput-object v5, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    .line 192
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aput p2, v0, p1

    .line 193
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    .line 194
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    .line 195
    return-void
.end method

.method public static emptyList()Lcom/google/protobuf/IntArrayList;
    .locals 1

    .line 54
    sget-object v0, Lcom/google/protobuf/IntArrayList;->EMPTY_LIST:Lcom/google/protobuf/IntArrayList;

    return-object v0
.end method

.method private ensureIndexInRange(I)V
    .locals 2

    .line 262
    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    if-lt p1, v0, :cond_1

    .line 263
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/protobuf/IntArrayList;->makeOutOfBoundsExceptionMessage(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_1
    return-void
.end method

.method private makeOutOfBoundsExceptionMessage(I)Ljava/lang/String;
    .locals 2

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Size:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/protobuf/IntArrayList;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public add(ILjava/lang/Integer;)V
    .locals 1

    .line 156
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/IntArrayList;->addInt(II)V

    .line 157
    return-void
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 1

    .line 45
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/IntArrayList;->add(ILjava/lang/Integer;)V

    return-void
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<+Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 199
    invoke-virtual {p0}, Lcom/google/protobuf/IntArrayList;->ensureIsMutable()V

    .line 201
    invoke-static {p1}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    instance-of v0, p1, Lcom/google/protobuf/IntArrayList;

    if-nez v0, :cond_0

    .line 205
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractProtobufList;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0

    .line 208
    :cond_0
    move-object v5, p1

    check-cast v5, Lcom/google/protobuf/IntArrayList;

    .line 209
    iget v0, v5, Lcom/google/protobuf/IntArrayList;->size:I

    if-nez v0, :cond_1

    .line 210
    const/4 v0, 0x0

    return v0

    .line 213
    :cond_1
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    const v1, 0x7fffffff

    sub-int v6, v1, v0

    .line 214
    iget v0, v5, Lcom/google/protobuf/IntArrayList;->size:I

    if-ge v6, v0, :cond_2

    .line 216
    new-instance v0, Ljava/lang/OutOfMemoryError;

    invoke-direct {v0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw v0

    .line 219
    :cond_2
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    iget v1, v5, Lcom/google/protobuf/IntArrayList;->size:I

    add-int v7, v0, v1

    .line 220
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    array-length v0, v0

    if-le v7, v0, :cond_3

    .line 221
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    .line 224
    :cond_3
    iget-object v0, v5, Lcom/google/protobuf/IntArrayList;->array:[I

    iget-object v1, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    iget v2, p0, Lcom/google/protobuf/IntArrayList;->size:I

    iget v3, v5, Lcom/google/protobuf/IntArrayList;->size:I

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 225
    iput v7, p0, Lcom/google/protobuf/IntArrayList;->size:I

    .line 226
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    .line 227
    const/4 v0, 0x1

    return v0
.end method

.method public addInt(I)V
    .locals 1

    .line 164
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    invoke-direct {p0, v0, p1}, Lcom/google/protobuf/IntArrayList;->addInt(II)V

    .line 165
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 86
    if-ne p0, p1, :cond_0

    .line 87
    const/4 v0, 0x1

    return v0

    .line 89
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/IntArrayList;

    if-nez v0, :cond_1

    .line 90
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractProtobufList;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 92
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/IntArrayList;

    .line 93
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    iget v1, v2, Lcom/google/protobuf/IntArrayList;->size:I

    if-eq v0, v1, :cond_2

    .line 94
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_2
    iget-object v3, v2, Lcom/google/protobuf/IntArrayList;->array:[I

    .line 98
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    if-ge v4, v0, :cond_4

    .line 99
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aget v0, v0, v4

    aget v1, v3, v4

    if-eq v0, v1, :cond_3

    .line 100
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 104
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public get(I)Ljava/lang/Integer;
    .locals 1

    .line 126
    invoke-virtual {p0, p1}, Lcom/google/protobuf/IntArrayList;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lcom/google/protobuf/IntArrayList;->get(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getInt(I)I
    .locals 1

    .line 131
    invoke-direct {p0, p1}, Lcom/google/protobuf/IntArrayList;->ensureIndexInRange(I)V

    .line 132
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aget v0, v0, p1

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 109
    const/4 v2, 0x1

    .line 110
    const/4 v3, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    if-ge v3, v0, :cond_0

    .line 111
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aget v1, v1, v3

    add-int v2, v0, v1

    .line 110
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 113
    :cond_0
    return v2
.end method

.method public mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$IntList;
    .locals 3

    .line 118
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    if-ge p1, v0, :cond_0

    .line 119
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 121
    :cond_0
    new-instance v0, Lcom/google/protobuf/IntArrayList;

    iget-object v1, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iget v2, p0, Lcom/google/protobuf/IntArrayList;->size:I

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/IntArrayList;-><init>([II)V

    return-object v0
.end method

.method public bridge synthetic mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$ProtobufList;
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lcom/google/protobuf/IntArrayList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$IntList;

    move-result-object v0

    return-object v0
.end method

.method public remove(I)Ljava/lang/Integer;
    .locals 5

    .line 246
    invoke-virtual {p0}, Lcom/google/protobuf/IntArrayList;->ensureIsMutable()V

    .line 247
    invoke-direct {p0, p1}, Lcom/google/protobuf/IntArrayList;->ensureIndexInRange(I)V

    .line 248
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aget v4, v0, p1

    .line 249
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    add-int/lit8 v1, p1, 0x1

    iget-object v2, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    iget v3, p0, Lcom/google/protobuf/IntArrayList;->size:I

    sub-int/2addr v3, p1

    invoke-static {v0, v1, v2, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 250
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    .line 251
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    .line 252
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lcom/google/protobuf/IntArrayList;->remove(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 5

    .line 232
    invoke-virtual {p0}, Lcom/google/protobuf/IntArrayList;->ensureIsMutable()V

    .line 233
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    if-ge v4, v0, :cond_1

    .line 234
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    add-int/lit8 v1, v4, 0x1

    iget-object v2, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    iget v3, p0, Lcom/google/protobuf/IntArrayList;->size:I

    sub-int/2addr v3, v4

    invoke-static {v0, v1, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 236
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    .line 237
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/IntArrayList;->modCount:I

    .line 238
    const/4 v0, 0x1

    return v0

    .line 233
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 241
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public set(ILjava/lang/Integer;)Ljava/lang/Integer;
    .locals 1

    .line 142
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/IntArrayList;->setInt(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 45
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/IntArrayList;->set(ILjava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public setInt(II)I
    .locals 2

    .line 147
    invoke-virtual {p0}, Lcom/google/protobuf/IntArrayList;->ensureIsMutable()V

    .line 148
    invoke-direct {p0, p1}, Lcom/google/protobuf/IntArrayList;->ensureIndexInRange(I)V

    .line 149
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aget v1, v0, p1

    .line 150
    iget-object v0, p0, Lcom/google/protobuf/IntArrayList;->array:[I

    aput p2, v0, p1

    .line 151
    return v1
.end method

.method public size()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/google/protobuf/IntArrayList;->size:I

    return v0
.end method
