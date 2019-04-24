.class public Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;
.super Ljava/lang/Object;
.source "RetailerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;,
        Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RetailerNodeFragment on RetailerNode {\n  __typename\n  id\n  name\n  modelCImage: image(type: MODEL_C) {\n    __typename\n    url\n  }\n  nearby\n  verificationType\n}"

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

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final nearby:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final verificationType:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x6

    .line 25
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 26
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

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "name"

    const-string v3, "name"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "modelCImage"

    const-string v3, "image"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v4, v2}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "type"

    const-string v7, "MODEL_C"

    .line 30
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    .line 29
    invoke-static {v1, v3, v4, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "nearby"

    const-string v3, "nearby"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "verificationType"

    const-string v3, "verificationType"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "RetailerNode"

    .line 48
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 71
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 72
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    .line 74
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    .line 75
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    .line 76
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 152
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 153
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    .line 154
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    .line 155
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    .line 156
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    if-nez v1, :cond_5

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    .line 157
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    .line 158
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_4
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    .line 159
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    return v0

    :cond_6
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 166
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_4

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 171
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 173
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

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

    .line 175
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 177
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 179
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    .line 180
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 181
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$hashCodeMemoized:Z

    .line 183
    :cond_4
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 119
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)V

    return-object v0
.end method

.method public modelCImage()Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public nearby()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerNodeFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelCImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nearby="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verificationType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$toString:Ljava/lang/String;

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public verificationType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    return-object v0
.end method
