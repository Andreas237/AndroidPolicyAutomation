.class Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper$1;
.super Ljava/lang/Object;
.source "BonusFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader<",
        "Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;)V
    .locals 0

    .line 1033
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments;
    .locals 1

    .line 1036
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;->fragmentsFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments$Mapper;

    invoke-virtual {v0, p2, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 1033
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper$1;->read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments;

    move-result-object p1

    return-object p1
.end method
