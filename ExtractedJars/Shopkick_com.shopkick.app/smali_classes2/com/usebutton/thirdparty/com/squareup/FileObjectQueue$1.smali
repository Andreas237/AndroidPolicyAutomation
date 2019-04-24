.class Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;
.super Ljava/lang/Object;
.source "FileObjectQueue.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->peek(I)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field count:I

.field final synthetic this$0:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;

.field final synthetic val$entries:Ljava/util/List;

.field final synthetic val$max:I


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;Ljava/util/List;I)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->this$0:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->val$entries:Ljava/util/List;

    iput p3, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->val$max:I

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

    .line 81
    new-array v0, p2, [B

    const/4 v1, 0x0

    .line 82
    invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    .line 84
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->val$entries:Ljava/util/List;

    iget-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->this$0:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;

    invoke-static {p2}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->access$000(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;)Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;

    move-result-object p2

    invoke-interface {p2, v0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;->from([B)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->count:I

    const/4 p2, 0x1

    add-int/2addr p1, p2

    iput p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->count:I

    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;->val$max:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    return p2
.end method
