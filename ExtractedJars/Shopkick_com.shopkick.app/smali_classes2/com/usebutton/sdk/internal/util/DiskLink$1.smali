.class Lcom/usebutton/sdk/internal/util/DiskLink$1;
.super Ljava/lang/Object;
.source "DiskLink.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/DiskLink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/util/DiskLink;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/util/DiskLink;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLink$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLink;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLink;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLink;->access$000(Lcom/usebutton/sdk/internal/util/DiskLink;)Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 39
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->flush()V

    const-string v0, "DiskLink"

    const-string v1, "Flushed cache to disk."

    .line 40
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DiskLink"

    const-string v2, "Cache flush failed"

    .line 42
    invoke-static {v1, v2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
