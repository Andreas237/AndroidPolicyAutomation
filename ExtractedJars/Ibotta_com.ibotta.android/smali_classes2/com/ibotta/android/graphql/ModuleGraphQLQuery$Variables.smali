.class public final Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "ModuleGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ModuleGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final expand:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
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

.field private final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final includeAvailableRetailers:Z

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
.method constructor <init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
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
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;ZZ)V"
        }
    .end annotation

    .line 203
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 200
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 204
    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->id:Ljava/lang/String;

    .line 205
    iput-object p2, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->expand:Lcom/apollographql/apollo/api/Input;

    .line 206
    iput-object p3, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->heroBoost:Lcom/apollographql/apollo/api/Input;

    .line 207
    iput-boolean p4, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->products:Z

    .line 208
    iput-boolean p5, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->includeAvailableRetailers:Z

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_0

    .line 211
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "expand"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    :cond_0
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 214
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "heroBoost"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    iget-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Ljava/lang/String;
    .locals 0

    .line 189
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->id:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 189
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->expand:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 189
    iget-object p0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Z
    .locals 0

    .line 189
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Z
    .locals 0

    .line 189
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
.method public expand()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->expand:Lcom/apollographql/apollo/api/Input;

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

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->id:Ljava/lang/String;

    return-object v0
.end method

.method public includeAvailableRetailers()Z
    .locals 1

    .line 237
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->includeAvailableRetailers:Z

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 247
    new-instance v0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 233
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->products:Z

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

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
