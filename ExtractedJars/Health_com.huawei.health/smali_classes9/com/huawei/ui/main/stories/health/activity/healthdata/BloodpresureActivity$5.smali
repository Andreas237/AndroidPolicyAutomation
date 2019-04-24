.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Lo/dlu;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;)V

    invoke-virtual {v0, v1}, Lo/dlu;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 211
    return-void
.end method
