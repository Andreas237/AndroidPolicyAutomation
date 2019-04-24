.class Lcom/ibotta/android/graphql/type/Limit$1;
.super Ljava/lang/Object;
.source "Limit.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/type/Limit;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/type/Limit;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/type/Limit;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/graphql/type/Limit$1;->this$0:Lcom/ibotta/android/graphql/type/Limit;

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

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/graphql/type/Limit$1;->this$0:Lcom/ibotta/android/graphql/type/Limit;

    invoke-static {v0}, Lcom/ibotta/android/graphql/type/Limit;->access$000(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "limit"

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/graphql/type/Limit$1;->this$0:Lcom/ibotta/android/graphql/type/Limit;

    invoke-static {v1}, Lcom/ibotta/android/graphql/type/Limit;->access$000(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/type/Limit$1;->this$0:Lcom/ibotta/android/graphql/type/Limit;

    invoke-static {v0}, Lcom/ibotta/android/graphql/type/Limit;->access$100(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_2

    const-string v0, "limitStrategy"

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/graphql/type/Limit$1;->this$0:Lcom/ibotta/android/graphql/type/Limit;

    invoke-static {v1}, Lcom/ibotta/android/graphql/type/Limit;->access$100(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/type/Limit$1;->this$0:Lcom/ibotta/android/graphql/type/Limit;

    invoke-static {v1}, Lcom/ibotta/android/graphql/type/Limit;->access$100(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/type/LimitStrategy;->name()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
