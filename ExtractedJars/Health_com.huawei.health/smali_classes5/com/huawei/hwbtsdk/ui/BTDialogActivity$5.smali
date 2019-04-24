.class Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;->e:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 337
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onItemClick: id is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;->e:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Lo/cys;->e(J)V

    .line 340
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;->e:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->e(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;->e:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    .line 342
    return-void
.end method
