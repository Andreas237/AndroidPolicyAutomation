.class Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2$1;
.super Ljava/lang/Object;
.source "JCVideoPlayer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;


# direct methods
.method constructor <init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;)V
    .locals 0

    .line 501
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2$1;->this$1:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 504
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v1, 0x595bb

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    .line 505
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v1

    invoke-virtual {v1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method
