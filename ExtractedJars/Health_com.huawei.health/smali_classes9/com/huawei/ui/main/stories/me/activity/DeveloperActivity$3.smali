.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 616
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$3;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$3;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 620
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$3;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 622
    :cond_0
    return-void
.end method
