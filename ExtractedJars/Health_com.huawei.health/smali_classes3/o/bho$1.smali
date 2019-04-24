.class Lo/bho$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bho;->a(Lo/bho$e;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bho;


# direct methods
.method constructor <init>(Lo/bho;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/bho$1;->d:Lo/bho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 106
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/bho$1;->d:Lo/bho;

    invoke-static {v0}, Lo/bho;->b(Lo/bho;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 107
    const-string v0, "EXTRA_GROUP_ID"

    iget-object v1, p0, Lo/bho$1;->d:Lo/bho;

    invoke-static {v1}, Lo/bho;->c(Lo/bho;)J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 108
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 109
    iget-object v0, p0, Lo/bho$1;->d:Lo/bho;

    invoke-static {v0}, Lo/bho;->b(Lo/bho;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 110
    return-void
.end method
