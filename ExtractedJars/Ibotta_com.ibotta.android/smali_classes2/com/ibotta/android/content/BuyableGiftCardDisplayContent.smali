.class public final Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;
.super Lcom/ibotta/android/content/DisplayContent;
.source "DisplayContent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;",
        "Lcom/ibotta/android/content/DisplayContent;",
        "buyableGiftCardModel",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V",
        "getBuyableGiftCardModel",
        "()Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "contentModel",
        "getContentModel",
        "getContentStyle",
        "()Lcom/ibotta/android/views/content/ContentStyle;",
        "getRetailerModel",
        "()Lcom/ibotta/api/model/RetailerModel;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final contentModel:Lcom/ibotta/api/model/BuyableGiftCardModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final contentStyle:Lcom/ibotta/android/views/content/ContentStyle;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V
    .locals 1
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "buyableGiftCardModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, v0}, Lcom/ibotta/android/content/DisplayContent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iput-object p2, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iput-object p3, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->contentStyle:Lcom/ibotta/android/views/content/ContentStyle;

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iput-object p1, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->contentModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;ILjava/lang/Object;)Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->copy(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    return-object v0
.end method

.method public final component2()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public final component3()Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "buyableGiftCardModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;-><init>(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iget-object v1, p1, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v1, p1, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getBuyableGiftCardModel()Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    return-object v0
.end method

.method public getContentModel()Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->contentModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    return-object v0
.end method

.method public bridge synthetic getContentModel()Lcom/ibotta/api/model/ContentModel;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentModel()Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/ContentModel;

    return-object v0
.end method

.method public getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->contentStyle:Lcom/ibotta/android/views/content/ContentStyle;

    return-object v0
.end method

.method public final getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuyableGiftCardDisplayContent(buyableGiftCardModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
