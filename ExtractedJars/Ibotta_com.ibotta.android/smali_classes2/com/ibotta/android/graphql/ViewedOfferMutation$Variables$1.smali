.class Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;
.super Ljava/lang/Object;
.source "ViewedOfferMutation.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$000(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v0, "offerId"

    .line 242
    sget-object v2, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    iget-object v3, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v3}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$000(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v3

    iget-object v3, v3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v3}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$000(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v3

    iget-object v3, v3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-interface {p1, v0, v2, v3}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeCustom(Ljava/lang/String;Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    .line 244
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$100(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_3

    const-string v0, "offerGroupId"

    .line 245
    sget-object v2, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    iget-object v3, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v3}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$100(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v3

    iget-object v3, v3, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v3, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$100(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    :cond_2
    invoke-interface {p1, v0, v2, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeCustom(Ljava/lang/String;Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    :cond_3
    const-string v0, "limit"

    .line 247
    iget-object v1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$200(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "limitStrategy"

    .line 248
    iget-object v1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$300(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Lcom/ibotta/android/graphql/type/LimitStrategy;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/type/LimitStrategy;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "products"

    .line 249
    iget-object v1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$400(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 250
    iget-object v1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables$1;->this$0:Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;->access$500(Lcom/ibotta/android/graphql/ViewedOfferMutation$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
