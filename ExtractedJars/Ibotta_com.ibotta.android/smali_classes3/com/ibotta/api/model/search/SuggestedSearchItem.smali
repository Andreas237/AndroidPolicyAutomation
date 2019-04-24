.class public abstract Lcom/ibotta/api/model/search/SuggestedSearchItem;
.super Ljava/lang/Object;
.source "SuggestedSearchItem.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
    .locals 1

    .line 18
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/search/AutoValue_SuggestedSearchItem$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getHighlights()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSearchTerm()Ljava/lang/String;
.end method

.method public abstract getSearchType()Lcom/ibotta/api/model/search/SearchType;
.end method
