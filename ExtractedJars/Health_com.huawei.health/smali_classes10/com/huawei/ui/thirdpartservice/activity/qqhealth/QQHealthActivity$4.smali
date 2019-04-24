.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$4;->d:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$4;->d:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    sget-object v1, Lo/dae;->ed:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$4;->d:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->d()V

    .line 91
    return-void
.end method
