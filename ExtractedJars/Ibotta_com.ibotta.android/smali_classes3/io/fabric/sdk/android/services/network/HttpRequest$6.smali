.class Lio/fabric/sdk/android/services/network/HttpRequest$6;
.super Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;
.source "HttpRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation<",
        "Lio/fabric/sdk/android/services/network/HttpRequest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

.field final synthetic val$input:Ljava/io/InputStream;

.field final synthetic val$output:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .line 2365
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iput-object p4, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->val$input:Ljava/io/InputStream;

    iput-object p5, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->val$output:Ljava/io/OutputStream;

    invoke-direct {p0, p2, p3}, Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;-><init>(Ljava/io/Closeable;Z)V

    return-void
.end method


# virtual methods
.method public run()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2369
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->access$100(Lio/fabric/sdk/android/services/network/HttpRequest;)I

    move-result v0

    new-array v0, v0, [B

    .line 2371
    :goto_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->val$input:Ljava/io/InputStream;

    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 2372
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->val$output:Ljava/io/OutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 2373
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$6;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 2365
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$6;->run()Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method
