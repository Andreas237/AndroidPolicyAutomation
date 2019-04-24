.class Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 101
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxHelpActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    const-string v0, "vo2max_age"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 103
    const-string v0, "vo2max_gender"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/Vo2maxActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 105
    return-void
.end method
