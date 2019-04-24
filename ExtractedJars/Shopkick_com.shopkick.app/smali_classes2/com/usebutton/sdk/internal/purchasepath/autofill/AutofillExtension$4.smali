.class Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;
.super Ljava/lang/Object;
.source "AutofillExtension.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->displayAutofillSaveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

.field final synthetic val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

.field final synthetic val$card:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

.field final synthetic val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

.field final synthetic val$hasData:Z


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Z)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$card:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    iput-boolean p5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$hasData:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 295
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$cardList:Lcom/usebutton/sdk/purchasepath/CardList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$card:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/purchasepath/CardList;->insertCard(Lcom/usebutton/sdk/purchasepath/Card;I)V

    .line 296
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->showTopCard()V

    .line 298
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->val$hasData:Z

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillUpdateDisplayed()V

    goto :goto_0

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;->this$0:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillSaveDisplayed()V

    :goto_0
    return-void
.end method
