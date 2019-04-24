.class Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$1;->a:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$1;->a:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$1;->a:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V

    .line 281
    return-void
.end method
