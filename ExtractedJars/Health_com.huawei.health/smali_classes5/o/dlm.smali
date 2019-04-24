.class public Lo/dlm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/buh;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lo/dlm;->e:Landroid/content/Context;

    .line 22
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 5

    .line 26
    const-string v0, "FitRecommendCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const-string v0, "FitRecommendCallback"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange workoutId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 29
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 30
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.smartcenter.activity.WeightRecommendActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 33
    iget-object v0, p0, Lo/dlm;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 35
    :cond_0
    return-void
.end method
