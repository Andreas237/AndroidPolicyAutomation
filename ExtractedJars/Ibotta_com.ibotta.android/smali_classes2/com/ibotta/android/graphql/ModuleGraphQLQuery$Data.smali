.class public Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;
.super Ljava/lang/Object;
.source "ModuleGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ModuleGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    .line 265
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "module"

    const-string v3, "module"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "expand"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 268
    invoke-virtual {v6, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v8, "variableName"

    const-string v9, "expand"

    .line 269
    invoke-virtual {v6, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 270
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 267
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v5, "heroBoost"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 272
    invoke-virtual {v6, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v8, "variableName"

    const-string v9, "heroBoost"

    .line 273
    invoke-virtual {v6, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 274
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 271
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v5, "id"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "kind"

    const-string v8, "Variable"

    .line 276
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v7, "variableName"

    const-string v8, "id"

    .line 277
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 278
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 275
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 279
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 266
    invoke-static {v2, v3, v4, v0, v5}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 291
    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 325
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 326
    check-cast p1, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;

    .line 327
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 334
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    const v0, 0xf4243

    .line 337
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 338
    iput v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 339
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$hashCodeMemoized:Z

    .line 341
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 302
    new-instance v0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;)V

    return-object v0
.end method

.method public module()Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 298
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{module="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->module:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$toString:Ljava/lang/String;

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
