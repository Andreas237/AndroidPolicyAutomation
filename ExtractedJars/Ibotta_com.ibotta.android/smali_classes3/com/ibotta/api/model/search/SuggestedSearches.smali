.class public abstract Lcom/ibotta/api/model/search/SuggestedSearches;
.super Ljava/lang/Object;
.source "SuggestedSearches.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/api/model/search/SuggestedSearches;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, ""

    .line 14
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/model/search/SuggestedSearches;->EMPTY:Lcom/ibotta/api/model/search/SuggestedSearches;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem;",
            ">;)",
            "Lcom/ibotta/api/model/search/SuggestedSearches;"
        }
    .end annotation

    .line 20
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearches;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearches;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract getSearchQuery()Ljava/lang/String;
.end method

.method public abstract getSuggestedSearchItems()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem;",
            ">;"
        }
    .end annotation
.end method
