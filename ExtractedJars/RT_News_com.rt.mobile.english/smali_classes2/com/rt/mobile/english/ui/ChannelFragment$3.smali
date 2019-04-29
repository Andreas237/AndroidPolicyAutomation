.class Lcom/rt/mobile/english/ui/ChannelFragment$3;
.super Ljava/lang/Object;
.source "ChannelFragment.java"

# interfaces
.implements Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;


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

    .line 219
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$3;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ccUpdated(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method public loadingChanged(Ljava/lang/Boolean;)V
    .locals 4

    .line 227
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$3;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$3;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public onPlayerError(I)V
    .locals 0

    return-void
.end method

.method public stateChanged(ILjava/lang/Boolean;)V
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 238
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 239
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$3;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_0
    return-void
.end method
