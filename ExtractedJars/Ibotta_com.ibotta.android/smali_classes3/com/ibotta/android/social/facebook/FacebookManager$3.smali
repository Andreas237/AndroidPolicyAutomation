.class Lcom/ibotta/android/social/facebook/FacebookManager$3;
.super Ljava/lang/Object;
.source "FacebookManager.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/social/facebook/FacebookManager;->linkFacebookToIbotta()V
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

    .line 260
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$3;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$onApiJobFinished$0(Lcom/ibotta/api/ApiResponse;)Ljava/lang/Integer;
    .locals 0

    .line 276
    invoke-virtual {p0}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 5

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$3;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$100(Lcom/ibotta/android/social/facebook/FacebookManager;)Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;->hideFacebookLoading()V

    .line 270
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    iget-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$3;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$600(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    goto :goto_0

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$3;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$700(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    .line 275
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    const/4 v1, -0x1

    .line 276
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/social/facebook/-$$Lambda$FacebookManager$3$WXrSUBMwKfri1N6gHPfF6eQrbiM;

    invoke-direct {v2, v0}, Lcom/ibotta/android/social/facebook/-$$Lambda$FacebookManager$3$WXrSUBMwKfri1N6gHPfF6eQrbiM;-><init>(Lcom/ibotta/api/ApiResponse;)V

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 277
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Outcome: %1$s | Response Code: %2$d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 278
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/Outcome;->name()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v4

    const/4 p1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    .line 277
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 279
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    .line 263
    iget-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$3;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$100(Lcom/ibotta/android/social/facebook/FacebookManager;)Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$3;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$000(Lcom/ibotta/android/social/facebook/FacebookManager;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f1103e1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;->showFacebookLoading(Ljava/lang/String;)V

    return-void
.end method
