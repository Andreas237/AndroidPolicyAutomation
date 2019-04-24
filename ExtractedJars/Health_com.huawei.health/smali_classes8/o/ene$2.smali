.class final Lo/ene$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ene;->d(Lo/egd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egd;


# direct methods
.method constructor <init>(Lo/egd;)V
    .locals 0

    .line 829
    iput-object p1, p0, Lo/ene$2;->c:Lo/egd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 832
    iget-object v0, p0, Lo/ene$2;->c:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 833
    iget-object v0, p0, Lo/ene$2;->c:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 834
    const-string v0, "HealthButton"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLineCount > 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    iget-object v0, p0, Lo/ene$2;->c:Lo/egd;

    const/4 v1, 0x1

    const/high16 v2, 0x41100000    # 9.0f

    invoke-virtual {v0, v1, v2}, Lo/egd;->setTextSize(IF)V

    .line 836
    iget-object v0, p0, Lo/ene$2;->c:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setMaxLines(I)V

    .line 837
    iget-object v0, p0, Lo/ene$2;->c:Lo/egd;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Lo/egd;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 839
    :cond_0
    return-void
.end method
