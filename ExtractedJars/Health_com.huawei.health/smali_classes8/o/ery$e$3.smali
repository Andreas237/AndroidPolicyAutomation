.class Lo/ery$e$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ery$e;->e(II)Lo/ery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ery$e;

.field final synthetic d:Lo/ery;


# direct methods
.method constructor <init>(Lo/ery$e;Lo/ery;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/ery$e$3;->a:Lo/ery$e;

    iput-object p2, p0, Lo/ery$e$3;->d:Lo/ery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 138
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    iget-object v1, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v1}, Lo/ery$e;->b(Lo/ery$e;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ery$e;->c(Lo/ery$e;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    iget-object v0, p0, Lo/ery$e$3;->d:Lo/ery;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 143
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->d(Lo/ery$e;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->e(Lo/ery$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v1}, Lo/ery$e;->a(Lo/ery$e;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 145
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->i(Lo/ery$e;)Landroid/widget/RelativeLayout;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->start_track_custom_edt_bg_warning:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 146
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->c(Lo/ery$e;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto/16 :goto_1

    .line 148
    :cond_0
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->f(Lo/ery$e;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->d(Lo/ery$e;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ery$e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 149
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ery$e;->e(Z)V

    .line 150
    return-void

    .line 153
    :cond_1
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->d(Lo/ery$e;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    .line 155
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->f(Lo/ery$e;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 158
    :pswitch_0
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x1

    invoke-static {v0, v1, v5}, Lo/ery$e;->a(Lo/ery$e;IF)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ery$e;->e(Z)V

    .line 161
    return-void

    .line 163
    :cond_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 164
    float-to-double v0, v5

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 165
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ery$e;->c(Lo/ery$e;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 169
    :pswitch_1
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x0

    invoke-static {v0, v1, v5}, Lo/ery$e;->a(Lo/ery$e;IF)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 170
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ery$e;->e(Z)V

    .line 171
    return-void

    .line 173
    :cond_3
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v5, v0

    .line 175
    goto :goto_0

    .line 177
    :pswitch_2
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x2

    invoke-static {v0, v1, v5}, Lo/ery$e;->a(Lo/ery$e;IF)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 178
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ery$e;->e(Z)V

    .line 179
    return-void

    .line 181
    :cond_4
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v5, v0

    .line 183
    .line 190
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->h(Lo/ery$e;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v1}, Lo/ery$e;->f(Lo/ery$e;)I

    move-result v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 191
    invoke-static {}, Lo/ery;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " targetType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v2}, Lo/ery$e;->f(Lo/ery$e;)I

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

    .line 192
    iget-object v0, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->h(Lo/ery$e;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 194
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 195
    sget-object v0, Lo/dae;->ho:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 196
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    const-string v0, "goalType"

    iget-object v1, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v1}, Lo/ery$e;->f(Lo/ery$e;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 199
    const-string v0, "goalValue"

    float-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    :cond_6
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/ery$e$3;->a:Lo/ery$e;

    invoke-static {v1}, Lo/ery$e;->a(Lo/ery$e;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 207
    iget-object v0, p0, Lo/ery$e$3;->d:Lo/ery;

    invoke-virtual {v0}, Lo/ery;->dismiss()V

    .line 215
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
