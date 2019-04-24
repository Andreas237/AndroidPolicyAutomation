.class Lo/adp$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/adp;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/adp;


# direct methods
.method constructor <init>(Lo/adp;Landroid/os/Looper;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 5

    .line 109
    invoke-super {p0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V

    .line 110
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg what: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 114
    :pswitch_0
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v0}, Lo/adp;->c(Lo/adp;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->d(Lo/adp;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 116
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v0}, Lo/adp;->c(Lo/adp;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->e(Lo/adp;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 117
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v0}, Lo/adp;->c(Lo/adp;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->e(Lo/adp;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 118
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    .line 119
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->b(Lo/adp;)I

    move-result v1

    int-to-float v1, v1

    div-float v1, v4, v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v0, v1}, Lo/adp;->a(Lo/adp;I)I

    .line 120
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v0}, Lo/adp;->a(Lo/adp;)I

    move-result v0

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->i(Lo/adp;)I

    move-result v1

    if-le v0, v1, :cond_0

    .line 121
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->a(Lo/adp;)I

    move-result v1

    invoke-static {v0, v1}, Lo/adp;->c(Lo/adp;I)I

    .line 123
    :cond_0
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mProSize: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v3}, Lo/adp;->b(Lo/adp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", OTA progress: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mFirmwarePro: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v3}, Lo/adp;->a(Lo/adp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->a(Lo/adp;)I

    move-result v1

    invoke-static {v0, v1}, Lo/adp;->b(Lo/adp;I)V

    .line 125
    goto/16 :goto_1

    .line 127
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_1

    .line 128
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 129
    :cond_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 130
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail. timeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 131
    :cond_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 132
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail. CS error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 133
    :cond_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 134
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail. power low"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 136
    :cond_4
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    :goto_0
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v0}, Lo/adp;->c(Lo/adp;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/adp$1;->c:Lo/adp;

    invoke-static {v1}, Lo/adp;->e(Lo/adp;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 140
    iget-object v0, p0, Lo/adp$1;->c:Lo/adp;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/adp;->e(Lo/adp;I)V

    .line 141
    goto :goto_1

    .line 143
    :pswitch_2
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OTA upgrade power is too low..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 148
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
