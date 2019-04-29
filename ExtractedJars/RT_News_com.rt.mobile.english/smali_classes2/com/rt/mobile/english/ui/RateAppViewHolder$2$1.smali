.class Lcom/rt/mobile/english/ui/RateAppViewHolder$2$1;
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

    .line 104
    iput-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 107
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/data/AppEventCounter;->setLastRateStatus(I)V

    .line 108
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->this$0:Lcom/rt/mobile/english/ui/RateAppViewHolder;

    const-string v0, "DeclineSendReport"

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->access$000(Lcom/rt/mobile/english/ui/RateAppViewHolder;Ljava/lang/String;)V

    .line 109
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2$1;->this$1:Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;->val$listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;->onRateAppFinished()V

    return-void
.end method
