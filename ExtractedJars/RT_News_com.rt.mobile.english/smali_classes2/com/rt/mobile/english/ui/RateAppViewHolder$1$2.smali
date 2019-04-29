.class Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;
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

    .line 85
    iput-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 88
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/data/AppEventCounter;->setLastRateStatus(I)V

    .line 89
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    const-string v0, "DeclineReviewInStore"

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->access$000(Lcom/rt/mobile/english/ui/RateAppViewHolder;Ljava/lang/String;)V

    .line 90
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1$2;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;->val$listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;->onRateAppFinished()V

    return-void
.end method
