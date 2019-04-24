.class Lcom/ibotta/android/graphql/SearchQuery$Variables$1;
.super Ljava/lang/Object;
.source "SearchQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/SearchQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/SearchQuery$Variables;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

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

    .line 332
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$000(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "term"

    .line 333
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$000(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, "correctSpelling"

    .line 335
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$100(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "searchLimit"

    .line 336
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$200(Lcom/ibotta/android/graphql/SearchQuery$Variables;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "relatedLimit"

    .line 337
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$300(Lcom/ibotta/android/graphql/SearchQuery$Variables;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 338
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$400(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "retailerId"

    .line 339
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$400(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 341
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$500(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_3

    const-string v0, "contentTypes"

    .line 342
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$500(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/ibotta/android/graphql/SearchQuery$Variables$1$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/SearchQuery$Variables$1$1;-><init>(Lcom/ibotta/android/graphql/SearchQuery$Variables$1;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeList(Ljava/lang/String;Lcom/apollographql/apollo/api/InputFieldWriter$ListWriter;)V

    :cond_3
    const-string v0, "products"

    .line 351
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$600(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "fetchRelatedOffers"

    .line 352
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$700(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 353
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/SearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/SearchQuery$Variables;->access$800(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
