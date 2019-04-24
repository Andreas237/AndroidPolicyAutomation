.class Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator$2;
.super Ljava/lang/Object;
.source "ReceiptRulesTileConfigurator.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;->setRules(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;

.field final synthetic val$finalAppScreen:Lcom/shopkick/app/screens/AppScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator$2;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator$2;->val$finalAppScreen:Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator$2;->val$finalAppScreen:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    return-void
.end method
