.class Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$3;
.super Ljava/lang/Object;
.source "BonusFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;)V
    .locals 0

    .line 673
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$3;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;
    .locals 1

    .line 676
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$3;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->questFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 673
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$3;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    move-result-object p1

    return-object p1
.end method
