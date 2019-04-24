.class public Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;
.super Ljava/io/FilterOutputStream;
.source "Editor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/Editor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FaultHidingOutputStream"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/util/Editor;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/util/Editor;Ljava/io/OutputStream;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->this$0:Lcom/usebutton/sdk/internal/util/Editor;

    .line 118
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/util/Editor;Ljava/io/OutputStream;Lcom/usebutton/sdk/internal/util/Editor$1;)V
    .locals 0

    .line 116
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;-><init>(Lcom/usebutton/sdk/internal/util/Editor;Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 142
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 144
    :catch_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->this$0:Lcom/usebutton/sdk/internal/util/Editor;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/Editor;->access$102(Lcom/usebutton/sdk/internal/util/Editor;Z)Z

    :goto_0
    return-void
.end method

.method public flush()V
    .locals 2

    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 153
    :catch_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->this$0:Lcom/usebutton/sdk/internal/util/Editor;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/Editor;->access$102(Lcom/usebutton/sdk/internal/util/Editor;Z)Z

    :goto_0
    return-void
.end method

.method public write(I)V
    .locals 1

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 126
    :catch_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->this$0:Lcom/usebutton/sdk/internal/util/Editor;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/Editor;->access$102(Lcom/usebutton/sdk/internal/util/Editor;Z)Z

    :goto_0
    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 133
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 135
    :catch_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;->this$0:Lcom/usebutton/sdk/internal/util/Editor;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/usebutton/sdk/internal/util/Editor;->access$102(Lcom/usebutton/sdk/internal/util/Editor;Z)Z

    :goto_0
    return-void
.end method
