.class public abstract Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
.super Ljava/lang/Object;
.source "SuggestedSearchItem.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/search/SuggestedSearchItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/search/SuggestedSearchItem;
.end method

.method public abstract highlights(Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;)",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;"
        }
    .end annotation
.end method

.method public abstract searchTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
.end method

.method public abstract searchType(Lcom/ibotta/api/model/search/SearchType;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;
.end method
