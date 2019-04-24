.class Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 1

    .line 503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 504
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 505
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 509
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyFemaOnClickListener onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    .line 511
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 513
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyFemaOnClickListener UserInfoActivity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    return-void

    .line 516
    :cond_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Z)Z

    .line 517
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 518
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 520
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 521
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 523
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_female:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 524
    return-void
.end method
