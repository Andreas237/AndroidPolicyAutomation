.class Lorg/b/a/d/l;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/d;
.implements Lorg/b/a/d/k;


# instance fields
.field private final a:Lorg/b/a/d/k;


# direct methods
.method private constructor <init>(Lorg/b/a/d/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/l;->a:Lorg/b/a/d/k;

    return-void
.end method

.method static a(Lorg/b/a/d/k;)Lorg/b/a/d/d;
    .locals 1

    instance-of v0, p0, Lorg/b/a/d/f;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/b/a/d/f;

    invoke-virtual {p0}, Lorg/b/a/d/f;->a()Lorg/b/a/d/d;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lorg/b/a/d/d;

    if-eqz v0, :cond_1

    check-cast p0, Lorg/b/a/d/d;

    return-object p0

    :cond_1
    if-nez p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance v0, Lorg/b/a/d/l;

    invoke-direct {v0, p0}, Lorg/b/a/d/l;-><init>(Lorg/b/a/d/k;)V

    return-object v0
.end method


# virtual methods
.method public a(Lorg/b/a/d/e;Ljava/lang/String;I)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/l;->a:Lorg/b/a/d/k;

    invoke-interface {v0, p1, p2, p3}, Lorg/b/a/d/k;->parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/b/a/d/l;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/b/a/d/l;

    iget-object v0, p0, Lorg/b/a/d/l;->a:Lorg/b/a/d/k;

    iget-object p1, p1, Lorg/b/a/d/l;->a:Lorg/b/a/d/k;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public estimateParsedLength()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/l;->a:Lorg/b/a/d/k;

    invoke-interface {v0}, Lorg/b/a/d/k;->estimateParsedLength()I

    move-result v0

    return v0
.end method

.method public parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/l;->a:Lorg/b/a/d/k;

    invoke-interface {v0, p1, p2, p3}, Lorg/b/a/d/k;->parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
