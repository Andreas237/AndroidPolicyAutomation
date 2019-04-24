.class Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$5;)V
    .locals 0

    .line 142
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$c;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 146
    :try_start_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 147
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 148
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->b()Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    goto :goto_0

    .line 149
    :catch_0
    move-exception v4

    .line 151
    const-string v0, "FlowStatisticsDisplay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Time error Throwable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :goto_0
    return-void
.end method
