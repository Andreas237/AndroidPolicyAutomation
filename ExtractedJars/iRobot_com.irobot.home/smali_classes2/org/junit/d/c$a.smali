.class abstract Lorg/junit/d/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lorg/junit/c/a/a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Lorg/junit/d/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/junit/d/b;

    invoke-direct {v0}, Lorg/junit/d/b;-><init>()V

    sput-object v0, Lorg/junit/d/c$a;->a:Lorg/junit/d/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/d/c$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/d/c$a;-><init>()V

    return-void
.end method

.method private a(Lorg/junit/c/a/a;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lorg/junit/c/a/a;->a()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-interface {v4}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lorg/junit/d/f;

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lorg/junit/d/f;

    if-eqz v4, :cond_0

    sget-object v5, Lorg/junit/d/c$a;->a:Lorg/junit/d/b;

    invoke-virtual {v5, v4}, Lorg/junit/d/b;->a(Lorg/junit/d/f;)Lorg/junit/d/a;

    move-result-object v4

    invoke-virtual {p0, v4, p1}, Lorg/junit/d/c$a;->a(Lorg/junit/d/a;Lorg/junit/c/a/a;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method abstract a(Lorg/junit/c/a/j;)Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/j;",
            ")",
            "Ljava/lang/Iterable<",
            "TT;>;"
        }
    .end annotation
.end method

.method abstract a(Lorg/junit/d/a;Lorg/junit/c/a/a;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/d/a;",
            "TT;)",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end method

.method public b(Lorg/junit/c/a/j;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/j;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lorg/junit/d/c$a;->a(Lorg/junit/c/a/j;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/c/a/a;

    invoke-direct {p0, v1}, Lorg/junit/d/c$a;->a(Lorg/junit/c/a/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
