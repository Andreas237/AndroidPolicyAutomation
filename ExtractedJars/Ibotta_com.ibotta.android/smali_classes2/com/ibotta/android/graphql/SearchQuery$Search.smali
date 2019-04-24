.class public Lcom/ibotta/android/graphql/SearchQuery$Search;
.super Ljava/lang/Object;
.source "SearchQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/SearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Search"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/SearchQuery$Search$Mapper;
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

.field final misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/SearchQuery$Result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    .line 682
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 683
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "results"

    const-string v2, "results"

    .line 684
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "misspelling"

    const-string v2, "misspelling"

    .line 685
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/graphql/SearchQuery$Misspelling;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/graphql/SearchQuery$Misspelling;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/SearchQuery$Result;",
            ">;",
            "Lcom/ibotta/android/graphql/SearchQuery$Misspelling;",
            ")V"
        }
    .end annotation

    .line 701
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 702
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->__typename:Ljava/lang/String;

    .line 703
    iput-object p2, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    .line 704
    iput-object p3, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 708
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 752
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Search;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 753
    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Search;

    .line 754
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/SearchQuery$Search;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    .line 755
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    .line 756
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 763
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 766
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 768
    iget-object v2, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 770
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    .line 771
    iput v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$hashCode:I

    const/4 v0, 0x1

    .line 772
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$hashCodeMemoized:Z

    .line 774
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 720
    new-instance v0, Lcom/ibotta/android/graphql/SearchQuery$Search$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/SearchQuery$Search$1;-><init>(Lcom/ibotta/android/graphql/SearchQuery$Search;)V

    return-object v0
.end method

.method public misspelling()Lcom/ibotta/android/graphql/SearchQuery$Misspelling;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 716
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    return-object v0
.end method

.method public results()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/SearchQuery$Result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 712
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 737
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 738
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Search{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", results="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->results:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", misspelling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->misspelling:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$toString:Ljava/lang/String;

    .line 744
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Search;->$toString:Ljava/lang/String;

    return-object v0
.end method
