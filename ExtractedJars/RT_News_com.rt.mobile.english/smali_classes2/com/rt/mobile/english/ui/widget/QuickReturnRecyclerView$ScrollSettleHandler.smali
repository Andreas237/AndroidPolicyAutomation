.class Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;
.super Landroid/os/Handler;
.source "QuickReturnRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ScrollSettleHandler"
.end annotation


# static fields
.field private static final SETTLE_DELAY_MILLIS:I = 0x64


# instance fields
.field private mSettleEnabled:Z

.field private mSettledScrollY:I

.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;


# direct methods
.method private constructor <init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    const/high16 p1, -0x80000000

    .line 219
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;)V
    .locals 0

    .line 216
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 239
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$600(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p1

    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    iget-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettleEnabled:Z

    if-eqz p1, :cond_1

    .line 241
    iget p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    int-to-float p1, p1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$200(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v1

    sub-float/2addr p1, v1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v1

    div-int/2addr v1, v0

    int-to-float v0, v1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    .line 242
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 243
    iget p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0

    .line 245
    :cond_0
    iget p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    .line 248
    :goto_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v1

    sub-int/2addr v1, p1

    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 249
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v0, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$502(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 250
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$200(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    :cond_1
    const/high16 p1, -0x80000000

    .line 252
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    return-void
.end method

.method public onScroll(I)V
    .locals 3

    .line 223
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "On Scroll: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    .line 226
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->removeMessages(I)V

    const-wide/16 v1, 0x64

    .line 227
    invoke-virtual {p0, v0, v1, v2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 228
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettledScrollY:I

    :cond_0
    return-void
.end method

.method public setSettleEnabled(Z)V
    .locals 0

    .line 233
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->mSettleEnabled:Z

    return-void
.end method
