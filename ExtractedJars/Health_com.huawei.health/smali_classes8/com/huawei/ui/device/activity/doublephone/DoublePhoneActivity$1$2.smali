.class Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    .line 352
    return-void
.end method
