.class Lorg/b/a/d/n;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/g;
.implements Lorg/b/a/d/m;


# instance fields
.field private final a:Lorg/b/a/d/m;


# virtual methods
.method public a(Ljava/io/Writer;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 8

    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V

    return-void
.end method

.method public a(Ljava/io/Writer;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    invoke-interface {v0, p1, p2, p3}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V

    return-void
.end method

.method public a(Ljava/lang/StringBuffer;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public a(Ljava/lang/StringBuffer;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    invoke-interface {v0, p1, p2, p3}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/b/a/d/n;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/b/a/d/n;

    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    iget-object p1, p1, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public estimatePrintedLength()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    invoke-interface {v0}, Lorg/b/a/d/m;->estimatePrintedLength()I

    move-result v0

    return v0
.end method

.method public printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 8

    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V

    return-void
.end method

.method public printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/n;->a:Lorg/b/a/d/m;

    invoke-interface {v0, p1, p2, p3}, Lorg/b/a/d/m;->printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V

    return-void
.end method
