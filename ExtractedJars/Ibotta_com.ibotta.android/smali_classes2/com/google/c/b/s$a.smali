.class abstract Lcom/google/c/b/s$a;
.super Lcom/google/c/b/s;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/b/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/s<",
        "TE;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 353
    invoke-direct {p0}, Lcom/google/c/b/s;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation
.end method

.method public c()Lcom/google/c/b/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "TE;>;"
        }
    .end annotation

    .line 358
    invoke-virtual {p0}, Lcom/google/c/b/s$a;->d()Lcom/google/c/b/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/m;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method

.method f()Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 363
    new-instance v0, Lcom/google/c/b/s$a$1;

    invoke-direct {v0, p0}, Lcom/google/c/b/s$a$1;-><init>(Lcom/google/c/b/s$a;)V

    return-object v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 353
    invoke-virtual {p0}, Lcom/google/c/b/s$a;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method
