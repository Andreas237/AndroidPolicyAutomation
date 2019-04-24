.class Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/MessageSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:I


# direct methods
.method constructor <init>(Landroid/os/Handler;I)V
    .locals 1

    .line 831
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 826
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->b:I

    .line 828
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->a:Landroid/os/Handler;

    .line 832
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->a:Landroid/os/Handler;

    .line 833
    iput p2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->b:I

    .line 834
    return-void
.end method


# virtual methods
.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 7

    .line 839
    const-string v3, ""

    .line 840
    const/4 v4, 0x0

    .line 841
    iget v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 843
    const-string v3, "no_disturb_start_time"

    .line 844
    const/4 v4, 0x2

    goto :goto_0

    .line 846
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 848
    const-string v3, "no_disturb_end_time"

    .line 849
    const/4 v4, 0x3

    .line 851
    :cond_1
    :goto_0
    mul-int/lit8 v0, p2, 0x3c

    add-int/2addr v0, p3

    int-to-long v5, v0

    .line 852
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    invoke-virtual {v0, v3, v5, v6}, Lo/bcb;->a(Ljava/lang/String;J)Z

    .line 853
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;->a:Landroid/os/Handler;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 854
    return-void
.end method
