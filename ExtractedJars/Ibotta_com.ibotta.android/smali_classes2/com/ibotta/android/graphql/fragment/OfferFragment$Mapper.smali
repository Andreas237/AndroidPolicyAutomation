.class public final Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;
.super Ljava/lang/Object;
.source "OfferFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/OfferFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/OfferFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final available_atFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at$Mapper;

.field final button_info_mapFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map$Mapper;

.field final product_groupFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Mapper;

.field final rewardFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1120
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->available_atFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at$Mapper;

    .line 1122
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->button_info_mapFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map$Mapper;

    .line 1124
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->product_groupFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Mapper;

    .line 1126
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->rewardFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .locals 69

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1130
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 1131
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 1132
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 1133
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v7

    .line 1134
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 1135
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v9

    .line 1136
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v10

    .line 1137
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$1;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v11

    .line 1148
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v12

    .line 1149
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$2;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v13

    .line 1155
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$3;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$3;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    .line 1161
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v15

    .line 1162
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v16

    .line 1163
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$4;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$4;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v17

    .line 1169
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v18

    .line 1170
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v19

    .line 1171
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x10

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v20

    .line 1172
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v21

    .line 1173
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v22

    .line 1174
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v23

    .line 1175
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v24

    .line 1176
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v25

    .line 1177
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    check-cast v2, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/lang/String;

    .line 1178
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v27

    .line 1179
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x18

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v28

    .line 1180
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x19

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v29

    .line 1181
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v30

    .line 1182
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v31

    .line 1183
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1c

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v32

    .line 1184
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v33

    .line 1185
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1e

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v34

    .line 1186
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v35

    .line 1187
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x20

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v36

    .line 1188
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x21

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v37

    .line 1189
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x22

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v38

    .line 1190
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x23

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v39

    .line 1191
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x24

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v40

    .line 1192
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x25

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v41

    .line 1193
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x26

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v42

    .line 1194
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x27

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v43

    .line 1195
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x28

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v44

    .line 1196
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x29

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v45

    .line 1197
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x2a

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$5;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$5;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v46

    .line 1203
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x2b

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$6;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$6;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v47

    .line 1214
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x2c

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v48

    .line 1215
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x2d

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v49

    .line 1216
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x2e

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v50

    .line 1217
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x2f

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v51

    .line 1218
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x30

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$7;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$7;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v52

    .line 1224
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x31

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v53

    .line 1225
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x32

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$8;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper$8;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v54

    .line 1236
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x33

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readDouble(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Double;

    move-result-object v55

    .line 1237
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x34

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v56

    .line 1238
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x35

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v57

    .line 1239
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x36

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v58

    .line 1240
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x37

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v59

    .line 1241
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x38

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v60

    .line 1242
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x39

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v61

    .line 1243
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x3a

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v62

    .line 1244
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x3b

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v63

    .line 1245
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x3c

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v64

    .line 1246
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x3d

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v65

    .line 1247
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x3e

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v66

    .line 1248
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x3f

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v67

    .line 1249
    sget-object v2, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x40

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v68

    .line 1250
    new-instance v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-object v3, v1

    invoke-direct/range {v3 .. v68}, Lcom/ibotta/android/graphql/fragment/OfferFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 1119
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object p1

    return-object p1
.end method
