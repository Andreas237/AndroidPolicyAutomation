.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b()V
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

    .line 225
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;->a:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 229
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closed click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;->a:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eoa;->e(I)V

    .line 232
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->b()V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;->a:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 235
    return-void
.end method
