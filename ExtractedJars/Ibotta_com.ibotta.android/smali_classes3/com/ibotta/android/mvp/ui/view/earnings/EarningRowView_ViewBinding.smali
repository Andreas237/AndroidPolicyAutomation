.class public Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_ViewBinding;
.super Ljava/lang/Object;
.source "EarningRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    const-string v0, "field \'ivIcon\'"

    .line 27
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ac

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->ivIcon:Landroid/widget/ImageView;

    const-string v0, "field \'tvTitle\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090587

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvDate\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090512

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDate:Landroid/widget/TextView;

    const-string v0, "field \'tvDateValue\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090513

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    const-string v0, "field \'tvTotalEarnings\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarnings:Landroid/widget/TextView;

    const-string v0, "field \'tvTotalEarningsValue\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    const-string v0, "field \'tvAmountPending\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904f3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPending:Landroid/widget/TextView;

    const-string v0, "field \'tvAmountPendingValue\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904f4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    const-string v0, "field \'tvOtherRewards\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090558

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewards:Landroid/widget/TextView;

    const-string v0, "field \'tvOtherRewardsValue\'"

    .line 36
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090559

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewardsValue:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 44
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->ivIcon:Landroid/widget/ImageView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTitle:Landroid/widget/TextView;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDate:Landroid/widget/TextView;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarnings:Landroid/widget/TextView;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPending:Landroid/widget/TextView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewards:Landroid/widget/TextView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewardsValue:Landroid/widget/TextView;

    return-void

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
