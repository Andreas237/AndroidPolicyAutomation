.class public final Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
.super Ljava/lang/Object;
.source "GalleryHeaderViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;,
        Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008*\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u0000 C2\u00020\u0001:\u0002BCB\u00b1\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\t\u00102\u001a\u00020\u0014H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\u00b5\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u00072\u0008\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\t\u0010@\u001a\u00020\u0014H\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0013\u001a\u00020\u00148\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0018R\u0011\u0010!\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001cR\u0011\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001c\u00a8\u0006D"
    }
    d2 = {
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "retailerName",
        "",
        "retailerLogoUrl",
        "imButtonText",
        "imStateUndefined",
        "",
        "imStateVerified",
        "imStatePending",
        "imStateError",
        "redeemButtonText",
        "redeemButtonVisible",
        "buyIgcButtonVisible",
        "pwiButtonText",
        "linkLoyaltyCardButtonText",
        "linkLoyaltyCardButtonVisible",
        "waysToEarnText",
        "useIconRes",
        "iconRes",
        "",
        "isLoyaltyLinkVariantEnabled",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZ)V",
        "getBuyIgcButtonVisible",
        "()Z",
        "getIconRes",
        "()I",
        "getImButtonText",
        "()Ljava/lang/String;",
        "getImStateError",
        "getImStatePending",
        "getImStateUndefined",
        "getImStateVerified",
        "isImDataEnabled",
        "getLinkLoyaltyCardButtonText",
        "getLinkLoyaltyCardButtonVisible",
        "getPwiButtonText",
        "getRedeemButtonText",
        "getRedeemButtonVisible",
        "getRetailerLogoUrl",
        "getRetailerName",
        "getUseIconRes",
        "getWaysToEarnText",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
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
        "other",
        "",
        "hashCode",
        "toString",
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
.field public static final Companion:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Companion;

.field public static EMPTY:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final buyIgcButtonVisible:Z

.field private final iconRes:I

.field private final imButtonText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final imStateError:Z

.field private final imStatePending:Z

.field private final imStateUndefined:Z

.field private final imStateVerified:Z

.field private final isLoyaltyLinkVariantEnabled:Z

.field private final linkLoyaltyCardButtonText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final linkLoyaltyCardButtonVisible:Z

.field private final pwiButtonText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final redeemButtonText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final redeemButtonVisible:Z

.field private final retailerLogoUrl:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final retailerName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final useIconRes:Z

.field private final waysToEarnText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->Companion:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Companion;

    .line 89
    new-instance v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-object v2, v0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1ffff

    const/16 v21, 0x0

    invoke-direct/range {v2 .. v21}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->EMPTY:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 20

    move-object/from16 v0, p0

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v18, 0x1ffff

    const/16 v19, 0x0

    invoke-direct/range {v0 .. v19}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZ)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object/from16 v3, p8

    move-object/from16 v4, p11

    move-object/from16 v5, p12

    move-object/from16 v6, p14

    const-string v7, "retailerName"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "imButtonText"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "redeemButtonText"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "pwiButtonText"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkLoyaltyCardButtonText"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "waysToEarnText"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    iput-object v2, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    move v1, p4

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    move v1, p5

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    move v1, p6

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    move v1, p7

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    iput-object v3, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    move/from16 v1, p9

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    move/from16 v1, p10

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    iput-object v4, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    iput-object v5, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    move/from16 v1, p13

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    iput-object v6, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    move/from16 v1, p16

    iput v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    move/from16 v1, p17

    iput-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const-string v2, ""

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    const-string v3, ""

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const-string v9, ""

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

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const-string v12, ""

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const-string v13, ""

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const-string v15, ""

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    goto :goto_e

    :cond_e
    move/from16 v5, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    goto :goto_10

    :cond_10
    move/from16 v0, p17

    :goto_10
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p16, v5

    move/from16 p17, v16

    move/from16 p18, v0

    .line 24
    invoke-direct/range {p1 .. p18}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZILjava/lang/Object;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
    .locals 17
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-boolean v15, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    move/from16 p15, v15

    iget v15, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    goto :goto_f

    :cond_f
    move/from16 p15, v15

    move/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget-boolean v1, v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move/from16 p13, v14

    move/from16 p16, v15

    move/from16 p17, v1

    invoke-virtual/range {p0 .. p17}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZ)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    return v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZ)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
    .locals 20
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    const-string v0, "retailerName"

    move-object/from16 v18, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imButtonText"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redeemButtonText"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pwiButtonText"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLoyaltyCardButtonText"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waysToEarnText"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZIZ)V

    return-object v19
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_b

    instance-of v1, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    check-cast p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    if-ne v1, v3, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    if-ne v1, v3, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    if-ne v1, v3, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    if-ne v1, v3, :cond_7

    const/4 v1, 0x1

    goto :goto_7

    :cond_7
    const/4 v1, 0x0

    :goto_7
    if-eqz v1, :cond_a

    iget v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    iget v3, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    if-ne v1, v3, :cond_8

    const/4 v1, 0x1

    goto :goto_8

    :cond_8
    const/4 v1, 0x0

    :goto_8
    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    iget-boolean p1, p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    if-ne v1, p1, :cond_9

    const/4 p1, 0x1

    goto :goto_9

    :cond_9
    const/4 p1, 0x0

    :goto_9
    if-eqz p1, :cond_a

    goto :goto_a

    :cond_a
    return v2

    :cond_b
    :goto_a
    return v0
.end method

.method public final getBuyIgcButtonVisible()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    return v0
.end method

.method public final getIconRes()I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 23
    iget v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    return v0
.end method

.method public final getImButtonText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getImStateError()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    return v0
.end method

.method public final getImStatePending()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    return v0
.end method

.method public final getImStateUndefined()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    return v0
.end method

.method public final getImStateVerified()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    return v0
.end method

.method public final getLinkLoyaltyCardButtonText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkLoyaltyCardButtonVisible()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    return v0
.end method

.method public final getPwiButtonText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getRedeemButtonText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getRedeemButtonVisible()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    return v0
.end method

.method public final getRetailerLogoUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRetailerName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getUseIconRes()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    return v0
.end method

.method public final getWaysToEarnText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    :cond_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    :cond_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    if-eqz v2, :cond_9

    const/4 v2, 0x1

    :cond_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_a
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    :cond_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    :cond_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    if-eqz v1, :cond_f

    const/4 v1, 0x1

    :cond_f
    add-int/2addr v0, v1

    return v0
.end method

.method public final isImDataEnabled()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final isLoyaltyLinkVariantEnabled()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GalleryHeaderViewState(retailerName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerLogoUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->retailerLogoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imButtonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imStateUndefined="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateUndefined:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", imStateVerified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateVerified:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", imStatePending="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStatePending:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", imStateError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->imStateError:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", redeemButtonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", redeemButtonVisible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->redeemButtonVisible:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", buyIgcButtonVisible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->buyIgcButtonVisible:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pwiButtonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->pwiButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkLoyaltyCardButtonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkLoyaltyCardButtonVisible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->linkLoyaltyCardButtonVisible:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", waysToEarnText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->waysToEarnText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", useIconRes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->useIconRes:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", iconRes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->iconRes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isLoyaltyLinkVariantEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
