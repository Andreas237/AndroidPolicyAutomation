.class Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$1;
.super Ljava/lang/Object;
.source "AbstractResponseDialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$1;->this$0:Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 0

    .line 56
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$1;->this$0:Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->onDialogShown()V

    return-void
.end method
