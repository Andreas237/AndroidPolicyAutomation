.class Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$3;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$3;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dnn;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    return-void
.end method
