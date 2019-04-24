.class public Lorg/junit/runner/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final a:Lorg/junit/runner/c;

.field public static final b:Lorg/junit/runner/c;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final d:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/junit/runner/c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;

.field private final f:Ljava/io/Serializable;

.field private final g:[Ljava/lang/annotation/Annotation;

.field private volatile h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "([\\s\\S]*)\\((.*)\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/junit/runner/c;->c:Ljava/util/regex/Pattern;

    new-instance v0, Lorg/junit/runner/c;

    const-string v1, "No Tests"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/annotation/Annotation;

    const/4 v4, 0x0

    invoke-direct {v0, v4, v1, v3}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V

    sput-object v0, Lorg/junit/runner/c;->a:Lorg/junit/runner/c;

    new-instance v0, Lorg/junit/runner/c;

    const-string v1, "Test mechanism"

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v0, v4, v1, v2}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V

    sput-object v0, Lorg/junit/runner/c;->b:Lorg/junit/runner/c;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/io/Serializable;[Ljava/lang/annotation/Annotation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/io/Serializable;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/c;->d:Ljava/util/Collection;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The unique id must not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-object p1, p0, Lorg/junit/runner/c;->h:Ljava/lang/Class;

    iput-object p2, p0, Lorg/junit/runner/c;->e:Ljava/lang/String;

    iput-object p3, p0, Lorg/junit/runner/c;->f:Ljava/io/Serializable;

    iput-object p4, p0, Lorg/junit/runner/c;->g:[Ljava/lang/annotation/Annotation;

    return-void

    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The display name must not be empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p2, p3}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/io/Serializable;[Ljava/lang/annotation/Annotation;)V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "%s(%s)"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Class;)Lorg/junit/runner/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/c;"
        }
    .end annotation

    new-instance v0, Lorg/junit/runner/c;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;)Lorg/junit/runner/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Lorg/junit/runner/c;"
        }
    .end annotation

    new-instance v0, Lorg/junit/runner/c;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lorg/junit/runner/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    invoke-direct {v0, p0, p1, v1}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)Lorg/junit/runner/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lorg/junit/runner/c;"
        }
    .end annotation

    new-instance v0, Lorg/junit/runner/c;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lorg/junit/runner/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/annotation/Annotation;)Lorg/junit/runner/c;
    .locals 2

    new-instance v0, Lorg/junit/runner/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lorg/junit/runner/c;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lorg/junit/runner/c;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/c;->d:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/junit/runner/c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lorg/junit/runner/c;

    iget-object v0, p0, Lorg/junit/runner/c;->f:Ljava/io/Serializable;

    iget-object p1, p1, Lorg/junit/runner/c;->f:Ljava/io/Serializable;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/c;->f:Ljava/io/Serializable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/junit/runner/c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
