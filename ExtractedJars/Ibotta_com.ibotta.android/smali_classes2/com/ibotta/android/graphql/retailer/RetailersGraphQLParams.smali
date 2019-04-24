.class public abstract Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;
.super Ljava/lang/Object;
.source "RetailersGraphQLParams.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/util/List;Z)Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;"
        }
    .end annotation

    .line 13
    new-instance v0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;-><init>(Ljava/util/List;Z)V

    return-object v0
.end method


# virtual methods
.method abstract getRetailerIds()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method abstract isNearbyOnly()Z
.end method
