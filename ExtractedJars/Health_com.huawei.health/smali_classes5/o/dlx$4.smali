.class Lo/dlx$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:Lo/dlx;


# direct methods
.method constructor <init>(Lo/dlx;ILjava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/dlx$4;->e:Lo/dlx;

    iput p2, p0, Lo/dlx$4;->d:I

    iput-object p3, p0, Lo/dlx$4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 126
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg hasBloodsugarData err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const v0, 0x186a1

    if-ne p1, v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/dlx$4;->e:Lo/dlx;

    iget v1, p0, Lo/dlx$4;->d:I

    iget-object v2, p0, Lo/dlx$4;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/dlx;->c(Lo/dlx;ILjava/lang/String;)V

    goto :goto_0

    .line 130
    :cond_0
    iget-object v0, p0, Lo/dlx$4;->e:Lo/dlx;

    iget-object v0, v0, Lo/dlx;->b:Landroid/content/Context;

    const v1, 0x11171

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 132
    :goto_0
    return-void
.end method
