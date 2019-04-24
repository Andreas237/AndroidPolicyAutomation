.class Lo/cys$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cys;


# direct methods
.method constructor <init>(Lo/cys;)V
    .locals 0

    .line 1448
    iput-object p1, p0, Lo/cys$3;->c:Lo/cys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 5

    .line 1451
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1453
    :pswitch_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "click openBTDialog opne system bt mBTSwitchOpenCallback BT_STATE_OFF!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1454
    goto :goto_0

    .line 1456
    :pswitch_1
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "click openBTDialog opne system bt mBTSwitchOpenCallback BT_STATE_TURNING_ON!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1457
    goto :goto_0

    .line 1459
    :pswitch_2
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "click openBTDialog opne system bt mBTSwitchOpenCallback BT_STATE_ON!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1460
    goto :goto_0

    .line 1462
    :pswitch_3
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "click openBTDialog opne system bt mBTSwitchOpenCallback BT_STATE_TURNING_OFF!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1463
    .line 1467
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
