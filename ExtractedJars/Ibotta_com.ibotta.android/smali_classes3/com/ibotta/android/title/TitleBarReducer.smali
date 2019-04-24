.class public final Lcom/ibotta/android/title/TitleBarReducer;
.super Ljava/lang/Object;
.source "TitleBarReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTitleBarReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TitleBarReducer.kt\ncom/ibotta/android/title/TitleBarReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n710#2:44\n732#2,2:45\n*E\n*S KotlinDebug\n*F\n+ 1 TitleBarReducer.kt\ncom/ibotta/android/title/TitleBarReducer\n*L\n40#1:44\n40#1,2:45\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "",
        "res",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "convertStringValue",
        "",
        "value",
        "Lcom/ibotta/android/views/generic/ResValue;",
        "create",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "title",
        "iconRes",
        "iconSize",
        "Lcom/ibotta/android/views/base/title/IconSize;",
        "actionables",
        "",
        "Lcom/ibotta/api/model/base/Actionable;",
        "subtitle",
        "topMargin",
        "",
        "throwOutInvalidActionables",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final res:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "res"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/title/TitleBarReducer;->res:Landroid/content/res/Resources;

    return-void
.end method

.method private final convertStringValue(Lcom/ibotta/android/views/generic/ResValue;)Ljava/lang/String;
    .locals 1

    .line 36
    instance-of v0, p1, Lcom/ibotta/android/views/generic/ResId;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/title/TitleBarReducer;->res:Landroid/content/res/Resources;

    check-cast p1, Lcom/ibotta/android/views/generic/ResId;

    invoke-virtual {p1}, Lcom/ibotta/android/views/generic/ResId;->getResource()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 37
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/views/generic/RawString;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ibotta/android/views/generic/RawString;

    invoke-virtual {p1}, Lcom/ibotta/android/views/generic/RawString;->getString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final throwOutInvalidActionables(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;"
        }
    .end annotation

    .line 40
    check-cast p1, Ljava/lang/Iterable;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 45
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ibotta/api/model/base/Actionable;

    .line 41
    invoke-interface {v2}, Lcom/ibotta/api/model/base/Actionable;->getText()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-nez v3, :cond_5

    invoke-interface {v2}, Lcom/ibotta/api/model/base/Actionable;->getLink()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v2, 0x1

    :goto_4
    if-eqz v2, :cond_6

    :cond_5
    const/4 v4, 0x1

    :cond_6
    if-nez v4, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 46
    :cond_7
    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    .line 14
    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lcom/ibotta/android/views/generic/ResValue;I)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 11
    .param p1    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->convertStringValue(Lcom/ibotta/android/views/generic/ResValue;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x5e

    const/4 v10, 0x0

    move-object v1, v0

    move v7, p2

    .line 32
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/base/title/TitleBarViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/base/title/IconSize;Ljava/lang/String;Ljava/util/List;ILcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 2
    .param p1    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconRes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    .line 16
    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Ljava/util/List;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/base/title/IconSize;Ljava/util/List;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 11
    .param p1    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/base/title/IconSize;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/generic/ResValue;",
            "Lcom/ibotta/android/views/generic/ResValue;",
            "Lcom/ibotta/android/views/base/title/IconSize;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;)",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconRes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconSize"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionables"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->convertStringValue(Lcom/ibotta/android/views/generic/ResValue;)Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-direct {p0, p4}, Lcom/ibotta/android/title/TitleBarReducer;->throwOutInvalidActionables(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x68

    const/4 v10, 0x0

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    .line 26
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/base/title/TitleBarViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/base/title/IconSize;Ljava/lang/String;Ljava/util/List;ILcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Ljava/util/List;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 11
    .param p1    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/generic/ResValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/generic/ResValue;",
            "Lcom/ibotta/android/views/generic/ResValue;",
            "Lcom/ibotta/android/views/generic/ResValue;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;)",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconRes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionables"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->convertStringValue(Lcom/ibotta/android/views/generic/ResValue;)Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-direct {p0, p3}, Lcom/ibotta/android/title/TitleBarReducer;->convertStringValue(Lcom/ibotta/android/views/generic/ResValue;)Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-direct {p0, p4}, Lcom/ibotta/android/title/TitleBarReducer;->throwOutInvalidActionables(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x64

    const/4 v10, 0x0

    move-object v1, v0

    move-object v3, p2

    .line 19
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/base/title/TitleBarViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/base/title/IconSize;Ljava/lang/String;Ljava/util/List;ILcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
