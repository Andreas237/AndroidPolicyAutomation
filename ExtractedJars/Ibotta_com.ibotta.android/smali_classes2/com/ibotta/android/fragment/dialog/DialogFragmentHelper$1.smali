.class Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;
.super Ljava/lang/Object;
.source "DialogFragmentHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

.field final synthetic val$df:Landroid/support/v4/app/DialogFragment;

.field final synthetic val$ms:Lcom/ibotta/android/activity/CompatSupplier;

.field final synthetic val$tag:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->this$0:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->val$ms:Lcom/ibotta/android/activity/CompatSupplier;

    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->val$df:Landroid/support/v4/app/DialogFragment;

    iput-object p4, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->val$tag:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->this$0:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->val$ms:Lcom/ibotta/android/activity/CompatSupplier;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->val$df:Landroid/support/v4/app/DialogFragment;

    iget-object v3, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;->val$tag:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->showSync(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method
