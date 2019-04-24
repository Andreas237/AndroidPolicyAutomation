.class public final Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "ModulesGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ModulesGraphQLQuery;
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

.field private final heroBoost:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
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
            "Ljava/lang/Boolean;",
            ">;ZZ)V"
        }
    .end annotation

    .line 225
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 222
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 226
    iput-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    .line 227
    iput-object p2, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->contentMin:Lcom/apollographql/apollo/api/Input;

    .line 228
    iput-object p3, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    .line 229
    iput-object p4, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->heroBoost:Lcom/apollographql/apollo/api/Input;

    .line 230
    iput-boolean p5, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->products:Z

    .line 231
    iput-boolean p6, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->includeAvailableRetailers:Z

    .line 232
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "limit"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 236
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "contentMin"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    :cond_1
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 239
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "contentMax"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    :cond_2
    iget-boolean p1, p4, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_3

    .line 242
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "heroBoost"

    iget-object p3, p4, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 209
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 209
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->contentMin:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 209
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 209
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Z
    .locals 0

    .line 209
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Z
    .locals 0

    .line 209
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->includeAvailableRetailers:Z

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

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->contentMax:Lcom/apollographql/apollo/api/Input;

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

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->contentMin:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public heroBoost()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public includeAvailableRetailers()Z
    .locals 1

    .line 269
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->includeAvailableRetailers:Z

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

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 279
    new-instance v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 265
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->products:Z

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

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
