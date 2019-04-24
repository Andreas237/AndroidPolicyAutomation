.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/CompoundButton;

.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;Landroid/widget/CompoundButton;)V
    .locals 0

    .line 3065
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$4;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$4;->b:Landroid/widget/CompoundButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 3068
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setBluetoothOffalertSwitchStatus err_code ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",objData = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3069
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 3070
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$4;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_music_management_operation_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3072
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$4;->b:Landroid/widget/CompoundButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 3073
    return-void
.end method
