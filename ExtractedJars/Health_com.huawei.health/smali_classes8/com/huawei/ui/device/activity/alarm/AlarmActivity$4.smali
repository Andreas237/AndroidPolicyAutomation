.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 626
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$4;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 629
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadInstelligentHomeDialog cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$4;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$4;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lo/egv;)Lo/egv;

    .line 632
    return-void
.end method
