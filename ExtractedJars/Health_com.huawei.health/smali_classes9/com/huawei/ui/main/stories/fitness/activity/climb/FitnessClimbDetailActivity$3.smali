.class Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->d(Lo/ejf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/eic;)Z
    .locals 1

    .line 122
    invoke-virtual {p1}, Lo/eic;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const/4 v0, 0x1

    return v0

    .line 125
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
