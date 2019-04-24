.class public final Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 609
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;
    .locals 5

    .line 612
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 613
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {p1, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v1

    .line 614
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {p1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 615
    sget-object v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-interface {p1, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object p1

    .line 616
    new-instance v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    invoke-direct {v3, v0, v1, v2, p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v3
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 609
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    move-result-object p1

    return-object p1
.end method
