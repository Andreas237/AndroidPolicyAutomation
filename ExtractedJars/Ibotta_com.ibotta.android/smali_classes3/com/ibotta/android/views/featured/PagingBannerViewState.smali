.class public final Lcom/ibotta/android/views/featured/PagingBannerViewState;
.super Ljava/lang/Object;
.source "PagingBannerViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/ContentViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/featured/PagingBannerViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 *2\u00020\u0001:\u0001*B?\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u000f\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003JH\u0010!\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0008H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006+"
    }
    d2 = {
        "Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "bannerViewStates",
        "",
        "Lcom/ibotta/android/views/featured/BannerViewState;",
        "eventContext",
        "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
        "retailerCategoryId",
        "",
        "retailerId",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)V",
        "getBannerViewStates",
        "()Ljava/util/List;",
        "getEventContext",
        "()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getRetailerCategoryId",
        "()I",
        "getRetailerId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/featured/PagingBannerViewState$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/featured/PagingBannerViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final bannerViewStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/featured/BannerViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final retailerCategoryId:I

.field private final retailerId:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/ibotta/android/views/featured/PagingBannerViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/featured/PagingBannerViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->Companion:Lcom/ibotta/android/views/featured/PagingBannerViewState$Companion;

    .line 24
    new-instance v0, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1f

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/views/featured/PagingBannerViewState;-><init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->EMPTY:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/featured/PagingBannerViewState;-><init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/tracking/content/TrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/featured/BannerViewState;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
            "I",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/tracking/content/TrackingPayload;",
            ")V"
        }
    .end annotation

    const-string v0, "bannerViewStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingPayload"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    iput-object p2, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    iput p3, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    iput-object p4, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 21
    sget-object p1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->BANNER:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    iput-object p1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 14
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 15
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NONE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-object p7, p2

    goto :goto_0

    :cond_1
    move-object p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    .line 17
    move-object p4, p2

    check-cast p4, Ljava/lang/Integer;

    move-object v1, p4

    goto :goto_2

    :cond_3
    move-object v1, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    .line 18
    sget-object p2, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p3, "NO_TRACKING"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p5, p2

    check-cast p5, Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-object v2, p5

    goto :goto_3

    :cond_4
    move-object v2, p5

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/ibotta/android/views/featured/PagingBannerViewState;-><init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/featured/PagingBannerViewState;Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;ILjava/lang/Object;)Lcom/ibotta/android/views/featured/PagingBannerViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object p5

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->copy(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/featured/BannerViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    return v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/views/featured/PagingBannerViewState;
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/tracking/content/TrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/featured/BannerViewState;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
            "I",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/tracking/content/TrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/featured/PagingBannerViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "bannerViewStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingPayload"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/views/featured/PagingBannerViewState;-><init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;)V

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

    instance-of v1, p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    iget-object v3, p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    iget-object v3, p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    iget v3, p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

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

.method public final getBannerViewStates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/featured/BannerViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    return-object v0
.end method

.method public final getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

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

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method

.method public final getRetailerCategoryId()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    return v0
.end method

.method public final getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v2

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

    const-string v1, "PagingBannerViewState(bannerViewStates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->bannerViewStates:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerCategoryId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerCategoryId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackingPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
