.class Lcom/google/c/b/z;
.super Lcom/google/c/b/i;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/i<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/c/b/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/k<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/c/b/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/m<",
            "+TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/c/b/k;Lcom/google/c/b/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/c/b/k<",
            "TE;>;",
            "Lcom/google/c/b/m<",
            "+TE;>;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Lcom/google/c/b/i;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/google/c/b/z;->a:Lcom/google/c/b/k;

    .line 36
    iput-object p2, p0, Lcom/google/c/b/z;->b:Lcom/google/c/b/m;

    return-void
.end method

.method constructor <init>(Lcom/google/c/b/k;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/c/b/k<",
            "TE;>;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 40
    invoke-static {p2}, Lcom/google/c/b/m;->a([Ljava/lang/Object;)Lcom/google/c/b/m;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/c/b/z;-><init>(Lcom/google/c/b/k;Lcom/google/c/b/m;)V

    return-void
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/google/c/b/z;->b:Lcom/google/c/b/m;

    invoke-virtual {v0, p1, p2}, Lcom/google/c/b/m;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public a(I)Lcom/google/c/b/ak;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/c/b/ak<",
            "TE;>;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/google/c/b/z;->b:Lcom/google/c/b/m;

    invoke-virtual {v0, p1}, Lcom/google/c/b/m;->a(I)Lcom/google/c/b/ak;

    move-result-object p1

    return-object p1
.end method

.method a()Lcom/google/c/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "TE;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/google/c/b/z;->a:Lcom/google/c/b/k;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/google/c/b/z;->b:Lcom/google/c/b/m;

    invoke-virtual {v0, p1}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 28
    invoke-virtual {p0, p1}, Lcom/google/c/b/z;->a(I)Lcom/google/c/b/ak;

    move-result-object p1

    return-object p1
.end method
