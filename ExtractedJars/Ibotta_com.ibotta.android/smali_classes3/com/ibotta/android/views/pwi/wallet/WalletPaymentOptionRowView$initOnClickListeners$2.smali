.class final Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;
.super Ljava/lang/Object;
.source "WalletPaymentOptionRowView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->initOnClickListeners(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "onClick"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $viewEvents:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;

.field final synthetic this$0:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;->this$0:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;

    iput-object p2, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;->$viewEvents:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;->$viewEvents:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;->this$0:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;

    invoke-static {v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->access$getViewState$p(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;)Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;->onClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method