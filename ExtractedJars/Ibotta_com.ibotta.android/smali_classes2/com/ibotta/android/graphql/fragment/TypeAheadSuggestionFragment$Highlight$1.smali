.class Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;->this$0:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 204
    sget-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;->this$0:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 205
    sget-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;->this$0:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    iget-wide v1, v1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 206
    sget-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$1;->this$0:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    iget-wide v1, v1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    return-void
.end method
