.class final Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;
.super Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
.source "AutoValue_SuggestedSearchItem.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private highlights:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;"
        }
    .end annotation
.end field

.field private searchTerm:Ljava/lang/String;

.field private searchType:Lcom/ibotta/api/model/search/SearchType;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/search/SuggestedSearchItem;
    .locals 5

    const-string v0, ""

    .line 107
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->searchTerm:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchTerm"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 110
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->searchType:Lcom/ibotta/api/model/search/SearchType;

    if-nez v1, :cond_1

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->highlights:Ljava/util/List;

    if-nez v1, :cond_2

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " highlights"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 116
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 119
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->searchTerm:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->searchType:Lcom/ibotta/api/model/search/SearchType;

    iget-object v3, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->highlights:Ljava/util/List;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/util/List;Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$1;)V

    return-object v0

    .line 117
    :cond_3
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

.method public highlights(Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;)",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->highlights:Ljava/util/List;

    return-object p0

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null highlights"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public searchTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 85
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->searchTerm:Ljava/lang/String;

    return-object p0

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null searchTerm"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public searchType(Lcom/ibotta/api/model/search/SearchType;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 93
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;->searchType:Lcom/ibotta/api/model/search/SearchType;

    return-object p0

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null searchType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
