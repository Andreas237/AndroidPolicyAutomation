.class Lio/fabric/sdk/android/services/network/HttpRequest$4;
.super Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;
.source "HttpRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;->receive(Ljava/lang/Appendable;)Lio/fabric/sdk/android/services/network/HttpRequest;
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

.field final synthetic val$appendable:Ljava/lang/Appendable;

.field final synthetic val$reader:Ljava/io/BufferedReader;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/BufferedReader;Ljava/lang/Appendable;)V
    .locals 0

    .line 1768
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iput-object p4, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->val$reader:Ljava/io/BufferedReader;

    iput-object p5, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->val$appendable:Ljava/lang/Appendable;

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

    .line 1772
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->access$100(Lio/fabric/sdk/android/services/network/HttpRequest;)I

    move-result v0

    invoke-static {v0}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v0

    .line 1774
    :goto_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->val$reader:Ljava/io/BufferedReader;

    invoke-virtual {v1, v0}, Ljava/io/BufferedReader;->read(Ljava/nio/CharBuffer;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 1775
    invoke-virtual {v0}, Ljava/nio/CharBuffer;->rewind()Ljava/nio/Buffer;

    .line 1776
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->val$appendable:Ljava/lang/Appendable;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    .line 1777
    invoke-virtual {v0}, Ljava/nio/CharBuffer;->rewind()Ljava/nio/Buffer;

    goto :goto_0

    .line 1779
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$4;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

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

    .line 1768
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$4;->run()Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method
