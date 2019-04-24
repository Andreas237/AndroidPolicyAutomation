.class Lorg/b/a/d/f;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/k;


# instance fields
.field private final a:Lorg/b/a/d/d;


# direct methods
.method private constructor <init>(Lorg/b/a/d/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/f;->a:Lorg/b/a/d/d;

    return-void
.end method

.method static a(Lorg/b/a/d/d;)Lorg/b/a/d/k;
    .locals 1

    instance-of v0, p0, Lorg/b/a/d/l;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/b/a/d/k;

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance v0, Lorg/b/a/d/f;

    invoke-direct {v0, p0}, Lorg/b/a/d/f;-><init>(Lorg/b/a/d/d;)V

    return-object v0
.end method


# virtual methods
.method a()Lorg/b/a/d/d;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/f;->a:Lorg/b/a/d/d;

    return-object v0
.end method

.method public estimateParsedLength()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/f;->a:Lorg/b/a/d/d;

    invoke-interface {v0}, Lorg/b/a/d/d;->estimateParsedLength()I

    move-result v0

    return v0
.end method

.method public parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/f;->a:Lorg/b/a/d/d;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2, p3}, Lorg/b/a/d/d;->a(Lorg/b/a/d/e;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method
