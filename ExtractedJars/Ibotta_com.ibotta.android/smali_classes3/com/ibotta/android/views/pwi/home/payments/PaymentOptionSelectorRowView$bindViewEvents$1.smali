.class final Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;
.super Ljava/lang/Object;
.source "PaymentOptionSelectorRowView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;)V
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
.field final synthetic $viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;

.field final synthetic this$0:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;->this$0:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;

    iput-object p2, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;->$viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;->$viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;->this$0:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;

    invoke-static {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->access$getViewState$p(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;->onClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    return-void
.end method
