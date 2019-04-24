.class Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;
.super Ljava/lang/Object;
.source "BonusQualificationFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 91
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 92
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 93
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->completed:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 94
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;->progress_description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
