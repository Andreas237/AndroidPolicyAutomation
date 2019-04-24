.class public final Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "RecentlyViewedRetailersQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final limit:J

.field private final limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final transient valueMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(JLcom/ibotta/android/graphql/type/LimitStrategy;)V
    .locals 2
    .param p3    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 141
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 139
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->valueMap:Ljava/util/Map;

    .line 142
    iput-wide p1, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->limit:J

    .line 143
    iput-object p3, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "limit"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    iget-object p1, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "limitStrategy"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;)J
    .locals 2

    .line 134
    iget-wide v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->limit:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;)Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 0

    .line 134
    iget-object p0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object p0
.end method


# virtual methods
.method public limit()J
    .locals 2

    .line 149
    iget-wide v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->limit:J

    return-wide v0
.end method

.method public limitStrategy()Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 163
    new-instance v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;)V

    return-object v0
.end method

.method public valueMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
