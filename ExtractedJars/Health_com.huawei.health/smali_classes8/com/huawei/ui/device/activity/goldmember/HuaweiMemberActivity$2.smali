.class Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 150
    return-void
.end method
