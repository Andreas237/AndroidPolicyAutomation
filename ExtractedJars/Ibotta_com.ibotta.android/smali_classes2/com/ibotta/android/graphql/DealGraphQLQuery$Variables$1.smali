.class Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "DealGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "id"

    .line 134
    sget-object v1, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    iget-object v2, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;

    invoke-static {v2}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeCustom(Ljava/lang/String;Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    return-void
.end method
