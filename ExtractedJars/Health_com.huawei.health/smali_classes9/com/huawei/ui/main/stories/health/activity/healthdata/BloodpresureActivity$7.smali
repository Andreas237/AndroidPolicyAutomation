.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$7;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$7;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$7;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V

    .line 356
    return-void
.end method
