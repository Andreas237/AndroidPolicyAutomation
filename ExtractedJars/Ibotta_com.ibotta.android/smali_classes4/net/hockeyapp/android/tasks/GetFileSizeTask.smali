.class public Lnet/hockeyapp/android/tasks/GetFileSizeTask;
.super Lnet/hockeyapp/android/tasks/DownloadFileTask;
.source "GetFileSizeTask.java"


# instance fields
.field private mSize:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lnet/hockeyapp/android/tasks/DownloadFileTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Long;
    .locals 2

    .line 28
    :try_start_0
    new-instance p1, Ljava/net/URL;

    invoke-virtual {p0}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->getURLString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x6

    .line 29
    invoke-virtual {p0, p1, v0}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->createConnection(Ljava/net/URL;I)Ljava/net/URLConnection;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    const-wide/16 v0, 0x0

    .line 33
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public getSize()J
    .locals 2

    .line 53
    iget-wide v0, p0, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->mSize:J

    return-wide v0
.end method

.method protected onPostExecute(Ljava/lang/Long;)V
    .locals 4

    .line 44
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->mSize:J

    .line 45
    iget-wide v0, p0, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->mSize:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    .line 46
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->mNotifier:Lnet/hockeyapp/android/listeners/DownloadFileListener;

    invoke-virtual {p1, p0}, Lnet/hockeyapp/android/listeners/DownloadFileListener;->downloadSuccessful(Lnet/hockeyapp/android/tasks/DownloadFileTask;)V

    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->mNotifier:Lnet/hockeyapp/android/listeners/DownloadFileListener;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lnet/hockeyapp/android/listeners/DownloadFileListener;->downloadFailed(Lnet/hockeyapp/android/tasks/DownloadFileTask;Ljava/lang/Boolean;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->onPostExecute(Ljava/lang/Long;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
