.class Lo/agn$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/agn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/agn;


# direct methods
.method constructor <init>(Lo/agn;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/agn$5;->a:Lo/agn;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 127
    iget v4, p1, Landroid/os/Message;->what:I

    .line 128
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    .line 130
    :pswitch_0
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/agn;->a(Lo/agn;I)V

    .line 131
    goto/16 :goto_2

    .line 133
    :pswitch_1
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->d(Lo/agn;)V

    .line 134
    goto/16 :goto_2

    .line 136
    :pswitch_2
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->c(Lo/agn;)V

    .line 137
    goto/16 :goto_2

    .line 139
    :pswitch_3
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->e(Lo/agn;)V

    .line 140
    goto :goto_2

    .line 142
    :pswitch_4
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->a(Lo/agn;)V

    .line 143
    goto :goto_2

    .line 145
    :pswitch_5
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->g(Lo/agn;)V

    .line 146
    goto :goto_2

    .line 148
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 149
    const/4 v0, 0x2

    if-ne v5, v0, :cond_0

    .line 150
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->h(Lo/agn;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v1}, Lo/agn;->i(Lo/agn;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->k(Lo/agn;)V

    goto :goto_0

    .line 153
    :cond_0
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->h(Lo/agn;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v1}, Lo/agn;->i(Lo/agn;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->f(Lo/agn;)V

    .line 156
    :goto_0
    iget-object v0, p0, Lo/agn$5;->a:Lo/agn;

    invoke-virtual {v0}, Lo/agn;->a()V

    .line 157
    goto :goto_2

    .line 159
    :goto_1
    :pswitch_7
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_2
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 164
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_7
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
