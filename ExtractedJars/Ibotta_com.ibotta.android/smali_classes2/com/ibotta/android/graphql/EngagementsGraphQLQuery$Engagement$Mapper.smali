.class public final Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Mapper;
.super Ljava/lang/Object;
.source "EngagementsGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;",
        ">;"
    }
.end annotation


# instance fields
.field final fragmentsFieldMapper:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Mapper;->fragmentsFieldMapper:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;
    .locals 3

    .line 414
    sget-object v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 415
    sget-object v1, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Mapper$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Mapper$1;-><init>(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readConditional(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments;

    .line 421
    new-instance v1, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;-><init>(Ljava/lang/String;Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 409
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;

    move-result-object p1

    return-object p1
.end method
