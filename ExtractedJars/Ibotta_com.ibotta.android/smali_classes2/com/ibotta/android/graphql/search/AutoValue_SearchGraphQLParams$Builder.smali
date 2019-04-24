.class final Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;
.super Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.source "AutoValue_SearchGraphQLParams.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private correctSpelling:Ljava/lang/Boolean;

.field private fetchRelatedOffers:Ljava/lang/Boolean;

.field private relatedOfferResultLimit:Ljava/lang/Long;

.field private retailerId:Ljava/lang/Long;

.field private searchContentType:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;"
        }
    .end annotation
.end field

.field private searchResultLimit:Ljava/lang/Long;

.field private term:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 132
    invoke-direct {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/search/SearchGraphQLParams;
    .locals 13

    const-string v0, ""

    .line 178
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->term:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " term"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 181
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->searchResultLimit:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchResultLimit"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 184
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->relatedOfferResultLimit:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " relatedOfferResultLimit"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 187
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->fetchRelatedOffers:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " fetchRelatedOffers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 190
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->correctSpelling:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " correctSpelling"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 193
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->searchContentType:Ljava/util/Set;

    if-nez v1, :cond_5

    .line 194
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchContentType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 196
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 199
    new-instance v0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;

    iget-object v3, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->term:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->searchResultLimit:Ljava/lang/Long;

    .line 201
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->relatedOfferResultLimit:Ljava/lang/Long;

    .line 202
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->fetchRelatedOffers:Ljava/lang/Boolean;

    .line 203
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->correctSpelling:Ljava/lang/Boolean;

    .line 204
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v10, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->retailerId:Ljava/lang/Long;

    iget-object v11, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->searchContentType:Ljava/util/Set;

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;-><init>(Ljava/lang/String;JJZZLjava/lang/Long;Ljava/util/Set;Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$1;)V

    return-object v0

    .line 197
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public correctSpelling(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 0

    .line 159
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->correctSpelling:Ljava/lang/Boolean;

    return-object p0
.end method

.method public fetchRelatedOffers(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 0

    .line 154
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->fetchRelatedOffers:Ljava/lang/Boolean;

    return-object p0
.end method

.method public relatedOfferResultLimit(J)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 0

    .line 149
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->relatedOfferResultLimit:Ljava/lang/Long;

    return-object p0
.end method

.method public retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 164
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->retailerId:Ljava/lang/Long;

    return-object p0
.end method

.method public searchContentType(Ljava/util/Set;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 172
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->searchContentType:Ljava/util/Set;

    return-object p0

    .line 170
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null searchContentType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public searchResultLimit(J)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 0

    .line 144
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->searchResultLimit:Ljava/lang/Long;

    return-object p0
.end method

.method public term(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 139
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->term:Ljava/lang/String;

    return-object p0

    .line 137
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null term"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
