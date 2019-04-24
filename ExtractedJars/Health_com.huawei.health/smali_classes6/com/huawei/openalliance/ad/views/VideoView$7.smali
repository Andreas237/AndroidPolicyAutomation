.class Lcom/huawei/openalliance/ad/views/VideoView$7;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/VideoView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$7;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$7;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, v4}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/views/VideoView;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$7;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->j(Lcom/huawei/openalliance/ad/views/VideoView;)V

    :cond_1
    :goto_0
    return-void
.end method
