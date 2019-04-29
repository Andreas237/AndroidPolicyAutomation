.class Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;
.super Ljava/util/TimerTask;
.source "JCVideoPlayer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;


# direct methods
.method constructor <init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 422
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v1

    iget-object v1, v1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 424
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1$1;

    invoke-direct {v1, p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1$1;-><init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
