.class Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$1;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "SettingPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->onLogOutClicked()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;Lcom/ibotta/api/ApiCall;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method


# virtual methods
.method protected onBeforeApiCall()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 174
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onBeforeApiCall()V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->flushNow()V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->flushNow()V

    return-void
.end method
