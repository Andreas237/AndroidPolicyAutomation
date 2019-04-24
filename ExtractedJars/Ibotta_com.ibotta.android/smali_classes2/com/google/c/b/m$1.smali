.class Lcom/google/c/b/m$1;
.super Lcom/google/c/b/a;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/b/m;->a(I)Lcom/google/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/c/b/m;


# direct methods
.method constructor <init>(Lcom/google/c/b/m;II)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/google/c/b/m$1;->a:Lcom/google/c/b/m;

    invoke-direct {p0, p2, p3}, Lcom/google/c/b/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 381
    iget-object v0, p0, Lcom/google/c/b/m$1;->a:Lcom/google/c/b/m;

    invoke-virtual {v0, p1}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
