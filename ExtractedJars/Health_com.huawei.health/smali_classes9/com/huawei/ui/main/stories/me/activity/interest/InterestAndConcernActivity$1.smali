.class Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$1;->c:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$1;->c:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$1;->c:Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Landroid/content/Context;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    .line 108
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 109
    return-void
.end method
