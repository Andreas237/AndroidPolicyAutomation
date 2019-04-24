.class public Lcom/huawei/bone/social/manager/service/SocialJobService;
.super Landroid/app/job/JobService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/bone/social/manager/service/SocialJobService$JobFinishedListenerObject;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-class v0, Lcom/huawei/bone/social/manager/service/SocialJobService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/bone/social/manager/service/SocialJobService;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method


# virtual methods
.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 6

    .line 23
    sget-object v0, Lcom/huawei/bone/social/manager/service/SocialJobService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Checking to start job ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    const-string v0, "key_num_failures"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/xt;->e(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v4

    .line 26
    int-to-long v0, v4

    const-wide/16 v2, 0x8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 28
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/bone/social/manager/service/SocialJobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 29
    const/4 v0, 0x0

    return v0

    .line 32
    :cond_0
    sget-object v0, Lcom/huawei/bone/social/manager/service/SocialJobService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Starting Job ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const-string v0, "key_num_failures"

    add-int/lit8 v1, v4, 0x1

    invoke-static {p0, v0, v1}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 36
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 37
    invoke-virtual {p0, v5}, Lcom/huawei/bone/social/manager/service/SocialJobService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 38
    const/4 v0, 0x1

    return v0
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 5

    .line 43
    sget-object v0, Lcom/huawei/bone/social/manager/service/SocialJobService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Stopping or re-scheduling job ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const-string v0, "key_num_failures"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/xt;->e(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v4

    .line 46
    int-to-long v0, v4

    const-wide/16 v2, 0x8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 48
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/bone/social/manager/service/SocialJobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 49
    const/4 v0, 0x0

    return v0

    .line 52
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
