.class Lcom/google/c/b/m$a;
.super Lcom/google/c/b/m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/m<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient a:I

.field final transient b:I

.field final synthetic c:Lcom/google/c/b/m;


# direct methods
.method constructor <init>(Lcom/google/c/b/m;II)V
    .locals 0

    .line 439
    iput-object p1, p0, Lcom/google/c/b/m$a;->c:Lcom/google/c/b/m;

    invoke-direct {p0}, Lcom/google/c/b/m;-><init>()V

    .line 440
    iput p2, p0, Lcom/google/c/b/m$a;->a:I

    .line 441
    iput p3, p0, Lcom/google/c/b/m$a;->b:I

    return-void
.end method


# virtual methods
.method public a(II)Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 457
    iget v0, p0, Lcom/google/c/b/m$a;->b:I

    invoke-static {p1, p2, v0}, Lcom/google/c/a/h;->a(III)V

    .line 458
    iget-object v0, p0, Lcom/google/c/b/m$a;->c:Lcom/google/c/b/m;

    iget v1, p0, Lcom/google/c/b/m$a;->a:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/c/b/m;->a(II)Lcom/google/c/b/m;

    move-result-object p1

    return-object p1
.end method

.method b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 451
    iget v0, p0, Lcom/google/c/b/m$a;->b:I

    invoke-static {p1, v0}, Lcom/google/c/a/h;->a(II)I

    .line 452
    iget-object v0, p0, Lcom/google/c/b/m$a;->c:Lcom/google/c/b/m;

    iget v1, p0, Lcom/google/c/b/m$a;->a:I

    add-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 446
    iget v0, p0, Lcom/google/c/b/m$a;->b:I

    return v0
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 435
    invoke-virtual {p0, p1, p2}, Lcom/google/c/b/m$a;->a(II)Lcom/google/c/b/m;

    move-result-object p1

    return-object p1
.end method
