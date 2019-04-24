.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 1286
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V
    .locals 0

    .line 1286
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->o(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 1290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    goto/16 :goto_0

    .line 1292
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 1293
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1294
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    goto :goto_0

    .line 1295
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 1296
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    goto :goto_0

    .line 1298
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 1299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    goto :goto_0

    .line 1301
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 1302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    goto :goto_0

    .line 1304
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_5

    .line 1305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 1309
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/egw;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 1310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 1313
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->y(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 1315
    return-void
.end method
