.class public final Lcom/ibotta/android/graphql/SearchQuery$Builder;
.super Ljava/lang/Object;
.source "SearchQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/SearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private contentTypes:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private correctSpelling:Z

.field private fetchRelatedOffers:Z

.field private includeAvailableRetailers:Z

.field private products:Z

.field private relatedLimit:J

.field private retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private searchLimit:J

.field private term:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->term:Lcom/apollographql/apollo/api/Input;

    .line 158
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 160
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->contentTypes:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/SearchQuery;
    .locals 13

    .line 232
    new-instance v12, Lcom/ibotta/android/graphql/SearchQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->term:Lcom/apollographql/apollo/api/Input;

    iget-boolean v2, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->correctSpelling:Z

    iget-wide v3, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->searchLimit:J

    iget-wide v5, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->relatedLimit:J

    iget-object v7, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    iget-object v8, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->contentTypes:Lcom/apollographql/apollo/api/Input;

    iget-boolean v9, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->products:Z

    iget-boolean v10, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->fetchRelatedOffers:Z

    iget-boolean v11, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->includeAvailableRetailers:Z

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/ibotta/android/graphql/SearchQuery;-><init>(Lcom/apollographql/apollo/api/Input;ZJJLcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZZ)V

    return-object v12
.end method

.method public contentTypes(Ljava/util/List;)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/SearchQuery$Builder;"
        }
    .end annotation

    .line 197
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->contentTypes:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentTypesInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/ibotta/android/graphql/SearchQuery$Builder;"
        }
    .end annotation

    const-string v0, "contentTypes == null"

    .line 227
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->contentTypes:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public correctSpelling(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0

    .line 177
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->correctSpelling:Z

    return-object p0
.end method

.method public fetchRelatedOffers(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0

    .line 207
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->fetchRelatedOffers:Z

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0

    .line 212
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0

    .line 202
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->products:Z

    return-object p0
.end method

.method public relatedLimit(J)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0

    .line 187
    iput-wide p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->relatedLimit:J

    return-object p0
.end method

.method public retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 192
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/SearchQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerId == null"

    .line 222
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public searchLimit(J)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0

    .line 182
    iput-wide p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->searchLimit:J

    return-object p0
.end method

.method public term(Ljava/lang/String;)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 172
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->term:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public termInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/SearchQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/SearchQuery$Builder;"
        }
    .end annotation

    const-string v0, "term == null"

    .line 217
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Builder;->term:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
