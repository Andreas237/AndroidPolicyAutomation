.class public Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;
.super Ljava/lang/Object;
.source "ModuleFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Category"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;,
        Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;
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

.field private final fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final icon_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x5

    .line 978
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 979
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

    .line 980
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

    .line 981
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "icon_url"

    const-string v3, "icon_url"

    .line 982
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "__typename"

    const-string v2, "__typename"

    const-string v3, "Category"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 983
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseField;->forFragment(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;)V
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
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 1003
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 1004
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 1005
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->id:Ljava/lang/String;

    .line 1006
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

    .line 1007
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    const-string p1, "fragments == null"

    .line 1008
    invoke-static {p5, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;
    .locals 0

    .line 977
    iget-object p0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    return-object p0
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1012
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1063
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 1064
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;

    .line 1065
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->id:Ljava/lang/String;

    .line 1066
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

    .line 1067
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    .line 1068
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    .line 1069
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_4
    return v2
.end method

.method public fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1028
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1076
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 1079
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 1081
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1083
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

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

    .line 1085
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 1087
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 1088
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$hashCode:I

    const/4 v0, 0x1

    .line 1089
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$hashCodeMemoized:Z

    .line 1091
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$hashCode:I

    return v0
.end method

.method public icon_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1024
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1016
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->id:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 1032
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$1;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;)V

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1020
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1046
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1047
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Category{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", icon_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->icon_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fragments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$toString:Ljava/lang/String;

    .line 1055
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$toString:Ljava/lang/String;

    return-object v0
.end method
