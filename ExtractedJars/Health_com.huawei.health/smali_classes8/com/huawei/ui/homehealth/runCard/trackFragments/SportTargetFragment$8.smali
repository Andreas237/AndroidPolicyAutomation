.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 951
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iput-object p2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 954
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->d:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->c:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 955
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/TextView;

    move-result-object v4

    .line 956
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 957
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 959
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/TextView;

    move-result-object v4

    .line 960
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 961
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;->c:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 963
    :cond_1
    return-void
.end method
