.class Lo/erf$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erf;->a(Lo/erf$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/erf;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/erf;I)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/erf$2;->d:Lo/erf;

    iput p2, p0, Lo/erf$2;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 82
    iget-object v0, p0, Lo/erf$2;->d:Lo/erf;

    invoke-static {v0}, Lo/erf;->b(Lo/erf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/erf$2$1;

    invoke-direct {v2, p0}, Lo/erf$2$1;-><init>(Lo/erf$2;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 102
    return-void
.end method
