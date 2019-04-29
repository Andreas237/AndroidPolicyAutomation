.class Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1$1;
.super Ljava/lang/Object;
.source "JCVideoPlayer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;


# direct methods
.method constructor <init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;)V
    .locals 0

    .line 424
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1$1;->this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 427
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1$1;->this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;->this$0:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-static {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->access$000(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    return-void
.end method
