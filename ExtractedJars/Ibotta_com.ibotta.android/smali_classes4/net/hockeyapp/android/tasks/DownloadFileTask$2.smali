.class Lnet/hockeyapp/android/tasks/DownloadFileTask$2;
.super Ljava/lang/Object;
.source "DownloadFileTask.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/hockeyapp/android/tasks/DownloadFileTask;->onPostExecute(Ljava/lang/Long;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/hockeyapp/android/tasks/DownloadFileTask;


# direct methods
.method constructor <init>(Lnet/hockeyapp/android/tasks/DownloadFileTask;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/DownloadFileTask$2;->this$0:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 221
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/DownloadFileTask$2;->this$0:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    iget-object p1, p1, Lnet/hockeyapp/android/tasks/DownloadFileTask;->mNotifier:Lnet/hockeyapp/android/listeners/DownloadFileListener;

    iget-object p2, p0, Lnet/hockeyapp/android/tasks/DownloadFileTask$2;->this$0:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lnet/hockeyapp/android/listeners/DownloadFileListener;->downloadFailed(Lnet/hockeyapp/android/tasks/DownloadFileTask;Ljava/lang/Boolean;)V

    return-void
.end method
