.class Lcom/mopub/mobileads/VastVideoViewController$4;
.super Ljava/lang/Object;
.source "VastVideoViewController.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


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

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$videoView:Lcom/mopub/mobileads/VastVideoView;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastVideoViewController;Lcom/mopub/mobileads/VastVideoView;Landroid/content/Context;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    iput-object p2, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->val$videoView:Lcom/mopub/mobileads/VastVideoView;

    iput-object p3, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 4

    .line 391
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1600(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 392
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoViewController;->makeVideoInteractable()V

    .line 394
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastVideoViewController;->videoCompleted(Z)V

    .line 395
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/mopub/mobileads/VastVideoViewController;->access$202(Lcom/mopub/mobileads/VastVideoViewController;Z)Z

    .line 399
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1700(Lcom/mopub/mobileads/VastVideoViewController;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$400(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoConfig;->getRemainingProgressTrackerCount()I

    move-result p1

    if-nez p1, :cond_0

    .line 400
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$400(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object p1

    iget-object v2, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v2}, Lcom/mopub/mobileads/VastVideoViewController;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v3}, Lcom/mopub/mobileads/VastVideoViewController;->getCurrentPosition()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Lcom/mopub/mobileads/VastVideoConfig;->handleComplete(Landroid/content/Context;I)V

    .line 403
    :cond_0
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->val$videoView:Lcom/mopub/mobileads/VastVideoView;

    const/4 v2, 0x4

    invoke-virtual {p1, v2}, Lcom/mopub/mobileads/VastVideoView;->setVisibility(I)V

    .line 405
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1300(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoProgressBarWidget;

    move-result-object p1

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Lcom/mopub/mobileads/VastVideoProgressBarWidget;->setVisibility(I)V

    .line 407
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1000(Lcom/mopub/mobileads/VastVideoViewController;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 410
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1100(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 411
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1100(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object p1

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 412
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1100(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 416
    :cond_1
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$600(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 419
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1800(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoGradientStripWidget;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoGradientStripWidget;->notifyVideoComplete()V

    .line 420
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1900(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoGradientStripWidget;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoGradientStripWidget;->notifyVideoComplete()V

    .line 421
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$2000(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastVideoCtaButtonWidget;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->notifyVideoComplete()V

    .line 424
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$900(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 425
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->val$context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    if-ne p1, v1, :cond_3

    .line 427
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$2100(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 429
    :cond_3
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$2200(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 431
    :goto_1
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$900(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v1}, Lcom/mopub/mobileads/VastVideoViewController;->access$300(Lcom/mopub/mobileads/VastVideoViewController;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/mopub/mobileads/VastCompanionAdConfig;->handleImpression(Landroid/content/Context;I)V

    goto :goto_2

    .line 432
    :cond_4
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1100(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 434
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoViewController$4;->this$0:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoViewController;->access$1100(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_5
    :goto_2
    return-void
.end method
