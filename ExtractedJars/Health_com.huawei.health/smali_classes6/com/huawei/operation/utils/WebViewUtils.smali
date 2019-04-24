.class public Lcom/huawei/operation/utils/WebViewUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ALIPAY:Ljava/lang/String; = "alipay"

.field public static final ALIPAYS:Ljava/lang/String; = "alipays:"

.field private static final ALIPAY_PKG_NAME:Ljava/lang/String; = "com.eg.android.AlipayGphone"

.field private static final APP_PATH_SD_CARD:Ljava/lang/String; = "/healthshop/."

.field private static final APP_PATH_SD_CARD_ROOT:Ljava/lang/String; = "/huawei/"

.field public static final CMBLIFE_PAY:Ljava/lang/String; = "cmblife://pay?"

.field private static final FILECHOOSER_RESULTCODE:I = 0x2766

.field private static final FILECHOOSER_RESULTCODE_FOR_ANDROID_5:I = 0x2767

.field public static final GEO:Ljava/lang/String; = "geo:"

.field public static final HEALTHSCHEME:Ljava/lang/String; = "HEALTHSCHEME"

.field public static final HUAWEIHEALTH:Ljava/lang/String; = "huaweihealth"

.field public static final HUAWEISCHEME:Ljava/lang/String; = "huaweischeme"

.field private static final TAG:Ljava/lang/String; = "Opera_WebViewUtils"

.field private static final WECHAT_PKG_NAME:Ljava/lang/String; = "com.tencent.mm"

.field public static final WEIXIN_WAP_PAY:Ljava/lang/String; = "weixin://wap/pay?"

.field private static overseaUrls:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static schemeLocalList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static thirdPkgNames:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 57
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/operation/utils/WebViewUtils;->schemeLocalList:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/utils/WebViewUtils;->schemeLocalList:Ljava/util/List;

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/operation/utils/WebViewUtils;->overseaUrls:Ljava/util/List;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/utils/WebViewUtils;->overseaUrls:Ljava/util/List;

    .line 67
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->overseaUrls:Ljava/util/List;

    const-string v1, "https://health.vmall.com/help/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->overseaUrls:Ljava/util/List;

    const-string v1, "https://resourcephs1.vmall.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->overseaUrls:Ljava/util/List;

    const-string v1, "https://resourcephs2.vmall.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/operation/utils/WebViewUtils;->thirdPkgNames:Ljava/util/List;

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/utils/WebViewUtils;->thirdPkgNames:Ljava/util/List;

    .line 98
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->thirdPkgNames:Ljava/util/List;

    const-string v1, "com.pa.health"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->thirdPkgNames:Ljava/util/List;

    const-string v1, "com.zhongan.insurance"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createImageFile()Ljava/io/File;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 222
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd_HHmmss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JPEG_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/huawei/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 225
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/healthshop/."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    .line 226
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v7

    .line 228
    if-nez v7, :cond_0

    .line 229
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storageDir.mkdir failure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    :cond_0
    const-string v0, ".jpg"

    invoke-static {v5, v0, v6}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static getActivityKeyUrlSP(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 296
    const/16 v0, 0x271b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WEB_VIEW__GRS_ACTIVITY__URL_KEY"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 298
    return-object v2
.end method

.method public static getTokenKeyUrlSP(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 284
    const/16 v0, 0x271b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WEB_VIEW__GRS_TOKEN_URL_KEY"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 286
    return-object v2
.end method

.method public static gotoPkgAppDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 306
    const/4 v4, 0x0

    .line 307
    new-instance v5, Lo/egv$b;

    invoke-direct {v5, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 308
    sget v0, Lcom/huawei/operation/R$string;->IDS_hwh_me_healthshop_go_to_pkg_app:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 309
    sget v0, Lcom/huawei/operation/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 310
    invoke-virtual {v0, v6}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_apphelp_pwindows_continue_button:I

    .line 311
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/operation/utils/WebViewUtils$2;

    invoke-direct {v2, p3, p0, p1}, Lcom/huawei/operation/utils/WebViewUtils$2;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_settings_button_cancal:I

    .line 335
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/operation/utils/WebViewUtils$1;

    invoke-direct {v2}, Lcom/huawei/operation/utils/WebViewUtils$1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 340
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 341
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoPkgAppDialog  Activity isFinishing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 343
    :cond_0
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 344
    new-instance v0, Lcom/huawei/operation/utils/WebViewUtils$3;

    invoke-direct {v0}, Lcom/huawei/operation/utils/WebViewUtils$3;-><init>()V

    invoke-virtual {v4, v0}, Lo/egv;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 350
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 352
    :goto_0
    return-void
.end method

.method public static isOverseaUrl(Ljava/lang/String;)Z
    .locals 3

    .line 78
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    const/4 v0, 0x0

    return v0

    .line 81
    :cond_0
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->overseaUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 82
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    const/4 v0, 0x1

    return v0

    .line 85
    :cond_1
    goto :goto_0

    .line 86
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isUnreasonableTitle(Ljava/util/ArrayList;Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/lang/String;)Z"
        }
    .end annotation

    .line 246
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    const/4 v0, 0x1

    return v0

    .line 250
    :cond_0
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v1

    .line 251
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 252
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    const/4 v0, 0x1

    return v0

    .line 255
    :cond_1
    goto :goto_0

    .line 256
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isWhiteThirdPkg(Ljava/lang/String;)Z
    .locals 3

    .line 107
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    const/4 v0, 0x0

    return v0

    .line 110
    :cond_0
    sget-object v0, Lcom/huawei/operation/utils/WebViewUtils;->thirdPkgNames:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 111
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    const/4 v0, 0x1

    return v0

    .line 114
    :cond_1
    goto :goto_0

    .line 115
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static jumpToActivity(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 170
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 173
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 175
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 177
    const-string v0, "android.intent.category.BROWSABLE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 179
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 181
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setSelector(Landroid/content/Intent;)V

    .line 182
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 183
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to scheme view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_0

    .line 184
    :catch_0
    move-exception v4

    .line 185
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_0
    return-void
.end method

.method public static openFileChooserImpl(Landroid/app/Activity;)V
    .locals 3

    .line 193
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 194
    const-string v0, "android.intent.category.OPENABLE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 195
    const-string v0, "image/*"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    const-string v0, "File Chooser"

    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x2766

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 197
    return-void
.end method

.method public static openFileChooserImplForAndroid5(Landroid/app/Activity;)V
    .locals 4

    .line 203
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 204
    const-string v0, "android.intent.category.OPENABLE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    const-string v0, "image/*"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 207
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.CHOOSER"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 208
    const-string v0, "android.intent.extra.INTENT"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 209
    const-string v0, "android.intent.extra.TITLE"

    const-string v1, "Image Chooser"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    const/16 v0, 0x2767

    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 212
    return-void
.end method

.method public static schemeHandle(Landroid/content/Context;Lcom/huawei/operation/adapter/PluginOperationAdapter;Ljava/lang/String;)Z
    .locals 4

    .line 126
    if-eqz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    :cond_0
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAdapter is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x0

    return v0

    .line 131
    :cond_1
    const-string v0, "alipays:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "alipay"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    :cond_2
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInstalledWeChatOrAlipay alipays"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " and is install alipay is = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "com.eg.android.AlipayGphone"

    invoke-static {p0, v2}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-static {p0, p2}, Lcom/huawei/operation/utils/WebViewUtils;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 134
    const/4 v0, 0x1

    return v0

    .line 138
    :cond_3
    const-string v0, "huaweihealth"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "huaweischeme"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "geo:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "mailto:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "tel:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 139
    :cond_4
    invoke-static {p0, p2}, Lcom/huawei/operation/utils/WebViewUtils;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 140
    const/4 v0, 0x1

    return v0

    .line 143
    :cond_5
    const-string v0, "weixin://wap/pay?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 144
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInstalledWeChatOrAlipay weixin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, "com.tencent.mm"

    invoke-static {p0, v0}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 146
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not install weixin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "com.tencent.mm"

    invoke-static {p0, v0}, Lo/dbf;->g(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 149
    :cond_6
    invoke-static {p0, p2}, Lcom/huawei/operation/utils/WebViewUtils;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 151
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 154
    :cond_7
    const-string v0, "cmblife://pay?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 155
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "schemeHandle CMBLIFE_PAY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-static {p0, p2}, Lcom/huawei/operation/utils/WebViewUtils;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 157
    const/4 v0, 0x1

    return v0

    .line 160
    :cond_8
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scheme not in the list return false."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x0

    return v0
.end method

.method public static setActivityKeyUrlSP(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 290
    new-instance v2, Lo/dcy;

    invoke-direct {v2}, Lo/dcy;-><init>()V

    .line 291
    const/16 v0, 0x271b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WEB_VIEW__GRS_ACTIVITY__URL_KEY"

    invoke-static {p0, v0, v1, p1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 293
    return-void
.end method

.method public static setTokenKeyUrlSP(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 278
    new-instance v2, Lo/dcy;

    invoke-direct {v2}, Lo/dcy;-><init>()V

    .line 279
    const/16 v0, 0x271b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WEB_VIEW__GRS_TOKEN_URL_KEY"

    invoke-static {p0, v0, v1, p1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 281
    return-void
.end method
