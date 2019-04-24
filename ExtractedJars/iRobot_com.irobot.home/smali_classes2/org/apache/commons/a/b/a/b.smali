.class public abstract Lorg/apache/commons/a/b/a/b;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a(Ljava/lang/CharSequence;ILjava/io/Writer;)I
.end method

.method public final a(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/a/b/a/b;->a(Ljava/lang/CharSequence;Ljava/io/Writer;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final varargs a([Lorg/apache/commons/a/b/a/b;)Lorg/apache/commons/a/b/a/b;
    .locals 4

    array-length v0, p1

    const/4 v1, 0x1

    add-int/2addr v0, v1

    new-array v0, v0, [Lorg/apache/commons/a/b/a/b;

    const/4 v2, 0x0

    aput-object p0, v0, v2

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, Lorg/apache/commons/a/b/a/a;

    invoke-direct {p1, v0}, Lorg/apache/commons/a/b/a/a;-><init>([Lorg/apache/commons/a/b/a/b;)V

    return-object p1
.end method

.method public final a(Ljava/lang/CharSequence;Ljava/io/Writer;)V
    .locals 6

    if-nez p2, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The Writer must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p0, p1, v2, p2}, Lorg/apache/commons/a/b/a/b;->a(Ljava/lang/CharSequence;ILjava/io/Writer;)I

    move-result v3

    if-nez v3, :cond_2

    invoke-static {p1, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/Writer;->write([C)V

    array-length v3, v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_2
    move v4, v2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v3, :cond_3

    invoke-static {p1, v4}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v4

    goto :goto_0

    :cond_4
    return-void
.end method
