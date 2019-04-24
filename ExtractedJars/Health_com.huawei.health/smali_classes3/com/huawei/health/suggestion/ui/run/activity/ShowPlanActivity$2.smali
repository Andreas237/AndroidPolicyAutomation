.class Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$2;->a:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 376
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$2;->a:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->onBackPressed()V

    .line 377
    return-void
.end method
