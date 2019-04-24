.class public Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail_ViewBinding;
.super Ljava/lang/Object;
.source "EarningsReversedDetail_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;

    const-string v0, "field \'tbvTitleBar\'"

    .line 22
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvTransactionAmount\'"

    .line 23
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tvTransactionAmount:Landroid/widget/TextView;

    const-string v0, "field \'tvTransactionDetail\'"

    .line 24
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tvTransactionDetail:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;

    .line 34
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 35
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tvTransactionAmount:Landroid/widget/TextView;

    .line 36
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tvTransactionDetail:Landroid/widget/TextView;

    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
