.class Lcom/google/c/b/ab;
.super Lcom/google/c/b/m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/m<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/c/b/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/m<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient b:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Lcom/google/c/b/ab;

    sget-object v1, Lcom/google/c/b/w;->a:[Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/google/c/b/ab;-><init>([Ljava/lang/Object;)V

    sput-object v0, Lcom/google/c/b/ab;->a:Lcom/google/c/b/m;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/google/c/b/m;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/google/c/b/ab;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 3

    .line 50
    iget-object v0, p0, Lcom/google/c/b/ab;->b:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    iget-object p1, p0, Lcom/google/c/b/ab;->b:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr p2, p1

    return p2
.end method

.method public a(I)Lcom/google/c/b/ak;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/c/b/ak<",
            "TE;>;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/google/c/b/ab;->b:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Lcom/google/c/b/t;->a([Ljava/lang/Object;III)Lcom/google/c/b/ak;

    move-result-object p1

    return-object p1
.end method

.method b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/google/c/b/ab;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/google/c/b/ab;->a(I)Lcom/google/c/b/ak;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/google/c/b/ab;->b:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method
