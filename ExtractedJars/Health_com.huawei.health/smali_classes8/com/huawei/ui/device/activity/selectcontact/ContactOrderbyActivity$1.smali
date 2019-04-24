.class Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$1;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$1;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$1;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    .line 100
    return-void
.end method
