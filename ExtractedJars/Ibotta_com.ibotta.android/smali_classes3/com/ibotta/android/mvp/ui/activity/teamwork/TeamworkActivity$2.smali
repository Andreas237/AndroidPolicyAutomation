.class Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;
.super Ljava/lang/Object;
.source "TeamworkActivity.java"

# interfaces
.implements Lcom/facebook/FacebookCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->doFacebookShare(Lcom/facebook/share/internal/ShareFeedContent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/FacebookCallback<",
        "Lcom/facebook/share/Sharer$Result;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    const-string v0, "doFacebookShare onCancel"

    const/4 v1, 0x0

    .line 297
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Lcom/facebook/FacebookException;)V
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110162

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 303
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/facebook/share/Sharer$Result;)V
    .locals 1

    .line 292
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    const v0, 0x7f110163

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 289
    check-cast p1, Lcom/facebook/share/Sharer$Result;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity$2;->onSuccess(Lcom/facebook/share/Sharer$Result;)V

    return-void
.end method
