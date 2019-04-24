.class Lcom/huawei/feedback/component/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/component/ProgressService;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 10

    .line 157
    const-string v0, "ProgressService"

    const-string v1, "onServiceConnected"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    invoke-static {p2}, Lcom/huawei/logupload/a$a;->a(Landroid/os/IBinder;)Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/logupload/a;)Lcom/huawei/logupload/a;

    .line 159
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->d()Lcom/huawei/logupload/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 161
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->d()Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->b(Ljava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    goto :goto_0

    .line 162
    :catch_0
    move-exception v4

    .line 163
    const-string v0, "ProgressService"

    const-string v1, "RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    :cond_0
    :goto_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 170
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 171
    const-string v0, "com.example.logupload.progressSmall"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v1}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/feedback/component/ProgressService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 177
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(I)V

    .line 181
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 182
    const-string v0, "com.example.logupload.progress.start"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v1}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/feedback/component/ProgressService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 189
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(I)V

    .line 193
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 194
    const-string v0, "com.example.logupload.progress.pause"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v1}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lcom/huawei/feedback/component/ProgressService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 201
    const/4 v0, 0x3

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(I)V

    .line 205
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7}, Landroid/content/IntentFilter;-><init>()V

    .line 206
    const-string v0, "com.example.logupload.progress.cancel"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v1}, Lcom/huawei/feedback/component/ProgressService;->d(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lcom/huawei/feedback/component/ProgressService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 213
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(I)V

    .line 217
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mListLogUpload.size() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/logupload/LogUpload;

    .line 223
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->f()Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-virtual {v9}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 230
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "nm.cancel id:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string v0, "ProgressService"

    const-string v1, "onServiceConnected CreateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0, v9}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)V

    .line 233
    const-string v0, "ProgressService"

    const-string v1, "onServiceConnected updateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/feedback/component/d;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0, v9}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)V

    .line 238
    :cond_1
    goto :goto_1

    .line 239
    :cond_2
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 151
    const-string v0, "ProgressService"

    const-string v1, "onServiceDisconnected"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/logupload/a;)Lcom/huawei/logupload/a;

    .line 153
    return-void
.end method
