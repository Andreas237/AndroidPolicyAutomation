.class public final Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion;,
        Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;,
        Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;,
        Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
        "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
        "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query TypeAheadSuggestion($prefix: String, $limit: Int, $retailers: [Int]) {\n  typeAheadSuggestion(prefix: $prefix, limit: $limit, retailers: $retailers) {\n    __typename\n    ...TypeAheadSuggestionFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "ee3062465dde60da588f6fa8f18816fd1fda38b331606c4dd590ef9144ea9929"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query TypeAheadSuggestion($prefix: String, $limit: Int, $retailers: [Int]) {\n  typeAheadSuggestion(prefix: $prefix, limit: $limit, retailers: $retailers) {\n    __typename\n    ...TypeAheadSuggestionFragment\n  }\n}\nfragment TypeAheadSuggestionFragment on Suggestion {\n  __typename\n  text\n  highlights {\n    __typename\n    offset\n    length\n  }\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/apollographql/apollo/api/Input;
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
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "prefix == null"

    .line 57
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "limit == null"

    .line 58
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "retailers == null"

    .line 59
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->variables:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;
    .locals 1

    .line 89
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 94
    sget-object v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "ee3062465dde60da588f6fa8f18816fd1fda38b331606c4dd590ef9144ea9929"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query TypeAheadSuggestion($prefix: String, $limit: Int, $retailers: [Int]) {\n  typeAheadSuggestion(prefix: $prefix, limit: $limit, retailers: $retailers) {\n    __typename\n    ...TypeAheadSuggestionFragment\n  }\n}\nfragment TypeAheadSuggestionFragment on Suggestion {\n  __typename\n  text\n  highlights {\n    __typename\n    offset\n    length\n  }\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
            ">;"
        }
    .end annotation

    .line 85
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->variables()Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->variables:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->wrapData(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;

    move-result-object p1

    return-object p1
.end method
