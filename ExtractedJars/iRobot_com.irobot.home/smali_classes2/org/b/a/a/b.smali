.class public abstract Lorg/b/a/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/s;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/b/a/s;)I
    .locals 5

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Lorg/b/a/s;->a()J

    move-result-wide v1

    invoke-virtual {p0}, Lorg/b/a/a/b;->a()J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-nez p1, :cond_1

    return v0

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/b/a/s;

    invoke-virtual {p0, p1}, Lorg/b/a/a/b;->a(Lorg/b/a/s;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/b/a/s;

    invoke-virtual {p0}, Lorg/b/a/a/b;->a()J

    move-result-wide v3

    invoke-interface {p1}, Lorg/b/a/s;->a()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lorg/b/a/a/b;->b()Lorg/b/a/a;

    move-result-object v1

    invoke-interface {p1}, Lorg/b/a/s;->b()Lorg/b/a/a;

    move-result-object p1

    invoke-static {v1, p1}, Lorg/b/a/c/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public g()Ljava/util/Date;
    .locals 3

    new-instance v0, Ljava/util/Date;

    invoke-virtual {p0}, Lorg/b/a/a/b;->a()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lorg/b/a/a/b;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lorg/b/a/a/b;->a()J

    move-result-wide v2

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {p0}, Lorg/b/a/a/b;->b()Lorg/b/a/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/joda/convert/ToString;
    .end annotation

    invoke-static {}, Lorg/b/a/d/j;->b()Lorg/b/a/d/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/b/a/d/b;->a(Lorg/b/a/s;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
