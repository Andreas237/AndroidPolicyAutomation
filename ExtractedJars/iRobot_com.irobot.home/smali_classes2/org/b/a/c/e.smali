.class public Lorg/b/a/c/e;
.super Lorg/b/a/c/c;


# static fields
.field private static final serialVersionUID:J = 0x6f4cb35dbe61c66fL


# instance fields
.field private final a:Lorg/b/a/g;


# direct methods
.method public constructor <init>(Lorg/b/a/g;Lorg/b/a/h;)V
    .locals 0

    invoke-direct {p0, p2}, Lorg/b/a/c/c;-><init>(Lorg/b/a/h;)V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Lorg/b/a/g;->b()Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field must be supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-object p1, p0, Lorg/b/a/c/e;->a:Lorg/b/a/g;

    return-void
.end method


# virtual methods
.method public a(JI)J
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/e;->a:Lorg/b/a/g;

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/g;->a(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/e;->a:Lorg/b/a/g;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/b/a/g;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/e;->a:Lorg/b/a/g;

    invoke-virtual {v0}, Lorg/b/a/g;->c()Z

    move-result v0

    return v0
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lorg/b/a/c/e;->a:Lorg/b/a/g;

    invoke-virtual {v0}, Lorg/b/a/g;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/e;->a:Lorg/b/a/g;

    return-object v0
.end method
