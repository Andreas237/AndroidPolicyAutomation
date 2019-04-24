.class Lo/ehb$d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ehb$d;->b(II)Lo/ehb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ehb;

.field final synthetic e:Lo/ehb$d;


# direct methods
.method constructor <init>(Lo/ehb$d;Lo/ehb;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    iput-object p2, p0, Lo/ehb$d$1;->b:Lo/ehb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 130
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    iget-object v1, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v1}, Lo/ehb$d;->c(Lo/ehb$d;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ehb$d;->d(Lo/ehb$d;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    iget-object v0, p0, Lo/ehb$d$1;->b:Lo/ehb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 135
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->d(Lo/ehb$d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->b(Lo/ehb$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v1}, Lo/ehb$d;->e(Lo/ehb$d;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->a(Lo/ehb$d;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->start_track_custom_edt_bg_warning:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 138
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->f(Lo/ehb$d;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto/16 :goto_1

    .line 140
    :cond_0
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->i(Lo/ehb$d;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->d(Lo/ehb$d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ehb$d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ehb$d;->a(Z)V

    .line 142
    return-void

    .line 145
    :cond_1
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->d(Lo/ehb$d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    .line 147
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->i(Lo/ehb$d;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 150
    :pswitch_0
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x1

    invoke-static {v0, v1, v5}, Lo/ehb$d;->e(Lo/ehb$d;IF)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ehb$d;->a(Z)V

    .line 153
    return-void

    .line 155
    :cond_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 156
    float-to-double v0, v5

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 157
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ehb$d;->d(Lo/ehb$d;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 161
    :pswitch_1
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x0

    invoke-static {v0, v1, v5}, Lo/ehb$d;->e(Lo/ehb$d;IF)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ehb$d;->a(Z)V

    .line 163
    return-void

    .line 165
    :cond_3
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v5, v0

    .line 167
    goto :goto_0

    .line 169
    :pswitch_2
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x2

    invoke-static {v0, v1, v5}, Lo/ehb$d;->e(Lo/ehb$d;IF)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 170
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ehb$d;->a(Z)V

    .line 171
    return-void

    .line 173
    :cond_4
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v5, v0

    .line 175
    .line 182
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->k(Lo/ehb$d;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v1}, Lo/ehb$d;->i(Lo/ehb$d;)I

    move-result v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 183
    invoke-static {}, Lo/ehb;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " targetType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v2}, Lo/ehb$d;->i(Lo/ehb$d;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetValue = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    iget-object v0, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v0}, Lo/ehb$d;->k(Lo/ehb$d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 186
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 187
    sget-object v0, Lo/dae;->ho:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 188
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const-string v0, "goalType"

    iget-object v1, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v1}, Lo/ehb$d;->i(Lo/ehb$d;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 191
    const-string v0, "goalValue"

    float-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    :cond_6
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/ehb$d$1;->e:Lo/ehb$d;

    invoke-static {v1}, Lo/ehb$d;->e(Lo/ehb$d;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 199
    iget-object v0, p0, Lo/ehb$d$1;->b:Lo/ehb;

    invoke-virtual {v0}, Lo/ehb;->dismiss()V

    .line 207
    :cond_7
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
