.class Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$5;->b:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 253
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setActivityReminder err_code ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    .line 258
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$5;->b:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_music_management_operation_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 261
    :cond_0
    return-void
.end method
