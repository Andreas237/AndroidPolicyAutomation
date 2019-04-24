.class public Lnet/hockeyapp/android/tasks/AttachmentDownloader;
.super Ljava/lang/Object;
.source "AttachmentDownloader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadTask;,
        Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadJob;,
        Lnet/hockeyapp/android/tasks/AttachmentDownloader$AttachmentDownloaderHolder;
    }
.end annotation


# instance fields
.field private downloadRunning:Z

.field private queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadJob;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->queue:Ljava/util/Queue;

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->downloadRunning:Z

    return-void
.end method

.method synthetic constructor <init>(Lnet/hockeyapp/android/tasks/AttachmentDownloader$1;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lnet/hockeyapp/android/tasks/AttachmentDownloader;-><init>()V

    return-void
.end method

.method static synthetic access$200(Lnet/hockeyapp/android/tasks/AttachmentDownloader;)Ljava/util/Queue;
    .locals 0

    .line 34
    iget-object p0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->queue:Ljava/util/Queue;

    return-object p0
.end method

.method static synthetic access$300(Lnet/hockeyapp/android/tasks/AttachmentDownloader;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->downloadNext()V

    return-void
.end method

.method static synthetic access$402(Lnet/hockeyapp/android/tasks/AttachmentDownloader;Z)Z
    .locals 0

    .line 34
    iput-boolean p1, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->downloadRunning:Z

    return p1
.end method

.method private downloadNext()V
    .locals 3

    .line 63
    iget-boolean v0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->downloadRunning:Z

    if-eqz v0, :cond_0

    return-void

    .line 67
    :cond_0
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->queue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadJob;

    if-eqz v0, :cond_1

    .line 69
    new-instance v1, Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadTask;

    new-instance v2, Lnet/hockeyapp/android/tasks/AttachmentDownloader$1;

    invoke-direct {v2, p0}, Lnet/hockeyapp/android/tasks/AttachmentDownloader$1;-><init>(Lnet/hockeyapp/android/tasks/AttachmentDownloader;)V

    invoke-direct {v1, v0, v2}, Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadTask;-><init>(Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadJob;Landroid/os/Handler;)V

    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->downloadRunning:Z

    .line 87
    invoke-static {v1}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    :cond_1
    return-void
.end method

.method public static getInstance()Lnet/hockeyapp/android/tasks/AttachmentDownloader;
    .locals 1

    .line 45
    sget-object v0, Lnet/hockeyapp/android/tasks/AttachmentDownloader$AttachmentDownloaderHolder;->INSTANCE:Lnet/hockeyapp/android/tasks/AttachmentDownloader;

    return-object v0
.end method


# virtual methods
.method public download(Lnet/hockeyapp/android/objects/FeedbackAttachment;Lnet/hockeyapp/android/views/AttachmentView;)V
    .locals 3

    .line 58
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->queue:Ljava/util/Queue;

    new-instance v1, Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadJob;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lnet/hockeyapp/android/tasks/AttachmentDownloader$DownloadJob;-><init>(Lnet/hockeyapp/android/objects/FeedbackAttachment;Lnet/hockeyapp/android/views/AttachmentView;Lnet/hockeyapp/android/tasks/AttachmentDownloader$1;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-direct {p0}, Lnet/hockeyapp/android/tasks/AttachmentDownloader;->downloadNext()V

    return-void
.end method
