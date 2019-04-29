.class Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;
.super Ljava/lang/Object;
.source "RateAppViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/RateAppViewHolder$1;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 76
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/data/AppEventCounter;->setLastRateStatus(I)V

    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "market://details?id="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 78
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 79
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$view:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 80
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    const-string v0, "ReviewInStore"

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->access$000(Lcom/rt/mobile/english/ui/RateAppViewHolder;Ljava/lang/String;)V

    .line 81
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;->onRateAppFinished()V

    return-void
.end method
