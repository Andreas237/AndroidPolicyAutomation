.class public final Lcom/ibotta/android/content/card/deal/DealImageReducer;
.super Ljava/lang/Object;
.source "DealImageReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDealImageReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DealImageReducer.kt\ncom/ibotta/android/content/card/deal/DealImageReducer\n*L\n1#1,42:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/deal/DealImageReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/content/ContentImageViewState;",
        "dealModel",
        "Lcom/ibotta/api/model/DealModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getImageUrl",
        "",
        "getScaleType",
        "Lcom/ibotta/android/views/content/ScaleType;",
        "style",
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
.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/deal/DealImageReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getImageUrl(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/String;
    .locals 4

    .line 26
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_0

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p2, v0, :cond_3

    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    .line 28
    :goto_2
    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p2, v3, :cond_6

    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_5

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    const/4 p2, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p2, 0x1

    :goto_4
    if-nez p2, :cond_6

    const/4 v1, 0x1

    :cond_6
    if-eqz v0, :cond_7

    .line 31
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_7
    if-eqz v1, :cond_8

    .line 32
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    .line 33
    :cond_8
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method private final getScaleType(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ScaleType;
    .locals 1

    .line 37
    sget-object v0, Lcom/ibotta/android/content/card/deal/DealImageReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 39
    sget-object p1, Lcom/ibotta/android/views/content/ScaleType;->CENTER_CROP:Lcom/ibotta/android/views/content/ScaleType;

    goto :goto_0

    .line 38
    :cond_0
    sget-object p1, Lcom/ibotta/android/views/content/ScaleType;->FIT_CENTER:Lcom/ibotta/android/views/content/ScaleType;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 7
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
    new-instance v0, Lcom/ibotta/android/views/content/ContentImageViewState;

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/content/card/deal/DealImageReducer;->getImageUrl(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/String;

    move-result-object v2

    .line 19
    invoke-direct {p0, p2}, Lcom/ibotta/android/content/card/deal/DealImageReducer;->getScaleType(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ScaleType;

    move-result-object v5

    .line 20
    sget-object p1, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    iget-object v1, p0, Lcom/ibotta/android/content/card/deal/DealImageReducer;->resources:Landroid/content/res/Resources;

    invoke-virtual {p1, p2, v1}, Lcom/ibotta/android/views/util/CardHelper;->getImageHeight(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;)I

    move-result v4

    .line 21
    invoke-static {p2}, Lcom/ibotta/android/content/card/ContentImageUtilKt;->getGlideSize(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/images/Sizes;

    move-result-object v6

    const/4 v3, 0x0

    move-object v1, v0

    .line 16
    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V

    return-object v0
.end method
