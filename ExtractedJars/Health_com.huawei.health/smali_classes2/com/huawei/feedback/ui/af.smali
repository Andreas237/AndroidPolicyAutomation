.class Lcom/huawei/feedback/ui/af;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 150
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 151
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 154
    :sswitch_0
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "MSG_TYPE_FEEDBACKRESPONSE_SUCCESS"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 157
    if-eqz v3, :cond_1

    .line 159
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0, v3}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Ljava/util/List;)V

    goto/16 :goto_1

    .line 164
    :sswitch_1
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "MSG_TYPE_SAVE_FEEDBACKBATCH_ANSWER"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 167
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 168
    const-string v0, "com.example.logupload.progressSmall"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 171
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 172
    const-string v0, "com.example.logupload.progress.start"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 175
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 176
    const-string v0, "com.example.logupload.progress.pause"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 179
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7}, Landroid/content/IntentFilter;-><init>()V

    .line 180
    const-string v0, "com.example.logupload.progress.cancel"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 184
    const-string v0, "com.example.logupload.exception"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->d(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 191
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)Z

    .line 194
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->e(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    .line 202
    invoke-static {}, Lcom/huawei/feedback/logic/g;->b()V

    .line 206
    :try_start_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getLogCollectManager()Lcom/huawei/lcagent/client/LogCollectManager;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 207
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b:Lcom/huawei/lcagent/client/LogCollectManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    new-instance v1, Lcom/huawei/lcagent/client/LogCollectManager;

    iget-object v2, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-virtual {v2}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/huawei/lcagent/client/LogCollectManager;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b:Lcom/huawei/lcagent/client/LogCollectManager;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    :cond_0
    goto :goto_0

    .line 212
    :catch_0
    move-exception v8

    .line 214
    const-string v0, "NetworkMonitorReceiver"

    const-string v1, "The init of the object logCollectManager is SecurityException!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/af;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 219
    .line 224
    :cond_1
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7d5 -> :sswitch_0
        0x7d7 -> :sswitch_1
    .end sparse-switch
.end method
