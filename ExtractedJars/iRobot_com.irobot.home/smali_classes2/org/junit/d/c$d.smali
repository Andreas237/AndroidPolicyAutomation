.class Lorg/junit/d/c$d;
.super Lorg/junit/d/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/junit/d/c$a<",
        "Lorg/junit/c/a/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/junit/d/c$a;-><init>(Lorg/junit/d/c$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/d/c$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/d/c$d;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lorg/junit/c/a/j;)Ljava/lang/Iterable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/j;",
            ")",
            "Ljava/lang/Iterable<",
            "Lorg/junit/c/a/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lorg/junit/c/a/j;->b()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic a(Lorg/junit/d/a;Lorg/junit/c/a/a;)Ljava/util/List;
    .locals 0

    check-cast p2, Lorg/junit/c/a/d;

    invoke-virtual {p0, p1, p2}, Lorg/junit/d/c$d;->a(Lorg/junit/d/a;Lorg/junit/c/a/d;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method a(Lorg/junit/d/a;Lorg/junit/c/a/d;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/d/a;",
            "Lorg/junit/c/a/d;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/junit/d/a;->a(Lorg/junit/c/a/d;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
