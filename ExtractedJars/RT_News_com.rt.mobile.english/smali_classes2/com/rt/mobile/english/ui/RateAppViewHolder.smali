.class public Lcom/rt/mobile/english/ui/RateAppViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "RateAppViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;
    }
.end annotation


# instance fields
.field appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

.field private mContext:Landroid/content/Context;

.field noButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090105
    .end annotation
.end field

.field textView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090191
    .end annotation
.end field

.field yesButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901b9
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 56
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 58
    iput-object p2, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder;->listener:Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;

    .line 59
    iput-object p3, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder;->mContext:Landroid/content/Context;

    .line 60
    iget-object p3, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/AppEventCounter;->rateAppShowed()V

    const-string p3, "Show"

    .line 61
    invoke-direct {p0, p3}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->sendEvent(Ljava/lang/String;)V

    .line 64
    iget-object p3, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder;->yesButton:Landroid/widget/Button;

    new-instance v0, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/rt/mobile/english/ui/RateAppViewHolder$1;-><init>(Lcom/rt/mobile/english/ui/RateAppViewHolder;Landroid/view/View;Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;)V

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    iget-object p3, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder;->noButton:Landroid/widget/Button;

    new-instance v0, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/rt/mobile/english/ui/RateAppViewHolder$2;-><init>(Lcom/rt/mobile/english/ui/RateAppViewHolder;Landroid/view/View;Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;)V

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/RateAppViewHolder;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/RateAppViewHolder;->sendEvent(Ljava/lang/String;)V

    return-void
.end method

.method private sendEvent(Ljava/lang/String;)V
    .locals 4

    .line 51
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder;->mContext:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    const-string v2, "RateMessage"

    const-string v3, ""

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/rt/mobile/english/Utils;->sendEvent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
