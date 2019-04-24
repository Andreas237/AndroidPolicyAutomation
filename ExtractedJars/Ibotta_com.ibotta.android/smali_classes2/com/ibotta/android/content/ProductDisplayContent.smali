.class public final Lcom/ibotta/android/content/ProductDisplayContent;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/content/ProductDisplayContent;",
        "Lcom/ibotta/android/content/DisplayContent;",
        "productModel",
        "Lcom/ibotta/api/model/ProductModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)V",
        "contentModel",
        "getContentModel",
        "()Lcom/ibotta/api/model/ProductModel;",
        "getContentStyle",
        "()Lcom/ibotta/android/views/content/ContentStyle;",
        "getProductModel",
        "component1",
        "component2",
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
.field private final contentModel:Lcom/ibotta/api/model/ProductModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final contentStyle:Lcom/ibotta/android/views/content/ContentStyle;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final productModel:Lcom/ibotta/api/model/ProductModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)V
    .locals 1
    .param p1    # Lcom/ibotta/api/model/ProductModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "productModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, v0}, Lcom/ibotta/android/content/DisplayContent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    iput-object p2, p0, Lcom/ibotta/android/content/ProductDisplayContent;->contentStyle:Lcom/ibotta/android/views/content/ContentStyle;

    .line 53
    iget-object p1, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    iput-object p1, p0, Lcom/ibotta/android/content/ProductDisplayContent;->contentModel:Lcom/ibotta/api/model/ProductModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/content/ProductDisplayContent;Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;ILjava/lang/Object;)Lcom/ibotta/android/content/ProductDisplayContent;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/content/ProductDisplayContent;->copy(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/ProductDisplayContent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/ibotta/api/model/ProductModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    return-object v0
.end method

.method public final component2()Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/ProductDisplayContent;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/ProductModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "productModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/content/ProductDisplayContent;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/content/ProductDisplayContent;-><init>(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/content/ProductDisplayContent;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/content/ProductDisplayContent;

    iget-object v0, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    iget-object v1, p1, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

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

.method public bridge synthetic getContentModel()Lcom/ibotta/api/model/ContentModel;
    .locals 1

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentModel()Lcom/ibotta/api/model/ProductModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/ContentModel;

    return-object v0
.end method

.method public getContentModel()Lcom/ibotta/api/model/ProductModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/content/ProductDisplayContent;->contentModel:Lcom/ibotta/api/model/ProductModel;

    return-object v0
.end method

.method public getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/content/ProductDisplayContent;->contentStyle:Lcom/ibotta/android/views/content/ContentStyle;

    return-object v0
.end method

.method public final getProductModel()Lcom/ibotta/api/model/ProductModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProductDisplayContent(productModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/content/ProductDisplayContent;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/content/ProductDisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
