.class Lo/ahx$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/ahx;


# direct methods
.method private constructor <init>(Lo/ahx;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/ahx$c;->c:Lo/ahx;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/ahx;Lo/ahx$1;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lo/ahx$c;-><init>(Lo/ahx;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 51
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 53
    :pswitch_0
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lo/ahx$c;->sendEmptyMessage(I)Z

    .line 54
    goto :goto_1

    .line 56
    :pswitch_1
    iget-object v0, p0, Lo/ahx$c;->c:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->d(Lo/ahx;)V

    .line 57
    goto :goto_1

    .line 59
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-eqz v0, :cond_0

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lo/ahx$c;->c:Lo/ahx;

    invoke-static {v1}, Lo/ahx;->c(Lo/ahx;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 60
    iget-object v0, p0, Lo/ahx$c;->c:Lo/ahx;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/ahx;->c(Lo/ahx;I)V

    goto :goto_1

    .line 64
    :pswitch_3
    iget-object v0, p0, Lo/ahx$c;->c:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->a(Lo/ahx;)V

    .line 65
    goto :goto_1

    .line 67
    :goto_0
    :pswitch_4
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SaveHandler what is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 70
    :cond_0
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
