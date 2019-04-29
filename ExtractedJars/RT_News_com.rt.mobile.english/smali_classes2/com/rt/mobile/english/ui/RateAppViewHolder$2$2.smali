.class Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;
.super Ljava/lang/Object;
.source "RateAppViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/RateAppViewHolder$2;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 116
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/data/AppEventCounter;->setLastRateStatus(I)V

    .line 118
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "plain/text"

    .line 119
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.EMAIL"

    const/4 v1, 0x1

    .line 120
    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "webteam@rt.com"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.SUBJECT"

    const-string v1, "[RT News Android] Feedback"

    .line 121
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.TEXT"

    .line 122
    iget-object v1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->access$100(Lcom/rt/mobile/english/ui/RateAppViewHolder$2;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    iget-object v0, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->val$view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Send Email"

    invoke-static {p1, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 124
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    const-string v0, "SendReport"

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->access$000(Lcom/rt/mobile/english/ui/RateAppViewHolder;Ljava/lang/String;)V

    .line 125
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->val$listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;->onRateAppFinished()V

    return-void
.end method
