.class public Lcom/squareup/haha/trove/TLongHashSet;
.super Lcom/squareup/haha/trove/TLongHash;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/squareup/haha/trove/TLongHash;-><init>()V

    .line 41
    return-void
.end method


# virtual methods
.method public final add(J)Z
    .locals 4

    .line 137
    invoke-virtual {p0, p1, p2}, Lcom/squareup/haha/trove/TLongHashSet;->insertionIndex(J)I

    move-result v0

    .line 139
    move v2, v0

    if-gez v0, :cond_0

    .line 140
    const/4 v0, 0x0

    return v0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_states:[B

    aget-byte v3, v0, v2

    .line 144
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_set:[J

    aput-wide p1, v0, v2

    .line 145
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_states:[B

    const/4 v1, 0x1

    aput-byte v1, v0, v2

    .line 146
    if-nez v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/TLongHashSet;->postInsertHook(Z)V

    .line 148
    const/4 v0, 0x1

    return v0
.end method

.method public clear()V
    .locals 5

    .line 198
    invoke-super {p0}, Lcom/squareup/haha/trove/TLongHash;->clear()V

    .line 199
    iget-object v2, p0, Lcom/squareup/haha/trove/TLongHashSet;->_set:[J

    .line 200
    iget-object v3, p0, Lcom/squareup/haha/trove/TLongHashSet;->_states:[B

    .line 202
    array-length v4, v2

    :goto_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_0

    .line 203
    const-wide/16 v0, 0x0

    aput-wide v0, v2, v4

    .line 204
    const/4 v0, 0x0

    aput-byte v0, v3, v4

    goto :goto_0

    .line 206
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 216
    instance-of v0, p1, Lcom/squareup/haha/trove/TLongHashSet;

    if-nez v0, :cond_0

    .line 217
    const/4 v0, 0x0

    return v0

    .line 219
    :cond_0
    move-object v2, p1

    check-cast v2, Lcom/squareup/haha/trove/TLongHashSet;

    .line 220
    invoke-virtual {v2}, Lcom/squareup/haha/trove/TLongHashSet;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/squareup/haha/trove/TLongHashSet;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 221
    const/4 v0, 0x0

    return v0

    .line 223
    :cond_1
    new-instance v0, Lcom/squareup/haha/trove/TLongHashSet$1;

    invoke-direct {v0, p0, v2}, Lcom/squareup/haha/trove/TLongHashSet$1;-><init>(Lcom/squareup/haha/trove/TLongHashSet;Lcom/squareup/haha/trove/TLongHashSet;)V

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/TLongHashSet;->forEach(Lcom/squareup/haha/trove/TLongProcedure;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 232
    new-instance v1, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;

    invoke-direct {v1, p0}, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;-><init>(Lcom/squareup/haha/trove/TLongHashSet;)V

    .line 233
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/TLongHashSet;->forEach(Lcom/squareup/haha/trove/TLongProcedure;)Z

    .line 234
    .line 1244
    move-object v2, v1

    iget v0, v1, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;->h:I

    .line 234
    return v0
.end method

.method protected rehash(I)V
    .locals 9

    .line 158
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_set:[J

    array-length v2, v0

    .line 159
    iget-object v3, p0, Lcom/squareup/haha/trove/TLongHashSet;->_set:[J

    .line 160
    iget-object v4, p0, Lcom/squareup/haha/trove/TLongHashSet;->_states:[B

    .line 162
    new-array v0, p1, [J

    iput-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_set:[J

    .line 163
    new-array v0, p1, [B

    iput-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_states:[B

    .line 165
    move v5, v2

    :cond_0
    :goto_0
    move v0, v5

    add-int/lit8 v5, v5, -0x1

    if-lez v0, :cond_1

    .line 166
    aget-byte v0, v4, v5

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 167
    aget-wide v6, v3, v5

    .line 168
    invoke-virtual {p0, v6, v7}, Lcom/squareup/haha/trove/TLongHashSet;->insertionIndex(J)I

    move-result v8

    .line 169
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_set:[J

    aput-wide v6, v0, v8

    .line 170
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet;->_states:[B

    const/4 v1, 0x1

    aput-byte v1, v0, v8

    .line 171
    goto :goto_0

    .line 173
    :cond_1
    return-void
.end method
