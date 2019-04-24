.class public Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Highlight"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final length:J

.field final offset:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    .line 158
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 159
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "offset"

    const-string v2, "offset"

    .line 160
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "length"

    const-string v2, "length"

    .line 161
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 177
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    .line 178
    iput-wide p2, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    .line 179
    iput-wide p4, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 228
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 229
    check-cast p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    .line 230
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    iget-wide v5, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    iget-wide v5, p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 6

    .line 239
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    int-to-long v2, v0

    .line 244
    iget-wide v4, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    xor-long/2addr v2, v4

    long-to-int v0, v2

    mul-int v0, v0, v1

    int-to-long v0, v0

    .line 246
    iget-wide v2, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    xor-long/2addr v0, v2

    long-to-int v1, v0

    .line 247
    iput v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$hashCode:I

    const/4 v0, 0x1

    .line 248
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$hashCodeMemoized:Z

    .line 250
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$hashCode:I

    return v0
.end method

.method public length()J
    .locals 2

    .line 197
    iget-wide v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    return-wide v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 201
    new-instance v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;-><init>(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;)V

    return-object v0
.end method

.method public offset()J
    .locals 2

    .line 190
    iget-wide v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Highlight{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$toString:Ljava/lang/String;

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$toString:Ljava/lang/String;

    return-object v0
.end method
