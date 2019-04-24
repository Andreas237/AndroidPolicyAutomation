.class public Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.super Lcom/huawei/health/sns/ui/chat/ChatActivity;
.source "SourceFile"

# interfaces
.implements Lo/awm$d;
.implements Lo/awq$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$c;
    }
.end annotation


# static fields
.field private static final af:Ljava/util/concurrent/ExecutorService;


# instance fields
.field protected A:Z

.field protected B:Landroid/widget/TextView;

.field protected C:Lo/bei;

.field protected D:Z

.field protected E:Z

.field protected F:Landroid/app/Instrumentation;

.field public G:I

.field public H:I

.field protected I:Landroid/os/Handler;

.field protected J:Z

.field protected K:Landroid/widget/ImageView;

.field protected L:Z

.field protected M:Landroid/widget/LinearLayout;

.field protected N:Landroid/view/animation/Animation;

.field protected O:Landroid/os/Handler;

.field P:Z

.field protected Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field

.field protected R:Z

.field protected S:Z

.field T:Landroid/widget/AdapterView$OnItemClickListener;

.field private U:Lo/bnv;

.field private V:Landroid/net/Uri;

.field private W:Z

.field protected X:Landroid/widget/AbsListView$OnScrollListener;

.field private Y:Lo/bnm;

.field private Z:Lo/arp;

.field private aa:Landroid/app/AlertDialog;

.field private ab:Z

.field private ac:Landroid/app/AlertDialog;

.field private final ad:Landroid/database/ContentObserver;

.field private ae:Landroid/app/AlertDialog;

.field private ag:Lo/bio;

.field private ah:J

.field protected j:Lo/bdu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 394
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$3;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->af:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;-><init>()V

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D:Z

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->A:Z

    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->W:Z

    .line 188
    new-instance v0, Landroid/app/Instrumentation;

    invoke-direct {v0}, Landroid/app/Instrumentation;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->F:Landroid/app/Instrumentation;

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->V:Landroid/net/Uri;

    .line 228
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    .line 233
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->G:I

    .line 238
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->E:Z

    .line 288
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->L:Z

    .line 293
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    .line 298
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->M:Landroid/widget/LinearLayout;

    .line 313
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->R:Z

    .line 318
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->S:Z

    .line 323
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    .line 328
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac:Landroid/app/AlertDialog;

    .line 333
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    .line 353
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab:Z

    .line 364
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->P:Z

    .line 369
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    .line 374
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    .line 379
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    .line 384
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ah:J

    .line 488
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$14;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$14;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ad:Landroid/database/ContentObserver;

    .line 1357
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->X:Landroid/widget/AbsListView$OnScrollListener;

    .line 2214
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->T:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method private O()V
    .locals 8

    .line 525
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 526
    if-eqz v2, :cond_5

    .line 528
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 529
    if-nez v3, :cond_0

    .line 531
    const-string v0, "ChatCommonActivity"

    const-string v1, "intent.getExtras is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    return-void

    .line 534
    :cond_0
    const-string v0, "is_share_msg"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 536
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D:Z

    .line 538
    :cond_1
    const-string v0, "is_from_msg_search"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 540
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D:Z

    .line 542
    :cond_2
    const-string v0, "refresh_searchView"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 544
    const-string v0, "refresh_searchView"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->t:Z

    .line 546
    :cond_3
    const-string v0, "extra_noti_hwid"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 548
    const-string v0, "extra_noti_hwid"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 549
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 550
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    .line 552
    const-string v0, "ChatCommonActivity"

    const-string v1, "My hwid different with noti hwid."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->finish()V

    .line 556
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y()V

    .line 559
    :cond_4
    goto :goto_0

    .line 562
    :cond_5
    const-string v0, "ChatCommonActivity"

    const-string v1, "Intent is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    :goto_0
    return-void
.end method

.method private P()V
    .locals 1

    .line 572
    invoke-static {}, Lo/aop;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 574
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->x()V

    .line 576
    :cond_0
    return-void
.end method

.method private Q()V
    .locals 3

    .line 639
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 640
    const/4 v0, 0x5

    invoke-static {p0, v0, v2}, Lo/biq;->c(Landroid/app/Activity;I[Ljava/lang/String;)V

    .line 642
    return-void
.end method

.method private R()V
    .locals 2

    .line 508
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ad:Landroid/database/ContentObserver;

    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 510
    return-void
.end method

.method private S()V
    .locals 4

    .line 484
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    .line 485
    sget-object v0, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ad:Landroid/database/ContentObserver;

    const/4 v2, 0x1

    invoke-virtual {v3, v0, v2, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 486
    return-void
.end method

.method private T()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1006
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1008
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 1010
    invoke-static {p0, v2}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 1012
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1014
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 1019
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab()V

    .line 1021
    :goto_0
    goto :goto_1

    .line 1024
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab()V

    .line 1026
    :goto_1
    return-void
.end method

.method private U()V
    .locals 3

    .line 755
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "enter_send_msg"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->R:Z

    .line 756
    const-string v0, "ChatCommonActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter send msg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->R:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    return-void
.end method

.method private V()V
    .locals 1

    .line 891
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->W()Z

    move-result v0

    if-nez v0, :cond_0

    .line 893
    sget v0, Lcom/huawei/android/sns/R$string;->sns_send_empty_picture:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 895
    :cond_0
    return-void
.end method

.method private W()Z
    .locals 6

    .line 902
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 903
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ah:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 906
    const/4 v0, 0x1

    return v0

    .line 908
    :cond_0
    iput-wide v4, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ah:J

    .line 909
    const/4 v0, 0x0

    return v0
.end method

.method private X()V
    .locals 4

    .line 986
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    .line 988
    sget v0, Lcom/huawei/android/sns/R$string;->sns_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 989
    sget v0, Lcom/huawei/android/sns/R$string;->sns_empty_msg_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 990
    sget v0, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    const/4 v1, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILo/boj$d;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    .line 991
    goto :goto_0

    .line 994
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 996
    :goto_0
    return-void
.end method

.method private Y()I
    .locals 3

    .line 1139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getHeight()I

    move-result v2

    .line 1140
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    goto :goto_0

    .line 1141
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    :goto_0
    add-int/2addr v2, v0

    .line 1142
    return v2
.end method

.method private Z()V
    .locals 1

    .line 1150
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    if-eqz v0, :cond_0

    .line 1152
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    invoke-virtual {v0}, Lo/arp;->b()V

    .line 1155
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y:Lo/bnm;

    if-eqz v0, :cond_1

    .line 1157
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y:Lo/bnm;

    invoke-virtual {v0}, Lo/bnm;->a()V

    .line 1159
    :cond_1
    return-void
.end method

.method private a(ILcom/huawei/health/sns/logic/chat/task/ChatMessage;)V
    .locals 4

    .line 1987
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v1}, Lo/bdj;->getCount()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    .line 1989
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    new-instance v1, Lo/api;

    invoke-direct {v1}, Lo/api;-><init>()V

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    invoke-virtual {v1, v2, v3}, Lo/api;->a(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bdj;->c(Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    goto :goto_0

    .line 1993
    :cond_0
    invoke-direct {p0, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V

    .line 1995
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/bdu;->smoothScrollToPositionFromTop(II)V

    .line 1996
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1997
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    .line 1998
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 4

    .line 2108
    const-string v0, "isSend"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 2110
    const-string v0, "selectedList"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 2112
    invoke-direct {p0, v2, v3}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(ZLjava/util/ArrayList;)V

    .line 2113
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;I)V
    .locals 6

    .line 1071
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y:Lo/bnm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1073
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y()I

    move-result v4

    .line 1074
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa()I

    move-result v5

    .line 1075
    new-instance v0, Lo/bnm;

    invoke-direct {v0, p0}, Lo/bnm;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v5, v4}, Lo/bnm;->b(II)Lo/bnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bnm;->b()Lo/bnm;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y:Lo/bnm;

    .line 1079
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y:Lo/bnm;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;

    invoke-direct {v1, p0, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$16;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;I)V

    invoke-virtual {v0, v1}, Lo/bnm;->b(Landroid/view/View$OnClickListener;)V

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    invoke-virtual {v0}, Lo/arp;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1093
    return-void

    .line 1096
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Y:Lo/bnm;

    invoke-virtual {v0, p1}, Lo/bnm;->e(Landroid/graphics/Bitmap;)Lo/bnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bnm;->e()V

    .line 1099
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_4

    .line 1101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x88

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1103
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x88

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1106
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    const/16 v1, 0x88

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1108
    :cond_4
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 6

    .line 919
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 920
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v3

    .line 921
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v3}, Lo/bdj;->d(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 922
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v5

    .line 923
    if-eqz v4, :cond_1

    .line 925
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 927
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    .line 929
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v4}, Lo/bdj;->g(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    goto :goto_0

    .line 933
    :cond_1
    const-string v0, "ChatCommonActivity"

    const-string v1, "MSG_PIC_UPLOAD_FAILED no oldItem. update cacheList."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 934
    invoke-direct {p0, v3, v5}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Ljava/lang/String;I)V

    .line 936
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;ZLjava/util/ArrayList;)V
    .locals 0

    .line 116
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(ZLjava/util/ArrayList;)V

    return-void
.end method

.method private aa()I
    .locals 3

    .line 1117
    const/4 v2, 0x0

    .line 1118
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1120
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1123
    invoke-static {p0}, Lo/boi;->a(Landroid/app/Activity;)I

    move-result v0

    add-int/2addr v2, v0

    goto :goto_0

    .line 1128
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    goto :goto_0

    .line 1129
    :cond_1
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    .line 1131
    :cond_2
    :goto_0
    return v2
.end method

.method private ab()V
    .locals 2

    .line 1033
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac()Lo/arp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$15;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-virtual {v0, v1}, Lo/arp;->c(Lo/arp$c;)V

    .line 1044
    return-void
.end method

.method private ac()Lo/arp;
    .locals 1

    .line 1053
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    if-nez v0, :cond_0

    .line 1055
    new-instance v0, Lo/arp;

    invoke-direct {v0, p0}, Lo/arp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    .line 1057
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z:Lo/arp;

    return-object v0
.end method

.method private ad()V
    .locals 3

    .line 1611
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab:Z

    .line 1613
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1615
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 1617
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v2}, Lo/bdj;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    .line 1618
    goto :goto_0

    .line 1619
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1620
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    .line 1622
    :cond_1
    return-void
.end method

.method private ae()V
    .locals 5

    .line 1895
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1896
    const-string v0, "ChatCommonActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter sendMessageForButton text:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1897
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1899
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->o()V

    .line 1900
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->X()V

    .line 1901
    return-void

    .line 1915
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 1917
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 1918
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatusContent(IILjava/lang/String;)V

    .line 1919
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 1921
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/bfb;->setInputText(Ljava/lang/CharSequence;)V

    .line 1922
    return-void
.end method

.method private af()Z
    .locals 2

    .line 1696
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    if-nez v0, :cond_0

    .line 1698
    const/4 v0, 0x0

    return v0

    .line 1700
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->L:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private ag()V
    .locals 1

    .line 1451
    sget v0, Lcom/huawei/android/sns/R$string;->sns_input_reached_max_words:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1452
    return-void
.end method

.method private ah()V
    .locals 3

    .line 1426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 1429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getHeaderViewsCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 1432
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v1}, Lo/bdj;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bdu;->setSelection(I)V

    goto :goto_0

    .line 1437
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v1}, Lo/bdj;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bdu;->setSelection(I)V

    .line 1440
    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->A:Z

    .line 1441
    return-void
.end method

.method private ai()V
    .locals 2

    .line 2391
    const-string v0, "ChatCommonActivity"

    const-string v1, "sns start bind security phone dlg"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2417
    return-void
.end method

.method private aj()Z
    .locals 1

    .line 2484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2486
    const/4 v0, 0x1

    return v0

    .line 2488
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private al()V
    .locals 2

    .line 2470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 2472
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 2473
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 2475
    :cond_0
    return-void
.end method

.method private am()V
    .locals 1

    .line 2351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 2355
    :cond_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    if-nez v0, :cond_0

    .line 455
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_backup_recover:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$11;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$11;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/bir;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 468
    return-void
.end method

.method private b(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1670
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;I)V

    invoke-virtual {v0, v1}, Lo/bdu;->post(Ljava/lang/Runnable;)Z

    .line 1686
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 2498
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aj()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2500
    return-void

    .line 2502
    :cond_0
    if-eqz p1, :cond_1

    .line 2504
    new-instance v2, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Lcom/huawei/health/sns/model/user/User;)V

    .line 2519
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 2521
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->U()V

    return-void
.end method

.method private c(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V
    .locals 4

    .line 1633
    invoke-virtual {p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->getMessageItems()Ljava/util/ArrayList;

    move-result-object v2

    .line 1634
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 1638
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->L:Z

    if-eqz v0, :cond_0

    .line 1640
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(Ljava/util/ArrayList;)V

    .line 1641
    return-void

    .line 1645
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v2}, Lo/bdj;->b(Ljava/util/ArrayList;)V

    .line 1648
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->af()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1650
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->e()I

    move-result v3

    .line 1651
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->requestFocusFromTouch()Z

    .line 1652
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b(I)V

    .line 1653
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->requestFocus()Z

    .line 1654
    goto :goto_0

    .line 1657
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1660
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 1587
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 1589
    :cond_0
    return-void

    .line 1592
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 1593
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 1595
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 1596
    invoke-virtual {p1, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1598
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1599
    goto :goto_1

    .line 1593
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1602
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae()V

    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 5

    .line 1506
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_1

    .line 1508
    :cond_0
    return-void

    .line 1511
    :cond_1
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 1513
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_2

    .line 1515
    return-void

    .line 1518
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    .line 1520
    const-string v0, "ChatCommonActivity"

    const-string v1, "addNewMsgItem newItem.getUserId() != uID."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1521
    return-void

    .line 1524
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 1527
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0}, Lo/apz;->b()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1531
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0}, Lo/apz;->a()V

    .line 1535
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab:Z

    if-eqz v0, :cond_5

    .line 1537
    const-string v0, "ChatCommonActivity"

    const-string v1, "ADD_ITEM"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1538
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 1543
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    if-nez v0, :cond_6

    .line 1545
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    .line 1547
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1548
    const-string v0, "ChatCommonActivity"

    const-string v1, "ADD_ITEM_TO_CACHE"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1550
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aa:Landroid/app/AlertDialog;

    return-object p1
.end method

.method private d(Landroid/content/Intent;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 2171
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    invoke-virtual {v0, p1}, Lo/bde;->d(Landroid/content/Intent;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/os/Message;)V
    .locals 7

    .line 945
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo/bac;

    .line 946
    invoke-virtual {v2}, Lo/bac;->d()Ljava/lang/String;

    move-result-object v3

    .line 947
    invoke-virtual {v2}, Lo/bac;->e()I

    move-result v4

    .line 948
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v3}, Lo/bdj;->d(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v5

    .line 950
    const/4 v6, 0x1

    .line 952
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 954
    const/4 v6, 0x3

    goto :goto_0

    .line 956
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v4, :cond_1

    .line 958
    const/4 v6, 0x2

    .line 961
    :cond_1
    :goto_0
    if-eqz v5, :cond_2

    .line 963
    invoke-direct {p0, v5, v6}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    .line 964
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v5}, Lo/bdj;->g(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    goto :goto_1

    .line 968
    :cond_2
    const-string v0, "ChatCommonActivity"

    const-string v1, "MSG_STATUS_UPDATE no oldItem. update cacheList."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 969
    invoke-direct {p0, v3, v6}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Ljava/lang/String;I)V

    .line 971
    :goto_1
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;I)V
    .locals 0

    .line 1576
    invoke-virtual {p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 1577
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k()V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 8

    .line 767
    move-object v0, p0

    const-string v1, ""

    move-object v2, p1

    sget v3, Lcom/huawei/android/sns/R$string;->sns_bind_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_bind_phone_number:I

    new-instance v5, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$13;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$13;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    .line 787
    new-instance v7, Lo/bdi;

    invoke-direct {v7}, Lo/bdi;-><init>()V

    .line 788
    invoke-virtual {v6, v7}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 789
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac:Landroid/app/AlertDialog;

    .line 790
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 791
    return-void
.end method

.method private d(Ljava/lang/String;I)V
    .locals 3

    .line 1560
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1562
    :cond_0
    return-void

    .line 1564
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 1566
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1568
    invoke-direct {p0, v2, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/model/chat/MessageItem;I)V

    .line 1569
    goto :goto_1

    .line 1571
    :cond_2
    goto :goto_0

    .line 1572
    :cond_3
    :goto_1
    return-void
.end method

.method private e()V
    .locals 1

    .line 441
    invoke-static {}, Lo/ayz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->E:Z

    if-nez v0, :cond_0

    .line 444
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b()V

    .line 446
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V
    .locals 3

    .line 1725
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1727
    const-string v0, "ChatCommonActivity"

    const-string v1, "loadNextBatchData, preReadTask.getDataFromCache() is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1728
    return-void

    .line 1731
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->getMessageItems()Ljava/util/ArrayList;

    move-result-object v2

    .line 1733
    invoke-virtual {p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->hasMore()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1735
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I()V

    .line 1736
    const-string v0, "ChatCommonActivity"

    const-string v1, "PreRead: No more data!"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1738
    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1740
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(Ljava/util/ArrayList;)V

    .line 1742
    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ai()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/graphics/Bitmap;I)V
    .locals 0

    .line 116
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Landroid/graphics/Bitmap;I)V

    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 1753
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 1755
    const/4 v4, 0x0

    .line 1756
    const/4 v5, 0x0

    .line 1758
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getChildCount()I

    move-result v6

    .line 1759
    const/4 v0, 0x2

    if-le v6, v0, :cond_0

    .line 1762
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/bdu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1763
    const/4 v5, 0x1

    goto :goto_0

    .line 1765
    :cond_0
    if-lez v6, :cond_1

    .line 1768
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    add-int/lit8 v1, v6, -0x1

    invoke-virtual {v0, v1}, Lo/bdu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1771
    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 1774
    invoke-virtual {v4, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 1777
    :cond_2
    const/4 v0, 0x1

    aget v7, v3, v0

    .line 1780
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0, v3}, Lo/bdu;->getLocationInWindow([I)V

    .line 1781
    const/4 v0, 0x1

    aget v8, v3, v0

    .line 1783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, p1}, Lo/bdj;->b(Ljava/util/ArrayList;)V

    .line 1786
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    if-nez v0, :cond_3

    if-eqz v5, :cond_3

    .line 1789
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    sub-int v2, v7, v8

    invoke-virtual {v0, v1, v2}, Lo/bdu;->setSelectionFromTop(II)V

    goto :goto_1

    .line 1791
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    if-eqz v0, :cond_4

    if-nez v5, :cond_4

    .line 1794
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int v2, v7, v8

    invoke-virtual {v0, v1, v2}, Lo/bdu;->setSelectionFromTop(II)V

    goto :goto_1

    .line 1799
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    sub-int v2, v7, v8

    invoke-virtual {v0, v1, v2}, Lo/bdu;->setSelectionFromTop(II)V

    .line 1802
    :goto_1
    return-void
.end method

.method private e(ZLjava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLjava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2122
    const-string v0, "ChatCommonActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResultSendPicture :getResultData() isSend:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". or selectedList is null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2123
    if-eqz p1, :cond_0

    if-nez p2, :cond_2

    .line 2125
    :cond_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2127
    const-string v0, "ChatCommonActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ":getResultData() isSend:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". or selectedList is null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2129
    :cond_1
    return-void

    .line 2132
    :cond_2
    invoke-virtual {p0, p2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Ljava/util/ArrayList;)V

    .line 2133
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)Lo/arp;
    .locals 1

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac()Lo/arp;

    move-result-object v0

    return-object v0
.end method

.method private k()V
    .locals 1

    .line 475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    if-eqz v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 478
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ag:Lo/bio;

    .line 480
    :cond_0
    return-void
.end method


# virtual methods
.method protected A()V
    .locals 2

    .line 583
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->m:Z

    if-eqz v0, :cond_0

    .line 585
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdu;->setTranscriptMode(I)V

    goto :goto_0

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bdu;->setTranscriptMode(I)V

    .line 591
    :goto_0
    return-void
.end method

.method protected E()V
    .locals 2

    .line 1325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->g()V

    .line 1329
    :cond_0
    return-void
.end method

.method F()V
    .locals 4

    .line 1851
    const-string v0, "ChatCommonActivity"

    const-string v1, "Enter doEnterSendMsg"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1852
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->P:Z

    if-eqz v0, :cond_1

    .line 1854
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputIndex()I

    move-result v2

    .line 1855
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v3

    .line 1856
    const/4 v0, 0x1

    if-le v2, v0, :cond_0

    .line 1858
    add-int/lit8 v0, v2, -0x1

    invoke-interface {v3, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    goto :goto_0

    .line 1862
    :cond_0
    const/4 v0, 0x0

    invoke-interface {v3, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 1864
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ae()V

    .line 1866
    :cond_1
    return-void
.end method

.method protected G()V
    .locals 3

    .line 1708
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1710
    return-void

    .line 1713
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->d()Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    move-result-object v2

    .line 1715
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V

    .line 1716
    return-void
.end method

.method protected H()V
    .locals 1

    .line 696
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->h()V

    .line 699
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ab:Z

    .line 701
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->c()V

    .line 702
    return-void
.end method

.method protected I()V
    .locals 2

    .line 1809
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    if-nez v0, :cond_0

    .line 1812
    const-string v0, "ChatCommonActivity"

    const-string v1, "PreRead: No data!, Remove loading animation!"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1813
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    .line 1814
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->K:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 1815
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lo/bdu;->removeHeaderView(Landroid/view/View;)Z

    .line 1817
    :cond_0
    return-void
.end method

.method protected J()V
    .locals 2

    .line 1955
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->r()V

    .line 1956
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->x:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1977
    return-void
.end method

.method protected K()V
    .locals 1

    .line 2279
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j()Lo/bdg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bdg;->d(Landroid/app/Activity;)V

    .line 2280
    return-void
.end method

.method protected L()V
    .locals 7

    .line 2553
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->G:I

    if-lt v0, v1, :cond_0

    .line 2555
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_unread_msg_counts:I

    iget v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    .line 2556
    invoke-static {v4}, Lo/bfy;->c(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 2555
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 2557
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2558
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->x:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2559
    goto :goto_0

    .line 2562
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2564
    :goto_0
    return-void
.end method

.method protected M()V
    .locals 1

    .line 2271
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j()Lo/bdg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bdg;->a(Landroid/app/Activity;)V

    .line 2272
    return-void
.end method

.method protected N()V
    .locals 1

    .line 2288
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j()Lo/bdg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bdg;->e(Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->V:Landroid/net/Uri;

    .line 2289
    return-void
.end method

.method protected a()V
    .locals 0

    .line 515
    return-void
.end method

.method protected a(J)V
    .locals 3

    .line 1338
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    if-nez v0, :cond_0

    .line 1340
    return-void

    .line 1343
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->f()Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v2

    .line 1344
    if-eqz v2, :cond_1

    .line 1346
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    .line 1348
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->E()V

    .line 1349
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I()V

    .line 1352
    :cond_1
    return-void
.end method

.method public a(JI)V
    .locals 1

    .line 2535
    const/16 v0, 0x402

    if-eq p3, v0, :cond_0

    .line 2537
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->al()V

    .line 2539
    :cond_0
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    invoke-virtual {v0, p0, p1, p2, p3}, Lo/bde;->e(Landroid/app/Activity;JI)V

    .line 2540
    return-void
.end method

.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 2179
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 2545
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b(Lcom/huawei/health/sns/model/user/User;)V

    .line 2546
    return-void
.end method

.method a(Ljava/lang/CharSequence;II)V
    .locals 2

    .line 1877
    add-int v0, p2, p3

    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->R:Z

    if-eqz v0, :cond_0

    .line 1879
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->P:Z

    goto :goto_0

    .line 1883
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->P:Z

    .line 1885
    :goto_0
    return-void
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 3

    .line 2318
    const/4 v2, 0x0

    .line 2319
    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    .line 2320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lo/bfb;->setInputText(Ljava/lang/CharSequence;)V

    .line 2321
    return-void
.end method

.method protected b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2160
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j()Lo/bdg;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/bdg;->e(Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 2161
    return-void
.end method

.method protected c()V
    .locals 2

    .line 1929
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->X:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {v0, v1}, Lo/bdu;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1930
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J()V

    .line 1931
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->T:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bfb;->setMoreItemListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1932
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-virtual {v0, v1}, Lo/bfb;->setHeightChangeListener(Lo/bew;)V

    .line 1940
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$8;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-virtual {v0, v1}, Lo/bfb;->setCListener(Lo/bex;)V

    .line 1948
    return-void
.end method

.method protected c(J)V
    .locals 3

    .line 2308
    invoke-static {}, Lo/apd;->a()Lo/apd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    const/16 v2, 0x78

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/apd;->e(JLandroid/os/Handler;I)V

    .line 2309
    return-void
.end method

.method protected c(JI)V
    .locals 2

    .line 2298
    invoke-static {}, Lo/apd;->a()Lo/apd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v1}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/apd;->d(JILjava/lang/String;)V

    .line 2299
    return-void
.end method

.method public d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 1

    .line 2529
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/bde;->c(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v0

    return-object v0
.end method

.method protected d(I)V
    .locals 2

    .line 1826
    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1827
    invoke-static {p0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v0

    invoke-static {p0}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    if-ne v0, p1, :cond_0

    .line 1829
    return-void

    .line 1833
    :cond_0
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v0

    invoke-static {p0}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    if-ne v0, p1, :cond_1

    .line 1835
    return-void

    .line 1838
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->C:Lo/bei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->C:Lo/bei;

    invoke-virtual {v0}, Lo/bei;->getViewHeight()I

    move-result v0

    if-eq v0, p1, :cond_2

    .line 1840
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->C:Lo/bei;

    invoke-virtual {v0, p1}, Lo/bei;->setViewHeight(I)V

    .line 1842
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1844
    :cond_2
    return-void
.end method

.method protected d(J)V
    .locals 1

    .line 2330
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/bde;->e(J)V

    .line 2331
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V
    .locals 2

    .line 1459
    if-nez p1, :cond_0

    .line 1461
    return-void

    .line 1464
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->c(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V

    .line 1466
    invoke-virtual {p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->hasMore()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1468
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I()V

    .line 1471
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ad()V

    .line 1474
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->L:Z

    if-nez v0, :cond_2

    .line 1476
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->L:Z

    .line 1478
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g()V

    .line 1481
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-virtual {v0, v1}, Lo/bdu;->post(Ljava/lang/Runnable;)Z

    .line 1497
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 2087
    const-string v0, "ChatCommonActivity"

    const-string v1, ":addNewMsgItem()"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2088
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, p1}, Lo/bdj;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    .line 2089
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->A:Z

    if-eqz v0, :cond_1

    .line 2091
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2093
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 2097
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 2100
    :cond_1
    :goto_0
    return-void
.end method

.method protected d(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2143
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->d()V

    .line 2152
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    move-object v1, p1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    iget-boolean v5, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->l:Z

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/bde;->a(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)V

    .line 2153
    return-void
.end method

.method public d(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/os/Message;)Z
    .locals 8

    .line 1251
    const/4 v5, 0x0

    .line 1252
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1257
    :sswitch_0
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 1258
    if-eqz v6, :cond_0

    .line 1260
    const-string v0, "bundleMsgKey"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    .line 1261
    invoke-virtual {p0, v7}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V

    .line 1264
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(J)V

    .line 1265
    const/4 v5, 0x1

    .line 1266
    goto :goto_0

    .line 1270
    :sswitch_1
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 1271
    const/4 v7, 0x0

    .line 1272
    if-eqz v6, :cond_1

    .line 1274
    const-string v0, "bundleMsgKey"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    .line 1277
    :cond_1
    iget v0, p2, Landroid/os/Message;->arg1:I

    invoke-direct {p1, v0, v7}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(ILcom/huawei/health/sns/logic/chat/task/ChatMessage;)V

    .line 1278
    const/4 v5, 0x1

    .line 1279
    goto :goto_0

    .line 1283
    :sswitch_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->T()V

    .line 1284
    const/4 v5, 0x1

    .line 1285
    goto :goto_0

    .line 1290
    :sswitch_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ah()V

    .line 1291
    const/4 v5, 0x1

    .line 1292
    goto :goto_0

    .line 1296
    :sswitch_4
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 1297
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_share_textmsg_too_long:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 1298
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1297
    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1299
    invoke-static {p1, v7}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1300
    const/4 v5, 0x1

    .line 1301
    .line 1306
    :goto_0
    return v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_3
        0x120 -> :sswitch_4
        0x7e0 -> :sswitch_0
        0x7ec -> :sswitch_1
        0x7ed -> :sswitch_2
    .end sparse-switch
.end method

.method public e(J)V
    .locals 3

    .line 2457
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->aj()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2459
    return-void

    .line 2461
    :cond_0
    new-instance v2, Lo/awq;

    invoke-direct {v2, p1, p2, p0}, Lo/awq;-><init>(JLo/awq$d;)V

    .line 2462
    sget-object v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->af:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v2, v0, v1}, Lo/awq;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 2463
    return-void
.end method

.method protected e(Landroid/os/Message;)V
    .locals 2

    .line 800
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 804
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Ljava/lang/Object;)V

    .line 805
    goto :goto_0

    .line 810
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->c(Ljava/lang/Object;)V

    .line 811
    goto :goto_0

    .line 815
    :sswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 817
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 818
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v1}, Lo/bdj;->g(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 819
    goto :goto_0

    .line 823
    :sswitch_3
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Landroid/os/Message;)V

    .line 824
    goto :goto_0

    .line 828
    :sswitch_4
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Landroid/os/Message;)V

    .line 829
    goto :goto_0

    .line 833
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->notifyDataSetChanged()V

    .line 834
    goto :goto_0

    .line 838
    :sswitch_6
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z()V

    .line 839
    goto :goto_0

    .line 843
    :sswitch_7
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->V()V

    .line 844
    .line 849
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x78 -> :sswitch_0
        0x88 -> :sswitch_6
        0x7e1 -> :sswitch_3
        0x7e2 -> :sswitch_5
        0x7e4 -> :sswitch_4
        0x2710 -> :sswitch_2
        0x310dc -> :sswitch_1
        0x310dd -> :sswitch_7
    .end sparse-switch
.end method

.method protected g()V
    .locals 0

    .line 2578
    return-void
.end method

.method protected h()V
    .locals 6

    .line 1317
    new-instance v0, Lo/arn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    iget-boolean v4, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->m:Z

    iget v5, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->n:I

    invoke-direct/range {v0 .. v5}, Lo/arn;-><init>(Landroid/os/Handler;JZI)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    .line 1318
    return-void
.end method

.method protected m()V
    .locals 2

    .line 978
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bfb;->setSendButton(Z)V

    .line 979
    return-void
.end method

.method protected n()V
    .locals 5

    .line 710
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->n()V

    .line 713
    sget v0, Lcom/huawei/android/sns/R$id;->blur_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdx;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y:Lo/bdx;

    .line 714
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    .line 716
    sget v0, Lcom/huawei/android/sns/R$id;->chat_voice_record:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnv;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->U:Lo/bnv;

    .line 718
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->U:Lo/bnv;

    new-instance v2, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/bfb;->setChatVoiceRecorderView(Lo/bnv;Lo/bnv$d;)V

    .line 731
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_unread_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->B:Landroid/widget/TextView;

    .line 733
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_unread_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 735
    new-instance v0, Lo/bei;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bei;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->C:Lo/bei;

    .line 737
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->C:Lo/bei;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v0, v1}, Lo/bei;->setViewHeight(I)V

    .line 738
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->C:Lo/bei;

    invoke-virtual {v0, v1}, Lo/bdu;->addFooterView(Landroid/view/View;)V

    .line 740
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y:Lo/bdx;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0, v1}, Lo/bdx;->setBlurredView(Landroid/view/View;)V

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 743
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->B:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_search_word_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 744
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_chat_top:I

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 746
    new-instance v4, Lo/bea;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y:Lo/bdx;

    invoke-direct {v4, v0}, Lo/bea;-><init>(Lo/bdx;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0, v4}, Lo/bdu;->setOnOverScrollListener(Lo/bec;)V

    .line 748
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .line 2002
    const/16 v0, 0x7d4

    if-ne p1, v0, :cond_1

    .line 2004
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 2006
    const-string v0, "ChatCommonActivity"

    const-string v1, "onSuccess, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2008
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->a()V

    goto :goto_0

    .line 2013
    :cond_0
    const-string v0, "ChatCommonActivity"

    const-string v1, "onError, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2017
    :cond_1
    :goto_0
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 2019
    const-string v0, "ChatCommonActivity"

    const-string v1, "onActivityResult. the resultCode user selected is not RESULT_OK."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2021
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 2024
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->V:Landroid/net/Uri;

    if-eqz v0, :cond_5

    .line 2027
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->V:Landroid/net/Uri;

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_1

    .line 2033
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 2037
    :try_start_0
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2043
    goto :goto_1

    .line 2039
    :catch_0
    move-exception v4

    .line 2041
    const-string v0, "ChatCommonActivity"

    const-string v1, "ChatCommonActivity onActivityResult get intent data exception: "

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2042
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->finish()V

    .line 2043
    goto :goto_1

    .line 2046
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 2048
    const-string v0, "ChatCommonActivity"

    const-string v1, "onActivityResult CAPTURE_REQUEST."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2049
    new-instance v4, Lo/arl;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lo/arl;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 2050
    new-instance v5, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$9;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$9;-><init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    .line 2068
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->V:Landroid/net/Uri;

    invoke-virtual {v4, v0, v5}, Lo/arl;->e(Landroid/net/Uri;Lo/arl$d;)V

    .line 2069
    goto :goto_1

    .line 2071
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 2073
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Landroid/content/Intent;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 2076
    :cond_5
    :goto_1
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2077
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 2360
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->u:Landroid/view/Menu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->u:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2362
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 2363
    return-void

    .line 2365
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2367
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->k()V

    .line 2368
    return-void

    .line 2370
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D:Z

    if-eqz v0, :cond_2

    .line 2372
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y()V

    .line 2374
    :cond_2
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onBackPressed()V

    .line 2375
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 2446
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z()V

    .line 2447
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2448
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 409
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 410
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->W:Z

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$integer;->sns_unread_msg_number:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->G:I

    .line 414
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->n()V

    .line 415
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a()V

    .line 419
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 425
    goto :goto_0

    .line 421
    :catch_0
    move-exception v2

    .line 423
    const-string v0, "ChatCommonActivity"

    const-string v1, "ChatCommonActivity get intent data exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->finish()V

    .line 427
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x7e5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 430
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->S()V

    .line 433
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e()V

    .line 434
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 2337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 2338
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Z()V

    .line 2339
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->al()V

    .line 2340
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->am()V

    .line 2341
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/bap;->a(J)V

    .line 2342
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->R()V

    .line 2343
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onDestroy()V

    .line 2344
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 2380
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2382
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->D:Z

    .line 2383
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->t:Z

    .line 2384
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 2569
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onPause()V

    .line 2570
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->W:Z

    .line 2571
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 2184
    if-eqz p3, :cond_4

    array-length v0, p3

    if-lez v0, :cond_4

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2186
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 2188
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->N()V

    goto :goto_0

    .line 2190
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2192
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->K()V

    goto :goto_0

    .line 2194
    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 2196
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->T()V

    .line 2197
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    goto :goto_0

    .line 2199
    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    .line 2201
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    if-eqz v0, :cond_3

    .line 2203
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    .line 2204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->notifyDataSetChanged()V

    .line 2206
    :cond_3
    invoke-static {p0}, Lo/bnz;->c(Landroid/app/Activity;)V

    .line 2209
    :cond_4
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 610
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onResume()V

    .line 612
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0}, Lo/apz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 614
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0}, Lo/apz;->h()V

    .line 618
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->E:Z

    if-nez v0, :cond_1

    .line 620
    const-string v0, "ChatCommonActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hasFlag="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lo/aop;->k()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->P()V

    .line 625
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x7e5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 627
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->W:Z

    if-nez v0, :cond_2

    .line 630
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(J)V

    .line 632
    :cond_2
    return-void
.end method

.method public onStart()V
    .locals 1

    .line 596
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onStart()V

    .line 597
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 599
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->Q()V

    goto :goto_0

    .line 603
    :cond_0
    invoke-static {p0}, Lo/bnz;->c(Landroid/app/Activity;)V

    .line 605
    :goto_0
    return-void
.end method

.method protected u()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 859
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getFooterViewsCount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 861
    new-instance v4, Landroid/view/View;

    invoke-direct {v4, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 863
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    .line 864
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$dimen;->sns_chat_list_margin_bottom:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 863
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 865
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0, v4}, Lo/bdu;->addFooterView(Landroid/view/View;)V

    .line 868
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getHeaderViewsCount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    if-nez v0, :cond_1

    .line 871
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_listview_footer_loading:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->M:Landroid/widget/LinearLayout;

    .line 873
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->M:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->listview_footer_loading_img:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->K:Landroid/widget/ImageView;

    .line 874
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lo/bdu;->addHeaderView(Landroid/view/View;)V

    .line 875
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$anim;->sns_listview_footer_loading_anim:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->N:Landroid/view/animation/Animation;

    .line 876
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->N:Landroid/view/animation/Animation;

    if-eqz v0, :cond_1

    .line 878
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->N:Landroid/view/animation/Animation;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 879
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->K:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->N:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 883
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, v1}, Lo/bdu;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 884
    return-void
.end method

.method protected x()V
    .locals 3

    .line 2426
    invoke-static {}, Lo/aop;->i()V

    .line 2428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->ac:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2431
    const-string v0, "ChatCommonActivity"

    const-string v1, "dialog is showing, ignore."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2432
    return-void

    .line 2436
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_msg_need_phone_nubmer:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 2439
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Ljava/lang/String;)V

    .line 2441
    return-void
.end method
