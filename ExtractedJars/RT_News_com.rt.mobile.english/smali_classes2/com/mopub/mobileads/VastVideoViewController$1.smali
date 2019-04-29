.class Lcom/mopub/mobileads/VastVideoViewController$1;
.super Ljava/lang/Object;
.source "VastVideoViewController.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/VastVideoViewController;-><init>(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;JLcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/VastVideoViewController;

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastVideoViewController;Landroid/app/Activity;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    iput-object p2, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 143
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$000(Lcom/mopub/mobileads/VastVideoViewController;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 144
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1, p2}, Lcom/mopub/mobileads/VastVideoViewController;->access$102(Lcom/mopub/mobileads/VastVideoViewController;Z)Z

    .line 145
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    const-string v0, "com.mopub.action.interstitial.click"

    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastVideoViewController;->broadcastAction(Ljava/lang/String;)V

    .line 146
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$400(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v1}, Lcom/mopub/mobileads/VastVideoViewController;->access$200(Lcom/mopub/mobileads/VastVideoViewController;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v1}, Lcom/mopub/mobileads/VastVideoViewController;->access$300(Lcom/mopub/mobileads/VastVideoViewController;)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController$1;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v1}, Lcom/mopub/mobileads/VastVideoViewController;->getCurrentPosition()I

    move-result v1

    :goto_0
    invoke-virtual {p1, v0, v1, p2}, Lcom/mopub/mobileads/VastVideoConfig;->handleClickForResult(Landroid/app/Activity;II)V

    :cond_1
    return p2
.end method
