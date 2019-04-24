.class public Lcom/ibotta/android/view/common/VerifyPurchasesButtonView_ViewBinding;
.super Ljava/lang/Object;
.source "VerifyPurchasesButtonView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView_ViewBinding;-><init>(Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView_ViewBinding;->target:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;

    const-string v0, "field \'ivBottom\'"

    .line 27
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f090299

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivBottom:Landroid/widget/ImageView;

    const-string v0, "field \'ivButton\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f09029b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivButton:Landroid/widget/ImageView;

    const-string v0, "field \'ivIcon\'"

    .line 29
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ac

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivIcon:Landroid/widget/ImageView;

    const-string v0, "field \'tvLabel\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090539

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->tvLabel:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView_ViewBinding;->target:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView_ViewBinding;->target:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivBottom:Landroid/widget/ImageView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivButton:Landroid/widget/ImageView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivIcon:Landroid/widget/ImageView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->tvLabel:Landroid/widget/TextView;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
