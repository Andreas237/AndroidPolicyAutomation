.class Lcom/moat/analytics/mobile/spck/y;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/moat/analytics/mobile/spck/y$b;,
        Lcom/moat/analytics/mobile/spck/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/reflect/InvocationHandler;"
    }
.end annotation


# static fields
.field private static final a:[Ljava/lang/Object;


# instance fields
.field private final b:Lcom/moat/analytics/mobile/spck/y$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/moat/analytics/mobile/spck/y$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/moat/analytics/mobile/spck/y<",
            "TT;>.b;>;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/moat/analytics/mobile/spck/y;->a:[Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/moat/analytics/mobile/spck/y$a<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/a/a/a;->a(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/y;->b:Lcom/moat/analytics/mobile/spck/y$a;

    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/y;->c:Ljava/lang/Class;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object p1

    new-instance p2, Lcom/moat/analytics/mobile/spck/y$1;

    invoke-direct {p2, p0}, Lcom/moat/analytics/mobile/spck/y$1;-><init>(Lcom/moat/analytics/mobile/spck/y;)V

    invoke-virtual {p1, p2}, Lcom/moat/analytics/mobile/spck/x;->a(Lcom/moat/analytics/mobile/spck/x$b;)V

    return-void
.end method

.method static a(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/moat/analytics/mobile/spck/y$a<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    new-instance v1, Lcom/moat/analytics/mobile/spck/y;

    invoke-direct {v1, p0, p1}, Lcom/moat/analytics/mobile/spck/y;-><init>(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)V

    const/4 p0, 0x1

    new-array p0, p0, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, p0, v2

    invoke-static {v0, p0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v1

    const-class v2, Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getClass"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/y;->c:Ljava/lang/Class;

    return-object p1

    :cond_0
    const-string/jumbo v1, "toString"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-class p2, Lcom/moat/analytics/mobile/spck/y;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/y;->e:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->f:Ljava/lang/Object;

    if-nez v0, :cond_3

    iget-object p2, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    invoke-virtual {p2}, Ljava/util/LinkedList;->clear()V

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/y;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v0, v1, Lcom/moat/analytics/mobile/spck/x;->a:Lcom/moat/analytics/mobile/spck/x$d;

    sget-object v2, Lcom/moat/analytics/mobile/spck/x$d;->b:Lcom/moat/analytics/mobile/spck/x$d;

    if-ne v0, v2, :cond_4

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/y;->c()V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->f:Ljava/lang/Object;

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object v0, v1, Lcom/moat/analytics/mobile/spck/x;->a:Lcom/moat/analytics/mobile/spck/x$d;

    sget-object v1, Lcom/moat/analytics/mobile/spck/x$d;->a:Lcom/moat/analytics/mobile/spck/x$d;

    if-ne v0, v1, :cond_6

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/y;->e:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->f:Ljava/lang/Object;

    if-eqz v0, :cond_6

    :cond_5
    invoke-direct {p0, p1, p2}, Lcom/moat/analytics/mobile/spck/y;->b(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    :cond_6
    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/y;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/y;->c()V

    return-void
.end method

.method static synthetic a()[Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/moat/analytics/mobile/spck/y;->a:[Ljava/lang/Object;

    return-object v0
.end method

.method private b()V
    .locals 3

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/y;->e:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->b:Lcom/moat/analytics/mobile/spck/y$a;

    invoke-interface {v0}, Lcom/moat/analytics/mobile/spck/y$a;->a()Lcom/moat/analytics/mobile/spck/a/b/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/moat/analytics/mobile/spck/a/b/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->f:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "OnOffTrackerProxy"

    const-string v2, "Could not create instance"

    invoke-static {v1, p0, v2, v0}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/y;->e:Z

    :cond_0
    return-void
.end method

.method private b(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v1, 0xf

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    new-instance v1, Lcom/moat/analytics/mobile/spck/y$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/moat/analytics/mobile/spck/y$b;-><init>(Lcom/moat/analytics/mobile/spck/y;Ljava/lang/reflect/Method;[Ljava/lang/Object;Lcom/moat/analytics/mobile/spck/y$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private c()V
    .locals 9

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/y;->b()V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->f:Ljava/lang/Object;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/moat/analytics/mobile/spck/y$b;

    :try_start_0
    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/y$b;->a(Lcom/moat/analytics/mobile/spck/y$b;)[Ljava/lang/ref/WeakReference;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/y$b;->a(Lcom/moat/analytics/mobile/spck/y$b;)[Ljava/lang/ref/WeakReference;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v7, v3, v5

    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v7}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v2, v6

    add-int/lit8 v5, v5, 0x1

    move v6, v8

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/y$b;->b(Lcom/moat/analytics/mobile/spck/y$b;)Ljava/lang/reflect/Method;

    move-result-object v1

    iget-object v3, p0, Lcom/moat/analytics/mobile/spck/y;->f:Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/y;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-direct {p0, p2, p3}, Lcom/moat/analytics/mobile/spck/y;->a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    invoke-direct {p0, p2}, Lcom/moat/analytics/mobile/spck/y;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
