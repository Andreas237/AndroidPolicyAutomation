.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;Ljava/util/List;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$1;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$1;->b:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaa;->c(Ljava/lang/String;)Z

    move-result v4

    .line 172
    const-string v0, "CommonSleepNoDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isRead = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 174
    return-void
.end method
