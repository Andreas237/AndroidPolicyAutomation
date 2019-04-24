.class Lcom/huawei/feedback/component/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/feedback/bean/a;

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/huawei/feedback/component/AutoUploadService;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/component/AutoUploadService;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/feedback/bean/a;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    iput-object p2, p0, Lcom/huawei/feedback/component/a;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/feedback/component/a;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/feedback/component/a;->c:Lcom/huawei/feedback/bean/a;

    iput-object p5, p0, Lcom/huawei/feedback/component/a;->d:Landroid/os/Bundle;

    iput-object p6, p0, Lcom/huawei/feedback/component/a;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 119
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/feedback/component/a;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 120
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 122
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    .line 123
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "small path ok!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->c:Lcom/huawei/feedback/bean/a;

    invoke-virtual {v0, v7}, Lcom/huawei/feedback/bean/a;->a(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->c:Lcom/huawei/feedback/bean/a;

    invoke-virtual {v0, v5, v6}, Lcom/huawei/feedback/bean/a;->b(J)V

    .line 126
    goto :goto_0

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->c:Lcom/huawei/feedback/bean/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/a;->a(Z)V

    .line 130
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    iget-object v1, p0, Lcom/huawei/feedback/component/a;->c:Lcom/huawei/feedback/bean/a;

    invoke-static {v0, v1}, Lcom/huawei/feedback/component/AutoUploadService;->a(Lcom/huawei/feedback/component/AutoUploadService;Lcom/huawei/feedback/bean/a;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogApi;->checkTimeOver(Landroid/content/Context;)Z

    move-result v5

    .line 132
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogApi;->checkPolicyOver(Landroid/content/Context;)Z

    move-result v6

    .line 133
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v1}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->k(Landroid/content/Context;)Z

    move-result v7

    .line 134
    if-eqz v7, :cond_1

    .line 135
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "Immediate Upload"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    iget-object v1, p0, Lcom/huawei/feedback/component/a;->d:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/huawei/feedback/component/a;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/component/AutoUploadService;->a(Lcom/huawei/feedback/component/AutoUploadService;Landroid/os/Bundle;Ljava/lang/String;)V

    goto :goto_1

    .line 137
    :cond_1
    if-eqz v5, :cond_2

    if-eqz v6, :cond_2

    .line 138
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "TimeOver and PolicyOver Upload"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    iget-object v1, p0, Lcom/huawei/feedback/component/a;->d:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/huawei/feedback/component/a;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/component/AutoUploadService;->a(Lcom/huawei/feedback/component/AutoUploadService;Landroid/os/Bundle;Ljava/lang/String;)V

    goto :goto_1

    .line 142
    :cond_2
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkTimeOver "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ischeckPolicyOver "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    iget-object v0, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/feedback/component/a;->f:Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v2}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/feedback/component/AutoUploadService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 146
    :goto_1
    return-void
.end method
