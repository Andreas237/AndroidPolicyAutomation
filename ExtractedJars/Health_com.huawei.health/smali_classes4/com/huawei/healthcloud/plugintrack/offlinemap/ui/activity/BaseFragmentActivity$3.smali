.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->d(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$3;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 228
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 229
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$3;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a_(I)V

    .line 230
    return-void
.end method
