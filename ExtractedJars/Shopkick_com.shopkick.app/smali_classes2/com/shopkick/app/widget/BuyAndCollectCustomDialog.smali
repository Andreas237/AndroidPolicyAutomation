.class public Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;
.super Landroid/app/Dialog;
.source "BuyAndCollectCustomDialog.java"


# instance fields
.field contentView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    const v0, 0x7f12022d

    .line 14
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->setCancelable(Z)V

    .line 16
    iput-object p2, p0, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->contentView:Landroid/view/View;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    const v0, 0x7f12022d

    .line 20
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    .line 22
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->setCancelable(Z)V

    .line 23
    invoke-virtual {p0, p3}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->setCancelable(Z)V

    .line 27
    :goto_0
    iput-object p2, p0, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->contentView:Landroid/view/View;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 32
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 33
    iget-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->contentView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method
