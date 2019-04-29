.class Lcom/rt/mobile/english/ui/ChannelFragment$5;
.super Ljava/lang/Object;
.source "ChannelFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ChannelFragment;->hideToolbar()V
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

    .line 363
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$5;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 371
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$5;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 372
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$5;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->access$202(Lcom/rt/mobile/english/ui/ChannelFragment;Z)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
