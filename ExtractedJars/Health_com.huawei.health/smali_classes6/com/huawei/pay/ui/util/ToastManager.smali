.class public Lcom/huawei/pay/ui/util/ToastManager;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static show(Landroid/content/Context;I)V
    .locals 1

    .line 34
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;II)V

    .line 35
    return-void
.end method

.method public static show(Landroid/content/Context;II)V
    .locals 1

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;I)V

    .line 52
    return-void
.end method

.method public static show(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 46
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;I)V

    .line 47
    return-void
.end method

.method public static show(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 6

    .line 56
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 57
    sget v0, Lcom/huawei/paycommonbase/R$layout;->hwpay_toast:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 58
    sget v0, Lcom/huawei/paycommonbase/R$id;->hb_toast:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 59
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    new-instance v5, Landroid/widget/Toast;

    invoke-direct {v5, p0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 62
    invoke-virtual {v5, v3}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 63
    invoke-virtual {v5, p2}, Landroid/widget/Toast;->setDuration(I)V

    .line 64
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 65
    return-void
.end method
