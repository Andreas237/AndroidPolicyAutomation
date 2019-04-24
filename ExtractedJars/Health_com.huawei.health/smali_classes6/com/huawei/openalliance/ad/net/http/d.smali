.class public Lcom/huawei/openalliance/ad/net/http/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/net/http/d$a;
    }
.end annotation


# instance fields
.field final a:Lcom/huawei/openalliance/ad/net/http/e;

.field final b:I

.field final c:I

.field final d:Lcom/huawei/openalliance/ad/net/http/g;

.field final e:Lcom/huawei/openalliance/ad/net/http/b/a;

.field final f:Lcom/huawei/openalliance/ad/net/http/b/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/net/http/d$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->a:Lcom/huawei/openalliance/ad/net/http/e;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d;->a:Lcom/huawei/openalliance/ad/net/http/e;

    iget v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->b:I

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/d;->b:I

    iget v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->c:I

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/d;->c:I

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->d:Lcom/huawei/openalliance/ad/net/http/g;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->d:Lcom/huawei/openalliance/ad/net/http/g;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/net/http/HttpCallerFactory;->a()Lcom/huawei/openalliance/ad/net/http/g;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d;->d:Lcom/huawei/openalliance/ad/net/http/g;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->e:Lcom/huawei/openalliance/ad/net/http/b/a;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d;->e:Lcom/huawei/openalliance/ad/net/http/b/a;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/d$a;->f:Lcom/huawei/openalliance/ad/net/http/b/a;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d;->f:Lcom/huawei/openalliance/ad/net/http/b/a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/a/k;
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/net/http/d;->b(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/a/k;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/a/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lcom/huawei/openalliance/ad/net/http/a/k;"
        }
    .end annotation

    const-class v0, Lcom/huawei/openalliance/ad/net/http/a/k;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/net/http/a/k;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/c;
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/net/http/d;->c(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/c;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lcom/huawei/openalliance/ad/net/http/c;"
        }
    .end annotation

    const-class v0, Lcom/huawei/openalliance/ad/net/http/a/e;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/net/http/a/e;

    invoke-virtual {p0, v1}, Lcom/huawei/openalliance/ad/net/http/d;->a(Lcom/huawei/openalliance/ad/net/http/a/e;)Lcom/huawei/openalliance/ad/net/http/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(Lcom/huawei/openalliance/ad/net/http/a/e;)Lcom/huawei/openalliance/ad/net/http/c;
    .locals 7

    new-instance v2, Lcom/huawei/openalliance/ad/net/http/c;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/net/http/c;-><init>()V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/net/http/a/e;->a()[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_1

    aget-object v5, v3, v4

    const-string v0, ":"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v0, v6

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/net/http/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "service class cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Service must be interface."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    new-instance v2, Lcom/huawei/openalliance/ad/net/http/d$1;

    invoke-direct {v2, p0, p1}, Lcom/huawei/openalliance/ad/net/http/d$1;-><init>(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/Class;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
