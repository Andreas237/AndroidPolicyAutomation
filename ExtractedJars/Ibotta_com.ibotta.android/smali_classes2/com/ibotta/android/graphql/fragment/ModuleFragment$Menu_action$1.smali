.class Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;)V
    .locals 0

    .line 552
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 555
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 556
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 557
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 558
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;->this$0:Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    return-void
.end method
