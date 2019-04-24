.class public Lcom/ibotta/android/features/variant/search/SearchExcludesProductsVariant;
.super Ljava/lang/Object;
.source "SearchExcludesProductsVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/search/SearchProductsVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public populateProductContentType(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
