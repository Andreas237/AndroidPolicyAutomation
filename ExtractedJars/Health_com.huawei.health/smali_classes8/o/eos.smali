.class public Lo/eos;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eos$b;
    }
.end annotation


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eoq;>;"
        }
    .end annotation
.end field

.field private d:Lo/eos$b;

.field private e:Lo/eoq;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/eoq;>;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 51
    iput-object p2, p0, Lo/eos;->c:Ljava/util/List;

    .line 52
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    .line 53
    iput-object p1, p0, Lo/eos;->b:Landroid/content/Context;

    .line 55
    return-void
.end method

.method private a(Landroid/view/View;I)Landroid/view/View;
    .locals 5

    .line 130
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    invoke-virtual {v0}, Lo/eoq;->b()I

    move-result v3

    .line 131
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_0

    .line 134
    :pswitch_0
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_title_two_image_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 135
    iget-object v0, p0, Lo/eos;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    sget v0, Lcom/huawei/ui/device/R$id;->settings_switch:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 137
    sget v0, Lcom/huawei/ui/device/R$mipmap;->btn_list_leftarrow:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 140
    :cond_0
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 141
    goto/16 :goto_0

    .line 145
    :pswitch_1
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_title_image_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 146
    iget-object v0, p0, Lo/eos;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    sget v0, Lcom/huawei/ui/device/R$id;->settings_switch:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 148
    sget v0, Lcom/huawei/ui/device/R$mipmap;->btn_list_leftarrow:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 151
    :cond_1
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 152
    goto :goto_0

    .line 155
    :pswitch_2
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_two_title_word_image:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 156
    iget-object v0, p0, Lo/eos;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    sget v0, Lcom/huawei/ui/device/R$id;->settings_switch:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 158
    sget v0, Lcom/huawei/ui/device/R$mipmap;->btn_list_leftarrow:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 161
    :cond_2
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 162
    goto :goto_0

    .line 165
    :pswitch_3
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_two_title_image_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 167
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 168
    .line 172
    :goto_0
    :pswitch_4
    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lo/eoq;Lo/eos$b;Z)V
    .locals 3

    .line 232
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 233
    return-void

    .line 236
    :cond_0
    invoke-virtual {p1}, Lo/eoq;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 237
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/eoq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 240
    :cond_1
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 242
    :goto_0
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 243
    if-eqz p3, :cond_2

    .line 244
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eos;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_list_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 246
    :cond_2
    iget-object v0, p2, Lo/eos$b;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eos;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 248
    :goto_1
    return-void
.end method

.method private b(Landroid/view/View;I)Landroid/view/View;
    .locals 5

    .line 176
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    invoke-virtual {v0}, Lo/eoq;->b()I

    move-result v3

    .line 177
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 181
    :sswitch_0
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_title_image_item_divider:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 182
    iget-object v0, p0, Lo/eos;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    sget v0, Lcom/huawei/ui/device/R$id;->settings_switch:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 184
    sget v0, Lcom/huawei/ui/device/R$mipmap;->btn_list_leftarrow:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 187
    :cond_0
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 188
    goto :goto_1

    .line 191
    :sswitch_1
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_divider:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 193
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 194
    goto :goto_1

    .line 196
    :goto_0
    if-nez p1, :cond_1

    .line 197
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_title_image_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 199
    :cond_1
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 202
    :goto_1
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Lo/eoq;Lo/eos$b;Z)V
    .locals 2

    .line 219
    iget-object v0, p2, Lo/eos$b;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 220
    return-void

    .line 222
    :cond_0
    invoke-virtual {p1}, Lo/eoq;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 223
    iget-object v0, p2, Lo/eos$b;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/eoq;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    iget-object v0, p2, Lo/eos$b;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 226
    :cond_1
    iget-object v0, p2, Lo/eos$b;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    :goto_0
    iget-object v0, p2, Lo/eos$b;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 229
    return-void
.end method

.method private c(Lo/eoq;Lo/eos$b;Z)V
    .locals 2

    .line 251
    iget-object v0, p2, Lo/eos$b;->c:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 252
    return-void

    .line 254
    :cond_0
    invoke-virtual {p1}, Lo/eoq;->i()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 255
    iget-object v0, p2, Lo/eos$b;->c:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    .line 257
    :cond_1
    iget-object v0, p2, Lo/eos$b;->c:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 259
    :goto_0
    iget-object v0, p2, Lo/eos$b;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 260
    return-void
.end method

.method private d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V
    .locals 2

    .line 313
    sget v0, Lcom/huawei/ui/device/R$id;->content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p4, Lo/eos$b;->a:Landroid/widget/TextView;

    .line 314
    sget v0, Lcom/huawei/ui/device/R$id;->sub_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p4, Lo/eos$b;->e:Landroid/widget/TextView;

    .line 315
    sget v0, Lcom/huawei/ui/device/R$id;->right_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p4, Lo/eos$b;->d:Landroid/widget/TextView;

    .line 316
    sget v0, Lcom/huawei/ui/device/R$id;->new_tip:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p4, Lo/eos$b;->c:Landroid/widget/FrameLayout;

    .line 317
    sget v0, Lcom/huawei/ui/device/R$id;->switch_button:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p4, Lo/eos$b;->b:Landroid/widget/Switch;

    .line 318
    sget v0, Lcom/huawei/ui/device/R$id;->item_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p4, Lo/eos$b;->h:Landroid/widget/ImageView;

    .line 319
    sget v0, Lcom/huawei/ui/device/R$id;->item_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p4, Lo/eos$b;->k:Landroid/view/View;

    .line 320
    invoke-virtual {p3}, Lo/eoq;->k()Z

    move-result v1

    .line 321
    invoke-direct {p0, p3, p4, v1}, Lo/eos;->d(Lo/eoq;Lo/eos$b;Z)V

    .line 322
    invoke-direct {p0, p3, p4, v1}, Lo/eos;->b(Lo/eoq;Lo/eos$b;Z)V

    .line 323
    invoke-direct {p0, p3, p4, v1}, Lo/eos;->a(Lo/eoq;Lo/eos$b;Z)V

    .line 324
    invoke-direct {p0, p3, p4, v1}, Lo/eos;->c(Lo/eoq;Lo/eos$b;Z)V

    .line 325
    invoke-direct {p0, p3, p4, v1}, Lo/eos;->e(Lo/eoq;Lo/eos$b;Z)V

    .line 326
    invoke-direct {p0, p3, p4, v1}, Lo/eos;->i(Lo/eoq;Lo/eos$b;Z)V

    .line 327
    invoke-direct {p0, p4, v1, p1}, Lo/eos;->e(Lo/eos$b;ZI)V

    .line 328
    return-void
.end method

.method private d(Lo/eoq;Lo/eos$b;Z)V
    .locals 2

    .line 206
    iget-object v0, p2, Lo/eos$b;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 207
    return-void

    .line 209
    :cond_0
    invoke-virtual {p1}, Lo/eoq;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 210
    iget-object v0, p2, Lo/eos$b;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/eoq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-object v0, p2, Lo/eos$b;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 213
    :cond_1
    iget-object v0, p2, Lo/eos$b;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 215
    :goto_0
    iget-object v0, p2, Lo/eos$b;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 216
    return-void
.end method

.method private e(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .line 108
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    invoke-virtual {v0}, Lo/eoq;->b()I

    move-result v3

    .line 109
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 112
    :sswitch_0
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_two_title_switch_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 114
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 115
    goto :goto_0

    .line 119
    :sswitch_1
    iget-object v0, p0, Lo/eos;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_title_switch_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 121
    iget-object v0, p0, Lo/eos;->e:Lo/eoq;

    iget-object v1, p0, Lo/eos;->d:Lo/eos$b;

    invoke-direct {p0, p2, p1, v0, v1}, Lo/eos;->d(ILandroid/view/View;Lo/eoq;Lo/eos$b;)V

    .line 122
    .line 126
    :goto_0
    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private e(Lo/eoq;Lo/eos$b;Z)V
    .locals 2

    .line 263
    iget-object v0, p2, Lo/eos$b;->b:Landroid/widget/Switch;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 264
    return-void

    .line 266
    :cond_0
    invoke-virtual {p1}, Lo/eoq;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 267
    iget-object v0, p2, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-virtual {p1}, Lo/eoq;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 268
    iget-object v0, p2, Lo/eos$b;->b:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setVisibility(I)V

    .line 270
    iget-object v0, p2, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-virtual {p1}, Lo/eoq;->f()Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_0

    .line 272
    :cond_1
    iget-object v0, p2, Lo/eos$b;->b:Landroid/widget/Switch;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setVisibility(I)V

    .line 274
    :goto_0
    iget-object v0, p2, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-virtual {v0, p3}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 275
    return-void
.end method

.method private e(Lo/eos$b;ZI)V
    .locals 3

    .line 292
    iget-object v0, p1, Lo/eos$b;->k:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 293
    return-void

    .line 295
    :cond_0
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p3, v0, :cond_2

    const/4 v0, 0x0

    if-gt v0, p3, :cond_2

    .line 296
    iget-object v0, p1, Lo/eos$b;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 297
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    add-int/lit8 v1, p3, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eoq;

    .line 298
    invoke-virtual {v0}, Lo/eoq;->b()I

    move-result v2

    .line 299
    const/4 v0, 0x5

    if-ne v2, v0, :cond_1

    .line 300
    iget-object v0, p1, Lo/eos$b;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 302
    :cond_1
    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eoq;

    .line 303
    invoke-virtual {v0}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0x11

    if-ne v0, v1, :cond_3

    .line 304
    iget-object v0, p1, Lo/eos$b;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 306
    :cond_3
    iget-object v0, p1, Lo/eos$b;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 309
    :goto_0
    iget-object v0, p1, Lo/eos$b;->k:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 310
    return-void
.end method

.method private i(Lo/eoq;Lo/eos$b;Z)V
    .locals 2

    .line 278
    iget-object v0, p2, Lo/eos$b;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 279
    return-void

    .line 281
    :cond_0
    invoke-virtual {p1}, Lo/eoq;->h()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 283
    iget-object v0, p2, Lo/eos$b;->h:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lo/eoq;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 284
    iget-object v0, p2, Lo/eos$b;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 286
    :cond_1
    iget-object v0, p2, Lo/eos$b;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 288
    :goto_0
    iget-object v0, p2, Lo/eos$b;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p3}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 289
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 59
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 64
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 65
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 67
    :cond_1
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 72
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 84
    invoke-virtual {p0, p1}, Lo/eos;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eoq;

    .line 85
    invoke-virtual {v1}, Lo/eoq;->b()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 90
    const/4 v4, 0x0

    .line 91
    new-instance v5, Lo/eos$b;

    invoke-direct {v5}, Lo/eos$b;-><init>()V

    .line 93
    :try_start_0
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eoq;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_0

    .line 94
    :catch_0
    move-exception v6

    .line 95
    const-string v0, "DeviceSettingFactoryBaseAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x0

    return-object v0

    .line 98
    :goto_0
    iput-object v4, p0, Lo/eos;->e:Lo/eoq;

    .line 99
    iput-object v5, p0, Lo/eos;->d:Lo/eos$b;

    .line 100
    invoke-direct {p0, p2, p1}, Lo/eos;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    .line 101
    invoke-direct {p0, p2, p1}, Lo/eos;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    .line 102
    invoke-direct {p0, p2, p1}, Lo/eos;->b(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    .line 103
    invoke-virtual {p2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 104
    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 1

    .line 332
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 333
    iget-object v0, p0, Lo/eos;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eoq;

    invoke-virtual {v0}, Lo/eoq;->k()Z

    move-result v0

    return v0

    .line 335
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result v0

    return v0
.end method
