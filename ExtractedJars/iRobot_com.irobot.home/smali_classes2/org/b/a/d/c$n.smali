.class Lorg/b/a/d/c$n;
.super Lorg/b/a/d/c$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "n"
.end annotation


# direct methods
.method protected constructor <init>(Lorg/b/a/d;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/b/a/d/c$f;-><init>(Lorg/b/a/d;IZ)V

    return-void
.end method


# virtual methods
.method public estimatePrintedLength()I
    .locals 1

    iget v0, p0, Lorg/b/a/d/c$n;->b:I

    return v0
.end method

.method public printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 0

    :try_start_0
    iget-object p5, p0, Lorg/b/a/d/c$n;->a:Lorg/b/a/d;

    invoke-virtual {p5, p4}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p4

    invoke-virtual {p4, p2, p3}, Lorg/b/a/c;->a(J)I

    move-result p2

    invoke-static {p1, p2}, Lorg/b/a/d/i;->a(Ljava/lang/Appendable;I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const p2, 0xfffd

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 1

    iget-object p3, p0, Lorg/b/a/d/c$n;->a:Lorg/b/a/d;

    invoke-interface {p2, p3}, Lorg/b/a/t;->b(Lorg/b/a/d;)Z

    move-result p3

    const v0, 0xfffd

    if-eqz p3, :cond_0

    :try_start_0
    iget-object p3, p0, Lorg/b/a/d/c$n;->a:Lorg/b/a/d;

    invoke-interface {p2, p3}, Lorg/b/a/t;->a(Lorg/b/a/d;)I

    move-result p2

    invoke-static {p1, p2}, Lorg/b/a/d/i;->a(Ljava/lang/Appendable;I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method
