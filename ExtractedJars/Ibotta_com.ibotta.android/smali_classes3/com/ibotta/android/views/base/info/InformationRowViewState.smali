.class public final Lcom/ibotta/android/views/base/info/InformationRowViewState;
.super Ljava/lang/Object;
.source "InformationRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/ContentViewState;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "text",
        "",
        "originalTerm",
        "suggestedTerm",
        "confidenceLevel",
        "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)V",
        "getConfidenceLevel",
        "()Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getOriginalTerm",
        "()Ljava/lang/String;",
        "getSuggestedTerm",
        "getText",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final originalTerm:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final suggestedTerm:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final text:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/base/info/InformationRowViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalTerm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suggestedTerm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confidenceLevel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    iput-object p2, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    iput-object p3, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    iput-object p4, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    .line 51
    sget-object p1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->INFO_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    .line 52
    sget-object p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p2, "NO_TRACKING"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ibotta/android/tracking/content/TrackingPayload;

    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const-string p2, ""

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const-string p3, ""

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 49
    sget-object p4, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->EXACT:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/base/info/InformationRowViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/base/info/InformationRowViewState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;ILjava/lang/Object;)Lcom/ibotta/android/views/base/info/InformationRowViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/base/info/InformationRowViewState;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)Lcom/ibotta/android/views/base/info/InformationRowViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)Lcom/ibotta/android/views/base/info/InformationRowViewState;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalTerm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suggestedTerm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confidenceLevel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/views/base/info/InformationRowViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    iget-object v1, p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    iget-object v1, p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    iget-object v1, p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    iget-object p1, p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getConfidenceLevel()Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    return-object v0
.end method

.method public synthetic getFastBubbleKey()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/ContentViewState$-CC;->$default$getFastBubbleKey(Lcom/ibotta/android/views/list/ContentViewState;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItemType()Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method

.method public final getOriginalTerm()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuggestedTerm()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InformationRowViewState(text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", originalTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->originalTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", suggestedTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->suggestedTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", confidenceLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/base/info/InformationRowViewState;->confidenceLevel:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
