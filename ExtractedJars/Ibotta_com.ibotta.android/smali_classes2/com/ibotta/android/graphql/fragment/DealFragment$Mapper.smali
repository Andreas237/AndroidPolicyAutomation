.class public final Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;
.super Ljava/lang/Object;
.source "DealFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/DealFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/DealFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 482
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 483
    new-instance v0, Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;->sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/DealFragment;
    .locals 27

    move-object/from16 v0, p1

    .line 487
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v3

    .line 488
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 489
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 490
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 491
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 492
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 493
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 494
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v10

    .line 495
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 496
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    check-cast v1, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ljava/lang/String;

    .line 497
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v13

    .line 498
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v14

    .line 499
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v15

    .line 500
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v16

    .line 501
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v17

    .line 502
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 503
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v19

    .line 504
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v20

    .line 505
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper$1;

    move-object/from16 v26, v3

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;)V

    invoke-interface {v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v21

    .line 516
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x13

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v22

    .line 517
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x14

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v23

    .line 518
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x15

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v24

    .line 519
    sget-object v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v25

    .line 520
    new-instance v0, Lcom/ibotta/android/graphql/fragment/DealFragment;

    move-object v2, v0

    move-object/from16 v3, v26

    invoke-direct/range {v2 .. v25}, Lcom/ibotta/android/graphql/fragment/DealFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 482
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/DealFragment;

    move-result-object p1

    return-object p1
.end method
