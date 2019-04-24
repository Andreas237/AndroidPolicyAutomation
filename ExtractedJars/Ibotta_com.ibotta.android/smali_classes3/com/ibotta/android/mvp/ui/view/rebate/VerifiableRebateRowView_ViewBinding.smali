.class public Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_ViewBinding;
.super Ljava/lang/Object;
.source "VerifiableRebateRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    const-string v0, "field \'ibCheck\'"

    .line 29
    const-class v1, Landroid/widget/ImageButton;

    const v2, 0x7f09022f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ibCheck:Landroid/widget/ImageButton;

    const-string v0, "field \'ivProduct\'"

    .line 30
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902bc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ivProduct:Landroid/widget/ImageView;

    const-string v0, "field \'rivIndicator\'"

    .line 31
    const-class v1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    const v2, 0x7f0903ca

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    const-string v0, "field \'tvAmount\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904ee

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvAmount:Landroid/widget/TextView;

    const-string v0, "field \'tvName\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvName:Landroid/widget/TextView;

    const-string v0, "field \'tvMultiples\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    const-string v0, "field \'mcvCount\'"

    .line 35
    const-class v1, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    const v2, 0x7f090353

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 43
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ibCheck:Landroid/widget/ImageButton;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ivProduct:Landroid/widget/ImageView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvAmount:Landroid/widget/TextView;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvName:Landroid/widget/TextView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
