.class public Lorg/junit/a/f;
.super Lorg/junit/runner/b/b;


# instance fields
.field private final a:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>(Ljava/io/PrintStream;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/runner/b/b;-><init>()V

    iput-object p1, p0, Lorg/junit/a/f;->a:Ljava/io/PrintStream;

    return-void
.end method

.method public constructor <init>(Lorg/junit/a/c;)V
    .locals 0

    invoke-interface {p1}, Lorg/junit/a/c;->a()Ljava/io/PrintStream;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/junit/a/f;-><init>(Ljava/io/PrintStream;)V

    return-void
.end method

.method private a()Ljava/io/PrintStream;
    .locals 1

    iget-object v0, p0, Lorg/junit/a/f;->a:Ljava/io/PrintStream;

    return-object v0
.end method


# virtual methods
.method protected a(J)V
    .locals 3

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lorg/junit/a/f;->b(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lorg/junit/runner/b/a;)V
    .locals 1

    iget-object p1, p0, Lorg/junit/a/f;->a:Ljava/io/PrintStream;

    const/16 v0, 0x45

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->append(C)Ljava/io/PrintStream;

    return-void
.end method

.method protected a(Lorg/junit/runner/b/a;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ") "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/junit/runner/b/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object p2

    invoke-virtual {p1}, Lorg/junit/runner/b/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lorg/junit/runner/c;)V
    .locals 1

    iget-object p1, p0, Lorg/junit/a/f;->a:Ljava/io/PrintStream;

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->append(C)Ljava/io/PrintStream;

    return-void
.end method

.method public a(Lorg/junit/runner/i;)V
    .locals 2

    invoke-virtual {p1}, Lorg/junit/runner/i;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/junit/a/f;->a(J)V

    invoke-virtual {p0, p1}, Lorg/junit/a/f;->b(Lorg/junit/runner/i;)V

    invoke-virtual {p0, p1}, Lorg/junit/a/f;->c(Lorg/junit/runner/i;)V

    return-void
.end method

.method protected b(J)Ljava/lang/String;
    .locals 3

    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    long-to-double p1, p1

    const-wide v1, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/junit/runner/c;)V
    .locals 1

    iget-object p1, p0, Lorg/junit/a/f;->a:Ljava/io/PrintStream;

    const/16 v0, 0x49

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->append(C)Ljava/io/PrintStream;

    return-void
.end method

.method protected b(Lorg/junit/runner/i;)V
    .locals 4

    invoke-virtual {p1}, Lorg/junit/runner/i;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "There was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " failure:"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "There were "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " failures:"

    goto :goto_0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/runner/b/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/junit/a/f;->a(Lorg/junit/runner/b/a;Ljava/lang/String;)V

    move v1, v3

    goto :goto_2

    :cond_2
    return-void
.end method

.method protected c(Lorg/junit/runner/i;)V
    .locals 3

    invoke-virtual {p1}, Lorg/junit/runner/i;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    const-string v1, "OK"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/junit/runner/i;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " test"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/junit/runner/i;->a()I

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    const-string p1, "s"

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    const-string v1, "FAILURES!!!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tests run: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/junit/runner/i;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",  Failures: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/junit/runner/i;->b()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/junit/a/f;->a()Ljava/io/PrintStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/PrintStream;->println()V

    return-void
.end method
