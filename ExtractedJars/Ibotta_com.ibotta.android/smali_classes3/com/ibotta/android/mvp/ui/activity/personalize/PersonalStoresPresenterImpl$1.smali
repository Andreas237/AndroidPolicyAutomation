.class Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl$1;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "PersonalStoresPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->onNextClicked()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;

.field final synthetic val$start:J


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;Lcom/ibotta/api/ApiCall;J)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;

    iput-wide p3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl$1;->val$start:J

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 293
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 295
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl$1;->val$start:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    sub-long/2addr v2, v0

    .line 299
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
