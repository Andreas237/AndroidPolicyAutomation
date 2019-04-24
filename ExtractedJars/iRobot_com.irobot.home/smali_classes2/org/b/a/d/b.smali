.class public Lorg/b/a/d/b;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lorg/b/a/d/m;

.field private final b:Lorg/b/a/d/k;

.field private final c:Ljava/util/Locale;

.field private final d:Z

.field private final e:Lorg/b/a/a;

.field private final f:Lorg/b/a/f;

.field private final g:Ljava/lang/Integer;

.field private final h:I


# direct methods
.method constructor <init>(Lorg/b/a/d/m;Lorg/b/a/d/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/b;->a:Lorg/b/a/d/m;

    iput-object p2, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lorg/b/a/d/b;->d:Z

    iput-object p1, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    iput-object p1, p0, Lorg/b/a/d/b;->f:Lorg/b/a/f;

    iput-object p1, p0, Lorg/b/a/d/b;->g:Ljava/lang/Integer;

    const/16 p1, 0x7d0

    iput p1, p0, Lorg/b/a/d/b;->h:I

    return-void
.end method

.method private constructor <init>(Lorg/b/a/d/m;Lorg/b/a/d/k;Ljava/util/Locale;ZLorg/b/a/a;Lorg/b/a/f;Ljava/lang/Integer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/b;->a:Lorg/b/a/d/m;

    iput-object p2, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    iput-object p3, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    iput-boolean p4, p0, Lorg/b/a/d/b;->d:Z

    iput-object p5, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    iput-object p6, p0, Lorg/b/a/d/b;->f:Lorg/b/a/f;

    iput-object p7, p0, Lorg/b/a/d/b;->g:Ljava/lang/Integer;

    iput p8, p0, Lorg/b/a/d/b;->h:I

    return-void
.end method

.method private a(Ljava/lang/Appendable;JLorg/b/a/a;)V
    .locals 15

    move-object v0, p0

    move-wide/from16 v1, p2

    invoke-direct {v0}, Lorg/b/a/d/b;->e()Lorg/b/a/d/m;

    move-result-object v3

    move-object/from16 v4, p4

    invoke-direct {v0, v4}, Lorg/b/a/d/b;->b(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object v4

    invoke-virtual {v4}, Lorg/b/a/a;->a()Lorg/b/a/f;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Lorg/b/a/f;->b(J)I

    move-result v6

    int-to-long v7, v6

    add-long v9, v1, v7

    xor-long v11, v1, v9

    const-wide/16 v13, 0x0

    cmp-long v11, v11, v13

    if-gez v11, :cond_0

    xor-long/2addr v7, v1

    cmp-long v7, v7, v13

    if-ltz v7, :cond_0

    sget-object v5, Lorg/b/a/f;->a:Lorg/b/a/f;

    const/4 v6, 0x0

    move-wide v9, v1

    :cond_0
    move-object v7, v5

    invoke-virtual {v4}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object v5

    iget-object v8, v0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    move-object v1, v3

    move-object/from16 v2, p1

    move-wide v3, v9

    invoke-interface/range {v1 .. v8}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V

    return-void
.end method

.method private b(Lorg/b/a/a;)Lorg/b/a/a;
    .locals 1

    invoke-static {p1}, Lorg/b/a/e;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p1

    iget-object v0, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    :cond_0
    iget-object v0, p0, Lorg/b/a/d/b;->f:Lorg/b/a/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/b/a/d/b;->f:Lorg/b/a/f;

    invoke-virtual {p1, v0}, Lorg/b/a/a;->a(Lorg/b/a/f;)Lorg/b/a/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private e()Lorg/b/a/d/m;
    .locals 2

    iget-object v0, p0, Lorg/b/a/d/b;->a:Lorg/b/a/d/m;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Printing not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object v0
.end method

.method private f()Lorg/b/a/d/k;
    .locals 2

    iget-object v0, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Parsing not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 9

    invoke-direct {p0}, Lorg/b/a/d/b;->f()Lorg/b/a/d/k;

    move-result-object v0

    iget-object v1, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    invoke-direct {p0, v1}, Lorg/b/a/d/b;->b(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object v5

    new-instance v1, Lorg/b/a/d/e;

    iget-object v6, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    iget-object v7, p0, Lorg/b/a/d/b;->g:Ljava/lang/Integer;

    iget v8, p0, Lorg/b/a/d/b;->h:I

    const-wide/16 v3, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lorg/b/a/d/e;-><init>(JLorg/b/a/a;Ljava/util/Locale;Ljava/lang/Integer;I)V

    invoke-virtual {v1, v0, p1}, Lorg/b/a/d/e;->a(Lorg/b/a/d/k;Ljava/lang/CharSequence;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Lorg/b/a/s;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lorg/b/a/d/b;->e()Lorg/b/a/d/m;

    move-result-object v1

    invoke-interface {v1}, Lorg/b/a/d/m;->estimatePrintedLength()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lorg/b/a/d/b;->a(Ljava/lang/Appendable;Lorg/b/a/s;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/t;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lorg/b/a/d/b;->e()Lorg/b/a/d/m;

    move-result-object v1

    invoke-interface {v1}, Lorg/b/a/d/m;->estimatePrintedLength()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lorg/b/a/d/b;->a(Ljava/lang/Appendable;Lorg/b/a/t;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/b/a/a;)Lorg/b/a/d/b;
    .locals 10

    iget-object v0, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lorg/b/a/d/b;

    iget-object v2, p0, Lorg/b/a/d/b;->a:Lorg/b/a/d/m;

    iget-object v3, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    iget-object v4, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    iget-boolean v5, p0, Lorg/b/a/d/b;->d:Z

    iget-object v7, p0, Lorg/b/a/d/b;->f:Lorg/b/a/f;

    iget-object v8, p0, Lorg/b/a/d/b;->g:Ljava/lang/Integer;

    iget v9, p0, Lorg/b/a/d/b;->h:I

    move-object v1, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v9}, Lorg/b/a/d/b;-><init>(Lorg/b/a/d/m;Lorg/b/a/d/k;Ljava/util/Locale;ZLorg/b/a/a;Lorg/b/a/f;Ljava/lang/Integer;I)V

    return-object v0
.end method

.method public a(Lorg/b/a/f;)Lorg/b/a/d/b;
    .locals 10

    iget-object v0, p0, Lorg/b/a/d/b;->f:Lorg/b/a/f;

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lorg/b/a/d/b;

    iget-object v2, p0, Lorg/b/a/d/b;->a:Lorg/b/a/d/m;

    iget-object v3, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    iget-object v4, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    const/4 v5, 0x0

    iget-object v6, p0, Lorg/b/a/d/b;->e:Lorg/b/a/a;

    iget-object v8, p0, Lorg/b/a/d/b;->g:Ljava/lang/Integer;

    iget v9, p0, Lorg/b/a/d/b;->h:I

    move-object v1, v0

    move-object v7, p1

    invoke-direct/range {v1 .. v9}, Lorg/b/a/d/b;-><init>(Lorg/b/a/d/m;Lorg/b/a/d/k;Ljava/util/Locale;ZLorg/b/a/a;Lorg/b/a/f;Ljava/lang/Integer;I)V

    return-object v0
.end method

.method a()Lorg/b/a/d/m;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/b;->a:Lorg/b/a/d/m;

    return-object v0
.end method

.method public a(Ljava/lang/Appendable;Lorg/b/a/s;)V
    .locals 2

    invoke-static {p2}, Lorg/b/a/e;->a(Lorg/b/a/s;)J

    move-result-wide v0

    invoke-static {p2}, Lorg/b/a/e;->b(Lorg/b/a/s;)Lorg/b/a/a;

    move-result-object p2

    invoke-direct {p0, p1, v0, v1, p2}, Lorg/b/a/d/b;->a(Ljava/lang/Appendable;JLorg/b/a/a;)V

    return-void
.end method

.method public a(Ljava/lang/Appendable;Lorg/b/a/t;)V
    .locals 2

    invoke-direct {p0}, Lorg/b/a/d/b;->e()Lorg/b/a/d/m;

    move-result-object v0

    if-nez p2, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The partial must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v1, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    invoke-interface {v0, p1, p2, v1}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V

    return-void
.end method

.method public b()Lorg/b/a/d/d;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    invoke-static {v0}, Lorg/b/a/d/l;->a(Lorg/b/a/d/k;)Lorg/b/a/d/d;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lorg/b/a/n;
    .locals 10

    invoke-direct {p0}, Lorg/b/a/d/b;->f()Lorg/b/a/d/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lorg/b/a/d/b;->b(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object v1

    new-instance v9, Lorg/b/a/d/e;

    iget-object v6, p0, Lorg/b/a/d/b;->c:Ljava/util/Locale;

    iget-object v7, p0, Lorg/b/a/d/b;->g:Ljava/lang/Integer;

    iget v8, p0, Lorg/b/a/d/b;->h:I

    const-wide/16 v3, 0x0

    move-object v2, v9

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lorg/b/a/d/e;-><init>(JLorg/b/a/a;Ljava/util/Locale;Ljava/lang/Integer;I)V

    const/4 v2, 0x0

    invoke-interface {v0, v9, p1, v2}, Lorg/b/a/d/k;->parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I

    move-result v0

    if-ltz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v0, v2, :cond_3

    const/4 v0, 0x1

    invoke-virtual {v9, v0, p1}, Lorg/b/a/d/e;->a(ZLjava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v9}, Lorg/b/a/d/e;->d()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v9}, Lorg/b/a/d/e;->d()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lorg/b/a/f;->a(I)Lorg/b/a/f;

    move-result-object p1

    :goto_0
    invoke-virtual {v1, p1}, Lorg/b/a/a;->a(Lorg/b/a/f;)Lorg/b/a/a;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-virtual {v9}, Lorg/b/a/d/e;->c()Lorg/b/a/f;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v9}, Lorg/b/a/d/e;->c()Lorg/b/a/f;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    new-instance p1, Lorg/b/a/n;

    invoke-direct {p1, v2, v3, v1}, Lorg/b/a/n;-><init>(JLorg/b/a/a;)V

    return-object p1

    :cond_2
    not-int v0, v0

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, v0}, Lorg/b/a/d/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method c()Lorg/b/a/d/k;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/b;->b:Lorg/b/a/d/k;

    return-object v0
.end method

.method public d()Lorg/b/a/d/b;
    .locals 1

    sget-object v0, Lorg/b/a/f;->a:Lorg/b/a/f;

    invoke-virtual {p0, v0}, Lorg/b/a/d/b;->a(Lorg/b/a/f;)Lorg/b/a/d/b;

    move-result-object v0

    return-object v0
.end method
