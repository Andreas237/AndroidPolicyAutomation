.class public final Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
.super Ljava/lang/Object;
.source "IbottaListViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/list/IbottaListViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIbottaListViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbottaListViewState.kt\ncom/ibotta/android/views/list/IbottaListViewState$Builder\n*L\n1#1,101:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0008J\u0014\u0010\t\u001a\u00020\u00002\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/IbottaListViewState$Builder;",
        "",
        "()V",
        "decorator",
        "Lcom/ibotta/android/views/list/Decorator;",
        "layoutType",
        "Lcom/ibotta/android/views/list/LayoutType;",
        "padding",
        "Lcom/ibotta/android/views/list/Padding;",
        "rows",
        "",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "searchTerm",
        "",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "kotlin.jvm.PlatformType",
        "useSnapHelper",
        "",
        "build",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "value",
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
.field private decorator:Lcom/ibotta/android/views/list/Decorator;

.field private layoutType:Lcom/ibotta/android/views/list/LayoutType;

.field private padding:Lcom/ibotta/android/views/list/Padding;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation
.end field

.field private searchTerm:Ljava/lang/String;

.field private trackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

.field private useSnapHelper:Z


# direct methods
.method public constructor <init>()V
    .locals 20

    move-object/from16 v0, p0

    .line 39
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "NO_SEARCH_TERM"

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->searchTerm:Ljava/lang/String;

    .line 41
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows:Ljava/util/List;

    .line 42
    new-instance v1, Lcom/ibotta/android/views/list/Decorator;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xff

    const/4 v12, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v12}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->decorator:Lcom/ibotta/android/views/list/Decorator;

    .line 43
    new-instance v1, Lcom/ibotta/android/views/list/Padding;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xf

    const/16 v19, 0x0

    move-object v13, v1

    invoke-direct/range {v13 .. v19}, Lcom/ibotta/android/views/list/Padding;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->padding:Lcom/ibotta/android/views/list/Padding;

    .line 44
    sget-object v1, Lcom/ibotta/android/views/list/VerticalLayout;->INSTANCE:Lcom/ibotta/android/views/list/VerticalLayout;

    check-cast v1, Lcom/ibotta/android/views/list/LayoutType;

    iput-object v1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    .line 46
    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    iput-object v1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->trackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 56
    new-instance v8, Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->searchTerm:Ljava/lang/String;

    .line 58
    iget-object v2, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows:Ljava/util/List;

    .line 59
    iget-object v3, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->decorator:Lcom/ibotta/android/views/list/Decorator;

    .line 60
    iget-object v4, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->padding:Lcom/ibotta/android/views/list/Padding;

    .line 61
    iget-object v5, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    .line 62
    iget-boolean v6, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->useSnapHelper:Z

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->trackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string v7, "trackingPayload"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v0

    check-cast v7, Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-object v0, v8

    .line 56
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-object v8
.end method

.method public final decorator(Lcom/ibotta/android/views/list/Decorator;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/Decorator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->decorator:Lcom/ibotta/android/views/list/Decorator;

    return-object v0
.end method

.method public final layoutType(Lcom/ibotta/android/views/list/LayoutType;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/LayoutType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    return-object v0
.end method

.method public final padding(Lcom/ibotta/android/views/list/Padding;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/Padding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->padding:Lcom/ibotta/android/views/list/Padding;

    return-object v0
.end method

.method public final rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;)",
            "Lcom/ibotta/android/views/list/IbottaListViewState$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows:Ljava/util/List;

    return-object v0
.end method

.method public final searchTerm(Ljava/lang/String;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->searchTerm:Ljava/lang/String;

    return-object v0
.end method

.method public final trackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .param p1    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->trackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    return-object v0
.end method

.method public final useSnapHelper(Z)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 53
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->useSnapHelper:Z

    return-object v0
.end method
