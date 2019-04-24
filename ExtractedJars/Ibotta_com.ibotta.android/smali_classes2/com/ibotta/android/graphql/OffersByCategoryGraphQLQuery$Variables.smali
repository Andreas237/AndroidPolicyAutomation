.class public final Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "OffersByCategoryGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final categoryLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final contentMax:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final includeAvailableRetailers:Z

.field private final products:Z

.field private final retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;ZZ)V"
        }
    .end annotation

    .line 185
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 182
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 186
    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 187
    iput-object p2, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    .line 188
    iput-object p3, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    .line 189
    iput-boolean p4, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->products:Z

    .line 190
    iput-boolean p5, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->includeAvailableRetailers:Z

    .line 191
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "retailerId"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 195
    iget-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "categoryLimit"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    :cond_1
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 198
    iget-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "contentMax"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    iget-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 171
    iget-object p0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 171
    iget-object p0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 171
    iget-object p0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Z
    .locals 0

    .line 171
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Z
    .locals 0

    .line 171
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
.method public categoryLimit()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public contentMax()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public includeAvailableRetailers()Z
    .locals 1

    .line 221
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->includeAvailableRetailers:Z

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 231
    new-instance v0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->products:Z

    return v0
.end method

.method public retailerId()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

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

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
