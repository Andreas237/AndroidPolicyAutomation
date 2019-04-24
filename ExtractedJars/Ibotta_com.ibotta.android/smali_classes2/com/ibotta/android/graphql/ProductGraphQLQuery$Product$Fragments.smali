.class public Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;
.super Ljava/lang/Object;
.source "ProductGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/ProductFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/ProductFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "productFragment == null"

    .line 313
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 347
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;

    if-eqz v0, :cond_1

    .line 348
    check-cast p1, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;

    .line 349
    iget-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 356
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 359
    iget-object v1, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 360
    iput v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 361
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$hashCodeMemoized:Z

    .line 363
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 321
    new-instance v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments$1;-><init>(Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;)V

    return-object v0
.end method

.method public productFragment()Lcom/ibotta/android/graphql/fragment/ProductFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{productFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$toString:Ljava/lang/String;

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
