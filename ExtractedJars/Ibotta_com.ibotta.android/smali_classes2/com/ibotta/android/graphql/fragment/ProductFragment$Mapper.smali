.class public final Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;
.super Ljava/lang/Object;
.source "ProductFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ProductFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/ProductFragment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ProductFragment;
    .locals 21

    move-object/from16 v0, p1

    .line 341
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v3

    .line 342
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 343
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 344
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 345
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 346
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 347
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 348
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    check-cast v1, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    .line 349
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 350
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v12

    .line 351
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v13

    .line 352
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v14

    .line 353
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v15

    .line 354
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v16

    .line 355
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v17

    .line 356
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 357
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v19

    .line 358
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v20

    .line 359
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;

    move-object v2, v0

    invoke-direct/range {v2 .. v20}, Lcom/ibotta/android/graphql/fragment/ProductFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 338
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ProductFragment;

    move-result-object p1

    return-object p1
.end method
