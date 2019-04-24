.class public Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;,
        Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment TypeAheadSuggestionFragment on Suggestion {\n  __typename\n  text\n  highlights {\n    __typename\n    offset\n    length\n  }\n}"

.field public static final POSSIBLE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final highlights:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final text:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    .line 22
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 23
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "text"

    const-string v2, "text"

    .line 24
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "highlights"

    const-string v3, "highlights"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {v1, v3, v4, v2, v5}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "Suggestion"

    .line 38
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;",
            ">;)V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 54
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->__typename:Ljava/lang/String;

    const-string p1, "text == null"

    .line 55
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text:Ljava/lang/String;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 110
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 111
    check-cast p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text:Ljava/lang/String;

    .line 113
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    .line 114
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 3

    .line 121
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 126
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 129
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 130
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$hashCodeMemoized:Z

    .line 132
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$hashCode:I

    return v0
.end method

.method public highlights()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 78
    new-instance v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;)V

    return-object v0
.end method

.method public text()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TypeAheadSuggestionFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", highlights="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$toString:Ljava/lang/String;

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method
