.class Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask$1;
.super Ljava/lang/Object;
.source "ChannelFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;)V
    .locals 0

    .line 816
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask$1;->this$1:Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 820
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask$1;->this$1:Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->access$400(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    return-void
.end method
