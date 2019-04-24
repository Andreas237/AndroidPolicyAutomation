.class Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->access$000(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "prefix"

    .line 189
    iget-object v1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->access$000(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->access$100(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "limit"

    .line 192
    iget-object v1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->access$100(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->access$200(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_3

    const-string v0, "retailers"

    .line 195
    iget-object v1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;->access$200(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1$1;-><init>(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Variables$1;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeList(Ljava/lang/String;Lcom/apollographql/apollo/api/InputFieldWriter$ListWriter;)V

    :cond_3
    return-void
.end method
