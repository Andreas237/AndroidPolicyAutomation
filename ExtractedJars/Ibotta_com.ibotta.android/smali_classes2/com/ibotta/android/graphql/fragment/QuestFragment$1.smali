.class Lcom/ibotta/android/graphql/fragment/QuestFragment$1;
.super Ljava/lang/Object;
.source "QuestFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/QuestFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/QuestFragment;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 139
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 140
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 141
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 142
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 143
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->cta:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 144
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->step:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 145
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->state:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 146
    sget-object v0, Lcom/ibotta/android/graphql/fragment/QuestFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/QuestFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/QuestFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/QuestFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
