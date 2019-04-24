.class Lo/dlf$17$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf$17;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlf$17;


# direct methods
.method constructor <init>(Lo/dlf$17;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lo/dlf$17$4;->d:Lo/dlf$17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 411
    iget-object v0, p0, Lo/dlf$17$4;->d:Lo/dlf$17;

    iget-object v0, v0, Lo/dlf$17;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->g(Lo/dlf;)Lo/dlt;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlt;->b()V

    .line 412
    iget-object v0, p0, Lo/dlf$17$4;->d:Lo/dlf$17;

    iget-object v0, v0, Lo/dlf$17;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->l(Lo/dlf;)V

    .line 413
    return-void
.end method
