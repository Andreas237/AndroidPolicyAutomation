.class public final Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;",
        ">;"
    }
.end annotation


# instance fields
.field final fragmentsFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 976
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 977
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;->fragmentsFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;
    .locals 3

    .line 981
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 982
    sget-object v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readConditional(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments;

    .line 988
    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;-><init>(Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 976
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    move-result-object p1

    return-object p1
.end method
