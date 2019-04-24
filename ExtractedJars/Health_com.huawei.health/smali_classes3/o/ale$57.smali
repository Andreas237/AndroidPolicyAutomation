.class Lo/ale$57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->i(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 3920
    iput-object p1, p0, Lo/ale$57;->d:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 3923
    iget-object v0, p0, Lo/ale$57;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->M(Lo/ale;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 3924
    iget-object v0, p0, Lo/ale$57;->d:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;Lo/egv;)Lo/egv;

    .line 3926
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 3928
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    const-string v3, "false"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3930
    return-void
.end method
