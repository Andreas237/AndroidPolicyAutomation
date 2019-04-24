.class public Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerNodeMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;",
        "Lcom/ibotta/api/model/content/RetailerContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method

.method static synthetic lambda$map$0(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;)Ljava/lang/String;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->url()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 25
    :cond_0
    new-instance v1, Lcom/ibotta/api/model/content/RetailerContent;

    invoke-direct {v1}, Lcom/ibotta/api/model/content/RetailerContent;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;->asInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setId(I)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setName(Ljava/lang/String;)V

    .line 28
    sget-object v2, Lcom/ibotta/api/model/ContentModel$Type;->RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v2}, Lcom/ibotta/api/model/ContentModel$Type;->getApiName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setType(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage()Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    move-result-object v2

    invoke-static {v2}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerNodeMapper$dJ9VBYAb0nq2Je8gLsq0AlsrHC0;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerNodeMapper$dJ9VBYAb0nq2Je8gLsq0AlsrHC0;

    .line 30
    invoke-virtual {v2, v3}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v2

    const-string v3, ""

    .line 31
    invoke-virtual {v2, v3}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 29
    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setModelCImageUrl(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :cond_1
    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/content/RetailerContent;->setDistance(Ljava/lang/Float;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/api/model/content/RetailerContent;->setVerificationType(Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 13
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method
