.class public final Lcom/ibotta/android/content/card/ContentCardViewState;
.super Ljava/lang/Object;
.source "ContentCardViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/ContentViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/content/card/ContentCardViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 L2\u00020\u0001:\u0001LB\u0081\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u0019J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0014H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u00108\u001a\u00020\u0018H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\tH\u00c6\u0003J\t\u0010<\u001a\u00020\u000bH\u00c6\u0003J\t\u0010=\u001a\u00020\rH\u00c6\u0003J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\t\u0010?\u001a\u00020\u0010H\u00c6\u0003J\t\u0010@\u001a\u00020\u0012H\u00c6\u0003J\u0085\u0001\u0010A\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018H\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\u0008\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0012H\u00d6\u0001J\t\u0010G\u001a\u00020HH\u00d6\u0001J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020KR\u0013\u0010\u0011\u001a\u00020\u00128\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001dR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0014\u0010%\u001a\u00020&X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104\u00a8\u0006M"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "contentModel",
        "Lcom/ibotta/api/model/ContentModel;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "summaryContentViewState",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "ibottaButtonViewState",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "imageViewState",
        "Lcom/ibotta/android/views/content/ContentImageViewState;",
        "expiringBannerViewState",
        "Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "contentBadgeViewState",
        "retailerStackViewState",
        "Lcom/ibotta/android/views/spotlight/RetailerStackViewState;",
        "backgroundRes",
        "",
        "payAtRetailerViewState",
        "Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;",
        "layoutViewState",
        "Lcom/ibotta/android/views/generic/LayoutViewState;",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;)V",
        "getBackgroundRes",
        "()I",
        "getContentBadgeViewState",
        "()Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "getContentModel",
        "()Lcom/ibotta/api/model/ContentModel;",
        "getExpiringBannerViewState",
        "getIbottaButtonViewState",
        "()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "getImageViewState",
        "()Lcom/ibotta/android/views/content/ContentImageViewState;",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getLayoutViewState",
        "()Lcom/ibotta/android/views/generic/LayoutViewState;",
        "getPayAtRetailerViewState",
        "()Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;",
        "getRetailerModel",
        "()Lcom/ibotta/api/model/RetailerModel;",
        "getRetailerStackViewState",
        "()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;",
        "getSummaryContentViewState",
        "()Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "withTrackingPayload",
        "payload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "Companion",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/content/card/ContentCardViewState$Companion;

.field private static final EMPTY:Lcom/ibotta/android/content/card/ContentCardViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final backgroundRes:I

.field private final contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final contentModel:Lcom/ibotta/api/model/ContentModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/ibotta/android/content/card/ContentCardViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/content/card/ContentCardViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/content/card/ContentCardViewState;->Companion:Lcom/ibotta/android/content/card/ContentCardViewState$Companion;

    .line 43
    new-instance v0, Lcom/ibotta/android/content/card/ContentCardViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xfff

    const/16 v16, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v16}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/content/card/ContentCardViewState;->EMPTY:Lcom/ibotta/android/content/card/ContentCardViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xfff

    const/4 v14, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 1
    .param p1    # Lcom/ibotta/api/model/ContentModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/SummaryContentViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/content/ContentImageViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/views/offer/badge/BadgeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/android/views/offer/badge/BadgeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/ibotta/android/views/generic/LayoutViewState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lcom/ibotta/android/tracking/content/TrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contentModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summaryContentViewState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaButtonViewState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageViewState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiringBannerViewState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentBadgeViewState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerStackViewState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payAtRetailerViewState"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingPayload"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    iput-object p2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iput-object p3, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    iput-object p4, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    iput-object p5, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    iput-object p6, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    iput-object p7, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    iput-object p8, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    iput p9, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    iput-object p10, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    iput-object p11, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    iput-object p12, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 38
    sget-object p1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->CONTENT_CARD:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    iput-object p1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 24
    new-instance v1, Lcom/ibotta/api/model/content/OfferContent;

    invoke-direct {v1}, Lcom/ibotta/api/model/content/OfferContent;-><init>()V

    check-cast v1, Lcom/ibotta/api/model/ContentModel;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 25
    move-object v2, v3

    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 26
    sget-object v4, Lcom/ibotta/android/views/content/SummaryContentViewState;->Companion:Lcom/ibotta/android/views/content/SummaryContentViewState$Companion;

    invoke-virtual {v4}, Lcom/ibotta/android/views/content/SummaryContentViewState$Companion;->getEMPTY()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    .line 27
    sget-object v5, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->EMPTY:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    .line 28
    sget-object v6, Lcom/ibotta/android/views/content/ContentImageViewState;->Companion:Lcom/ibotta/android/views/content/ContentImageViewState$Companion;

    invoke-virtual {v6}, Lcom/ibotta/android/views/content/ContentImageViewState$Companion;->getEMPTY()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 29
    sget-object v7, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->INVISIBLE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    .line 30
    sget-object v8, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->INVISIBLE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    .line 31
    new-instance v9, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xf

    const/4 v15, 0x0

    move-object/from16 p1, v9

    move-object/from16 p2, v10

    move/from16 p3, v11

    move-object/from16 p4, v12

    move-object/from16 p5, v13

    move/from16 p6, v14

    move-object/from16 p7, v15

    invoke-direct/range {p1 .. p7}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;-><init>(Ljava/lang/String;ILcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/components/Visibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    .line 33
    sget-object v11, Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;->GONE:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    .line 34
    check-cast v3, Lcom/ibotta/android/views/generic/LayoutViewState;

    goto :goto_a

    :cond_a
    move-object/from16 v3, p11

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    .line 35
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string v12, "NO_TRACKING"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/ibotta/android/tracking/content/TrackingPayload;

    goto :goto_b

    :cond_b
    move-object/from16 v0, p12

    :goto_b
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v3

    move-object/from16 p13, v0

    invoke-direct/range {p1 .. p13}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-void
.end method

.method public static final synthetic access$getEMPTY$cp()Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 1

    .line 23
    sget-object v0, Lcom/ibotta/android/content/card/ContentCardViewState;->EMPTY:Lcom/ibotta/android/content/card/ContentCardViewState;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/content/card/ContentCardViewState;Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILjava/lang/Object;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 13
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    invoke-virtual {p0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    goto :goto_b

    :cond_b
    move-object/from16 v1, p12

    :goto_b
    move-object p1, v2

    move-object p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lcom/ibotta/android/content/card/ContentCardViewState;->copy(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/ibotta/api/model/ContentModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    return-object v0
.end method

.method public final component10()Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    return-object v0
.end method

.method public final component11()Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    return-object v0
.end method

.method public final component12()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public final component3()Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    return-object v0
.end method

.method public final component4()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    return-object v0
.end method

.method public final component5()Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    return-object v0
.end method

.method public final component6()Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    return-object v0
.end method

.method public final component7()Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    return-object v0
.end method

.method public final component8()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    return v0
.end method

.method public final copy(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 14
    .param p1    # Lcom/ibotta/api/model/ContentModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/SummaryContentViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/content/ContentImageViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/views/offer/badge/BadgeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/android/views/offer/badge/BadgeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/ibotta/android/views/generic/LayoutViewState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lcom/ibotta/android/tracking/content/TrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentModel"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summaryContentViewState"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaButtonViewState"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageViewState"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiringBannerViewState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentBadgeViewState"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerStackViewState"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payAtRetailerViewState"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingPayload"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/content/card/ContentCardViewState;

    move-object v1, v0

    move-object/from16 v3, p2

    move/from16 v10, p9

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;)V

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

    instance-of v1, p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    iget v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    iget-object v3, p1, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

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

.method public final getBackgroundRes()I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 32
    iget v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    return v0
.end method

.method public final getContentBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    return-object v0
.end method

.method public final getContentModel()Lcom/ibotta/api/model/ContentModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    return-object v0
.end method

.method public final getExpiringBannerViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

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

.method public final getIbottaButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    return-object v0
.end method

.method public final getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    return-object v0
.end method

.method public getItemType()Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method

.method public final getLayoutViewState()Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    return-object v0
.end method

.method public final getPayAtRetailerViewState()Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    return-object v0
.end method

.method public final getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public final getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    return-object v0
.end method

.method public final getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    return-object v0
.end method

.method public getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_9

    :cond_9
    const/4 v2, 0x0

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_a
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentCardViewState(contentModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentModel:Lcom/ibotta/api/model/ContentModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", summaryContentViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->summaryContentViewState:Lcom/ibotta/android/views/content/SummaryContentViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ibottaButtonViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->ibottaButtonViewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->imageViewState:Lcom/ibotta/android/views/content/ContentImageViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiringBannerViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->expiringBannerViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentBadgeViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->contentBadgeViewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerStackViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->retailerStackViewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundRes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->backgroundRes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", payAtRetailerViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->payAtRetailerViewState:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardViewState;->layoutViewState:Lcom/ibotta/android/views/generic/LayoutViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackingPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 17
    .param p1    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "payload"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    move-object v14, v0

    check-cast v14, Lcom/ibotta/android/tracking/content/TrackingPayload;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0x7ff

    const/16 v16, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v16}, Lcom/ibotta/android/content/card/ContentCardViewState;->copy$default(Lcom/ibotta/android/content/card/ContentCardViewState;Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILjava/lang/Object;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object v0

    return-object v0
.end method
