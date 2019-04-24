.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$1;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$1;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa;->r()V

    .line 186
    return-void
.end method
