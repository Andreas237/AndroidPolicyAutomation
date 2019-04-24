.class Lo/cir$7;
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
.field final synthetic a:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 1129
    iput-object p1, p0, Lo/cir$7;->a:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1132
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->v()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1133
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->x()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1134
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->w()Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_sport_gps_searching:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1135
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->x()Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_gps_disable_1:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1136
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->A()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1137
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->q(Lo/cir;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->w(Lo/cir;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1138
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->A()Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_gps_disable_tip_with_sensor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 1140
    :cond_0
    iget-object v0, p0, Lo/cir$7;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->A()Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_gps_disable_1_tip:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1142
    :goto_0
    return-void
.end method
