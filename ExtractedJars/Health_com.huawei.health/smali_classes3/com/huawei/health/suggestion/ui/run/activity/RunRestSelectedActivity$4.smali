.class Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bxi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$4;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;)V
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$4;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$4;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 205
    return-void
.end method
