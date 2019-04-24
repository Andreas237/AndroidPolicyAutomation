.class public final Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;
.super Ljava/lang/Object;
.source "FeatureFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/FeatureFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeatureFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 337
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;->sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeatureFragment;
    .locals 20

    move-object/from16 v0, p1

    .line 341
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v3

    .line 342
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    check-cast v1, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 343
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 344
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 345
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 346
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 347
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 348
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v10

    .line 349
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 350
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v12

    .line 351
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v13

    .line 352
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper$1;

    move-object/from16 v15, p0

    invoke-direct {v2, v15}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;)V

    invoke-interface {v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v14

    .line 363
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v1

    move-object v15, v1

    .line 364
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v16

    .line 365
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v17

    .line 366
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 367
    sget-object v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v19

    .line 368
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    move-object v2, v0

    invoke-direct/range {v2 .. v19}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 336
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    move-result-object p1

    return-object p1
.end method
