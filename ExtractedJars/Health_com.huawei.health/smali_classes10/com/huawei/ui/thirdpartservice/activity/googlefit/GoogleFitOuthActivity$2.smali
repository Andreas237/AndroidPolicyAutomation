.class Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity$2;->b:Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 73
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 74
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 76
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity$2;->b:Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;)V

    .line 77
    .line 81
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_0
    .end sparse-switch
.end method
