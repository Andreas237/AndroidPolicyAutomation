.class public Lorg/apache/commons/a/b/a/j;
.super Lorg/apache/commons/a/b/a/c;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Z


# direct methods
.method protected constructor <init>(IIZ)V
    .locals 0

    invoke-direct {p0}, Lorg/apache/commons/a/b/a/c;-><init>()V

    iput p1, p0, Lorg/apache/commons/a/b/a/j;->a:I

    iput p2, p0, Lorg/apache/commons/a/b/a/j;->b:I

    iput-boolean p3, p0, Lorg/apache/commons/a/b/a/j;->c:Z

    return-void
.end method


# virtual methods
.method public a(ILjava/io/Writer;)Z
    .locals 2

    iget-boolean v0, p0, Lorg/apache/commons/a/b/a/j;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Lorg/apache/commons/a/b/a/j;->a:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lorg/apache/commons/a/b/a/j;->b:I

    if-le p1, v0, :cond_2

    :cond_0
    return v1

    :cond_1
    iget v0, p0, Lorg/apache/commons/a/b/a/j;->a:I

    if-lt p1, v0, :cond_2

    iget v0, p0, Lorg/apache/commons/a/b/a/j;->b:I

    if-gt p1, v0, :cond_2

    return v1

    :cond_2
    const v0, 0xffff

    if-le p1, v0, :cond_3

    invoke-virtual {p0, p1}, Lorg/apache/commons/a/b/a/j;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const/16 v0, 0xfff

    if-le p1, v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\u"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lorg/apache/commons/a/b/a/j;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    const/16 v0, 0xff

    if-le p1, v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\u0"

    goto :goto_1

    :cond_5
    const/16 v0, 0xf

    if-le p1, v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\u00"

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\u000"

    goto :goto_1

    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method protected b(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\u"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lorg/apache/commons/a/b/a/j;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
