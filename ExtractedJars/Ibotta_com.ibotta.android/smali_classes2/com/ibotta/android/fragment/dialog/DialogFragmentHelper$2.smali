.class Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;
.super Ljava/lang/Object;
.source "DialogFragmentHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

.field final synthetic val$ms:Lcom/ibotta/android/activity/CompatSupplier;

.field final synthetic val$tag:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->this$0:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$ms:Lcom/ibotta/android/activity/CompatSupplier;

    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$tag:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$ms:Lcom/ibotta/android/activity/CompatSupplier;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string v0, "Failed to hide DialogFragment, supplier is null: tag=%1$s"

    .line 68
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$tag:Ljava/lang/String;

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 71
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/activity/CompatSupplier;->getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Failed to hide DialogFragment, manager is null: tag=%1$s"

    .line 73
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$tag:Ljava/lang/String;

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->this$0:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$ms:Lcom/ibotta/android/activity/CompatSupplier;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;->val$tag:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hideSync(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    return-void
.end method
