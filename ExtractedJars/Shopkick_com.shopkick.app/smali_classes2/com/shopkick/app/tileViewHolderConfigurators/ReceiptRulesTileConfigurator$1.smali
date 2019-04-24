.class Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator$1;
.super Ljava/lang/Object;
.source "ReceiptRulesTileConfigurator.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 92
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method
