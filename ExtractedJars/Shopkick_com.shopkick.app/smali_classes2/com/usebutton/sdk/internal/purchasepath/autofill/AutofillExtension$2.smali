.class Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$2;
.super Ljava/lang/Object;
.source "AutofillExtension.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->hideAutofillCards(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

.field final synthetic val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$2;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$2;->val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$2;->val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

    const-string v1, "btn_autofill_save_card_key"

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    return-void
.end method
