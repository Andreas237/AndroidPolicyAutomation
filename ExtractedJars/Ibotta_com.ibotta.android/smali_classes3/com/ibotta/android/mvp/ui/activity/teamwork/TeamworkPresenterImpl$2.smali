.class Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;
.super Ljava/lang/Object;
.source "TeamworkPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->onRemoveConfirmed(Lcom/ibotta/android/view/model/FriendItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 302
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->hideRemovingFriendMessage()V

    .line 303
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->access$300(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->showRemovedFriendSuccess()V

    .line 304
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->access$400(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)V

    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 297
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->showRemovingFriendMessage()V

    return-void
.end method
