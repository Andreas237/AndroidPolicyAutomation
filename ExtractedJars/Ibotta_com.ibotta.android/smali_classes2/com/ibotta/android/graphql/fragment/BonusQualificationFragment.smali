.class public Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;
.super Ljava/lang/Object;
.source "BonusQualificationFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}"

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

.field final completed:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final progress_description:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x4

    .line 24
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v6, "id"

    const-string v7, "id"

    sget-object v10, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "completed"

    const-string v3, "completed"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "progress_description"

    const-string v3, "progress_description"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "BonusQualification"

    .line 38
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 56
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 57
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    .line 59
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public completed()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 117
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 118
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    .line 121
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 129
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 134
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 136
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    .line 139
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$hashCodeMemoized:Z

    .line 142
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 88
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;)V

    return-object v0
.end method

.method public progress_description()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BonusQualificationFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", completed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progress_description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$toString:Ljava/lang/String;

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method
