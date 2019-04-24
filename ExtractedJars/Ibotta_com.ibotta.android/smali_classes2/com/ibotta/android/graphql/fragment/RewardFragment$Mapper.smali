.class public final Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;
.super Ljava/lang/Object;
.source "RewardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RewardFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RewardFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final optionFieldMapper:Lcom/ibotta/android/graphql/fragment/RewardFragment$Option$Mapper;

.field final questionFieldMapper:Lcom/ibotta/android/graphql/fragment/RewardFragment$Question$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 332
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RewardFragment$Option$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Option$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;->optionFieldMapper:Lcom/ibotta/android/graphql/fragment/RewardFragment$Option$Mapper;

    .line 334
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RewardFragment$Question$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Question$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;->questionFieldMapper:Lcom/ibotta/android/graphql/fragment/RewardFragment$Question$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RewardFragment;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 338
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 339
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v5

    .line 340
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 341
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 342
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v8

    .line 343
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    check-cast v2, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    .line 344
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v10

    .line 345
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper$1;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v11

    .line 351
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper$2;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v12

    .line 362
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper$3;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper$3;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v13

    .line 373
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v14

    .line 374
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v15

    .line 375
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v16

    .line 376
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v17

    .line 377
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 378
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v19

    .line 379
    new-instance v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    move-object v3, v1

    invoke-direct/range {v3 .. v19}, Lcom/ibotta/android/graphql/fragment/RewardFragment;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 331
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RewardFragment;

    move-result-object p1

    return-object p1
.end method
