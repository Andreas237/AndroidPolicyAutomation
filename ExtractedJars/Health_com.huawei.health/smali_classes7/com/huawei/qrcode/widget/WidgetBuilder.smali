.class public Lcom/huawei/qrcode/widget/WidgetBuilder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;
    }
.end annotation


# static fields
.field private static final isEmui30:Z

.field private static final isEmui305:Z

.field private static final isEmui40:Z

.field private static final isEmui50:Z

.field private static mBuilder:Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "huawei.android.widget.TimeAxisWidget"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.huawei.android.app.WallpaperManagerEx"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.huawei.android.app.ActionBarEx"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "huawei.android.widget.SubTabWidget"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui30:Z

    const-string v0, "huawei.android.widget.SearchView"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui305:Z

    invoke-static {}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isSupportBuildEx()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    sput-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui40:Z

    invoke-static {}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isSupportBuildEx()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    sput-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui50:Z

    sget-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui30:Z

    if-eqz v0, :cond_3

    const-string v0, "com.huawei.qrcode.widget.hw.BuilderHw"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    goto :goto_3

    :cond_3
    const-string v0, "com.huawei.qrcode.widget.custom.BuilderCustom"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v0, "com.huawei.qrcode.widget.hw.DefaultBuilder"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    :cond_4
    :goto_3
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    invoke-static {}, Lcom/huawei/qrcode/widget/WidgetBuilder;->getBuilder()Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;->createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public static createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;
    .locals 1

    invoke-static {}, Lcom/huawei/qrcode/widget/WidgetBuilder;->getBuilder()Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;->createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method private static getBuilder()Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;
    .locals 2

    sget-object v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->mBuilder:Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "widget builder is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->mBuilder:Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;

    return-object v0
.end method

.method private static isClassSupport(Ljava/lang/String;)Z
    .locals 3

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "WidgetBuilder ClassNotFoundException:"

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const/4 v0, 0x0

    return v0

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static isEmui30()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui30:Z

    return v0
.end method

.method public static isEmui305()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui305:Z

    return v0
.end method

.method public static isEmui40()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui40:Z

    return v0
.end method

.method public static isEmui50()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui50:Z

    return v0
.end method

.method private static isSupportBuildEx()Z
    .locals 1

    const-string v0, "com.huawei.android.os.BuildEx"

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isClassSupport(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static registerBuilder(Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;)V
    .locals 0

    sput-object p0, Lcom/huawei/qrcode/widget/WidgetBuilder;->mBuilder:Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;

    return-void
.end method
