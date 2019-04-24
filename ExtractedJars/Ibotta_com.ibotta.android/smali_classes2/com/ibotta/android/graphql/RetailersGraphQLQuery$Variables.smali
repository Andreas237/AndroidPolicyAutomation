.class public final Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "RetailersGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailersGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final nearbyOnly:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerIds:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 151
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 149
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 152
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->retailerIds:Lcom/apollographql/apollo/api/Input;

    .line 153
    iput-object p2, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    .line 154
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "retailerIds"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 158
    iget-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "nearbyOnly"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 144
    iget-object p0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->retailerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 144
    iget-object p0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method


# virtual methods
.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 177
    new-instance v0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public nearbyOnly()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public retailerIds()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->retailerIds:Lcom/apollographql/apollo/api/Input;

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

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
