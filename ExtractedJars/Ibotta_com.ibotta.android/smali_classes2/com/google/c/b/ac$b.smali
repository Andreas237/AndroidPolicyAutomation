.class final Lcom/google/c/b/ac$b;
.super Lcom/google/c/b/m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/b/ac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/m<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/c/b/ac;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/ac<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/c/b/ac;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/c/b/ac<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 219
    invoke-direct {p0}, Lcom/google/c/b/m;-><init>()V

    .line 220
    iput-object p1, p0, Lcom/google/c/b/ac$b;->a:Lcom/google/c/b/ac;

    return-void
.end method


# virtual methods
.method b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/google/c/b/ac$b;->a:Lcom/google/c/b/ac;

    invoke-static {v0}, Lcom/google/c/b/ac;->a(Lcom/google/c/b/ac;)[Ljava/util/Map$Entry;

    move-result-object v0

    aget-object p1, v0, p1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/google/c/b/ac$b;->a:Lcom/google/c/b/ac;

    invoke-virtual {v0}, Lcom/google/c/b/ac;->size()I

    move-result v0

    return v0
.end method
