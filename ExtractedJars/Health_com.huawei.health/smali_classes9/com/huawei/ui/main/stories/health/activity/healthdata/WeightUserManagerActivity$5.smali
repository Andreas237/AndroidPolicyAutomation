.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->b(I)Lo/acu;

    move-result-object v4

    .line 161
    if-nez p3, :cond_0

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    goto :goto_0

    .line 165
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 168
    :cond_1
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :goto_0
    return-void
.end method
