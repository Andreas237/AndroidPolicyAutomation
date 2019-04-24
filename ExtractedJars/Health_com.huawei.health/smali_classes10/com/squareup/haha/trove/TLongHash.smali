.class public abstract Lcom/squareup/haha/trove/TLongHash;
.super Lcom/squareup/haha/trove/TPrimitiveHash;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TLongHashingStrategy;


# instance fields
.field protected _hashingStrategy:Lcom/squareup/haha/trove/TLongHashingStrategy;

.field protected transient _set:[J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/squareup/haha/trove/TPrimitiveHash;-><init>()V

    .line 43
    iput-object p0, p0, Lcom/squareup/haha/trove/TLongHash;->_hashingStrategy:Lcom/squareup/haha/trove/TLongHashingStrategy;

    .line 44
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .line 112
    invoke-super {p0}, Lcom/squareup/haha/trove/TPrimitiveHash;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/squareup/haha/trove/TLongHash;

    .line 113
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    invoke-virtual {v0}, [J->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    iput-object v0, v1, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    .line 114
    return-object v1
.end method

.method public final computeHashCode(J)I
    .locals 4

    .line 259
    .line 2078
    move-wide v2, p1

    const/16 v0, 0x20

    shr-long v0, v2, v0

    xor-long/2addr v0, p1

    long-to-int v0, v0

    .line 259
    return v0
.end method

.method public final contains(J)Z
    .locals 11

    .line 138
    move-wide v3, p1

    .line 1177
    move-object v2, p0

    iget-object v5, p0, Lcom/squareup/haha/trove/TLongHash;->_states:[B

    .line 1178
    iget-object v6, v2, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    .line 1179
    array-length v7, v5

    .line 1180
    iget-object v0, v2, Lcom/squareup/haha/trove/TLongHash;->_hashingStrategy:Lcom/squareup/haha/trove/TLongHashingStrategy;

    invoke-interface {v0, v3, v4}, Lcom/squareup/haha/trove/TLongHashingStrategy;->computeHashCode(J)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 1181
    move v8, v0

    rem-int v9, v0, v7

    .line 1183
    aget-byte v0, v5, v9

    if-eqz v0, :cond_3

    aget-byte v0, v5, v9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    aget-wide v0, v6, v9

    cmp-long v0, v0, v3

    if-eqz v0, :cond_3

    .line 1186
    :cond_0
    add-int/lit8 v0, v7, -0x2

    rem-int v0, v8, v0

    add-int/lit8 v10, v0, 0x1

    .line 1189
    :cond_1
    sub-int v0, v9, v10

    .line 1190
    move v9, v0

    if-gez v0, :cond_2

    .line 1191
    add-int/2addr v9, v7

    .line 1193
    :cond_2
    aget-byte v0, v5, v9

    if-eqz v0, :cond_3

    aget-byte v0, v5, v9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    aget-wide v0, v6, v9

    cmp-long v0, v0, v3

    if-nez v0, :cond_1

    .line 1197
    :cond_3
    aget-byte v0, v5, v9

    if-nez v0, :cond_4

    const/4 v0, -0x1

    goto :goto_0

    :cond_4
    move v0, v9

    .line 138
    :goto_0
    if-ltz v0, :cond_5

    const/4 v0, 0x1

    return v0

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public final forEach(Lcom/squareup/haha/trove/TLongProcedure;)Z
    .locals 5

    .line 149
    iget-object v2, p0, Lcom/squareup/haha/trove/TLongHash;->_states:[B

    .line 150
    iget-object v3, p0, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    .line 151
    array-length v4, v3

    :cond_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 152
    aget-byte v0, v2, v4

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    aget-wide v0, v3, v4

    invoke-interface {p1, v0, v1}, Lcom/squareup/haha/trove/TLongProcedure;->execute(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    const/4 v0, 0x0

    return v0

    .line 156
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected final insertionIndex(J)I
    .locals 9

    .line 209
    iget-object v2, p0, Lcom/squareup/haha/trove/TLongHash;->_states:[B

    .line 210
    iget-object v3, p0, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    .line 211
    array-length v4, v2

    .line 212
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHash;->_hashingStrategy:Lcom/squareup/haha/trove/TLongHashingStrategy;

    invoke-interface {v0, p1, p2}, Lcom/squareup/haha/trove/TLongHashingStrategy;->computeHashCode(J)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 213
    move v5, v0

    rem-int v6, v0, v4

    .line 215
    aget-byte v0, v2, v6

    if-nez v0, :cond_0

    .line 216
    return v6

    .line 217
    :cond_0
    aget-byte v0, v2, v6

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    aget-wide v0, v3, v6

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    .line 218
    neg-int v0, v6

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 221
    :cond_1
    add-int/lit8 v0, v4, -0x2

    rem-int v0, v5, v0

    add-int/lit8 v7, v0, 0x1

    .line 225
    :cond_2
    sub-int v0, v6, v7

    .line 226
    move v6, v0

    if-gez v0, :cond_3

    .line 227
    add-int/2addr v6, v4

    .line 229
    :cond_3
    aget-byte v0, v2, v6

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    aget-wide v0, v3, v6

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    .line 234
    :cond_4
    aget-byte v0, v2, v6

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    .line 235
    move v8, v6

    .line 236
    :cond_5
    :goto_0
    aget-byte v0, v2, v6

    if-eqz v0, :cond_7

    aget-byte v0, v2, v6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    aget-wide v0, v3, v6

    cmp-long v0, v0, p1

    if-eqz v0, :cond_7

    .line 238
    :cond_6
    sub-int v0, v6, v7

    .line 239
    move v6, v0

    if-gez v0, :cond_5

    .line 240
    add-int/2addr v6, v4

    goto :goto_0

    .line 243
    :cond_7
    aget-byte v0, v2, v6

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    neg-int v0, v6

    add-int/lit8 v0, v0, -0x1

    return v0

    :cond_8
    return v8

    .line 246
    :cond_9
    aget-byte v0, v2, v6

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    neg-int v0, v6

    add-int/lit8 v0, v0, -0x1

    return v0

    :cond_a
    return v6
.end method

.method protected removeAt(I)V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    const-wide/16 v1, 0x0

    aput-wide v1, v0, p1

    .line 167
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/TPrimitiveHash;->removeAt(I)V

    .line 168
    return-void
.end method

.method protected setUp(I)I
    .locals 2

    .line 126
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/TPrimitiveHash;->setUp(I)I

    move-result v1

    .line 127
    new-array v0, v1, [J

    iput-object v0, p0, Lcom/squareup/haha/trove/TLongHash;->_set:[J

    .line 128
    return v1
.end method
