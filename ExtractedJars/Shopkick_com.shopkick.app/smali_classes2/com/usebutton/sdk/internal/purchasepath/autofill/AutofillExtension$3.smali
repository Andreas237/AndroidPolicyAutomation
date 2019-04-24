.class Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;
.super Ljava/lang/Object;
.source "AutofillExtension.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->displayAutofillFillCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

.field final synthetic val$card:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

.field final synthetic val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;->val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;->val$card:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 237
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;->val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;->val$card:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/purchasepath/CardList;->insertCard(Lcom/usebutton/sdk/purchasepath/Card;I)V

    .line 238
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillFillDisplayed()V

    return-void
.end method
