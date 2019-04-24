.class public abstract Lorg/b/a/a/a;
.super Lorg/b/a/a/b;

# interfaces
.implements Lorg/b/a/r;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/b/a/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/a/a;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->E()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/b/a/a/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/b/a/c;->a(J)I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/a/a;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->z()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/b/a/a/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/b/a/c;->a(J)I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/a/a;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->m()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/b/a/a/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/b/a/c;->a(J)I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/a/a;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->j()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/b/a/a/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/b/a/c;->a(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/joda/convert/ToString;
    .end annotation

    invoke-super {p0}, Lorg/b/a/a/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
