.class Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5$3;->a:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5$3;->a:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5$3;->a:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;Z)V

    .line 72
    return-void
.end method
