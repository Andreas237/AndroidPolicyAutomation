.class Lo/epn$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epn$a;->b()Lo/epn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/epn$a;

.field final synthetic b:Lo/eps;

.field final synthetic c:Lo/epn;


# direct methods
.method constructor <init>(Lo/epn$a;Lo/epn;Lo/eps;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/epn$a$2;->a:Lo/epn$a;

    iput-object p2, p0, Lo/epn$a$2;->c:Lo/epn;

    iput-object p3, p0, Lo/epn$a$2;->b:Lo/eps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 87
    iget-object v0, p0, Lo/epn$a$2;->a:Lo/epn$a;

    invoke-static {v0}, Lo/epn$a;->c(Lo/epn$a;)Lo/epn$d;

    move-result-object v0

    iget-object v1, p0, Lo/epn$a$2;->c:Lo/epn;

    iget-object v2, p0, Lo/epn$a$2;->b:Lo/eps;

    .line 88
    invoke-virtual {v2}, Lo/eps;->c()I

    move-result v2

    iget-object v3, p0, Lo/epn$a$2;->b:Lo/eps;

    .line 89
    invoke-virtual {v3}, Lo/eps;->b()I

    move-result v3

    .line 87
    invoke-interface {v0, v1, v2, v3}, Lo/epn$d;->c(Landroid/app/Dialog;II)V

    .line 90
    const-string v0, "Track_HealthSportTargetChoiceWheelPickerDialog"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireFirstLocation = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epn$a$2;->b:Lo/eps;

    invoke-virtual {v2}, Lo/eps;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " acquireSecondLocation = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epn$a$2;->b:Lo/eps;

    invoke-virtual {v2}, Lo/eps;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void
.end method
