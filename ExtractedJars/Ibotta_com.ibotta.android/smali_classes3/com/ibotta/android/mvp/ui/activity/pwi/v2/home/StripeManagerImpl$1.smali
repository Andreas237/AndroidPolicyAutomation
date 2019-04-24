.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;
.super Ljava/lang/Object;
.source "StripeManagerImpl.java"

# interfaces
.implements Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->retrieveStripeCurrentCustomer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;->onSuccess(Lcom/stripe/android/model/Customer;)V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
