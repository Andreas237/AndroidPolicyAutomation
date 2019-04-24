.class Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;
.super Ljava/lang/Object;
.source "RetailerRedemptionMetaFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 130
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 131
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 137
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 138
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 139
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 140
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 141
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
