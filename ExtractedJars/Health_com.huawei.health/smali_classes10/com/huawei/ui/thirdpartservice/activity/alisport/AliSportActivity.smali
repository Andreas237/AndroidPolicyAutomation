.class public Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/TextView;

.field private d:Lo/egd;

.field private e:Lo/egd;

.field private g:Ljava/util/concurrent/ExecutorService;

.field private h:Lo/czg;

.field private k:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$5;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 148
    return-void
.end method

.method private a(I)V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->k:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 152
    iput p1, v1, Landroid/os/Message;->what:I

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->k:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 154
    return-void
.end method

.method private a(Z)V
    .locals 5

    .line 85
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "alisport_red_dot_show"

    const-string v3, "true"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 88
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->ali_sport_connect_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->c:Landroid/widget/TextView;

    .line 89
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->aliSport_button_connect:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d:Lo/egd;

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d:Lo/egd;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->aliSport_button_cancel_connect:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e:Lo/egd;

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e:Lo/egd;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$1;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->ali_sport_connect_show_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a:Landroid/widget/TextView;

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->c(Z)V

    .line 107
    return-void
.end method

.method private b()V
    .locals 6

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->h:Lo/czg;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$7;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    const/16 v2, 0x18

    invoke-virtual {v0, v2, v1}, Lo/czg;->c(ILo/cyx;)V

    .line 284
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 285
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "status"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    sget-object v0, Lo/dae;->iQ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 288
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 289
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save notification click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d()V

    return-void
.end method

.method private c(Z)V
    .locals 3

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->c:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d:Lo/egd;

    if-eqz p1, :cond_1

    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e:Lo/egd;

    if-eqz p1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_ali_introduction_after_link:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    .line 115
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_ali_introduction:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 114
    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    if-eqz p1, :cond_4

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_4

    .line 120
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a:Landroid/widget/TextView;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 122
    :goto_4
    return-void
.end method

.method private c()Z
    .locals 4

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNetStatus net ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    const/4 v0, 0x1

    return v0

    .line 297
    :cond_0
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNetStatus net error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;
    .locals 2

    .line 231
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 232
    const/4 v0, 0x0

    return-object v0

    .line 234
    :cond_0
    new-instance v1, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;-><init>()V

    .line 235
    const/16 v0, 0x18

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->setThirdAccountType(I)V

    .line 236
    invoke-virtual {v1, p1}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->setOpenID(Ljava/lang/String;)V

    .line 237
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->setThirdTokenType(I)V

    .line 238
    invoke-virtual {v1, p2}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->setThirdToken(Ljava/lang/String;)V

    .line 239
    return-object v1
.end method

.method private d()V
    .locals 11

    .line 164
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(I)V

    .line 166
    return-void

    .line 169
    :cond_0
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v4

    .line 171
    const/4 v5, 0x0

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    const/16 v2, 0x18

    invoke-virtual {v4, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x400

    invoke-virtual {v4, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7e8

    invoke-virtual {v4, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 175
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v6, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 180
    goto :goto_0

    .line 177
    :catch_0
    move-exception v7

    .line 179
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decrypt error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, v5}, Lo/fjq;->d(Landroid/app/Activity;Ljava/lang/String;)Lo/fjp;

    move-result-object v7

    .line 184
    invoke-virtual {v7}, Lo/fjp;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "9000"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v7}, Lo/fjp;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "200"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 185
    :cond_1
    const-string v0, "AliSportActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doAliAuth failed ! ali auth error , result is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lo/fjp;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    invoke-virtual {v7}, Lo/fjp;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "6001"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(I)V

    goto :goto_1

    .line 190
    :cond_2
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(I)V

    .line 192
    :goto_1
    return-void

    .line 195
    :cond_3
    invoke-virtual {v7}, Lo/fjp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/fjp;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;

    move-result-object v8

    .line 197
    if-nez v8, :cond_4

    .line 198
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doAliAuth failed ! prepare thirdAuthTokenI error , userID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(I)V

    .line 200
    return-void

    .line 202
    :cond_4
    invoke-direct {p0, v8}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;)V

    .line 205
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 206
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v0, "status"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    sget-object v0, Lo/dae;->iQ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v10

    .line 209
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v10, v9, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 210
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save notification click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    return-void
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;)V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->h:Lo/czg;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$2;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    invoke-virtual {v0, p1, v1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;Lo/cyx;)V

    .line 228
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(I)V

    return-void
.end method

.method private e()V
    .locals 5

    .line 244
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 245
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(I)V

    .line 246
    return-void

    .line 249
    :cond_0
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hwh_ali_sport_disconnect_note_content:I

    .line 250
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_qq_health_disconnect_button:I

    new-instance v2, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$6;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    .line 251
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$3;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    .line 257
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 263
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 264
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 266
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 268
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;Z)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->c(Z)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 73
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 74
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    .line 75
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;-><init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->k:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;

    .line 76
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->g:Ljava/util/concurrent/ExecutorService;

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->h:Lo/czg;

    .line 78
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_ali_sport:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->setContentView(I)V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 80
    const-string v0, "AUTH_STATUS"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Z)V

    .line 81
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oncreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 126
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 128
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 138
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 139
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 132
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 134
    return-void
.end method
