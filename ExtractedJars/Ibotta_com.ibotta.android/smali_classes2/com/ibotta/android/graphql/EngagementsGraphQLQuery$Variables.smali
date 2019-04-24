.class public final Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "EngagementsGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final rewardIds:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    .line 124
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 122
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->rewardIds:Lcom/apollographql/apollo/api/Input;

    .line 126
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "rewardIds"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 119
    iget-object p0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->rewardIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method


# virtual methods
.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 142
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;)V

    return-object v0
.end method

.method public rewardIds()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->rewardIds:Lcom/apollographql/apollo/api/Input;

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

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
