.class Lcom/shopkick/app/awards/AwardsManager$1;
.super Landroid/content/BroadcastReceiver;
.source "AwardsManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/awards/AwardsManager;->registerNetworkListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/awards/AwardsManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager$1;->this$0:Lcom/shopkick/app/awards/AwardsManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p2, "connectivity"

    .line 185
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 186
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 187
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 188
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager$1;->this$0:Lcom/shopkick/app/awards/AwardsManager;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/shopkick/app/awards/AwardsManager;->access$002(Lcom/shopkick/app/awards/AwardsManager;I)I

    .line 193
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager$1;->this$0:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {p1}, Lcom/shopkick/app/awards/AwardsManager;->makeBatchRequest()V

    :cond_0
    return-void
.end method
