.class final Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;
.super Lcom/ibotta/api/model/search/SearchResults$Builder;
.source "AutoValue_SearchResults.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/search/AutoValue_SearchResults;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private hasExactResults:Ljava/lang/Boolean;

.field private misspellingState:Lcom/ibotta/api/model/search/Misspelling;

.field private offerTagResults:Ljava/lang/Boolean;

.field private retailerId:Ljava/lang/Integer;

.field private searchModules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation
.end field

.field private searchedTerm:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Lcom/ibotta/api/model/search/SearchResults$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/search/SearchResults;
    .locals 10

    const-string v0, ""

    .line 164
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->searchedTerm:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchedTerm"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 167
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    if-nez v1, :cond_1

    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " misspellingState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 170
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->searchModules:Ljava/util/List;

    if-nez v1, :cond_2

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchModules"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 173
    :cond_2
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->offerTagResults:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    .line 174
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " offerTagResults"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 176
    :cond_3
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->hasExactResults:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " hasExactResults"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 179
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 182
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;

    iget-object v3, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->searchedTerm:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->retailerId:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    iget-object v6, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->searchModules:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->offerTagResults:Ljava/lang/Boolean;

    .line 187
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->hasExactResults:Ljava/lang/Boolean;

    .line 188
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/api/model/search/AutoValue_SearchResults;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;ZZLcom/ibotta/api/model/search/AutoValue_SearchResults$1;)V

    return-object v0

    .line 180
    :cond_5
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

.method public hasExactResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 0

    .line 158
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->hasExactResults:Ljava/lang/Boolean;

    return-object p0
.end method

.method public misspellingState(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 140
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    return-object p0

    .line 138
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null misspellingState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public offerTagResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 0

    .line 153
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->offerTagResults:Ljava/lang/Boolean;

    return-object p0
.end method

.method public retailerId(Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 132
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public searchModules(Ljava/util/List;)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;)",
            "Lcom/ibotta/api/model/search/SearchResults$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 148
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->searchModules:Ljava/util/List;

    return-object p0

    .line 146
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null searchModules"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public searchedTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 127
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;->searchedTerm:Ljava/lang/String;

    return-object p0

    .line 125
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null searchedTerm"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
