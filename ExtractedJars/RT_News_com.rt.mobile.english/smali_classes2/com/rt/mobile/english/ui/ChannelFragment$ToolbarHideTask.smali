.class Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;
.super Ljava/util/TimerTask;
.source "ChannelFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ChannelFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ToolbarHideTask"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ChannelFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V
    .locals 0

    .line 786
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 790
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->access$100(Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/data/LivePlayerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->isPlaying()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 791
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask$1;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask$1;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
