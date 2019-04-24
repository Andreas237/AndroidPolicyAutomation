.class public final Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;",
        ">;"
    }
.end annotation


# instance fields
.field final fragmentsFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1172
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;->fragmentsFieldMapper:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;
    .locals 7

    .line 1176
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 1177
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 1178
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 1179
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 1180
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readConditional(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    .line 1186
    new-instance p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 1171
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;

    move-result-object p1

    return-object p1
.end method
