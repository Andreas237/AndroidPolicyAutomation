.class Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;
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

.field final synthetic val$utils:Lcom/rt/mobile/english/Utils;

.field final synthetic val$webSettings:Landroid/webkit/WebSettings;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;Lcom/rt/mobile/english/Utils;Landroid/webkit/WebSettings;Landroid/app/Dialog;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->this$0:Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    iput-object p3, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$webSettings:Landroid/webkit/WebSettings;

    iput-object p4, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$dialog:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 82
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->this$0:Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->access$000(Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;)Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    move-result-object p1

    invoke-virtual {p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->getProgress()I

    move-result p1

    const/16 v0, 0x64

    packed-switch p1, :pswitch_data_0

    .line 114
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto/16 :goto_0

    .line 111
    :pswitch_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 108
    :pswitch_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x8c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 105
    :pswitch_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 102
    :pswitch_3
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 99
    :pswitch_4
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 96
    :pswitch_5
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 93
    :pswitch_6
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 90
    :pswitch_7
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 87
    :pswitch_8
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    goto :goto_0

    .line 84
    :pswitch_9
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    const/16 v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/Utils;->setWebViewTextZoom(Ljava/lang/Integer;)V

    .line 118
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$webSettings:Landroid/webkit/WebSettings;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$utils:Lcom/rt/mobile/english/Utils;

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getWebViewTextZoom()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 119
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;->val$dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
