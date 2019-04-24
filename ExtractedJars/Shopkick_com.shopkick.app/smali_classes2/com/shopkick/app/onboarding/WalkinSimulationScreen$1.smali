.class Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;
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

    .line 157
    iput-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$null$132(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;)V
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    return-void
.end method

.method public static synthetic lambda$onClick$133(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;)V
    .locals 4

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$1$XDmInA9BHkwHAbU5YwyZ10dSGdA;

    invoke-direct {v1, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$1$XDmInA9BHkwHAbU5YwyZ10dSGdA;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;)V

    const-wide/16 v2, 0x1c2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$300(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f110785

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public static synthetic lambda$onClick$134(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;)V
    .locals 5

    .line 190
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 191
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 193
    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080329

    invoke-static {v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 196
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v3, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {v3}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 198
    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f08032a

    invoke-static {v1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 201
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v3, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {v3}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$800(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Landroid/widget/TableLayout$LayoutParams;

    iget-object v2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    .line 209
    invoke-static {v2}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$700(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)F

    move-result v2

    const/4 v4, -0x1

    invoke-direct {v1, v4, v4, v2}, Landroid/widget/TableLayout$LayoutParams;-><init>(IIF)V

    .line 207
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1, v3}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$1000(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$500(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$500(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 160
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    iget-object v0, v0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 163
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$000(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$1$G2J0RJwzrS3KW-hTp7llihVVnFU;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$1$G2J0RJwzrS3KW-hTp7llihVVnFU;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;)V

    const/16 v1, 0x1c2

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 174
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$300(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    const/16 v1, 0x6a4

    invoke-static {v0, v1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;I)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 176
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    iget-object p1, p1, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x43a50000    # 330.0f

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 178
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/16 v1, 0x258

    .line 179
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 p1, 0x1

    .line 180
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    const/16 p1, 0x76c

    int-to-long v1, p1

    .line 182
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->startAnimation(Landroid/view/animation/Animation;)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->setVisibility(I)V

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {v0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$500(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    iget-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;->this$0:Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-static {p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$1$UsMVpepbJKqg89XUUwsW-64cFGI;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$1$UsMVpepbJKqg89XUUwsW-64cFGI;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;)V

    const/16 v1, 0xabe

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
