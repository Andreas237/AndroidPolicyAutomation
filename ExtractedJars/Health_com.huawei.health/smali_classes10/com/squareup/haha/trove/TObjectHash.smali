.class public abstract Lcom/squareup/haha/trove/TObjectHash;
.super Lcom/squareup/haha/trove/THash;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TObjectHashingStrategy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/trove/TObjectHash$NULL;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Lcom/squareup/haha/trove/THash;Lcom/squareup/haha/trove/TObjectHashingStrategy<TT;>;"
    }
.end annotation


# static fields
.field public static final NULL:Lcom/squareup/haha/trove/TObjectHash$NULL;

.field public static final REMOVED:Ljava/lang/Object;


# instance fields
.field protected final _hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TObjectHashingStrategy<TT;>;"
        }
    .end annotation
.end field

.field protected transient _set:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    .line 39
    new-instance v0, Lcom/squareup/haha/trove/TObjectHash$NULL;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TObjectHash$NULL;-><init>()V

    sput-object v0, Lcom/squareup/haha/trove/TObjectHash;->NULL:Lcom/squareup/haha/trove/TObjectHash$NULL;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/squareup/haha/trove/THash;-><init>()V

    .line 46
    iput-object p0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    .line 47
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/THash;-><init>(I)V

    .line 68
    iput-object p0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    .line 69
    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    .line 94
    invoke-direct {p0, p1, p2}, Lcom/squareup/haha/trove/THash;-><init>(IF)V

    .line 95
    iput-object p0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    .line 96
    return-void
.end method

.method public constructor <init>(IFLcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IFLcom/squareup/haha/trove/TObjectHashingStrategy<TT;>;)V"
        }
    .end annotation

    .line 109
    invoke-direct {p0, p1, p2}, Lcom/squareup/haha/trove/THash;-><init>(IF)V

    .line 110
    iput-object p3, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    .line 111
    return-void
.end method

.method public constructor <init>(ILcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/squareup/haha/trove/TObjectHashingStrategy<TT;>;)V"
        }
    .end annotation

    .line 81
    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/THash;-><init>(I)V

    .line 82
    iput-object p2, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    .line 83
    return-void
.end method

.method public constructor <init>(Lcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectHashingStrategy<TT;>;)V"
        }
    .end annotation

    .line 55
    invoke-direct {p0}, Lcom/squareup/haha/trove/THash;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    .line 57
    return-void
.end method


# virtual methods
.method protected capacity()I
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public clone()Lcom/squareup/haha/trove/TObjectHash;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/trove/TObjectHash<TT;>;"
        }
    .end annotation

    .line 118
    invoke-super {p0}, Lcom/squareup/haha/trove/THash;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/squareup/haha/trove/TObjectHash;

    .line 119
    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, v1, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    .line 120
    return-object v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/squareup/haha/trove/TObjectHash;->clone()Lcom/squareup/haha/trove/TObjectHash;

    move-result-object v0

    return-object v0
.end method

.method public final computeHashCode(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 287
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 173
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/TObjectHash;->index(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    .line 302
    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public forEach(Lcom/squareup/haha/trove/TObjectProcedure;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectProcedure<TT;>;)Z"
        }
    .end annotation

    .line 155
    iget-object v2, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    .line 156
    array-length v3, v2

    :cond_0
    move v0, v3

    add-int/lit8 v3, v3, -0x1

    if-lez v0, :cond_1

    .line 157
    aget-object v0, v2, v3

    if-eqz v0, :cond_0

    aget-object v0, v2, v3

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    aget-object v0, v2, v3

    invoke-interface {p1, v0}, Lcom/squareup/haha/trove/TObjectProcedure;->execute(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 160
    const/4 v0, 0x0

    return v0

    .line 163
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected index(Ljava/lang/Object;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 184
    iget-object v2, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    .line 185
    array-length v3, v2

    .line 186
    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->computeHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 187
    move v4, v0

    rem-int v5, v0, v3

    .line 188
    aget-object v6, v2, v5

    .line 190
    if-eqz v6, :cond_3

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v6, v0, :cond_0

    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, v6, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 193
    :cond_0
    add-int/lit8 v0, v3, -0x2

    rem-int v0, v4, v0

    add-int/lit8 v7, v0, 0x1

    .line 196
    :cond_1
    sub-int v0, v5, v7

    .line 197
    move v5, v0

    if-gez v0, :cond_2

    .line 198
    add-int/2addr v5, v3

    .line 200
    :cond_2
    aget-object v6, v2, v5

    .line 201
    if-eqz v6, :cond_3

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v6, v0, :cond_1

    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, v6, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    :cond_3
    if-nez v6, :cond_4

    const/4 v0, -0x1

    return v0

    :cond_4
    return v5
.end method

.method protected insertionIndex(Ljava/lang/Object;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 219
    iget-object v2, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    .line 220
    array-length v3, v2

    .line 221
    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->computeHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 222
    move v4, v0

    rem-int v5, v0, v3

    .line 223
    aget-object v6, v2, v5

    .line 225
    if-nez v6, :cond_0

    .line 226
    return v5

    .line 228
    :cond_0
    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v6, v0, :cond_1

    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, v6, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    neg-int v0, v5

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 234
    :cond_1
    add-int/lit8 v0, v3, -0x2

    rem-int v0, v4, v0

    add-int/lit8 v7, v0, 0x1

    .line 237
    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-ne v6, v0, :cond_2

    move v8, v5

    goto :goto_0

    :cond_2
    const/4 v8, -0x1

    .line 242
    :cond_3
    :goto_0
    sub-int v0, v5, v7

    .line 243
    move v5, v0

    if-gez v0, :cond_4

    .line 244
    add-int/2addr v5, v3

    .line 246
    :cond_4
    aget-object v6, v2, v5

    .line 247
    const/4 v0, -0x1

    if-ne v8, v0, :cond_5

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-ne v6, v0, :cond_5

    .line 248
    move v8, v5

    .line 251
    :cond_5
    if-eqz v6, :cond_6

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v6, v0, :cond_6

    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, v6, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 258
    :cond_6
    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-ne v6, v0, :cond_9

    .line 259
    :goto_1
    if-eqz v6, :cond_9

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v6, v0, :cond_7

    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v0, v6, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 261
    :cond_7
    sub-int v0, v5, v7

    .line 262
    move v5, v0

    if-gez v0, :cond_8

    .line 263
    add-int/2addr v5, v3

    .line 265
    :cond_8
    aget-object v6, v2, v5

    goto :goto_1

    .line 270
    :cond_9
    if-eqz v6, :cond_a

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v6, v0, :cond_a

    .line 271
    neg-int v0, v5

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 274
    :cond_a
    const/4 v0, -0x1

    if-ne v8, v0, :cond_b

    return v5

    :cond_b
    return v8
.end method

.method protected removeAt(I)V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    aput-object v1, v0, p1

    .line 131
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/THash;->removeAt(I)V

    .line 132
    return-void
.end method

.method protected setUp(I)I
    .locals 2

    .line 142
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/THash;->setUp(I)I

    move-result v1

    .line 143
    new-array v0, v1, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    .line 144
    return v1
.end method

.method protected final throwObjectContractViolation(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 318
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals() or TObjectHashingStrategy.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method\'s documentation. object #1 ="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p1, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", hashCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v2, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->computeHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; object #2 ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p2, :cond_1

    const-string v2, ""

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", hashCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/haha/trove/TObjectHash;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v2, p2}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->computeHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
