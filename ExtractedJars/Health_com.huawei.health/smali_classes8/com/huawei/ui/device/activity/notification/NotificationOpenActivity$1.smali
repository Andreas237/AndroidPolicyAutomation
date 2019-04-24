.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$1;->a:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$1;->a:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->b()V

    .line 462
    return-void
.end method
