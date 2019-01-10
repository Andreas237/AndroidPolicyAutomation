.class public final Lkotlin/io/TextStreamsKt;
.super Ljava/lang/Object;
.source "ReadWrite.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,146:1\n15#1,6:147\n47#1:153\n135#1:156\n1028#2,2:154\n*E\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n28#1:153\n28#1,2:154\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\u0008\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\u0008\u001a\u001c\u0010\u0007\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\u0008\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\u0008\u001a2\u0010\u001b\u001a\u0002H\u001c\"\u0004\u0008\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\u0008\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "buffered",
        "Ljava/io/BufferedReader;",
        "Ljava/io/Reader;",
        "bufferSize",
        "",
        "Ljava/io/BufferedWriter;",
        "Ljava/io/Writer;",
        "copyTo",
        "",
        "out",
        "forEachLine",
        "",
        "action",
        "Lkotlin/Function1;",
        "",
        "lineSequence",
        "Lkotlin/sequences/Sequence;",
        "readBytes",
        "",
        "Ljava/net/URL;",
        "readLines",
        "",
        "readText",
        "charset",
        "Ljava/nio/charset/Charset;",
        "reader",
        "Ljava/io/StringReader;",
        "useLines",
        "T",
        "block",
        "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "TextStreamsKt"
.end annotation


# direct methods
.method private static final buffered(Ljava/io/Reader;I)Ljava/io/BufferedReader;
    .locals 1
    .param p0, "$receiver"    # Ljava/io/Reader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "bufferSize"    # I
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 15
    instance-of v0, p0, Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/BufferedReader;

    .end local p0    # "$receiver":Ljava/io/Reader;
    :goto_0
    return-object p0

    .restart local p0    # "$receiver":Ljava/io/Reader;
    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object p0, v0

    goto :goto_0
.end method

.method private static final buffered(Ljava/io/Writer;I)Ljava/io/BufferedWriter;
    .locals 1
    .param p0, "$receiver"    # Ljava/io/Writer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "bufferSize"    # I
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 20
    instance-of v0, p0, Ljava/io/BufferedWriter;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/BufferedWriter;

    .end local p0    # "$receiver":Ljava/io/Writer;
    :goto_0
    return-object p0

    .restart local p0    # "$receiver":Ljava/io/Writer;
    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    move-object p0, v0

    goto :goto_0
.end method

.method static bridge synthetic buffered$default(Ljava/io/Reader;IILjava/lang/Object;)Ljava/io/BufferedReader;
    .locals 1
    .param p0, "$receiver"    # Ljava/io/Reader;
    .param p1, "bufferSize"    # I
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 14
    const/16 p1, 0x2000

    .line 147
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedReader;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/io/BufferedReader;

    .end local p0    # "$receiver":Ljava/io/Reader;
    :goto_0
    return-object p0

    .restart local p0    # "$receiver":Ljava/io/Reader;
    :cond_1
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object p0, v0

    goto :goto_0
.end method

.method static bridge synthetic buffered$default(Ljava/io/Writer;IILjava/lang/Object;)Ljava/io/BufferedWriter;
    .locals 1
    .param p0, "$receiver"    # Ljava/io/Writer;
    .param p1, "bufferSize"    # I
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 19
    const/16 p1, 0x2000

    .line 152
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedWriter;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/io/BufferedWriter;

    .end local p0    # "$receiver":Ljava/io/Writer;
    :goto_0
    return-object p0

    .restart local p0    # "$receiver":Ljava/io/Writer;
    :cond_1
    new-instance v0, Ljava/io/BufferedWriter;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    move-object p0, v0

    goto :goto_0
.end method

.method public static final copyTo(Ljava/io/Reader;Ljava/io/Writer;I)J
    .locals 6
    .param p0, "$receiver"    # Ljava/io/Reader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "out"    # Ljava/io/Writer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2, "bufferSize"    # I

    .prologue
    const-string/jumbo v4, "$receiver"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v4, "out"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    const-wide/16 v2, 0x0

    .line 116
    .local v2, "charsCopied":J
    new-array v0, p2, [C

    .line 117
    .local v0, "buffer":[C
    invoke-virtual {p0, v0}, Ljava/io/Reader;->read([C)I

    move-result v1

    .line 118
    .local v1, "chars":I
    :goto_0
    if-ltz v1, :cond_0

    .line 119
    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4, v1}, Ljava/io/Writer;->write([CII)V

    .line 120
    int-to-long v4, v1

    add-long/2addr v2, v4

    .line 121
    invoke-virtual {p0, v0}, Ljava/io/Reader;->read([C)I

    move-result v1

    .line 118
    goto :goto_0

    .line 123
    :cond_0
    return-wide v2
.end method

.method public static bridge synthetic copyTo$default(Ljava/io/Reader;Ljava/io/Writer;IILjava/lang/Object;)J
    .locals 2

    .prologue
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    .line 114
    const/16 p2, 0x2000

    :cond_0
    invoke-static {p0, p1, p2}, Lkotlin/io/TextStreamsKt;->copyTo(Ljava/io/Reader;Ljava/io/Writer;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final forEachLine(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .param p0, "$receiver"    # Ljava/io/Reader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "action"    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Reader;",
            "Lkotlin/jvm/functions/Function1",
            "<-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .prologue
    const-string/jumbo v6, "$receiver"

    invoke-static {p0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "action"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    move-object v1, p0

    .line 153
    .local v1, "$receiver$iv":Ljava/io/Reader;
    const/16 v7, 0x2000

    instance-of v6, v1, Ljava/io/BufferedReader;

    if-eqz v6, :cond_1

    check-cast v1, Ljava/io/BufferedReader;

    .end local v1    # "$receiver$iv":Ljava/io/Reader;
    move-object v6, v1

    :goto_0
    check-cast v6, Ljava/io/Closeable;

    const/4 v8, 0x0

    nop

    :try_start_0
    move-object v0, v6

    check-cast v0, Ljava/io/BufferedReader;

    move-object v5, v0

    .local v5, "it$iv":Ljava/io/BufferedReader;
    invoke-static {v5}, Lkotlin/io/TextStreamsKt;->lineSequence(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;

    move-result-object v4

    .line 28
    .local v4, "it":Lkotlin/sequences/Sequence;
    move-object v2, p1

    .line 154
    .local v2, "action$iv":Lkotlin/jvm/functions/Function1;
    invoke-interface {v4}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 153
    .end local v2    # "action$iv":Lkotlin/jvm/functions/Function1;
    .end local v3    # "element$iv":Ljava/lang/Object;
    .end local v4    # "it":Lkotlin/sequences/Sequence;
    .end local v5    # "it$iv":Ljava/io/BufferedReader;
    :catch_0
    move-exception v7

    const/4 v8, 0x1

    nop

    :try_start_1
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    :try_start_2
    check-cast v7, Ljava/lang/Throwable;

    throw v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v7

    if-nez v8, :cond_0

    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    :cond_0
    throw v7

    .restart local v1    # "$receiver$iv":Ljava/io/Reader;
    :cond_1
    new-instance v6, Ljava/io/BufferedReader;

    invoke-direct {v6, v1, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    goto :goto_0

    .line 155
    .end local v1    # "$receiver$iv":Ljava/io/Reader;
    .restart local v2    # "action$iv":Lkotlin/jvm/functions/Function1;
    .restart local v4    # "it":Lkotlin/sequences/Sequence;
    .restart local v5    # "it$iv":Ljava/io/BufferedReader;
    :cond_2
    nop

    .line 28
    nop

    :try_start_3
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 153
    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    nop

    .line 28
    return-void

    .line 153
    .end local v2    # "action$iv":Lkotlin/jvm/functions/Function1;
    .end local v4    # "it":Lkotlin/sequences/Sequence;
    .end local v5    # "it$iv":Ljava/io/BufferedReader;
    :catch_1
    move-exception v9

    goto :goto_2
.end method

.method public static final lineSequence(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
    .locals 1
    .param p0, "$receiver"    # Ljava/io/BufferedReader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/BufferedReader;",
            ")",
            "Lkotlin/sequences/Sequence",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v0, Lkotlin/io/LinesSequence;

    invoke-direct {v0, p0}, Lkotlin/io/LinesSequence;-><init>(Ljava/io/BufferedReader;)V

    check-cast v0, Lkotlin/sequences/Sequence;

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->constrainOnce(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public static final readBytes(Ljava/net/URL;)[B
    .locals 8
    .param p0, "$receiver"    # Ljava/net/URL;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string/jumbo v2, "$receiver"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v2

    check-cast v2, Ljava/io/Closeable;

    nop

    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/InputStream;

    move-object v1, v0

    .local v1, "it":Ljava/io/InputStream;
    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v1, v3, v6, v7}, Lkotlin/io/ByteStreamsKt;->readBytes$default(Ljava/io/InputStream;IILjava/lang/Object;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    :cond_0
    return-object v3

    .end local v1    # "it":Ljava/io/InputStream;
    :catch_0
    move-exception v3

    nop

    if-eqz v2, :cond_1

    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    :try_start_2
    check-cast v3, Ljava/lang/Throwable;

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v3

    move v4, v5

    :goto_1
    if-nez v4, :cond_2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    :cond_2
    throw v3

    :catch_1
    move-exception v4

    goto :goto_0

    :catchall_1
    move-exception v3

    goto :goto_1
.end method

.method public static final readLines(Ljava/io/Reader;)Ljava/util/List;
    .locals 2
    .param p0, "$receiver"    # Ljava/io/Reader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Reader;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v1, "$receiver"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .local v0, "result":Ljava/util/ArrayList;
    new-instance v1, Lkotlin/io/TextStreamsKt$readLines$1;

    invoke-direct {v1, v0}, Lkotlin/io/TextStreamsKt$readLines$1;-><init>(Ljava/util/ArrayList;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v1}, Lkotlin/io/TextStreamsKt;->forEachLine(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V

    .line 38
    check-cast v0, Ljava/util/List;

    .end local v0    # "result":Ljava/util/ArrayList;
    return-object v0
.end method

.method public static final readText(Ljava/io/Reader;)Ljava/lang/String;
    .locals 5
    .param p0, "$receiver"    # Ljava/io/Reader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v1, "$receiver"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .local v0, "buffer":Ljava/io/StringWriter;
    move-object v1, v0

    .line 101
    check-cast v1, Ljava/io/Writer;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v1, v2, v3, v4}, Lkotlin/io/TextStreamsKt;->copyTo$default(Ljava/io/Reader;Ljava/io/Writer;IILjava/lang/Object;)J

    .line 102
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "buffer.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final readText(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2
    .param p0, "$receiver"    # Ljava/net/URL;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "charset"    # Ljava/nio/charset/Charset;
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 135
    invoke-static {p0}, Lkotlin/io/TextStreamsKt;->readBytes(Ljava/net/URL;)[B

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method

.method static bridge synthetic readText$default(Ljava/net/URL;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .locals 2
    .param p0, "$receiver"    # Ljava/net/URL;
    .param p1, "charset"    # Ljava/nio/charset/Charset;
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 135
    sget-object p1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 156
    :cond_0
    invoke-static {p0}, Lkotlin/io/TextStreamsKt;->readBytes(Ljava/net/URL;)[B

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method

.method private static final reader(Ljava/lang/String;)Ljava/io/StringReader;
    .locals 1
    .param p0, "$receiver"    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 51
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final useLines(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 6
    .param p0, "$receiver"    # Ljava/io/Reader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Lkotlin/jvm/functions/Function1",
            "<-",
            "Lkotlin/sequences/Sequence",
            "<",
            "Ljava/lang/String;",
            ">;+TT;>;)TT;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const-string/jumbo v2, "$receiver"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "block"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    const/16 v3, 0x2000

    instance-of v2, p0, Ljava/io/BufferedReader;

    if-eqz v2, :cond_0

    check-cast p0, Ljava/io/BufferedReader;

    .end local p0    # "$receiver":Ljava/io/Reader;
    move-object v2, p0

    :goto_0
    check-cast v2, Ljava/io/Closeable;

    const/4 v4, 0x0

    nop

    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/BufferedReader;

    move-object v1, v0

    .local v1, "it":Ljava/io/BufferedReader;
    invoke-static {v1}, Lkotlin/io/TextStreamsKt;->lineSequence(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;

    move-result-object v3

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    invoke-static {v5}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    invoke-static {v5}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-object v3

    .end local v1    # "it":Ljava/io/BufferedReader;
    .restart local p0    # "$receiver":Ljava/io/Reader;
    :cond_0
    new-instance v2, Ljava/io/BufferedReader;

    invoke-direct {v2, p0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    goto :goto_0

    .end local p0    # "$receiver":Ljava/io/Reader;
    :catch_0
    move-exception v3

    nop

    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    check-cast v3, Ljava/lang/Throwable;

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v3

    move v4, v5

    :goto_2
    invoke-static {v5}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    if-nez v4, :cond_1

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw v3

    :catch_1
    move-exception v4

    goto :goto_1

    :catchall_1
    move-exception v3

    goto :goto_2
.end method
