.class Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 222
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eha;->setCursorVisible(Z)V

    .line 225
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
