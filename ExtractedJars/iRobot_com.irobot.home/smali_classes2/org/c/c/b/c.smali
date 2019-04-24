.class public Lorg/c/c/b/c;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/b/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/c/b/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/c/c/b/e<",
        "Lorg/c/e/g<",
        "Ljava/lang/String;",
        "*>;>;"
    }
.end annotation


# static fields
.field private static final a:[B


# instance fields
.field private final b:Ljava/util/Random;

.field private c:Ljava/nio/charset/Charset;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/j;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/b/e<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lorg/c/c/b/c;->a:[B

    return-void

    :array_0
    .array-data 1
        0x2dt
        0x5ft
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x30t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lorg/c/c/b/c;->b:Ljava/util/Random;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lorg/c/c/b/c;->c:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/c/c/b/c;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/c/c/b/c;->e:Ljava/util/List;

    iget-object v0, p0, Lorg/c/c/b/c;->d:Ljava/util/List;

    sget-object v1, Lorg/c/c/j;->d:Lorg/c/c/j;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lorg/c/c/b/c;->d:Ljava/util/List;

    sget-object v1, Lorg/c/c/j;->m:Lorg/c/c/j;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lorg/c/c/b/c;->e:Ljava/util/List;

    new-instance v1, Lorg/c/c/b/b;

    invoke-direct {v1}, Lorg/c/c/b/b;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/c/c/b/i;

    invoke-direct {v0}, Lorg/c/c/b/i;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/c/c/b/i;->a(Z)V

    iget-object v1, p0, Lorg/c/c/b/c;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lorg/c/c/b/c;->e:Ljava/util/List;

    new-instance v1, Lorg/c/c/b/h;

    invoke-direct {v1}, Lorg/c/c/b/h;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Ljava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0xd

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method private a(Ljava/io/OutputStream;Lorg/c/e/g;[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[B)V"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/e/g;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, p3, p1}, Lorg/c/c/b/c;->a([BLjava/io/OutputStream;)V

    invoke-direct {p0, v2}, Lorg/c/c/b/c;->b(Ljava/lang/Object;)Lorg/c/c/b;

    move-result-object v2

    invoke-direct {p0, v1, v2, p1}, Lorg/c/c/b/c;->a(Ljava/lang/String;Lorg/c/c/b;Ljava/io/OutputStream;)V

    invoke-direct {p0, p1}, Lorg/c/c/b/c;->a(Ljava/io/OutputStream;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;Lorg/c/c/b;Ljava/io/OutputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/c/c/b<",
            "*>;",
            "Ljava/io/OutputStream;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Lorg/c/c/b;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Lorg/c/c/b;->a()Lorg/c/c/c;

    move-result-object p2

    invoke-virtual {p2}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v2

    iget-object v3, p0, Lorg/c/c/b/c;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/c/c/b/e;

    invoke-interface {v4, v1, v2}, Lorg/c/c/b/e;->b(Ljava/lang/Class;Lorg/c/c/j;)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v1, Lorg/c/c/b/c$a;

    invoke-direct {v1, p0, p3}, Lorg/c/c/b/c$a;-><init>(Lorg/c/c/b/c;Ljava/io/OutputStream;)V

    invoke-interface {v1}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object p3

    invoke-virtual {p0, v0}, Lorg/c/c/b/c;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, p1, v3}, Lorg/c/c/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/c/c/c;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {v1}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/c/c/c;->putAll(Ljava/util/Map;)V

    :cond_1
    invoke-interface {v4, v0, v2, v1}, Lorg/c/c/b/e;->a(Ljava/lang/Object;Lorg/c/c/j;Lorg/c/c/g;)V

    return-void

    :cond_2
    new-instance p1, Lorg/c/c/b/g;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Could not write request: no suitable HttpMessageConverter found for request type ["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/c/c/b/g;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic a(Lorg/c/c/b/c;Ljava/io/OutputStream;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/c/c/b/c;->a(Ljava/io/OutputStream;)V

    return-void
.end method

.method private a(Lorg/c/e/g;Lorg/c/c/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lorg/c/c/g;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/c/c/b/c;->b()[B

    move-result-object v0

    const-string v1, "boundary"

    new-instance v2, Ljava/lang/String;

    const-string v3, "US-ASCII"

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lorg/c/c/j;

    sget-object v3, Lorg/c/c/j;->m:Lorg/c/c/j;

    invoke-direct {v2, v3, v1}, Lorg/c/c/j;-><init>(Lorg/c/c/j;Ljava/util/Map;)V

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-virtual {v1, v2}, Lorg/c/c/c;->a(Lorg/c/c/j;)V

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {p0, v1, p1, v0}, Lorg/c/c/b/c;->a(Ljava/io/OutputStream;Lorg/c/e/g;[B)V

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/c/c/b/c;->b([BLjava/io/OutputStream;)V

    return-void
.end method

.method private a([BLjava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0x2d

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-direct {p0, p2}, Lorg/c/c/b/c;->a(Ljava/io/OutputStream;)V

    return-void
.end method

.method private a(Lorg/c/e/g;Lorg/c/c/j;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    if-eqz p2, :cond_0

    sget-object p1, Lorg/c/c/j;->m:Lorg/c/c/j;

    invoke-virtual {p1, p2}, Lorg/c/c/j;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Lorg/c/e/g;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/c/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    instance-of v1, v1, Ljava/lang/String;

    if-nez v1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private b(Ljava/lang/Object;)Lorg/c/c/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lorg/c/c/b<",
            "*>;"
        }
    .end annotation

    instance-of v0, p1, Lorg/c/c/b;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/c/c/b;

    return-object p1

    :cond_0
    new-instance v0, Lorg/c/c/b;

    invoke-direct {v0, p1}, Lorg/c/c/b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method private b(Lorg/c/e/g;Lorg/c/c/j;Lorg/c/c/g;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lorg/c/c/j;",
            "Lorg/c/c/g;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p3}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0, p2}, Lorg/c/c/c;->a(Lorg/c/c/j;)V

    invoke-virtual {p2}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object p2

    sget-object v0, Lorg/c/c/j;->d:Lorg/c/c/j;

    invoke-virtual {p2, v0}, Lorg/c/c/c;->a(Lorg/c/c/j;)V

    :cond_1
    iget-object p2, p0, Lorg/c/c/b/c;->c:Ljava/nio/charset/Charset;

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lorg/c/e/g;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Lorg/c/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0x26

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v4, :cond_3

    const/16 v6, 0x3d

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-interface {p3}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object p2

    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p2, v0, v1}, Lorg/c/c/c;->a(J)V

    invoke-interface {p3}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/c/e/d;->a([BLjava/io/OutputStream;)V

    return-void
.end method

.method private b([BLjava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0x2d

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    invoke-direct {p0, p2}, Lorg/c/c/b/c;->a(Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/c;->b(Ljava/lang/Class;Lorg/c/c/d;)Lorg/c/e/g;

    move-result-object p1

    return-object p1
.end method

.method protected a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lorg/c/b/a/d;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/c/b/a/d;

    invoke-interface {p1}, Lorg/c/b/a/d;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/c/c/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/b/c;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lorg/c/c/j;Lorg/c/c/g;)V
    .locals 0

    check-cast p1, Lorg/c/e/g;

    invoke-virtual {p0, p1, p2, p3}, Lorg/c/c/b/c;->a(Lorg/c/e/g;Lorg/c/c/j;Lorg/c/c/g;)V

    return-void
.end method

.method public final a(Lorg/c/c/b/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/c/b/e<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "\'partConverter\' must not be NULL"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/c/c/b/c;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lorg/c/e/g;Lorg/c/c/j;Lorg/c/c/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "*>;",
            "Lorg/c/c/j;",
            "Lorg/c/c/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lorg/c/c/b/c;->a(Lorg/c/e/g;Lorg/c/c/j;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lorg/c/c/b/c;->b(Lorg/c/e/g;Lorg/c/c/j;Lorg/c/c/g;)V

    return-void

    :cond_0
    invoke-direct {p0, p1, p3}, Lorg/c/c/b/c;->a(Lorg/c/e/g;Lorg/c/c/g;)V

    return-void
.end method

.method public a(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    const-class v0, Lorg/c/e/g;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x1

    if-nez p2, :cond_1

    return p1

    :cond_1
    invoke-virtual {p0}, Lorg/c/c/b/c;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/c/c/j;

    sget-object v3, Lorg/c/c/j;->m:Lorg/c/c/j;

    invoke-virtual {v2, v3}, Lorg/c/c/j;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2, p2}, Lorg/c/c/j;->a(Lorg/c/c/j;)Z

    move-result v2

    if-eqz v2, :cond_2

    return p1

    :cond_3
    return v0
.end method

.method public b(Ljava/lang/Class;Lorg/c/c/d;)Lorg/c/e/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "*>;>;",
            "Lorg/c/c/d;",
            ")",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/c/c/b/c;->c:Ljava/nio/charset/Charset;

    :goto_0
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-static {v0}, Lorg/c/e/d;->a(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "&"

    invoke-static {p2, v0}, Lorg/c/e/i;->a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lorg/c/e/f;

    array-length v1, p2

    invoke-direct {v0, v1}, Lorg/c/e/f;-><init>(I)V

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v4, p2, v3

    const/16 v5, 0x3d

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v0, v4, v5}, Lorg/c/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v6, v4}, Lorg/c/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public b(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    const-class v0, Lorg/c/e/g;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x1

    if-eqz p2, :cond_4

    sget-object v1, Lorg/c/c/j;->a:Lorg/c/c/j;

    invoke-virtual {v1, p2}, Lorg/c/c/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return p1

    :cond_1
    invoke-virtual {p0}, Lorg/c/c/b/c;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/c/c/j;

    invoke-virtual {v2, p2}, Lorg/c/c/j;->b(Lorg/c/c/j;)Z

    move-result v2

    if-eqz v2, :cond_2

    return p1

    :cond_3
    return v0

    :cond_4
    return p1
.end method

.method protected b()[B
    .locals 5

    iget-object v0, p0, Lorg/c/c/b/c;->b:Ljava/util/Random;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1e

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    sget-object v2, Lorg/c/c/b/c;->a:[B

    iget-object v3, p0, Lorg/c/c/b/c;->b:Ljava/util/Random;

    sget-object v4, Lorg/c/c/b/c;->a:[B

    array-length v4, v4

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    aget-byte v2, v2, v3

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
