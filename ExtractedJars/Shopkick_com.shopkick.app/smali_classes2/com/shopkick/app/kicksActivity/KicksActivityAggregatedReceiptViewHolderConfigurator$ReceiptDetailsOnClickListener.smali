.class Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;
.super Ljava/lang/Object;
.source "KicksActivityAggregatedReceiptViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReceiptDetailsOnClickListener"
.end annotation


# instance fields
.field private link:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;->this$0:Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;->link:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 110
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;->this$0:Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;->access$000(Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator$ReceiptDetailsOnClickListener;->link:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
