.class public Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;
.super Ljava/lang/Object;
.source "CustomerFavoriteRetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;,
        Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment CustomerFavoriteRetailerFragment on CustomerFavoriteRetailer {\n  __typename\n  retailerId\n  favoriteDate\n  sortOrder\n  retailer {\n    __typename\n    ...RetailerNodeFragment\n  }\n}"

.field public static final POSSIBLE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final favoriteDate:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailerId:J

.field final sortOrder:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x5

    .line 24
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "retailerId"

    const-string v2, "retailerId"

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "favoriteDate"

    const-string v3, "favoriteDate"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "sortOrder"

    const-string v3, "sortOrder"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "retailer"

    const-string v3, "retailer"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "CustomerFavoriteRetailer"

    .line 43
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 63
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    .line 64
    iput-wide p2, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    .line 65
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    .line 66
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    .line 67
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 134
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 135
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-wide v3, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    iget-wide v5, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    .line 138
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    .line 139
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    if-nez v1, :cond_3

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    .line 140
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public favoriteDate()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 147
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_3

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    int-to-long v2, v0

    .line 152
    iget-wide v4, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    xor-long/2addr v2, v4

    long-to-int v0, v2

    mul-int v0, v0, v1

    .line 154
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 156
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 158
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    .line 159
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 160
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$hashCodeMemoized:Z

    .line 162
    :cond_3
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 103
    new-instance v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;)V

    return-object v0
.end method

.method public retailer()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    return-object v0
.end method

.method public retailerId()J
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    return-wide v0
.end method

.method public sortOrder()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CustomerFavoriteRetailerFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", favoriteDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sortOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$toString:Ljava/lang/String;

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method
