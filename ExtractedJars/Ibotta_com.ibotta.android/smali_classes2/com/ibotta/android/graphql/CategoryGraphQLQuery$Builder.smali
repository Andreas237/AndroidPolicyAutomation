.class public final Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "CategoryGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/CategoryGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private categoryId:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private contentMax:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private includeAvailableRetailers:Z

.field private products:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/CategoryGraphQLQuery;
    .locals 5

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->categoryId:Ljava/lang/String;

    const-string v1, "categoryId == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    new-instance v0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->categoryId:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    iget-boolean v3, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->products:Z

    iget-boolean v4, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->includeAvailableRetailers:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery;-><init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v0
.end method

.method public categoryId(Ljava/lang/String;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 122
    iput-object p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->categoryId:Ljava/lang/String;

    return-object p0
.end method

.method public contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 127
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentMaxInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "contentMax == null"

    .line 142
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;
    .locals 0

    .line 137
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;
    .locals 0

    .line 132
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->products:Z

    return-object p0
.end method
