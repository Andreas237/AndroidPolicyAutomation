.class public final Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/ModuleFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final categoryFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;

.field final contentFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Mapper;

.field final menu_actionFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;

.field final more_actionFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;->more_actionFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action$Mapper;

    .line 343
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;->menu_actionFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;

    .line 345
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;->contentFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Mapper;

    .line 347
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;->categoryFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ModuleFragment;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 351
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 352
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    check-cast v2, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    .line 353
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 354
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 355
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v8

    .line 356
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v9

    .line 357
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v10

    .line 358
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v11

    .line 359
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v12

    .line 360
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-interface {v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v13

    .line 361
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$1;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;

    .line 367
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$2;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v15

    .line 378
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$3;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$3;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v16

    .line 389
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$4;

    invoke-direct {v3, v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper$4;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;)V

    invoke-interface {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v17

    .line 400
    new-instance v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    move-object v3, v1

    invoke-direct/range {v3 .. v17}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 340
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    move-result-object p1

    return-object p1
.end method
