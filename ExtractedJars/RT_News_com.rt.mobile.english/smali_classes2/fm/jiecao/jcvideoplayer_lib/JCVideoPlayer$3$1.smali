.class Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3$1;
.super Ljava/lang/Object;
.source "JCVideoPlayer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;


# direct methods
.method constructor <init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;)V
    .locals 0

    .line 632
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3$1;->this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 635
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 636
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3$1;->this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    const/4 v1, 0x1

    iput v1, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    return-void
.end method
