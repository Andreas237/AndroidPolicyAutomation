.class public final enum Lcom/ibotta/android/views/list/NoRowViewState;
.super Ljava/lang/Enum;
.source "ContentViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/ContentViewState;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/list/NoRowViewState;",
        ">;",
        "Lcom/ibotta/android/views/list/ContentViewState;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/NoRowViewState;",
        "",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "(Ljava/lang/String;ILcom/ibotta/android/views/list/ContentViewState$ContentType;)V",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "LOADING_ROW",
        "SUGGESTION_TITLE_ROW",
        "DECORATION_VIEW",
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
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/list/NoRowViewState;

.field public static final enum DECORATION_VIEW:Lcom/ibotta/android/views/list/NoRowViewState;

.field public static final enum LOADING_ROW:Lcom/ibotta/android/views/list/NoRowViewState;

.field public static final enum SUGGESTION_TITLE_ROW:Lcom/ibotta/android/views/list/NoRowViewState;


# instance fields
.field private final itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ibotta/android/views/list/NoRowViewState;

    new-instance v1, Lcom/ibotta/android/views/list/NoRowViewState;

    const-string v2, "LOADING_ROW"

    .line 53
    sget-object v3, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->LOADING:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/views/list/NoRowViewState;-><init>(Ljava/lang/String;ILcom/ibotta/android/views/list/ContentViewState$ContentType;)V

    sput-object v1, Lcom/ibotta/android/views/list/NoRowViewState;->LOADING_ROW:Lcom/ibotta/android/views/list/NoRowViewState;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/views/list/NoRowViewState;

    const-string v2, "SUGGESTION_TITLE_ROW"

    sget-object v3, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->SUGGESTION_TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/views/list/NoRowViewState;-><init>(Ljava/lang/String;ILcom/ibotta/android/views/list/ContentViewState$ContentType;)V

    sput-object v1, Lcom/ibotta/android/views/list/NoRowViewState;->SUGGESTION_TITLE_ROW:Lcom/ibotta/android/views/list/NoRowViewState;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/views/list/NoRowViewState;

    const-string v2, "DECORATION_VIEW"

    sget-object v3, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->DECORATOR:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const/4 v4, 0x2

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/views/list/NoRowViewState;-><init>(Ljava/lang/String;ILcom/ibotta/android/views/list/ContentViewState$ContentType;)V

    sput-object v1, Lcom/ibotta/android/views/list/NoRowViewState;->DECORATION_VIEW:Lcom/ibotta/android/views/list/NoRowViewState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/views/list/NoRowViewState;->$VALUES:[Lcom/ibotta/android/views/list/NoRowViewState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/ibotta/android/views/list/ContentViewState$ContentType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ")V"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ibotta/android/views/list/NoRowViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    .line 59
    sget-object p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p2, "NO_TRACKING"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ibotta/android/tracking/content/TrackingPayload;

    iput-object p1, p0, Lcom/ibotta/android/views/list/NoRowViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/list/NoRowViewState;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/list/NoRowViewState;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/list/NoRowViewState;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/list/NoRowViewState;->$VALUES:[Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/list/NoRowViewState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/list/NoRowViewState;

    return-object v0
.end method


# virtual methods
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

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/views/list/NoRowViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method

.method public getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/views/list/NoRowViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-object v0
.end method
