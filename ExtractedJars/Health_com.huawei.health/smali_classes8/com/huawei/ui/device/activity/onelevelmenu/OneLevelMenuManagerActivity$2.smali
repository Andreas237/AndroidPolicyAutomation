.class Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 187
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123====setRightButtonOnClickListener \u53f3\u952e\u70b9\u51fb\u54cd\u5e94"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v0

    invoke-virtual {v0}, Lo/eod;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    return-void

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;->e:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->finish()V

    .line 193
    return-void
.end method
