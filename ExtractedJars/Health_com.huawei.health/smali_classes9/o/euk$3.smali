.class Lo/euk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/euk;->e(Lo/eug;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eug;

.field final synthetic e:Lo/euk;


# direct methods
.method constructor <init>(Lo/euk;Lo/eug;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/euk$3;->e:Lo/euk;

    iput-object p2, p0, Lo/euk$3;->a:Lo/eug;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 110
    invoke-static {}, Lo/euk;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount initCallback  isSuccess = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    if-nez p1, :cond_0

    .line 112
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isSuccess = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 114
    :cond_0
    return-void
.end method

.method public b(ILjava/lang/Boolean;)V
    .locals 4

    .line 63
    invoke-static {}, Lo/euk;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount logoutCallback  isSuccess = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 66
    :pswitch_0
    invoke-static {}, Lo/euk;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount IAuthorizeCallback.ResultCode.SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    invoke-interface {v0, p2}, Lo/eug;->b(Ljava/lang/Object;)V

    .line 68
    goto :goto_1

    .line 70
    :pswitch_1
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    const-string v1, ""

    const/4 v2, 0x5

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 71
    goto :goto_1

    .line 73
    :pswitch_2
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    const-string v1, ""

    const/16 v2, 0x9

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 74
    goto :goto_1

    .line 76
    :goto_0
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    const-string v1, ""

    const/16 v2, 0x9

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 79
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .line 83
    invoke-static {}, Lo/euk;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount logoutCallback  resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",accessToken = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ",userID = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    const-string v2, ",userName = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object p4, v1, v2

    const-string v2, ",siteId = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 87
    :pswitch_0
    new-instance v4, Lo/eui;

    invoke-direct {v4}, Lo/eui;-><init>()V

    .line 88
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/eui;->c(I)V

    .line 89
    invoke-virtual {v4, p3}, Lo/eui;->e(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v4, p2}, Lo/eui;->a(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v4, p4}, Lo/eui;->c(Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    invoke-interface {v0, v4}, Lo/eug;->b(Ljava/lang/Object;)V

    .line 93
    goto :goto_1

    .line 95
    :pswitch_1
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    const-string v1, ""

    const/4 v2, 0x5

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 96
    invoke-static {}, Lo/euk;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount IAuthorizeCallback.ResultCode.FAILURE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    goto :goto_1

    .line 99
    :pswitch_2
    invoke-static {}, Lo/euk;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeChatAccount IAuthorizeCallback.ResultCode.CANCEL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    const-string v1, ""

    const/16 v2, 0x9

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 101
    goto :goto_1

    .line 103
    :goto_0
    iget-object v0, p0, Lo/euk$3;->a:Lo/eug;

    const-string v1, ""

    const/16 v2, 0x9

    invoke-interface {v0, v2, v1}, Lo/eug;->b(ILjava/lang/String;)V

    .line 106
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
