.class Lcom/huawei/health/sns/ui/user/MessageSettingActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/user/MessageSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$5;->e:Lcom/huawei/health/sns/ui/user/MessageSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$5;->e:Lcom/huawei/health/sns/ui/user/MessageSettingActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->b(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;Z)V

    .line 488
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_setting"

    invoke-virtual {v0, v1, p2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 489
    return-void
.end method
