.class final Lcom/google/c/b/p$a;
.super Lcom/google/c/b/p;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/b/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/p<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private final transient a:Lcom/google/c/b/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient b:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/c/b/n;[Ljava/util/Map$Entry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/c/b/n<",
            "TK;TV;>;[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Lcom/google/c/b/p;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/google/c/b/p$a;->a:Lcom/google/c/b/n;

    .line 40
    iput-object p2, p0, Lcom/google/c/b/p$a;->b:[Ljava/util/Map$Entry;

    return-void
.end method


# virtual methods
.method a()Lcom/google/c/b/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/google/c/b/p$a;->a:Lcom/google/c/b/n;

    return-object v0
.end method

.method public c()Lcom/google/c/b/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/google/c/b/p$a;->b:[Ljava/util/Map$Entry;

    invoke-static {v0}, Lcom/google/c/b/t;->a([Ljava/lang/Object;)Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method

.method f()Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/google/c/b/z;

    iget-object v1, p0, Lcom/google/c/b/p$a;->b:[Ljava/util/Map$Entry;

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/z;-><init>(Lcom/google/c/b/k;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/google/c/b/p$a;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method
