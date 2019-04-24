.class Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$2;
.super Ljava/lang/Object;
.source "AbstractResponseDialogFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->onDialogShown()V
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

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$2;->this$0:Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$2;->this$0:Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment$2;->this$0:Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->dismissAllowingStateLoss()V

    :cond_0
    return-void
.end method
