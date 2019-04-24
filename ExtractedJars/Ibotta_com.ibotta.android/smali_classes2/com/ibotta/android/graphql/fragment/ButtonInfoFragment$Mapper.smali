.class public final Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;
.super Ljava/lang/Object;
.source "ButtonInfoFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final androidFieldMapper:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Mapper;

.field final iosFieldMapper:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;->androidFieldMapper:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Mapper;

    .line 130
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;->iosFieldMapper:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;
    .locals 4

    .line 134
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 135
    sget-object v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    .line 141
    sget-object v2, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$2;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$2;-><init>(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;)V

    invoke-interface {p1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    .line 147
    new-instance v2, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    invoke-direct {v2, v0, v1, p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;-><init>(Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;)V

    return-object v2
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 127
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    move-result-object p1

    return-object p1
.end method
