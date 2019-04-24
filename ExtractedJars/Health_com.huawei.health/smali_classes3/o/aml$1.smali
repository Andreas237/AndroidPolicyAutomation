.class Lo/aml$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aml;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aml;


# direct methods
.method constructor <init>(Lo/aml;Landroid/os/Looper;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lo/aml$1;->c:Lo/aml;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 38
    const-string v0, "Step_DelayStartHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DelayStartHelper try it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    if-eqz p1, :cond_1

    .line 40
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 41
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_1

    .line 42
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lo/aml$1;->c:Lo/aml;

    invoke-static {v0}, Lo/aml;->c(Lo/aml;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    :try_start_0
    iget-object v0, p0, Lo/aml$1;->c:Lo/aml;

    invoke-static {v0}, Lo/aml;->c(Lo/aml;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/aml$1;->c:Lo/aml;

    invoke-static {v1}, Lo/aml;->d(Lo/aml;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 45
    iget-object v0, p0, Lo/aml$1;->c:Lo/aml;

    invoke-static {v0}, Lo/aml;->b(Lo/aml;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    goto :goto_0

    .line 46
    :catch_0
    move-exception v4

    .line 47
    const-string v0, "Step_DelayStartHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " Exception ex"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    iget-object v0, p0, Lo/aml$1;->c:Lo/aml;

    iget v1, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lo/aml;->d(Lo/aml;I)V

    .line 49
    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lo/aml$1;->c:Lo/aml;

    invoke-static {v0}, Lo/aml;->b(Lo/aml;)V

    .line 59
    :cond_1
    :goto_0
    return-void
.end method
