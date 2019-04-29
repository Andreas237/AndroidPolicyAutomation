.class Lcom/mopub/mobileads/VastVideoViewController$5;
.super Ljava/lang/Object;
.source "VastVideoViewController.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/VastVideoViewController;->createVideoView(Landroid/content/Context;I)Lcom/mopub/mobileads/VastVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/VastVideoViewController;

.field final synthetic val$videoView:Lcom/mopub/mobileads/VastVideoView;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastVideoViewController;Lcom/mopub/mobileads/VastVideoView;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    iput-object p2, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->val$videoView:Lcom/mopub/mobileads/VastVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .line 442
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->val$videoView:Lcom/mopub/mobileads/VastVideoView;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v1}, Lcom/mopub/mobileads/VastVideoViewController;->access$400(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/mobileads/VastVideoConfig;->getDiskMediaFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/mopub/mobileads/VastVideoView;->retryMediaPlayer(Landroid/media/MediaPlayer;IILjava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    return p2

    .line 446
    :cond_0
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1600(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 447
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoViewController;->makeVideoInteractable()V

    .line 448
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lcom/mopub/mobileads/VastVideoViewController;->videoError(Z)V

    .line 449
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1, p2}, Lcom/mopub/mobileads/VastVideoViewController;->access$1702(Lcom/mopub/mobileads/VastVideoViewController;Z)Z

    .line 451
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$400(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object p1

    iget-object p2, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoViewController;->getContext()Landroid/content/Context;

    move-result-object p2

    sget-object v0, Lcom/mopub/mobileads/VastErrorCode;->GENERAL_LINEAR_AD_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController$5;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v1}, Lcom/mopub/mobileads/VastVideoViewController;->getCurrentPosition()I

    move-result v1

    invoke-virtual {p1, p2, v0, v1}, Lcom/mopub/mobileads/VastVideoConfig;->handleError(Landroid/content/Context;Lcom/mopub/mobileads/VastErrorCode;I)V

    return p3
.end method
