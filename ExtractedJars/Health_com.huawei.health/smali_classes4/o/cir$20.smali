.class Lo/cir$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cir;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cir;Ljava/lang/String;)V
    .locals 0

    .line 1266
    iput-object p1, p0, Lo/cir$20;->a:Lo/cir;

    iput-object p2, p0, Lo/cir$20;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1269
    iget-object v0, p0, Lo/cir$20;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->m()Lo/cio;

    move-result-object v0

    invoke-virtual {v0}, Lo/cio;->a()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$20;->a:Lo/cir;

    invoke-static {v1}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1270
    iget-object v0, p0, Lo/cir$20;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->m()Lo/cio;

    move-result-object v0

    invoke-virtual {v0}, Lo/cio;->d()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$20;->a:Lo/cir;

    invoke-static {v1}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1271
    iget-object v0, p0, Lo/cir$20;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->m()Lo/cio;

    move-result-object v0

    invoke-virtual {v0}, Lo/cio;->b()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$20;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1272
    return-void
.end method
