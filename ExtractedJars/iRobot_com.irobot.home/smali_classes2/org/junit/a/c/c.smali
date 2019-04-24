.class public Lorg/junit/a/c/c;
.super Lorg/junit/runner/k;

# interfaces
.implements Lorg/junit/runner/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/a/c/c$a;
    }
.end annotation


# instance fields
.field private volatile a:Ljunit/b/d;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Ljunit/b/i;

    const-class v1, Ljunit/b/e;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Ljunit/b/i;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0, v0}, Lorg/junit/a/c/c;-><init>(Ljunit/b/d;)V

    return-void
.end method

.method public constructor <init>(Ljunit/b/d;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/runner/k;-><init>()V

    invoke-direct {p0, p1}, Lorg/junit/a/c/c;->b(Ljunit/b/d;)V

    return-void
.end method

.method private static a(Ljunit/b/i;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljunit/b/i;->a()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    const-string v3, " [example: %s]"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljunit/b/i;->a(I)Ljunit/b/d;

    move-result-object p0

    aput-object p0, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v3, "TestSuite with %s tests%s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v2

    aput-object p0, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljunit/b/d;)Lorg/junit/runner/c;
    .locals 4

    instance-of v0, p0, Ljunit/b/e;

    if-eqz v0, :cond_0

    check-cast p0, Ljunit/b/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljunit/b/e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lorg/junit/a/c/c;->a(Ljunit/b/e;)[Ljava/lang/annotation/Annotation;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lorg/junit/runner/c;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)Lorg/junit/runner/c;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljunit/b/i;

    if-eqz v0, :cond_3

    check-cast p0, Ljunit/b/i;

    invoke-virtual {p0}, Ljunit/b/i;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lorg/junit/a/c/c;->a(Ljunit/b/i;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljunit/b/i;->b()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/annotation/Annotation;

    invoke-static {v0, v2}, Lorg/junit/runner/c;->a(Ljava/lang/String;[Ljava/lang/annotation/Annotation;)Lorg/junit/runner/c;

    move-result-object v0

    invoke-virtual {p0}, Ljunit/b/i;->c()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Ljunit/b/i;->a(I)Ljunit/b/d;

    move-result-object v3

    invoke-static {v3}, Lorg/junit/a/c/c;->a(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/junit/runner/c;->a(Lorg/junit/runner/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    instance-of v0, p0, Lorg/junit/runner/b;

    if-eqz v0, :cond_4

    check-cast p0, Lorg/junit/runner/b;

    invoke-interface {p0}, Lorg/junit/runner/b;->a()Lorg/junit/runner/c;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Ljunit/a/a;

    if-eqz v0, :cond_5

    check-cast p0, Ljunit/a/a;

    invoke-virtual {p0}, Ljunit/a/a;->b()Ljunit/b/d;

    move-result-object p0

    invoke-static {p0}, Lorg/junit/a/c/c;->a(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lorg/junit/runner/c;->a(Ljava/lang/Class;)Lorg/junit/runner/c;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljunit/b/e;)[Ljava/lang/annotation/Annotation;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljunit/b/e;->f()Ljava/lang/String;

    move-result-object p0

    new-array v2, v0, [Ljava/lang/Class;

    invoke-virtual {v1, p0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-array p0, v0, [Ljava/lang/annotation/Annotation;

    return-object p0
.end method

.method private b()Ljunit/b/d;
    .locals 1

    iget-object v0, p0, Lorg/junit/a/c/c;->a:Ljunit/b/d;

    return-object v0
.end method

.method private b(Ljunit/b/d;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/a/c/c;->a:Ljunit/b/d;

    return-void
.end method


# virtual methods
.method public a()Lorg/junit/runner/c;
    .locals 1

    invoke-direct {p0}, Lorg/junit/a/c/c;->b()Ljunit/b/d;

    move-result-object v0

    invoke-static {v0}, Lorg/junit/a/c/c;->a(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object v0

    return-object v0
.end method

.method public a(Lorg/junit/runner/a/a;)V
    .locals 6

    invoke-direct {p0}, Lorg/junit/a/c/c;->b()Ljunit/b/d;

    move-result-object v0

    instance-of v0, v0, Lorg/junit/runner/a/b;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/junit/a/c/c;->b()Ljunit/b/d;

    move-result-object v0

    check-cast v0, Lorg/junit/runner/a/b;

    invoke-interface {v0, p1}, Lorg/junit/runner/a/b;->a(Lorg/junit/runner/a/a;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lorg/junit/a/c/c;->b()Ljunit/b/d;

    move-result-object v0

    instance-of v0, v0, Ljunit/b/i;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lorg/junit/a/c/c;->b()Ljunit/b/d;

    move-result-object v0

    check-cast v0, Ljunit/b/i;

    new-instance v1, Ljunit/b/i;

    invoke-virtual {v0}, Ljunit/b/i;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljunit/b/i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljunit/b/i;->c()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Ljunit/b/i;->a(I)Ljunit/b/d;

    move-result-object v4

    invoke-static {v4}, Lorg/junit/a/c/c;->a(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object v5

    invoke-virtual {p1, v5}, Lorg/junit/runner/a/a;->a(Lorg/junit/runner/c;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4}, Ljunit/b/i;->a(Ljunit/b/d;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-direct {p0, v1}, Lorg/junit/a/c/c;->b(Ljunit/b/d;)V

    invoke-virtual {v1}, Ljunit/b/i;->c()I

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Lorg/junit/runner/a/c;

    invoke-direct {p1}, Lorg/junit/runner/a/c;-><init>()V

    throw p1

    :cond_3
    return-void
.end method

.method public a(Lorg/junit/runner/b/c;)V
    .locals 1

    new-instance v0, Ljunit/b/h;

    invoke-direct {v0}, Ljunit/b/h;-><init>()V

    invoke-virtual {p0, p1}, Lorg/junit/a/c/c;->b(Lorg/junit/runner/b/c;)Ljunit/b/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljunit/b/h;->a(Ljunit/b/g;)V

    invoke-direct {p0}, Lorg/junit/a/c/c;->b()Ljunit/b/d;

    move-result-object p1

    invoke-interface {p1, v0}, Ljunit/b/d;->b(Ljunit/b/h;)V

    return-void
.end method

.method public b(Lorg/junit/runner/b/c;)Ljunit/b/g;
    .locals 2

    new-instance v0, Lorg/junit/a/c/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/junit/a/c/c$a;-><init>(Lorg/junit/runner/b/c;Lorg/junit/a/c/c$1;)V

    return-object v0
.end method
