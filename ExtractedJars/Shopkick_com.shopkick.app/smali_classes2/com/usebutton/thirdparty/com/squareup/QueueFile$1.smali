.class Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;
.super Ljava/lang/Object;
.source "QueueFile.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/squareup/QueueFile;->forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

.field final synthetic val$reader:Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;->val$reader:Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/io/InputStream;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 434
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;->val$reader:Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;

    invoke-interface {v0, p1, p2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;->read(Ljava/io/InputStream;I)V

    const/4 p1, 0x1

    return p1
.end method
