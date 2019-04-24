.class Lcom/shopkick/app/products/ScanScreen$26;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ScanScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanScreen;->maybeShowTooltip()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScanScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    .line 1696
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$26;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1699
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 1700
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$26;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ScanScreen;->access$1600(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getProductUnavailableReportTooltipDisplayCount()I

    move-result p1

    .line 1701
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$26;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanScreen;->access$1600(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/AppPreferences;->setProductUnavailableReportTooltipDisplayCount(I)V

    return-void
.end method
