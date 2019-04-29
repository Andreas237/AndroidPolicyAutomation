.class Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$1;
.super Ljava/lang/Object;
.source "ViewDialogChangeSize.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->showDialog(Landroid/app/Activity;Landroid/webkit/WebSettings;Lcom/rt/mobile/english/Utils;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;

.field final synthetic val$dialog:Landroid/app/Dialog;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;Landroid/app/Dialog;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$1;->this$0:Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$1;->val$dialog:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 73
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$1;->val$dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
