.class Lo/faj$8;
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
.field final synthetic b:Lo/faj;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/faj;I)V
    .locals 0

    .line 695
    iput-object p1, p0, Lo/faj$8;->b:Lo/faj;

    iput p2, p0, Lo/faj$8;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 698
    invoke-static {}, Lo/faj;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SlumSleepRateActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 699
    iget-object v0, p0, Lo/faj$8;->b:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/faj$8;->d:I

    iget-object v2, p0, Lo/faj$8;->b:Lo/faj;

    invoke-static {v2}, Lo/faj;->d(Lo/faj;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SlumSleepRateActivity;->e(Landroid/content/Context;II)V

    .line 700
    return-void
.end method
