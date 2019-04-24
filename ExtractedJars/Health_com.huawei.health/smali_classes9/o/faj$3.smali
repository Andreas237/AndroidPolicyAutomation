.class Lo/faj$3;
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
.field final synthetic d:I

.field final synthetic e:Lo/faj;


# direct methods
.method constructor <init>(Lo/faj;I)V
    .locals 0

    .line 597
    iput-object p1, p0, Lo/faj$3;->e:Lo/faj;

    iput p2, p0, Lo/faj$3;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 600
    invoke-static {}, Lo/faj;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TotalDataActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget v0, p0, Lo/faj$3;->d:I

    iget v1, p0, Lo/faj$3;->d:I

    rem-int/lit8 v1, v1, 0x3c

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 602
    iget v0, p0, Lo/faj$3;->d:I

    rem-int/lit8 v0, v0, 0x3c

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 603
    iget-object v0, p0, Lo/faj$3;->e:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/faj$3;->e:Lo/faj;

    invoke-static {v1}, Lo/faj;->c(Lo/faj;)I

    move-result v1

    invoke-static {v0, v4, v5, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/TotalDataActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 604
    return-void
.end method
