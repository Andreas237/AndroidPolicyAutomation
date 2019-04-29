.class Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;
.super Ljava/util/TimerTask;
.source "ChannelFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ChannelFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PauseHideTask"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ChannelFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V
    .locals 0

    .line 811
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 815
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 816
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask$1;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask$1;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
