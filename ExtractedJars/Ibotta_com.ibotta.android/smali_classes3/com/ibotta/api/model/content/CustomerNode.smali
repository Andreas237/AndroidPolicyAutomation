.class public abstract Lcom/ibotta/api/model/content/CustomerNode;
.super Ljava/lang/Object;
.source "CustomerNode.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/content/CustomerNode$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/content/CustomerNode$Builder;
    .locals 2

    .line 14
    new-instance v0, Lcom/ibotta/api/model/content/AutoValue_CustomerNode$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/AutoValue_CustomerNode$Builder;-><init>()V

    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/AutoValue_CustomerNode$Builder;->favoriteRetailers(Ljava/util/List;)Lcom/ibotta/api/model/content/CustomerNode$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getFavoriteRetailers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerContent;",
            ">;"
        }
    .end annotation
.end method
