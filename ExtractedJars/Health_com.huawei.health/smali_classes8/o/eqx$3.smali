.class Lo/eqx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eqx;


# direct methods
.method constructor <init>(Lo/eqx;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/eqx$3;->c:Lo/eqx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 4

    .line 131
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/eqx$3;->c:Lo/eqx;

    invoke-static {v0}, Lo/eqx;->a(Lo/eqx;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/eqx$3$1;

    invoke-direct {v1, p0}, Lo/eqx$3$1;-><init>(Lo/eqx$3;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 143
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-void
.end method
