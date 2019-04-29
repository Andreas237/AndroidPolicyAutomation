.class public final Lio/streamroot/dna/core/proxy/server/HTTPSession;
.super Ljava/lang/Object;
.source "HTTPSession.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/proxy/server/HTTPSession$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHTTPSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPSession.kt\nio/streamroot/dna/core/proxy/server/HTTPSession\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,205:1\n49#2:206\n21#2,22:207\n49#2:229\n21#2,22:230\n49#2:252\n21#2,22:253\n*E\n*S KotlinDebug\n*F\n+ 1 HTTPSession.kt\nio/streamroot/dna/core/proxy/server/HTTPSession\n*L\n65#1:206\n65#1,22:207\n68#1:229\n68#1,22:230\n68#1:252\n68#1,22:253\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/server/HTTPSession;",
        "",
        "outputStream",
        "Ljava/io/OutputStream;",
        "inputStream",
        "Ljava/io/InputStream;",
        "(Ljava/io/OutputStream;Ljava/io/InputStream;)V",
        "Ljava/io/BufferedInputStream;",
        "decodeHeader",
        "Lio/streamroot/dna/core/proxy/server/ProxyRequest;",
        "headerReader",
        "Ljava/io/BufferedReader;",
        "decodePercent",
        "",
        "str",
        "execute",
        "",
        "executor",
        "Lio/streamroot/dna/core/proxy/server/SessionHandler;",
        "findHeaderEnd",
        "",
        "buf",
        "",
        "rlen",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/proxy/server/HTTPSession$Companion;

.field private static final HEADER_BUFFER_SIZE:I = 0x2000

.field private static final MIME_PLAINTEXT:Ljava/lang/String; = "text/plain"


# instance fields
.field private final inputStream:Ljava/io/BufferedInputStream;

.field private final outputStream:Ljava/io/OutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/proxy/server/HTTPSession$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/proxy/server/HTTPSession$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->Companion:Lio/streamroot/dna/core/proxy/server/HTTPSession$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/io/InputStream;)V
    .locals 1
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->outputStream:Ljava/io/OutputStream;

    .line 24
    new-instance p1, Ljava/io/BufferedInputStream;

    const/16 v0, 0x2000

    invoke-direct {p1, p2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    return-void
.end method

.method private final decodeHeader(Ljava/io/BufferedReader;)Lio/streamroot/dna/core/proxy/server/ProxyRequest;
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/streamroot/dna/core/proxy/server/ResponseException;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 32
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    check-cast v2, Ljava/util/Map;

    .line 33
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move-object v8, v3

    check-cast v8, Ljava/util/Map;

    .line 35
    invoke-virtual/range {p1 .. p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1d

    .line 37
    new-instance v5, Ljava/util/StringTokenizer;

    invoke-direct {v5, v3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    const-string v3, "method"

    .line 41
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1c

    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1b

    .line 46
    move-object v9, v3

    check-cast v9, Ljava/lang/CharSequence;

    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x6

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v6

    const/4 v7, 0x0

    .line 47
    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x0

    if-ltz v6, :cond_2

    add-int/lit8 v7, v6, 0x1

    if-nez v3, :cond_0

    .line 49
    new-instance v2, Lkotlin/TypeCastException;

    const-string v3, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v2, v3}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_0
    invoke-virtual {v3, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    const-string v10, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v3, :cond_1

    .line 50
    new-instance v2, Lkotlin/TypeCastException;

    const-string v3, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v2, v3}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-virtual {v3, v9, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v6, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Lio/streamroot/dna/core/proxy/server/HTTPSession;->decodePercent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 52
    :cond_2
    invoke-direct {v1, v3}, Lio/streamroot/dna/core/proxy/server/HTTPSession;->decodePercent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object/from16 v22, v7

    move-object v7, v3

    move-object/from16 v3, v22

    .line 59
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 60
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    const-string v5, "HTTP/1.1"

    .line 64
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    :goto_2
    if-eqz v6, :cond_19

    .line 206
    move-object v10, v6

    check-cast v10, Ljava/lang/CharSequence;

    .line 208
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v11

    const/4 v12, 0x1

    sub-int/2addr v11, v12

    move v14, v9

    move v13, v11

    move v11, v14

    :goto_3
    const/16 v15, 0x20

    if-gt v11, v13, :cond_9

    if-nez v14, :cond_4

    move v4, v11

    goto :goto_4

    :cond_4
    move v4, v13

    .line 213
    :goto_4
    invoke-interface {v10, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-gt v4, v15, :cond_5

    move v4, v12

    goto :goto_5

    :cond_5
    move v4, v9

    :goto_5
    if-nez v14, :cond_7

    if-nez v4, :cond_6

    move v14, v12

    goto :goto_3

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_7
    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v13, v13, -0x1

    goto :goto_3

    :cond_9
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 228
    invoke-interface {v10, v11, v13}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 206
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    .line 65
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_a

    move v4, v12

    goto :goto_7

    :cond_a
    move v4, v9

    :goto_7
    if-nez v4, :cond_19

    .line 66
    move-object/from16 v16, v6

    check-cast v16, Ljava/lang/CharSequence;

    const/16 v17, 0x3a

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x6

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v4

    if-ltz v4, :cond_18

    .line 68
    invoke-virtual {v6, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const-string v11, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    check-cast v10, Ljava/lang/CharSequence;

    .line 231
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v11

    sub-int/2addr v11, v12

    move v14, v9

    move v13, v11

    move v11, v14

    :goto_8
    if-gt v11, v13, :cond_10

    if-nez v14, :cond_b

    move v9, v11

    goto :goto_9

    :cond_b
    move v9, v13

    .line 236
    :goto_9
    invoke-interface {v10, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-gt v9, v15, :cond_c

    move v9, v12

    goto :goto_a

    :cond_c
    const/4 v9, 0x0

    :goto_a
    if-nez v14, :cond_e

    if-nez v9, :cond_d

    move v14, v12

    goto :goto_b

    :cond_d
    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_e
    if-nez v9, :cond_f

    goto :goto_c

    :cond_f
    add-int/lit8 v13, v13, -0x1

    :goto_b
    const/4 v9, 0x0

    goto :goto_8

    :cond_10
    :goto_c
    add-int/lit8 v13, v13, 0x1

    .line 251
    invoke-interface {v10, v11, v13}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v9

    .line 229
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 68
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "Locale.US"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v9, :cond_11

    new-instance v2, Lkotlin/TypeCastException;

    const-string v3, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v2, v3}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_11
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v6, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v6, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    check-cast v4, Ljava/lang/CharSequence;

    .line 254
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    sub-int/2addr v6, v12

    move v10, v6

    const/4 v6, 0x0

    const/4 v11, 0x0

    :goto_d
    if-gt v6, v10, :cond_17

    if-nez v11, :cond_12

    move v13, v6

    goto :goto_e

    :cond_12
    move v13, v10

    .line 259
    :goto_e
    invoke-interface {v4, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-gt v13, v15, :cond_13

    move v13, v12

    goto :goto_f

    :cond_13
    const/4 v13, 0x0

    :goto_f
    if-nez v11, :cond_15

    if-nez v13, :cond_14

    move v11, v12

    goto :goto_d

    :cond_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_15
    if-nez v13, :cond_16

    goto :goto_10

    :cond_16
    add-int/lit8 v10, v10, -0x1

    goto :goto_d

    :cond_17
    :goto_10
    add-int/lit8 v10, v10, 0x1

    .line 274
    invoke-interface {v4, v6, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 252
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 68
    invoke-interface {v8, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_18
    invoke-virtual/range {p1 .. p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    goto/16 :goto_2

    .line 73
    :cond_19
    sget-object v4, Lio/streamroot/dna/core/proxy/server/Method;->Companion:Lio/streamroot/dna/core/proxy/server/Method$Companion;

    const-string v6, "method"

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Lio/streamroot/dna/core/proxy/server/Method$Companion;->lookup$dna_core_release(Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/Method;

    move-result-object v6

    if-eqz v6, :cond_1a

    .line 75
    new-instance v2, Lio/streamroot/dna/core/proxy/server/ProxyRequest;

    const-string v4, "protocolVersion"

    .line 76
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v4, v1, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    move-object v10, v4

    check-cast v10, Ljava/io/InputStream;

    move-object v4, v2

    move-object v9, v3

    .line 75
    invoke-direct/range {v4 .. v10}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;-><init>(Ljava/lang/String;Lio/streamroot/dna/core/proxy/server/Method;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object v2

    .line 73
    :cond_1a
    new-instance v3, Lio/streamroot/dna/core/proxy/server/ResponseException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BAD REQUEST: Syntax error. HTTP verb "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "method"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " unhandled."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x190

    invoke-direct {v3, v4, v2}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;)V

    check-cast v3, Ljava/lang/Throwable;

    throw v3

    .line 43
    :cond_1b
    new-instance v2, Lio/streamroot/dna/core/proxy/server/ResponseException;

    const-string v3, "BAD REQUEST: Missing URI. Usage: GET /example/file.html"

    const/16 v4, 0x190

    invoke-direct {v2, v4, v3}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 41
    :cond_1c
    new-instance v2, Lio/streamroot/dna/core/proxy/server/ResponseException;

    const-string v3, "BAD REQUEST: Syntax error. Usage: GET /example/file.html"

    const/16 v4, 0x190

    invoke-direct {v2, v4, v3}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 35
    :cond_1d
    new-instance v2, Lio/streamroot/dna/core/proxy/server/ResponseException;

    const-string v3, "BAD REQUEST: Syntax error. Usage: GET /example/file.html"

    const/16 v4, 0x190

    invoke-direct {v2, v4, v3}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 84
    new-instance v3, Lio/streamroot/dna/core/proxy/server/ResponseException;

    const/16 v4, 0x1f4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SERVER INTERNAL ERROR: IOException: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    check-cast v2, Ljava/lang/Exception;

    invoke-direct {v3, v4, v5, v2}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    check-cast v3, Ljava/lang/Throwable;

    throw v3
.end method

.method private final decodePercent(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "UTF8"

    .line 190
    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "URLDecoder.decode(str, \"UTF8\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final findHeaderEnd([BI)I
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    if-ge v2, p2, :cond_2

    .line 177
    aget-byte v3, p1, v1

    const/16 v4, 0xd

    int-to-byte v4, v4

    const/16 v5, 0xa

    if-ne v3, v4, :cond_0

    aget-byte v3, p1, v2

    int-to-byte v6, v5

    if-ne v3, v6, :cond_0

    add-int/lit8 v3, v1, 0x3

    if-ge v3, p2, :cond_0

    add-int/lit8 v7, v1, 0x2

    aget-byte v7, p1, v7

    if-ne v7, v4, :cond_0

    aget-byte v3, p1, v3

    if-ne v3, v6, :cond_0

    add-int/lit8 v1, v1, 0x4

    return v1

    .line 182
    :cond_0
    aget-byte v3, p1, v1

    int-to-byte v4, v5

    if-ne v3, v4, :cond_1

    aget-byte v3, p1, v2

    if-ne v3, v4, :cond_1

    add-int/lit8 v1, v1, 0x2

    return v1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return v0
.end method


# virtual methods
.method public final execute(Lio/streamroot/dna/core/proxy/server/SessionHandler;)V
    .locals 10
    .param p1    # Lio/streamroot/dna/core/proxy/server/SessionHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "executor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 90
    move-object v1, v0

    check-cast v1, Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    const/16 v2, 0x2000

    .line 97
    :try_start_0
    new-array v3, v2, [B

    .line 102
    iget-object v4, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    invoke-virtual {v4, v2}, Ljava/io/BufferedInputStream;->mark(I)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_a
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Lio/streamroot/dna/core/proxy/server/ResponseException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    :try_start_1
    iget-object v4, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5, v2}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Lio/streamroot/dna/core/proxy/server/ResponseException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, -0x1

    const/4 v7, 0x2

    if-ne v4, v6, :cond_0

    .line 111
    :try_start_2
    new-instance p1, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v2, "Socket closed by client, empty Inputstream"

    invoke-direct {p1, v2, v0, v7, v0}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_0
    move v6, v5

    move v8, v6

    :goto_0
    if-lez v4, :cond_2

    add-int/2addr v6, v4

    .line 115
    invoke-direct {p0, v3, v6}, Lio/streamroot/dna/core/proxy/server/HTTPSession;->findHeaderEnd([BI)I

    move-result v8

    if-lez v8, :cond_1

    goto :goto_1

    .line 119
    :cond_1
    iget-object v4, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    rsub-int v9, v6, 0x2000

    invoke-virtual {v4, v3, v6, v9}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v4

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v8, v6, :cond_3

    .line 123
    iget-object v2, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->reset()V

    .line 124
    iget-object v2, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->inputStream:Ljava/io/BufferedInputStream;

    int-to-long v8, v8

    invoke-virtual {v2, v8, v9}, Ljava/io/BufferedInputStream;->skip(J)J

    .line 128
    :cond_3
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    new-instance v8, Ljava/io/ByteArrayInputStream;

    invoke-direct {v8, v3, v5, v6}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    check-cast v8, Ljava/io/InputStream;

    invoke-direct {v4, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    check-cast v4, Ljava/io/Reader;

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 131
    invoke-direct {p0, v2}, Lio/streamroot/dna/core/proxy/server/HTTPSession;->decodeHeader(Ljava/io/BufferedReader;)Lio/streamroot/dna/core/proxy/server/ProxyRequest;

    move-result-object v2

    .line 133
    invoke-interface {p1, v2}, Lio/streamroot/dna/core/proxy/server/SessionHandler;->processRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_a
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Lio/streamroot/dna/core/proxy/server/ResponseException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :try_start_3
    invoke-virtual {v2}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getHeaders()Ljava/util/Map;

    move-result-object v1

    const-string v3, "connection"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "HTTP/1.1"

    .line 136
    invoke-virtual {v2}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getProtocolVersion()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v1, :cond_4

    check-cast v1, Ljava/lang/CharSequence;

    const-string v3, "(?i).*close.*"

    new-instance v4, Lkotlin/text/Regex;

    invoke-direct {v4, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    const/4 v5, 0x1

    .line 138
    :cond_5
    invoke-virtual {v2}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getMethod()Lio/streamroot/dna/core/proxy/server/Method;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->setRequestMethod(Lio/streamroot/dna/core/proxy/server/Method;)V

    .line 139
    invoke-virtual {p1, v5}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->setKeepAlive(Z)V

    .line 140
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->outputStream:Ljava/io/OutputStream;

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->send(Ljava/io/OutputStream;)V

    if-eqz v5, :cond_6

    .line 142
    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->isCloseConnection()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 143
    :cond_6
    new-instance v1, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v2, "Connection closed by client through connection header"

    invoke-direct {v1, v2, v0, v7, v0}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_3
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lio/streamroot/dna/core/proxy/server/ResponseException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_0
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_4

    :catch_3
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto/16 :goto_5

    :catch_4
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto/16 :goto_6

    :catch_5
    move-exception p1

    .line 106
    :try_start_4
    new-instance v0, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v2, "Socket closed by client"

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, v2, p1}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_4
    .catch Ljava/net/SocketException; {:try_start_4 .. :try_end_4} :catch_a
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Lio/streamroot/dna/core/proxy/server/ResponseException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_7

    :catch_6
    move-exception p1

    .line 160
    :goto_2
    :try_start_5
    sget-object v0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->Companion:Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;

    const/16 v2, 0x1f4

    const-string v3, "text/plain"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SERVER INTERNAL ERROR: Exception: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;->newFixedLengthResponse(ILjava/lang/String;Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 161
    :try_start_6
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->outputStream:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->send(Ljava/io/OutputStream;)V

    .line 162
    check-cast p1, Ljava/lang/Throwable;

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_7

    :catch_7
    move-exception p1

    .line 157
    :goto_3
    :try_start_7
    sget-object v0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->Companion:Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ResponseException;->getCode()I

    move-result v2

    const-string v3, "text/plain"

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ResponseException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, v3, p1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;->newFixedLengthResponse(ILjava/lang/String;Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 158
    :try_start_8
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/HTTPSession;->outputStream:Ljava/io/OutputStream;

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->send(Ljava/io/OutputStream;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 164
    :cond_7
    check-cast p1, Ljava/io/Closeable;

    invoke-static {p1}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    return-void

    :catchall_2
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_7

    :catch_8
    move-exception p1

    .line 155
    :goto_4
    :try_start_9
    new-instance v0, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v2, "Close Connection due to no internet"

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, v2, p1}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :catch_9
    move-exception p1

    .line 152
    :goto_5
    new-instance v0, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v2, "Connection closed due to timeout"

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, v2, p1}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :catch_a
    move-exception p1

    .line 147
    :goto_6
    new-instance v0, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v2, "Connection closed by client"

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, v2, p1}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 164
    :goto_7
    check-cast v1, Ljava/io/Closeable;

    invoke-static {v1}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    throw p1
.end method
