.class Lcom/ibotta/android/social/facebook/FacebookManager$1;
.super Ljava/lang/Object;
.source "FacebookManager.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/social/facebook/FacebookManager;->logIn()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/social/facebook/FacebookManager;


# direct methods
.method constructor <init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$1;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$1;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$100(Lcom/ibotta/android/social/facebook/FacebookManager;)Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;->hideFacebookLoading()V

    .line 193
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/CustomerResponse;

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$1;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/CustomerResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$200(Lcom/ibotta/android/social/facebook/FacebookManager;Lcom/ibotta/api/model/customer/Customer;)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$1;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$300(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    :goto_0
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    .line 186
    iget-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$1;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$100(Lcom/ibotta/android/social/facebook/FacebookManager;)Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$1;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$000(Lcom/ibotta/android/social/facebook/FacebookManager;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f1103d2

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;->showFacebookLoading(Ljava/lang/String;)V

    return-void
.end method
