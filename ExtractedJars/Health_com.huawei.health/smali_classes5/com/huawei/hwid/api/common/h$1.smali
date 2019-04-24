.class Lcom/huawei/hwid/api/common/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/h;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/h;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/hwid/api/common/h$1;->a:Lcom/huawei/hwid/api/common/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 106
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "onServiceConnected---"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x14

    if-ge v3, v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h$1;->a:Lcom/huawei/hwid/api/common/h;

    invoke-static {p2}, Lcom/huawei/cloudservice/b$a;->a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/h;->a(Lcom/huawei/hwid/api/common/h;Lcom/huawei/cloudservice/b;)Lcom/huawei/cloudservice/b;

    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h$1;->a:Lcom/huawei/hwid/api/common/h;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/h;->a(Lcom/huawei/hwid/api/common/h;)Lcom/huawei/cloudservice/b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 111
    const-wide/16 v0, 0xc8

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 113
    :cond_0
    goto :goto_3

    .line 118
    :goto_1
    goto :goto_2

    .line 115
    :catch_0
    move-exception v4

    .line 116
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "service cannot connected"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 117
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 120
    :cond_1
    :goto_3
    const-string v0, "CloudAccountServiceClient2"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onServiceConnected---mICloudAccount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/api/common/h$1;->a:Lcom/huawei/hwid/api/common/h;

    invoke-static {v2}, Lcom/huawei/hwid/api/common/h;->a(Lcom/huawei/hwid/api/common/h;)Lcom/huawei/cloudservice/b;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_4

    :cond_2
    const/4 v2, 0x0

    :goto_4
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h$1;->a:Lcom/huawei/hwid/api/common/h;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/h;->b(Lcom/huawei/hwid/api/common/h;)V

    .line 123
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 127
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "onServiceDisconnected"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h$1;->a:Lcom/huawei/hwid/api/common/h;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/h;->a(Lcom/huawei/hwid/api/common/h;Lcom/huawei/cloudservice/b;)Lcom/huawei/cloudservice/b;

    .line 129
    return-void
.end method
