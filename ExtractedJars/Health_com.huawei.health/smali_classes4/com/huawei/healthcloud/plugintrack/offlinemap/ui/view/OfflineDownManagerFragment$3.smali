.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d(Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/AlertDialog;

.field final synthetic c:I

.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;ILjava/lang/String;Landroid/app/AlertDialog;)V
    .locals 0

    .line 312
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    iput p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->c:I

    iput-object p3, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 317
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 318
    instance-of v0, v4, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    if-nez v0, :cond_0

    .line 320
    return-void

    .line 322
    :cond_0
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDoubleDeleteDialog onItemClick() position:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    invoke-static {v4}, Lo/cgd;->b(Landroid/content/Context;)Lo/cgd;

    move-result-object v5

    .line 324
    sparse-switch p3, :sswitch_data_0

    goto/16 :goto_2

    .line 327
    :sswitch_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->c:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_1

    .line 329
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->e:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lo/cgd;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 331
    :cond_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->c:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_2

    .line 333
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->e:Ljava/lang/String;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v5, v0, v1, v2, v3}, Lo/cgd;->a(Ljava/lang/String;ZJ)V

    goto :goto_0

    .line 335
    :cond_2
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->c:I

    const/16 v1, 0x66

    if-ne v0, v1, :cond_3

    .line 337
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->e:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lo/cgd;->a(Ljava/lang/String;)V

    .line 339
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 340
    goto :goto_2

    .line 342
    :sswitch_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->c:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_4

    .line 344
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->e:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Lo/cgd;->d(Ljava/lang/String;Z)V

    goto :goto_1

    .line 348
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->e:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Lo/cgd;->d(Ljava/lang/String;Z)V

    .line 350
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 351
    .line 355
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
