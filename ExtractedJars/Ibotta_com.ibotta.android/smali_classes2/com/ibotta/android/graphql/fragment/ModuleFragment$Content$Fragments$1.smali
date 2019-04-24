.class Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;)V
    .locals 0

    .line 826
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 1

    .line 829
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    if-eqz v0, :cond_0

    .line 831
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    .line 833
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    if-eqz v0, :cond_1

    .line 835
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    .line 837
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    if-eqz v0, :cond_2

    .line 839
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    .line 841
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-eqz v0, :cond_3

    .line 843
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    .line 845
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-eqz v0, :cond_4

    .line 847
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    .line 849
    :cond_4
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    if-eqz v0, :cond_5

    .line 851
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    :cond_5
    return-void
.end method
