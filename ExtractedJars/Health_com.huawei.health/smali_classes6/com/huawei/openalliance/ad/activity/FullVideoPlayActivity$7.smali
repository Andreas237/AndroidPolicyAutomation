.class Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    return-void
.end method

.method public a(Z)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onPauseManually: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    if-nez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setNeedContinueAutoPlay(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/views/i;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isNeedContinueAutoPlay()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->b(Z)V

    :cond_2
    return-void
.end method

.method public a(ZI)V
    .locals 0

    return-void
.end method

.method public b(ZI)V
    .locals 0

    return-void
.end method
