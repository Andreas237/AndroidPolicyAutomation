.class Lcom/huawei/openalliance/ad/download/app/b$6;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/download/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/app/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/b$6;->a:Lcom/huawei/openalliance/ad/download/app/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "netReceiver.onReceive, action:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$6$1;

    invoke-direct {v0, p0, v3}, Lcom/huawei/openalliance/ad/download/app/b$6$1;-><init>(Lcom/huawei/openalliance/ad/download/app/b$6;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method
