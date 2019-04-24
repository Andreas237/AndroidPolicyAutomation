.class Lnet/hockeyapp/android/FeedbackActivity$3;
.super Ljava/lang/Object;
.source "FeedbackActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/hockeyapp/android/FeedbackActivity;->resetFeedbackView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/hockeyapp/android/FeedbackActivity;


# direct methods
.method constructor <init>(Lnet/hockeyapp/android/FeedbackActivity;)V
    .locals 0

    .line 675
    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity$3;->this$0:Lnet/hockeyapp/android/FeedbackActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 678
    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object v0

    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity$3;->this$0:Lnet/hockeyapp/android/FeedbackActivity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lnet/hockeyapp/android/utils/PrefsUtil;->saveFeedbackTokenToPrefs(Landroid/content/Context;Ljava/lang/String;)V

    .line 680
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity$3;->this$0:Lnet/hockeyapp/android/FeedbackActivity;

    const-string v1, "net.hockeyapp.android.feedback"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lnet/hockeyapp/android/FeedbackActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 681
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "idLastMessageSend"

    .line 682
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "idLastMessageProcessed"

    .line 683
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 684
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 686
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity$3;->this$0:Lnet/hockeyapp/android/FeedbackActivity;

    invoke-virtual {v0, v2}, Lnet/hockeyapp/android/FeedbackActivity;->configureFeedbackView(Z)V

    return-void
.end method
