.class public final Lcom/ibotta/android/content/ContentImageReducer;
.super Ljava/lang/Object;
.source "ContentImageReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/content/ContentImageReducer;",
        "",
        "()V",
        "imageUrl",
        "",
        "Lcom/ibotta/api/model/ContentModel;",
        "getImageUrl",
        "(Lcom/ibotta/api/model/ContentModel;)Ljava/lang/String;",
        "create",
        "Lcom/ibotta/android/views/content/row/ContentImageViewState;",
        "contentModel",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getImageUrl(Lcom/ibotta/api/model/ContentModel;)Ljava/lang/String;
    .locals 2
    .param p1    # Lcom/ibotta/api/model/ContentModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 37
    instance-of v0, p1, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    goto :goto_0

    .line 38
    :cond_1
    instance-of v0, p1, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, ""

    :goto_0
    const-string v0, "when(this) {\n        is \u2026 is not supported\")\n    }"

    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 39
    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/ContentModel;)Lcom/ibotta/android/views/content/row/ContentImageViewState;
    .locals 15
    .param p1    # Lcom/ibotta/api/model/ContentModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentModel"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v2, Lcom/ibotta/android/content/ContentImageReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 25
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/views/content/row/ContentImageViewState;

    .line 26
    invoke-direct/range {p0 .. p1}, Lcom/ibotta/android/content/ContentImageReducer;->getImageUrl(Lcom/ibotta/api/model/ContentModel;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 29
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_OFFER_ROW:Lcom/ibotta/android/views/images/Sizes;

    move-object v3, v1

    check-cast v3, Lcom/ibotta/android/images/ImageCache$Size;

    .line 30
    sget v6, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    .line 31
    sget v7, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    move-object v1, v0

    .line 25
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/content/row/ContentImageViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;ZZII)V

    goto :goto_0

    .line 17
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/views/content/row/ContentImageViewState;

    .line 18
    invoke-direct/range {p0 .. p1}, Lcom/ibotta/android/content/ContentImageReducer;->getImageUrl(Lcom/ibotta/api/model/ContentModel;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x1

    const/4 v12, 0x0

    .line 21
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_RETAILER_ROW:Lcom/ibotta/android/views/images/Sizes;

    move-object v10, v1

    check-cast v10, Lcom/ibotta/android/images/ImageCache$Size;

    .line 22
    sget v13, Lcom/ibotta/android/reducers/R$dimen;->size_7:I

    .line 23
    sget v14, Lcom/ibotta/android/reducers/R$dimen;->size_8:I

    move-object v8, v0

    .line 17
    invoke-direct/range {v8 .. v14}, Lcom/ibotta/android/views/content/row/ContentImageViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;ZZII)V

    :goto_0
    return-object v0

    .line 33
    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not supported"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
