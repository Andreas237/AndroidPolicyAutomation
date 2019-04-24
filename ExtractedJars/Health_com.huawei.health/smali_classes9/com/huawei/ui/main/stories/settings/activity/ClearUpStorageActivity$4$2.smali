.class Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4$2;->a:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4$2;->a:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    const/16 v1, 0x65

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;I)V

    .line 134
    return-void
.end method
