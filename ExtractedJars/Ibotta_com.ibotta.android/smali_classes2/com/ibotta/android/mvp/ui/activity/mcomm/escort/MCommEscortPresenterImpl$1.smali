.class Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "MCommEscortPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;

.field final synthetic val$startTime:J


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;Lcom/ibotta/api/ApiCall;J)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;

    iput-wide p3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;->val$startTime:J

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 205
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;

    iget-wide v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;->val$startTime:J

    invoke-static {v0, v1, v2, p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;JLcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method
