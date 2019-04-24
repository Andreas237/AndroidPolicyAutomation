.class Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    iput p2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;->d:Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;)Lo/cce;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_close_track_time"

    invoke-virtual {v0, v1, v2}, Lo/cce;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    return-void
.end method
