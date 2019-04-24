.class Lo/faj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/faj;->setCoreSleepData(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/faj;


# direct methods
.method constructor <init>(Lo/faj;Ljava/lang/String;)V
    .locals 0

    .line 959
    iput-object p1, p0, Lo/faj$1;->d:Lo/faj;

    iput-object p2, p0, Lo/faj$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 962
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/faj$1;->d:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 963
    const-string v0, "type"

    const/4 v1, 0x4

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 964
    const-string v0, "sleepTimeScore"

    iget-object v1, p0, Lo/faj$1;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 965
    const-string v0, "sleepTimeStatus"

    iget-object v1, p0, Lo/faj$1;->d:Lo/faj;

    invoke-static {v1}, Lo/faj;->m(Lo/faj;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 966
    iget-object v0, p0, Lo/faj$1;->d:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 967
    return-void
.end method
