.class public Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "PersonalizationCategoriesResponse.java"


# instance fields
.field private categoryPages:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pages"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/personalization/CategoryPage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;->categoryPages:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getCategoryPages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/personalization/CategoryPage;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;->categoryPages:Ljava/util/List;

    return-object v0
.end method

.method public setCategoryPages(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/personalization/CategoryPage;",
            ">;)V"
        }
    .end annotation

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesResponse;->categoryPages:Ljava/util/List;

    return-void
.end method
