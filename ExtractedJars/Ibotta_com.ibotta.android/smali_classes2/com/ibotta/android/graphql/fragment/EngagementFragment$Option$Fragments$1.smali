.class Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments$1;
.super Ljava/lang/Object;
.source "EngagementFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;)V
    .locals 0

    .line 447
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 1

    .line 450
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;->offerRewardPollOptFragment:Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;

    if-eqz v0, :cond_0

    .line 452
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    :cond_0
    return-void
.end method
