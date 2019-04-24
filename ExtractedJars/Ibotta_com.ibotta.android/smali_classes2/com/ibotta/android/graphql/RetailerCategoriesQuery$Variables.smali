.class public final Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "RetailerCategoriesQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailerCategoriesQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final customerId:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final includeFullResponse:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
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
.method constructor <init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
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
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 163
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 160
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->valueMap:Ljava/util/Map;

    .line 164
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->customerId:Ljava/lang/String;

    .line 165
    iput-object p2, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    .line 166
    iput-object p3, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "customerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_0

    .line 169
    iget-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "includeFullResponse"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    :cond_0
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 172
    iget-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "categoryRetailersLimit"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Ljava/lang/String;
    .locals 0

    .line 153
    iget-object p0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->customerId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 153
    iget-object p0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 153
    iget-object p0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method


# virtual methods
.method public categoryRetailersLimit()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->categoryRetailersLimit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public customerId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public includeFullResponse()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->includeFullResponse:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 195
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)V

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

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
