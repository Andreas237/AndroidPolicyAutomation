.class public Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView_ViewBinding;
.super Ljava/lang/Object;
.source "ExpiringBannerView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    const-string v0, "field \'ivBannerStart\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f090294

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStart:Landroid/widget/ImageView;

    const-string v0, "field \'ivBannerStartOverlay\'"

    .line 29
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f090295

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStartOverlay:Landroid/widget/ImageView;

    const-string v0, "field \'llBannerMiddle\'"

    .line 30
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0902fd

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->llBannerMiddle:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvExpirationText\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090521

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->tvExpirationText:Landroid/widget/TextView;

    const-string v0, "field \'ivBannerEnd\'"

    .line 32
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f090293

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerEnd:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStart:Landroid/widget/ImageView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerStartOverlay:Landroid/widget/ImageView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->llBannerMiddle:Landroid/widget/LinearLayout;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->tvExpirationText:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->ivBannerEnd:Landroid/widget/ImageView;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
