.class Lo/epj$b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epj$b;->b()Lo/epj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/epk;

.field final synthetic b:Lo/epj;

.field final synthetic c:Lo/epj$b;


# direct methods
.method constructor <init>(Lo/epj$b;Lo/epj;Lo/epk;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/epj$b$2;->c:Lo/epj$b;

    iput-object p2, p0, Lo/epj$b$2;->b:Lo/epj;

    iput-object p3, p0, Lo/epj$b$2;->a:Lo/epk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 81
    iget-object v0, p0, Lo/epj$b$2;->c:Lo/epj$b;

    invoke-static {v0}, Lo/epj$b;->a(Lo/epj$b;)Lo/epj$a;

    move-result-object v0

    iget-object v1, p0, Lo/epj$b$2;->b:Lo/epj;

    iget-object v2, p0, Lo/epj$b$2;->a:Lo/epk;

    .line 82
    invoke-virtual {v2}, Lo/epk;->d()Z

    move-result v2

    iget-object v3, p0, Lo/epj$b$2;->a:Lo/epk;

    invoke-virtual {v3}, Lo/epk;->getSelectedTargetType()I

    move-result v3

    iget-object v4, p0, Lo/epj$b$2;->a:Lo/epk;

    invoke-virtual {v4}, Lo/epk;->getSelectedTargetValue()F

    move-result v4

    .line 81
    invoke-interface {v0, v1, v2, v3, v4}, Lo/epj$a;->a(Landroid/app/Dialog;ZIF)V

    .line 83
    const-string v0, "Track_HealthSportTargetChoiceWheelPickerDialog"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "targetType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epj$b$2;->a:Lo/epk;

    invoke-virtual {v2}, Lo/epk;->getSelectedTargetType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetValue = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epj$b$2;->a:Lo/epk;

    invoke-virtual {v2}, Lo/epk;->getSelectedTargetValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void
.end method
