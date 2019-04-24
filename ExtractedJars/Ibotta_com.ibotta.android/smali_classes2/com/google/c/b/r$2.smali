.class Lcom/google/c/b/r$2;
.super Lcom/google/c/b/i;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/b/r;->d()Lcom/google/c/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/i<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/c/b/m;

.field final synthetic b:Lcom/google/c/b/r;


# direct methods
.method constructor <init>(Lcom/google/c/b/r;Lcom/google/c/b/m;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/google/c/b/r$2;->b:Lcom/google/c/b/r;

    iput-object p2, p0, Lcom/google/c/b/r$2;->a:Lcom/google/c/b/m;

    invoke-direct {p0}, Lcom/google/c/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/google/c/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "TV;>;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/google/c/b/r$2;->b:Lcom/google/c/b/r;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/google/c/b/r$2;->a:Lcom/google/c/b/m;

    invoke-virtual {v0, p1}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
