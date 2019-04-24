.class public final Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "ViewedOfferMutation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ViewedOfferMutation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final includeAvailableRetailers:Z

.field private final limit:J

.field private final limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final offerGroupId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final offerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final products:Z

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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;JLcom/ibotta/android/graphql/type/LimitStrategy;ZZ)V
    .locals 2
    .param p5    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            "ZZ)V"
        }
    .end annotation

    .line 188
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 185
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    .line 189
    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->offerId:Lcom/apollographql/apollo/api/Input;

    .line 190
    iput-object p2, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    .line 191
    iput-wide p3, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->limit:J

    .line 192
    iput-object p5, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    .line 193
    iput-boolean p6, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->products:Z

    .line 194
    iput-boolean p7, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->includeAvailableRetailers:Z

    .line 195
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "offerId"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 199
    iget-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "offerGroupId"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "limit"

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "limitStrategy"

    invoke-interface {p1, p2, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    iget-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    iget-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->offerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)J
    .locals 2

    .line 172
    iget-wide v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->limit:J

    return-wide v0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Z
    .locals 0

    .line 172
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->products:Z

    return p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Z
    .locals 0

    .line 172
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
.method public includeAvailableRetailers()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->includeAvailableRetailers:Z

    return v0
.end method

.method public limit()J
    .locals 2

    .line 216
    iget-wide v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->limit:J

    return-wide v0
.end method

.method public limitStrategy()Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 238
    new-instance v0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;-><init>(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)V

    return-object v0
.end method

.method public offerGroupId()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public offerId()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->offerId:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 224
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->products:Z

    return v0
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

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
