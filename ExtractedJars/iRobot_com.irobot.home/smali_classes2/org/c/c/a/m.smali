.class Lorg/c/c/a/m;
.super Lorg/c/c/a/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/c/a/m$a;
    }
.end annotation


# instance fields
.field private final a:Lorg/c/c/a/g;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lorg/c/c/f;

.field private d:Ljava/net/URI;


# direct methods
.method protected constructor <init>(Lorg/c/c/a/g;Ljava/util/List;Ljava/net/URI;Lorg/c/c/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/c/a/g;",
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;",
            "Ljava/net/URI;",
            "Lorg/c/c/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lorg/c/c/a/a;-><init>()V

    iput-object p1, p0, Lorg/c/c/a/m;->a:Lorg/c/c/a/g;

    iput-object p2, p0, Lorg/c/c/a/m;->b:Ljava/util/List;

    iput-object p4, p0, Lorg/c/c/a/m;->c:Lorg/c/c/f;

    iput-object p3, p0, Lorg/c/c/a/m;->d:Ljava/net/URI;

    return-void
.end method

.method static synthetic a(Lorg/c/c/a/m;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/c/c/a/m;->b:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lorg/c/c/a/m;)Lorg/c/c/a/g;
    .locals 0

    iget-object p0, p0, Lorg/c/c/a/m;->a:Lorg/c/c/a/g;

    return-object p0
.end method


# virtual methods
.method protected final a(Lorg/c/c/c;[B)Lorg/c/c/a/i;
    .locals 1

    new-instance p1, Lorg/c/c/a/m$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lorg/c/c/a/m$a;-><init>(Lorg/c/c/a/m;Lorg/c/c/a/m$1;)V

    invoke-virtual {p1, p0, p2}, Lorg/c/c/a/m$a;->a(Lorg/c/c/h;[B)Lorg/c/c/a/i;

    move-result-object p1

    return-object p1
.end method

.method public getMethod()Lorg/c/c/f;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/m;->c:Lorg/c/c/f;

    return-object v0
.end method

.method public getURI()Ljava/net/URI;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/m;->d:Ljava/net/URI;

    return-object v0
.end method
