.class public Lo/bcj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private final b:Lo/atk;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lo/bcj;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bcj;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bcj;->d:Z

    .line 77
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    iput-object v0, p0, Lo/bcj;->b:Lo/atk;

    return-void
.end method

.method private a()V
    .locals 6

    .line 124
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    invoke-virtual {v0}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v3

    .line 125
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairNormalGroupName oldGroupVersion is empty."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    .line 130
    return-void

    .line 134
    :cond_0
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion"

    invoke-virtual {v0, v1}, Lo/atk;->d(Ljava/lang/String;)I

    move-result v4

    .line 137
    const v0, 0x1343f54

    if-lt v4, v0, :cond_1

    .line 139
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairNormalGroupName oldRepairVersion >= REPAIR_NORMAL_GRP_NAME_VERSION"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    return-void

    .line 142
    :cond_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0}, Lo/atc;->a()Z

    move-result v5

    .line 143
    if-eqz v5, :cond_2

    .line 145
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 149
    :cond_2
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairNormalGroupName not success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/bcj;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bcj;->a()V

    return-void
.end method

.method static synthetic b()V
    .locals 0

    .line 24
    invoke-static {}, Lo/bcj;->k()V

    return-void
.end method

.method static synthetic b(Lo/bcj;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bcj;->h()V

    return-void
.end method

.method private c()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 90
    new-instance v0, Lo/bcj$4;

    invoke-direct {v0, p0}, Lo/bcj$4;-><init>(Lo/bcj;)V

    return-object v0
.end method

.method static synthetic c(Lo/bcj;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bcj;->g()V

    return-void
.end method

.method static synthetic d(Lo/bcj;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bcj;->i()V

    return-void
.end method

.method static synthetic e(Lo/bcj;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bcj;->f()V

    return-void
.end method

.method private f()V
    .locals 6

    .line 261
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 262
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairContactSortPinYin oldUserVersion is empty."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion5"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    .line 267
    return-void

    .line 271
    :cond_0
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion5"

    invoke-virtual {v0, v1}, Lo/atk;->d(Ljava/lang/String;)I

    move-result v4

    .line 274
    const v0, 0x135c0e4

    if-lt v4, v0, :cond_1

    .line 276
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairContactSortPinYin oldRepairVersion >= REPAIR_SORT_PINYIN_VERSION"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    return-void

    .line 279
    :cond_1
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->h()Z

    move-result v5

    .line 280
    if-eqz v5, :cond_2

    .line 282
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion5"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 286
    :cond_2
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairContactSortPinYin not success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    :goto_0
    return-void
.end method

.method private g()V
    .locals 6

    .line 158
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    invoke-virtual {v0}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v3

    .line 159
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairGroupSortPinYin oldGroupVersion is empty."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion2"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    .line 164
    return-void

    .line 168
    :cond_0
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion2"

    invoke-virtual {v0, v1}, Lo/atk;->d(Ljava/lang/String;)I

    move-result v4

    .line 171
    const v0, 0x135c0e4

    if-lt v4, v0, :cond_1

    .line 173
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairGroupSortPinYin oldRepairVersion >= REPAIR_SORT_PINYIN_VERSION"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    return-void

    .line 176
    :cond_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0}, Lo/atc;->c()Z

    move-result v5

    .line 177
    if-eqz v5, :cond_2

    .line 179
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion2"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 183
    :cond_2
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairGroupSortPinYin not success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :goto_0
    return-void
.end method

.method private h()V
    .locals 9

    .line 295
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isRepairedSearchPinyin"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 296
    if-eqz v3, :cond_0

    .line 298
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "already repaired search pinyin."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    return-void

    .line 302
    :cond_0
    const/4 v4, 0x1

    .line 303
    const/4 v5, 0x1

    .line 304
    const/4 v6, 0x1

    .line 306
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 307
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 309
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repair user search pinyin."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->i()Z

    move-result v4

    .line 312
    :cond_1
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    invoke-virtual {v0}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v8

    .line 313
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 315
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repair group or group member search pinyin."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0}, Lo/atc;->b()Z

    move-result v5

    .line 319
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0}, Lo/ath;->e()Z

    move-result v6

    .line 322
    :cond_2
    if-eqz v4, :cond_3

    if-eqz v5, :cond_3

    if-eqz v6, :cond_3

    .line 324
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isRepairedSearchPinyin"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    goto :goto_0

    .line 328
    :cond_3
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairSearchPinyin not success."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    :goto_0
    return-void
.end method

.method private i()V
    .locals 6

    .line 192
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    invoke-virtual {v0}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v3

    .line 193
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairMemberSortPinYin oldGroupVersion is empty."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion3"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    .line 198
    return-void

    .line 202
    :cond_0
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion3"

    invoke-virtual {v0, v1}, Lo/atk;->d(Ljava/lang/String;)I

    move-result v4

    .line 205
    const v0, 0x135c0e4

    if-lt v4, v0, :cond_1

    .line 207
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairMemberSortPinYin oldRepairVersion >= REPAIR_SORT_PINYIN_VERSION"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    return-void

    .line 210
    :cond_1
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0}, Lo/ath;->d()Z

    move-result v5

    .line 211
    if-eqz v5, :cond_2

    .line 213
    iget-object v0, p0, Lo/bcj;->b:Lo/atk;

    const-string v1, "repairVersion3"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/atk;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 217
    :cond_2
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairMemberSortPinYin not success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    :goto_0
    return-void
.end method

.method private static k()V
    .locals 7

    .line 226
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 227
    new-instance v4, Lo/atk;

    invoke-direct {v4}, Lo/atk;-><init>()V

    .line 228
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairUserSortPinYin oldUserVersion is empty."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    const-string v0, "repairVersion4"

    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lo/atk;->a(Ljava/lang/String;I)V

    .line 233
    return-void

    .line 237
    :cond_0
    const-string v0, "repairVersion4"

    invoke-virtual {v4, v0}, Lo/atk;->d(Ljava/lang/String;)I

    move-result v5

    .line 240
    const v0, 0x135c0e4

    if-lt v5, v0, :cond_1

    .line 242
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairUserSortPinYin oldRepairVersion >= REPAIR_SORT_PINYIN_VERSION"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    return-void

    .line 245
    :cond_1
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->g()Z

    move-result v6

    .line 246
    if-eqz v6, :cond_2

    .line 248
    const-string v0, "repairVersion4"

    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lo/atk;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 252
    :cond_2
    sget-object v0, Lo/bcj;->e:Ljava/lang/String;

    const-string v1, "repairUserSortPinYin not success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    :goto_0
    return-void
.end method


# virtual methods
.method public d()Z
    .locals 1

    .line 335
    iget-boolean v0, p0, Lo/bcj;->d:Z

    return v0
.end method

.method public e()V
    .locals 2

    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bcj;->d:Z

    .line 85
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lo/bcj;->c()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 86
    return-void
.end method
