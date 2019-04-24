.class public Lo/bes;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 446
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/bes;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 447
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 1

    .line 391
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    return v0
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 202
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 206
    :sswitch_0
    invoke-direct {p0, p1}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 207
    goto :goto_0

    .line 210
    :sswitch_1
    invoke-direct {p0, p1}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 211
    .line 215
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 286
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 294
    :sswitch_0
    invoke-direct {p0, p1}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 295
    invoke-direct {p0, p1}, Lo/bes;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 296
    goto :goto_0

    .line 299
    :sswitch_1
    invoke-direct {p0, p1}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 300
    .line 304
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 225
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    .line 233
    :sswitch_0
    invoke-direct {p0, p2}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 234
    invoke-direct {p0, p2}, Lo/bes;->f(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 235
    goto :goto_0

    .line 238
    :sswitch_1
    invoke-direct {p0, p2}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 239
    .line 243
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/bes;->d(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    return-void
.end method

.method private static c(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 451
    new-instance v0, Lo/bes$2;

    invoke-direct {v0, p0}, Lo/bes$2;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 1

    .line 254
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 258
    :pswitch_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lo/bes;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 259
    goto :goto_0

    .line 266
    :pswitch_1
    invoke-direct {p0, p1}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 267
    goto :goto_0

    .line 270
    :pswitch_2
    invoke-direct {p0, p1}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 271
    .line 275
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lo/bes;->b(Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    return-void
.end method

.method static synthetic c(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/bes;->b(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    return-void
.end method

.method static synthetic c(Lo/bes;Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/bes;->b(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 3

    .line 403
    invoke-direct {p0, p1}, Lo/bes;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    .line 404
    const/4 v2, 0x0

    .line 405
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 409
    :pswitch_0
    sget v2, Lcom/huawei/android/sns/R$array;->message_text_long_click_item:I

    .line 410
    goto :goto_1

    .line 413
    :pswitch_1
    sget v2, Lcom/huawei/android/sns/R$array;->message_pic_long_click_item:I

    .line 414
    goto :goto_1

    .line 417
    :pswitch_2
    sget v2, Lcom/huawei/android/sns/R$array;->message_voice_long_click_item:I

    .line 418
    goto :goto_1

    .line 421
    :pswitch_3
    sget v2, Lcom/huawei/android/sns/R$array;->message_link_long_click_item:I

    .line 422
    goto :goto_1

    .line 425
    :pswitch_4
    sget v2, Lcom/huawei/android/sns/R$array;->message_assistant_html_long_click_item:I

    .line 426
    goto :goto_1

    .line 429
    :pswitch_5
    sget v2, Lcom/huawei/android/sns/R$array;->message_assistant_other_long_click_item:I

    .line 430
    goto :goto_1

    .line 432
    :goto_0
    :pswitch_6
    sget v2, Lcom/huawei/android/sns/R$array;->message_other_long_click_item:I

    .line 435
    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
    .end packed-switch
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 368
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 372
    :sswitch_0
    invoke-direct {p0, p1}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 373
    goto :goto_0

    .line 376
    :sswitch_1
    invoke-direct {p0, p1}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 377
    .line 381
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 340
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 348
    :sswitch_0
    invoke-direct {p0, p1}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 349
    invoke-direct {p0, p1}, Lo/bes;->g(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 350
    goto :goto_0

    .line 353
    :sswitch_1
    invoke-direct {p0, p1}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 354
    .line 358
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    .line 583
    const-string v0, "clipboard"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/ClipboardManager;

    .line 584
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 585
    return-void
.end method

.method static synthetic d(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lo/bes;->d(Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    return-void
.end method

.method static synthetic d(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/bes;->e(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    return-void
.end method

.method static synthetic e(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/bes;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    return v0
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 475
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/bes;->h(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 476
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 315
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 319
    :sswitch_0
    invoke-direct {p0, p1}, Lo/bes;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 320
    invoke-direct {p0, p1}, Lo/bes;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 321
    goto :goto_0

    .line 324
    :sswitch_1
    invoke-direct {p0, p1}, Lo/bes;->p(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 325
    .line 329
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic e(Lo/bes;Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/bes;->c(Lcom/huawei/health/sns/model/chat/MessageItem;ILandroid/content/Context;)V

    return-void
.end method

.method private f(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 519
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/bes;->k(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 520
    return-void
.end method

.method private g(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 497
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/bes;->i(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 498
    return-void
.end method

.method private static h(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 480
    new-instance v0, Lo/bes$1;

    invoke-direct {v0, p0}, Lo/bes$1;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private static i(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 502
    new-instance v0, Lo/bes$5;

    invoke-direct {v0, p0}, Lo/bes$5;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private static k(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 524
    new-instance v0, Lo/bes$4;

    invoke-direct {v0, p0}, Lo/bes$4;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private p(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 575
    const/16 v0, 0x9

    const/16 v1, 0x17

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 577
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V
    .locals 2

    .line 146
    invoke-direct {p0, p2}, Lo/bes;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    .line 148
    new-instance v0, Lo/bes$3;

    invoke-direct {v0, p0, p3, p2, p1}, Lo/bes$3;-><init>(Lo/bes;Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/ui/chat/ChatActivity;)V

    invoke-static {p1, v1, v0}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 192
    return-void
.end method
