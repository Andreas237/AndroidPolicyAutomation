.class Lo/dma$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dma;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dma;


# direct methods
.method constructor <init>(Lo/dma;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/dma$2;->e:Lo/dma;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 4

    .line 48
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lo/dma$2;->e:Lo/dma;

    invoke-static {v0}, Lo/dma;->b(Lo/dma;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/dma$2$2;

    invoke-direct {v1, p0}, Lo/dma$2$2;-><init>(Lo/dma$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 56
    return-void
.end method
