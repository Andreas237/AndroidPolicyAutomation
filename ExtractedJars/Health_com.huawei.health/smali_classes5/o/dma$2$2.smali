.class Lo/dma$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dma$2;->onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dma$2;


# direct methods
.method constructor <init>(Lo/dma$2;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/dma$2$2;->a:Lo/dma$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 52
    iget-object v0, p0, Lo/dma$2$2;->a:Lo/dma$2;

    iget-object v0, v0, Lo/dma$2;->e:Lo/dma;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Lo/dma;->e(I)V

    .line 53
    iget-object v0, p0, Lo/dma$2$2;->a:Lo/dma$2;

    iget-object v0, v0, Lo/dma$2;->e:Lo/dma;

    const v1, 0xc350

    invoke-virtual {v0, v1}, Lo/dma;->e(I)V

    .line 54
    return-void
.end method
