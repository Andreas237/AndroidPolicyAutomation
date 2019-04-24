.class Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$1;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 108
    const/4 v3, 0x0

    :goto_0
    invoke-static {}, Lo/eox;->c()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 109
    invoke-static {}, Lo/eox;->c()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 111
    :cond_0
    invoke-static {}, Lo/eox;->c()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$1;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)Lo/eox;

    move-result-object v0

    invoke-virtual {v0}, Lo/eox;->notifyDataSetChanged()V

    .line 113
    return-void
.end method
