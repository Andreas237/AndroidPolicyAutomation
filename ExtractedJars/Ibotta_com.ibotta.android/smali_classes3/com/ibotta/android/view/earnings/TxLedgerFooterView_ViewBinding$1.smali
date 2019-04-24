.class Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "TxLedgerFooterView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding;-><init>(Lcom/ibotta/android/view/earnings/TxLedgerFooterView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding;Lcom/ibotta/android/view/earnings/TxLedgerFooterView;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding$1;->this$0:Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding$1;->val$target:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 36
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView_ViewBinding$1;->val$target:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->onNeedHelpClicked()V

    return-void
.end method
