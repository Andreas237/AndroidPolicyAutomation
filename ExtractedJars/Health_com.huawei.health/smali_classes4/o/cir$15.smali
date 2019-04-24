.class Lo/cir$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 1178
    iput-object p1, p0, Lo/cir$15;->d:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1181
    iget-object v0, p0, Lo/cir$15;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->w()Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1182
    iget-object v0, p0, Lo/cir$15;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->A()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1183
    iget-object v0, p0, Lo/cir$15;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->x()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1184
    iget-object v0, p0, Lo/cir$15;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->v()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1185
    iget-object v0, p0, Lo/cir$15;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->v()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$15;->d:Lo/cir;

    invoke-static {v1}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_running_signal3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1186
    return-void
.end method
