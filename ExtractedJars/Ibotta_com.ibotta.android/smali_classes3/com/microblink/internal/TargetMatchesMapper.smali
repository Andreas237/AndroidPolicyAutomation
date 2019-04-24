.class public final Lcom/microblink/internal/TargetMatchesMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/List<",
        "Lcom/microblink/Product;",
        ">;",
        "Lcom/microblink/OcrResult;",
        ">;"
    }
.end annotation


# instance fields
.field private searchTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/TargetMatchesMapper;->searchTargets:Ljava/util/List;

    return-void
.end method

.method private matchesSearchTarget(Lcom/microblink/Product;Ljava/util/List;)Z
    .locals 3
    .param p1    # Lcom/microblink/Product;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/Product;",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)Z"
        }
    .end annotation

    if-eqz p2, :cond_4

    invoke-static {p2}, Lcom/microblink/internal/Utility;->isEmpty(Ljava/lang/Iterable;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/Product;

    invoke-virtual {v0}, Lcom/microblink/Product;->productNumber()Lcom/microblink/StringType;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lcom/microblink/Product;->productNumber()Lcom/microblink/StringType;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    invoke-virtual {v0}, Lcom/microblink/Product;->description()Lcom/microblink/StringType;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lcom/microblink/Product;->description()Lcom/microblink/StringType;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    invoke-virtual {v0}, Lcom/microblink/Product;->quantity()Lcom/microblink/FloatType;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-lez v1, :cond_3

    invoke-virtual {p1}, Lcom/microblink/Product;->quantity()Lcom/microblink/FloatType;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/OcrResult;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/TargetMatchesMapper;->transform(Lcom/microblink/OcrResult;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final transform(Lcom/microblink/OcrResult;)Ljava/util/List;
    .locals 6
    .param p1    # Lcom/microblink/OcrResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OcrResult;",
            ")",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lcom/microblink/OcrResult;->products:[Lcom/microblink/internal/OcrProduct;

    if-eqz v1, :cond_1

    array-length v1, v1

    if-lez v1, :cond_1

    new-instance v1, Lcom/microblink/internal/ProductMapper;

    invoke-direct {v1}, Lcom/microblink/internal/ProductMapper;-><init>()V

    iget-object p1, p1, Lcom/microblink/OcrResult;->products:[Lcom/microblink/internal/OcrProduct;

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Lcom/microblink/internal/ProductMapper;->transform(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Product;

    move-result-object v4

    iget-object v5, p0, Lcom/microblink/internal/TargetMatchesMapper;->searchTargets:Ljava/util/List;

    invoke-direct {p0, v4, v5}, Lcom/microblink/internal/TargetMatchesMapper;->matchesSearchTarget(Lcom/microblink/Product;Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
