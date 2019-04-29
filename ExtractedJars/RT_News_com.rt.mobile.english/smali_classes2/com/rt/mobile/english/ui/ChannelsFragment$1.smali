.class Lcom/rt/mobile/english/ui/ChannelsFragment$1;
.super Ljava/lang/Object;
.source "ChannelsFragment.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ChannelsFragment;->onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ChannelsFragment;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 221
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "page selected for stopping= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->access$100(Lcom/rt/mobile/english/ui/ChannelsFragment;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/rt/mobile/english/ui/PagerFragment;->getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->access$002(Lcom/rt/mobile/english/ui/ChannelsFragment;Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/ui/ChannelFragment;

    add-int/lit8 v0, p1, -0x1

    if-ltz v0, :cond_0

    .line 224
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->access$100(Lcom/rt/mobile/english/ui/ChannelsFragment;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->stopPlayingOnScroll()V

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 226
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getPageCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 227
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->access$100(Lcom/rt/mobile/english/ui/ChannelsFragment;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->stopPlayingOnScroll()V

    .line 230
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ChannelsFragment;->chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-boolean v0, v0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    if-eqz v0, :cond_2

    .line 231
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;->this$0:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->access$100(Lcom/rt/mobile/english/ui/ChannelsFragment;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/PagerFragment;->getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->playChromecast()V

    :cond_2
    return-void
.end method
