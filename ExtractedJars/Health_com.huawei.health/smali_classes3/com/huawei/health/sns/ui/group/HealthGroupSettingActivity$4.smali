.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$4;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$4;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->finish()V

    .line 314
    return-void
.end method
