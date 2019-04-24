.class public Lorg/apache/commons/a/a/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Set<",
            "Lorg/apache/commons/a/c/b<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lorg/apache/commons/a/a/b;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-void
.end method


# virtual methods
.method public a(BB)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0
.end method

.method public a(CC)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0
.end method

.method public a(DD)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-static {p3, p4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p3

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/commons/a/a/b;->a(JJ)Lorg/apache/commons/a/a/b;

    move-result-object p1

    return-object p1
.end method

.method public a(FF)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a(II)Lorg/apache/commons/a/a/b;

    move-result-object p1

    return-object p1
.end method

.method public a(II)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0
.end method

.method public a(JJ)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    cmp-long p1, p1, p3

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_d

    if-nez p2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_4

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_4
    instance-of v0, p1, [J

    if-eqz v0, :cond_5

    check-cast p1, [J

    check-cast p2, [J

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([J[J)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_5
    instance-of v0, p1, [I

    if-eqz v0, :cond_6

    check-cast p1, [I

    check-cast p2, [I

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([I[I)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_6
    instance-of v0, p1, [S

    if-eqz v0, :cond_7

    check-cast p1, [S

    check-cast p2, [S

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([S[S)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_7
    instance-of v0, p1, [C

    if-eqz v0, :cond_8

    check-cast p1, [C

    check-cast p2, [C

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([C[C)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_8
    instance-of v0, p1, [B

    if-eqz v0, :cond_9

    check-cast p1, [B

    check-cast p2, [B

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([B[B)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_9
    instance-of v0, p1, [D

    if-eqz v0, :cond_a

    check-cast p1, [D

    check-cast p2, [D

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([D[D)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_a
    instance-of v0, p1, [F

    if-eqz v0, :cond_b

    check-cast p1, [F

    check-cast p2, [F

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([F[F)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_b
    instance-of v0, p1, [Z

    if-eqz v0, :cond_c

    check-cast p1, [Z

    check-cast p2, [Z

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([Z[Z)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_c
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/a/a/b;->a([Ljava/lang/Object;[Ljava/lang/Object;)Lorg/apache/commons/a/a/b;

    return-object p0

    :cond_d
    :goto_0
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a(SS)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0
.end method

.method public a(ZZ)Lorg/apache/commons/a/a/b;
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-object p0
.end method

.method public a([B[B)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-byte v1, p1, v0

    aget-byte v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(BB)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([C[C)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-char v1, p1, v0

    aget-char v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(CC)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([D[D)Lorg/apache/commons/a/a/b;
    .locals 5

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    invoke-virtual {p0, v1, v2, v3, v4}, Lorg/apache/commons/a/a/b;->a(DD)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([F[F)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget v1, p1, v0

    aget v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(FF)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([I[I)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget v1, p1, v0

    aget v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(II)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([J[J)Lorg/apache/commons/a/a/b;
    .locals 5

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    invoke-virtual {p0, v1, v2, v3, v4}, Lorg/apache/commons/a/a/b;->a(JJ)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([Ljava/lang/Object;[Ljava/lang/Object;)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-object v1, p1, v0

    aget-object v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([S[S)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-short v1, p1, v0

    aget-short v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(SS)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method public a([Z[Z)Lorg/apache/commons/a/a/b;
    .locals 3

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0

    :cond_3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    iget-boolean v1, p0, Lorg/apache/commons/a/a/b;->b:Z

    if-eqz v1, :cond_4

    aget-boolean v1, p1, v0

    aget-boolean v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/a/a/b;->a(ZZ)Lorg/apache/commons/a/a/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lorg/apache/commons/a/a/b;->a(Z)V

    return-object p0
.end method

.method protected a(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/apache/commons/a/a/b;->b:Z

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/a/a/b;->b:Z

    return v0
.end method
