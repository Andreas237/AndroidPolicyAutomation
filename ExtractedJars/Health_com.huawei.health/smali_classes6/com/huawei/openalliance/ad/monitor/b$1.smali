.class Lcom/huawei/openalliance/ad/monitor/b$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/monitor/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/monitor/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/monitor/b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/monitor/b$1;->a:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ViewMonitor"

    const-string v1, "receive screen state: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b$1;->a:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/monitor/b;->a(Lcom/huawei/openalliance/ad/monitor/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/monitor/b$1;->a:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/monitor/b;->b(Lcom/huawei/openalliance/ad/monitor/b;)V

    :cond_3
    return-void
.end method
