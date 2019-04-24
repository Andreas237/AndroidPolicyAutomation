.class Lorg/c/c/a/m$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/a/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/c/a/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/c/c/a/m;

.field private final b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lorg/c/c/a/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lorg/c/c/a/m;)V
    .locals 0

    iput-object p1, p0, Lorg/c/c/a/m$a;->a:Lorg/c/c/a/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lorg/c/c/a/m;->a(Lorg/c/c/a/m;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lorg/c/c/a/m$a;->b:Ljava/util/Iterator;

    return-void
.end method

.method synthetic constructor <init>(Lorg/c/c/a/m;Lorg/c/c/a/m$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/c/c/a/m$a;-><init>(Lorg/c/c/a/m;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/c/c/h;[B)Lorg/c/c/a/i;
    .locals 3

    iget-object v0, p0, Lorg/c/c/a/m$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/c/a/m$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/c/c/a/h;

    invoke-interface {v0, p1, p2, p0}, Lorg/c/c/a/h;->intercept(Lorg/c/c/h;[BLorg/c/c/a/f;)Lorg/c/c/a/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lorg/c/c/a/m$a;->a:Lorg/c/c/a/m;

    invoke-static {v0}, Lorg/c/c/a/m;->b(Lorg/c/c/a/m;)Lorg/c/c/a/g;

    move-result-object v0

    invoke-interface {p1}, Lorg/c/c/h;->getURI()Ljava/net/URI;

    move-result-object v1

    invoke-interface {p1}, Lorg/c/c/h;->getMethod()Lorg/c/c/f;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/c/c/a/g;->createRequest(Ljava/net/URI;Lorg/c/c/f;)Lorg/c/c/a/e;

    move-result-object v0

    invoke-interface {v0}, Lorg/c/c/a/e;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-interface {p1}, Lorg/c/c/h;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/c/c/c;->putAll(Ljava/util/Map;)V

    array-length p1, p2

    if-lez p1, :cond_1

    invoke-interface {v0}, Lorg/c/c/a/e;->a()Ljava/io/OutputStream;

    move-result-object p1

    invoke-static {p2, p1}, Lorg/c/e/d;->a([BLjava/io/OutputStream;)V

    :cond_1
    invoke-interface {v0}, Lorg/c/c/a/e;->b()Lorg/c/c/a/i;

    move-result-object p1

    return-object p1
.end method
