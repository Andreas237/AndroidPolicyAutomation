.class Lo/chh$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/chh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/chh;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/chh;)V
    .locals 1

    .line 116
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 117
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/chh$c;->e:Ljava/lang/ref/WeakReference;

    .line 118
    return-void
.end method

.method private e(ILo/chh;)V
    .locals 5

    .line 134
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_4

    .line 136
    :pswitch_0
    invoke-static {p2}, Lo/chh;->e(Lo/chh;)F

    move-result v0

    const/high16 v1, 0x43b40000    # 360.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p2, v0}, Lo/chh;->c(Lo/chh;Z)Z

    .line 137
    invoke-static {p2}, Lo/chh;->b(Lo/chh;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    invoke-static {p2}, Lo/chh;->c(Lo/chh;)Lo/chh$e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 139
    invoke-static {p2}, Lo/chh;->c(Lo/chh;)Lo/chh$e;

    move-result-object v0

    invoke-interface {v0}, Lo/chh$e;->a()V

    .line 140
    const/4 v0, 0x0

    invoke-static {p2, v0}, Lo/chh;->a(Lo/chh;F)F

    .line 142
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/chh$c;->removeMessages(I)V

    goto/16 :goto_4

    .line 144
    :cond_2
    move-object v4, p2

    invoke-static {v4}, Lo/chh;->e(Lo/chh;)F

    move-result v0

    invoke-static {p2}, Lo/chh;->a(Lo/chh;)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {v4, v0}, Lo/chh;->a(Lo/chh;F)F

    .line 145
    invoke-virtual {p2}, Lo/chh;->invalidate()V

    .line 146
    const/4 v0, 0x0

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lo/chh$c;->sendEmptyMessageDelayed(IJ)Z

    .line 148
    goto/16 :goto_4

    .line 150
    :pswitch_1
    invoke-static {p2}, Lo/chh;->e(Lo/chh;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-static {p2, v0}, Lo/chh;->e(Lo/chh;Z)Z

    .line 151
    invoke-static {p2}, Lo/chh;->d(Lo/chh;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 152
    move-object v4, p2

    invoke-static {v4}, Lo/chh;->e(Lo/chh;)F

    move-result v0

    invoke-static {p2}, Lo/chh;->a(Lo/chh;)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {v4, v0}, Lo/chh;->a(Lo/chh;F)F

    .line 153
    invoke-virtual {p2}, Lo/chh;->invalidate()V

    .line 154
    const/4 v0, 0x1

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lo/chh$c;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_4

    .line 156
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/chh$c;->removeMessages(I)V

    .line 159
    goto/16 :goto_4

    .line 161
    :pswitch_2
    invoke-static {p2}, Lo/chh;->f(Lo/chh;)F

    move-result v0

    invoke-static {p2}, Lo/chh;->i(Lo/chh;)F

    move-result v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    invoke-static {p2, v0}, Lo/chh;->d(Lo/chh;Z)Z

    .line 162
    invoke-static {p2}, Lo/chh;->k(Lo/chh;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 163
    move-object v4, p2

    invoke-static {v4}, Lo/chh;->i(Lo/chh;)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-float v0, v0

    invoke-static {v4, v0}, Lo/chh;->b(Lo/chh;F)F

    .line 164
    invoke-virtual {p2}, Lo/chh;->invalidate()V

    .line 165
    const/4 v0, 0x2

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lo/chh$c;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_4

    .line 167
    :cond_6
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/chh$c;->removeMessages(I)V

    .line 170
    goto :goto_4

    .line 172
    :pswitch_3
    invoke-static {p2}, Lo/chh;->i(Lo/chh;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    invoke-static {p2, v0}, Lo/chh;->a(Lo/chh;Z)Z

    .line 174
    invoke-static {p2}, Lo/chh;->h(Lo/chh;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 175
    move-object v4, p2

    invoke-static {v4}, Lo/chh;->i(Lo/chh;)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    sub-double/2addr v0, v2

    double-to-float v0, v0

    invoke-static {v4, v0}, Lo/chh;->b(Lo/chh;F)F

    .line 176
    invoke-virtual {p2}, Lo/chh;->invalidate()V

    .line 177
    const/4 v0, 0x3

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lo/chh$c;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_4

    .line 179
    :cond_8
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/chh$c;->removeMessages(I)V

    .line 182
    .line 186
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 122
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 123
    iget-object v0, p0, Lo/chh$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/chh;

    .line 124
    if-nez v4, :cond_0

    .line 125
    const-string v0, "Track_CircleProgressButton"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LongPressHandler weakReference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void

    .line 129
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-direct {p0, v0, v4}, Lo/chh$c;->e(ILo/chh;)V

    .line 131
    return-void
.end method
