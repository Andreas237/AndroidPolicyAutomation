.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 634
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 638
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "developeroptions"

    const-string v2, "developerswitch"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->finish()V

    .line 641
    return-void
.end method
