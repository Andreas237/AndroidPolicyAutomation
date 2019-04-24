.class public Lcom/huawei/operation/utils/Utils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FILEURL:Ljava/lang/String; = "file:///android_asset/stressGame/html/twoVideoPlay.html"

.field private static final FILEURL2:Ljava/lang/String; = "file:///android_asset/stressGame/html/twoVideoPlay_old.html"

.field private static final FILEURL3:Ljava/lang/String; = "file:///android_asset/operation/MessageH5/html/recommendIndex1.html"

.field private static final FILEURL4:Ljava/lang/String; = "file:///android_asset/operation/MessageH5/html/recommendBohee.html"

.field private static final FILEURL5:Ljava/lang/String; = "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=110"

.field private static final FILEURL6:Ljava/lang/String; = "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=166"

.field private static final FILEURL7:Ljava/lang/String; = "file:///android_asset/operation/MessageH5/html/honorBracelet.html"

.field private static final FILEURL8:Ljava/lang/String; = "file:///android_asset/operation/MessageH5/html/recommendIndex2.html"

.field private static final FILEURL9:Ljava/lang/String; = "file:///android_asset/operation/MessageH5/html/huaweiBracelet.html"

.field private static final PREFIXHTTP:Ljava/lang/String; = "http://"

.field private static final PREFIXHTTPS:Ljava/lang/String; = "https://"

.field private static final TAG:Ljava/lang/String; = "Opera_Utils"

.field private static localWhiteUrlList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    .line 40
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#hicloud.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#heartide.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#boohee.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#boohee.cn"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#zhongan.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#chunyuyisheng.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#alipay.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#unionpay.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#95516.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#miaomore.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#qq.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#newrank.cn"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#xiumi.us"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#json.cn"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#sojump.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#wenjuan.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#mikecrm.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#nike.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#vmall.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#weixinbridge.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#psy-1.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#codoon.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#idata-power.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#cardniu.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#miaohealth.net"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#tenpay.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#guahao.com"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#wenjuan.net"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#wjx.top"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#hwlf.hwcloudtest.cn"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    const-string v1, "HWWHITEULR#117.78.34.25"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fetch_localWhiteUrlList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 73
    sget-object v0, Lcom/huawei/operation/utils/Utils;->localWhiteUrlList:Ljava/util/List;

    return-object v0
.end method

.method public static getHostByJDK(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 204
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHostByJDK enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const/4 v4, 0x0

    .line 207
    :try_start_0
    new-instance v5, Ljava/net/URI;

    invoke-direct {v5, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v5}, Ljava/net/URI;->getHost()Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 211
    goto :goto_0

    .line 209
    :catch_0
    move-exception v5

    .line 210
    const-string v0, "Opera_Utils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHostByJDK "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :goto_0
    return-object v4
.end method

.method public static isHttpOrHttps(Ljava/lang/String;)Z
    .locals 1

    .line 264
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    const/4 v0, 0x0

    return v0

    .line 267
    :cond_0
    const-string v0, "http://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 270
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isWhiteFileUrl(Ljava/lang/String;)Z
    .locals 4

    .line 122
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const/4 v0, 0x0

    return v0

    .line 126
    :cond_0
    const-string v0, "file:///android_asset/stressGame/html/twoVideoPlay.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "file:///android_asset/stressGame/html/twoVideoPlay_old.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 127
    :cond_1
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bbe\u7f6e\u767d\u540d\u5355 \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x1

    return v0

    .line 131
    :cond_2
    const-string v0, "file:///android_asset/operation/MessageH5/html/recommendIndex1.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "file:///android_asset/operation/MessageH5/html/recommendBohee.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=110"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=166"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "file:///android_asset/operation/MessageH5/html/honorBracelet.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "file:///android_asset/operation/MessageH5/html/recommendIndex2.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "file:///android_asset/operation/MessageH5/html/huaweiBracelet.html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 132
    :cond_3
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bbe\u7f6e\u767d\u540d\u5355 \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, 0x1

    return v0

    .line 135
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public static isWhiteUrlLogicJudge(Ljava/lang/String;Lcom/huawei/operation/adapter/PluginOperationAdapter;)Z
    .locals 13

    .line 138
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Utils isWhiteUrl enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 140
    :cond_0
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl currentUrl isEmpty or mAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/4 v0, 0x0

    return v0

    .line 143
    :cond_1
    invoke-static {p0}, Lcom/huawei/operation/utils/Utils;->getHostByJDK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 144
    const-string v0, "Opera_Utils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "urlHost is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl urlHost is Null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    return v0

    .line 149
    :cond_2
    const-string v0, "HWWHITEULR"

    invoke-interface {p1, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->queryUrlList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 152
    move-object v6, v5

    .line 153
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl in cloudWhiteUrlList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 155
    :cond_3
    invoke-static {}, Lcom/huawei/operation/utils/Utils;->fetch_localWhiteUrlList()Ljava/util/List;

    move-result-object v6

    .line 156
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl in fetch_localWhiteUrlList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    :goto_0
    const/4 v7, 0x0

    .line 159
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 160
    const-string v0, "#"

    const/4 v1, 0x2

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v7

    .line 161
    if-eqz v7, :cond_7

    array-length v0, v7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 162
    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 164
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, v7, v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 165
    const-string v0, "Opera_Utils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl urlTmp is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 168
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl in TextUtils.isEmpty(urlTmp)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 169
    const/4 v0, 0x1

    return v0

    .line 171
    :cond_4
    const-string v0, "."

    :try_start_1
    invoke-virtual {v10, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 172
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl in !urlTmp.endsWith(.)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 173
    goto/16 :goto_1

    .line 175
    :cond_5
    const-string v11, "^[A-Za-z0-9.-]+$"

    .line 176
    :try_start_2
    invoke-virtual {v10, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v12

    .line 177
    const-string v0, "Opera_Utils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl in isVailed matches : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 178
    if-eqz v12, :cond_6

    .line 179
    const/4 v0, 0x1

    return v0

    .line 181
    :cond_6
    goto/16 :goto_1

    .line 184
    :catch_0
    move-exception v10

    .line 185
    const-string v0, "Opera_Utils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const/4 v0, 0x0

    return v0

    .line 187
    :catch_1
    move-exception v10

    .line 188
    const-string v0, "Opera_Utils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/4 v0, 0x0

    return v0

    .line 193
    :cond_7
    goto/16 :goto_1

    .line 194
    :cond_8
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No host in the array. return false."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const/4 v0, 0x0

    return v0
.end method

.method public static needAuth(Landroid/content/Context;)Z
    .locals 3

    .line 99
    if-eqz p0, :cond_0

    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 100
    :cond_1
    const/16 v0, 0x7537

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "open_service_auth_key"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 102
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static stringToDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 7

    .line 82
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 83
    const/4 v5, 0x0

    .line 86
    :try_start_0
    invoke-virtual {v4, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 89
    goto :goto_0

    .line 87
    :catch_0
    move-exception v6

    .line 88
    const-string v0, "Opera_Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stringToDate ParseException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_0
    return-object v5
.end method
