.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 259
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "v == mCustomTitleBar leftButton onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$1;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->finish()V

    .line 262
    return-void
.end method
