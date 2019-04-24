.class Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ScanScreenTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->animateReportButtonToolTip(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 205
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getProductUnavailableReportTooltipDisplayCount()I

    move-result p1

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/AppPreferences;->setProductUnavailableReportTooltipDisplayCount(I)V

    return-void
.end method
