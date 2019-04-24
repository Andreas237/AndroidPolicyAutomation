.class final Lcom/huawei/health/sns/ui/user/MessageSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Ljava/lang/String;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 519
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 524
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 525
    return-void
.end method
