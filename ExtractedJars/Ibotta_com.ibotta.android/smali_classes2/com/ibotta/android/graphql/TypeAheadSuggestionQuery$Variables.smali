.class public final Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "TypeAheadSuggestionQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final limit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final prefix:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final retailers:Lcom/apollographql/apollo/api/Input;
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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
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
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    .line 151
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 149
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->valueMap:Ljava/util/Map;

    .line 152
    iput-object p1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->prefix:Lcom/apollographql/apollo/api/Input;

    .line 153
    iput-object p2, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    .line 154
    iput-object p3, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->retailers:Lcom/apollographql/apollo/api/Input;

    .line 155
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "prefix"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    :cond_0
    iget-boolean p1, p2, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 159
    iget-object p1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "limit"

    iget-object p2, p2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    :cond_1
    iget-boolean p1, p3, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 162
    iget-object p1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "retailers"

    iget-object p3, p3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 142
    iget-object p0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->prefix:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 142
    iget-object p0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 142
    iget-object p0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->retailers:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method


# virtual methods
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

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->limit:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 185
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)V

    return-object v0
.end method

.method public prefix()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->prefix:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public retailers()Lcom/apollographql/apollo/api/Input;
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

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->retailers:Lcom/apollographql/apollo/api/Input;

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

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
