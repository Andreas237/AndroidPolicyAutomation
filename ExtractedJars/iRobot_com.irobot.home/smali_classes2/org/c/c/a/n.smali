.class public Lorg/c/c/a/n;
.super Lorg/c/c/a/c;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/c/c/a/g;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/c/a/g;",
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/c/c/a/c;-><init>(Lorg/c/c/a/g;)V

    const-string v0, "\'requestFactory\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lorg/c/c/a/n;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected a(Ljava/net/URI;Lorg/c/c/f;Lorg/c/c/a/g;)Lorg/c/c/a/e;
    .locals 2

    new-instance v0, Lorg/c/c/a/m;

    iget-object v1, p0, Lorg/c/c/a/n;->a:Ljava/util/List;

    invoke-direct {v0, p3, v1, p1, p2}, Lorg/c/c/a/m;-><init>(Lorg/c/c/a/g;Ljava/util/List;Ljava/net/URI;Lorg/c/c/f;)V

    return-object v0
.end method
