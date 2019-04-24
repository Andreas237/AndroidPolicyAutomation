.class public final Lcom/myfitnesspal/android/sdk/Util;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static ENABLE_LOG:Z = false

.field private static final MFP_APP_SIGNATURE:Ljava/lang/String; = "3082021930820182a00302010202044bd5ddbd300d06092a864886f70d01010505003051310b3009060355040613025553311330110603550408130a43616c69666f726e6961311230100603550407130953616e20446965676f31193017060355040313104d794669746e65737350616c204c4c43301e170d3130303432363138333835335a170d3335303432303138333835335a3051310b3009060355040613025553311330110603550408130a43616c69666f726e6961311230100603550407130953616e20446965676f31193017060355040313104d794669746e65737350616c204c4c4330819f300d06092a864886f70d010101050003818d00308189028181009c68d057f7f4d1544cc5a4c9a32a047c2cec9ed773a17830e91c462eb9dad832912dcdfce00cdf62c3276456d30053edaddeb7c326e75749a7569eb5031ebb60688959fcf27cac67364ee852c7a8ca99505e9c281bac69961d726ce0ba46dce798c6b43760a78560ab4c976f0bf38c6d7f43651929eba8ccef8f9961aa0d82870203010001300d06092a864886f70d01010505000381810086049aff894cb055b6d31357ab677491fc8650286dadc7588671a7be19a224b6bf9c1c3a1cb13c196e85bf0998e53e6f8af3b6312f87e1d062700d019facfd0b4efc87845b9971adf439bb1095accb4c015460db12e260f282120e5e7dd81075ebe0e80aeb468eb7477ce6891841cbcb2f6712dfa3ade3631a601e62d1b11ca6"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/4 v0, 0x1

    sput-boolean v0, Lcom/myfitnesspal/android/sdk/Util;->ENABLE_LOG:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isUriAvailable(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 96
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 97
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 31
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 33
    invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 34
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 35
    return-void
.end method

.method public static validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;Z)Z
    .locals 3

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    .line 49
    if-nez v2, :cond_0

    .line 51
    const-string v0, "Could not get resolve info"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 52
    const/4 v0, 0x0

    return v0

    .line 55
    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/myfitnesspal/android/sdk/Util;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .line 75
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 81
    goto :goto_0

    .line 78
    :catch_0
    move-exception v3

    .line 80
    const/4 v0, 0x0

    return v0

    .line 83
    :goto_0
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 85
    invoke-virtual {v6}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3082021930820182a00302010202044bd5ddbd300d06092a864886f70d01010505003051310b3009060355040613025553311330110603550408130a43616c69666f726e6961311230100603550407130953616e20446965676f31193017060355040313104d794669746e65737350616c204c4c43301e170d3130303432363138333835335a170d3335303432303138333835335a3051310b3009060355040613025553311330110603550408130a43616c69666f726e6961311230100603550407130953616e20446965676f31193017060355040313104d794669746e65737350616c204c4c4330819f300d06092a864886f70d010101050003818d00308189028181009c68d057f7f4d1544cc5a4c9a32a047c2cec9ed773a17830e91c462eb9dad832912dcdfce00cdf62c3276456d30053edaddeb7c326e75749a7569eb5031ebb60688959fcf27cac67364ee852c7a8ca99505e9c281bac69961d726ce0ba46dce798c6b43760a78560ab4c976f0bf38c6d7f43651929eba8ccef8f9961aa0d82870203010001300d06092a864886f70d01010505000381810086049aff894cb055b6d31357ab677491fc8650286dadc7588671a7be19a224b6bf9c1c3a1cb13c196e85bf0998e53e6f8af3b6312f87e1d062700d019facfd0b4efc87845b9971adf439bb1095accb4c015460db12e260f282120e5e7dd81075ebe0e80aeb468eb7477ce6891841cbcb2f6712dfa3ade3631a601e62d1b11ca6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const/4 v0, 0x1

    return v0

    .line 83
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 91
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
