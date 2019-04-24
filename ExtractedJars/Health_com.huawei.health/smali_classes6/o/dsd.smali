.class public Lo/dsd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;

.field private static f:I

.field private static g:I


# instance fields
.field private a:Ljava/util/Timer;

.field private b:Ljava/util/TimerTask;

.field private c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

.field private d:Landroid/content/Context;

.field private h:I

.field private i:Lo/dsl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/dsd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dsd;->e:Ljava/lang/String;

    .line 32
    const/16 v0, 0xbb8

    sput v0, Lo/dsd;->g:I

    .line 33
    const/4 v0, 0x3

    sput v0, Lo/dsd;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    .line 31
    const/4 v0, 0x1

    iput v0, p0, Lo/dsd;->h:I

    .line 99
    new-instance v0, Lo/dsd$2;

    invoke-direct {v0, p0}, Lo/dsd$2;-><init>(Lo/dsd;)V

    iput-object v0, p0, Lo/dsd;->i:Lo/dsl;

    .line 44
    iput-object p1, p0, Lo/dsd;->d:Landroid/content/Context;

    .line 45
    return-void
.end method

.method private a(Lo/dri;)Ljava/lang/Boolean;
    .locals 6

    .line 259
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 260
    invoke-virtual {p1}, Lo/dri;->d()I

    move-result v3

    .line 261
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v3}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 262
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handlerQuickAuthenResult.getResultcode()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    const/16 v0, 0x3e8

    if-ne v0, v3, :cond_3

    .line 264
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 265
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    const-string v1, "Tag"

    invoke-static {v0, v4, v1}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 266
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    const-string v1, "authen_Token"

    invoke-virtual {p1}, Lo/dri;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v4, v1, v2}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 269
    :cond_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 270
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    const-string v1, "authen_Token"

    invoke-virtual {p1}, Lo/dri;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v5, v1, v2}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 272
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 273
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    invoke-static {v0, v5, v4}, Lo/dsh;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    :cond_2
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "TokenAuthen is valid"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 277
    :cond_3
    const/16 v0, 0x3ec

    if-ne v0, v3, :cond_4

    .line 279
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "TokenAuthen is invalid"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x6b

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 281
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 284
    :cond_4
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "TokenAuthen is fail"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 285
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x6a

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 286
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 289
    :cond_5
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "responseAuthFirstInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x6a

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 292
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/dsd;Lo/dri;)Ljava/lang/Boolean;
    .locals 1

    .line 25
    invoke-direct {p0, p1}, Lo/dsd;->a(Lo/dri;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private a(Lo/drq;)V
    .locals 6

    .line 198
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 199
    invoke-virtual {p1}, Lo/drq;->d()I

    move-result v4

    .line 200
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 201
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get query resultcode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsd;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "manager_url"

    invoke-virtual {p1}, Lo/drq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 203
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsd;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "manager_post_data"

    invoke-virtual {p1}, Lo/drq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 204
    new-instance v5, Lo/drw;

    invoke-direct {v5}, Lo/drw;-><init>()V

    .line 205
    invoke-virtual {p1}, Lo/drq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/drw;->e(Ljava/lang/String;)V

    .line 206
    invoke-virtual {p1}, Lo/drq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/drw;->b(Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v5}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setWebViewData(Lo/drw;)V

    .line 208
    const/16 v0, 0x5dc

    if-ne v0, v4, :cond_0

    .line 209
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "start query service"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OldTimeStamp"

    invoke-virtual {p1}, Lo/drq;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 211
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {p1}, Lo/drq;->c()Lo/dqy;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setMultiSIMServiceInfo(Lo/dqy;)V

    .line 212
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7d

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    goto :goto_0

    .line 213
    :cond_0
    const/16 v0, 0x5dd

    if-ne v0, v4, :cond_1

    .line 214
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get query response data no change "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7d

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    goto :goto_0

    .line 217
    :cond_1
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get query response send to fail resultcode ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 220
    :goto_0
    goto :goto_1

    .line 221
    :cond_2
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "responseGetDevServInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 223
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 225
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/dsd;Lo/drq;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/dsd;->c(Lo/drq;)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 248
    iget-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 249
    iget-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    .line 252
    :cond_0
    iget-object v0, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 253
    iget-object v0, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 254
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    .line 256
    :cond_1
    return-void
.end method

.method private c()Ljava/lang/String;
    .locals 6

    .line 77
    new-instance v2, Lo/drf;

    invoke-direct {v2}, Lo/drf;-><init>()V

    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-static {}, Lo/dsh;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/drf;->a(I)V

    .line 80
    const-string v0, "GetDevServInfo"

    invoke-virtual {v2, v0}, Lo/drf;->a(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v3

    .line 83
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getServiceType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/drf;->e(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v2, v3}, Lo/drf;->b(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimaryIDtype()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/drf;->c(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondarytype()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/drf;->d(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondaryID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/drf;->k(Ljava/lang/String;)V

    .line 89
    :cond_0
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    const-string v1, "OldTimeStamp"

    invoke-static {v0, v3, v1}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 90
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    invoke-virtual {v2, v4}, Lo/drf;->g(Ljava/lang/String;)V

    .line 93
    :cond_1
    new-instance v5, Lo/drm;

    invoke-direct {v5}, Lo/drm;-><init>()V

    .line 94
    invoke-virtual {v5, v2}, Lo/drm;->a(Lo/drf;)V

    .line 95
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsd;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsh;->c(Landroid/content/Context;Ljava/lang/String;)Lo/drh;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/drm;->b(Lo/drh;)V

    .line 96
    invoke-virtual {v5}, Lo/drm;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(J)V
    .locals 2

    .line 231
    iget-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 232
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    .line 234
    :cond_0
    iget-object v0, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 235
    new-instance v0, Lo/dsd$3;

    invoke-direct {v0, p0}, Lo/dsd$3;-><init>(Lo/dsd;)V

    iput-object v0, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    .line 241
    :cond_1
    iget-object v0, p0, Lo/dsd;->a:Ljava/util/Timer;

    iget-object v1, p0, Lo/dsd;->b:Ljava/util/TimerTask;

    invoke-virtual {v0, v1, p1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 242
    return-void
.end method

.method private c(Lo/drq;)V
    .locals 4

    .line 297
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 298
    return-void

    .line 300
    :cond_0
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getType()I

    move-result v3

    .line 301
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    const/16 v0, 0x64

    if-ne v0, v3, :cond_1

    .line 303
    invoke-direct {p0, p1}, Lo/dsd;->d(Lo/drq;)V

    goto :goto_0

    .line 304
    :cond_1
    const/16 v0, 0x65

    if-ne v0, v3, :cond_2

    .line 305
    invoke-direct {p0, p1}, Lo/dsd;->e(Lo/drq;)V

    goto :goto_0

    .line 307
    :cond_2
    invoke-direct {p0, p1}, Lo/dsd;->a(Lo/drq;)V

    .line 309
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/dsd;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/dsd;->d()V

    return-void
.end method

.method private d()V
    .locals 11

    .line 64
    invoke-static {}, Lo/drx;->d()Ljava/lang/String;

    move-result-object v6

    .line 65
    invoke-direct {p0}, Lo/dsd;->c()Ljava/lang/String;

    move-result-object v7

    .line 66
    invoke-static {}, Lo/dsg;->b()Lo/dsg;

    move-result-object v8

    .line 67
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 68
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    const-string v1, "authorization"

    invoke-static {v0, v9, v1}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 69
    move-object v0, v8

    move-object v1, v6

    move-object v2, v7

    move-object v4, v10

    iget-object v5, p0, Lo/dsd;->i:Lo/dsl;

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dsg;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    .line 70
    return-void
.end method

.method private d(Lo/drq;)V
    .locals 7

    .line 126
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 127
    invoke-virtual {p1}, Lo/drq;->d()I

    move-result v4

    .line 128
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 129
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get query resultcode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    const/16 v0, 0x5dc

    if-ne v0, v4, :cond_0

    .line 131
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get add-query result"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OldTimeStamp"

    invoke-virtual {p1}, Lo/drq;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 133
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {p1}, Lo/drq;->c()Lo/dqy;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setMultiSIMServiceInfo(Lo/dqy;)V

    .line 134
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7d

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    goto/16 :goto_1

    .line 135
    :cond_0
    const/16 v0, 0x5de

    if-ne v0, v4, :cond_3

    .line 136
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getTime()I

    move-result v0

    div-int/lit8 v0, v0, 0x6

    int-to-long v5, v0

    .line 137
    iget v0, p0, Lo/dsd;->h:I

    sget v1, Lo/dsd;->f:I

    if-ge v0, v1, :cond_2

    .line 138
    iget v0, p0, Lo/dsd;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dsd;->h:I

    .line 139
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get add-query timer = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dsd;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    invoke-direct {p0}, Lo/dsd;->b()V

    .line 141
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_1

    .line 142
    iget v0, p0, Lo/dsd;->h:I

    int-to-long v0, v0

    mul-long/2addr v0, v5

    invoke-direct {p0, v0, v1}, Lo/dsd;->c(J)V

    goto :goto_0

    .line 144
    :cond_1
    sget v0, Lo/dsd;->g:I

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lo/dsd;->c(J)V

    goto :goto_0

    .line 147
    :cond_2
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get add-query result"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 150
    :goto_0
    goto :goto_1

    .line 151
    :cond_3
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get query response send to fail"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 154
    :goto_1
    goto :goto_2

    .line 155
    :cond_4
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "responseGetDevServInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 157
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 159
    :goto_2
    return-void
.end method

.method private e(Lo/drq;)V
    .locals 7

    .line 162
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 163
    invoke-virtual {p1}, Lo/drq;->d()I

    move-result v4

    .line 164
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 165
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get query resultcode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    const/16 v0, 0x5de

    if-ne v0, v4, :cond_0

    .line 167
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get Remove-query result"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    iget-object v0, p0, Lo/dsd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OldTimeStamp"

    invoke-virtual {p1}, Lo/drq;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 169
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {p1}, Lo/drq;->c()Lo/dqy;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setMultiSIMServiceInfo(Lo/dqy;)V

    .line 170
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7d

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    goto/16 :goto_1

    .line 171
    :cond_0
    const/16 v0, 0x5dc

    if-ne v0, v4, :cond_3

    .line 172
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getTime()I

    move-result v0

    div-int/lit8 v0, v0, 0x6

    int-to-long v5, v0

    .line 173
    iget v0, p0, Lo/dsd;->h:I

    sget v1, Lo/dsd;->f:I

    if-ge v0, v1, :cond_2

    .line 174
    iget v0, p0, Lo/dsd;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dsd;->h:I

    .line 175
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get Remove-query timer = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dsd;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    invoke-direct {p0}, Lo/dsd;->b()V

    .line 177
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_1

    .line 178
    iget v0, p0, Lo/dsd;->h:I

    int-to-long v0, v0

    mul-long/2addr v0, v5

    invoke-direct {p0, v0, v1}, Lo/dsd;->c(J)V

    goto :goto_0

    .line 180
    :cond_1
    sget v0, Lo/dsd;->g:I

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lo/dsd;->c(J)V

    goto :goto_0

    .line 183
    :cond_2
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get Remove-query result "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 186
    :goto_0
    goto :goto_1

    .line 187
    :cond_3
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "get query response send to fail "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 190
    :goto_1
    goto :goto_2

    .line 191
    :cond_4
    sget-object v0, Lo/dsd;->e:Ljava/lang/String;

    const-string v1, "responseGetDevServInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 193
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x7e

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 195
    :goto_2
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 41
    return-void
.end method

.method public e()V
    .locals 3

    .line 52
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 53
    return-void

    .line 55
    :cond_0
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getType()I

    move-result v2

    .line 56
    const/16 v0, 0x64

    if-eq v0, v2, :cond_1

    const/16 v0, 0x65

    if-ne v0, v2, :cond_2

    .line 57
    :cond_1
    iget-object v0, p0, Lo/dsd;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getTime()I

    move-result v0

    div-int/lit8 v0, v0, 0x6

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lo/dsd;->c(J)V

    goto :goto_0

    .line 59
    :cond_2
    invoke-direct {p0}, Lo/dsd;->d()V

    .line 61
    :goto_0
    return-void
.end method
