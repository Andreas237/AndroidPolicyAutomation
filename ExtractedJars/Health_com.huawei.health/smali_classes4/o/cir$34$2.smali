.class Lo/cir$34$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir$34;->b(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cir$34;


# direct methods
.method constructor <init>(Lo/cir$34;)V
    .locals 0

    .line 662
    iput-object p1, p0, Lo/cir$34$2;->e:Lo/cir$34;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 665
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 666
    :cond_0
    iget-object v0, p0, Lo/cir$34$2;->e:Lo/cir$34;

    iget-object v0, v0, Lo/cir$34;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->o(Lo/cir;)Landroid/widget/ImageButton;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 669
    :cond_1
    iget-object v0, p0, Lo/cir$34$2;->e:Lo/cir$34;

    iget-object v0, v0, Lo/cir$34;->e:Lo/cir;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cir;->c(Lo/cir;I)I

    .line 670
    iget-object v0, p0, Lo/cir$34$2;->e:Lo/cir$34;

    iget-object v0, v0, Lo/cir$34;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->o(Lo/cir;)Landroid/widget/ImageButton;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_main_page_sport_music:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 673
    :goto_0
    return-void
.end method
