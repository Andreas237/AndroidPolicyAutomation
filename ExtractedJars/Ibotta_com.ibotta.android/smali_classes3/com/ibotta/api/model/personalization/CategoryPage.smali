.class public Lcom/ibotta/api/model/personalization/CategoryPage;
.super Ljava/lang/Object;
.source "CategoryPage.java"


# instance fields
.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/personalization/PersonalizationCategory;",
            ">;"
        }
    .end annotation
.end field

.field private message:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/personalization/PersonalizationCategory;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/personalization/CategoryPage;->categories:Ljava/util/List;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/personalization/CategoryPage;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/model/personalization/CategoryPage;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setCategories(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/personalization/PersonalizationCategory;",
            ">;)V"
        }
    .end annotation

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/personalization/CategoryPage;->categories:Ljava/util/List;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/model/personalization/CategoryPage;->message:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/model/personalization/CategoryPage;->title:Ljava/lang/String;

    return-void
.end method
