.class public Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView_ViewBinding;
.super Ljava/lang/Object;
.source "StandardReceiptGuideView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView_ViewBinding;-><init>(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView_ViewBinding;->target:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

    const-string v0, "field \'llDynamicWidthContent\'"

    .line 30
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090306

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llDynamicWidthContent:Landroid/widget/LinearLayout;

    const-string v0, "field \'llLeftMargin\'"

    .line 31
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090310

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llLeftMargin:Landroid/widget/LinearLayout;

    const-string v0, "field \'vtvLeftEdge\'"

    .line 32
    const-class v1, Lcom/ibotta/android/commons/view/text/VerticalTextView;

    const v2, 0x7f0905ce

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/commons/view/text/VerticalTextView;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvLeftEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    const-string v0, "field \'llMiddle\'"

    .line 33
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090318

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llMiddle:Landroid/widget/LinearLayout;

    const-string v0, "field \'flGuide\'"

    .line 34
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901ef

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->flGuide:Landroid/widget/FrameLayout;

    const-string v0, "field \'tvTopOfReceipt\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTopOfReceipt:Landroid/widget/TextView;

    const-string v0, "field \'ivReceipt\'"

    .line 36
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902bf

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivReceipt:Landroid/widget/ImageView;

    const-string v0, "field \'ivPrevReceipt\'"

    .line 37
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902bb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    const-string v0, "field \'vDashes\'"

    const v1, 0x7f0905ae

    .line 38
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vDashes:Landroid/view/View;

    const-string v0, "field \'tvTapToFocus\'"

    .line 39
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090583

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTapToFocus:Landroid/widget/TextView;

    const-string v0, "field \'tvBottomTip\'"

    .line 40
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090501

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    const-string v0, "field \'llRightMargin\'"

    .line 41
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090326

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llRightMargin:Landroid/widget/LinearLayout;

    const-string v0, "field \'vtvRightEdge\'"

    .line 42
    const-class v1, Lcom/ibotta/android/commons/view/text/VerticalTextView;

    const v2, 0x7f0905cf

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/commons/view/text/VerticalTextView;

    iput-object p2, p1, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvRightEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView_ViewBinding;->target:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 50
    iput-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView_ViewBinding;->target:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llDynamicWidthContent:Landroid/widget/LinearLayout;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llLeftMargin:Landroid/widget/LinearLayout;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvLeftEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llMiddle:Landroid/widget/LinearLayout;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->flGuide:Landroid/widget/FrameLayout;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTopOfReceipt:Landroid/widget/TextView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivReceipt:Landroid/widget/ImageView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vDashes:Landroid/view/View;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTapToFocus:Landroid/widget/TextView;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llRightMargin:Landroid/widget/LinearLayout;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvRightEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    return-void

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
