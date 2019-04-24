.class Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egh;

.field final synthetic d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Lo/egh;)V
    .locals 0

    .line 385
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->b:Lo/egh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->b:Lo/egh;

    invoke-virtual {v0}, Lo/egh;->d()[Z

    move-result-object v3

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoh;

    move-result-object v1

    invoke-virtual {v1, v3}, Lo/eoh;->c([Z)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;I)I

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoh;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoh;

    move-result-object v2

    invoke-virtual {v2, v3}, Lo/eoh;->c([Z)I

    move-result v2

    invoke-virtual {v1, v2}, Lo/eoh;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    return-void
.end method
