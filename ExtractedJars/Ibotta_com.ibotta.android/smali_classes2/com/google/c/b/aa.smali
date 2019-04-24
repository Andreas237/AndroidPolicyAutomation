.class Lcom/google/c/b/aa;
.super Lcom/google/c/b/j;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/aa$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/j<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field static final b:Lcom/google/c/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/aa<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient c:[Lcom/google/c/b/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient d:[Lcom/google/c/b/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient e:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient f:I

.field private final transient g:I

.field private transient h:Lcom/google/c/b/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/j<",
            "TV;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 40
    new-instance v6, Lcom/google/c/b/aa;

    sget-object v3, Lcom/google/c/b/n;->a:[Ljava/util/Map$Entry;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/c/b/aa;-><init>([Lcom/google/c/b/o;[Lcom/google/c/b/o;[Ljava/util/Map$Entry;II)V

    sput-object v6, Lcom/google/c/b/aa;->b:Lcom/google/c/b/aa;

    return-void
.end method

.method private constructor <init>([Lcom/google/c/b/o;[Lcom/google/c/b/o;[Ljava/util/Map$Entry;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/c/b/o<",
            "TK;TV;>;[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;II)V"
        }
    .end annotation

    .line 115
    invoke-direct {p0}, Lcom/google/c/b/j;-><init>()V

    .line 116
    iput-object p1, p0, Lcom/google/c/b/aa;->c:[Lcom/google/c/b/o;

    .line 117
    iput-object p2, p0, Lcom/google/c/b/aa;->d:[Lcom/google/c/b/o;

    .line 118
    iput-object p3, p0, Lcom/google/c/b/aa;->e:[Ljava/util/Map$Entry;

    .line 119
    iput p4, p0, Lcom/google/c/b/aa;->f:I

    .line 120
    iput p5, p0, Lcom/google/c/b/aa;->g:I

    return-void
.end method

.method static synthetic a(Lcom/google/c/b/aa;)[Lcom/google/c/b/o;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/google/c/b/aa;->d:[Lcom/google/c/b/o;

    return-object p0
.end method

.method static synthetic b(Lcom/google/c/b/aa;)I
    .locals 0

    .line 39
    iget p0, p0, Lcom/google/c/b/aa;->f:I

    return p0
.end method

.method static synthetic c(Lcom/google/c/b/aa;)I
    .locals 0

    .line 39
    iget p0, p0, Lcom/google/c/b/aa;->g:I

    return p0
.end method

.method static synthetic d(Lcom/google/c/b/aa;)[Ljava/util/Map$Entry;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/google/c/b/aa;->e:[Ljava/util/Map$Entry;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/c/b/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/j<",
            "TV;TK;>;"
        }
    .end annotation

    .line 171
    invoke-virtual {p0}, Lcom/google/c/b/aa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    invoke-static {}, Lcom/google/c/b/j;->a()Lcom/google/c/b/j;

    move-result-object v0

    return-object v0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/google/c/b/aa;->h:Lcom/google/c/b/j;

    if-nez v0, :cond_1

    .line 175
    new-instance v0, Lcom/google/c/b/aa$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/aa$a;-><init>(Lcom/google/c/b/aa;Lcom/google/c/b/aa$1;)V

    iput-object v0, p0, Lcom/google/c/b/aa;->h:Lcom/google/c/b/j;

    :cond_1
    return-object v0
.end method

.method g()Lcom/google/c/b/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 140
    invoke-virtual {p0}, Lcom/google/c/b/aa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    invoke-static {}, Lcom/google/c/b/s;->g()Lcom/google/c/b/s;

    move-result-object v0

    goto :goto_0

    .line 142
    :cond_0
    new-instance v0, Lcom/google/c/b/p$a;

    iget-object v1, p0, Lcom/google/c/b/aa;->e:[Ljava/util/Map$Entry;

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/p$a;-><init>(Lcom/google/c/b/n;[Ljava/util/Map$Entry;)V

    :goto_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/google/c/b/aa;->c:[Lcom/google/c/b/o;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/google/c/b/aa;->f:I

    invoke-static {p1, v0, v1}, Lcom/google/c/b/ac;->a(Ljava/lang/Object;[Lcom/google/c/b/o;I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 152
    iget v0, p0, Lcom/google/c/b/aa;->g:I

    return v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/google/c/b/aa;->e:[Ljava/util/Map$Entry;

    array-length v0, v0

    return v0
.end method
