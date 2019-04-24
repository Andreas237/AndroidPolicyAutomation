.class Lorg/b/a/b/g;
.super Lorg/b/a/c/h;


# instance fields
.field private final a:Lorg/b/a/b/c;

.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(Lorg/b/a/b/c;I)V
    .locals 3

    invoke-static {}, Lorg/b/a/d;->r()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p1}, Lorg/b/a/b/c;->V()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lorg/b/a/c/h;-><init>(Lorg/b/a/d;J)V

    iput-object p1, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    iget-object p1, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {p1}, Lorg/b/a/b/c;->S()I

    move-result p1

    iput p1, p0, Lorg/b/a/b/g;->c:I

    iput p2, p0, Lorg/b/a/b/g;->d:I

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->b(J)I

    move-result p1

    return p1
.end method

.method public a(JI)J
    .locals 7

    if-nez p3, :cond_0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->h(J)I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result v2

    iget-object v3, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v3, p1, p2, v2}, Lorg/b/a/b/c;->a(JI)I

    move-result v3

    add-int/lit8 v4, v3, -0x1

    add-int v5, v4, p3

    if-lez v3, :cond_1

    if-gez v5, :cond_1

    add-int/lit8 v5, v2, 0x1

    iget v6, p0, Lorg/b/a/b/g;->c:I

    sub-int/2addr p3, v6

    add-int/2addr p3, v4

    goto :goto_0

    :cond_1
    move p3, v5

    move v5, v2

    :goto_0
    const/4 v4, 0x1

    if-ltz p3, :cond_2

    iget v6, p0, Lorg/b/a/b/g;->c:I

    div-int v6, p3, v6

    add-int/2addr v5, v6

    iget v6, p0, Lorg/b/a/b/g;->c:I

    rem-int/2addr p3, v6

    add-int/2addr p3, v4

    goto :goto_1

    :cond_2
    iget v6, p0, Lorg/b/a/b/g;->c:I

    div-int v6, p3, v6

    add-int/2addr v5, v6

    sub-int/2addr v5, v4

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget v6, p0, Lorg/b/a/b/g;->c:I

    rem-int/2addr p3, v6

    if-nez p3, :cond_3

    iget p3, p0, Lorg/b/a/b/g;->c:I

    :cond_3
    iget v6, p0, Lorg/b/a/b/g;->c:I

    sub-int/2addr v6, p3

    add-int/lit8 p3, v6, 0x1

    if-ne p3, v4, :cond_4

    add-int/lit8 v5, v5, 0x1

    :cond_4
    :goto_1
    iget-object v4, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v4, p1, p2, v2, v3}, Lorg/b/a/b/c;->a(JII)I

    move-result p1

    iget-object p2, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {p2, v5, p3}, Lorg/b/a/b/c;->b(II)I

    move-result p2

    if-le p1, p2, :cond_5

    move p1, p2

    :cond_5
    iget-object p2, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {p2, v5, p3, p1}, Lorg/b/a/b/c;->a(III)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public a(JJ)J
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    long-to-int v5, v3

    int-to-long v6, v5

    cmp-long v6, v6, v3

    if-nez v6, :cond_0

    invoke-virtual {v0, v1, v2, v5}, Lorg/b/a/b/g;->a(JI)J

    move-result-wide v1

    return-wide v1

    :cond_0
    iget-object v5, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v5, v1, v2}, Lorg/b/a/b/c;->h(J)I

    move-result v5

    int-to-long v5, v5

    iget-object v7, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v7, v1, v2}, Lorg/b/a/b/c;->a(J)I

    move-result v7

    iget-object v8, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v8, v1, v2, v7}, Lorg/b/a/b/c;->a(JI)I

    move-result v8

    add-int/lit8 v9, v8, -0x1

    int-to-long v9, v9

    add-long/2addr v9, v3

    const-wide/16 v11, 0x0

    cmp-long v11, v9, v11

    if-ltz v11, :cond_1

    int-to-long v14, v7

    iget v11, v0, Lorg/b/a/b/g;->c:I

    int-to-long v12, v11

    div-long v11, v9, v12

    add-long/2addr v14, v11

    iget v11, v0, Lorg/b/a/b/g;->c:I

    int-to-long v11, v11

    rem-long/2addr v9, v11

    const-wide/16 v11, 0x1

    add-long/2addr v9, v11

    goto :goto_0

    :cond_1
    const-wide/16 v11, 0x1

    int-to-long v13, v7

    iget v15, v0, Lorg/b/a/b/g;->c:I

    int-to-long v11, v15

    div-long v11, v9, v11

    add-long/2addr v13, v11

    const-wide/16 v11, 0x1

    sub-long v14, v13, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    iget v11, v0, Lorg/b/a/b/g;->c:I

    int-to-long v11, v11

    rem-long/2addr v9, v11

    long-to-int v9, v9

    if-nez v9, :cond_2

    iget v9, v0, Lorg/b/a/b/g;->c:I

    :cond_2
    iget v10, v0, Lorg/b/a/b/g;->c:I

    sub-int/2addr v10, v9

    add-int/lit8 v10, v10, 0x1

    int-to-long v9, v10

    const-wide/16 v11, 0x1

    cmp-long v13, v9, v11

    if-nez v13, :cond_3

    add-long/2addr v14, v11

    :cond_3
    :goto_0
    iget-object v11, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v11}, Lorg/b/a/b/c;->Q()I

    move-result v11

    int-to-long v11, v11

    cmp-long v11, v14, v11

    if-ltz v11, :cond_6

    iget-object v11, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v11}, Lorg/b/a/b/c;->R()I

    move-result v11

    int-to-long v11, v11

    cmp-long v11, v14, v11

    if-lez v11, :cond_4

    goto :goto_1

    :cond_4
    long-to-int v3, v14

    long-to-int v4, v9

    iget-object v9, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v9, v1, v2, v7, v8}, Lorg/b/a/b/c;->a(JII)I

    move-result v1

    iget-object v2, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, v3, v4}, Lorg/b/a/b/c;->b(II)I

    move-result v2

    if-le v1, v2, :cond_5

    move v1, v2

    :cond_5
    iget-object v2, v0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, v3, v4, v1}, Lorg/b/a/b/c;->a(III)J

    move-result-wide v1

    add-long/2addr v1, v5

    return-wide v1

    :cond_6
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Magnitude of add amount is too large: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(JI)J
    .locals 3

    iget v0, p0, Lorg/b/a/b/g;->c:I

    const/4 v1, 0x1

    invoke-static {p0, p3, v1, v0}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v1, p1, p2, v0}, Lorg/b/a/b/c;->b(JI)I

    move-result v1

    iget-object v2, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, v0, p3}, Lorg/b/a/b/c;->b(II)I

    move-result v2

    if-le v1, v2, :cond_0

    move v1, v2

    :cond_0
    iget-object v2, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, v0, p3, v1}, Lorg/b/a/b/c;->a(III)J

    move-result-wide v0

    iget-object p3, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {p3, p1, p2}, Lorg/b/a/b/c;->h(J)I

    move-result p1

    int-to-long p1, p1

    add-long/2addr v0, p1

    return-wide v0
.end method

.method public b(J)Z
    .locals 3

    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v1, v0}, Lorg/b/a/b/c;->e(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v1, p1, p2, v0}, Lorg/b/a/b/c;->a(JI)I

    move-result p1

    iget p2, p0, Lorg/b/a/b/g;->d:I

    if-ne p1, p2, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public d(J)J
    .locals 2

    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v1, p1, p2, v0}, Lorg/b/a/b/c;->a(JI)I

    move-result p1

    iget-object p2, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {p2, v0, p1}, Lorg/b/a/b/c;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->D()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public f()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/g;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->s()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/b/a/b/g;->c:I

    return v0
.end method

.method public i(J)J
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/g;->d(J)J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method
