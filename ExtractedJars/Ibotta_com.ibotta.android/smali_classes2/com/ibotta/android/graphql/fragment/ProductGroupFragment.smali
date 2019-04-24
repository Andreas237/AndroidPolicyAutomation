.class public Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;
.super Ljava/lang/Object;
.source "ProductGroupFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}"

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

.field final ignore_barcode:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final multiples:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final multiples_count:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final random_weight:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final random_weight_total:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x9

    .line 26
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 27
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

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "ignore_barcode"

    const-string v3, "ignore_barcode"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "multiples_count"

    const-string v3, "multiples_count"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "multiples"

    const-string v3, "multiples"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "name"

    const-string v3, "name"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "products"

    const-string v3, "products"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const-string v1, "random_weight_total"

    const-string v3, "random_weight_total"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const-string v1, "random_weight"

    const-string v3, "random_weight"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "ProductGroup"

    .line 50
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Boolean;)V
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
    .param p4    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 80
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 81
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    .line 82
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    .line 83
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    .line 84
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    .line 85
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    .line 86
    iput-object p7, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    .line 87
    iput-object p8, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    .line 88
    iput-object p9, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 172
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    .line 173
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    .line 174
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    .line 175
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    if-nez v1, :cond_8

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    .line 176
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    if-nez v1, :cond_8

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    .line 177
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    .line 178
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    if-nez v1, :cond_8

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    .line 180
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    if-nez v1, :cond_8

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    .line 181
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    if-nez p1, :cond_8

    goto :goto_6

    :cond_7
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    .line 182
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    return v0

    :cond_9
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 189
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_7

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 194
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 196
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

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

    .line 198
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 200
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 202
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 204
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 206
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 208
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v3

    :goto_6
    xor-int/2addr v0, v3

    .line 209
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 210
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$hashCodeMemoized:Z

    .line 212
    :cond_7
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public ignore_barcode()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 128
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;)V

    return-object v0
.end method

.method public multiples()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    return-object v0
.end method

.method public multiples_count()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public products()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    return-object v0
.end method

.method public random_weight()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    return-object v0
.end method

.method public random_weight_total()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProductGroupFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ignore_barcode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", multiples_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", multiples="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", random_weight_total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", random_weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$toString:Ljava/lang/String;

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method
