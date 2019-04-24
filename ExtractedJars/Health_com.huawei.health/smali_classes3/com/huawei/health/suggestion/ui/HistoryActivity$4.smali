.class Lcom/huawei/health/suggestion/ui/HistoryActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$4;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 126
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 127
    const-string v0, "plan"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$4;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->e(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 128
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$4;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 129
    return-void
.end method
