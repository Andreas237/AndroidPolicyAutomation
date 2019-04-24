.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lo/ejf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$8;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/eic;)Z
    .locals 1

    .line 318
    invoke-virtual {p1}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    const/4 v0, 0x1

    return v0

    .line 321
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
