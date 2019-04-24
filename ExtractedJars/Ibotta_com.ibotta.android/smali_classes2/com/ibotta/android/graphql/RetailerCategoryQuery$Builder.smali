.class public final Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
.super Ljava/lang/Object;
.source "RetailerCategoryQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailerCategoryQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private categoryIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private customerId:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private includeFullResponse:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    .line 121
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/RetailerCategoryQuery;
    .locals 5

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->customerId:Ljava/lang/String;

    const-string v1, "customerId == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryIds:Ljava/util/List;

    const-string v1, "categoryIds == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->customerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryIds:Ljava/util/List;

    iget-object v3, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    iget-object v4, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/graphql/RetailerCategoryQuery;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    return-object v0
.end method

.method public categoryIds(Ljava/util/List;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;"
        }
    .end annotation

    .line 132
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryIds:Ljava/util/List;

    return-object p0
.end method

.method public categoryRetailersLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 142
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public categoryRetailersLimitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
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
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;"
        }
    .end annotation

    const-string v0, "categoryRetailersLimit == null"

    .line 152
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public customerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 127
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->customerId:Ljava/lang/String;

    return-object p0
.end method

.method public includeFullResponse(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 137
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public includeFullResponseInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;"
        }
    .end annotation

    const-string v0, "includeFullResponse == null"

    .line 147
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
