.class public final Lorg/b/a/b;
.super Lorg/b/a/a/d;

# interfaces
.implements Ljava/io/Serializable;
.implements Lorg/b/a/r;


# static fields
.field private static final serialVersionUID:J = -0x47c3879b95a42207L


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/b/a/a/d;-><init>()V

    return-void
.end method

.method public constructor <init>(JLorg/b/a/a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/b/a/a/d;-><init>(JLorg/b/a/a;)V

    return-void
.end method

.method public static g_()Lorg/b/a/b;
    .locals 1

    new-instance v0, Lorg/b/a/b;

    invoke-direct {v0}, Lorg/b/a/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(I)Lorg/b/a/b;
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/b;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->m()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/b/a/b;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lorg/b/a/c;->b(JI)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/b/a/b;->a_(J)Lorg/b/a/b;

    move-result-object p1

    return-object p1
.end method

.method public a_(J)Lorg/b/a/b;
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/b;->a()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    move-object v0, p0

    return-object v0

    :cond_0
    new-instance v0, Lorg/b/a/b;

    invoke-virtual {p0}, Lorg/b/a/b;->b()Lorg/b/a/a;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lorg/b/a/b;-><init>(JLorg/b/a/a;)V

    return-object v0
.end method

.method public b(I)Lorg/b/a/b;
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/b;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->j()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/b/a/b;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lorg/b/a/c;->b(JI)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/b/a/b;->a_(J)Lorg/b/a/b;

    move-result-object p1

    return-object p1
.end method
