.class Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;
.super Ljava/lang/Object;
.source "AutofillSaveCard.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->onBindView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 125
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->access$1400(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

    move-result-object p1

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;->onAutofillSaveAccepted()V

    return-void
.end method
