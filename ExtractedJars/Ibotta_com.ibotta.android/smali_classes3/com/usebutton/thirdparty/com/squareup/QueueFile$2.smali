.class Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;
.super Ljava/lang/Object;
.source "QueueFile.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/squareup/QueueFile;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field first:Z

.field final synthetic this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

.field final synthetic val$builder:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 583
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->val$builder:Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    .line 584
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->first:Z

    return-void
.end method


# virtual methods
.method public read(Ljava/io/InputStream;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 587
    iget-boolean p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->first:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 588
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->first:Z

    goto :goto_0

    .line 590
    :cond_0
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->val$builder:Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    :goto_0
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$2;->val$builder:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void
.end method
