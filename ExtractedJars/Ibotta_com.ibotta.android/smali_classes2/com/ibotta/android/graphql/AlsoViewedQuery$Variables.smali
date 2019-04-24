.class public final Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "AlsoViewedQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/AlsoViewedQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
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

.field private final limitStrategy:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
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
.method constructor <init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;ZZ)V"
        }
    .end annotation

    .line 195
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 192
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    .line 196
    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->id:Ljava/lang/String;

    .line 197
    iput-object p2, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 198
    iput-object p3, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    .line 199
    iput-object p4, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    .line 200
    iput-boolean p5, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->products:Z

    .line 201
    iput-boolean p6, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->includeAvailableRetailers:Z

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_0

    .line 204
    iget-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "retailerId"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    :cond_0
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 207
    iget-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "limit"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    :cond_1
    iget-boolean p1, p4, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 210
    iget-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "limitStrategy"

    iget-object p3, p4, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    iget-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)Ljava/lang/String;
    .locals 0

    .line 179
    iget-object p0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->id:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 179
    iget-object p0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 179
    iget-object p0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 179
    iget-object p0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)Z
    .locals 0

    .line 179
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)Z
    .locals 0

    .line 179
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->id:Ljava/lang/String;

    return-object v0
.end method

.method public includeAvailableRetailers()Z
    .locals 1

    .line 237
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->includeAvailableRetailers:Z

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

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public limitStrategy()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;"
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 247
    new-instance v0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;)V

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 233
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->products:Z

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

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

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

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
