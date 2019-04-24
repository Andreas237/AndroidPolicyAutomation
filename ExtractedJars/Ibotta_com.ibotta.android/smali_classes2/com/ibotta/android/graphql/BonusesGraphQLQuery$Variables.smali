.class public final Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "BonusesGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final availableLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final completedLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final featuredLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 184
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 181
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 185
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 186
    iput-object p2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->availableLimit:Lcom/apollographql/apollo/api/Input;

    .line 187
    iput-object p3, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->completedLimit:Lcom/apollographql/apollo/api/Input;

    .line 188
    iput-object p4, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    .line 189
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "retailerId"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 193
    iget-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "availableLimit"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    :cond_1
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 196
    iget-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "completedLimit"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    :cond_2
    iget-boolean p1, p4, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_3

    .line 199
    iget-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "featuredLimit"

    iget-object p3, p4, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->availableLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->completedLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 172
    iget-object p0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method


# virtual methods
.method public availableLimit()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->availableLimit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public completedLimit()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->completedLimit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public featuredLimit()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 226
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public retailerId()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

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

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
