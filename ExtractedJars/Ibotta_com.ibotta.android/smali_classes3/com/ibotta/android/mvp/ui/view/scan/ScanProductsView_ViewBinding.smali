.class public Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView_ViewBinding;
.super Ljava/lang/Object;
.source "ScanProductsView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    const-string v0, "field \'tvScanProgress\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09056e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->tvScanProgress:Landroid/widget/TextView;

    const-string v0, "field \'llProductRows\'"

    .line 28
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09031f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->llProductRows:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->tvScanProgress:Landroid/widget/TextView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->llProductRows:Landroid/widget/LinearLayout;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
