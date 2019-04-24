.class final Lcom/google/c/b/ad;
.super Lcom/google/c/b/s$a;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/s$a<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/c/b/ad;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/ad<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient b:[Ljava/lang/Object;

.field private final transient c:[Ljava/lang/Object;

.field private final transient d:I

.field private final transient e:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 31
    new-instance v0, Lcom/google/c/b/ad;

    sget-object v1, Lcom/google/c/b/w;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v2}, Lcom/google/c/b/ad;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/c/b/ad;->a:Lcom/google/c/b/ad;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/google/c/b/s$a;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/google/c/b/ad;->c:[Ljava/lang/Object;

    .line 43
    iput-object p3, p0, Lcom/google/c/b/ad;->b:[Ljava/lang/Object;

    .line 44
    iput p4, p0, Lcom/google/c/b/ad;->d:I

    .line 45
    iput p2, p0, Lcom/google/c/b/ad;->e:I

    return-void
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 3

    .line 76
    iget-object v0, p0, Lcom/google/c/b/ad;->c:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    iget-object p1, p0, Lcom/google/c/b/ad;->c:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr p2, p1

    return p2
.end method

.method a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/google/c/b/ad;->c:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .line 50
    iget-object v0, p0, Lcom/google/c/b/ad;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    if-nez v0, :cond_0

    goto :goto_1

    .line 54
    :cond_0
    invoke-static {p1}, Lcom/google/c/b/h;->a(Ljava/lang/Object;)I

    move-result v2

    .line 55
    :goto_0
    iget v3, p0, Lcom/google/c/b/ad;->d:I

    and-int/2addr v2, v3

    .line 56
    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    .line 59
    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method f()Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/google/c/b/ad;->b:[Ljava/lang/Object;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/c/b/m;->e()Lcom/google/c/b/m;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/c/b/z;

    iget-object v1, p0, Lcom/google/c/b/ad;->c:[Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/z;-><init>(Lcom/google/c/b/k;[Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/google/c/b/ad;->e:I

    return v0
.end method

.method public size()I
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/google/c/b/ad;->c:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method
