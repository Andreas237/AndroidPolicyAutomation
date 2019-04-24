.class final Lorg/b/a/b/s$a;
.super Lorg/b/a/c/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/b/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lorg/b/a/c;

.field final b:Lorg/b/a/f;

.field final c:Lorg/b/a/g;

.field final d:Z

.field final e:Lorg/b/a/g;

.field final f:Lorg/b/a/g;


# direct methods
.method constructor <init>(Lorg/b/a/c;Lorg/b/a/f;Lorg/b/a/g;Lorg/b/a/g;Lorg/b/a/g;)V
    .locals 1

    invoke-virtual {p1}, Lorg/b/a/c;->a()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/b/a/c/b;-><init>(Lorg/b/a/d;)V

    invoke-virtual {p1}, Lorg/b/a/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_0
    iput-object p1, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    iput-object p2, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    iput-object p3, p0, Lorg/b/a/b/s$a;->c:Lorg/b/a/g;

    invoke-static {p3}, Lorg/b/a/b/s;->a(Lorg/b/a/g;)Z

    move-result p1

    iput-boolean p1, p0, Lorg/b/a/b/s$a;->d:Z

    iput-object p4, p0, Lorg/b/a/b/s$a;->e:Lorg/b/a/g;

    iput-object p5, p0, Lorg/b/a/b/s$a;->f:Lorg/b/a/g;

    return-void
.end method

.method private j(J)I
    .locals 7

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->b(J)I

    move-result v0

    int-to-long v1, v0

    add-long v3, p1, v1

    xor-long/2addr v3, p1

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    xor-long/2addr p1, v1

    cmp-long p1, p1, v5

    if-ltz p1, :cond_0

    new-instance p1, Ljava/lang/ArithmeticException;

    const-string p2, "Adding time zone offset caused overflow"

    invoke-direct {p1, p2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    return v0
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    return p1
.end method

.method public a(Ljava/util/Locale;)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1}, Lorg/b/a/c;->a(Ljava/util/Locale;)I

    move-result p1

    return p1
.end method

.method public a(JI)J
    .locals 9

    iget-boolean v0, p0, Lorg/b/a/b/s$a;->d:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lorg/b/a/b/s$a;->j(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    int-to-long v2, v0

    add-long/2addr p1, v2

    invoke-virtual {v1, p1, p2, p3}, Lorg/b/a/c;->a(JI)J

    move-result-wide p1

    sub-long/2addr p1, v2

    return-wide p1

    :cond_0
    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v2, v0, v1, p3}, Lorg/b/a/c;->a(JI)J

    move-result-wide v4

    iget-object v3, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, Lorg/b/a/f;->a(JZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 9

    iget-boolean v0, p0, Lorg/b/a/b/s$a;->d:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lorg/b/a/b/s$a;->j(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    int-to-long v2, v0

    add-long/2addr p1, v2

    invoke-virtual {v1, p1, p2, p3, p4}, Lorg/b/a/c;->a(JJ)J

    move-result-wide p1

    sub-long/2addr p1, v2

    return-wide p1

    :cond_0
    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v2, v0, v1, p3, p4}, Lorg/b/a/c;->a(JJ)J

    move-result-wide v4

    iget-object v3, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, Lorg/b/a/f;->a(JZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JLjava/lang/String;Ljava/util/Locale;)J
    .locals 9

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v2, v0, v1, p3, p4}, Lorg/b/a/c;->a(JLjava/lang/String;Ljava/util/Locale;)J

    move-result-wide v4

    iget-object v3, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, Lorg/b/a/f;->a(JZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(ILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(JLjava/util/Locale;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->a(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(JI)J
    .locals 9

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v2, v0, v1, p3}, Lorg/b/a/c;->b(JI)J

    move-result-wide v0

    iget-object v3, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v4, v0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, Lorg/b/a/f;->a(JZJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/s$a;->a(J)I

    move-result v2

    if-eq v2, p3, :cond_0

    new-instance p1, Lorg/b/a/j;

    iget-object p2, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {p2}, Lorg/b/a/f;->e()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, v1, p2}, Lorg/b/a/j;-><init>(JLjava/lang/String;)V

    new-instance p2, Lorg/b/a/i;

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->a()Lorg/b/a/d;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1}, Lorg/b/a/j;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, p3, v1}, Lorg/b/a/i;-><init>(Lorg/b/a/d;Ljava/lang/Number;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/b/a/i;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :cond_0
    return-wide p1
.end method

.method public b(ILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->b(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(JLjava/util/Locale;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->b(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(J)Z
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->b(J)Z

    move-result p1

    return p1
.end method

.method public c(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->c(J)I

    move-result p1

    return p1
.end method

.method public d(J)J
    .locals 9

    iget-boolean v0, p0, Lorg/b/a/b/s$a;->d:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lorg/b/a/b/s$a;->j(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    int-to-long v2, v0

    add-long/2addr p1, v2

    invoke-virtual {v1, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    sub-long/2addr p1, v2

    return-wide p1

    :cond_0
    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v2, v0, v1}, Lorg/b/a/c;->d(J)J

    move-result-wide v4

    iget-object v3, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, Lorg/b/a/f;->a(JZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final d()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->c:Lorg/b/a/g;

    return-object v0
.end method

.method public e(J)J
    .locals 9

    iget-boolean v0, p0, Lorg/b/a/b/s$a;->d:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lorg/b/a/b/s$a;->j(J)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    int-to-long v2, v0

    add-long/2addr p1, v2

    invoke-virtual {v1, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    sub-long/2addr p1, v2

    return-wide p1

    :cond_0
    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v2, v0, v1}, Lorg/b/a/c;->e(J)J

    move-result-wide v4

    iget-object v3, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, Lorg/b/a/f;->a(JZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->e:Lorg/b/a/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/b/s$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lorg/b/a/b/s$a;

    iget-object v1, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    iget-object v3, p1, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    iget-object v3, p1, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v1, v3}, Lorg/b/a/f;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/b/a/b/s$a;->c:Lorg/b/a/g;

    iget-object v3, p1, Lorg/b/a/b/s$a;->c:Lorg/b/a/g;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/b/a/b/s$a;->e:Lorg/b/a/g;

    iget-object p1, p1, Lorg/b/a/b/s$a;->e:Lorg/b/a/g;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    return v2
.end method

.method public final f()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->f:Lorg/b/a/g;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->g()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->h()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v1}, Lorg/b/a/f;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public i(J)J
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/s$a;->b:Lorg/b/a/f;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/f;->f(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/s$a;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
