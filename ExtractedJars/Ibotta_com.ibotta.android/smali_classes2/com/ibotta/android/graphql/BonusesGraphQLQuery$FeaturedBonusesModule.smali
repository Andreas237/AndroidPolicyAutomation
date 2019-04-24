.class public Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FeaturedBonusesModule"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;
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

.field final content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x2

    .line 756
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "__typename"

    const-string v3, "__typename"

    .line 757
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v6, v5, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v2

    aput-object v2, v1, v5

    const-string v2, "content"

    const-string v3, "content"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "limit"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v0, "kind"

    const-string v8, "Variable"

    .line 760
    invoke-virtual {v7, v0, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    const-string v7, "variableName"

    const-string v8, "featuredLimit"

    .line 761
    invoke-virtual {v0, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 762
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    .line 759
    invoke-virtual {v4, v6, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 763
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 758
    invoke-static {v2, v3, v0, v5, v4}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    aput-object v0, v1, v5

    sput-object v1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;",
            ">;)V"
        }
    .end annotation

    .line 776
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 777
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->__typename:Ljava/lang/String;

    .line 778
    iput-object p2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 782
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public content()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 786
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 820
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 821
    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    .line 822
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object p1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    .line 823
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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

    .line 830
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    .line 833
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 835
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 836
    iput v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$hashCode:I

    const/4 v0, 0x1

    .line 837
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$hashCodeMemoized:Z

    .line 839
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 790
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$1;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 806
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 807
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FeaturedBonusesModule{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->content:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$toString:Ljava/lang/String;

    .line 812
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->$toString:Ljava/lang/String;

    return-object v0
.end method
