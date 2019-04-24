.class Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 221
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 222
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 223
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 224
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->display_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 225
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->dynamic_content_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 226
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 227
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->retailer_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 228
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->sponsored:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 229
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 230
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 231
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->more_action:Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->more_action:Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 232
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->menu_actions:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 238
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->content:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 244
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->categories:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1$3;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$1$3;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    return-void
.end method
