.class public Lcom/ibotta/android/graphql/SearchQuery$Misspelling;
.super Ljava/lang/Object;
.source "SearchQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/SearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Misspelling"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/SearchQuery$Misspelling$Mapper;
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

.field final confidence:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final original:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final suggested:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x4

    .line 979
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 980
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "original"

    const-string v2, "original"

    .line 981
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "suggested"

    const-string v2, "suggested"

    .line 982
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "confidence"

    const-string v2, "confidence"

    .line 983
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1001
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 1002
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    .line 1003
    iput-object p2, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    .line 1004
    iput-object p3, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    .line 1005
    iput-object p4, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1009
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public confidence()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1021
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1054
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 1055
    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    .line 1056
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    .line 1057
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    .line 1058
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object p1, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    .line 1059
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 1066
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$hashCodeMemoized:Z

    if-nez v0, :cond_3

    .line 1069
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 1071
    iget-object v2, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1073
    iget-object v2, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1075
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    .line 1076
    iput v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$hashCode:I

    const/4 v0, 0x1

    .line 1077
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$hashCodeMemoized:Z

    .line 1079
    :cond_3
    iget v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 1025
    new-instance v0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;-><init>(Lcom/ibotta/android/graphql/SearchQuery$Misspelling;)V

    return-object v0
.end method

.method public original()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1013
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    return-object v0
.end method

.method public suggested()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1017
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1038
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1039
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Misspelling{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", original="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", suggested="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", confidence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$toString:Ljava/lang/String;

    .line 1046
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$toString:Ljava/lang/String;

    return-object v0
.end method
