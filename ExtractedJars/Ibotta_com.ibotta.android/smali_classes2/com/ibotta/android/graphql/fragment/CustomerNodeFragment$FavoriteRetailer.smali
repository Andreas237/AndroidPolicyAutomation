.class public Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;
.super Ljava/lang/Object;
.source "CustomerNodeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FavoriteRetailer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;,
        Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;
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

.field private final fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    .line 140
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 141
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "__typename"

    const-string v2, "__typename"

    const-string v3, "CustomerFavoriteRetailer"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseField;->forFragment(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 156
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->__typename:Ljava/lang/String;

    const-string p1, "fragments == null"

    .line 157
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;
    .locals 0

    .line 139
    iget-object p0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    return-object p0
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 194
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 195
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;

    .line 196
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    .line 197
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public fragments()Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 204
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 209
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 210
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$hashCode:I

    const/4 v0, 0x1

    .line 211
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$hashCodeMemoized:Z

    .line 213
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 169
    new-instance v0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$1;-><init>(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FavoriteRetailer{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fragments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$toString:Ljava/lang/String;

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->$toString:Ljava/lang/String;

    return-object v0
.end method
