.class public Lorg/apache/commons/a/b/a/h;
.super Lorg/apache/commons/a/b/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/a/b/a/h$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lorg/apache/commons/a/b/a/h$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>([Lorg/apache/commons/a/b/a/h$a;)V
    .locals 2

    invoke-direct {p0}, Lorg/apache/commons/a/b/a/b;-><init>()V

    array-length v0, p1

    if-lez v0, :cond_0

    :goto_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/a/b/a/h;->a:Ljava/util/EnumSet;

    return-void

    :cond_0
    const/4 p1, 0x1

    new-array p1, p1, [Lorg/apache/commons/a/b/a/h$a;

    const/4 v0, 0x0

    sget-object v1, Lorg/apache/commons/a/b/a/h$a;->semiColonRequired:Lorg/apache/commons/a/b/a/h$a;

    aput-object v1, p1, v0

    goto :goto_0

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x26

    if-ne v1, v3, :cond_c

    add-int/lit8 v1, v0, -0x2

    if-ge p2, v1, :cond_c

    add-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x23

    if-ne v1, v3, :cond_c

    add-int/lit8 p2, p2, 0x2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x78

    const/4 v4, 0x1

    if-eq v1, v3, :cond_1

    const/16 v3, 0x58

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    add-int/lit8 p2, p2, 0x1

    if-ne p2, v0, :cond_2

    return v2

    :cond_2
    const/4 v1, 0x1

    :goto_1
    move v3, p2

    :goto_2
    if-ge v3, v0, :cond_6

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_3

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x39

    if-le v5, v6, :cond_5

    :cond_3
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x61

    if-lt v5, v6, :cond_4

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x66

    if-le v5, v6, :cond_5

    :cond_4
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x41

    if-lt v5, v6, :cond_6

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x46

    if-gt v5, v6, :cond_6

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    if-eq v3, v0, :cond_7

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v5, 0x3b

    if-ne v0, v5, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_9

    sget-object v5, Lorg/apache/commons/a/b/a/h$a;->semiColonRequired:Lorg/apache/commons/a/b/a/h$a;

    invoke-virtual {p0, v5}, Lorg/apache/commons/a/b/a/h;->a(Lorg/apache/commons/a/b/a/h$a;)Z

    move-result v5

    if-eqz v5, :cond_8

    return v2

    :cond_8
    sget-object v5, Lorg/apache/commons/a/b/a/h$a;->errorIfNoSemiColon:Lorg/apache/commons/a/b/a/h$a;

    invoke-virtual {p0, v5}, Lorg/apache/commons/a/b/a/h;->a(Lorg/apache/commons/a/b/a/h$a;)Z

    move-result v5

    if-eqz v5, :cond_9

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Semi-colon required at end of numeric entity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    if-eqz v1, :cond_a

    :try_start_0
    invoke-interface {p1, p2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v5, 0x10

    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    goto :goto_4

    :cond_a
    invoke-interface {p1, p2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v5, 0xa

    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    const v5, 0xffff

    if-le p1, v5, :cond_b

    invoke-static {p1}, Ljava/lang/Character;->toChars(I)[C

    move-result-object p1

    aget-char v2, p1, v2

    invoke-virtual {p3, v2}, Ljava/io/Writer;->write(I)V

    aget-char p1, p1, v4

    :cond_b
    invoke-virtual {p3, p1}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, p2

    add-int/2addr v3, v1

    add-int/2addr v3, v0

    return v3

    :catch_0
    :cond_c
    return v2
.end method

.method public a(Lorg/apache/commons/a/b/a/h$a;)Z
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/a/b/a/h;->a:Ljava/util/EnumSet;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/a/b/a/h;->a:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
