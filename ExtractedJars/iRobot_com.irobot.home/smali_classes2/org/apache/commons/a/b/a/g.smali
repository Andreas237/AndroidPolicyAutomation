.class public Lorg/apache/commons/a/b/a/g;
.super Lorg/apache/commons/a/b/a/c;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const v1, 0x7fffffff

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/commons/a/b/a/g;-><init>(IIZ)V

    return-void
.end method

.method private constructor <init>(IIZ)V
    .locals 0

    invoke-direct {p0}, Lorg/apache/commons/a/b/a/c;-><init>()V

    iput p1, p0, Lorg/apache/commons/a/b/a/g;->a:I

    iput p2, p0, Lorg/apache/commons/a/b/a/g;->b:I

    iput-boolean p3, p0, Lorg/apache/commons/a/b/a/g;->c:Z

    return-void
.end method

.method public static a(II)Lorg/apache/commons/a/b/a/g;
    .locals 2

    new-instance v0, Lorg/apache/commons/a/b/a/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lorg/apache/commons/a/b/a/g;-><init>(IIZ)V

    return-object v0
.end method


# virtual methods
.method public a(ILjava/io/Writer;)Z
    .locals 2

    iget-boolean v0, p0, Lorg/apache/commons/a/b/a/g;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Lorg/apache/commons/a/b/a/g;->a:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lorg/apache/commons/a/b/a/g;->b:I

    if-le p1, v0, :cond_2

    :cond_0
    return v1

    :cond_1
    iget v0, p0, Lorg/apache/commons/a/b/a/g;->a:I

    if-lt p1, v0, :cond_2

    iget v0, p0, Lorg/apache/commons/a/b/a/g;->b:I

    if-gt p1, v0, :cond_2

    return v1

    :cond_2
    const-string v0, "&#"

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 p1, 0x3b

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(I)V

    const/4 p1, 0x1

    return p1
.end method
