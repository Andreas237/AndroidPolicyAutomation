.class Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$4;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$4;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    const/16 v1, 0x6f

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;I)V

    .line 112
    return-void
.end method
