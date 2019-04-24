.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 320
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LeftButtonOnClick: isShowInputing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 323
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RightButtonOnClick: isDataError = flase"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Z)Z

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    goto :goto_0

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_edit_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 334
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    goto :goto_1

    .line 337
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Z)Z

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_cancel_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_ok:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 344
    :cond_2
    :goto_1
    return-void
.end method
