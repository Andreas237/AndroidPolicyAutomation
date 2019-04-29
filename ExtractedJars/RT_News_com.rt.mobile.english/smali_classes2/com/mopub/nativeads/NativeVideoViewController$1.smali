.class Lcom/mopub/nativeads/NativeVideoViewController$1;
.super Ljava/lang/Object;
.source "NativeVideoViewController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/NativeVideoViewController;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/NativeVideoViewController;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/NativeVideoViewController;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/mopub/nativeads/NativeVideoViewController$1;->this$0:Lcom/mopub/nativeads/NativeVideoViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 101
    iget-object p1, p0, Lcom/mopub/nativeads/NativeVideoViewController$1;->this$0:Lcom/mopub/nativeads/NativeVideoViewController;

    invoke-static {p1}, Lcom/mopub/nativeads/NativeVideoViewController;->access$000(Lcom/mopub/nativeads/NativeVideoViewController;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 102
    iget-object p1, p0, Lcom/mopub/nativeads/NativeVideoViewController$1;->this$0:Lcom/mopub/nativeads/NativeVideoViewController;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/mopub/nativeads/NativeVideoViewController;->access$002(Lcom/mopub/nativeads/NativeVideoViewController;Z)Z

    .line 103
    iget-object p1, p0, Lcom/mopub/nativeads/NativeVideoViewController$1;->this$0:Lcom/mopub/nativeads/NativeVideoViewController;

    invoke-static {p1}, Lcom/mopub/nativeads/NativeVideoViewController;->access$100(Lcom/mopub/nativeads/NativeVideoViewController;)Lcom/mopub/nativeads/NativeFullScreenVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeFullScreenVideoView;->resetProgress()V

    .line 104
    iget-object p1, p0, Lcom/mopub/nativeads/NativeVideoViewController$1;->this$0:Lcom/mopub/nativeads/NativeVideoViewController;

    invoke-static {p1}, Lcom/mopub/nativeads/NativeVideoViewController;->access$200(Lcom/mopub/nativeads/NativeVideoViewController;)Lcom/mopub/nativeads/NativeVideoController;

    move-result-object p1

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/mopub/nativeads/NativeVideoController;->seekTo(J)V

    .line 106
    :cond_0
    iget-object p1, p0, Lcom/mopub/nativeads/NativeVideoViewController$1;->this$0:Lcom/mopub/nativeads/NativeVideoViewController;

    sget-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->PLAYING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    invoke-virtual {p1, v0}, Lcom/mopub/nativeads/NativeVideoViewController;->applyState(Lcom/mopub/nativeads/NativeVideoViewController$VideoState;)V

    return-void
.end method
