.class Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$4;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 171
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id = clock_btn_save_sure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$4;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    goto :goto_0

    .line 174
    :catch_0
    move-exception v4

    .line 175
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnsupportedEncodingException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_0
    return-void
.end method
