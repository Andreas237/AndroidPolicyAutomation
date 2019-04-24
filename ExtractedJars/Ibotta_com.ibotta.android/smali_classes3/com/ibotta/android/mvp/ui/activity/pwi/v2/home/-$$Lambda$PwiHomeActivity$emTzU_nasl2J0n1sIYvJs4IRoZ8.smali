.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$emTzU_nasl2J0n1sIYvJs4IRoZ8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$emTzU_nasl2J0n1sIYvJs4IRoZ8;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    return-void
.end method


# virtual methods
.method public final onPaymentMethodClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$emTzU_nasl2J0n1sIYvJs4IRoZ8;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->lambda$showPaymentMethodSelector$1(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    return-void
.end method
