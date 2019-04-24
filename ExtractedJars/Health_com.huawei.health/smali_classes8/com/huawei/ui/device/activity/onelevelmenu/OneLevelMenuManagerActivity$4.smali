.class Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$4;
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
.field final synthetic c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$4;->c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 198
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123====setRightButtonOnClickListener \u5de6\u952e\u70b9\u51fb\u54cd\u5e94"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$4;->c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    .line 200
    return-void
.end method
