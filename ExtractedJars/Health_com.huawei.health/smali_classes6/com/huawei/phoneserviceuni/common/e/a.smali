.class public Lcom/huawei/phoneserviceuni/common/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "DeviceUtils"

.field private static final b:Ljava/lang/String; = "000000000000000"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A()I
    .locals 1

    .line 694
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 695
    const/4 v0, 0x3

    return v0

    .line 696
    :cond_0
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 697
    const/4 v0, 0x2

    return v0

    .line 699
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static B()Z
    .locals 2

    .line 704
    const-string v0, "ro.build.characteristics"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 705
    const-string v0, "tablet"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static C()Ljava/lang/String;
    .locals 3

    .line 786
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 787
    return-object v2
.end method

.method public static D()Z
    .locals 2

    .line 827
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->f()Ljava/lang/String;

    move-result-object v1

    .line 828
    const-string v0, "C721"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    const/4 v0, 0x1

    return v0

    .line 831
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static E()Ljava/lang/String;
    .locals 5

    .line 797
    const-string v3, ""

    .line 798
    const-string v0, "ro.build.product.real.id"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 800
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRealFirmwareVersion(),send ro.build.product.real.id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 801
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 802
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->F()Ljava/lang/String;

    move-result-object v4

    .line 803
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFirmwareVersion(), getDisplayFirmwareVersion "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 805
    :cond_0
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFirmwareVersion() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    return-object v4
.end method

.method private static F()Ljava/lang/String;
    .locals 5

    .line 814
    const-string v3, ""

    .line 815
    const-string v0, "ro.build.display.id"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 817
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFirmwareVersion(),send ro.build.display.id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 818
    return-object v4
.end method

.method public static a(Landroid/app/Activity;)I
    .locals 3

    .line 904
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 906
    const/4 v0, 0x0

    return v0

    .line 908
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 909
    invoke-virtual {v2}, Landroid/view/Window;->getNavigationBarColor()I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 566
    const/4 v2, 0x0

    .line 567
    if-nez p0, :cond_0

    .line 568
    const-string v0, "DeviceUtils"

    const-string v1, "Context is null."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 571
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 572
    if-eqz v3, :cond_2

    .line 574
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v3, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 575
    if-eqz v4, :cond_1

    .line 576
    iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 580
    :cond_1
    goto :goto_0

    .line 578
    :catch_0
    move-exception v4

    .line 579
    const-string v0, "DeviceUtils"

    const-string v1, "getVersionName"

    invoke-static {v4, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 235
    if-nez p0, :cond_0

    .line 236
    const-string v0, ""

    return-object v0

    .line 238
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 239
    array-length v2, v1

    .line 241
    const/4 v3, 0x4

    :goto_0
    if-ge v3, v2, :cond_1

    const/16 v0, 0xa

    if-gt v3, v0, :cond_1

    .line 242
    const/16 v0, 0x30

    aput-char v0, v1, v3

    .line 241
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 244
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 257
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 258
    const/4 v3, 0x0

    .line 260
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v2, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 263
    goto :goto_0

    .line 261
    :catch_0
    move-exception v4

    .line 262
    const-string v0, "DeviceUtils"

    const-string v1, "getPackageVersionCode:NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    :goto_0
    if-eqz v3, :cond_0

    .line 265
    iget v0, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 267
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Landroid/app/Activity;I)V
    .locals 3

    .line 881
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 883
    return-void

    .line 885
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 886
    invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 887
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/view/View;)V
    .locals 6

    .line 862
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 864
    :cond_0
    return-void

    .line 866
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 867
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 868
    iget v5, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 869
    if-ge v4, v5, :cond_2

    goto :goto_0

    :cond_2
    move v4, v5

    .line 871
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {p0, v1}, Lcom/huawei/feedback/e;->a(Landroid/content/Context;F)I

    move-result v1

    sub-int v1, v4, v1

    div-int/lit8 v1, v1, 0x4

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 872
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 873
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/widget/Button;)V
    .locals 5

    .line 842
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 844
    :cond_0
    return-void

    .line 846
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 847
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 848
    iget v4, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 849
    if-ge v3, v4, :cond_2

    goto :goto_0

    :cond_2
    move v3, v4

    .line 850
    :goto_0
    invoke-virtual {p1}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    div-int/lit8 v1, v3, 0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 851
    invoke-virtual {p1}, Landroid/widget/Button;->requestLayout()V

    .line 852
    return-void
.end method

.method public static a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 597
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 598
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 1

    .line 64
    const-string v0, "com.huawei.android.os.BuildEx"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .line 45
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    .line 46
    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    invoke-static {p0}, Lcom/huawei/android/immersion/ImmersionStyle;->getPrimaryColor(Landroid/content/Context;)I

    move-result v2

    .line 48
    invoke-static {v2}, Lcom/huawei/android/immersion/ImmersionStyle;->getSuggestionForgroundColorStyle(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 49
    const/4 v0, 0x1

    return v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 54
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Landroid/app/Activity;)I
    .locals 9

    .line 919
    const/4 v2, 0x0

    .line 920
    const/4 v3, 0x0

    .line 921
    const/4 v4, 0x0

    .line 922
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 924
    const-string v0, "com.android.internal.R$dimen"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 925
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    .line 926
    const-string v0, "status_bar_height"

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 927
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v7

    .line 928
    if-eqz v7, :cond_0

    .line 930
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_4

    move-result v0

    move v5, v0

    .line 933
    goto :goto_0

    .line 931
    :catch_0
    move-exception v8

    .line 932
    const-string v0, "DeviceUtils"

    const-string v1, "get statusbar height occur  NumberFormatException."

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 935
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_4

    move-result v0

    move v6, v0

    .line 944
    goto :goto_1

    .line 936
    :catch_1
    move-exception v7

    .line 937
    const-string v0, "DeviceUtils"

    const-string v1, "get statusbar height occur  ClassNotFoundException."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    goto :goto_1

    .line 938
    :catch_2
    move-exception v7

    .line 939
    const-string v0, "DeviceUtils"

    const-string v1, "get statusbar height occur  InstantiationException."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    goto :goto_1

    .line 940
    :catch_3
    move-exception v7

    .line 941
    const-string v0, "DeviceUtils"

    const-string v1, "get statusbar height occur  IllegalAccessException."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    goto :goto_1

    .line 942
    :catch_4
    move-exception v7

    .line 943
    const-string v0, "DeviceUtils"

    const-string v1, "get statusbar height occur  NoSuchFieldException."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 945
    :goto_1
    return v6
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)I
    .locals 5

    .line 668
    const/4 v2, 0x0

    .line 670
    if-eqz p0, :cond_0

    .line 671
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 672
    :cond_0
    return v2

    .line 675
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 676
    if-eqz v3, :cond_3

    .line 678
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v3, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 679
    if-eqz v4, :cond_2

    .line 680
    iget v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v0

    .line 684
    :cond_2
    goto :goto_0

    .line 682
    :catch_0
    move-exception v4

    .line 683
    const-string v0, "DeviceUtils"

    const-string v1, "getVersionCode"

    invoke-static {v4, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    :cond_3
    :goto_0
    return v2
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 73
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 127
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 128
    iget-object v0, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 129
    iget-object v0, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 278
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 279
    const/4 v3, 0x0

    .line 281
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v2, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 284
    goto :goto_0

    .line 282
    :catch_0
    move-exception v4

    .line 283
    const-string v0, "DeviceUtils"

    const-string v1, "getPackageVersionName:NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    :goto_0
    if-eqz v3, :cond_0

    .line 286
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 288
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Landroid/app/Activity;I)V
    .locals 3

    .line 894
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 896
    return-void

    .line 898
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 899
    invoke-virtual {v2, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 900
    return-void
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 3

    .line 140
    const/4 v1, 0x1

    .line 142
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    goto :goto_0

    .line 143
    :catch_0
    move-exception v2

    .line 144
    const/4 v1, 0x0

    .line 146
    :goto_0
    return v1
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 84
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 300
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a;->i(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 301
    if-eqz v1, :cond_0

    .line 302
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 305
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .line 93
    const-string v0, "ro.product.brand"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 317
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a;->i(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 318
    if-eqz v1, :cond_0

    .line 319
    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 322
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .line 100
    const-string v0, "ro.build.version.emui"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 3

    .line 436
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 437
    const/4 v0, 0x0

    return v0

    .line 440
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 441
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 442
    const/4 v0, 0x0

    return v0

    .line 444
    :cond_1
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 445
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 446
    const/4 v0, 0x1

    return v0

    .line 448
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static f()Ljava/lang/String;
    .locals 2

    .line 109
    const-string v0, "ro.product.CustCVersion"

    const-string v1, "C000"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 7

    .line 458
    if-nez p0, :cond_0

    .line 459
    const/4 v0, 0x0

    return v0

    .line 462
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    .line 464
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "isNetworkSupported"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 465
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 466
    :catch_0
    move-exception v6

    .line 467
    const-string v0, "DeviceUtils"

    const-string v1, "isWifiOnly NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    goto :goto_1

    .line 468
    :catch_1
    move-exception v6

    .line 469
    const-string v0, "DeviceUtils"

    const-string v1, "isWifiOnly IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    goto :goto_1

    .line 470
    :catch_2
    move-exception v6

    .line 471
    const-string v0, "DeviceUtils"

    const-string v1, "isWifiOnly IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    goto :goto_1

    .line 472
    :catch_3
    move-exception v6

    .line 473
    const-string v0, "DeviceUtils"

    const-string v1, "isWifiOnly InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public static g()Ljava/lang/String;
    .locals 2

    .line 118
    const-string v0, "ro.product.CustDVersion"

    const-string v1, "D000"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 507
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->c()Ljava/lang/String;

    move-result-object v2

    .line 508
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 509
    const-string v0, "DeviceUtils"

    const-string v1, "imei empty!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 511
    const-string v0, "DeviceUtils"

    const-string v1, "isWifiOnly!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->s()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 514
    :cond_0
    const-string v0, "DeviceUtils"

    const-string v1, "not WifiOnly!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    const-string v2, "000000000000000"

    .line 518
    :cond_1
    :goto_0
    const-string v0, "DeviceUtils"

    const-string v1, "imei is not empty!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    return-object v2
.end method

.method public static h()Ljava/lang/String;
    .locals 7

    .line 155
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->E()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 158
    :cond_0
    const-string v2, ""

    .line 159
    const-string v0, "ro.build.display.id"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 160
    const-string v0, "ro.build.operator.id"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 161
    const-string v0, "ro.build.cust.id"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 163
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->i()Ljava/lang/String;

    move-result-object v6

    .line 164
    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    const-string v0, "DeviceUtils"

    const-string v1, "getFirmwareVersion return systemFwVersion "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    return-object v6

    .line 167
    :cond_1
    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 168
    const-string v0, "DeviceUtils"

    const-string v1, "getFirmwareVersion return custFwVersion ro.build.cust.id"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    return-object v5

    .line 170
    :cond_2
    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 171
    const-string v0, "DeviceUtils"

    const-string v1, "getFirmwareVersion return operatorFwVersion ro.build.operator.id"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    return-object v4

    .line 174
    :cond_3
    const-string v0, "DeviceUtils"

    const-string v1, "getFirmwareVersion return displayFwVersion ro.build.display.id"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    return-object v3
.end method

.method public static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 652
    if-nez p0, :cond_0

    .line 653
    const-string v0, ""

    return-object v0

    .line 656
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static i(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 332
    const/4 v2, 0x0

    .line 333
    if-eqz p0, :cond_0

    .line 334
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 336
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 339
    goto :goto_0

    .line 337
    :catch_0
    move-exception v4

    .line 338
    const-string v0, "DeviceUtils"

    const-string v1, "getPackageInfo:NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    :cond_0
    :goto_0
    return-object v2
.end method

.method public static i()Ljava/lang/String;
    .locals 8

    .line 184
    const-string v3, ""

    .line 185
    move-object v4, v3

    .line 186
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->j()Z

    move-result v5

    .line 187
    const-string v0, "ro.build.multicust"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Z)Z

    move-result v6

    .line 188
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getSystemVersion isFeatureSupport "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ";isMultiCustSupport is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string v0, "ro.confg.hw_systemversion"

    invoke-static {v0, v3}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 191
    if-eqz v5, :cond_2

    if-eqz v6, :cond_2

    .line 192
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 193
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ro.confg.hw_systemversion = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v0, "_SYSTEM"

    invoke-virtual {v7, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "_system"

    invoke-virtual {v7, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    :cond_0
    const-string v0, "_SYSTEM"

    const-string v1, ""

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "_system"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 197
    :cond_1
    move-object v4, v7

    .line 199
    :goto_0
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ro.confg.hw_systemversion final = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    :cond_2
    return-object v4
.end method

.method public static j()Z
    .locals 3

    .line 211
    const-string v0, "ro.build.update_version"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 212
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    const/4 v0, 0x1

    return v0

    .line 215
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static k()Ljava/lang/String;
    .locals 1

    .line 220
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    return-object v0
.end method

.method public static l()Ljava/lang/String;
    .locals 1

    .line 224
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public static m()Z
    .locals 2

    .line 351
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 354
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static n()Z
    .locals 2

    .line 365
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 368
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static o()Z
    .locals 3

    .line 379
    const/4 v1, 0x0

    .line 381
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->p()Ljava/lang/String;

    move-result-object v2

    .line 382
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 383
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 386
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "emotionui_1"

    .line 387
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "emotionui 1"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 388
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 389
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "emotionui_2"

    .line 390
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "emotionui 2"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 391
    :cond_3
    const/4 v1, 0x0

    goto :goto_0

    .line 392
    :cond_4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "emotionui_3"

    .line 393
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "emotionui 3"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 394
    :cond_5
    const/4 v1, 0x1

    goto :goto_0

    .line 397
    :cond_6
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->q()Z

    move-result v1

    .line 400
    :goto_0
    return v1
.end method

.method public static p()Ljava/lang/String;
    .locals 1

    .line 410
    const-string v0, "ro.build.version.emui"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static q()Z
    .locals 4

    .line 419
    const-string v0, "com.huawei.android.app.ActionBarEx"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;)Z

    move-result v3

    .line 420
    const-string v0, "DeviceUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isSupportActionBarEx: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    return v3
.end method

.method public static r()Z
    .locals 3

    .line 430
    const-string v0, "wifi-only"

    const-string v1, "ro.carrier"

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static s()Ljava/lang/String;
    .locals 7

    .line 482
    const-string v5, ""

    .line 484
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 486
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ro.serialno"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    move-object v5, v0

    .line 497
    goto :goto_0

    .line 487
    :catch_0
    move-exception v6

    .line 488
    const-string v0, "DeviceUtils"

    const-string v1, "getSN NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    goto :goto_0

    .line 489
    :catch_1
    move-exception v6

    .line 490
    const-string v0, "DeviceUtils"

    const-string v1, "getSN IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    goto :goto_0

    .line 491
    :catch_2
    move-exception v6

    .line 492
    const-string v0, "DeviceUtils"

    const-string v1, "getSN ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    goto :goto_0

    .line 493
    :catch_3
    move-exception v6

    .line 494
    const-string v0, "DeviceUtils"

    const-string v1, "getSN IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    goto :goto_0

    .line 495
    :catch_4
    move-exception v6

    .line 496
    const-string v0, "DeviceUtils"

    const-string v1, "getSN InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 499
    const-string v5, ""

    .line 500
    :cond_0
    return-object v5
.end method

.method public static t()Z
    .locals 2

    .line 527
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 528
    const/4 v0, 0x1

    return v0

    .line 530
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static u()Z
    .locals 1

    .line 534
    const-string v0, "huawei.android.widget.CounterTextLayout"

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static v()Ljava/lang/String;
    .locals 1

    .line 544
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public static w()Ljava/lang/String;
    .locals 1

    .line 554
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public static x()Ljava/lang/String;
    .locals 2

    .line 610
    const/4 v1, 0x0

    .line 611
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 613
    if-eqz v1, :cond_0

    .line 614
    return-object v1

    .line 616
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static y()Ljava/lang/String;
    .locals 4

    .line 620
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->z()Ljava/lang/String;

    move-result-object v2

    .line 621
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->x()Ljava/lang/String;

    move-result-object v3

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static z()Ljava/lang/String;
    .locals 2

    .line 632
    const/4 v1, 0x0

    .line 633
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 635
    if-eqz v1, :cond_0

    .line 636
    return-object v1

    .line 639
    :cond_0
    const-string v0, ""

    return-object v0
.end method
