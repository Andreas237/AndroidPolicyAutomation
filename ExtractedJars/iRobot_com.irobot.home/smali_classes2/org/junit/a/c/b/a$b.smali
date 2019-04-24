.class final Lorg/junit/a/c/b/a$b;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/junit/a/c/b/a$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/a/c/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/a/c/b/a$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/a/c/b/a$b;-><init>()V

    return-void
.end method

.method private a(Lorg/junit/c/a/c;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/c<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lorg/junit/c/a/c;->f()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public a(Lorg/junit/c/a/c;Ljava/lang/Class;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/c<",
            "*>;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/junit/a/c/b/a$b;->a(Lorg/junit/c/a/c;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/junit/a/c/b/b;

    const-string v1, "must be declared in a public class."

    invoke-direct {v0, p1, p2, v1}, Lorg/junit/a/c/b/b;-><init>(Lorg/junit/c/a/c;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
