.class Lorg/c/f/a/k$f;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/a/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/c/f/a/i<",
        "Lorg/c/c/k<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/c/f/a/k;

.field private final b:Lorg/c/f/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/c/f/a/c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/c/f/a/k;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/c/f/a/k$f;->a:Lorg/c/f/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    const-class v0, Ljava/lang/Void;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/c/f/a/c;

    invoke-virtual {p1}, Lorg/c/f/a/k;->c()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lorg/c/f/a/c;-><init>(Ljava/lang/Class;Ljava/util/List;)V

    iput-object v0, p0, Lorg/c/f/a/k$f;->b:Lorg/c/f/a/c;

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/c/f/a/k$f;->b:Lorg/c/f/a/c;

    return-void
.end method


# virtual methods
.method public synthetic a(Lorg/c/c/a/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lorg/c/f/a/k$f;->b(Lorg/c/c/a/i;)Lorg/c/c/k;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/c/c/a/i;)Lorg/c/c/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/c/a/i;",
            ")",
            "Lorg/c/c/k<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/f/a/k$f;->b:Lorg/c/f/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/f/a/k$f;->b:Lorg/c/f/a/c;

    invoke-virtual {v0, p1}, Lorg/c/f/a/c;->a(Lorg/c/c/a/i;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lorg/c/c/k;

    invoke-interface {p1}, Lorg/c/c/a/i;->getHeaders()Lorg/c/c/c;

    move-result-object v2

    invoke-interface {p1}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Lorg/c/c/k;-><init>(Ljava/lang/Object;Lorg/c/e/g;Lorg/c/c/i;)V

    return-object v1

    :cond_0
    new-instance v0, Lorg/c/c/k;

    invoke-interface {p1}, Lorg/c/c/a/i;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-interface {p1}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lorg/c/c/k;-><init>(Lorg/c/e/g;Lorg/c/c/i;)V

    return-object v0
.end method
