.class Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;
.super Ljava/util/TimerTask;
.source "JCVideoPlayer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startProgressTimer()V
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

    .line 497
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 500
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 501
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2$1;

    invoke-direct {v1, p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2$1;-><init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
