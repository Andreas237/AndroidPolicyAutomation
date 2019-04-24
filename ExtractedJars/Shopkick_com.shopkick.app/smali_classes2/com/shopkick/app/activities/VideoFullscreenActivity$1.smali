.class Lcom/shopkick/app/activities/VideoFullscreenActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "VideoFullscreenActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/VideoFullscreenActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/VideoFullscreenActivity;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;->this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onReceive$17(Lcom/shopkick/app/activities/VideoFullscreenActivity$1;Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;->this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;

    invoke-static {v0}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->access$000(Lcom/shopkick/app/activities/VideoFullscreenActivity;)Lcom/shopkick/app/video/VideoController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    .line 174
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string p2, "connectivity"

    .line 162
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 163
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 165
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 167
    iget-object p1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;->this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;

    invoke-static {p1}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->access$000(Lcom/shopkick/app/activities/VideoFullscreenActivity;)Lcom/shopkick/app/video/VideoController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 168
    iget-object p1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;->this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;

    invoke-static {p1}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->access$100(Lcom/shopkick/app/activities/VideoFullscreenActivity;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object p1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;->this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;

    const p2, 0x7f11014d

    .line 170
    invoke-virtual {p1, p2}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/activities/VideoFullscreenActivity$1;->this$0:Lcom/shopkick/app/activities/VideoFullscreenActivity;

    const p2, 0x7f11014f

    .line 171
    invoke-virtual {p1, p2}, Lcom/shopkick/app/activities/VideoFullscreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/activities/-$$Lambda$VideoFullscreenActivity$1$8wSB27KTGHQs4Bi4FjA2i7pPKUE;

    invoke-direct {v5, p0}, Lcom/shopkick/app/activities/-$$Lambda$VideoFullscreenActivity$1$8wSB27KTGHQs4Bi4FjA2i7pPKUE;-><init>(Lcom/shopkick/app/activities/VideoFullscreenActivity$1;)V

    const/4 v6, 0x0

    .line 168
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_1
    return-void
.end method
