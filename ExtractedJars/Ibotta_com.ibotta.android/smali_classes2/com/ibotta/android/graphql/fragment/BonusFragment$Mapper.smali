.class public final Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;
.super Ljava/lang/Object;
.source "BonusFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/BonusFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/BonusFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final bonus_qualificationFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Mapper;

.field final questFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;

.field final sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 627
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->bonus_qualificationFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Mapper;

    .line 629
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->questFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;

    .line 631
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment;
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 635
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 636
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v5

    .line 637
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v6

    .line 638
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v7

    .line 649
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 650
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 651
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v10

    .line 652
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 653
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v12

    .line 654
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v13

    .line 655
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v14

    .line 656
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v15

    .line 657
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    check-cast v2, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/String;

    .line 658
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v17

    .line 659
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 660
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v19

    .line 661
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x10

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v20

    .line 662
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v21

    .line 663
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$2;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v22

    .line 669
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v23

    .line 670
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v24

    .line 671
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v25

    .line 672
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v26

    .line 673
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$3;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$3;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    .line 679
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x18

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v28

    .line 680
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x19

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v29

    .line 681
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v30

    .line 682
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$4;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$4;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v31

    .line 693
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1c

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v32

    .line 694
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v33

    .line 695
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1e

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v34

    .line 696
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v35

    .line 697
    sget-object v2, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x20

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v36

    .line 698
    new-instance v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-object v3, v1

    invoke-direct/range {v3 .. v36}, Lcom/ibotta/android/graphql/fragment/BonusFragment;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 626
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object p1

    return-object p1
.end method
