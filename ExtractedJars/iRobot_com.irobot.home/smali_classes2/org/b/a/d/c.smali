.class public Lorg/b/a/d/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/b/a/d/c$e;,
        Lorg/b/a/d/c$b;,
        Lorg/b/a/d/c$j;,
        Lorg/b/a/d/c$k;,
        Lorg/b/a/d/c$l;,
        Lorg/b/a/d/c$d;,
        Lorg/b/a/d/c$i;,
        Lorg/b/a/d/c$m;,
        Lorg/b/a/d/c$c;,
        Lorg/b/a/d/c$g;,
        Lorg/b/a/d/c$n;,
        Lorg/b/a/d/c$f;,
        Lorg/b/a/d/c$h;,
        Lorg/b/a/d/c$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    return-void
.end method

.method private a(Ljava/lang/Object;)Lorg/b/a/d/c;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/b/a/d/c;->b:Ljava/lang/Object;

    iget-object v0, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method private a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/b/a/d/c;->b:Ljava/lang/Object;

    iget-object v0, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method static a(Ljava/lang/Appendable;I)V
    .locals 1

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_0

    const v0, 0xfffd

    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Lorg/b/a/d/g;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No printer supplied"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    return-void
.end method

.method static a(Ljava/lang/CharSequence;ILjava/lang/String;)Z
    .locals 5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p1

    const/4 v2, 0x0

    if-ge v1, v0, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    add-int v3, p1, v1

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method static b(Ljava/lang/CharSequence;ILjava/lang/String;)Z
    .locals 5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p1

    const/4 v2, 0x0

    if-ge v1, v0, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    add-int v3, p1, v1

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_1

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    if-eq v3, v4, :cond_1

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    if-eq v3, v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private b(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/b/a/d/m;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lorg/b/a/d/c$b;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/b/a/d/c$b;

    invoke-virtual {p1}, Lorg/b/a/d/c$b;->a()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private c(Lorg/b/a/d/d;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No parser supplied"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    return-void
.end method

.method private c(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/b/a/d/k;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lorg/b/a/d/c$b;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/b/a/d/c$b;

    invoke-virtual {p1}, Lorg/b/a/d/c$b;->b()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private k()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lorg/b/a/d/c;->b:Ljava/lang/Object;

    if-nez v0, :cond_4

    iget-object v1, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    if-nez v2, :cond_2

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :cond_2
    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lorg/b/a/d/c$b;

    iget-object v1, p0, Lorg/b/a/d/c;->a:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lorg/b/a/d/c$b;-><init>(Ljava/util/List;)V

    :cond_3
    iput-object v0, p0, Lorg/b/a/d/c;->b:Ljava/lang/Object;

    :cond_4
    return-object v0
.end method


# virtual methods
.method public a()Lorg/b/a/d/b;
    .locals 4

    invoke-direct {p0}, Lorg/b/a/d/c;->k()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->b(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lorg/b/a/d/m;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-direct {p0, v0}, Lorg/b/a/d/c;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v2, v0

    check-cast v2, Lorg/b/a/d/k;

    :cond_1
    if-nez v1, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Both printing and parsing not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    new-instance v0, Lorg/b/a/d/b;

    invoke-direct {v0, v1, v2}, Lorg/b/a/d/b;-><init>(Lorg/b/a/d/m;Lorg/b/a/d/k;)V

    return-object v0
.end method

.method public a(C)Lorg/b/a/d/c;
    .locals 1

    new-instance v0, Lorg/b/a/d/c$a;

    invoke-direct {v0, p1}, Lorg/b/a/d/c$a;-><init>(C)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->c()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->d()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->c(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(IZ)Lorg/b/a/d/c;
    .locals 2

    new-instance v0, Lorg/b/a/d/c$m;

    invoke-static {}, Lorg/b/a/d;->s()Lorg/b/a/d;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lorg/b/a/d/c$m;-><init>(Lorg/b/a/d;IZ)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Lorg/b/a/d/c;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Literal must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/b/a/d/c$h;

    invoke-direct {v0, p1}, Lorg/b/a/d/c$h;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Lorg/b/a/d/c$a;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-direct {v0, p1}, Lorg/b/a/d/c$a;-><init>(C)V

    goto :goto_0

    :pswitch_1
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;ZII)Lorg/b/a/d/c;
    .locals 7

    new-instance v6, Lorg/b/a/d/c$l;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lorg/b/a/d/c$l;-><init>(Ljava/lang/String;Ljava/lang/String;ZII)V

    invoke-direct {p0, v6}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;ZII)Lorg/b/a/d/c;
    .locals 7

    new-instance v6, Lorg/b/a/d/c$l;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/b/a/d/c$l;-><init>(Ljava/lang/String;Ljava/lang/String;ZII)V

    invoke-direct {p0, v6}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/util/Map;)Lorg/b/a/d/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/b/a/f;",
            ">;)",
            "Lorg/b/a/d/c;"
        }
    .end annotation

    new-instance v0, Lorg/b/a/d/c$k;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lorg/b/a/d/c$k;-><init>(ILjava/util/Map;)V

    invoke-direct {p0, v0, v0}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/d/b;)Lorg/b/a/d/c;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No formatter supplied"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Lorg/b/a/d/b;->a()Lorg/b/a/d/m;

    move-result-object v0

    invoke-virtual {p1}, Lorg/b/a/d/b;->c()Lorg/b/a/d/k;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/d/d;)Lorg/b/a/d/c;
    .locals 1

    invoke-direct {p0, p1}, Lorg/b/a/d/c;->c(Lorg/b/a/d/d;)V

    invoke-static {p1}, Lorg/b/a/d/f;->a(Lorg/b/a/d/d;)Lorg/b/a/d/k;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/d/g;[Lorg/b/a/d/d;)Lorg/b/a/d/c;
    .locals 5

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lorg/b/a/d/c;->a(Lorg/b/a/d/g;)V

    :cond_0
    if-nez p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No parsers supplied"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    aget-object v0, p2, v1

    if-nez v0, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No parser supplied"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lorg/b/a/d/h;->a(Lorg/b/a/d/g;)Lorg/b/a/d/m;

    move-result-object p1

    aget-object p2, p2, v1

    invoke-static {p2}, Lorg/b/a/d/f;->a(Lorg/b/a/d/d;)Lorg/b/a/d/k;

    move-result-object p2

    :goto_0
    invoke-direct {p0, p1, p2}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :cond_3
    new-array v3, v0, [Lorg/b/a/d/k;

    :goto_1
    add-int/lit8 v4, v0, -0x1

    if-ge v1, v4, :cond_5

    aget-object v4, p2, v1

    invoke-static {v4}, Lorg/b/a/d/f;->a(Lorg/b/a/d/d;)Lorg/b/a/d/k;

    move-result-object v4

    aput-object v4, v3, v1

    if-nez v4, :cond_4

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Incomplete parser array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    aget-object p2, p2, v1

    invoke-static {p2}, Lorg/b/a/d/f;->a(Lorg/b/a/d/d;)Lorg/b/a/d/k;

    move-result-object p2

    aput-object p2, v3, v1

    invoke-static {p1}, Lorg/b/a/d/h;->a(Lorg/b/a/d/g;)Lorg/b/a/d/m;

    move-result-object p1

    new-instance p2, Lorg/b/a/d/c$e;

    invoke-direct {p2, v3}, Lorg/b/a/d/c$e;-><init>([Lorg/b/a/d/k;)V

    goto :goto_0
.end method

.method public a(Lorg/b/a/d;)Lorg/b/a/d/c;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Field type must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Lorg/b/a/d/c$i;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/b/a/d/c$i;-><init>(Lorg/b/a/d;Z)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/d;I)Lorg/b/a/d/c;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Field type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-gtz p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal number of digits: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Lorg/b/a/d/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lorg/b/a/d/c$c;-><init>(Lorg/b/a/d;IZ)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/d;II)Lorg/b/a/d/c;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Field type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-ge p3, p2, :cond_1

    move p3, p2

    :cond_1
    if-ltz p2, :cond_4

    if-gtz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-gt p2, v0, :cond_3

    new-instance p2, Lorg/b/a/d/c$n;

    invoke-direct {p2, p1, p3, v1}, Lorg/b/a/d/c$n;-><init>(Lorg/b/a/d;IZ)V

    invoke-direct {p0, p2}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v0, Lorg/b/a/d/c$g;

    invoke-direct {v0, p1, p3, v1, p2}, Lorg/b/a/d/c$g;-><init>(Lorg/b/a/d;IZI)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public b(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->e()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public b(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->f()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->c(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public b(IZ)Lorg/b/a/d/c;
    .locals 2

    new-instance v0, Lorg/b/a/d/c$m;

    invoke-static {}, Lorg/b/a/d;->p()Lorg/b/a/d;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lorg/b/a/d/c$m;-><init>(Lorg/b/a/d;IZ)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/b/a/d/d;)Lorg/b/a/d/c;
    .locals 2

    invoke-direct {p0, p1}, Lorg/b/a/d/c;->c(Lorg/b/a/d/d;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/b/a/d/k;

    invoke-static {p1}, Lorg/b/a/d/f;->a(Lorg/b/a/d/d;)Lorg/b/a/d/k;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x0

    const/4 v1, 0x1

    aput-object p1, v0, v1

    new-instance v1, Lorg/b/a/d/c$e;

    invoke-direct {v1, v0}, Lorg/b/a/d/c$e;-><init>([Lorg/b/a/d/k;)V

    invoke-direct {p0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/b/a/d;)Lorg/b/a/d/c;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Field type must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Lorg/b/a/d/c$i;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lorg/b/a/d/c$i;-><init>(Lorg/b/a/d;Z)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/b/a/d;II)Lorg/b/a/d/c;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Field type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-ge p3, p2, :cond_1

    move p3, p2

    :cond_1
    if-ltz p2, :cond_4

    if-gtz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    if-gt p2, v0, :cond_3

    new-instance p2, Lorg/b/a/d/c$n;

    invoke-direct {p2, p1, p3, v0}, Lorg/b/a/d/c$n;-><init>(Lorg/b/a/d;IZ)V

    invoke-direct {p0, p2}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v1, Lorg/b/a/d/c$g;

    invoke-direct {v1, p1, p3, v0, p2}, Lorg/b/a/d/c$g;-><init>(Lorg/b/a/d;IZI)V

    invoke-direct {p0, v1}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public b()Lorg/b/a/d/d;
    .locals 2

    invoke-direct {p0}, Lorg/b/a/d/c;->k()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lorg/b/a/d/k;

    invoke-static {v0}, Lorg/b/a/d/l;->a(Lorg/b/a/d/k;)Lorg/b/a/d/d;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Parsing is not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->k()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->a(Lorg/b/a/d;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->g()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public c(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->g()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->c(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Lorg/b/a/d;II)Lorg/b/a/d/c;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Field type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-ge p3, p2, :cond_1

    move p3, p2

    :cond_1
    if-ltz p2, :cond_3

    if-gtz p3, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lorg/b/a/d/c$d;

    invoke-direct {v0, p1, p2, p3}, Lorg/b/a/d/c$d;-><init>(Lorg/b/a/d;II)V

    invoke-direct {p0, v0}, Lorg/b/a/d/c;->a(Ljava/lang/Object;)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public d()Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->l()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->a(Lorg/b/a/d;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->h()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public d(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->p()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->b(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public e()Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->l()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->b(Lorg/b/a/d;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->i()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public e(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->s()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->b(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public f()Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->r()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->a(Lorg/b/a/d;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->j()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public f(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->t()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public g()Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->r()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->b(Lorg/b/a/d;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public g(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->l()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public g(II)Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->v()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lorg/b/a/d/c;->b(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public h()Lorg/b/a/d/c;
    .locals 1

    invoke-static {}, Lorg/b/a/d;->w()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->a(Lorg/b/a/d;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public h(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->m()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public i()Lorg/b/a/d/c;
    .locals 3

    new-instance v0, Lorg/b/a/d/c$k;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lorg/b/a/d/c$k;-><init>(ILjava/util/Map;)V

    invoke-direct {p0, v0, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public i(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->n()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public j()Lorg/b/a/d/c;
    .locals 2

    sget-object v0, Lorg/b/a/d/c$j;->INSTANCE:Lorg/b/a/d/c$j;

    sget-object v1, Lorg/b/a/d/c$j;->INSTANCE:Lorg/b/a/d/c$j;

    invoke-direct {p0, v0, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d/m;Lorg/b/a/d/k;)Lorg/b/a/d/c;

    move-result-object v0

    return-object v0
.end method

.method public j(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->o()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method

.method public k(I)Lorg/b/a/d/c;
    .locals 2

    invoke-static {}, Lorg/b/a/d;->r()Lorg/b/a/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lorg/b/a/d/c;->a(Lorg/b/a/d;II)Lorg/b/a/d/c;

    move-result-object p1

    return-object p1
.end method
