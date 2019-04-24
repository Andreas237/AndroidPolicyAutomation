.class public final Lorg/b/a/e/d;
.super Lorg/b/a/f;


# static fields
.field private static final serialVersionUID:J = -0x30c0b99837523604L


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/b/a/f;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lorg/b/a/e/d;->b:Ljava/lang/String;

    iput p3, p0, Lorg/b/a/e/d;->c:I

    iput p4, p0, Lorg/b/a/e/d;->d:I

    return-void
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Lorg/b/a/e/d;->b:Ljava/lang/String;

    return-object p1
.end method

.method public b(J)I
    .locals 0

    iget p1, p0, Lorg/b/a/e/d;->c:I

    return p1
.end method

.method public c(J)I
    .locals 0

    iget p1, p0, Lorg/b/a/e/d;->d:I

    return p1
.end method

.method public e(J)I
    .locals 0

    iget p1, p0, Lorg/b/a/e/d;->c:I

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/e/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lorg/b/a/e/d;

    invoke-virtual {p0}, Lorg/b/a/e/d;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/b/a/e/d;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lorg/b/a/e/d;->d:I

    iget v3, p1, Lorg/b/a/e/d;->d:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/b/a/e/d;->c:I

    iget p1, p1, Lorg/b/a/e/d;->c:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    return v2
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)J
    .locals 0

    return-wide p1
.end method

.method public h(J)J
    .locals 0

    return-wide p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/e/d;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget v1, p0, Lorg/b/a/e/d;->d:I

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    iget v1, p0, Lorg/b/a/e/d;->c:I

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method
