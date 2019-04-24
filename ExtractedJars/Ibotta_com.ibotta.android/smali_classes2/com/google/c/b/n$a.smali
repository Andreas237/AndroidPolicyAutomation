.class public Lcom/google/c/b/n$a;
.super Ljava/lang/Object;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/b/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TV;>;"
        }
    .end annotation
.end field

.field b:[Lcom/google/c/b/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field c:I

.field d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 172
    invoke-direct {p0, v0}, Lcom/google/c/b/n$a;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    new-array p1, p1, [Lcom/google/c/b/o;

    iput-object p1, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    const/4 p1, 0x0

    .line 178
    iput p1, p0, Lcom/google/c/b/n$a;->c:I

    .line 179
    iput-boolean p1, p0, Lcom/google/c/b/n$a;->d:Z

    return-void
.end method

.method private a(I)V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    array-length v1, v0

    if-le p1, v1, :cond_0

    .line 184
    array-length v1, v0

    .line 186
    invoke-static {v1, p1}, Lcom/google/c/b/k$a;->a(II)I

    move-result p1

    .line 185
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/c/b/o;

    iput-object p1, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    const/4 p1, 0x0

    .line 187
    iput-boolean p1, p0, Lcom/google/c/b/n$a;->d:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/n$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/c/b/n$a<",
            "TK;TV;>;"
        }
    .end annotation

    .line 197
    iget v0, p0, Lcom/google/c/b/n$a;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/c/b/n$a;->a(I)V

    .line 198
    invoke-static {p1, p2}, Lcom/google/c/b/n;->c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/o;

    move-result-object p1

    .line 200
    iget-object p2, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    iget v0, p0, Lcom/google/c/b/n$a;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/c/b/n$a;->c:I

    aput-object p1, p2, v0

    return-object p0
.end method

.method public a()Lcom/google/c/b/n;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation

    .line 276
    iget v0, p0, Lcom/google/c/b/n$a;->c:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 289
    iget-object v2, p0, Lcom/google/c/b/n$a;->a:Ljava/util/Comparator;

    if-eqz v2, :cond_1

    .line 290
    iget-boolean v2, p0, Lcom/google/c/b/n$a;->d:Z

    if-eqz v2, :cond_0

    .line 291
    iget-object v2, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/c/b/o;

    iput-object v0, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    goto :goto_0

    .line 280
    :pswitch_0
    iget-object v0, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/google/c/b/o;->getKey()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    aget-object v1, v2, v1

    invoke-virtual {v1}, Lcom/google/c/b/o;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/c/b/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/n;

    move-result-object v0

    return-object v0

    .line 278
    :pswitch_1
    invoke-static {}, Lcom/google/c/b/n;->e()Lcom/google/c/b/n;

    move-result-object v0

    return-object v0

    .line 293
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    iget v2, p0, Lcom/google/c/b/n$a;->c:I

    iget-object v3, p0, Lcom/google/c/b/n$a;->a:Ljava/util/Comparator;

    .line 297
    invoke-static {v3}, Lcom/google/c/b/x;->a(Ljava/util/Comparator;)Lcom/google/c/b/x;

    move-result-object v3

    invoke-static {}, Lcom/google/c/b/v;->a()Lcom/google/c/a/c;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/c/b/x;->a(Lcom/google/c/a/c;)Lcom/google/c/b/x;

    move-result-object v3

    .line 293
    invoke-static {v0, v1, v2, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 299
    :cond_1
    iget v0, p0, Lcom/google/c/b/n$a;->c:I

    iget-object v2, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    array-length v2, v2

    if-ne v0, v2, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Lcom/google/c/b/n$a;->d:Z

    .line 300
    iget v0, p0, Lcom/google/c/b/n$a;->c:I

    iget-object v1, p0, Lcom/google/c/b/n$a;->b:[Lcom/google/c/b/o;

    invoke-static {v0, v1}, Lcom/google/c/b/ac;->a(I[Ljava/util/Map$Entry;)Lcom/google/c/b/ac;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
