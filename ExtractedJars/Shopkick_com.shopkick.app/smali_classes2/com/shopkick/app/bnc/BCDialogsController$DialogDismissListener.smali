.class Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;
.super Ljava/lang/Object;
.source "BCDialogsController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/BCDialogsController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DialogDismissListener"
.end annotation


# instance fields
.field private bcDialogsControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/bnc/BCDialogsController;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/bnc/BCDialogsController;)V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;->bcDialogsControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;->bcDialogsControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/bnc/BCDialogsController;

    if-eqz v0, :cond_0

    .line 151
    invoke-static {v0, p1}, Lcom/shopkick/app/bnc/BCDialogsController;->access$100(Lcom/shopkick/app/bnc/BCDialogsController;Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 141
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;->bcDialogsControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/bnc/BCDialogsController;

    if-eqz p2, :cond_0

    .line 143
    invoke-static {p2, p1}, Lcom/shopkick/app/bnc/BCDialogsController;->access$100(Lcom/shopkick/app/bnc/BCDialogsController;Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
