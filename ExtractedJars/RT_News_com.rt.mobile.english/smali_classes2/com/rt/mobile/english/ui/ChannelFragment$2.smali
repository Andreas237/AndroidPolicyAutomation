.class Lcom/rt/mobile/english/ui/ChannelFragment$2;
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

    .line 209
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment$2;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment$2;->this$0:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->access$000(Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/ui/ChannelFragment;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->onClick(Landroid/view/View;)V

    return-void
.end method
