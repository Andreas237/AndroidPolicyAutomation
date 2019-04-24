.class public final Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
.super Ljava/lang/Object;
.source "PaymentOptionRowViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/ContentViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;,
        Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u0000 42\u00020\u0001:\u000234BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000fJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0008H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003Jc\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010.\u001a\u00020\n2\u0008\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0015R\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020!X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#\u00a8\u00065"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "iconResId",
        "",
        "nameResId",
        "name",
        "",
        "action",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;",
        "default",
        "",
        "selected",
        "sourceId",
        "isExpired",
        "cardType",
        "(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)V",
        "getAction",
        "()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;",
        "getCardType",
        "()Ljava/lang/String;",
        "getDefault",
        "()Z",
        "getIconResId",
        "()I",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getName",
        "getNameResId",
        "getSelected",
        "getSourceId",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "component1",
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
        "Action",
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
.field public static final ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Companion;

.field public static final GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cardType:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final default:Z

.field private final iconResId:I

.field private final isExpired:Z

.field private final itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nameResId:I

.field private final selected:Z

.field private final sourceId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->Companion:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Companion;

    .line 29
    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 30
    sget v3, Lcom/ibotta/views/R$drawable;->svg_icon_add_small_gray_94:I

    .line 31
    sget v4, Lcom/ibotta/views/R$string;->pwi_add_card:I

    .line 32
    sget-object v6, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1f4

    const/4 v13, 0x0

    move-object v2, v0

    .line 29
    invoke-direct/range {v2 .. v13}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 34
    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 35
    sget v15, Lcom/ibotta/views/R$drawable;->svg_icn_google_pay:I

    .line 36
    sget v16, Lcom/ibotta/views/R$string;->pwi_google_pay:I

    .line 37
    sget-object v18, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1f4

    const/16 v25, 0x0

    move-object v14, v0

    .line 34
    invoke-direct/range {v14 .. v25}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardType"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    iput p2, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    iput-object p3, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    iput-boolean p5, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    iput-boolean p6, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    iput-object p7, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    iput-object p9, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    .line 25
    sget-object p1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->PAYMENT_METHOD_ROW_HOME:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    .line 26
    sget-object p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p2, "NO_TRACKING"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ibotta/android/tracking/content/TrackingPayload;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const-string v1, ""

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    move/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    const/4 v8, 0x0

    goto :goto_2

    :cond_2
    move/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    const-string v1, ""

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const/4 v10, 0x0

    goto :goto_4

    :cond_4
    move/from16 v10, p8

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    const-string v0, ""

    move-object v11, v0

    goto :goto_5

    :cond_5
    move-object/from16 v11, p9

    :goto_5
    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object/from16 v6, p4

    .line 21
    invoke-direct/range {v2 .. v11}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move p1, v2

    move p2, v3

    move-object p3, v4

    move-object p4, v5

    move p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->copy(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    .locals 11
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceId"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardType"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_6

    instance-of v1, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    iget v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_5

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    iget v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    if-ne v1, v3, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    iget-object p1, p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_5

    :cond_5
    return v2

    :cond_6
    :goto_5
    return v0
.end method

.method public final getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    return-object v0
.end method

.method public final getCardType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefault()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    return v0
.end method

.method public synthetic getFastBubbleKey()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/ContentViewState$-CC;->$default$getFastBubbleKey(Lcom/ibotta/android/views/list/ContentViewState;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getIconResId()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    return v0
.end method

.method public getItemType()Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->itemType:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNameResId()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    return v0
.end method

.method public final getSelected()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    return v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_6
    add-int/2addr v0, v2

    return v0
.end method

.method public final isExpired()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PaymentOptionRowViewState(iconResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->iconResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nameResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->nameResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->action:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", default="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->default:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", selected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->selected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->sourceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isExpired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->cardType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
