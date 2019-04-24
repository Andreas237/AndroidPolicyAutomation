.class Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$5;->d:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$5;->d:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->p(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->cancel()V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$5;->d:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->finish()V

    .line 288
    return-void
.end method
