.class public Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;
.super Ljava/lang/Object;
.source "RetailerCategoryNodeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IconUrl"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    .line 249
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 250
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "url"

    const-string v2, "url"

    .line 251
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 265
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->__typename:Ljava/lang/String;

    .line 266
    iput-object p2, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 306
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 307
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    .line 308
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    .line 309
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 316
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 321
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 322
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$hashCode:I

    const/4 v0, 0x1

    .line 323
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$hashCodeMemoized:Z

    .line 325
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 281
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IconUrl{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$toString:Ljava/lang/String;

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url:Ljava/lang/String;

    return-object v0
.end method
