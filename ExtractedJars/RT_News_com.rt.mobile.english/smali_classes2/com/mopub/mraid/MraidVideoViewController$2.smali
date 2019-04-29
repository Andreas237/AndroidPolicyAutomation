.class Lcom/mopub/mraid/MraidVideoViewController$2;
.super Ljava/lang/Object;
.source "MraidVideoViewController.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


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

    .line 49
    iput-object p1, p0, Lcom/mopub/mraid/MraidVideoViewController$2;->this$0:Lcom/mopub/mraid/MraidVideoViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 52
    iget-object p1, p0, Lcom/mopub/mraid/MraidVideoViewController$2;->this$0:Lcom/mopub/mraid/MraidVideoViewController;

    invoke-static {p1}, Lcom/mopub/mraid/MraidVideoViewController;->access$000(Lcom/mopub/mraid/MraidVideoViewController;)Landroid/widget/ImageButton;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 53
    iget-object p1, p0, Lcom/mopub/mraid/MraidVideoViewController$2;->this$0:Lcom/mopub/mraid/MraidVideoViewController;

    invoke-static {p1, p2}, Lcom/mopub/mraid/MraidVideoViewController;->access$200(Lcom/mopub/mraid/MraidVideoViewController;Z)V

    return p2
.end method
