.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$4;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$4;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    invoke-static {v0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;I)V

    .line 114
    const/4 v0, 0x1

    return v0
.end method
