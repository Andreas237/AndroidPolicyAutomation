.class public Lo/fkl;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fkl$c;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Landroid/content/Context;

.field private static e:Z

.field private static g:I

.field private static i:Ljava/lang/String;

.field private static k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    sput v0, Lo/fkl;->g:I

    const/4 v0, 0x0

    sput v0, Lo/fkl;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    :try_start_0
    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    invoke-virtual {v3, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getAppMetaIntData error:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fkp;->c(Ljava/lang/String;)V

    :goto_0
    const/4 v0, -0x1

    return v0
.end method

.method public static a(Ljava/lang/String;Lo/fkk;)V
    .locals 7

    sget-boolean v0, Lo/fkl;->e:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Call SchemeManager.init() first!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-string v0, "{from}"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lo/fkl;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object p0, v0

    :cond_1
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    if-eqz p1, :cond_2

    const/16 v0, 0xc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lo/fkk;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v5

    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    sget v0, Lo/fkl;->k:I

    if-lez v0, :cond_3

    const-string v0, "url error."

    const/16 v1, 0x192

    invoke-interface {p1, v1, v0}, Lo/fkk;->b(ILjava/lang/String;)V

    return-void

    :cond_3
    sget v0, Lo/fkl;->k:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/fkl;->k:I

    move-object v6, p0

    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    sget-object v1, Lo/fkl;->b:Ljava/lang/String;

    const-string v2, ""

    sget-object v3, Lo/fkl;->i:Ljava/lang/String;

    new-instance v4, Lo/fkl$4;

    invoke-direct {v4, v6, p1}, Lo/fkl$4;-><init>(Ljava/lang/String;Lo/fkk;)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/fkl;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/fkk;)V

    :goto_0
    return-void
.end method

.method private static b()Ljava/lang/String;
    .locals 12

    const-string v0, "com.huawei.hwireader,com.chaozh.iReaderFree.scheme, com.chaozh.iReaderFree15, com.chaozh.iReaderFree"

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    array-length v0, v3

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "zhangyueireader://"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v5

    array-length v6, v3

    const/4 v7, 0x0

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/content/pm/ResolveInfo;

    iget-object v0, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v10, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v6, :cond_3

    aget-object v0, v3, v11

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v7, 0x1

    move v6, v11

    goto :goto_2

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    goto :goto_0

    :cond_5
    :goto_3
    if-eqz v7, :cond_6

    aget-object v0, v3, v6

    goto :goto_4

    :cond_6
    const-string v0, ""

    :goto_4
    return-object v0
.end method

.method public static b(Ljava/lang/String;Lo/fkk;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lo/fkl$2;

    invoke-direct {v0, p1}, Lo/fkl$2;-><init>(Lo/fkk;)V

    invoke-static {p0, v0}, Lo/fkl;->e(Ljava/lang/String;Lo/fkj;)V

    return-void
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "{host}"

    sget-object v1, Lo/fkl;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/fkr;->c(Landroid/content/Context;)Lo/fkr;

    move-result-object v1

    const-string v2, "SCHEME_SUPPORT_PACKAGE"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lo/fkr;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "{from}"

    sget-object v1, Lo/fkl;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "{traceid}"

    sget-object v1, Lo/fkl;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d()Landroid/content/Context;
    .locals 1

    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "com.huawei.hwireader"

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "schemeVersion"

    invoke-static {p0, v0}, Lo/fkl;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xdc

    if-ge v0, v1, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/fkk;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    sput-boolean v0, Lo/fkl;->e:Z

    sput-object p0, Lo/fkl;->d:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/fkl;->a:Ljava/lang/String;

    sput-object p1, Lo/fkl;->b:Ljava/lang/String;

    sput-object p2, Lo/fkl;->c:Ljava/lang/String;

    sput-object p3, Lo/fkl;->i:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "appId not valid"

    const/16 v1, 0x191

    invoke-interface {p4, v1, v0}, Lo/fkk;->b(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "appSecret not valid"

    const/16 v1, 0x191

    invoke-interface {p4, v1, v0}, Lo/fkk;->b(ILjava/lang/String;)V

    :cond_1
    :goto_0
    invoke-static {}, Lo/fkl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/fkl;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "supportPkgName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fkp;->e(Ljava/lang/String;)V

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "schemeVersion"

    invoke-static {v3, v0}, Lo/fkl;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/fkl;->g:I

    invoke-static {p0}, Lo/fkr;->c(Landroid/content/Context;)Lo/fkr;

    move-result-object v0

    const-string v1, "SCHEME_SUPPORT_PACKAGE"

    invoke-virtual {v0, v1, v3}, Lo/fkr;->e(Ljava/lang/String;Ljava/lang/String;)Z

    if-eqz p4, :cond_3

    const/16 v0, 0xc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p4, v0}, Lo/fkk;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lo/fkr;->c(Landroid/content/Context;)Lo/fkr;

    move-result-object v0

    const-string v1, "SCHEME_SUPPORT_PACKAGE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fkr;->e(Ljava/lang/String;Ljava/lang/String;)Z

    if-eqz p4, :cond_3

    const-string v0, "There is no application support uri scheme."

    const/16 v1, 0x190

    invoke-interface {p4, v1, v0}, Lo/fkk;->b(ILjava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static d(Lo/fkk;)V
    .locals 1

    const-string v0, "channel_ch_earclub"

    invoke-static {v0, p0}, Lo/fkl;->b(Ljava/lang/String;Lo/fkk;)V

    return-void
.end method

.method private static e(Ljava/lang/String;Lo/fkj;)V
    .locals 7

    sget-boolean v0, Lo/fkl;->e:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Call SchemeManager.init() first!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/fkr;->c(Landroid/content/Context;)Lo/fkr;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lo/fkr;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/fkr;->c(Landroid/content/Context;)Lo/fkr;

    move-result-object v0

    const-string v1, "SCHEME_SUPPORT_PACKAGE"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/fkr;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v3, ""

    sget-object v0, Lo/fkl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/fkr;->c(Landroid/content/Context;)Lo/fkr;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lo/fkr;->e(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p1, v3}, Lo/fkj;->d(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_2
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lo/fkq;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lo/fkq;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lo/fkj;->d(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_3
    const-string v6, "https://api.zhangyue.com/third/pageid?package={package}&appId={appid}&from={from}&traceid={traceid}&schemeVersion={schemeVersion}&closeback={closeback}&backfrom={backfrom}"

    const-string v0, "{package}"

    invoke-virtual {v6, v0, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{appid}"

    sget-object v2, Lo/fkl;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{traceid}"

    sget-object v2, Lo/fkl;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{from}"

    sget-object v2, Lo/fkl;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{schemeVersion}"

    sget v2, Lo/fkl;->g:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{closeback}"

    const-string v2, "false"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{backfrom}"

    const-string v2, "false"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&sign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/fkl;->c:Ljava/lang/String;

    invoke-static {v6, v1}, Lo/fko;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v0, Lo/fkl$c;

    if-eqz v5, :cond_4

    move-object v1, p1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p0, v6, v1}, Lo/fkl$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/fkj;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lo/fkl$c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
