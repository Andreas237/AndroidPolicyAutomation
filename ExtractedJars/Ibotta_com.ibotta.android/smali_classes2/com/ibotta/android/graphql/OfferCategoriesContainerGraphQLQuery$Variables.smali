.class public final Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "OfferCategoriesContainerGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final contentMax:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final contentMin:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final includeAvailableRetailers:Z

.field private final limit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
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
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;ZZ)V"
        }
    .end annotation

    .line 226
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 223
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 227
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 228
    iput-object p2, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    .line 229
    iput-object p3, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->contentMin:Lcom/apollographql/apollo/api/Input;

    .line 230
    iput-object p4, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    .line 231
    iput-boolean p5, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->products:Z

    .line 232
    iput-boolean p6, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->includeAvailableRetailers:Z

    .line 233
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "retailerId"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 237
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "limit"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    :cond_1
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 240
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "contentMin"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    :cond_2
    iget-boolean p1, p4, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_3

    .line 243
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "contentMax"

    iget-object p3, p4, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 210
    iget-object p0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 210
    iget-object p0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 210
    iget-object p0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->contentMin:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 210
    iget-object p0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)Z
    .locals 0

    .line 210
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)Z
    .locals 0

    .line 210
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
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

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public contentMin()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->contentMin:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public includeAvailableRetailers()Z
    .locals 1

    .line 270
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->includeAvailableRetailers:Z

    return v0
.end method

.method public limit()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 280
    new-instance v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 266
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->products:Z

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

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

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

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
