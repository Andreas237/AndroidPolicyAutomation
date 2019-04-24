.class Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;)V
    .locals 0

    .line 698
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 701
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 702
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 703
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 704
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 705
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 706
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 707
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    invoke-static {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->access$000(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    return-void
.end method
