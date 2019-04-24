.class Lorg/b/a/d/c$h;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/k;
.implements Lorg/b/a/d/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public estimateParsedLength()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public estimatePrintedLength()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I
    .locals 0

    iget-object p1, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    invoke-static {p2, p3, p1}, Lorg/b/a/d/c;->b(Ljava/lang/CharSequence;ILjava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p3, p1

    return p3

    :cond_0
    not-int p1, p3

    return p1
.end method

.method public printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 0

    iget-object p2, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 0

    iget-object p2, p0, Lorg/b/a/d/c$h;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method
