.class Lo/ewu$5;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewu;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ewu;


# direct methods
.method constructor <init>(Lo/ewu;JJ)V
    .locals 0

    .line 366
    iput-object p1, p0, Lo/ewu$5;->d:Lo/ewu;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 0

    .line 378
    return-void
.end method

.method public onTick(J)V
    .locals 5

    .line 369
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 370
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 371
    iget-object v0, p0, Lo/ewu$5;->d:Lo/ewu;

    invoke-static {v0}, Lo/ewu;->d(Lo/ewu;)Lo/ewu$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ewu$b;->sendMessage(Landroid/os/Message;)Z

    .line 372
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "countDownTimer is run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    return-void
.end method
