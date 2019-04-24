.class Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1$1;
.super Ljava/lang/Object;
.source "BonusFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;)V
    .locals 0

    .line 641
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1$1;->this$1:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;
    .locals 1

    .line 644
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1$1;->this$1:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->bonus_qualificationFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 641
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper$1$1;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;

    move-result-object p1

    return-object p1
.end method
