.class Lo/faj$7;
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
.field final synthetic c:I

.field final synthetic e:Lo/faj;


# direct methods
.method constructor <init>(Lo/faj;I)V
    .locals 0

    .line 765
    iput-object p1, p0, Lo/faj$7;->e:Lo/faj;

    iput p2, p0, Lo/faj$7;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 768
    iget-object v0, p0, Lo/faj$7;->e:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/faj$7;->c:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/faj$7;->e:Lo/faj;

    invoke-static {v2}, Lo/faj;->h(Lo/faj;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 769
    return-void
.end method
