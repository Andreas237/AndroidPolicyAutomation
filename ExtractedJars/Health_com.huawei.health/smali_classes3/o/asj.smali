.class public final Lo/asj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/asj$e;
    }
.end annotation


# static fields
.field private static e:Lo/asj;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lo/asj;

    invoke-direct {v0}, Lo/asj;-><init>()V

    sput-object v0, Lo/asj;->e:Lo/asj;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/asj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/asj;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    return-void
.end method

.method static synthetic a(Lo/asj;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/asj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public static a()Lo/asj;
    .locals 1

    .line 73
    sget-object v0, Lo/asj;->e:Lo/asj;

    return-object v0
.end method

.method static synthetic c(Lo/asj;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/asj;->c:Landroid/content/Context;

    return-object v0
.end method

.method private d()Ljava/lang/Runnable;
    .locals 1

    .line 199
    new-instance v0, Lo/asj$2;

    invoke-direct {v0, p0}, Lo/asj$2;-><init>(Lo/asj;)V

    return-object v0
.end method

.method static synthetic d(Lo/asj;)Ljava/util/ArrayList;
    .locals 1

    .line 26
    invoke-direct {p0}, Lo/asj;->h()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private h()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation

    .line 285
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 286
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->c()Landroid/support/v4/util/LongSparseArray;

    move-result-object v7

    .line 288
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v7}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 290
    invoke-virtual {v7, v9}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/User;

    .line 291
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 293
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 296
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 298
    const-string v0, "ContactsSync"

    const-string v1, "getSnsFriends size 0."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    :cond_2
    return-object v6
.end method

.method private k()Ljava/lang/Runnable;
    .locals 1

    .line 239
    new-instance v0, Lo/asj$5;

    invoke-direct {v0, p0}, Lo/asj$5;-><init>(Lo/asj;)V

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 158
    iget-object v0, p0, Lo/asj;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 159
    return-void
.end method

.method public c()V
    .locals 2

    .line 142
    const-string v0, "ContactsSync"

    const-string v1, "Enter fullSyncContactPhoto."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lo/asj;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 146
    const-string v0, "ContactsSync"

    const-string v1, "fullSyncContactPhoto Call init first."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    return-void

    .line 150
    :cond_0
    invoke-static {}, Lo/bof;->e()Lo/bol;

    move-result-object v0

    invoke-direct {p0}, Lo/asj;->k()Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bol;->e(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 151
    return-void
.end method

.method public c(Landroid/content/Context;)Z
    .locals 3

    .line 83
    const-string v0, "ContactsSync"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter init, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p1, :cond_0

    const-string v2, "Null context."

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    if-nez p1, :cond_1

    .line 87
    const-string v0, "ContactsSync"

    const-string v1, "Invalid argument."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const/4 v0, 0x0

    return v0

    .line 91
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/asj;->c:Landroid/content/Context;

    .line 93
    invoke-static {}, Lo/asg;->e()V

    .line 94
    iget-object v0, p0, Lo/asj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/asg;->b(Landroid/content/Context;)V

    .line 96
    const/4 v0, 0x1

    return v0
.end method

.method public d(J)V
    .locals 5

    .line 116
    iget-object v0, p0, Lo/asj;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 118
    const-string v0, "ContactsSync"

    const-string v1, "incSyncContactPhoto Call init first."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    return-void

    .line 121
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 123
    const-string v0, "ContactsSync"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "incSyncContactPhoto isAgreeUpload:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    if-nez v3, :cond_1

    .line 126
    return-void

    .line 128
    :cond_1
    invoke-static {p1, p2}, Lo/asg;->c(J)Z

    move-result v4

    .line 129
    if-eqz v4, :cond_2

    iget-object v0, p0, Lo/asj;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 131
    invoke-static {}, Lo/bof;->e()Lo/bol;

    move-result-object v0

    invoke-direct {p0}, Lo/asj;->d()Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bol;->e(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 133
    :cond_2
    return-void
.end method

.method public e()V
    .locals 2

    .line 104
    const-string v0, "ContactsSync"

    const-string v1, "Enter cancel."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    invoke-static {}, Lo/asg;->b()V

    .line 107
    return-void
.end method

.method public e(Landroid/content/Context;)Z
    .locals 9

    .line 218
    const/4 v4, 0x0

    .line 219
    invoke-static {p1}, Lo/asi;->a(Landroid/content/Context;)Lo/asi;

    move-result-object v0

    invoke-virtual {v0}, Lo/asi;->c()J

    move-result-wide v5

    .line 220
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 221
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const-string v0, "ContactsSync"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lastPhotoSyncTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", NowTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    :cond_0
    sub-long v0, v7, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 227
    const/4 v4, 0x1

    .line 229
    :cond_1
    return v4
.end method
