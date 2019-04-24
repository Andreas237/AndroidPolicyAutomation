.class public final Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;
.super Ljava/lang/Object;
.source "BuyableGiftCardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 403
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 404
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;->retailerFieldMapper:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 408
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 409
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 410
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 411
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 412
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    check-cast v2, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    .line 413
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 414
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v10

    .line 415
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 416
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v12

    .line 417
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v13

    .line 418
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v14

    .line 419
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$1;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v15

    .line 425
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$2;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    .line 431
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v17

    .line 432
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 433
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v19

    .line 434
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x10

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v20

    .line 435
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v21

    .line 436
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v22

    .line 437
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v23

    .line 438
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v24

    .line 439
    new-instance v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    move-object v3, v1

    invoke-direct/range {v3 .. v24}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 403
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    move-result-object p1

    return-object p1
.end method
