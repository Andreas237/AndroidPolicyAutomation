.class public Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;
.super Ljava/lang/Object;
.source "CurrentSocialBonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final currentSocialBonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    .line 102
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "currentSocialBonuses"

    const-string v3, "currentSocialBonuses"

    .line 103
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v0, v4}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse;",
            ">;)V"
        }
    .end annotation

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public currentSocialBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 155
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 156
    check-cast p1, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;

    .line 157
    iget-object v1, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 164
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    const v0, 0xf4243

    .line 167
    iget-object v1, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 168
    iput v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 169
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$hashCodeMemoized:Z

    .line 171
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 127
    new-instance v0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{currentSocialBonuses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->currentSocialBonuses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$toString:Ljava/lang/String;

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
