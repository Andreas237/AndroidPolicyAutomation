.class Lo/eeu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eeu;->d(Lo/eex;Lo/eey;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eeu;


# direct methods
.method constructor <init>(Lo/eeu;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 192
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->d(Lo/eeu;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 193
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->c(Lo/eeu;)Lo/eey;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 194
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->a(Lo/eeu;)Lcom/huawei/treadmill/JniTest;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    iget-object v1, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v1}, Lo/eeu;->a(Lo/eeu;)Lcom/huawei/treadmill/JniTest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/treadmill/JniTest;->getCurrentStepSource()I

    move-result v1

    invoke-static {v0, v1}, Lo/eeu;->e(Lo/eeu;I)I

    goto :goto_0

    .line 198
    :cond_0
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/eeu;->e(Lo/eeu;I)I

    .line 201
    :goto_0
    invoke-static {}, Lo/eeu;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "report steps: ***,stepSource:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v2}, Lo/eeu;->e(Lo/eeu;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->c(Lo/eeu;)Lo/eey;

    move-result-object v0

    iget-object v1, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v1}, Lo/eeu;->b(Lo/eeu;)I

    move-result v1

    iget-object v2, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v2}, Lo/eeu;->e(Lo/eeu;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/eey;->e(II)V

    goto :goto_1

    .line 205
    :cond_1
    invoke-static {}, Lo/eeu;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cannot report steps, mCallBackToReportStepsOrEvent is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    :goto_1
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->f(Lo/eeu;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->i(Lo/eeu;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 208
    iget-object v0, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v0}, Lo/eeu;->f(Lo/eeu;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v1}, Lo/eeu;->i(Lo/eeu;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-static {}, Lo/eeu;->b()Lo/eeu;

    move-result-object v2

    invoke-static {v2}, Lo/eeu;->h(Lo/eeu;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    .line 212
    :cond_2
    invoke-static {}, Lo/eeu;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot report steps, isAllowedCounterRunning:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/eeu$1;->e:Lo/eeu;

    invoke-static {v2}, Lo/eeu;->d(Lo/eeu;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    :cond_3
    :goto_2
    return-void
.end method
