.class public final Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;
.super Ljava/lang/Object;
.source "LineProcessor.kt"

# interfaces
.implements Lio/streamroot/dna/core/stream/hls/LineProcessor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0007\u001a\u00020\u00082\n\u0010\t\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u0010J$\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;",
        "Lio/streamroot/dna/core/stream/hls/LineProcessor;",
        "()V",
        "firstQueryParameter",
        "",
        "lookup",
        "newQueryParameter",
        "appendAndUrlEncodeString",
        "",
        "stringBuilder",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "manifest",
        "from",
        "",
        "to",
        "appendAndUrlEncodeString$dna_core_release",
        "processLine",
        "manifestStringBuilder",
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
.field public static final Companion:Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor$Companion;

.field public static final DNA_REDIREXCTION_QUERY:Ljava/lang/String; = "dnaOrigin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final firstQueryParameter:Ljava/lang/String;

.field private final lookup:Ljava/lang/String;

.field private final newQueryParameter:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->Companion:Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "?dnaOrigin="

    .line 17
    iput-object v0, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->firstQueryParameter:Ljava/lang/String;

    const-string v0, "&dnaOrigin="

    .line 18
    iput-object v0, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->newQueryParameter:Ljava/lang/String;

    const-string v0, "0123456789ABCDEF"

    .line 19
    iput-object v0, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->lookup:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final appendAndUrlEncodeString$dna_core_release(Ljava/lang/StringBuilder;Ljava/lang/String;II)V
    .locals 3
    .param p1    # Ljava/lang/StringBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stringBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manifest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-ge p3, p4, :cond_a

    .line 63
    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x39

    const/16 v2, 0x30

    if-le v2, v0, :cond_0

    goto :goto_1

    :cond_0
    if-lt v1, v0, :cond_1

    goto :goto_4

    :cond_1
    :goto_1
    const/16 v1, 0x7a

    const/16 v2, 0x61

    if-le v2, v0, :cond_2

    goto :goto_2

    :cond_2
    if-lt v1, v0, :cond_3

    goto :goto_4

    :cond_3
    :goto_2
    const/16 v1, 0x5a

    const/16 v2, 0x41

    if-le v2, v0, :cond_4

    goto :goto_3

    :cond_4
    if-lt v1, v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    const/16 v1, 0x7e

    if-ne v0, v1, :cond_6

    goto :goto_4

    :cond_6
    const/16 v1, 0x2e

    if-ne v0, v1, :cond_7

    goto :goto_4

    :cond_7
    const/16 v1, 0x2d

    if-ne v0, v1, :cond_8

    goto :goto_4

    :cond_8
    const/16 v1, 0x5f

    if-ne v0, v1, :cond_9

    .line 72
    :goto_4
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_9
    const/16 v1, 0x25

    .line 77
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->lookup:Ljava/lang/String;

    and-int/lit16 v2, v0, 0xf0

    shr-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->lookup:Ljava/lang/String;

    and-int/lit8 v0, v0, 0xf

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_5
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_a
    return-void
.end method

.method public processLine(Ljava/lang/StringBuilder;Ljava/lang/String;I)I
    .locals 8
    .param p1    # Ljava/lang/StringBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "manifestStringBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manifest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v3, v0

    move v4, v3

    move v2, v1

    move v0, p3

    :cond_0
    :goto_0
    const/4 v5, 0x1

    add-int/2addr v0, v5

    .line 27
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v0, v6, :cond_3

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0xa

    if-eq v6, v7, :cond_3

    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2f

    if-ne v6, v7, :cond_1

    add-int/lit8 v3, v3, 0x1

    const/4 v5, 0x3

    if-ne v3, v5, :cond_0

    move v2, v0

    goto :goto_0

    :cond_1
    const/16 v7, 0x3f

    if-ne v6, v7, :cond_0

    if-ne v2, v1, :cond_2

    move v2, v0

    :cond_2
    move v4, v5

    goto :goto_0

    :cond_3
    const-string v3, "\n"

    add-int/lit8 v6, v0, -0x1

    .line 41
    invoke-virtual {p2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0xd

    if-ne v6, v7, :cond_4

    const-string v3, "\r\n"

    add-int/lit8 v6, v0, -0x1

    goto :goto_1

    :cond_4
    move v6, v0

    :goto_1
    if-eq v2, v1, :cond_6

    .line 47
    invoke-static {p2, p1, v2, v6}, Lio/streamroot/dna/core/utils/StringExtensionKt;->copyInto(Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    if-eqz v4, :cond_5

    .line 48
    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->newQueryParameter:Ljava/lang/String;

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->firstQueryParameter:Ljava/lang/String;

    :goto_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {p0, p1, p2, p3, v2}, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->appendAndUrlEncodeString$dna_core_release(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    goto :goto_3

    .line 52
    :cond_6
    iget-object v1, p0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->firstQueryParameter:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {p0, p1, p2, p3, v6}, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;->appendAndUrlEncodeString$dna_core_release(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    .line 56
    :goto_3
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v0, v5

    return v0
.end method
