.class public final Lcom/ibotta/android/views/list/IbottaListViewState;
.super Ljava/lang/Object;
.source "IbottaListViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/ContentViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/list/IbottaListViewState$Builder;,
        Lcom/ibotta/android/views/list/IbottaListViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u0000 32\u00020\u0001:\u000223BQ\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003JU\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010+\u001a\u00020\r2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u00064"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "searchTerm",
        "",
        "rows",
        "",
        "decorator",
        "Lcom/ibotta/android/views/list/Decorator;",
        "padding",
        "Lcom/ibotta/android/views/list/Padding;",
        "layoutType",
        "Lcom/ibotta/android/views/list/LayoutType;",
        "useSnapHelper",
        "",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)V",
        "getDecorator",
        "()Lcom/ibotta/android/views/list/Decorator;",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getLayoutType",
        "()Lcom/ibotta/android/views/list/LayoutType;",
        "getPadding",
        "()Lcom/ibotta/android/views/list/Padding;",
        "getRows",
        "()Ljava/util/List;",
        "getSearchTerm",
        "()Ljava/lang/String;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "getUseSnapHelper",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "withPadding",
        "Builder",
        "Companion",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/views/list/IbottaListViewState$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/list/IbottaListViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final LOADING:Lcom/ibotta/android/views/list/IbottaListViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final decorator:Lcom/ibotta/android/views/list/Decorator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final layoutType:Lcom/ibotta/android/views/list/LayoutType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final padding:Lcom/ibotta/android/views/list/Padding;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final searchTerm:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final useSnapHelper:Z


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v0, Lcom/ibotta/android/views/list/IbottaListViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/list/IbottaListViewState;->Companion:Lcom/ibotta/android/views/list/IbottaListViewState$Companion;

    .line 67
    new-instance v0, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x7d

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/list/IbottaListViewState;->EMPTY:Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 68
    new-instance v0, Lcom/ibotta/android/views/list/IbottaListViewState;

    sget-object v1, Lcom/ibotta/android/views/list/NoRowViewState;->LOADING_ROW:Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x7d

    const/16 v21, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v21}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/list/IbottaListViewState;->LOADING:Lcom/ibotta/android/views/list/IbottaListViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7f

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/list/Decorator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/list/Padding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/list/LayoutType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/android/tracking/content/TrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;",
            "Lcom/ibotta/android/views/list/Decorator;",
            "Lcom/ibotta/android/views/list/Padding;",
            "Lcom/ibotta/android/views/list/LayoutType;",
            "Z",
            "Lcom/ibotta/android/tracking/content/TrackingPayload;",
            ")V"
        }
    .end annotation

    const-string v0, "searchTerm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rows"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decorator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingPayload"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    iput-object p2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    iput-object p3, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    iput-object p4, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    iput-object p5, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    iput-boolean p6, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    iput-object p7, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 28
    sget-object p1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->HORIZONTAL_LIST:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const-string v0, "NO_SEARCH_TERM"

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_1

    .line 20
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object/from16 v1, p2

    :goto_1
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_2

    .line 21
    new-instance v2, Lcom/ibotta/android/views/list/Decorator;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xff

    const/4 v13, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v13}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object/from16 v2, p3

    :goto_2
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_3

    .line 22
    new-instance v3, Lcom/ibotta/android/views/list/Padding;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v10, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Lcom/ibotta/android/views/list/Padding;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object/from16 v3, p4

    :goto_3
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_4

    .line 23
    sget-object v4, Lcom/ibotta/android/views/list/VerticalLayout;->INSTANCE:Lcom/ibotta/android/views/list/VerticalLayout;

    check-cast v4, Lcom/ibotta/android/views/list/LayoutType;

    goto :goto_4

    :cond_4
    move-object/from16 v4, p5

    :goto_4
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_5

    :cond_5
    move/from16 v5, p6

    :goto_5
    and-int/lit8 v6, p8, 0x40

    if-eqz v6, :cond_6

    .line 25
    sget-object v6, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string v7, "NO_TRACKING"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/ibotta/android/tracking/content/TrackingPayload;

    goto :goto_6

    :cond_6
    move-object/from16 v6, p7

    :goto_6
    move-object p1, p0

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move-object/from16 p4, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move/from16 p7, v5

    move-object/from16 p8, v6

    invoke-direct/range {p1 .. p8}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/list/IbottaListViewState;Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILjava/lang/Object;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    :cond_5
    move v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object p7

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/ibotta/android/views/list/IbottaListViewState;->copy(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/ibotta/android/views/list/Decorator;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    return-object v0
.end method

.method public final component4()Lcom/ibotta/android/views/list/Padding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    return-object v0
.end method

.method public final component5()Lcom/ibotta/android/views/list/LayoutType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    return v0
.end method

.method public final component7()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/list/Decorator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/list/Padding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/list/LayoutType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/android/tracking/content/TrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;",
            "Lcom/ibotta/android/views/list/Decorator;",
            "Lcom/ibotta/android/views/list/Padding;",
            "Lcom/ibotta/android/views/list/LayoutType;",
            "Z",
            "Lcom/ibotta/android/tracking/content/TrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "searchTerm"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rows"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decorator"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutType"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingPayload"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/list/IbottaListViewState;

    move-object v1, v0

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_2

    instance-of v1, p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    iget-object v3, p1, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    iget-object v3, p1, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    iget-object v3, p1, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    iget-object v3, p1, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v0
.end method

.method public final getDecorator()Lcom/ibotta/android/views/list/Decorator;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

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

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method

.method public final getLayoutType()Lcom/ibotta/android/views/list/LayoutType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    return-object v0
.end method

.method public final getPadding()Lcom/ibotta/android/views/list/Padding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    return-object v0
.end method

.method public final getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    return-object v0
.end method

.method public final getSearchTerm()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-object v0
.end method

.method public final getUseSnapHelper()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IbottaListViewState(searchTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->searchTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rows="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->rows:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decorator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->decorator:Lcom/ibotta/android/views/list/Decorator;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", padding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->padding:Lcom/ibotta/android/views/list/Padding;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->layoutType:Lcom/ibotta/android/views/list/LayoutType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", useSnapHelper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/list/IbottaListViewState;->useSnapHelper:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", trackingPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withPadding(Lcom/ibotta/android/views/list/Padding;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 11
    .param p1    # Lcom/ibotta/android/views/list/Padding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "padding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x77

    const/4 v10, 0x0

    move-object v1, p0

    move-object v5, p1

    .line 37
    invoke-static/range {v1 .. v10}, Lcom/ibotta/android/views/list/IbottaListViewState;->copy$default(Lcom/ibotta/android/views/list/IbottaListViewState;Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILjava/lang/Object;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method
