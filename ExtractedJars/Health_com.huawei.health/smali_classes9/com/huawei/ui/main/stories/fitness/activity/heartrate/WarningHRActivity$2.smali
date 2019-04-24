.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbi$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/fbp;)Lo/fbi$c;
    .locals 2

    .line 29
    new-instance v0, Lo/fbg;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fbg;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public d(Lo/fbm;)Lo/fbi$e;
    .locals 2

    .line 34
    new-instance v0, Lo/fbb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fbb;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
