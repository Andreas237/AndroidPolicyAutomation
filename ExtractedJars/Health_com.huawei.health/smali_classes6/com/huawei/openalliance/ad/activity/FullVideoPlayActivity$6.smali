.class Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MuteListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMute()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    const-string v1, "n"

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setSoundSwitch(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onUnmute()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    const-string v1, "y"

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setSoundSwitch(Ljava/lang/String;)V

    :cond_0
    return-void
.end method