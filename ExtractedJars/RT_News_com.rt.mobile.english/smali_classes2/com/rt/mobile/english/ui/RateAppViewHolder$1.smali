.class Lcom/rt/mobile/english/ui/RateAppViewHolder$1;
.super Ljava/lang/Object;
.source "RateAppViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/RateAppViewHolder;-><init>(Landroid/view/View;Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

.field final synthetic val$listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/RateAppViewHolder;Landroid/view/View;Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$view:Landroid/view/View;

    iput-object p3, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 68
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->textView:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f100103

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->yesButton:Landroid/widget/Button;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1000b6

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->noButton:Landroid/widget/Button;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1000e8

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    const-string v0, "Like"

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->access$000(Lcom/rt/mobile/english/ui/RateAppViewHolder;Ljava/lang/String;)V

    .line 73
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->yesButton:Landroid/widget/Button;

    new-instance v0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$1;-><init>(Lcom/rt/mobile/english/ui/RateAppViewHolder$1;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->noButton:Landroid/widget/Button;

    new-instance v0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;-><init>(Lcom/rt/mobile/english/ui/RateAppViewHolder$1;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
