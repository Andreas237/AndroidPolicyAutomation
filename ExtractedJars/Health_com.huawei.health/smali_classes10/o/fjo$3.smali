.class Lo/fjo$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fjo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fjo;


# direct methods
.method constructor <init>(Lo/fjo;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/fjo$3;->e:Lo/fjo;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 84
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 85
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 87
    :sswitch_0
    iget-object v0, p0, Lo/fjo$3;->e:Lo/fjo;

    invoke-static {v0}, Lo/fjo;->a(Lo/fjo;)V

    .line 88
    goto :goto_0

    .line 90
    :sswitch_1
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123==MSG_AFTER_CONNECT_DELAY_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjo$3;->e:Lo/fjo;

    invoke-static {v3}, Lo/fjo;->e(Lo/fjo;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/fjo$3;->e:Lo/fjo;

    invoke-static {v0}, Lo/fjo;->e(Lo/fjo;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 92
    new-instance v0, Lo/fjo$b;

    iget-object v1, p0, Lo/fjo$3;->e:Lo/fjo;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fjo$b;-><init>(Lo/fjo;Lo/fjo$4;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lo/fjo$b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 98
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
