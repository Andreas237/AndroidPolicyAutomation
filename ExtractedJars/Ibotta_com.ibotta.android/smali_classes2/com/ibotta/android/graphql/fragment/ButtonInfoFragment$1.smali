.class Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;
.super Ljava/lang/Object;
.source "ButtonInfoFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 78
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 79
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 80
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v2

    :cond_1
    invoke-interface {p1, v0, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    return-void
.end method
