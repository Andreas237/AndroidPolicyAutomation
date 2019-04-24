.class Lo/fcd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcd;->a(ILo/fcd$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fcd$d;

.field final synthetic b:I

.field final synthetic d:Lo/fcd;


# direct methods
.method constructor <init>(Lo/fcd;Lo/fcd$d;I)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/fcd$4;->d:Lo/fcd;

    iput-object p2, p0, Lo/fcd$4;->a:Lo/fcd$d;

    iput p3, p0, Lo/fcd$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 105
    iget-object v0, p0, Lo/fcd$4;->a:Lo/fcd$d;

    invoke-static {v0}, Lo/fcd$d;->b(Lo/fcd$d;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 106
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    iget-object v0, v0, Lo/fcd;->a:Ljava/util/ArrayList;

    iget v1, p0, Lo/fcd$4;->b:I

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 107
    if-eqz p2, :cond_1

    .line 108
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Z)V

    .line 109
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->b()I

    move-result v0

    iget-object v1, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-virtual {v1}, Lo/fcd;->a()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 110
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/fcd;->c:Z

    .line 111
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 113
    :cond_0
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c()V

    goto :goto_0

    .line 115
    :cond_1
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->b()I

    move-result v0

    iget-object v1, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-virtual {v1}, Lo/fcd;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 116
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/fcd;->c:Z

    .line 117
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 119
    :cond_2
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->b()I

    move-result v0

    if-nez v0, :cond_3

    .line 120
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Z)V

    .line 122
    :cond_3
    iget-object v0, p0, Lo/fcd$4;->d:Lo/fcd;

    invoke-static {v0}, Lo/fcd;->c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c()V

    .line 124
    :goto_0
    return-void
.end method
