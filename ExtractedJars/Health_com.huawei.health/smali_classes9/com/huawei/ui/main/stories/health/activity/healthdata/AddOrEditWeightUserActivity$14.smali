.class Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 1181
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Lo/eha;

    move-result-object v0

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Lo/eha;

    move-result-object v1

    invoke-virtual {v1}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1187
    :cond_0
    return-void
.end method
