.class Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;
.super Ljava/lang/Object;
.source "BuyAndCollectLoyaltyProgramDialogController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;->this$0:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;->this$0:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    iget-object p1, p1, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;->this$0:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    iget-object p1, p1, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->callback:Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

    invoke-interface {p1}, Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;->dialogCanceled()V

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;->this$0:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-static {p1}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->access$000(Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;)V

    :cond_0
    return-void
.end method
