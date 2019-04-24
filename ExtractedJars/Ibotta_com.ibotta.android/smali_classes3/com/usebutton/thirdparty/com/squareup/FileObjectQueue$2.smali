.class Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;
.super Ljava/lang/Object;
.source "FileObjectQueue.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->setListener(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;

.field final synthetic val$listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;->this$0:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;->val$listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/io/InputStream;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 133
    new-array v0, p2, [B

    const/4 v1, 0x0

    .line 134
    invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    .line 136
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;->val$listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    iget-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;->this$0:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;

    invoke-static {p2}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->access$000(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;)Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;->from([B)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onAdd(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
