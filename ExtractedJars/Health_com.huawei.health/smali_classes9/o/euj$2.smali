.class Lo/euj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/euj;->a(Lo/euj$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/euj;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/euj;I)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/euj$2;->a:Lo/euj;

    iput p2, p0, Lo/euj$2;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {v2}, Lo/euj;->c(Lo/euj;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 162
    iget-object v0, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/euj;->a(Lo/euj;J)J

    goto :goto_0

    .line 164
    :cond_0
    return-void

    .line 167
    :goto_0
    iget-object v0, p0, Lo/euj$2;->a:Lo/euj;

    iget v1, p0, Lo/euj$2;->d:I

    invoke-static {v0, v1}, Lo/euj;->c(Lo/euj;I)V

    .line 168
    iget-object v0, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {v0}, Lo/euj;->d(Lo/euj;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/euj$2;->d:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->i()Ljava/lang/String;

    move-result-object v4

    .line 169
    if-eqz v4, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {v0}, Lo/euj;->b(Lo/euj;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 171
    const-string v0, "url"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    const-string v0, "EXTRA_BI_ID"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {v2}, Lo/euj;->d(Lo/euj;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lo/euj$2;->d:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/eus;

    invoke-virtual {v2}, Lo/eus;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 173
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {v1}, Lo/euj;->d(Lo/euj;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/euj$2;->d:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eus;

    invoke-virtual {v1}, Lo/eus;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "CONFIGURE_PAGE_CARD"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    iget-object v0, p0, Lo/euj$2;->a:Lo/euj;

    invoke-static {v0}, Lo/euj;->b(Lo/euj;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 179
    :cond_1
    return-void
.end method
