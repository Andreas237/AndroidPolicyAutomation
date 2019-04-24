.class public Lo/dsf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private b:Lo/dsl;

.field private c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lo/dsf;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dsf;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    new-instance v0, Lo/dsf$5;

    invoke-direct {v0, p0}, Lo/dsf$5;-><init>(Lo/dsf;)V

    iput-object v0, p0, Lo/dsf;->b:Lo/dsl;

    .line 37
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    .line 40
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/dsf;)Landroid/content/Context;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 28
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lo/dsf;Lo/dri;)Ljava/lang/Boolean;
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Lo/dsf;->d(Lo/dri;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/dri;)Ljava/lang/Boolean;
    .locals 6

    .line 167
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 168
    invoke-virtual {p1}, Lo/dri;->d()I

    move-result v3

    .line 169
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 170
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v3}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 172
    :cond_0
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handler quick authenResult, resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    const/16 v0, 0x3e8

    if-ne v0, v3, :cond_4

    .line 174
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "TokenAuthen is valid"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 177
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    const-string v1, "Tag"

    invoke-static {v0, v4, v1}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 179
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 180
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    const-string v1, "authen_Token"

    invoke-virtual {p1}, Lo/dri;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v4, v1, v2}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 182
    :cond_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 183
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    const-string v1, "authen_Token"

    invoke-virtual {p1}, Lo/dri;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v5, v1, v2}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 185
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 186
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    invoke-static {v0, v5, v4}, Lo/dsh;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :cond_3
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 189
    :cond_4
    const/16 v0, 0x3ec

    if-ne v0, v3, :cond_5

    .line 191
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "TokenAuthen is invalid"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x6b

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 193
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 196
    :cond_5
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "TokenAuthen is fail"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x6a

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 198
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 201
    :cond_6
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "ResponseAuthFirstInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/drp;)V
    .locals 8

    .line 212
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 213
    invoke-virtual {p1}, Lo/drp;->a()I

    move-result v3

    .line 214
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 215
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v3}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 217
    :cond_0
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ResponseServiceProvisionInfo.getResultcode()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    const/16 v0, 0x7d0

    if-ne v0, v3, :cond_5

    .line 219
    invoke-virtual {p1}, Lo/drp;->b()Lo/drr;

    move-result-object v4

    .line 220
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 221
    invoke-virtual {v4}, Lo/drr;->b()Ljava/lang/String;

    move-result-object v5

    .line 222
    invoke-virtual {v4}, Lo/drr;->a()Ljava/lang/String;

    move-result-object v6

    .line 223
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MultiServiceResponseHandler:url ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", postdata="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    :cond_1
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 227
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v4}, Lo/drr;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setTime(I)V

    .line 228
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v6}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setPostdata(Ljava/lang/String;)V

    .line 230
    :cond_2
    new-instance v7, Lo/drw;

    invoke-direct {v7}, Lo/drw;-><init>()V

    .line 231
    invoke-virtual {p1}, Lo/drp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/drw;->a(Ljava/lang/String;)V

    .line 232
    invoke-virtual {p1}, Lo/drp;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/drw;->c(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v7, v5}, Lo/drw;->e(Ljava/lang/String;)V

    .line 234
    invoke-virtual {v7, v6}, Lo/drw;->b(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 236
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0, v7}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setWebViewData(Lo/drw;)V

    .line 238
    :cond_3
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x22ba

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 239
    goto :goto_0

    .line 240
    :cond_4
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "responseMultiSIMService is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x73

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 243
    :goto_0
    goto :goto_1

    .line 244
    :cond_5
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "responseServiceProvisionInfo.getResultcode() is no success"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x73

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 247
    :goto_1
    goto :goto_2

    .line 248
    :cond_6
    sget-object v0, Lo/dsf;->e:Ljava/lang/String;

    const-string v1, "responseServiceProvisionInfo is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 250
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setResultcode(I)V

    .line 252
    :cond_7
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/16 v1, 0x73

    invoke-static {v1, v0}, Lo/dsh;->d(ILcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 254
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/dsf;Lo/drp;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/dsf;->d(Lo/drp;)V

    return-void
.end method

.method private e(I)Ljava/lang/String;
    .locals 6

    .line 82
    new-instance v2, Lo/drk;

    invoke-direct {v2}, Lo/drk;-><init>()V

    .line 83
    new-instance v3, Lo/drl;

    invoke-direct {v3}, Lo/drl;-><init>()V

    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-static {}, Lo/dsh;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/drk;->e(I)V

    .line 87
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 88
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 89
    const-string v0, "Binding"

    invoke-virtual {v3, v0}, Lo/drl;->e(Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getNikename()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/drl;->h(Ljava/lang/String;)V

    goto :goto_0

    .line 91
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 92
    const-string v0, "Unbinding"

    invoke-virtual {v3, v0}, Lo/drl;->e(Ljava/lang/String;)V

    .line 94
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v4

    .line 95
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimaryIDtype()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/drl;->d(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v3, v4}, Lo/drl;->b(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondarytype()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/drl;->c(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondaryID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/drl;->a(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondaryDeviceId()Lo/drc;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/drl;->c(Lo/drc;)V

    .line 102
    invoke-virtual {v2, v4}, Lo/drk;->e(Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimaryIDtype()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/drk;->d(Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getServiceType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/drk;->a(Ljava/lang/String;)V

    .line 106
    :cond_2
    invoke-virtual {v2, v3}, Lo/drk;->c(Lo/drl;)V

    .line 107
    new-instance v5, Lo/drm;

    invoke-direct {v5}, Lo/drm;-><init>()V

    .line 108
    invoke-virtual {v5, v2}, Lo/drm;->c(Lo/drk;)V

    .line 109
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dsf;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsh;->c(Landroid/content/Context;Ljava/lang/String;)Lo/drh;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/drm;->b(Lo/drh;)V

    .line 110
    invoke-virtual {v5}, Lo/drm;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 54
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 55
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-virtual {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getType()I

    move-result v0

    const/16 v1, 0x64

    if-ne v1, v0, :cond_0

    .line 56
    invoke-virtual {p0}, Lo/dsf;->c()V

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0}, Lo/dsf;->e()V

    .line 61
    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 11

    .line 67
    invoke-static {}, Lo/drx;->d()Ljava/lang/String;

    move-result-object v6

    .line 68
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dsf;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 69
    invoke-static {}, Lo/dsg;->b()Lo/dsg;

    move-result-object v8

    .line 70
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 71
    iget-object v0, p0, Lo/dsf;->d:Landroid/content/Context;

    const-string v1, "authorization"

    invoke-static {v0, v9, v1}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 72
    move-object v0, v8

    move-object v1, v6

    move-object v2, v7

    move-object v4, v10

    iget-object v5, p0, Lo/dsf;->b:Lo/dsl;

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dsg;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    .line 73
    return-void
.end method

.method public c(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 48
    return-void
.end method

.method public e()V
    .locals 4

    .line 117
    iget-object v0, p0, Lo/dsf;->c:Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-static {v0}, Lo/dsh;->b(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)Ljava/lang/String;

    move-result-object v1

    .line 118
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/dsf;->e(I)Ljava/lang/String;

    move-result-object v2

    .line 119
    invoke-static {}, Lo/dsg;->b()Lo/dsg;

    move-result-object v3

    .line 120
    iget-object v0, p0, Lo/dsf;->b:Lo/dsl;

    invoke-virtual {v3, v1, v2, v0}, Lo/dsg;->a(Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    .line 121
    return-void
.end method
