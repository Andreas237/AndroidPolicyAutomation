.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 911
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$10;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 916
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notification cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 917
    return-void
.end method
