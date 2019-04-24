.class Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$2;
.super Ljava/lang/Object;
.source "AutofillFillCard.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->onBindView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$2;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 104
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$2;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->access$1000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

    move-result-object p1

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;->onAutofillFillDeclined()V

    return-void
.end method
