.class public final Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;
.super Ljava/lang/Object;
.source "OfferTagSearchQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferTagSearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private includeAvailableRetailers:Z

.field private name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private products:Z


# direct methods
.method constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/OfferTagSearchQuery;
    .locals 4

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->name:Ljava/lang/String;

    const-string v1, "name == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    new-instance v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->name:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->products:Z

    iget-boolean v3, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->includeAvailableRetailers:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/OfferTagSearchQuery;-><init>(Ljava/lang/String;ZZ)V

    return-object v0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;
    .locals 0

    .line 129
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 119
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;
    .locals 0

    .line 124
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->products:Z

    return-object p0
.end method
