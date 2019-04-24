.class Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;
.super Ljava/lang/Object;
.source "WalkinSimulationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/onboarding/WalkinSimulationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$null$136(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    return-void
.end method

.method public static synthetic lambda$onClick$135(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$300(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f110786

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    return-void
.end method

.method public static synthetic lambda$onClick$137(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V
    .locals 4

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$LLaqVYNkprkRZEO68t5TKpMTWyM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$LLaqVYNkprkRZEO68t5TKpMTWyM;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V

    const-wide/16 v2, 0x1c2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static synthetic lambda$onClick$138(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;I)V
    .locals 3

    .line 258
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/16 v1, 0x258

    .line 259
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 p1, 0x1

    .line 260
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 261
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public static synthetic lambda$onClick$139(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    return-void
.end method

.method public static synthetic lambda$onClick$140(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V
    .locals 3

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$1000(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$1200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 224
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    iget-object v0, v0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 227
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$000(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V

    .line 229
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ViewFlipper;->clearAnimation()V

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$300(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$1100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 234
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$P70pAAwd_OZzyHl4bAPvggLR6Fs;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$P70pAAwd_OZzyHl4bAPvggLR6Fs;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 240
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    iget-object p1, p1, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x43480000    # 200.0f

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 243
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    int-to-float v1, p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v2, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/16 v1, 0x258

    .line 244
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    const/16 v1, 0x3e8

    int-to-long v1, v1

    .line 245
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setStartOffset(J)V

    const/4 v1, 0x1

    .line 246
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 247
    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->startAnimation(Landroid/view/animation/Animation;)V

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$LAraZC5chM5ZxmPFyUIOr4WpojM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$LAraZC5chM5ZxmPFyUIOr4WpojM;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V

    const/16 v2, 0x73a

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$vtvN2RAzau_gl6KBH_XQliTaOpY;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$vtvN2RAzau_gl6KBH_XQliTaOpY;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;I)V

    const/16 p1, 0xc1c

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 265
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$300(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    const/16 v1, 0xf6e

    invoke-static {v0, v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;I)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 268
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$BvKHpoyYN_4y3XfIAkKHtXCWSgw;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$BvKHpoyYN_4y3XfIAkKHtXCWSgw;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V

    const/16 v1, 0x1130

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 271
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$nqqv_kSV8Dev0sJnxjFXlxtKUHs;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$2$nqqv_kSV8Dev0sJnxjFXlxtKUHs;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;)V

    const/16 v1, 0x122a

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
