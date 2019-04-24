.class Lo/bgq$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgq$a;->c(IIZ)Lo/bgq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bgq$a;

.field final synthetic d:Z

.field final synthetic e:Lo/bgq;


# direct methods
.method constructor <init>(Lo/bgq$a;Lo/bgq;Z)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    iput-object p2, p0, Lo/bgq$a$4;->e:Lo/bgq;

    iput-boolean p3, p0, Lo/bgq$a$4;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 150
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    iget-object v1, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v1}, Lo/bgq$a;->c(Lo/bgq$a;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bgq$a;->c(Lo/bgq$a;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    iget-object v0, p0, Lo/bgq$a$4;->e:Lo/bgq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 155
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->a(Lo/bgq$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    iget-boolean v0, p0, Lo/bgq$a$4;->d:Z

    if-nez v0, :cond_0

    .line 157
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->b(Lo/bgq$a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v1}, Lo/bgq$a;->e(Lo/bgq$a;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 158
    invoke-static {}, Lo/bgq;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " targetType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v2}, Lo/bgq$a;->e(Lo/bgq$a;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetValue = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->b(Lo/bgq$a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 161
    iget-object v0, p0, Lo/bgq$a$4;->e:Lo/bgq;

    invoke-virtual {v0}, Lo/bgq;->dismiss()V

    .line 162
    goto/16 :goto_1

    .line 163
    :cond_0
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->f(Lo/bgq$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v1}, Lo/bgq$a;->k(Lo/bgq$a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 164
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->h(Lo/bgq$a;)Landroid/widget/LinearLayout;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->start_track_custom_edt_bg_warning:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 165
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->d(Lo/bgq$a;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto/16 :goto_1

    .line 168
    :cond_1
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->e(Lo/bgq$a;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->a(Lo/bgq$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bgq$a;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 169
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bgq$a;->b(Z)V

    .line 170
    return-void

    .line 173
    :cond_2
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->a(Lo/bgq$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    .line 175
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->e(Lo/bgq$a;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 178
    :pswitch_0
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x1

    invoke-static {v0, v1, v5}, Lo/bgq$a;->e(Lo/bgq$a;IF)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 180
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bgq$a;->b(Z)V

    .line 181
    return-void

    .line 183
    :cond_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 184
    float-to-double v0, v5

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 185
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bgq$a;->c(Lo/bgq$a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 189
    :pswitch_1
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v5}, Lo/bgq$a;->e(Lo/bgq$a;IF)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 190
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bgq$a;->b(Z)V

    .line 191
    return-void

    .line 195
    :pswitch_2
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x2

    invoke-static {v0, v1, v5}, Lo/bgq$a;->e(Lo/bgq$a;IF)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 196
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bgq$a;->b(Z)V

    .line 197
    return-void

    .line 199
    :cond_4
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v5, v0

    .line 201
    .line 206
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->b(Lo/bgq$a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v1}, Lo/bgq$a;->e(Lo/bgq$a;)I

    move-result v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 207
    invoke-static {}, Lo/bgq;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " targetType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v2}, Lo/bgq$a;->e(Lo/bgq$a;)I

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

    .line 208
    iget-object v0, p0, Lo/bgq$a$4;->b:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->b(Lo/bgq$a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 210
    iget-object v0, p0, Lo/bgq$a$4;->e:Lo/bgq;

    invoke-virtual {v0}, Lo/bgq;->dismiss()V

    .line 213
    :cond_6
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
