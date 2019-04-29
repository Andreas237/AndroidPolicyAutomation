.class Lcom/mopub/mobileads/MoPubView$1;
.super Landroid/content/BroadcastReceiver;
.source "MoPubView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/MoPubView;->registerScreenStateBroadcastReceiver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/MoPubView;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubView;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView$1;->this$0:Lcom/mopub/mobileads/MoPubView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 81
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubView$1;->this$0:Lcom/mopub/mobileads/MoPubView;

    invoke-static {p1}, Lcom/mopub/mobileads/MoPubView;->access$000(Lcom/mopub/mobileads/MoPubView;)I

    move-result p1

    invoke-static {p1}, Lcom/mopub/common/util/Visibility;->isScreenVisible(I)Z

    move-result p1

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 85
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.USER_PRESENT"

    .line 87
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 88
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubView$1;->this$0:Lcom/mopub/mobileads/MoPubView;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/mopub/mobileads/MoPubView;->access$100(Lcom/mopub/mobileads/MoPubView;I)V

    goto :goto_0

    :cond_1
    const-string p2, "android.intent.action.SCREEN_OFF"

    .line 89
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 90
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubView$1;->this$0:Lcom/mopub/mobileads/MoPubView;

    const/16 p2, 0x8

    invoke-static {p1, p2}, Lcom/mopub/mobileads/MoPubView;->access$100(Lcom/mopub/mobileads/MoPubView;I)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method
