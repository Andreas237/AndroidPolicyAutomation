.class public Lo/bnv;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bnv$d;
    }
.end annotation


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:[Landroid/graphics/drawable/Drawable;

.field protected c:Lo/bri;

.field protected d:Landroid/widget/TextView;

.field protected e:Landroid/widget/ImageView;

.field protected h:Landroid/os/Handler;

.field protected k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 58
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 47
    new-instance v0, Lo/bnv$1;

    invoke-direct {v0, p0}, Lo/bnv$1;-><init>(Lo/bnv;)V

    iput-object v0, p0, Lo/bnv;->h:Landroid/os/Handler;

    .line 59
    invoke-direct {p0, p1}, Lo/bnv;->d(Landroid/content/Context;)V

    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    new-instance v0, Lo/bnv$1;

    invoke-direct {v0, p0}, Lo/bnv$1;-><init>(Lo/bnv;)V

    iput-object v0, p0, Lo/bnv;->h:Landroid/os/Handler;

    .line 64
    invoke-direct {p0, p1}, Lo/bnv;->d(Landroid/content/Context;)V

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 68
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    new-instance v0, Lo/bnv$1;

    invoke-direct {v0, p0}, Lo/bnv$1;-><init>(Lo/bnv;)V

    iput-object v0, p0, Lo/bnv;->h:Landroid/os/Handler;

    .line 69
    invoke-direct {p0, p1}, Lo/bnv;->d(Landroid/content/Context;)V

    .line 70
    return-void
.end method

.method static synthetic b(Lo/bnv;I)I
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lo/bnv;->e(I)I

    move-result v0

    return v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 3

    .line 73
    iput-object p1, p0, Lo/bnv;->a:Landroid/content/Context;

    .line 74
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->widget_voice_recorder:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 76
    sget v0, Lcom/huawei/android/sns/R$id;->mic_image:I

    invoke-virtual {p0, v0}, Lo/bnv;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bnv;->e:Landroid/widget/ImageView;

    .line 77
    sget v0, Lcom/huawei/android/sns/R$id;->recording_hint:I

    invoke-virtual {p0, v0}, Lo/bnv;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    .line 79
    new-instance v0, Lo/bri;

    iget-object v1, p0, Lo/bnv;->h:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bri;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/bnv;->c:Lo/bri;

    .line 82
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_01:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 83
    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_02:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 84
    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_03:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 85
    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_04:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 86
    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_05:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 87
    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_06:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 88
    invoke-virtual {p0}, Lo/bnv;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->record_animate_07:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bnv;->b:[Landroid/graphics/drawable/Drawable;

    .line 90
    return-void
.end method

.method private e(I)I
    .locals 3

    .line 43
    iget-object v0, p0, Lo/bnv;->b:[Landroid/graphics/drawable/Drawable;

    array-length v0, v0

    const/16 v1, 0x32

    div-int v0, v1, v0

    div-int v2, p1, v0

    .line 44
    iget-object v0, p0, Lo/bnv;->b:[Landroid/graphics/drawable/Drawable;

    array-length v0, v0

    if-lt v2, v0, :cond_0

    iget-object v0, p0, Lo/bnv;->b:[Landroid/graphics/drawable/Drawable;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 220
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/bnv;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    invoke-virtual {v0}, Lo/bri;->a()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 5

    .line 207
    const-string v0, "VoiceRecorderView"

    const-string v1, "discardRecording"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :try_start_0
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    invoke-virtual {v0}, Lo/bri;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    invoke-virtual {v0}, Lo/bri;->c()V

    .line 212
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/bnv;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    :cond_0
    goto :goto_0

    .line 214
    :catch_0
    move-exception v4

    .line 215
    const-string v0, "VoiceRecorderView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e.getMessage(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    :goto_0
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 4

    .line 175
    const-string v0, "VoiceRecorderView"

    const-string v1, "startRecording"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lo/bnv;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->move_up_to_cancel:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    iget-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 181
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    iget-object v1, p0, Lo/bnv;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lo/bri;->b(Landroid/content/Context;Landroid/view/View;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    goto :goto_0

    .line 182
    :catch_0
    move-exception v3

    .line 183
    const-string v0, "VoiceRecorderView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startRecording Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    invoke-virtual {v0}, Lo/bri;->c()V

    .line 186
    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/bnv;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->recoding_fail:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 188
    return-void

    .line 190
    :goto_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 200
    const-string v0, "VoiceRecorderView"

    const-string v1, "showMoveUpToCancelHint"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->move_up_to_cancel:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    iget-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 204
    return-void
.end method

.method public d(Landroid/view/View;Landroid/view/MotionEvent;Lo/bnv$d;)Z
    .locals 4

    .line 96
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 98
    :pswitch_0
    const-string v0, "VoiceRecorderView"

    const-string v1, "motion event down"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 104
    invoke-virtual {p0, p1}, Lo/bnv;->b(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 105
    :catch_0
    move-exception v3

    .line 106
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 108
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 110
    :pswitch_1
    const-string v0, "VoiceRecorderView"

    const-string v1, "motion event move"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 112
    invoke-virtual {p0}, Lo/bnv;->e()V

    goto :goto_1

    .line 114
    :cond_0
    invoke-virtual {p0}, Lo/bnv;->d()V

    .line 116
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 118
    :pswitch_2
    const-string v0, "VoiceRecorderView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "motion event up st="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isVoiceRecordTimeout="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lo/bnv;->k:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo/bnv;->k:Z

    if-eqz v0, :cond_1

    .line 121
    const-string v0, "VoiceRecorderView"

    const-string v1, "motion event up is already timeout process"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnv;->k:Z

    .line 123
    const/4 v0, 0x1

    return v0

    .line 125
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 127
    const-string v0, "VoiceRecorderView"

    const-string v1, "motion event up is timeout "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bnv;->k:Z

    .line 129
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 132
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 134
    invoke-virtual {p0}, Lo/bnv;->b()V

    goto :goto_3

    .line 138
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Lo/bnv;->a()I

    move-result v3

    .line 139
    if-lez v3, :cond_4

    .line 140
    if-eqz p3, :cond_6

    .line 141
    invoke-virtual {p0}, Lo/bnv;->getVoiceFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0, v3}, Lo/bnv$d;->e(Ljava/lang/String;I)V

    goto :goto_2

    .line 143
    :cond_4
    const/4 v0, -0x1

    if-ne v3, v0, :cond_5

    .line 144
    iget-object v0, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->Recording_without_permission:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 146
    :cond_5
    iget-object v0, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->The_recording_time_is_too_short:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 152
    :cond_6
    :goto_2
    goto :goto_3

    .line 148
    :catch_1
    move-exception v3

    .line 150
    const-string v0, "VoiceRecorderView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->send_failure_please:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 154
    :goto_3
    const/4 v0, 0x1

    return v0

    .line 156
    :goto_4
    const-string v0, "VoiceRecorderView"

    const-string v1, "motion event default"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    invoke-virtual {p0}, Lo/bnv;->b()V

    .line 158
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public e()V
    .locals 3

    .line 193
    const-string v0, "VoiceRecorderView"

    const-string v1, "showReleaseToCancelHint"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bnv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->release_to_cancel:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    iget-object v0, p0, Lo/bnv;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->recording_text_hint_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 197
    return-void
.end method

.method public getVoiceFileName()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    invoke-virtual {v0}, Lo/bri;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVoiceFilePath()Ljava/lang/String;
    .locals 1

    .line 225
    iget-object v0, p0, Lo/bnv;->c:Lo/bri;

    invoke-virtual {v0}, Lo/bri;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
