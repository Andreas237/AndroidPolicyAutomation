.class Lcom/google/c/b/s$a$1;
.super Lcom/google/c/b/i;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/b/s$a;->f()Lcom/google/c/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/i<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/c/b/s$a;


# direct methods
.method constructor <init>(Lcom/google/c/b/s$a;)V
    .locals 0

    .line 363
    iput-object p1, p0, Lcom/google/c/b/s$a$1;->a:Lcom/google/c/b/s$a;

    invoke-direct {p0}, Lcom/google/c/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method synthetic a()Lcom/google/c/b/k;
    .locals 1

    .line 363
    invoke-virtual {p0}, Lcom/google/c/b/s$a$1;->g()Lcom/google/c/b/s$a;

    move-result-object v0

    return-object v0
.end method

.method g()Lcom/google/c/b/s$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s$a<",
            "TE;>;"
        }
    .end annotation

    .line 371
    iget-object v0, p0, Lcom/google/c/b/s$a$1;->a:Lcom/google/c/b/s$a;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 366
    iget-object v0, p0, Lcom/google/c/b/s$a$1;->a:Lcom/google/c/b/s$a;

    invoke-virtual {v0, p1}, Lcom/google/c/b/s$a;->a(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
