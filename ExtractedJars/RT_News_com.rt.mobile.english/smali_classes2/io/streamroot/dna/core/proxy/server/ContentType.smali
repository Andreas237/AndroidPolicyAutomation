.class public final Lio/streamroot/dna/core/proxy/server/ContentType;
.super Ljava/lang/Object;
.source "ContentType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/proxy/server/ContentType$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/server/ContentType;",
        "",
        "contentTypeHeader",
        "",
        "(Ljava/lang/String;)V",
        "encoding",
        "Ljava/nio/charset/Charset;",
        "getDetailFromContentHeader",
        "pattern",
        "Ljava/util/regex/Pattern;",
        "getEncoding",
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
.field private static final CHARSET_PATTERN:Ljava/util/regex/Pattern;

.field private static final CHARSET_REGEX:Ljava/lang/String; = "[ |\t]*(charset)[ |\t]*=[ |\t]*[\'|\"]?([^\"^\'^;^,]*)[\'|\"]?"

.field public static final Companion:Lio/streamroot/dna/core/proxy/server/ContentType$Companion;


# instance fields
.field private final encoding:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/proxy/server/ContentType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/proxy/server/ContentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/proxy/server/ContentType;->Companion:Lio/streamroot/dna/core/proxy/server/ContentType$Companion;

    .line 35
    sget-object v0, Lio/streamroot/dna/core/proxy/server/ContentType;->CHARSET_REGEX:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/streamroot/dna/core/proxy/server/ContentType;->CHARSET_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 12
    sget-object v0, Lio/streamroot/dna/core/proxy/server/ContentType;->CHARSET_PATTERN:Ljava/util/regex/Pattern;

    const-string v1, "CHARSET_PATTERN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lio/streamroot/dna/core/proxy/server/ContentType;->getDetailFromContentHeader(Ljava/lang/String;Ljava/util/regex/Pattern;)Ljava/nio/charset/Charset;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_0
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v0, "StandardCharsets.UTF_8"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    :goto_0
    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/ContentType;->encoding:Ljava/nio/charset/Charset;

    return-void
.end method

.method private final getDetailFromContentHeader(Ljava/lang/String;Ljava/util/regex/Pattern;)Ljava/nio/charset/Charset;
    .locals 0

    .line 20
    :try_start_0
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    const-string p2, "Charset.forName(matcher.group(2))"

    :goto_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string p2, "StandardCharsets.UTF_8"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 23
    :catch_0
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string p2, "StandardCharsets.UTF_8"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method


# virtual methods
.method public final getEncoding()Ljava/nio/charset/Charset;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 28
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ContentType;->encoding:Ljava/nio/charset/Charset;

    return-object v0
.end method
