.class Lo/egs$b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egs$b;->d()Lo/egs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egs$b;

.field final synthetic d:Lo/egs;


# direct methods
.method constructor <init>(Lo/egs$b;Lo/egs;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/egs$b$1;->c:Lo/egs$b;

    iput-object p2, p0, Lo/egs$b$1;->d:Lo/egs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 88
    sget-object v0, Lo/egs;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----- onClick \u5982\u4f55\u8bbe\u7f6e...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lo/egs$b$1;->d:Lo/egs;

    invoke-virtual {v0}, Lo/egs;->dismiss()V

    .line 91
    iget-object v0, p0, Lo/egs$b$1;->c:Lo/egs$b;

    invoke-static {v0}, Lo/egs$b;->d(Lo/egs$b;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/egs;->c(Landroid/content/Context;I)V

    .line 92
    return-void
.end method
