.class Lo/aic$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aic;


# direct methods
.method constructor <init>(Lo/aic;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/aic$3;->b:Lo/aic;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 61
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 62
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 64
    :pswitch_0
    new-instance v4, Lo/aij;

    invoke-direct {v4}, Lo/aij;-><init>()V

    .line 65
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->c(Lo/aic;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/aij;->d:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->b(Lo/aic;)[I

    move-result-object v0

    iput-object v0, v4, Lo/aij;->c:[I

    .line 67
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    invoke-virtual {v0}, Lo/aie;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/aij;->a:Ljava/lang/String;

    .line 68
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    iget-object v0, v0, Lo/aie;->m:Lo/ace;

    iput-object v0, v4, Lo/aij;->b:Lo/ace;

    .line 69
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    iget-object v1, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v1}, Lo/aic;->a(Lo/aic;)I

    move-result v1

    invoke-static {v0, v1, v4}, Lo/aic;->c(Lo/aic;ILo/aij;)V

    .line 71
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->e(Lo/aic;)Lo/ahv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahv;->d()V

    .line 72
    goto :goto_1

    .line 74
    :pswitch_1
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->e(Lo/aic;)Lo/ahv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->e(Lo/aic;)Lo/ahv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahv;->e()V

    goto :goto_1

    .line 79
    :pswitch_2
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->e(Lo/aic;)Lo/ahv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/aic$3;->b:Lo/aic;

    invoke-static {v0}, Lo/aic;->e(Lo/aic;)Lo/ahv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahv;->c()V

    goto :goto_1

    .line 84
    :goto_0
    const-string v0, "mHandler msg is other "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 88
    :cond_0
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
