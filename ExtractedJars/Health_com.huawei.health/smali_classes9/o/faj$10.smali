.class Lo/faj$10;
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
.field final synthetic a:Lo/faj;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/faj;I)V
    .locals 0

    .line 733
    iput-object p1, p0, Lo/faj$10;->a:Lo/faj;

    iput p2, p0, Lo/faj$10;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 736
    invoke-static {}, Lo/faj;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepPartActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    iget-object v0, p0, Lo/faj$10;->a:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/faj$10;->e:I

    iget-object v2, p0, Lo/faj$10;->a:Lo/faj;

    invoke-static {v2}, Lo/faj;->i(Lo/faj;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->d(Landroid/content/Context;II)V

    .line 738
    return-void
.end method
