.class public abstract Lorg/b/a/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;
.implements Lorg/b/a/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/b/a/t;",
        ">;",
        "Lorg/b/a/t;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/b/a/d;)I
    .locals 0

    invoke-virtual {p0, p1}, Lorg/b/a/a/c;->d(Lorg/b/a/d;)I

    move-result p1

    invoke-virtual {p0, p1}, Lorg/b/a/a/c;->a(I)I

    move-result p1

    return p1
.end method

.method public a(Lorg/b/a/t;)I
    .locals 5

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v1

    invoke-interface {p1}, Lorg/b/a/t;->a()I

    move-result v2

    if-eq v1, v2, :cond_1

    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "ReadablePartial objects must have matching field types"

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->c(I)Lorg/b/a/d;

    move-result-object v3

    invoke-interface {p1, v2}, Lorg/b/a/t;->c(I)Lorg/b/a/d;

    move-result-object v4

    if-eq v3, v4, :cond_2

    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "ReadablePartial objects must have matching field types"

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_6

    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->a(I)I

    move-result v3

    invoke-interface {p1, v2}, Lorg/b/a/t;->a(I)I

    move-result v4

    if-le v3, v4, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->a(I)I

    move-result v3

    invoke-interface {p1, v2}, Lorg/b/a/t;->a(I)I

    move-result v4

    if-ge v3, v4, :cond_5

    const/4 p1, -0x1

    return p1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    return v0
.end method

.method protected abstract a(ILorg/b/a/a;)Lorg/b/a/c;
.end method

.method public b(Lorg/b/a/d;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lorg/b/a/a/c;->c(Lorg/b/a/d;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lorg/b/a/d;)I
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lorg/b/a/a/c;->c(I)Lorg/b/a/d;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public c(I)Lorg/b/a/d;
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/a/c;->c()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/b/a/a/c;->a(ILorg/b/a/a;)Lorg/b/a/c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/c;->a()Lorg/b/a/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/b/a/t;

    invoke-virtual {p0, p1}, Lorg/b/a/a/c;->a(Lorg/b/a/t;)I

    move-result p1

    return p1
.end method

.method protected d(Lorg/b/a/d;)I
    .locals 3

    invoke-virtual {p0, p1}, Lorg/b/a/a/c;->c(Lorg/b/a/d;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Field \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is not supported"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/b/a/t;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, Lorg/b/a/t;

    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v0

    invoke-interface {p1}, Lorg/b/a/t;->a()I

    move-result v2

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->a(I)I

    move-result v3

    invoke-interface {p1, v2}, Lorg/b/a/t;->a(I)I

    move-result v4

    if-ne v3, v4, :cond_4

    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->c(I)Lorg/b/a/d;

    move-result-object v3

    invoke-interface {p1, v2}, Lorg/b/a/t;->c(I)Lorg/b/a/d;

    move-result-object v4

    if-eq v3, v4, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    invoke-virtual {p0}, Lorg/b/a/a/c;->c()Lorg/b/a/a;

    move-result-object v0

    invoke-interface {p1}, Lorg/b/a/t;->c()Lorg/b/a/a;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/b/a/c/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, Lorg/b/a/a/c;->a()I

    move-result v0

    const/16 v1, 0x9d

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x17

    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->a(I)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x17

    invoke-virtual {p0, v2}, Lorg/b/a/a/c;->c(I)Lorg/b/a/d;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/a/c;->c()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method
