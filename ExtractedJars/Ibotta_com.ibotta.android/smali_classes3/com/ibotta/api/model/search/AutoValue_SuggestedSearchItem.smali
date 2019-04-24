.class final Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;
.super Lcom/ibotta/api/model/search/SuggestedSearchItem;
.source "AutoValue_SuggestedSearchItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;
    }
.end annotation


# instance fields
.field private final highlights:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;"
        }
    .end annotation
.end field

.field private final searchTerm:Ljava/lang/String;

.field private final searchType:Lcom/ibotta/api/model/search/SearchType;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/search/SearchType;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/model/search/SuggestedSearchItem;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchTerm:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchType:Lcom/ibotta/api/model/search/SearchType;

    .line 21
    iput-object p3, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->highlights:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/util/List;Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 53
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/search/SuggestedSearchItem;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 54
    check-cast p1, Lcom/ibotta/api/model/search/SuggestedSearchItem;

    .line 55
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchTerm:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchType:Lcom/ibotta/api/model/search/SearchType;

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchType()Lcom/ibotta/api/model/search/SearchType;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/search/SearchType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->highlights:Ljava/util/List;

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getHighlights()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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

.method public getHighlights()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->highlights:Ljava/util/List;

    return-object v0
.end method

.method public getSearchTerm()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchTerm:Ljava/lang/String;

    return-object v0
.end method

.method public getSearchType()Lcom/ibotta/api/model/search/SearchType;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchType:Lcom/ibotta/api/model/search/SearchType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchTerm:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 68
    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchType:Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {v2}, Lcom/ibotta/api/model/search/SearchType;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 70
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->highlights:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SuggestedSearchItem{searchTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", searchType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->searchType:Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", highlights="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;->highlights:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
