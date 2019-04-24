.class public final Lcom/ibotta/android/content/card/deal/DealSummaryReducer;
.super Ljava/lang/Object;
.source "DealSummaryReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000c\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000c\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/deal/DealSummaryReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "online",
        "",
        "kotlin.jvm.PlatformType",
        "create",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "dealModel",
        "Lcom/ibotta/api/model/DealModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getBottomTextLines",
        "",
        "(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;",
        "getBottomTextMaxLines",
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
.field private final online:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    sget v0, Lcom/ibotta/android/reducers/R$string;->common_online:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;->online:Ljava/lang/String;

    return-void
.end method

.method private final getBottomTextLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/android/content/card/deal/DealSummaryReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x2

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getBottomTextMaxLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;
    .locals 1

    .line 23
    sget-object v0, Lcom/ibotta/android/content/card/deal/DealSummaryReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x2

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/DealModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "dealModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 17
    iget-object v2, p0, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;->online:Ljava/lang/String;

    const-string v1, "online"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getPercentBackText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    move-object v4, v1

    .line 19
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getName()Ljava/lang/String;

    move-result-object v5

    const-string p1, "dealModel.name"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0, p2}, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;->getBottomTextMaxLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;

    move-result-object v6

    .line 21
    invoke-direct {p0, p2}, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;->getBottomTextLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x42

    const/4 v10, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    .line 16
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
