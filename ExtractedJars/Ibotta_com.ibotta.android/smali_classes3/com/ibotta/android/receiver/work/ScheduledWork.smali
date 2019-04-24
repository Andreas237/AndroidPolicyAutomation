.class public Lcom/ibotta/android/receiver/work/ScheduledWork;
.super Ljava/lang/Object;
.source "ScheduledWork.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private delay:J

.field private flags:I

.field private work:Landroid/os/Bundle;

.field private workId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;JILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 21
    iput-wide p2, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->delay:J

    .line 22
    iput p4, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->flags:I

    .line 23
    iput-object p5, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->workId:Ljava/lang/String;

    .line 24
    iput-object p6, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->work:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getDelay()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->delay:J

    return-wide v0
.end method

.method public getEventTime()J
    .locals 4

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->delay:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public getFlags()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->flags:I

    return v0
.end method

.method public getWork()Landroid/os/Bundle;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->work:Landroid/os/Bundle;

    return-object v0
.end method

.method public getWorkId()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWork;->workId:Ljava/lang/String;

    return-object v0
.end method
