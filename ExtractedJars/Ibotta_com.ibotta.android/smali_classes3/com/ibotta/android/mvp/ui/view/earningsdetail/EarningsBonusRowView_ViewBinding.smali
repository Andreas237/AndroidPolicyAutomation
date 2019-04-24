.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_ViewBinding;
.super Ljava/lang/Object;
.source "EarningsBonusRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    const-string v0, "field \'vTopDivider\'"

    const v1, 0x7f0905bc

    .line 28
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vTopDivider:Landroid/view/View;

    const-string v0, "field \'llContent\'"

    .line 29
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090303

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->llContent:Landroid/widget/LinearLayout;

    const-string v0, "field \'bpvBonusProgress\'"

    .line 30
    const-class v1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    const v2, 0x7f0900c0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    const-string v0, "field \'tvBonusName\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090500

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->tvBonusName:Landroid/widget/TextView;

    const-string v0, "field \'vBottomSpace\'"

    const v1, 0x7f0905ad

    .line 32
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vBottomSpace:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vTopDivider:Landroid/view/View;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->llContent:Landroid/widget/LinearLayout;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->tvBonusName:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vBottomSpace:Landroid/view/View;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
