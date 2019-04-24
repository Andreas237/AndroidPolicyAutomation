.class public final Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final button_infoFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;

.field final gallery_featureFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature$Mapper;

.field final redemption_metaFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta$Mapper;

.field final retailer_barcode_configurationFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;

.field final sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 729
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 730
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->button_infoFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;

    .line 732
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->gallery_featureFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature$Mapper;

    .line 734
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->redemption_metaFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta$Mapper;

    .line 736
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->retailer_barcode_configurationFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Mapper;

    .line 738
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->sort_resultFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment;
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 742
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 743
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    check-cast v2, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    .line 744
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v6

    .line 745
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v7

    .line 746
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$1;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    .line 752
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 753
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v10

    .line 754
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v11

    .line 755
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v12

    .line 756
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v13

    .line 757
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v14

    .line 758
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$2;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v15

    .line 769
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v16

    .line 770
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v17

    .line 771
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v18

    .line 772
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v19

    .line 773
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x10

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v20

    .line 774
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v21

    .line 775
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v22

    .line 776
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v23

    .line 777
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v24

    .line 778
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v25

    .line 779
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v26

    .line 780
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v27

    .line 781
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x18

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v28

    .line 782
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x19

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$3;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$3;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v29

    .line 788
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$4;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$4;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    .line 794
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$5;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$5;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    .line 800
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1c

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v32

    .line 801
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v33

    .line 802
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1e

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v34

    .line 803
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$6;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper$6;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v35

    .line 814
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x20

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v36

    .line 815
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x21

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v37

    .line 816
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x22

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v38

    .line 817
    sget-object v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x23

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v39

    .line 818
    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    move-object v3, v1

    invoke-direct/range {v3 .. v39}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 729
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    move-result-object p1

    return-object p1
.end method
