.class Lnet/hockeyapp/android/UpdateFragment$3;
.super Lnet/hockeyapp/android/listeners/DownloadFileListener;
.source "UpdateFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/hockeyapp/android/UpdateFragment;->startDownloadTask(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/hockeyapp/android/UpdateFragment;

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lnet/hockeyapp/android/UpdateFragment;Landroid/app/Activity;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lnet/hockeyapp/android/UpdateFragment$3;->this$0:Lnet/hockeyapp/android/UpdateFragment;

    iput-object p2, p0, Lnet/hockeyapp/android/UpdateFragment$3;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Lnet/hockeyapp/android/listeners/DownloadFileListener;-><init>()V

    return-void
.end method


# virtual methods
.method public downloadFailed(Lnet/hockeyapp/android/tasks/DownloadFileTask;Ljava/lang/Boolean;)V
    .locals 0

    .line 247
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 248
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateFragment$3;->this$0:Lnet/hockeyapp/android/UpdateFragment;

    iget-object p2, p0, Lnet/hockeyapp/android/UpdateFragment$3;->val$activity:Landroid/app/Activity;

    invoke-static {p1, p2}, Lnet/hockeyapp/android/UpdateFragment;->access$000(Lnet/hockeyapp/android/UpdateFragment;Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public downloadSuccessful(Lnet/hockeyapp/android/tasks/DownloadFileTask;)V
    .locals 0

    return-void
.end method
