.class Lo/bwa$25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->Q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 600
    iput-object p1, p0, Lo/bwa$25;->a:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 603
    iget-object v0, p0, Lo/bwa$25;->a:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc1

    if-ne v0, v1, :cond_0

    .line 604
    iget-object v0, p0, Lo/bwa$25;->a:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->a(Lo/bwa;)V

    .line 605
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endResting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
