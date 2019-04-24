.class public Lcom/google/dexmaker/dx/util/FixedSizeList;
.super Lcom/google/dexmaker/dx/util/MutabilityControl;
.source "FixedSizeList.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;


# instance fields
.field private arr:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 35
    :goto_0
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/MutabilityControl;-><init>(Z)V

    .line 38
    :try_start_0
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 41
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "size < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private throwIndex(I)Ljava/lang/Object;
    .locals 1

    if-gez p1, :cond_0

    .line 232
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "n < 0"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 235
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "n >= size()"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private toString0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 250
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    array-length v0, v0

    .line 251
    new-instance v1, Ljava/lang/StringBuffer;

    mul-int/lit8 v2, v0, 0xa

    add-int/lit8 v2, v2, 0xa

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    if-eqz p1, :cond_0

    .line 254
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_3

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 259
    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    if-eqz p4, :cond_2

    .line 263
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aget-object v2, v2, p1

    check-cast v2, Lcom/google/dexmaker/dx/util/ToHuman;

    invoke-interface {v2}, Lcom/google/dexmaker/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 265
    :cond_2
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aget-object v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_4

    .line 270
    invoke-virtual {v1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 273
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 58
    :cond_1
    check-cast p1, Lcom/google/dexmaker/dx/util/FixedSizeList;

    .line 59
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method protected final get0(I)Ljava/lang/Object;
    .locals 3

    .line 177
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 180
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    :catch_0
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/FixedSizeList;->throwIndex(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final getOrNull0(I)Ljava/lang/Object;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected final set0(ILjava/lang/Object;)V
    .locals 1

    .line 213
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/FixedSizeList;->throwIfImmutable()V

    .line 216
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aput-object p2, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 219
    :catch_0
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/FixedSizeList;->throwIndex(I)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public shrinkToFit()V
    .locals 6

    .line 133
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    .line 137
    iget-object v4, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aget-object v4, v4, v2

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-ne v0, v3, :cond_2

    return-void

    .line 146
    :cond_2
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/FixedSizeList;->throwIfImmutable()V

    .line 148
    new-array v2, v3, [Ljava/lang/Object;

    move v4, v1

    :goto_1
    if-ge v1, v0, :cond_4

    .line 152
    iget-object v5, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    aget-object v5, v5, v1

    if-eqz v5, :cond_3

    .line 154
    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 159
    :cond_4
    iput-object v2, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    if-nez v3, :cond_5

    .line 161
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/FixedSizeList;->setImmutable()V

    :cond_5
    return-void
.end method

.method public final size()I
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/FixedSizeList;->arr:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 4

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ", "

    const-string/jumbo v2, "}"

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/dexmaker/dx/util/FixedSizeList;->toString0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toHuman(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 117
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/dexmaker/dx/util/FixedSizeList;->toString0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ", "

    const-string/jumbo v2, "}"

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/dexmaker/dx/util/FixedSizeList;->toString0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 103
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/dexmaker/dx/util/FixedSizeList;->toString0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
