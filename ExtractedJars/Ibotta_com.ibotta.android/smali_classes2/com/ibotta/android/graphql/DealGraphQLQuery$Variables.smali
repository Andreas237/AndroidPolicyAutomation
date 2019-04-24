.class public final Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "DealGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/DealGraphQLQuery;
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
.method constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 115
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 113
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    .line 116
    iput-object p1, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->id:Ljava/lang/String;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;)Ljava/lang/String;
    .locals 0

    .line 110
    iget-object p0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->id:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->id:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 131
    new-instance v0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;)V

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

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
