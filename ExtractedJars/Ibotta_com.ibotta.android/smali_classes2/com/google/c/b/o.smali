.class Lcom/google/c/b/o;
.super Lcom/google/c/b/l;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/l<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/google/c/b/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    invoke-static {p1, p2}, Lcom/google/c/b/e;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static a(I)[Lcom/google/c/b/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I)[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation

    .line 44
    new-array p0, p0, [Lcom/google/c/b/o;

    return-object p0
.end method


# virtual methods
.method a()Lcom/google/c/b/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method b()Lcom/google/c/b/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
