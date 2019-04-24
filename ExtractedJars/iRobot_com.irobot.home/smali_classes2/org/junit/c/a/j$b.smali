.class Lorg/junit/c/a/j$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/c/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/junit/c/a/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/c/a/j$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/c/a/j$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/junit/c/a/d;Lorg/junit/c/a/d;)I
    .locals 1

    sget-object v0, Lorg/junit/a/d;->b:Ljava/util/Comparator;

    invoke-virtual {p1}, Lorg/junit/c/a/d;->d()Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p2}, Lorg/junit/c/a/d;->d()Ljava/lang/reflect/Method;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/junit/c/a/d;

    check-cast p2, Lorg/junit/c/a/d;

    invoke-virtual {p0, p1, p2}, Lorg/junit/c/a/j$b;->a(Lorg/junit/c/a/d;Lorg/junit/c/a/d;)I

    move-result p1

    return p1
.end method
