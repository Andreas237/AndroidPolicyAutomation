.class Lo/etf$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etf;->b(Lo/fil;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fil;

.field final synthetic e:Lo/etf;


# direct methods
.method constructor <init>(Lo/etf;Lo/fil;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/etf$3;->e:Lo/etf;

    iput-object p2, p0, Lo/etf$3;->d:Lo/fil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 203
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail ACTIVITY_KEY i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 6

    .line 191
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess ACTIVITY_KEY url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lo/etf$3;->d:Lo/fil;

    invoke-static {p1, v0}, Lo/fic;->c(Ljava/lang/String;Lo/fil;)Ljava/lang/String;

    move-result-object v4

    .line 193
    iget-object v0, p0, Lo/etf$3;->e:Lo/etf;

    invoke-static {v0}, Lo/etf;->b(Lo/etf;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 194
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/etf$3;->e:Lo/etf;

    invoke-static {v0}, Lo/etf;->c(Lo/etf;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    const-string v0, "url"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    iget-object v0, p0, Lo/etf$3;->e:Lo/etf;

    invoke-static {v0}, Lo/etf;->a(Lo/etf;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 197
    iget-object v0, p0, Lo/etf$3;->e:Lo/etf;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/etf;->c(Lo/etf;Z)Z

    .line 198
    iget-object v0, p0, Lo/etf$3;->e:Lo/etf;

    iget-object v1, p0, Lo/etf$3;->d:Lo/fil;

    invoke-static {v0, v1}, Lo/etf;->a(Lo/etf;Lo/fil;)V

    .line 199
    return-void
.end method
