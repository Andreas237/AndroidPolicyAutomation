.class Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3$1;
.super Ljava/lang/Object;
.source "EngagementFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3$1;->this$1:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3$1;->this$1:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper;->questionFieldMapper:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 334
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$3$1;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;

    move-result-object p1

    return-object p1
.end method