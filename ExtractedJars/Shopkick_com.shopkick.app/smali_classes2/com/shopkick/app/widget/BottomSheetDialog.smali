.class public Lcom/shopkick/app/widget/BottomSheetDialog;
.super Landroid/app/Dialog;
.source "BottomSheetDialog.java"


# instance fields
.field private contentView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    const v0, 0x7f120147

    .line 19
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BottomSheetDialog;->setCancelable(Z)V

    .line 22
    invoke-virtual {p0, p3}, Lcom/shopkick/app/widget/BottomSheetDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BottomSheetDialog;->setCancelable(Z)V

    .line 26
    :goto_0
    iput-object p2, p0, Lcom/shopkick/app/widget/BottomSheetDialog;->contentView:Landroid/view/View;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 31
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 32
    iget-object p1, p0, Lcom/shopkick/app/widget/BottomSheetDialog;->contentView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/BottomSheetDialog;->setContentView(Landroid/view/View;)V

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/widget/BottomSheetDialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v0, -0x2

    .line 34
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v0, 0x50

    .line 35
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/widget/BottomSheetDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/widget/BottomSheetDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method
