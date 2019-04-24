.class public final Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;
.super Ljava/lang/Object;
.source "RecentlyViewedRetailersQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private limit:J

.field private limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;
    .locals 4

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    const-string v1, "limitStrategy == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    new-instance v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limit:J

    iget-object v3, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;-><init>(JLcom/ibotta/android/graphql/type/LimitStrategy;)V

    return-object v0
.end method

.method public limit(J)Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;
    .locals 0

    .line 119
    iput-wide p1, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limit:J

    return-object p0
.end method

.method public limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 124
    iput-object p1, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object p0
.end method
