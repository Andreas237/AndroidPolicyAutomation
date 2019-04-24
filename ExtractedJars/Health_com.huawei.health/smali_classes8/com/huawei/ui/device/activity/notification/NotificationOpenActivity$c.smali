.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;)V
    .locals 0

    .line 410
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Z)Z

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c()V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->sendEmptyMessage(I)Z

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Z)Z

    .line 417
    return-void
.end method
