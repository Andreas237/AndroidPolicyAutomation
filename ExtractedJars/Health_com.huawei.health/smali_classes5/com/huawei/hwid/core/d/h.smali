.class public Lcom/huawei/hwid/core/d/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[Ljava/lang/CharSequence;

.field private static b:[Ljava/lang/CharSequence;

.field private static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/CharSequence;Ljava/lang/CharSequence;>;"
        }
    .end annotation
.end field

.field private static d:Lcom/huawei/hwid/core/datatype/SiteCountryInfo;

.field private static e:Lcom/huawei/hwid/core/datatype/SMSKeyInfo;

.field private static f:Lcom/huawei/hwid/core/datatype/SiteListInfo;

.field private static g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/h;->a:[Ljava/lang/CharSequence;

    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/h;->b:[Ljava/lang/CharSequence;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/h;->c:Ljava/util/HashMap;

    .line 42
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/h;->d:Lcom/huawei/hwid/core/datatype/SiteCountryInfo;

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/h;->e:Lcom/huawei/hwid/core/datatype/SMSKeyInfo;

    .line 44
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/h;->f:Lcom/huawei/hwid/core/datatype/SiteListInfo;

    .line 45
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hwid/core/d/h;->g:Z

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 5

    .line 418
    const/4 v3, 0x0

    .line 420
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "ip_countrySiteID"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 424
    goto :goto_0

    .line 422
    :catch_0
    move-exception v4

    .line 423
    const-string v0, "IpCountryUtil"

    const-string v1, "siteID in prefrence maybe err"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    :goto_0
    return v3
.end method
