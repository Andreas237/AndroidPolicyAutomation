.class Lcom/shopkick/app/widget/SKSignalView$2;
.super Ljava/lang/Object;
.source "SKSignalView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$2;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 115
    iget-object p2, p0, Lcom/shopkick/app/widget/SKSignalView$2;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p2, p2, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    if-ne p1, p2, :cond_0

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$2;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    iget-object p1, p1, Lcom/shopkick/app/widget/SKSignalView;->dialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView$2;->this$0:Lcom/shopkick/app/widget/SKSignalView;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/shopkick/app/widget/SKSignalView;->isShowing:Z

    :cond_0
    return-void
.end method
