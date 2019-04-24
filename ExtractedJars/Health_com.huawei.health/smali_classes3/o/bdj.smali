.class public Lo/bdj;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Lo/bfa;


# instance fields
.field private a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Lo/bdl;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdj;->c:Z

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    .line 48
    iput-object p1, p0, Lo/bdj;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    .line 50
    new-instance v0, Lo/bdl;

    invoke-direct {v0, p0}, Lo/bdl;-><init>(Lo/bfa;)V

    iput-object v0, p0, Lo/bdj;->d:Lo/bdl;

    .line 51
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 381
    const/4 v1, 0x0

    .line 382
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 384
    return-object v1

    .line 387
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 394
    :pswitch_0
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->h(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 395
    goto :goto_0

    .line 399
    :pswitch_1
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->g(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 400
    goto :goto_0

    .line 404
    :pswitch_2
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->f(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 405
    goto :goto_0

    .line 409
    :pswitch_3
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 410
    goto :goto_0

    .line 414
    :pswitch_4
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 415
    .line 420
    :goto_0
    :pswitch_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private b(I)I
    .locals 2

    .line 491
    const/4 v1, -0x1

    .line 492
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 499
    :pswitch_0
    const/4 v1, 0x6

    .line 500
    goto :goto_0

    .line 504
    :pswitch_1
    const/4 v1, 0x7

    .line 505
    goto :goto_0

    .line 509
    :pswitch_2
    const/16 v1, 0x8

    .line 510
    goto :goto_0

    .line 514
    :pswitch_3
    const/16 v1, 0x9

    .line 515
    goto :goto_0

    .line 519
    :pswitch_4
    const/16 v1, 0xa

    .line 520
    .line 525
    :goto_0
    :pswitch_5
    return v1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 324
    const/4 v1, 0x0

    .line 325
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 327
    return-object v1

    .line 329
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/bdj;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 330
    if-eqz v1, :cond_1

    .line 332
    return-object v1

    .line 334
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 338
    :pswitch_0
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 339
    goto :goto_0

    .line 343
    :pswitch_1
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 344
    goto :goto_0

    .line 348
    :pswitch_2
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 349
    goto :goto_0

    .line 353
    :pswitch_3
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->k(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 354
    goto :goto_0

    .line 358
    :pswitch_4
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->i(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 359
    goto :goto_0

    .line 363
    :pswitch_5
    iget-object v0, p0, Lo/bdj;->d:Lo/bdl;

    invoke-virtual {v0, p1, p2, p3}, Lo/bdl;->o(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 364
    .line 369
    :goto_0
    :pswitch_6
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method private f(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 3

    .line 532
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 534
    const/4 v2, 0x4

    goto :goto_0

    .line 538
    :cond_0
    const/4 v2, 0x5

    .line 540
    :goto_0
    return v2
.end method

.method private i(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 3

    .line 546
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 548
    const/4 v2, 0x2

    goto :goto_0

    .line 552
    :cond_0
    const/4 v2, 0x3

    .line 554
    :goto_0
    return v2
.end method

.method private k(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 3

    .line 560
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 562
    const/4 v2, 0x0

    goto :goto_0

    .line 566
    :cond_0
    const/4 v2, 0x1

    .line 568
    :goto_0
    return v2
.end method

.method private k()V
    .locals 2

    .line 625
    new-instance v0, Lo/bdm;

    invoke-direct {v0}, Lo/bdm;-><init>()V

    iget-object v1, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/bdm;->e(Ljava/util/ArrayList;)V

    .line 626
    return-void
.end method

.method private n(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 3

    .line 574
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 576
    const/16 v2, 0xb

    goto :goto_0

    .line 580
    :cond_0
    const/16 v2, 0xc

    .line 582
    :goto_0
    return v2
.end method


# virtual methods
.method public a(I)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 2

    .line 143
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 145
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_1
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    return-object v0
.end method

.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 1

    .line 130
    iget-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    .line 247
    const/4 v1, 0x0

    .line 248
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 249
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 252
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bqz;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    .line 255
    goto :goto_1

    .line 257
    :cond_0
    goto :goto_0

    .line 258
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 259
    return v1
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 110
    invoke-virtual {p0, p1}, Lo/bdj;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_0
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 115
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 598
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 599
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 600
    return-void
.end method

.method public b()Z
    .locals 1

    .line 65
    iget-boolean v0, p0, Lo/bdj;->c:Z

    .line 66
    return v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    .line 104
    return-object v0
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 1

    .line 186
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    if-gez p2, :cond_1

    .line 188
    :cond_0
    return-void

    .line 191
    :cond_1
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 192
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 193
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 203
    if-nez p1, :cond_0

    .line 205
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 206
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 207
    return-void

    .line 209
    :cond_0
    iput-object p1, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    .line 210
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 211
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lo/bdj;->c:Z

    .line 61
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 2

    .line 270
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    .line 271
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 272
    return v1
.end method

.method public d()I
    .locals 1

    .line 95
    iget-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 431
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 433
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 435
    return-object v2

    .line 437
    :cond_0
    goto :goto_0

    .line 438
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 1

    .line 164
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 166
    const/4 v0, 0x0

    return v0

    .line 168
    :cond_0
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 171
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 173
    const/4 v0, 0x1

    return v0

    .line 175
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 1

    .line 84
    iget-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 85
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 86
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 120
    invoke-virtual {p0, p1}, Lo/bdj;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lo/bdj;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 124
    :cond_0
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 125
    return-void
.end method

.method public f()Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 2

    .line 229
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    return-object v0

    .line 235
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 5

    .line 283
    const/4 v1, -0x1

    .line 284
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 286
    return v1

    .line 288
    :cond_0
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 289
    add-int/lit8 v3, v2, -0x1

    :goto_0
    if-ltz v3, :cond_2

    .line 291
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 292
    invoke-virtual {p1, v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 295
    move v1, v3

    .line 296
    goto :goto_1

    .line 289
    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 299
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 300
    return v1
.end method

.method public g()V
    .locals 1

    .line 218
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 219
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 220
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 136
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0, p1}, Lo/bdj;->a(I)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 153
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 4

    .line 444
    const/4 v1, -0x1

    .line 445
    invoke-virtual {p0, p1}, Lo/bdj;->a(I)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v2

    .line 446
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 448
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v3

    .line 449
    invoke-direct {p0, v3}, Lo/bdj;->b(I)I

    move-result v1

    .line 450
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 452
    return v1

    .line 454
    :cond_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 458
    :sswitch_0
    invoke-direct {p0, v2}, Lo/bdj;->k(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    .line 459
    goto :goto_0

    .line 463
    :sswitch_1
    invoke-direct {p0, v2}, Lo/bdj;->i(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    .line 464
    goto :goto_0

    .line 468
    :sswitch_2
    invoke-direct {p0, v2}, Lo/bdj;->f(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    .line 469
    goto :goto_0

    .line 473
    :sswitch_3
    invoke-direct {p0, v2}, Lo/bdj;->n(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    .line 474
    .line 480
    :cond_1
    :goto_0
    return v1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0xe -> :sswitch_3
    .end sparse-switch
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 306
    invoke-virtual {p0, p1}, Lo/bdj;->a(I)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    .line 307
    if-nez v1, :cond_0

    .line 309
    return-object p2

    .line 312
    :cond_0
    invoke-direct {p0, v1, p2, p3}, Lo/bdj;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 588
    const/16 v0, 0xd

    return v0
.end method

.method public h(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 609
    iget-object v0, p0, Lo/bdj;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 610
    invoke-virtual {p0}, Lo/bdj;->notifyDataSetChanged()V

    .line 611
    return-void
.end method

.method public i()Lcom/huawei/health/sns/ui/chat/ChatActivity;
    .locals 1

    .line 631
    iget-object v0, p0, Lo/bdj;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    return-object v0
.end method

.method public notifyDataSetChanged()V
    .locals 0

    .line 616
    invoke-direct {p0}, Lo/bdj;->k()V

    .line 617
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 618
    return-void
.end method
