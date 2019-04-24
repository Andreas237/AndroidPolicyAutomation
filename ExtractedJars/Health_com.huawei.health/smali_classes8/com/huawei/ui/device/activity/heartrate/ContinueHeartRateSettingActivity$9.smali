.class Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$9;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 340
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog set negative"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    return-void
.end method
