.class Lcom/mopub/mraid/MraidVideoViewController$1;
.super Ljava/lang/Object;
.source "MraidVideoViewController.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mraid/MraidVideoViewController;-><init>(Landroid/content/Context;Landroid/os/Bundle;Landroid/os/Bundle;Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mraid/MraidVideoViewController;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidVideoViewController;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/mopub/mraid/MraidVideoViewController$1;->this$0:Lcom/mopub/mraid/MraidVideoViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 44
    iget-object p1, p0, Lcom/mopub/mraid/MraidVideoViewController$1;->this$0:Lcom/mopub/mraid/MraidVideoViewController;

    invoke-static {p1}, Lcom/mopub/mraid/MraidVideoViewController;->access$000(Lcom/mopub/mraid/MraidVideoViewController;)Landroid/widget/ImageButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 45
    iget-object p1, p0, Lcom/mopub/mraid/MraidVideoViewController$1;->this$0:Lcom/mopub/mraid/MraidVideoViewController;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/mopub/mraid/MraidVideoViewController;->access$100(Lcom/mopub/mraid/MraidVideoViewController;Z)V

    return-void
.end method
