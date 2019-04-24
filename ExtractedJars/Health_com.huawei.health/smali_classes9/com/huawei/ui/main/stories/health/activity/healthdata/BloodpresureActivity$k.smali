.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 691
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;)V
    .locals 0

    .line 691
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$k;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 696
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u6dfb\u52a0\u7528\u6237\uff0c\u5f00\u53d1\u4e2d\u3002\u3002\u3002"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 697
    return-void
.end method
