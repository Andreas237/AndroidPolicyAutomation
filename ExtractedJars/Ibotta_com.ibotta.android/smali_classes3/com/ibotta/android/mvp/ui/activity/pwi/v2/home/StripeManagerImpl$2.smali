.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;
.super Ljava/lang/Object;
.source "StripeManagerImpl.java"

# interfaces
.implements Lcom/stripe/android/SourceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
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

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "Error creating source: "

    const/4 v1, 0x1

    .line 78
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;

    const-string v2, "Error creating source."

    invoke-direct {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;->onCreateSourceError(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/Source;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;->onCreateSourceSuccess(Lcom/stripe/android/model/Source;)V

    :cond_0
    return-void
.end method
