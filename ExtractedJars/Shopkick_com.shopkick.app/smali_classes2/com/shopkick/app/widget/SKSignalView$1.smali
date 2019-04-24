.class Lcom/shopkick/app/widget/SKSignalView$1;
.super Ljava/lang/Object;
.source "SKSignalView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/widget/SKSignalView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/SKSignalView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/SKSignalView;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object v0, v0, Lcom/shopkick/app/widget/SKSignalView;->indicatorButton:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_3

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    if-nez p1, :cond_0

    .line 84
    new-instance p1, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    .line 85
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSignalView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSignalView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110667

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    .line 87
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSignalView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f11014f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object v1, v1, Lcom/shopkick/app/widget/SKSignalView;->dialogListener:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    .line 93
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-boolean p1, p1, Lcom/shopkick/app/widget/SKSignalView;->isShowing:Z

    if-nez p1, :cond_3

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->presenceHelpText:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object v0, v0, Lcom/shopkick/app/widget/SKSignalView;->clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->presenceHelpText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 98
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {p1}, Lcom/shopkick/app/presence/AudioThreadController;->hadErrorRecording()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSignalView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110665

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 101
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSignalView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110666

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 104
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$1;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/shopkick/app/widget/SKSignalView;->isShowing:Z

    :cond_3
    return-void
.end method
