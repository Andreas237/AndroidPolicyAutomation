.class Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$2;
.super Ljava/lang/Object;
.source "EngagementFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ListReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ListReader<",
        "Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper;)V
    .locals 0

    .line 320
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$2;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option;
    .locals 1

    .line 323
    new-instance v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$2$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$2$1;-><init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$2;)V

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;->readObject(Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option;

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Object;
    .locals 0

    .line 320
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Mapper$2;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option;

    move-result-object p1

    return-object p1
.end method
