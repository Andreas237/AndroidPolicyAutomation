.class Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bxh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$1;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 403
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRunTypeSelect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$1;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)V

    .line 405
    return-void
.end method
