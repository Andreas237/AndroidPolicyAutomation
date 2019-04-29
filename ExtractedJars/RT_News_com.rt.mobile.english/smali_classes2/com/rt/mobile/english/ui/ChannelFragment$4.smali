.class Lcom/rt/mobile/english/ui/ChannelFragment$4;
.super Ljava/lang/Object;
.source "ChannelFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ChannelFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ChannelFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$4;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 246
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$4;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->access$100(Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/data/LivePlayerWrapper;

    move-result-object p1

    const-string v0, "Select"

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$4;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->showSelectCCDiag(Ljava/lang/String;Landroid/app/Activity;)V

    return-void
.end method
