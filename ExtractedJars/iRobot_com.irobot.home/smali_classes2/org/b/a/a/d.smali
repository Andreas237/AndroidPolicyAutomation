.class public abstract Lorg/b/a/a/d;
.super Lorg/b/a/a/a;

# interfaces
.implements Ljava/io/Serializable;
.implements Lorg/b/a/r;


# static fields
.field private static final serialVersionUID:J = -0x61eb0a2d15dL


# instance fields
.field private volatile a:J

.field private volatile b:Lorg/b/a/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-static {}, Lorg/b/a/e;->a()J

    move-result-wide v0

    invoke-static {}, Lorg/b/a/b/q;->O()Lorg/b/a/b/q;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lorg/b/a/a/d;-><init>(JLorg/b/a/a;)V

    return-void
.end method

.method public constructor <init>(JLorg/b/a/a;)V
    .locals 0

    invoke-direct {p0}, Lorg/b/a/a/a;-><init>()V

    invoke-virtual {p0, p3}, Lorg/b/a/a/d;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p3

    iput-object p3, p0, Lorg/b/a/a/d;->b:Lorg/b/a/a;

    iget-object p3, p0, Lorg/b/a/a/d;->b:Lorg/b/a/a;

    invoke-virtual {p0, p1, p2, p3}, Lorg/b/a/a/d;->a(JLorg/b/a/a;)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/b/a/a/d;->a:J

    invoke-direct {p0}, Lorg/b/a/a/d;->h()V

    return-void
.end method

.method public constructor <init>(JLorg/b/a/f;)V
    .locals 0

    invoke-static {p3}, Lorg/b/a/b/q;->b(Lorg/b/a/f;)Lorg/b/a/b/q;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lorg/b/a/a/d;-><init>(JLorg/b/a/a;)V

    return-void
.end method

.method private h()V
    .locals 4

    iget-wide v0, p0, Lorg/b/a/a/d;->a:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/b/a/a/d;->a:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lorg/b/a/a/d;->b:Lorg/b/a/a;

    invoke-virtual {v0}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object v0

    iput-object v0, p0, Lorg/b/a/a/d;->b:Lorg/b/a/a;

    :cond_1
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lorg/b/a/a/d;->a:J

    return-wide v0
.end method

.method protected a(JLorg/b/a/a;)J
    .locals 0

    return-wide p1
.end method

.method protected a(Lorg/b/a/a;)Lorg/b/a/a;
    .locals 0

    invoke-static {p1}, Lorg/b/a/e;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p1

    return-object p1
.end method

.method protected a(J)V
    .locals 1

    iget-object v0, p0, Lorg/b/a/a/d;->b:Lorg/b/a/a;

    invoke-virtual {p0, p1, p2, v0}, Lorg/b/a/a/d;->a(JLorg/b/a/a;)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/b/a/a/d;->a:J

    return-void
.end method

.method public b()Lorg/b/a/a;
    .locals 1

    iget-object v0, p0, Lorg/b/a/a/d;->b:Lorg/b/a/a;

    return-object v0
.end method
