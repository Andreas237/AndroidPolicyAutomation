.class public Lorg/junit/a/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/junit/a/d$1;

    invoke-direct {v0}, Lorg/junit/a/d$1;-><init>()V

    sput-object v0, Lorg/junit/a/d;->a:Ljava/util/Comparator;

    new-instance v0, Lorg/junit/a/d$2;

    invoke-direct {v0}, Lorg/junit/a/d$2;-><init>()V

    sput-object v0, Lorg/junit/a/d;->b:Ljava/util/Comparator;

    return-void
.end method

.method private static a(Lorg/junit/g;)Ljava/util/Comparator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/g;",
            ")",
            "Ljava/util/Comparator<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lorg/junit/a/d;->a:Ljava/util/Comparator;

    return-object p0

    :cond_0
    invoke-interface {p0}, Lorg/junit/g;->a()Lorg/junit/c/b;

    move-result-object p0

    invoke-virtual {p0}, Lorg/junit/c/b;->getComparator()Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    const-class v0, Lorg/junit/g;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lorg/junit/g;

    invoke-static {v0}, Lorg/junit/a/d;->a(Lorg/junit/g;)Ljava/util/Comparator;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :cond_0
    return-object p0
.end method
