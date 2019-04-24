.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

.field final synthetic c:Lo/egi;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Lo/egi;Landroid/widget/TextView;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->c:Lo/egi;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->c:Lo/egi;

    invoke-virtual {v1}, Lo/egi;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)I

    .line 455
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->c:Lo/egi;

    invoke-virtual {v1}, Lo/egi;->getSelectedMonth()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)I

    .line 456
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->c:Lo/egi;

    invoke-virtual {v1}, Lo/egi;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)I

    .line 458
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 460
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 461
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->h(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 463
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 466
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$8;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->k(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 467
    return-void
.end method
