.class public Lcom/ibotta/android/features/variant/search/SearchIncludesProductsVariant;
.super Ljava/lang/Object;
.source "SearchIncludesProductsVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/search/SearchProductsVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public populateProductContentType(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;)V"
        }
    .end annotation

    .line 16
    sget-object v0, Lcom/ibotta/android/graphql/search/SearchContentType;->PRODUCT:Lcom/ibotta/android/graphql/search/SearchContentType;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
