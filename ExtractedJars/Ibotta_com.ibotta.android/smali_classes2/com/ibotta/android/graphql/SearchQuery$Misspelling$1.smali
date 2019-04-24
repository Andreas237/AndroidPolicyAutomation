.class Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;
.super Ljava/lang/Object;
.source "SearchQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/SearchQuery$Misspelling;)V
    .locals 0

    .line 1025
    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 1028
    sget-object v0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    iget-object v1, v1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 1029
    sget-object v0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    iget-object v1, v1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 1030
    sget-object v0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    iget-object v1, v1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 1031
    sget-object v0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Misspelling$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Misspelling;

    iget-object v1, v1, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
